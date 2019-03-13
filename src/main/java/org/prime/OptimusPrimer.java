package org.prime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
should throw exception when input is negative
Should return empty list when input is 1
Should return 2 when input is 2
Should return list of [2,2] when input is 4
Should return list of [2,3] when input is 6
should return list of [3,3] when input is 9
should return list of [2,2,3] when input is 12
should return list of [3,5] when input is 15
*/

class OptimusPrimer {

    private List<BigInteger> divisors = Arrays.asList(
            BigInteger.valueOf(2),
            BigInteger.valueOf(3),
            BigInteger.valueOf(5),
            BigInteger.valueOf(7)
    );

    List<BigInteger> factorizeLooping(BigInteger num) {
        List<BigInteger> list = new ArrayList<>();
        if (num.compareTo(BigInteger.ZERO) < 0) {
            System.out.println("Negative Number");
            throw new IllegalArgumentException();
        } else if (num.compareTo(BigInteger.valueOf(2)) < 0){
            System.out.println("Input was 1");
            return list;
        }
        int ctr = 0;
        while (ctr < divisors.size()) {
            BigInteger prime = divisors.get(ctr);
            if (divisors.contains(num) || num.compareTo(prime.pow(2)) < 0) {
                //Check kung kaya pa mag next round
                list.add(num);
                System.out.println(list.toString());
                return list;
            } else if (num.mod(prime).equals(BigInteger.ZERO)) {
                //Check if kaya pa ulitin si prime
                list.add(prime);
                num = num.divide(prime);
            } else {
                //Next prime na
                ctr++;
            }
        }
        return list;
    }
}
