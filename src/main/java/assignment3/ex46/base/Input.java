package assignment3.ex46.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//class containing the functions used to take in the file input
public class Input {

    //function to take in and convert the input file into a usable data type
    public static String convertInput() throws FileNotFoundException {
        //read in input file
        File file = new File("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\exercise46_input.txt");
        Scanner scanner = new Scanner(file);

        //store input in a string
        String inputTxt = "";

        while (scanner.hasNextLine()) {
            inputTxt = inputTxt.concat(scanner.nextLine() + "\n");
        }

        //return string
        return inputTxt;
    }
}
