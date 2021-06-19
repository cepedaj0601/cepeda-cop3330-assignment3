package assignment3.ex46.base;

import java.util.Arrays;
import java.util.stream.IntStream;

//class containing functions used to make the output histogram
public class Histogram {

    //function to count the amount of times a word appears in the input
    public static int[] wordCounter(String inputTxt){
        //take in string of words

        //store the numbers in an array
        int[] frequencyCounter = new int[3];

        StringBuilder currentWord = new StringBuilder();

        //in a loop, count the appearance of each word
        for (int i = 0; i < inputTxt.length(); i++) {
            if (inputTxt.charAt(i) == ' ' || inputTxt.charAt(i) == '\0' || inputTxt.charAt(i) == '\n') {

                switch (currentWord.toString()) {
                    case "badger" -> frequencyCounter[0] = frequencyCounter[0] + 1;
                    case "mushroom" -> frequencyCounter[1] = frequencyCounter[1] + 1;
                    case "snake" -> frequencyCounter[2] = frequencyCounter[2] + 1;
                }
                currentWord = new StringBuilder();
            }
            else{
                currentWord.append(inputTxt.charAt(i));
            }
        }

        //return the array
        return frequencyCounter;
    }

    //function to sort the occurrences in descending order
    public static int[] frequencySorter(int[] frequencyCounter){
        //take in arraylist of word frequencies

        //create new array
        IntStream order;

        //sort numbers in descending order
        //copy new list to new array
        order = Arrays.stream(frequencyCounter).sorted();
        int[] orderArray = order.toArray();

        //return new arraylist
        return orderArray;
    }

    //function to print out the resulting histogram
    public static String frequencyPrinter(int[] orderArray, int[] frequencyCounter){
        StringBuilder output = new StringBuilder();

        //take in arraylist containing ordered word frequencies

        String[] wordList = new String[3];
        wordList[0] = "badger:   ";
        wordList[1] = "mushroom: ";
        wordList[2] = "snake:    ";

        //in a loop, print out an asterisk for the matching word frequencies
        for (int i = (orderArray.length - 1); i >= 0; i--) {
            for (int j = 0; j < frequencyCounter.length; j++) {

                if (orderArray[i] == frequencyCounter[j]) {
                    System.out.print(wordList[j]);
                    output.append(wordList[j]);

                    for (int k = 0; k < frequencyCounter[j]; k++) {
                        System.out.print("*");
                        output.append("*");
                    }
                }
            }
            System.out.print("\n");
            output.append("\n");
        }

        //return results in a string for testing
        return output.toString();
    }
}
