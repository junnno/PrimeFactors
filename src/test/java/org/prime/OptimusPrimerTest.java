package org.prime;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

public class OptimusPrimerTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_input_is_negative() {
        OptimusPrimer primer = new OptimusPrimer();
        primer.factorizeLooping(BigInteger.valueOf(-1));
    }

    @Test
    public void should_return_empty_list_when_input_is_1() {
        OptimusPrimer primer = new OptimusPrimer();
        assertTrue(primer.factorizeLooping(BigInteger.ONE).isEmpty());
    }

    @Test
    public void should_return_2_when_input_is_2() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Collections.singletonList(BigInteger.valueOf(2));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf(2)));
    }

    @Test
    public void should_return_2_2_when_input_is_4() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Arrays.asList(BigInteger.valueOf(2), BigInteger.valueOf(2));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf(4)));
    }

    @Test
    public void should_return_2_3_when_input_is_6() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Arrays.asList(BigInteger.valueOf(2), BigInteger.valueOf(3));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf(6)));
    }

    @Test
    public void should_return_3_3_when_input_is_9() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Arrays.asList(BigInteger.valueOf(3), BigInteger.valueOf(3));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf(9)));
    }

    @Test
    public void should_return_2_2_3_when_input_is_12() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Arrays.asList(BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(3));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf(12)));
    }

    @Test
    public void should_return_3_5_when_input_is_15() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Arrays.asList(BigInteger.valueOf(3), BigInteger.valueOf(5));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf(15)));
    }

    @Test
    public void should_return_2_3_7_when_input_is_21() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Arrays.asList(BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(7));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf(42)));
    }

    @Test
    public void should_return_2_5_7_when_input_is_70() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Arrays.asList(BigInteger.valueOf(2), BigInteger.valueOf(5), BigInteger.valueOf(7));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf(70)));
    }

    @Test
    public void should_return_32_2s_when_input_is_2_raised_to_32() {
        OptimusPrimer primer = new OptimusPrimer();
        List<BigInteger> list = Arrays.asList(
                BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2),
                BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2),
                BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2),
                BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2),
                BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2),
                BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2),
                BigInteger.valueOf(2), BigInteger.valueOf(2));
        assertEquals(list, primer.factorizeLooping(BigInteger.valueOf((long) Math.pow(2, 32))));
    }
}
