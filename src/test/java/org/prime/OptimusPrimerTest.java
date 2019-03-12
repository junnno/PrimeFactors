package org.prime;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OptimusPrimerTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_input_is_negative(){
        OptimusPrimer primer = new OptimusPrimer();
        primer.factorize(-1);
    }

    @Test
    public void should_return_empty_list_when_input_is_1() {
        OptimusPrimer primer = new OptimusPrimer();
        assertTrue(primer.factorize(1).isEmpty());
    }

    @Test
    public void should_return_2_when_input_is_2() {
        OptimusPrimer primer = new OptimusPrimer();
        List<Integer> list = Arrays.asList(2);
        assertEquals(primer.factorize(2), list);
    }
}
