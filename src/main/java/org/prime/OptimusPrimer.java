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
            BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(5),
            BigInteger.valueOf(7), BigInteger.valueOf(11), BigInteger.valueOf(13),
            BigInteger.valueOf(17), BigInteger.valueOf(19), BigInteger.valueOf(23),
            BigInteger.valueOf(29), BigInteger.valueOf(31), BigInteger.valueOf(37),
            BigInteger.valueOf(41), BigInteger.valueOf(43), BigInteger.valueOf(47),
            BigInteger.valueOf(53), BigInteger.valueOf(59), BigInteger.valueOf(61),
            BigInteger.valueOf(67), BigInteger.valueOf(71), BigInteger.valueOf(73),
            BigInteger.valueOf(79), BigInteger.valueOf(83), BigInteger.valueOf(89), BigInteger.valueOf(97)
    );

    List<BigInteger> factorizeLooping(BigInteger inputNum) {
        List<BigInteger> list = new ArrayList<>();
        if (inputNum.compareTo(BigInteger.ZERO) < 0) {
            System.out.println("Negative Number");
            throw new IllegalArgumentException();
        } else if (inputNum.compareTo(BigInteger.valueOf(2)) < 0){
            System.out.println("[]");
            return list;
        }
        int index = 0;
        while (index < divisors.size()) {
            BigInteger primeDivisor = divisors.get(index);
            if (divisors.contains(inputNum)) {
                //Check kung kaya pa mag next round
                list.add(inputNum);
                System.out.println(list.toString());
                return list;
            } else if (inputNum.mod(primeDivisor).equals(BigInteger.ZERO)) {
                //Check if kaya pa ulitin si prime
                list.add(primeDivisor);
                inputNum = inputNum.divide(primeDivisor);
            } else {
                //Next prime na
                index++;
            }
        }
        return list;
    }
}
