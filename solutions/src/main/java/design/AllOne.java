package design;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllOne
{
    private Dll dll = new Dll();
    private Map<String, Integer> keyCountMap = new HashMap<>();
    private Map<Integer, Bucket> countBucketMap = new HashMap<>();


    /**
     * Initialize your data structure here.
     */
    public AllOne()
    {

    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key)
    {
        if (keyCountMap.containsKey(key))
        {
            Integer count = keyCountMap.get(key);
            keyCountMap.put(key, count + 1);
            Bucket curBucket = countBucketMap.get(count);

            if (countBucketMap.containsKey(count + 1))
            {
                countBucketMap.get(count + 1).keySet.add(key);
            }
            else
            {

                Bucket newBucket = new Bucket(count + 1);
                newBucket.keySet.add(key);
                countBucketMap.put(count + 1, newBucket);
                dll.insertAfter(curBucket, newBucket);


            }
            curBucket.keySet.remove(key);
            if (curBucket.keySet.isEmpty())
            {
                dll.remove(curBucket);
                countBucketMap.remove(count);
            }
        }
        else
        {
            keyCountMap.put(key, 1);
            if (countBucketMap.containsKey(1))
            {
                countBucketMap.get(1).keySet.add(key);
            }
            else
            {
                Bucket bucket = new Bucket(1);
                bucket.keySet.add(key);
                countBucketMap.put(1, bucket);
                dll.addFirst(bucket);
            }

        }
    }

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key)
    {
        if (keyCountMap.containsKey(key))
        {
            Integer count = keyCountMap.get(key);

            Bucket bucket = countBucketMap.get(count);
            if (count > 1)
            {
                keyCountMap.put(key, count - 1);
                if (countBucketMap.containsKey(count - 1))
                {
                    countBucketMap.get(count - 1).keySet.add(key);
                }
                else
                {
                    Bucket newBucket = new Bucket(count - 1);
                    newBucket.keySet.add(key);
                    dll.insertAfter(bucket, newBucket);
                    countBucketMap.put(count - 1, newBucket);


                }
            }
            else
            {
                keyCountMap.remove(key);

            }
            bucket.keySet.remove(key);
            if (bucket.keySet.isEmpty())
            {
                dll.remove(bucket);
                countBucketMap.remove(count);
            }

        }

    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey()
    {
        return dll.tail.pre == dll.head ? "" : dll.tail.pre.keySet.iterator().next();
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey()
    {
        return dll.head.next == dll.tail ? "" : dll.head.next.keySet.iterator().next();
    }

    private class Bucket
    {
        int count;
        Set<String> keySet = new HashSet<>();
        Bucket pre;
        Bucket next;

        public Bucket(int count)
        {
            this.count = count;
        }

        @Override
        public String toString()
        {
            return "Bucket{" +
                    "count=" + count +
                    ", keySet=" + keySet +
                    '}';
        }
    }

    private class Dll
    {
        Bucket head = new Bucket(-1);
        Bucket tail = new Bucket(-1);

        public Dll()
        {
            head.next = tail;
            tail.pre = head;
        }

        public void remove(Bucket bucket)
        {
            bucket.pre.next = bucket.next;
            bucket.next.pre = bucket.pre;
        }

        public void addFirst(Bucket bucket)
        {
            insertAfter(head, bucket);
        }

        public void insertAfter(Bucket curBucket, Bucket newBucket)
        {
            newBucket.next = curBucket.next;
            curBucket.next.pre = newBucket;

            curBucket.next = newBucket;
            newBucket.pre = curBucket;
        }

        @Override
        public String toString()
        {
            return "Dll{" +
                    "head=" + head +
                    ", tail=" + tail +
                    '}';
        }
    }

    public static void main(String[] args)
    {
        AllOne allOne = new AllOne();
        allOne.inc("a");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("b");
        System.out.println(allOne.countBucketMap);

        allOne.dec("b");
        allOne.dec("b");
        System.out.println(allOne.countBucketMap);
        System.out.println(allOne.getMaxKey());
        System.out.println(allOne.getMinKey());

    }
}
