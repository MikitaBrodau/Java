package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.UniqueSymbolsWithoutSpace;

import static org.junit.jupiter.api.Assertions.*;

class UniqueSymbolsWithoutSpaceTest extends DelSpace {

    @Test
    void uniqueWithoutRegex() {
        String expect = "abcdef";
        String result = UniqueSymbolsWithoutSpace.uniqueWithoutRegex("abc cde def");
        assertEquals(expect,result);
    }
}