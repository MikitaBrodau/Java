package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.LetterAFrequency;

import static org.junit.jupiter.api.Assertions.*;

class LetterAFrequencyTest extends DelSpace {

    @Test
    void frequencyWithoutRegex() {
        int expect = 2;
        int result = LetterAFrequency.frequencyWithoutRegex("okay, thats fine.");
        assertEquals(expect,result);
    }
}