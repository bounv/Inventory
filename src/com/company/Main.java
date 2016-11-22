package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Thing> items = new ArrayList<>();
        Thing p = new Thing ("pen", 2);
        items.add(p);
        Thing f = new Thing ("football", 4);
        items.add(f);
        Thing c = new Thing ("cards", 6);
        items.add(c);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int i = 1;
            for(Thing item : items) {
                String checkbox = "[" + item.quantity + "]";

                System.out.println(i + ". " + checkbox + item.text);
                i ++ ;
            }
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update an item's quantity");
            System.out.println();
            System.out.println("Enter Your Numeric Choice: ");

            String option = scanner.nextLine();

            if(option.equals("1")) {

                System.out.println("Enter name of new item:");
                String text = scanner.nextLine();

                Thing item = new Thing(text, 0);

                items.add(item);

            } else if(option.equals("2")) {
                
                System.out.println("Enter number you want to remove");
                int n = Integer.parseInt(scanner.nextLine());
                items.remove(n - 1);


            } else if(option.equals("3")) {
                System.out.println("Input item number you wish to update:");

                int n = Integer.parseInt(scanner.nextLine());
                Thing t = items.get(n - 1 );
                System.out.println("Now enter the quantity");
                int z = Integer.parseInt(scanner.nextLine());
                t.quantity = z;

            } else {
                System.out.println("Invalid Option");
            }

        }
    }
}
