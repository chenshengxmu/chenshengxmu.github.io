package design;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBinaryTree
{
    // Encodes a tree to a single string.
    public String serialize(TreeNode root)
    {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.isEmpty() == false)
        {
            TreeNode node = queue.poll();
            if (node == null)
            {
                sb.append("# ");
            }
            else
            {
                sb.append(node.val).append(" ");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data)
    {
        String[] ss = data.split(" ");

        if (ss[0].equals("#"))
        {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(ss[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (i < ss.length)
        {
            TreeNode node = queue.poll();
            if (ss[i].equals("#") == false)
            {
                node.left = new TreeNode(Integer.parseInt(ss[i]));
                queue.offer(node.left);
            }
            i++;
            if (ss[i].equals("#") == false)
            {
                node.right = new TreeNode(Integer.parseInt(ss[i]));
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }

    void preVist(TreeNode root)
    {
        if (root != null)
        {
            System.out.print(root.val + " ");
            preVist(root.left);
            preVist(root.right);
        }
    }

    void levelVisit(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null)
            {
                queue.offer(node.left);
            }
            if (node.right != null)
            {
                queue.offer(node.right);
            }

        }
        System.out.println();
    }


    private static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val)
        {
            this.val = val;
        }
    }

    public static void main(String[] args)
    {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        SerializeDeserializeBinaryTree tree = new SerializeDeserializeBinaryTree();
        String s = tree.serialize(node1);
        System.out.println(s);
        TreeNode root = tree.deserialize(s);
        tree.preVist(root);
        System.out.println();
        tree.levelVisit(root);

    }
}
