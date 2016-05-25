package com.theironyard;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void createItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Enter your item.");
        String text = scanner.nextLine();
        Inventory item = new Inventory(text, 1);
        items.add(item);
    }

    public static void removeItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Enter the number of the item you wish to remove.");
        String removeStr = scanner.nextLine();
        int remove = Integer.valueOf(removeStr);
        Inventory removeItem = items.get(remove - 1);
        items.remove(removeItem);
    }

    public static void updateItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Enter the number of the item you wish to update.");
        String updateStr = scanner.nextLine();
        int update = Integer.valueOf(updateStr);
        Inventory updateItem = items.get(update - 1);

        System.out.println("Enter the new quantity.");
        String newQuant = scanner.nextLine();
        int quantity = Integer.valueOf(newQuant);


    }

    public static void listItems(ArrayList<Inventory> items) {
        int i = 1;

        for (Inventory invItem : items) {
            System.out.printf("%s. %s [%s]\n", i, invItem.text, invItem.quantity);
            i++;
        }

    }

    public static void main(String[] args) {
        ArrayList<Inventory> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options.");
            System.out.println("1. Create new item.");
            System.out.println("2. Remove item.");
            System.out.println("3. Update item's quantity.");
            System.out.println("4. List items.");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    createItem(scanner, items);
                    break;
                case "2":
                    removeItem(scanner, items);
                    break;
                case "3":
                    updateItem(scanner, items);
                    break;
                case "4":
                    listItems(items);
                    break;
                default :
                    System.out.println("Invalid Option.");

            }
        }




    }
}
