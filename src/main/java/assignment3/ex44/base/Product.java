package assignment3.ex44.base;

import java.util.Scanner;

//contains functions used to find the product
public class Product {

    private static final Scanner in = new Scanner(System.in);

    //function to take input
    public static String[] getProduct(String[] stuff){
        int exists = 0;
        String[] productName = new String[2];
        String temp = "";

        //prompt name of product
        //repeat until a prompted product is located
        while(exists == 0){
            System.out.println("What is the product name?");
            //store product name
            productName[0] = in.next();

            for (int i = 0; i < 3; i++) {
                if (stuff[i].contains(productName[0])){
                    exists = 1;
                    productName[1] = String.valueOf(i);
                    break;

                }
            }

            if (exists == 0) {
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }

        //return product name
        return productName;
    }

    //function to search for the prompted product
    public static String[] findProduct(String[] stuff, String[] productName){
        //take in product name
        String ProductName = productName[0];
        int productId = Integer.parseInt(productName[1]);

        //store info in array
        String[] productInfo = new String[3];

        productInfo[0] = ProductName;
        int j = 0;

        //find product info
        for (int i = 0; i < stuff[productId].length(); i++) {
            if(stuff[productId].charAt(i) == 'c' && stuff[productId].charAt(i+1) == 'e'){
                j = i + 5;
                while (stuff[productId].charAt(j) != ','){
                    productInfo[1] = productInfo[1] + stuff[productId].charAt(j);
                    j++;
                }
                break;
            }
        }

        j = 0;

        for (int i = 0; i < stuff[productId].length(); i++) {
             if(stuff[productId].charAt(i) == 't' && stuff[productId].charAt(i+1) == 'y'){
                 j = i + 5;
                 while (stuff[productId].charAt(j) != ' '){
                     productInfo[2] = productInfo[2] + stuff[productId].charAt(j);
                     j++;
                 }
             }
        }


        for (int i = 0; i < 3; i++) {
            System.out.println(productInfo[i]);
        }

        //return array
        return productInfo;
    }
}
