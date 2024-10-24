//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Antibiotic amoxocilin=new Antibiotic("amoxicilin","arsons","12/12/32","Broad");
        Analgesic paracetamol = new Analgesic("paracetamol","sam","12/12/32","General");
        PharmaControl pc1=new PharmaControl();
        pc1.addToInventory(amoxocilin);
        pc1.addToInventory(paracetamol);
        pc1.generateReport();
        pc1.issueMedicine("amoxicilin");
        //pc1.removeFromInventory("amoxicilin");
        pc1.generateReport();
        pc1.reStockMedicine(amoxocilin);
        pc1.generateReport();
    }
}