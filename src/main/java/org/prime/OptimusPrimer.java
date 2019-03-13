package org.prime;

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

    private List<Integer> divisors = Arrays.asList(2, 3, 5);

    List<Integer> factorize(int num) {
        List<Integer> list = new ArrayList<>();

        if (num < 0) {
            throw new IllegalArgumentException();
        }

        int max = num;

        if (max >= divisors.get(divisors.size() - 1)) {
            list.add(max);
        }

        return list;
    }

    List<Integer> factorizeLooping(int num) {
        List<Integer> list = new ArrayList<>();
        if (num < 0) {
            System.out.println("Negative Number");
            throw new IllegalArgumentException();
        } else if (num < 2) {
            System.out.println("Input was 1");
            return list;
        }
        int ctr = 0;
        while (ctr < divisors.size()) {
            int prime = divisors.get(ctr);
            if (num < prime * prime) {
                //Check kung kaya pa mag next round
                list.add(num);
                System.out.println(list.toString());
                return list;
            } else if (num % prime == 0) {
                //Check if kaya pa ulitin si prime
                list.add(prime);
                num = num / prime;
            } else {
                //Next prime na
                ctr++;
            }
        }
        return list;
    }
}
