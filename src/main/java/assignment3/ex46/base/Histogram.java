package assignment3.ex46.base;

import java.util.ArrayList;

//class containing functions used to make the output histogram
public class Histogram {

    //function to count the amount of times a word appears in the input

    public static ArrayList<String> wordFinder(String inputTxt){
        //take in string of words

        //in a loop, identify each unique word in the string
        String currentWord = "";
        ArrayList<String> words = new ArrayList<>();
        int j = 0, l = 0;
        String temp = "";

        for (int i = 0; i < inputTxt.length(); i++) {
            //store the words in an arraylist
            if (inputTxt.charAt(i) == ' ') {

                if (!temp.contains(currentWord)) {
                    words.add(l, currentWord);
                    temp = temp + currentWord + " ";
                    currentWord = "";
                    l = l + 1;
                    j = 0;
                }

            }
            else{
                 currentWord = currentWord + inputTxt.charAt(i);
                 j = j + 1;
            }
        }

        System.out.println(words);
        //return the arraylist
        return words;
    }

    public static void wordCounter(){
        //take in string of words
        //in another loop, count the appearance of each word
        //store the numbers in an arraylist
        //return the arraylist
    }

    //function to sort the occurrences in descending order
    public static void frequencySorter(){
        //take in arraylist of word frequencies
        //create new arraylist
        //sort numbers in descending order
        //copy new list to new arraylist
        //return new arraylist
    }

    //function to print out the resulting histogram
    public static void frequencyPrinter(){
        //take in arraylist containing ordered word frequencies
        //in a loop, print out an asterisk for the matching word frequencies
        //return results in a string for testing
    }
}
