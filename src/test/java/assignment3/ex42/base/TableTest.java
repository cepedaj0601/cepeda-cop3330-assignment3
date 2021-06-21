package assignment3.ex42.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void tableSpacer() {
        ArrayList<String> input = new ArrayList<>();
        input.add("Ling,Mai,55900");
        input.add("Johnson,Jim,56500");
        input.add("Jones,Aaron,46000");
        input.add("Jones,Chris,34500");
        input.add("Swift,Geoffrey,14200");
        input.add("Xiong,Fong,65000");
        input.add("Zarnecki,Sabrina,51500");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(3);
        numbers.add(7);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(3);

        ArrayList<Integer> actual = Table.tableSpacer(input);
        ArrayList<Integer> expected = numbers;
    }
    @Test
    void tableSpacerShortWords() {
        ArrayList<String> input = new ArrayList<>();
        input.add("Lin,Mai,55900");
        input.add("Joh,Jim,56500");
        input.add("Jon,Aar,46000");
        input.add("Jon,Chr,34500");
        input.add("Swi,Geo,14200");
        input.add("Xio,Fon,65000");
        input.add("Zar,Sab,51500");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);

        ArrayList<Integer> actual = Table.tableSpacer(input);
        ArrayList<Integer> expected = numbers;
        assertEquals(expected, actual);
    }
    @Test
    void tableSpacerLongWords() {
        ArrayList<String> input = new ArrayList<>();
        input.add("Lingllll,Mailllll,55900");
        input.add("Johnsonl,Jimlllll,56500");
        input.add("Joneslll,Aaronlll,46000");
        input.add("Joneslll,Chrislll,34500");
        input.add("Swiftlll,Geoffrey,14200");
        input.add("Xionglll,Fongllll,65000");
        input.add("Zarnecki,Sabrinal,51500");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);

        ArrayList<Integer> actual = Table.tableSpacer(input);
        ArrayList<Integer> expected = numbers;
        assertEquals(expected, actual);
    }
/*
    @Test
    void tableMaker() {
        String inputData = "Ling,Mai,55900\n" +
                "Johnson,Jim,56500\n" +
                "Jones,Aaron,46000\n" +
                "Jones,Chris,34500\n" +
                "Swift,Geoffrey,14200\n" +
                "Xiong,Fong,65000\n" +
                "Zarnecki,Sabrina,51500";

        String spaces = "6";

        String actual = Table.tableMaker(inputData, spaces);
        String expected = "[\n" +
                ", 0, 0, 5, 1, 5,  ,  ,  , a, n, i, r, b, a, S,  ,  , i, k, c, e, n, r, a, Z, \n" +
                ", 0, 0, 0, 5, 6,  ,  ,  ,  ,  ,  , g, n, o, F,  ,  ,  ,  ,  , g, n, o, i, X, \n" +
                ", 0, 0, 2, 4, 1,  ,  , y, e, r, f, f, o, e, G,  ,  ,  ,  ,  , t, f, i, w, S, \n" +
                ", 0, 0, 5, 4, 3,  ,  ,  ,  ,  , s, i, r, h, C,  ,  ,  ,  ,  , s, e, n, o, J, \n" +
                ", 0, 0, 0, 6, 4,  ,  ,  ,  ,  , n, o, r, a, A,  ,  ,  ,  ,  , s, e, n, o, J, \n" +
                ", 0, 0, 5, 6, 5,  ,  ,  ,  ,  ,  ,  , m, i, J,  ,  ,  , n, o, s, n, h, o, J, \n" +
                ", 0, 0, 9, 5, 5,  ,  ,  ,  ,  ,  ,  , i, a, M,  ,  ,  ,  ,  ,  , g, n, i, L, Last      First     Salary\n" +
                "--------------------------]" ;
        assertEquals(expected, actual);


    }


 */

}