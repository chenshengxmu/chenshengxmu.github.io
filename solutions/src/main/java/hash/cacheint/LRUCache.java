package hash.cacheint;

import java.util.HashMap;
import java.util.Map;

public class LRUCache
{
    Map<Integer, Node> map;
    Queue queue;

    public LRUCache(int capacity)
    {
        queue = new Queue(capacity);
        map = new HashMap<>();
    }

    public int get(int key)
    {
        if (map.containsKey(key))
        {
            Node node = map.get(key);
            queue.moveToHead(node);
            int value = node.value;
            return value;
        }
        return -1;
    }

    public void put(int key, int value)
    {
        if (map.containsKey(key))
        {
            Node node = map.get(key);
            node.value = value;
            queue.moveToHead(node);
        }
        else
        {
            Node node = new Node(key, value);
            map.put(key, node);
            Node nodeDeleted = queue.addToHead(node);
            if (nodeDeleted != null)
            {
                map.remove(nodeDeleted.key);
            }
        }

    }
}

class Queue
{
    private int capacity;
    private Node head;
    private Node tail;
    private int size;

    public Queue(int capacity)
    {
        this.capacity = capacity;
    }

    void moveToHead(Node node)
    {
        if (node == head)
        {
            return;
        }

        if (node == tail)
        {
            node.pre.next = null;
            tail = tail.pre;


        }
        else
        {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        node.pre = null;
        node.next = head;
        head.pre = node;
        head = node;

    }

    Node addToHead(Node node)
    {
        if (size == 0)
        {
            head = node;
            tail = node;
            size++;
            return null;
        }

        Node tmp = null;

        if (size == capacity)
        {
            tmp = tail;
            tail.pre.next = null;
            tail = tail.pre;
            tmp.pre = null;
            size--;
        }

        node.next = head;
        head.pre = node;
        head = node;

        size++;
        return tmp;
    }

    @Override
    public String toString()
    {
        return "Queue{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}

class Node
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

    @Override
    public String toString()
    {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}