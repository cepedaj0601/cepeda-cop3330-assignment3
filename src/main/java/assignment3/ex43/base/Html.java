package assignment3.ex43.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//contains function used to create html file & output
public class Html {

    //creates html file
    public static void htmlMaker() throws FileNotFoundException {
        //take in html information
        //add name
        //add author
        //add javascript
        //add css

        StringBuilder html = new StringBuilder();
        FileReader file = new FileReader("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" +
                "cepeda-cop3330-assignment3\\src\\main\\java\\assignment3\\ex43");
        try{
            BufferedReader br = new BufferedReader(file);
            String val;
            while((val = br.readLine()) != null) {
                html.append(val);
            }

            br.close();
            String result = html.toString();
            System.out.println(result);
            }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        //return output for testing
    }
}
