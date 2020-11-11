package cycles;

import java.math.BigInteger;

public class Task3_4 {
    public BigInteger Task3_4(){
        long a = 200;
        BigInteger s = new BigInteger("1");
        for (int i = 1; i <= a; i++) {
            s = s.multiply(BigInteger.valueOf(i*i));
        }
        return s;
    }
}
