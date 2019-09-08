package design;

import java.util.*;

public class AutocompleteSystem2
{
    TrieNode root = new TrieNode();
    StringBuilder sb = new StringBuilder();

    public AutocompleteSystem2(String[] sentences, int[] times)
    {
        for (int i = 0; i < sentences.length; i++)
        {
            insert(sentences[i], times[i]);
        }
    }

    private void insert(String sentence, int time)
    {
        TrieNode cur = root;
        for (char c : sentence.toCharArray())
        {
            int index = c2i(c);
            if (cur.children[index] == null)
            {
                cur.children[index] = new TrieNode();
            }
            cur = cur.children[index];
        }
        cur.times += time;
    }

    private int c2i(char c)
    {
        return c == ' ' ? 26 : c - 'a';
    }


    public List<String> input(char c)
    {
        if (c == '#')
        {
            insert(sb.toString(), 1);
            sb.delete(0, sb.length());
            return new ArrayList<>();
        }
        sb.append(c);
        PriorityQueue<Pair> pq = lookup(sb.toString());
        ArrayList<String> res = new ArrayList<>();
        while (!pq.isEmpty())
        {
            res.add(0, pq.poll().sentence);
        }
        return res;
    }

    private PriorityQueue<Pair> lookup(String s)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>()
        {
            @Override
            public int compare(Pair o1, Pair o2)
            {
                if (o1.times == o2.times)
                {
                    return o2.sentence.compareTo(o1.sentence);
                }
                return Integer.compare(o1.times, o2.times);
            }
        });
        TrieNode cur = search(s);
        if (cur == null)
        {
            return pq;
        }
        traverse(cur, s, pq);
        return pq;
    }

    private void traverse(TrieNode cur, String s, PriorityQueue<Pair> pq)
    {
        if (cur.times > 0)
        {
            pq.offer(new Pair(s, cur.times));
            if (pq.size() > 3)
            {
                pq.poll();
            }
        }

        for (char c = 'a'; c <= 'z'; c++)
        {
            if (cur.children[c - 'a'] != null)
            {
                traverse(cur.children[c - 'a'], s + c, pq);
            }
        }
        if (cur.children[26] != null)
        {
            traverse(cur.children[26], s + ' ', pq);

        }
    }

    private TrieNode search(String s)
    {
        TrieNode cur = root;
        for (char c : s.toCharArray())
        {
            int index = c2i(c);
            if (cur.children[index] == null)
            {
                return null;
            }
            cur = cur.children[index];
        }
        return cur;
    }

    private class TrieNode
    {
        int times;
        TrieNode[] children = new TrieNode[27];
    }

    private class Pair
    {
        String sentence;
        int times;

        public Pair(String sentence, int times)
        {
            this.sentence = sentence;
            this.times = times;
        }
    }
}
