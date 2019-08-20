package array;

public class MaximumSubarray
{
    public int maxSubArrayN3(int[] a)
    {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i; j < a.length; j++)
            {
                int sum = 0;
                for (int k = i; k <= j; k++)
                {
                    sum += a[k];
                }
                max = Math.max(sum, max);
            }
        }
        return max;
    }


    public int maxSubArrayN2(int[] a)
    {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
        {
            int sum = 0;
            for (int j = i; j < a.length; j++)
            {
                sum += a[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public int maxSubArrayN(int[] a)
    {
        int max = a[0];
        int maxEndingHere = a[0];
        for (int i = 1; i < a.length; i++)
        {
            maxEndingHere = Math.max(a[i], a[i] + maxEndingHere);
            max = Math.max(maxEndingHere, max);
        }
        return max;
    }
}
