import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonotoneTest {

    Monotone monotone = null;

    @Before
    public void beforetest() {
        monotone = new Monotone();
    }

    @Test
    public void test_monotoneIncArray() {
        int[] input = {1, 2, 3, 4, 5, 6, 9, 10, 2, 10};
        int n = input.length;
        input = monotone.monotoneLongestIncSubArr(input, n);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 9, 10}, input);
        assertTrue(input.length == 8);
    }

    @Test
    public void test_monotoneIncArray2() {
        int[] input = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        int n = input.length;
        input = monotone.monotoneLongestIncSubArr(input, n);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, input);
        assertTrue(input.length == 5);
    }

    @Test
    public void test_monotoneIncArray3() {
        int[] input = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        int n = input.length;
        input = monotone.monotoneLongestIncSubArr(input, n);
        assertFalse(input.length == 4);
    }

    @Test
    public void test_OneElementInArray() {
        int[] input = {1};
        int n = input.length;
        input = monotone.monotoneLongestIncSubArr(input, n);
        assertTrue(input.length == 1);
    }

    @Test
    public void test_NullPointerException() {
        monotone = new Monotone();
        assertThrows(NullPointerException.class, () ->
                monotone.monotoneLongestIncSubArr(null, 0));

    }

    @Test
    public void test_IllegalArgumentException() {
        monotone = new Monotone();
        assertThrows(
                IllegalArgumentException.class,
                () -> monotone.monotoneLongestIncSubArr(new int[Integer.parseInt("s")], 0));

    }
}

