package assignment3.ex45.base;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void DefaultInTest() throws FileNotFoundException {
        String actual = Converter.convertInput();
        String expected = """
                One should never utilize the word "utilize" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                utilizes an IDE to write her Java programs".
                """;
        assertEquals(expected, actual);
    }

    @Test
    void DefaultOutTest() throws IOException {
        String actual = Converter.convertOutput("""
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".""");
        String expected = "\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" + /*fileName +*/ ".txt";
        assertEquals(expected, actual);
    }

    @Test
    void Out2() throws IOException {
        String actual = Converter.convertOutput("""
                One should never utilize the word "utilize" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                utilizes an IDE to write her Java programs".""");
        String expected = "\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" + /*fileName +*/ ".txt";
        assertEquals(expected, actual);
    }

    @Test
    void OutOneWord() throws IOException {
        String actual = Converter.convertOutput("difo");
        String expected = "\\Users\\stick\\Desktop\\COP 3330\\Assignments\\" + /*fileName +*/ ".txt";
        assertEquals(expected, actual);
    }
}