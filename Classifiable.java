public interface Classifiable {
    void addMedicine(Pharmacuetical p);
    void removeMedicine(String medName);
    Pharmacuetical searchMedicine(String medName);

}
