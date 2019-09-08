package design;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBinaryTree2
{
    // Encodes a tree to a single string.
    public String serialize(TreeNode root)
    {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.substring(0, sb.length() - 1);
    }

    private void serialize(TreeNode root, StringBuilder sb)
    {
        if (root == null)
        {
            sb.append("#").append(" ");
        }
        else
        {
            sb.append(root.val).append(" ");
            serialize(root.left, sb);
            serialize(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data)
    {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(" ")));

        return deserialize(queue);
    }

    private TreeNode deserialize(Queue<String> queue)
    {
        String val = queue.poll();
        if (val.equals("#"))
        {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deserialize(queue);
        root.right = deserialize(queue);
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
        node2.right = node4;
        SerializeDeserializeBinaryTree2 tree = new SerializeDeserializeBinaryTree2();
        String s = tree.serialize(node1);
        System.out.println(s);
        TreeNode root = tree.deserialize(s);
        tree.preVist(root);
        System.out.println();
        tree.levelVisit(root);

    }
}
