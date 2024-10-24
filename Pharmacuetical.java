public abstract class Pharmacuetical {
    String medName;
    String manufacturer;
    String expiryDate;
    Stock stockStatus;

    public Pharmacuetical(String medName, String manufacturer, String expiryDate, Stock stockStatus) {
        this.medName = medName;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.stockStatus = stockStatus;
    }
    public boolean isEquavalent(Pharmacuetical that){
        return this.medName.equals(that.medName) && this.manufacturer.equals(that.manufacturer);
    }

    public void setStockStatus(Stock stockStatus) {
        this.stockStatus = stockStatus;
    }


    public abstract void displaySpecs();

    public String getMedName() {
        return medName;
    }
}
