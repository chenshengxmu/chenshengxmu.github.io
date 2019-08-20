package array;

public class MinimumRotatedSortedArray
{
    public int findMin(int[] a)
    {
        int min = a[0];
        int low = 0;
        int high = a.length - 1;

        while (low <= high)
        {
            int mid = (low + high) >>> 1;
            if (a[low] == a[mid])
            {
                min = Math.min(min, a[low]);
                low++;
            }
            else if (a[low] < a[mid])
            {
                min = Math.min(min, a[low]);
                low = mid + 1;
            }
            else
            {
                min = Math.min(min, a[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
}
