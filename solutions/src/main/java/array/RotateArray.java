package array;

public class RotateArray
{
    public void rotate(int[] nums, int k)
    {
        k %= nums.length;
        reverse(nums, 0, nums.length - k -1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int low, int high)
    {
        while (low < high)
        {
            int tmp = nums[low];
            nums[low] = nums[high];
            nums[high] = tmp;
            low++;
            high--;
        }
    }
}
