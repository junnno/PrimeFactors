package org.prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
should throw exception when input is negative
Should return empty list when input is 1
Should return 2 when input is 2
Should return list of [2,2] when input is 4
Should return list of [2,3] when input is 6
should return list of [3,3] when input is 9
should return list of [2,2,3] when input is 12
should return list of [3,5] when input is 15
\
*
* */
public class OptimusPrimer {

    List<Integer> divisors = Arrays.asList(2);

    public List<Integer> factorize(int i) {
        List<Integer> list = new ArrayList<>();
        if(i<0){
            throw new IllegalArgumentException();
        }

        int max = i;

        if(max >= divisors.get(divisors.size()-1)){
            list.add(max);
        }

        return list;
    }
}
