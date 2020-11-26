package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.MostOfSpaceBetweenWords;

import static org.junit.jupiter.api.Assertions.*;

class MostOfSpaceBetweenWordsTest extends DelSpace {

    @Test
    void spaceWithoutRegex() {
        int expect = 1;
        int result = MostOfSpaceBetweenWords.spaceWithoutRegex(" ");
        assertEquals(expect, result);
    }
}