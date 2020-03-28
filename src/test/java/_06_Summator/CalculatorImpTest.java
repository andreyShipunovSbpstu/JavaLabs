package _06_Summator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorImpTest {

    Calculator calculator = new CalculatorImp();

    @Test
    void sum1() {

        var result = calculator.summ(10,12);
        assertEquals(22, result);
    }

    @Test
    void sum2() {
        var result = calculator.summ(0,5);
        assertEquals(5, result);
    }

    @Test
    void sum3() {
        var result = calculator.summ(7,0);
        assertEquals(7, result);
    }

    @Test
    void sum4() {
        var result = calculator.summ(-7,10);
        assertEquals(3, result);
    }
}