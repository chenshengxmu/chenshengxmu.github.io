package design;

import java.util.HashMap;
import java.util.Map;

public class LRUCache4
{
    Map<Integer, Node> map = new HashMap<>();
    DoubleList list = new DoubleList();
    int capacity;

    public LRUCache4(int capacity)
    {
        this.capacity = capacity;
    }

    public int get(int key)
    {
        if (!map.containsKey(key))
        {
            return -1;
        }

        int value = map.get(key).value;
        put(key, value);
        return value;
    }

    public void put(int key, int value)
    {
        if (map.containsKey(key))
        {
            list.remove(map.get(key));
            Node node = new Node(key, value);
            list.addFirst(node);
            map.put(key, node);
        }
        else
        {
            Node node = new Node(key, value);
            if (map.size() == capacity)
            {
                Node lastNode = list.removeLast();
                map.remove(lastNode.key);

            }
            list.addFirst(node);
            map.put(key, node);
        }
    }

    private class Node
    {
        int key;
        int value;
        Node pre;
        Node next;

        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }

    private class DoubleList
    {
        Node head;
        Node tail;

        public void remove(Node node)
        {
            if (node == head)
            {
                head = head.next;
                return;
            }
            if (node == tail)
            {
                tail = tail.pre;
                return;
            }
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        public Node removeLast()
        {
            Node tmp = tail;
            remove(tail);
            return tmp;
        }

        public void addFirst(Node node)
        {
            if (head == null)
            {
                head = node;
                tail = node;
                return;
            }
            node.next = head;
            head.pre = node;
            head = node;
        }

    }
}
