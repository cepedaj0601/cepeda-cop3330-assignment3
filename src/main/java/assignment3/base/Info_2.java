package assignment3.base;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

//contains functions used to display the corresponding information of the product
public class Info_2 {
    private String name ;
    //converts inout file to data type
    public void getInfo()  {

        //create data type


        //import file
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" +
                    "exercise44_input.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray products = (JSONArray) jsonObject.get("products");
            Iterator iterator = products.iterator();
            while (iterator.hasNext()) {
                this.name = (String) products.get(0);
                System.out.println(name);
                iterator.next() ;
            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }


        //return data type
        //return stuff;
    }

    //prints requested information of the product
    public static void printInfo(){

    }
}
