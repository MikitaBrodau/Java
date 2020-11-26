package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.LongestWord;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest extends DelSpace {

    @Test
    void longestOneWithoutRegex() {
        String expect = "defg";
        String result = LongestWord.longestOneWithoutRegex("abc defg");
        assertEquals(expect,result);
    }
}