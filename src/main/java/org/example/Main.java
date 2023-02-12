package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> shopBag = new ArrayList<>();

        boolean Exit = false;

        int Options;

        while (!Exit) {

            System.out.println("1. ADD A PRODUCT ");
            System.out.println("2. REMOVE PRODUCT");
            System.out.println("3. LIST OF YOUR SHOPING BAG ");
            System.out.println("4. SEARCH ITEM");
            System.out.println("5. REPLACE ITEM ");
            System.out.println("6. NEW SHOP BAG");
            System.out.println("7. EXIT");

            try {
                System.out.println(" PLEASE CHOOSE A OPTION");
                Options = sc.nextInt();

                switch (Options) {
                    case 1:
                        //   ADD ITEMS

                        System.out.println("ADD NAME OF A ITEM TO BUY :");
                        String sc2 = new Scanner(System.in).nextLine();
                        if (!shopBag.contains(sc2.toLowerCase()))
                            shopBag.add(String.valueOf(sc2.toLowerCase()));
                        else {
                            System.out.println("LIST CONTAINS THIS ITEM ");

                        }
                        break;

                    case 2:
                        //remove
                        System.out.println("REMOVE A ITEM BY NAME");
                        String sc3 = new Scanner(System.in).nextLine();
                        for (String s : shopBag) {
                            System.out.println(s);
                        }
                        shopBag.remove(sc3);
                        break;

                    case 3:
                        //print list
                        for (String bagItems: shopBag
                        ) {
                            System.out.println("List of Items: "+bagItems.toString());

                        }


                        break;
                    case 4:
                        //check if contains
                        System.out.println("ENTER THE NAME OF ITEMS :");
                        String sc4 = new Scanner(System.in).nextLine().toLowerCase();
                        if (shopBag.contains(sc4.toLowerCase())){
                            System.out.println("THE LIST CONTAINS THE ITEM. ");
                            System.out.println(" ");}
                        else{
                            System.out.println(" ITEM NOT FOUND!!!");

                        }

                        break;
                    case 5:
                        //replace item
                        System.out.println("ENTER THE NAME OF ITEM TO REPLACE:");
                        String sc5 = new Scanner(System.in).nextLine().toLowerCase();

                        for (int i = 0; i < shopBag.size(); i++) {
                            shopBag.set(shopBag.indexOf(sc5), sc.next());

                        }
                        break;
                    case 6:
                        //create new bag
                        shopBag.clear();
                        System.out.println("THE CURRENT LIST IS DELETED!!!");
                        System.out.println(" ");

                        break;
                    case 7:
                        Exit = true;
                        System.out.println("YOU HAVE EXIT DE PROGRAM");
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}