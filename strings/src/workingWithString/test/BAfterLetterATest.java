package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.BAfterLetterA;

import static org.junit.jupiter.api.Assertions.*;

class BAfterLetterATest extends DelSpace {

    @Test
    void addLetterBWithoutRegex() {
        String expect = "Well thabt is abmabzing";
        String result = BAfterLetterA.addLetterBWithoutRegex("Well that is amazing");
        assertEquals(expect, result);
    }
}