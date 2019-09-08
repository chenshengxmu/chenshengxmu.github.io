package design;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V>
{
    private Map<K, Node<K, V>> map;
    private Queue<K, V> queue;

    public LRUCache(int capacity)
    {
        this.queue = new Queue<>(capacity);
        this.map = new HashMap<>();
    }

    public V get(K key)
    {
        if (map.containsKey(key))
        {
            Node<K, V> node = map.get(key);
            queue.moveToHead(node);
            return node.value;
        }
        return null;
    }

    public void set(K key, V value)
    {
        if (map.containsKey(key))
        {
            Node<K, V> node = map.get(key);
            node.value = value;

            queue.moveToHead(node);
        }
        else
        {
            Node<K, V> node = new Node<>(key, value);
            map.put(key, node);

            Node<K, V> nodeToDelete = queue.addToHead(node);
            if (nodeToDelete != null)
            {
                map.remove(nodeToDelete.key);

            }

        }

    }

    class Node<K, V>
    {
        K key;
        V value;
        Node<K, V> pre;
        Node<K, V> next;

        Node(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
    }

    class Queue<K, V>
    {
        private int capacity;
        private int size;
        private Node<K, V> head;
        private Node<K, V> tail;

        Queue(int capacity)
        {
            this.capacity = capacity;
        }

        Node<K, V> addToHead(Node<K, V> node)
        {
            Node<K, V> nodeDeleted = null;
            if (isFull())
            {
                nodeDeleted = removeLastNode();

            }

            if (isEmpty())
            {
                head = node;
                tail = node;
            }
            else
            {
                node.next = head;
                head.pre = node;
                head = node;
            }

            size++;

            return nodeDeleted;
        }

        void moveToHead(Node<K, V> node)
        {
            if (node == head)
            {
                return;
            }

            if (node == tail)
            {

                node.pre.next = null;
                tail = node.pre;

            }
            else
            {
                node.pre.next = node.next;
                node.next.pre = node.pre;
            }

            node.next = head;
            node.pre = null;
            head.pre = node;
            head = node;

        }

        private boolean isEmpty()
        {
            return size == 0;
        }

        private Node<K, V> removeLastNode()
        {
            Node<K, V> nodeToDelete = tail;
            tail.pre.next = null;
            tail = tail.pre;

            size--;

            return nodeToDelete;
        }

        private boolean isFull()
        {
            return size == capacity;
        }


    }
}

