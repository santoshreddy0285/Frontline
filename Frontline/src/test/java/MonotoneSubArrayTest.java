import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonotoneSubArrayTest {

    MontoneSubArray montoneSubArray = null;

    @Before
    public void beforetest() {
        montoneSubArray = new MontoneSubArray();
    }

    @Test
    public void test_monotoneIncArray() {
        int[] input = {1, 2, 3, 4, 5, 6, 9, 10, 2, 10};
        input = montoneSubArray.monotoneIncArray(input);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 9, 10}, input);
        assertTrue(input.length == 8);
    }

    @Test
    public void test_monotoneIncArray1() {
        int[] input = {5, 6, 3, 0, 7, 8, 9, 1, 2};
        input = montoneSubArray.monotoneIncArray(input);
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, input);
        assertTrue(input.length == 5);
    }

    @Test
    public void test_monotoneIncArray2() {
        int[] input = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        input = montoneSubArray.monotoneIncArray(input);
        assertFalse(input.length == 4);
    }

    @Test
    public void test_nullPointerException() {
        montoneSubArray = new MontoneSubArray();
        assertThrows(NullPointerException.class, () ->
                montoneSubArray.monotoneIncArray(null));

    }

    @Test
    public void test_IllegalArgumentException() {
        montoneSubArray = new MontoneSubArray();
        assertThrows(
                IllegalArgumentException.class,
                () -> montoneSubArray.monotoneIncArray(new int[Integer.parseInt("s")]));

    }
}
