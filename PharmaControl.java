import jdk.dynalink.support.AbstractRelinkableCallSite;

public class PharmaControl {
    Pharmacuetical[] inventory = new Pharmacuetical[20];
    InventoryClerk[] inventoryClerk = new InventoryClerk[20];
    static int medicineCount = 0;

    public void addToInventory(Pharmacuetical medicine) {
        if (medicineCount >= inventory.length) {
            System.out.println("Medicine count exceeded");
        } else {
            inventory[medicineCount] = medicine;
            medicineCount++;
            System.out.println("medicine added successfully");
        }
    }

    public void removeFromInventory(String medicine) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].getMedName().equalsIgnoreCase(medicine)) {
                inventory[i] = inventory[i + 1];
            }
            inventory[i + 1] = null;
            medicineCount--;
            return;
        }
        System.out.println("medicine unavailable");
    }

    public void issueMedicine(String medicine) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].getMedName().equalsIgnoreCase(medicine)) {
                for (int j = i; j < medicineCount - 1; j++) {
                    inventory[i] = inventory[i + 1];
                }
                inventory[i] = null;
                medicineCount--;
                System.out.println(medicine + " issued");
            }
        }
    }

    public void reStockMedicine(Pharmacuetical medicine) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].isEquavalent(medicine)) {
                System.out.println("Medicine already exist");
            }
        }
        inventory[medicineCount] = medicine;
        medicineCount++;
        System.out.println("Medicine " + medicine.medName + " restocked");
    }

    public void generateReport() {
        if (inventory.length <= 0) {
            System.out.println("Inventory is empty!!!");
        }
        for (int i = 0; i < inventory.length; i++) {

            if (inventory[i] != null) {
                inventory[i].displaySpecs();
            }
        }
    }

}
