package _04_Swap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SwapGenericHelperTest {

    @Test
    public void swapGeneric1() {
        var list = new ArrayList<Double>(Arrays.asList(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}));

        var result = SwapGenericHelper.SwapGeneric(2, 4, list);

        assertEquals(result, true);
        assertEquals(Arrays.asList(new Double[]{1.0, 2.0, 5.0, 4.0, 3.0}), list);
    }

    @Test
    public void swapGeneric2() {
        var list = new ArrayList<Double>(Arrays.asList(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}));

        var result = SwapGenericHelper.SwapGeneric(-1, 4, list);

        assertEquals(false, result);
    }

    @Test
    public void swapGeneric3() {
        var list = new ArrayList<Double>(Arrays.asList(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}));

        var result = SwapGenericHelper.SwapGeneric(1, 30, list);

        assertEquals(false, result);
    }
}