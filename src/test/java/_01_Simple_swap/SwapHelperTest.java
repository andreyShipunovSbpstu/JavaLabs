package _01_Simple_swap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapHelperTest {

    @Test
    public void swap1() {
        int[] anArray = new int[]{1, 2, 3, 4, 5};

        var result = SwapHelper.Swap(2, 4, anArray);

        assertEquals(true, result);
        assertArrayEquals(anArray, new int[]{1, 2, 5, 4, 3});
    }

    @Test
    public void swap2() {
        int[] anArray = new int[]{1, 2, 3, 4, 5};

        var result = SwapHelper.Swap(-1, 3, anArray);

        assertEquals(false, result);
    }

    @Test
    public void swap3() {
        int[] anArray = new int[]{1, 2, 3, 4, 5};

        var result = SwapHelper.Swap(1, 30, anArray);

        assertEquals(false, result);
    }
}