package design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AutocompleteSystem
{
    TrieNode root = new TrieNode();
    StringBuilder sb = new StringBuilder();

    public AutocompleteSystem(String[] sentences, int[] times)
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
        List<Pair> list = lookup(sb.toString());
        Collections.sort(list, new Comparator<Pair>()
        {
            @Override
            public int compare(Pair o1, Pair o2)
            {
                if (o1.times == o2.times)
                {
                    return o1.sentence.compareTo(o2.sentence);
                }
                return Integer.compare(o2.times, o1.times);
            }
        });
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < Math.min(3, list.size()); i++)
        {
            res.add(list.get(i).sentence);
        }
        return res;
    }

    private List<Pair> lookup(String s)
    {
        ArrayList<Pair> list = new ArrayList<>();
        TrieNode cur = search(s);
        if (cur == null)
        {
            return list;
        }
        traverse(cur, s, list);
        return list;
    }

    private void traverse(TrieNode cur, String s, ArrayList<Pair> list)
    {
        if (cur.times > 0)
        {
            list.add(new Pair(s, cur.times));
        }

        for (char c = 'a'; c <= 'z'; c++)
        {
            if (cur.children[c - 'a'] != null)
            {
                traverse(cur.children[c - 'a'], s + c, list);
            }
        }
        if (cur.children[26] != null)
        {
            traverse(cur.children[26], s + ' ', list);

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
