package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.LettersCount;

import static org.junit.jupiter.api.Assertions.*;

class LettersCountTest extends DelSpace {

    @Test
    void counter() {
        int lowerExpect = 4;
        int lowerResult = LettersCount.lowerCaseWithoutRegex("ther");
        assertEquals(lowerExpect,lowerResult);
        int upperExpect = 7;
        int result = LettersCount.upperCaseWithoutRegex("ABCDEFG");
        assertEquals(upperExpect,result);
    }
}