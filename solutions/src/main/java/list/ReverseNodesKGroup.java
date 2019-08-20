package list;


public class ReverseNodesKGroup
{
    public ListNode reverseKGroup(ListNode head, int k)
    {
        ListNode tmp = head;
        for (int i = 1; i < k && tmp != null; i++)
        {
            tmp = tmp.next;
        }

        if (tmp == null)
        {
            return head;
        }
        ListNode tmp2 = tmp.next;
        tmp.next = null;

        ListNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.val + "");
            temp = temp.next;
        }
        System.out.println();
        temp = tmp2;
        while (temp != null)
        {
            System.out.print(temp.val + "");
            temp = temp.next;
        }
        System.out.println();

        ListNode newHead = reverse(head);
        head.next = reverseKGroup(tmp2, k);

        return newHead;
    }

    private ListNode reverse(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private static class ListNode
    {
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val = val;
        }
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        ListNode[] nodes = new ListNode[5];

        for (int i = 0; i < nodes.length; i++)
        {
            nodes[i] = new ListNode(a[i]);
        }
        for (int i = 0; i < nodes.length-1; i++)
        {
            nodes[i].next = nodes[i + 1];
        }

        ReverseNodesKGroup reverseNodesKGroup = new ReverseNodesKGroup();
        reverseNodesKGroup.reverseKGroup(nodes[0], 2);
    }
}
