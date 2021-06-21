package assignment3.ex43.base;

import java.io.*;
import java.awt.Desktop;

//contains function used to create html file & output
public class Html {

    //creates html file
    public static void htmlMaker(String name, String author, String java, String css) throws IOException {
        //take in html information

        //add name
        //add author
        //add javascript
        //add css

        File htmlFile = new File("ex43output.htm");
        BufferedWriter bw = new BufferedWriter(new FileWriter(htmlFile));
        bw.write("<html><body><h1>Blah, Blah!</h1>");
        bw.write("<textarea cols=75 rows=10>");
        for (int ii=0; ii<20; ii++) {
            bw.write("Blah blah..");
        }
        bw.write("</textarea>");
        bw.write("</body></html>");
        bw.close();

        Desktop.getDesktop().browse(htmlFile.toURI());
        //return output for testing
    }
}
