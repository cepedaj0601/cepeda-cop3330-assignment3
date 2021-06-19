package assignment3.ex46.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistogramTest {

    @Test
    void PrintDefault() {
        int[] temp1 = new int[3];
        temp1[0] = 1;
        temp1[1] = 2;
        temp1[2] = 7;

        int[] temp2 = new int[3];
        temp2[0] = 7;
        temp2[1] = 2;
        temp2[2] = 1;

        String actual = Histogram.frequencyPrinter(temp1, temp2);
        String expected = """
                badger:   *******
                mushroom: **
                snake:    *
                """;
        assertEquals(expected, actual);
    }

    @Test
    void PrintMushroomGreatest() {
        int[] temp1 = new int[3];
        temp1[0] = 1;
        temp1[1] = 2;
        temp1[2] = 7;

        int[] temp2 = new int[3];
        temp2[0] = 2;
        temp2[1] = 7;
        temp2[2] = 1;

        String actual = Histogram.frequencyPrinter(temp1, temp2);
        String expected = """
                mushroom: *******
                badger:   **
                snake:    *
                """;
        assertEquals(expected, actual);
    }

    @Test
    void PrintSnakesGreatest() {
        int[] temp1 = new int[3];
        temp1[0] = 1;
        temp1[1] = 2;
        temp1[2] = 7;

        int[] temp2 = new int[3];
        temp2[0] = 1;
        temp2[1] = 2;
        temp2[2] = 7;

        String actual = Histogram.frequencyPrinter(temp1, temp2);
        String expected = """
                snake:    *******
                mushroom: **
                badger:   *
                """;
        assertEquals(expected, actual);
    }
}