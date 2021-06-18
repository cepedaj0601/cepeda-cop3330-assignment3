package assignment3.ex42.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//class containing function to convert input to data type
public class Converters {

    //function that takes in input text and converts it into an ArrayList and outputs the list
    public static ArrayList<String> readToArray () throws FileNotFoundException {

        //take in file
        File file = new File("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\exercise42_input.txt");
        Scanner scanner = new Scanner(file);


        ArrayList<String> inputData = new ArrayList<>();

        //convert to new array list
        while (scanner.hasNextLine()) {
            inputData.add(scanner.nextLine());
        }

        return inputData;
    }
}
