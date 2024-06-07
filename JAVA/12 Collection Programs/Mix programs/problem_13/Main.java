/*### Problem 13: Inventory Management System
**Objective:** Create an inventory management system for a store.

        **Requirements:**
        - Use `LinkedHashMap` to maintain the order of items added.
- Store item names as keys and item quantities as values.
        - Provide functionalities to add, update, delete, and retrieve items.
        - Display the list of items in the order they were added.*/
package problem_13;

import problem_13.data.InventoryManager;

public class Main {
    public static void main(String[] args) {
        InventoryManager  inventoryManager=new InventoryManager();
        inventoryManager.addItem("soap",10);
        inventoryManager.addItem("brush",100);
        inventoryManager.addItem("pen",67);
        inventoryManager.addItem("game",56);
        inventoryManager.addItem("utensils",13);
        inventoryManager.addItem("fridge",18);
        inventoryManager.addItem("tv",72);
        inventoryManager.addItem("table",150);
        inventoryManager.addItem("cloth",1050);
        inventoryManager.deleteItem("table");
        inventoryManager.display();

    }
}
