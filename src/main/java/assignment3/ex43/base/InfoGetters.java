package assignment3.ex43.base;

import java.util.Scanner;

//contains functions used to get user input about website creation
public class InfoGetters {

    private static final Scanner in = new Scanner(System.in);


    //function to get the name
    public static String getName(){
        //prompt input
        System.out.println("Site name:");

        //scan and store input
        //return input
        return in.next();
    }

    //function to get the author
    public static String getAuthor(){
        //prompt input
        System.out.println("Author:");

        //scan and store input
        //return input
        return in.next();
    }

    //function to know if JavaScript is made
    public static String getJava(){
        //prompt input
        System.out.println("Do you want a folder for JavaScript? (y or n)");

        //scan and store input
        //return input
        return in.next();
    }

    //function to know if Css is made
    public static String getCss(){
        //prompt input
        System.out.println("Do you want a folder for CSS? (y or n)");

        //scan and store input
        //return input
        return in.next();
    }
}
