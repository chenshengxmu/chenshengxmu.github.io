package array;

import java.util.ArrayList;
import java.util.List;

public class TwoSumBST
{
    public boolean findTarget(TreeNode root, int k)
    {
        List<Integer> list = new ArrayList<>();
        bstToList(root, list);
        int low = 0;
        int high = list.size() - 1;
        while (low < high)
        {
            if (list.get(low) + list.get(high) == k)
            {
                return true;
            }
            else if (list.get(low) + list.get(high) < k)
            {
                low++;
            }
            else
            {
                high--;
            }

        }

        return false;
    }

    private void bstToList(TreeNode root, List<Integer> list)
    {
        if (root == null)
        {
            return;
        }
        bstToList(root.left, list);
        list.add(root.val);
        bstToList(root.right, list);
    }


    private class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val)
        {
            this.val = val;
        }
    }
}
