package assignment3.ex45.base;

//class contains function to replace word utilizes with use
public class Replacer {

    //word replacer function
    public static String wordReplacer(String inputPhrase){
        //take in phrase string

        //scan for word to be replaced
        //when found, replace with new word
        inputPhrase = inputPhrase.replaceAll( "utilize" , "use" );

        //return new string
        return inputPhrase;
    }
}
