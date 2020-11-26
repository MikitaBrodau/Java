package workingWithString.test;

import org.junit.jupiter.api.Test;
import stringAsArray.DelSpace;
import workingWithString.AmountOfClause;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AmountOfClauseTest extends DelSpace {

    @Test
    void amountWithoutString() {
        int expect = 0;
        List<Integer> result = new ArrayList<>();
        result.add(AmountOfClause.amountWithoutString("  . "));
        result.add(AmountOfClause.amountWithoutString(" . . "));
        result.add(AmountOfClause.amountWithoutString(".   "));
        result.add(AmountOfClause.amountWithoutString("   ."));
        for (int i : result) {
            assertEquals(expect, i);
        }
    }
}