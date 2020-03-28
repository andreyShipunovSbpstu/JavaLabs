package _02_Min_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHelperTest {

    @Test
    public void minA() {
        var result = MinHelper.min(1,2,3);

        assertEquals(1,result);
    }

    @Test
    public void minB() {
        var result = MinHelper.min(5,2,3);

        assertEquals(2,result);
    }

    @Test
    public void minC() {
        var result = MinHelper.min(8,7,5);

        assertEquals(5,result);
    }
}