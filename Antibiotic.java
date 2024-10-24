public class Antibiotic extends Pharmacuetical implements Classifiable{
    String spectrum;

    @Override
    public void addMedicine(Pharmacuetical p) {
        System.out.println(p.medName + "is added");
    }

    @Override
    public void removeMedicine(String medName) {
        System.out.println(medName + "is removed");
    }

    @Override
    public Pharmacuetical searchMedicine(String medName) {
        System.out.println(medName + "is searched");
        return null;
    }

    public Antibiotic(String medName, String manufacturer, String expiryDate, String spectrum) {
        super(medName, manufacturer, expiryDate, Stock.IN_STOCK);
        this.spectrum = spectrum;
    }
    public void displaySpecs(){
        System.out.println("________________________________");
        System.out.println("Medicine Name  :"+medName);
        System.out.println("Manufacturer   :"+manufacturer);
        System.out.println("Expiry Date    :"+expiryDate);
        System.out.println("Stock Status   :"+stockStatus);
        System.out.println("Spectrum       :"+spectrum);
        System.out.println("________________________________");
    }


}
