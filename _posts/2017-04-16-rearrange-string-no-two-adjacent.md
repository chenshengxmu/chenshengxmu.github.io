---
layout: post
title: Rearrange characters in a string such that no two adjacent are same
---
```java
String rearrangeString(String s)
{
    String res = "";
    int[] count = new int[256];
    for (int i = 0; i < s.length(); i++)
    {
        count[s.charAt(i)] += 1;
    }
    PriorityQueue<AbstractMap.SimpleEntry<Character, Integer>> pq = new PriorityQueue<>(new Comparator<AbstractMap.SimpleEntry<Character, Integer>>()
            {
            @Override
            public int compare(AbstractMap.SimpleEntry<Character, Integer> o1, AbstractMap.SimpleEntry<Character, Integer> o2)
            {
            return o2.getValue().compareTo(o1.getValue());
            }
            });
    for (char c = 'a'; c <= 'z'; c++)
    {
        if (count[c] > 0)
        {
            AbstractMap.SimpleEntry<Character, Integer> entry = new AbstractMap.SimpleEntry<Character, Integer>(c, count[c]);
            pq.offer(entry);
        }
    }
    AbstractMap.SimpleEntry<Character, Integer> prev = new AbstractMap.SimpleEntry<Character, Integer>('#', -1);
    while (!pq.isEmpty())
    {
        AbstractMap.SimpleEntry<Character, Integer> entry = pq.poll();
        if (prev.getValue() > 0)
        {
            pq.offer(prev);
        }
        res += entry.getKey();
        entry.setValue(entry.getValue() - 1);
        prev = entry;
    }
    if (res.length() == s.length())
    {
        return res;
    }
    return "not valid";
}
```
