package array;

public class TrappingRainWater
{
    public int trap(int[] a)
    {
        int res = 0;
        for (int i = 1; i < a.length - 1; i++)
        {
            int leftMax = 0;
            int rightMax = 0;

            for (int j = 0; j <= i; j++)
            {
                leftMax = Math.max(a[j], leftMax);
            }
            for (int j = i; j < a.length; j++)
            {
                rightMax = Math.max(a[j], rightMax);
            }

            res += Math.min(leftMax, rightMax) - a[i];
        }
        return res;

    }

    public int trapDP(int[] a)
    {
        if (a.length < 1)
        {
            return 0;
        }
        int res = 0;

        int[] leftMax = new int[a.length];
        int[] rightMax = new int[a.length];

        leftMax[0] = a[0];
        for (int i = 1; i < a.length; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1], a[i]);
        }

        rightMax[a.length-1] = a[a.length-1];
        for (int i = a.length - 2; i >= 0; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1], a[i]);
        }

        for (int i = 0; i < a.length; i++)
        {
            res += (Math.min(leftMax[i], rightMax[i]) - a[i]);
        }

        return res;
    }

    public int trapPartition(int[] a)
    {
        if (a.length < 1)
        {
            return 0;
        }
        int res = 0;

        int maxIndex = 0;
        int max = a[0];

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
                maxIndex = i;
            }
        }

        int leftMax = 0;
        for (int i = 0; i < maxIndex; i++)
        {
            leftMax = Math.max(leftMax, a[i]);
            res += (leftMax - a[i]);
        }

        int rightMax = 0;
        for (int i = a.length -1; i > maxIndex; i--)
        {
            rightMax = Math.max(rightMax, a[i]);
            res += (rightMax - a[i]);
        }

        return res;
    }

}
