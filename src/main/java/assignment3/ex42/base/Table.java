package assignment3.ex42.base;

import java.util.ArrayList;

//class containing functions used to make the output table
public class Table {

    //function to calculate the appropriate spacing for each name so the final table is evenly spaced
    public static ArrayList<Integer> tableSpacer (ArrayList<String> inputData){
        //take in array

        int k = 0;
        int totalSpaces = 10;
        ArrayList<Integer> spaces = new ArrayList<>();

        //scan for comma to indicate end of name and add the length to a counter
        for (String inputDatum : inputData) {
            int temp = 0;

            for (int j = 0; j < inputDatum.length(); j++) {
                temp = temp + 1;

                if (inputDatum.charAt(j) == ',') {
                    temp = temp - 1;

                    //subtract length from total allotted space for each name
                    //add resulting value to a new array with matching index as string
                    spaces.add(k, (totalSpaces - temp));
                    k = k + 1;

                    //reset temp for next word
                    temp = 0;
                }
            }
        }

        //return space array
        return spaces;
    }

    //function to create the final table; uses function above to space out elements
    public static ArrayList<String> tableMaker (ArrayList<String> inputData, ArrayList<Integer> spaces){
        //output testing String
        ArrayList<String> output = new ArrayList<>();

        //take in arraylist of names and arraylist of spaces

        //print chart base
        System.out.println("Last      First     Salary\n" +
                "--------------------------");
        output.add(0, "Last      First     Salary\n" + "--------------------------");

        int k = 0;

        //in a loop, print out all the names, using the space array to space them out
        for (String inputDatum : inputData) {
            for (int j = 0; j < inputDatum.length(); j++) {

                if (inputDatum.charAt(j) == ',') {
                    for (int l = 0; l < spaces.get(k); l++) {
                        System.out.print(" ");
                        output.add(0, " ");
                    }

                    k = k + 1;
                } else {
                    System.out.print(inputDatum.charAt(j));
                    output.add(0, String.valueOf(inputDatum.charAt(j)));
                }
            }

            System.out.print("\n");
            output.add(0, "\n");
        }

        return output;
    }
}
