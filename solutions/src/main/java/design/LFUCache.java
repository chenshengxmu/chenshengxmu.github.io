package design;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LFUCache
{
    HashMap<Integer, Integer> keyVals;
    HashMap<Integer, Integer> keyCounts;
    HashMap<Integer, LinkedHashSet<Integer>> countKeySets;
    int capacity;
    int min;

    public LFUCache(int capacity)
    {
        this.capacity = capacity;
        this.min = -1;
        keyVals = new HashMap<Integer, Integer>();
        keyCounts = new HashMap<Integer, Integer>();
        countKeySets = new HashMap<Integer, LinkedHashSet<Integer>>();
        countKeySets.put(1, new LinkedHashSet<Integer>());
    }

    public int get(int key)
    {
        if (!keyVals.containsKey(key))
        {
            return -1;
        }
        int count = keyCounts.get(key);
        keyCounts.put(key, count + 1);

        countKeySets.get(count).remove(key);
        if (count == min && countKeySets.get(count).size() == 0)
        {
            min++;
        }
        if (!countKeySets.containsKey(count + 1))
        {
            countKeySets.put(count + 1, new LinkedHashSet<Integer>());
        }
        countKeySets.get(count + 1).add(key);

        return keyVals.get(key);
    }

    public void put(int key, int value)
    {
        if (capacity <= 0)
        {
            return;
        }

        if (keyVals.containsKey(key))
        {
            keyVals.put(key, value);
            get(key);
            return;
        }
        if (keyVals.size() >= capacity)
        {
            int leastFreq = countKeySets.get(min).iterator().next();
            keyVals.remove(leastFreq);
            keyCounts.remove(leastFreq);
            countKeySets.get(min).remove(leastFreq);
        }
        keyVals.put(key, value);
        keyCounts.put(key, 1);
        countKeySets.get(1).add(key);
        min = 1;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
