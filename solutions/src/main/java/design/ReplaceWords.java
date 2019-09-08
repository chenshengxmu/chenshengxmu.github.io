package design;

import java.util.List;

public class ReplaceWords
{

    public String replaceWords(List<String> dict, String sentence)
    {
        Trie trie = new Trie();
        for (String s : dict)
        {
            trie.insert(s);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : sentence.split("\\s+"))
        {
            String prefix = trie.searchPrefix(s);
            sb.append(prefix).append(" ");
        }
        return sb.toString().isEmpty()? sb.toString() : sb.substring(0, sb.length() - 1);
    }


    public class Trie
    {
        TrieNode root = new TrieNode();

        /**
         * Initialize your data structure here.
         */
        public Trie()
        {

        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word)
        {
            TrieNode cur = root;
            for (char c : word.toCharArray())
            {
                int index = c - 'a';
                if (cur.children[index] == null)
                {
                    cur.children[index] = new TrieNode();
                }
                cur = cur.children[index];
            }
            cur.isEndOfWord = true;
        }

        public String searchPrefix(String word)
        {
            StringBuilder sb = new StringBuilder();
            TrieNode cur = root;
            for (char c : word.toCharArray())
            {
                int index = c - 'a';
                if (cur.children[index] == null || cur.isEndOfWord)
                {
                    break;
                }
                sb.append(c);
                cur = cur.children[index];
            }
            return cur.isEndOfWord ? sb.toString() : word;
        }

        private class TrieNode
        {
            private static final int ALPHABETCOUNT = 26;
            boolean isEndOfWord = false;
            TrieNode[] children = new TrieNode[ALPHABETCOUNT];
        }
    }
}
