package _05_Min_list;

import _03_Spaceship.Spaceship;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinListHelperTest {

    @Test
    void findMin1() {

        var list = Arrays.asList(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0});
        var result = MinListHelper.findMin(list, Double::compareTo, 1, 4);

        assertEquals(2.0, result, 0.00000001);
    }

    @Test
    void findMin2() {

        var list = Arrays.asList(new Double[]{6.0, 5.0, 4.0, 3.0, 2.0, 1.0});
        var result = MinListHelper.findMin(list, Double::compareTo, 1, 4);

        assertEquals(3.0, result, 0.00000001);
    }

    @Test
    void findMinSpaceShip() {
        var list = Arrays.asList(new Spaceship[]{new Spaceship(13), new Spaceship(17)});
        var result = MinListHelper.findMin(list, Comparator.comparingInt(Spaceship::getSpeed), 1, 2);

        assertEquals(17, result.getSpeed());
    }

    @Test
    void findMinException1() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    var list = Arrays.asList(new Double[]{6.0, 5.0, 4.0, 3.0, 2.0, 1.0});
                    MinListHelper.findMin(list, Double::compareTo, 8, 4);
                });
    }

    @Test
    void findMinException2() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    var list = Arrays.asList(new Double[]{6.0, 5.0, 4.0, 3.0, 2.0, 1.0});
                    MinListHelper.findMin(list, Double::compareTo, -1, 4);
                });
    }

    @Test
    void findMinException3() {
        assertThrows(NoSuchElementException.class,
                () -> {
                    var list = Arrays.asList(new Double[]{6.0, 5.0, 4.0, 3.0, 2.0, 1.0});
                    MinListHelper.findMin(list, Double::compareTo, 7, 80);
                });
    }
}