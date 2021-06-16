package assignment3.ex41.base;

import java.util.ArrayList;

// class will contain function that alphabetically sorts the names converted from the input converter function, and
// output the names to the output converter function
public class Sorter {

    //names sorter function
    public static void alphabeticalSorter (ArrayList<String> inputNames){
        //read in names
        ArrayList<String> Names = new ArrayList<>();
        for (int i = 0; i < inputNames.size(); i++) {
            Names.add(inputNames.get(i));
            System.out.println(Names.get(i));
        }
        //use sort function to sort the names

        //store sorted names on new list
        //take size of list for the number of names on the list
        //return new list
    }
}
