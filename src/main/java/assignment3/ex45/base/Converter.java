package assignment3.ex45.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//class contains two functions, onw to convert the input file, and the other to convert and create the output file
public class Converter {

    private static final Scanner in = new Scanner(System.in);


    //input file function
    public static String convertInput() throws FileNotFoundException {
        //take in file
        File file = new File("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\exercise45_input.txt");
        Scanner scanner = new Scanner(file);

        //create new string
        String inputPhrase = "";

        //store input in new string
        while (scanner.hasNextLine()) {
            inputPhrase = inputPhrase.concat(scanner.nextLine() + "\n");
        }

        return inputPhrase;
    }

    //output file function
    public static String convertOutput(String inputPhrase) throws IOException {
        //take in new string

        //prompt for output file name
        System.out.println("Enter a name to be used for the new file:");
        String fileName = in.next();

        //convert the string to new txt file
        FileWriter writer = new FileWriter("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" + fileName + ".txt");
        writer.write(inputPhrase);
        writer.close();

        return "\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" + ".txt";
    }
}
