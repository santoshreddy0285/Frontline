import java.util.Arrays;

/**
 * The class Monotone
 */
public class Monotone {

    /**
     *
     * longest Monotone increasing sub arr
     *
     * @param {Array} array of Integers
     * @param n  the n
     * @return int[] sub array of Integers
     */
    public int[] monotoneLongestIncSubArr(int input[], int n) {
        int mIndex = 1;
        int len = 1;
        int maxIndex = 0;
        for (int position = 1; position < n; position++) {
            if (input[position] > input[position - 1])
                len++;
            else {
                if (mIndex < len) {
                    mIndex = len;
                    maxIndex = position - mIndex;
                }
                len = 1;
            }
        }
        if (mIndex < len) {
            mIndex = len;
            maxIndex = n - mIndex;
        }

        // return the elements of longest subarray
        try {
            return Arrays.copyOfRange(input, maxIndex, mIndex + maxIndex);
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }
}
