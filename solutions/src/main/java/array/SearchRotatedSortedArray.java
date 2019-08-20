package array;

public class SearchRotatedSortedArray
{
    public int search(int[] a, int key)
    {
        int low = 0;
        int high = a.length - 1;
        while (low <= high)
        {
            int mid = (low + high) >>> 1;
            if (a[mid] == key)
            {
                return mid;
            }
            if (a[low] <= a[mid])
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

    public int searchIndexWithDuplicates(int[] a, int key)
    {
        int low = 0;
        int high = a.length - 1;
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


    public boolean searchWithDuplicates(int[] a, int key)
    {
        int low = 0;
        int high = a.length - 1;
        while (low <= high)
        {
            int mid = (low + high) >>> 1;
            if (a[mid] == key)
            {
                return true;
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
        return false;
    }


    public static void main(String[] args)
    {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int res = searchRotatedSortedArray.search(a, 0);
        System.out.println(res);

    }

}
