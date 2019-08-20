package array;

public class DuplicateZeros
{
    public void duplicateZeros(int[] a)
    {
        int i = 0;
        int j = 0;
        while (j < a.length)
        {
            if (a[i] == 0)
            {
                j++;
            }
            i++;
            j++;
        }
        j--;
        i--;

        while (i >= 0)
        {
            if (j < a.length)
            {
                a[j] = a[i];
            }
            if (a[i] == 0)
            {
                j--;
                a[j] = 0;
            }
            j--;
            i--;
        }

    }
}
