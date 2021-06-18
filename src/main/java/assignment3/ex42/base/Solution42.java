package assignment3.ex42.base;
/*
Exercise 42 - Parsing a Data File
Sometimes data comes in as a structured format that you have to break down and turn into records so you can process
them. CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself; name it
`exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500
Constraints
Write your own code to parse the data. Don't use a CSV parser.
Challenges
Make each column one space longer than the longest value in the column.
Format the salary as currency with dollar signs and commas.
Sort the results by salary from highest to lowest.
Rework your program to use a CSV parsing library and compare the results.
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution42 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        //take in input
        //convert txt to data type
        ArrayList<String> inputData = Converters.readToArray();

        //making the table
        //space out each name correctly
        ArrayList<Integer> spaces = Table.tableSpacer(inputData);

        //print out the table
        ArrayList<String> output = Table.tableMaker(inputData, spaces);
    }
}
