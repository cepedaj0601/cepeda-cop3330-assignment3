package assignment3.ex46.base;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void InputTest() throws FileNotFoundException {
        String actual = Input.convertInput();
        String expected = """
                badger badger badger
                badger mushroom
                mushroom snake badger badger
                badger
                """;
        assertEquals(expected, actual);
    }
}