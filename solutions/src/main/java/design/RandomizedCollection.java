package design;

import java.util.*;

public class RandomizedCollection
{
    Map<Integer, Set<Integer>> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    /**
     * Initialize your data structure here.
     */
    public RandomizedCollection()
    {

    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val)
    {

        list.add(val);

        if (map.containsKey(val))
        {
            map.get(val).add(list.size() - 1);
            return false;
        }
        Set<Integer> set = new HashSet<>();
        set.add(list.size() - 1);
        map.put(val, set);
        return true;

    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val)
    {
        if (!map.containsKey(val))
        {
            return false;

        }
        Set<Integer> set = map.get(val);
        Integer index = set.iterator().next();

        if (index == list.size() - 1)
        {
            list.remove(list.size() - 1);
            set.remove(index);
            if (set.isEmpty())
            {
                map.remove(val);
            }
            return true;
        }

        set.remove(index);

        Integer lastVal = list.get(list.size() - 1);
        list.set(index, lastVal);
        map.get(lastVal).add(index);
        map.get(lastVal).remove(list.size() - 1);

        list.remove(list.size() - 1);
        if (set.isEmpty())
        {
            map.remove(val);
        }
        return true;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom()
    {
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args)
    {
        RandomizedCollection rc = new RandomizedCollection();
        rc.insert(0);
        rc.insert(1);
        rc.insert(2);
        rc.insert(3);
        rc.insert(3);



        System.out.println(rc.list);
        System.out.println(rc.map);
        rc.remove(3);
        System.out.println(rc.list);
        System.out.println(rc.map);
        rc.remove(2);
        System.out.println(rc.list);
        System.out.println(rc.map);
        rc.remove(3);
        System.out.println(rc.list);
    }
}
