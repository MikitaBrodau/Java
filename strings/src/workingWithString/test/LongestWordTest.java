package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.LongestWord;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest extends DelSpace {

    @Test
    void longestOneWithoutRegex() {
        String expect = "longest";
        String result = LongestWord.longestOneWithoutRegex("now time to choose longest one word");
        assertEquals(expect,result);
    }
}