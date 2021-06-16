package assignment3.ex41.base;
/*
 *  UCF COP3330 Summer 2021 ex41 Solution
 *  Copyright 2021 Justin Cepeda
 */
/*
Exercise 41 - Name Sorter
Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in
your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list
alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output
Total of 7 names
-----------------
Ling, Mai
Johnson, Jim
Jones, Aaron
Jones, Chris
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina
Constraint
Don't hard-code the number of names.
Challenges
Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a
file.
Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Solution41 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // call function to convert input file to data type
        ArrayList<String> inputNames = new ArrayList<>();
        inputNames = Converters.ScanInputAndConvert();

        // call sorting function
        Sorter.alphabeticalSorter(inputNames);

        //call output function
        Converters.ConvertAndOutput(inputNames);
    }
}
