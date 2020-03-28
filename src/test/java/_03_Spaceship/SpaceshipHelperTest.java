package _03_Spaceship;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SpaceshipHelperTest {
    @Test
    public void avgSpeed() {
        var list = new ArrayList<Spaceship>();
        list.add(new Spaceship(20));
        list.add(new Spaceship(10));
        list.add(new Spaceship(30));

        var result = SpaceshipHelper.avgSpeed(list);

        assertEquals(20, result, 0.00000001);
    }

    @Test
    public void avgSpeed2() {
        var list = new ArrayList<Spaceship>();

        assertThrows(NoSuchElementException.class, () -> {
            SpaceshipHelper.avgSpeed(list);
        });
    }

    @Test
    void minSpeed() {
        var list = new ArrayList<Spaceship>();
        list.add(new Spaceship(34));
        list.add(new Spaceship(1));
        list.add(new Spaceship(2));

        var result = SpaceshipHelper.minSpeed(list);

        assertEquals(1, result, 0.00000001);
    }
}