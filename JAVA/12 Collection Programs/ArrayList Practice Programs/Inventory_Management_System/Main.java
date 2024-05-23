//Inventory Management System:
//  Problem Statement: Develop an inventory management system for a store. Each product in the inventory should have a productID, name, quantity, and price. Implement functionality to add new products, update the quantity of a product, remove products from inventory, and display all products sorted by price.
//  Tasks:
//  Add a new product to the inventory.
//  Update the quantity of an existing product.
//  Remove a product from the inventory by productID.
//  Display all products sorted by their price in ascending order.
package Inventory_Management_System;

import Inventory_Management_System.data.Store;

import java.util.*;

public class Main implements Comparator<Store> {

    public static void main(String[] args) {
        int count=0;
        int choice=0;
        Store  store;
        ArrayList<Store> arrayList=new ArrayList<Store>();
        Scanner scanner=new Scanner(System.in);
        Iterator iterator;
        System.out.println("***************** Welcome to Inventory management system  ******************");
//creating menu driven program for Inventory info.
        while (choice!=5)
        {
            System.out.println("Press 1 for adding inventory. Press 2 for updating quantity. Press 3 for removing product. Press 4 for display all inventory .. Press 5 to exit.");
            choice= scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter product name");
                    String name=scanner.next();
                    System.out.println("Enter product id");
                    int id=scanner.nextInt();
                    System.out.println("Enter quantity of product");
                    int quantity= scanner.nextInt();
                    System.out.println("enter price of the product");
                    int price= scanner.nextInt();
                    store=new Store(id,name,quantity,price);
                    arrayList.add(store); // adding product info in the ArrayList .
                    System.out.println("product info added");
                    break;
                case 2:
                    count=0;
                    if(arrayList.size()==0)
                    {
                        System.out.println("Store data is empty");
                    }
                    else {
                        System.out.println("enter id of product to update");
                        int updateId = scanner.nextInt();
                        //performing iteration through Iterator.
                        iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            //typecasting to Store type
                            Store storeUpdate = (Store) iterator.next();
                            if (updateId == storeUpdate.getProductID()) {

                                System.out.println("Enter new quantity");
                                storeUpdate.setQuantity(scanner.nextInt());
                                System.out.println("product quantity updated successfully !");
                                count++;
                                break;
                            }

                        }
                        if (count == 0)
                            System.out.println("No product found with the given Id .");
                    }

                    break;
                case 3:
                    if(arrayList.size()==0)
                    {
                        System.out.println("store data is empty");
                    }
                    else {
                        count = 0;
                        System.out.println("enter id of product to remove");
                        int removeId = scanner.nextInt();
                        //performing iteration through Iterator.
                        iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            //typecasting to Student type
                            Store productRemove = (Store) iterator.next();
                            if (removeId == productRemove.getProductID()) {
                                arrayList.remove(productRemove);
                                System.out.println("product is removed");
                                count++;
                                break;
                            }

                        }
                        if (count == 0)
                            System.out.println("No product info is found with the given Id .");
                    }
                    break;

                case 4:
                    if(arrayList.size()==0)
                    {
                        System.out.println("Store data is empty");
                    }
                    else {
                        Collections.sort(arrayList, new Main());
                        iterator= arrayList.iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next().toString());
                        }
                    }
                    break;
                case 5:System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }

    }

    @Override
    public int compare(Store o1, Store o2) {
//       return o1.getPrice() - o2.getPrice();
        //OR

        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
