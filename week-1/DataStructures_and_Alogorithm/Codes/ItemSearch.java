package DataStructures_and_Alogorithm.Codes;
class InventoryItem {
    int itemId;
    String itemName;
    String itemCategory;

    InventoryItem(int identifier, String name, String category) {
        this.itemId = identifier;
        this.itemName = name;
        this.itemCategory = category;
    }
}

public class ItemSearch {
    public static InventoryItem linearSearch(InventoryItem[] inventory, int targetId) {
        for (InventoryItem currentItem : inventory) {
            if (currentItem.itemId == targetId) {
                return currentItem;
            }
        }
        return null;
    }

    public static InventoryItem binarySearch(InventoryItem[] inventory, int targetId) {
        int leftBoundary = 0;
        int rightBoundary = inventory.length - 1;

        while (leftBoundary <= rightBoundary) {
            int middleIndex = leftBoundary + (rightBoundary - leftBoundary) / 2;

            if (inventory[middleIndex].itemId == targetId) {
                return inventory[middleIndex];
            } else if (inventory[middleIndex].itemId < targetId) {
                leftBoundary = middleIndex + 1;
            } else {
                rightBoundary = middleIndex - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        InventoryItem[] inventory = {
            new InventoryItem(101, "Laptop", "Electronics"),
            new InventoryItem(102, "Mobile", "Electronics"),
            new InventoryItem(103, "Shoes", "Fashion"),
            new InventoryItem(104, "Watch", "Accessories"),
            new InventoryItem(105, "Bag", "Fashion")
        };

        int lookupId = 106;
        InventoryItem result = linearSearch(inventory, lookupId);

        if (result != null) {
            System.out.println("Product Found: " + result);
        } else {
            System.out.println("Product Not Found");
        }
    }
}