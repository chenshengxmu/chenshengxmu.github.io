package hash;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache3 extends LinkedHashMap<Integer, Integer>
{
    int capacity;
    public LRUCache3(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest)
    {
        return size() > capacity;
    }

    public int get(int key) {

        Integer v = super.get(key);
        if (v == null)
        {
            return -1;
        }
        return v;
    }

    public static void main(String[] args)
    {
        LRUCache3 cache = new LRUCache3(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        System.out.println(cache);

        System.out.println(cache.get(2));
        System.out.println(cache);
        cache.put(5, 5);
        System.out.println(cache);

    }
}
