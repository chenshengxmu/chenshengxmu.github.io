package array;

public class BinarySearchVariants
{
    public static boolean contains(int[] a, int low, int high, int key)
    {
        while (low <= high)
        {
            int mid = (low + high) >>> 1;

            if (key < a[mid])
            {
                high = mid - 1;
            }
            else if (key > a[mid])
            {
                low = mid + 1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] a, int low, int high, int key)
    {
        while (low <= high)
        {
            int mid = (low + high) >>> 1;

            if (key < a[mid])
            {
                high = mid - 1;
            }
            else if (key > a[mid])
            {
                low = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }


    public static int first(int[] a, int low, int high, int key)
    {
        int res = -1;
        while (low <= high)
        {
            int mid = (low + high) >>> 1;
            if (key == a[mid])
            {
                res = mid;
                high = mid - 1;
            }
            else if (key < a[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return res;
    }

    public static int last(int[] a, int low, int high, int key)
    {
        int res = -1;
        while (low <= high)
        {
            int mid = (low + high) >>> 1;
            if (key == a[mid])
            {
                res = mid;
                low = mid + 1;
            }
            else if (key < a[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return res;
    }

    public static int greatestLesser(int[] a, int low, int high, int key)
    {
        int res = -1;
        while (low <= high)
        {
            int mid = (low + high) >>> 1;
            if (a[mid] == key)
            {
                high = mid - 1;
            }
            else if (a[mid] < key)
            {
                res = mid;
                low = mid + 1;

            }
            else
            {
                high = mid - 1;
            }
        }
        return res;
    }

    public static int leastGreater(int[] a, int low, int high, int key)
    {
        int res = -1;
        while (low <= high)
        {
            int mid = (low + high) >>> 1;
            if (a[mid] == key)
            {
                low = mid + 1;
            }
            else if (a[mid] < key)
            {

                low = mid + 1;

            }
            else
            {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    public static int searchSortedRotated(int[] a, int low, int high, int key)
    {
        while (low <= high)
        {
            int mid = (low + high) >>> 1;
            if (a[mid] == key)
            {
                return mid;
            }
            if (a[low] == a[mid])
            {
                low++;
            }
            else if (a[low] < a[mid])
            {
                if (a[low] <= key && key < a[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if (a[mid] < key && key <= a[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }

            }

        }
        return -1;
    }

    public static int searchMinSortedRotated(int[] a, int low, int high)
    {
        int min = a[low];
        while (low <= high)
        {
            int mid = (low + high) >>> 2;

            if (a[low] == a[mid])
            {
                min = Math.min(a[low], min);
                low++;
            }
            else if (a[low] < a[mid])
            {
                min = Math.min(a[low], min);
                low = mid + 1;
            }
            else
            {
                min = Math.min(a[mid], min);
                high = mid - 1;
            }
        }
        return min;
    }

    public static int searchMaxSortedRotated(int[] a, int low, int high)
    {
        int max = a[0];
        while (low <= high)
        {
            int mid = (low + high) >>> 2;

            if (a[low] == a[mid])
            {
                max = Math.max(a[low], max);
                low++;
            }
            else if (a[low] < a[mid])
            {
                low = mid + 1;
                max = Math.max(a[mid], max);
            }
            else
            {
                high = mid - 1;
                max = Math.max(a[low], max);
            }

        }
        return max;
    }


}
