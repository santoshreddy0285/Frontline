public class Monotone {

    public int[] monotoneIncArray(int[] input)
    {
        int[] mIndex = new int[input.length];
        int[] pIndex = new int[input.length];
        int lastIndex = 0;

        for (int i = 0; i < input.length; i++)
        {
            int j = 0;
            for (int position = lastIndex ; position >= 1; position--)
            {
                if (input[mIndex[position]] < input[i])
                {
                    j = position;
                    break;
                }
            }
            pIndex[i] = mIndex[j];
            if (input[i] < input[mIndex[j + 1]] || j==lastIndex) {
                mIndex[j + 1] = i;
                lastIndex = Math.max(lastIndex,j + 1);
            }
        }

        int[] result = new int[lastIndex];
        int pos = mIndex[lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--)
        {
            result[i] = input[pos];
            pos = pIndex[pos];
        }
        return result;
    }
}
