package assignment3.ex43.base;
/*
 *  UCF COP3330 Summer 2021 ex43 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 43 - Website Generator
Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.

Challenges
Implement this in a scripting language on Windows, OSX, and Linux.
Implement this as a web application that provides the specified site as a zip file.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //take in name
        String name = InfoGetters.getName();

        //take in author
        String author = InfoGetters.getAuthor();

        //take in if JavaScript is to be made
        String java = InfoGetters.getJava();

        //take in if files will be stored in CSS
        String css = InfoGetters.getCss();

        //generate html file
        Html.htmlMaker(name, author, java, css);
    }
}
