package assignment3.ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @Test
    void alphabeticalSorter() {
        ArrayList<String>input = new ArrayList<>();
        input.add("Total of" + "names");
        input.add("-----------------");
        input.add("Johnson, Jim");
        input.add("Jones, Aaron");
        input.add("Jones, Chris");
        input.add("Ling, Mai");
        input.add("Swift, Geoffrey");
        input.add("Xiong, Fong");
        input.add("Zarnecki, Sabrina");
        ArrayList<String> actual = Sorter.alphabeticalSorter(input);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Total of" + "names");
        expected.add("-----------------");
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");
        assertEquals(expected, actual);
    }
}