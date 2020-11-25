package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.MostOfSpaceBetweenWords;

import static org.junit.jupiter.api.Assertions.*;

class MostOfSpaceBetweenWordsTest extends DelSpace {

    @Test
    void spaceWithoutRegex() {
        int expect = 4;
        int result = MostOfSpaceBetweenWords.spaceWithoutRegex(" 1  2   3    4");
        assertEquals(expect, result);
    }
}