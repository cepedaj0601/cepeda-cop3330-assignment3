package assignment3.ex41.base;

import java.util.ArrayList;
import java.util.Collections;

// class will contain function that alphabetically sorts the names converted from the input converter function, and
// output the names to the output converter function
public class Sorter {

    //names sorter function
    public static ArrayList<String> alphabeticalSorter (ArrayList<String> inputNames){
        //read in names
        ArrayList<String> Names = new ArrayList<>();

        //use sort function to sort the names
        Collections.sort(inputNames);

        //store sorted names on new list
        int j = 0;
        for (String inputName : inputNames) {
            if ((inputName.equals("-----------------")) || (inputName.equals("Total of 7 names"))) {
                continue;
            } else {
                Names.add(j, inputName);
                j++;
            }
        }

        //take size of list for the number of names on the list
        int numNames = Names.size();
        Names.add(0, "Total of " + numNames + " names");
        Names.add(1, "-----------------");

        for (int i = 0; i < Names.size(); i++) {
            Names.set(i, Names.get(i) + "\n");
        }

            Names.toString();

        //return new list
        return Names;
    }
}
