package org.prime;

import org.junit.Test;

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
    public void should_throw_exception_when_input_is_negative(){
        OptimusPrimer primer = new OptimusPrimer();
        primer.factorizeLooping(-1);
    }

    @Test
    public void should_return_empty_list_when_input_is_1() {
        OptimusPrimer primer = new OptimusPrimer();
        assertTrue(primer.factorizeLooping(1).isEmpty());
    }

    @Test
    public void should_return_2_when_input_is_2() {
        OptimusPrimer primer = new OptimusPrimer();
        List<Integer> list = Collections.singletonList(2);
        assertEquals(list, primer.factorizeLooping(2));
    }

    @Test
    public void should_return_2_2_when_input_is_4() {
        OptimusPrimer primer = new OptimusPrimer();
        List<Integer> list = Arrays.asList(2,2);
        assertEquals(list, primer.factorizeLooping(4));
    }

    @Test
    public void should_return_2_3_when_input_is_6() {
        OptimusPrimer primer = new OptimusPrimer();
        List<Integer> list = Arrays.asList(2,3);
        assertEquals(list, primer.factorizeLooping(6));
    }

    @Test
    public void should_return_3_3_when_input_is_9() {
        OptimusPrimer primer = new OptimusPrimer();
        List<Integer> list = Arrays.asList(3,3);
        assertEquals(list, primer.factorizeLooping(9));
    }

    @Test
    public void should_return_2_2_3_when_input_is_12() {
        OptimusPrimer primer = new OptimusPrimer();
        List<Integer> list = Arrays.asList(2,2,3);
        assertEquals(list, primer.factorizeLooping(12));
    }

    @Test
    public void should_return_2_2_3_when_input_is_15() {
        OptimusPrimer primer = new OptimusPrimer();
        List<Integer> list = Arrays.asList(3,5);
        assertEquals(list, primer.factorizeLooping(15));
    }
}
