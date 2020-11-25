package stringAsArray.test;

import org.junit.jupiter.api.Test;
import stringAsArray.AmountOfNumbers;
import stringAsArray.DelSpace;

import static org.junit.jupiter.api.Assertions.*;


class TestT {

    @Test
    void testDelWithoutRegex() {
        String expect = "o o";
        String result = DelSpace.delWithoutRegex("o      o");
        assertEquals(expect, result);
    }

    @Test
    void testAmountOfNumbers() {
        int expect = 4;
        int result = AmountOfNumbers.amountWithoutRegex("4Number 24255, is seem not random, but who care about it? 2, that's seems too5");
        assertEquals(expect,result);
    }
}