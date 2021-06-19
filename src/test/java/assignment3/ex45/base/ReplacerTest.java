package assignment3.ex45.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplacerTest {

    @Test
    void DefaultTest() {
        String actual = Replacer.wordReplacer("""
                One should never utilize the word "utilize" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                utilizes an IDE to write her Java programs".""");

        String expected = """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".""";

        assertEquals(expected, actual);
    }

    @Test
    void NoUtilizes() {
        String actual = Replacer.wordReplacer("""
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".""");

        String expected = """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".""";

        assertEquals(expected, actual);
    }

    @Test
    void AllUtilizes() {
        String actual = Replacer.wordReplacer("""
                utilize utilize utilize utilize utilizes. utilize utilize
                utilize utilize "utilize utilize utilize" utilize utilize
                utilize utilize utilize utilize utilize utilize utilize".""");

        String expected = """
                use use use use uses. use use
                use use "use use use" use use
                use use use use use use use".""";

        assertEquals(expected, actual);
    }
}