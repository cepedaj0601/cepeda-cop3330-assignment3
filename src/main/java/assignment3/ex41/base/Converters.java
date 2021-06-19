package assignment3.ex41.base;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


// Class will contain two functions, ont=e that converts the input text file to a usable data type,
// and the other that converts the data type back to the output file
public class Converters {

    // Input converter function
    public static ArrayList<String> ScanInputAndConvert () throws IOException {
        //use java function to input file
       File file = new File("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\exercise41_input.txt");
        Scanner scanner = new Scanner(file);

        //use java function to read names and copy over to a new string array
        ArrayList<String> inputNames = new ArrayList<>();
        while(scanner.hasNextLine()){
            inputNames.add(scanner.nextLine());
        }

        //return string array
        return inputNames;
    }

    //output converter function
    public static void ConvertAndOutput (ArrayList<String> outputNames) throws IOException {
        //take in sorted array
        int first = 1;
        String OutputNames = "";
        String temp = outputNames.toString();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '\n') {
                first = 1;
            }
            if (temp.charAt(i) == ',' || temp.charAt(i+1) == ' '){
                if (first == 1) {
                    OutputNames = OutputNames + temp.charAt(i);
                    first = 0;
               }
            }
        }
        System.out.println(OutputNames);

        //use java function to output the array as a text file
        FileWriter writer = new FileWriter("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" +
                "exercise41_output.txt");
        writer.write(OutputNames);
        writer.close();

    }

}
