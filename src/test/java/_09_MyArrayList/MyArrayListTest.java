package _09_MyArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void deleteAll1() {

        var list = new MyArrayList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        list.deleteAll(value -> value > 5);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, list.ToArray());
    }

    @Test
    void deleteAll2() {

        var list = new MyArrayList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        list.deleteAll(value -> value <= 5);

        assertArrayEquals(new int[]{6, 7, 8, 9, 10}, list.ToArray());
    }

    @Test
    void deleteAll3() {

        var list = new MyArrayList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        list.deleteAll(value -> true);

        assertArrayEquals(new int[]{}, list.ToArray());
    }

    @Test
    void deleteAll4() {

        var list = new MyArrayList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        list.deleteAll(value -> false);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, list.ToArray());
    }

    @Test
    void deleteAll5() {

        var list = new MyArrayList(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        list.deleteAll(value -> value % 2 == 0);

        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, list.ToArray());
    }
}