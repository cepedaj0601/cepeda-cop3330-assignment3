package assignment3.base;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

//contains functions used to display the corresponding information of the product
public class Info_2 {

    //converts inout file to data type
    public static String[] getInfo()  {

        //create data type
        String[] stuff = new String[3];

        //import file
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" +
                    "exercise44_input.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray products = (JSONArray) jsonObject.get("products");
            Iterator iterator = products.iterator();
            stuff[0] = (iterator.next().toString());
            stuff[1] = (iterator.next().toString());
            stuff[2] = (iterator.next().toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < stuff.length; i++) {
            System.out.println(stuff[i]);
        }

        //return data type
        return stuff;
    }

    //prints requested information of the product
    public static void printInfo(){

    }
}
