package array;

public class LargestRectangleHistogram
{
    public int largestRectangleArea(int[] a)
    {
        int max = 0;
        for (int i = 0; i < a.length; i++)
        {
            int min = a[i];
            for (int j = i; j >= 0; j--)
            {
                min = Math.min(a[j], min);
                int area = min * (i - j + 1);
                max = Math.max(area, max);
            }

        }
        return max;
    }

    public int largestRectangleAreaCut(int[] a)
    {
        int max = 0;
        for (int i = 0; i < a.length; i++)
        {
            if ((i+1) < a.length && a[i] <= a[i+1])
            {
                continue;
            }
            int min = a[i];
            for (int j = i; j >= 0; j--)
            {
                min = Math.min(a[j], min);
                int area = min * (i - j + 1);
                max = Math.max(area, max);
            }

        }
        return max;
    }
}
