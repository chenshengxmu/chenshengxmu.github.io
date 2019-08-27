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

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word)
    {
        TrieNode cur = root;
        for (char c : word.toCharArray())
        {
            int index = c - 'a';
            if (cur.children[index] == null)
            {
                return false;
            }
            cur = cur.children[index];
        }
        return cur.isEndOfWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix)
    {
        TrieNode cur = root;
        for (char c : prefix.toCharArray())
        {
            int index = c - 'a';
            if (cur.children[index] == null)
            {
                return false;
            }
            cur = cur.children[index];
        }
        return true;

    }

    private class TrieNode
    {
        private static final int ALPHABETCOUNT = 26;
        boolean isEndOfWord = false;
        TrieNode[] children = new TrieNode[ALPHABETCOUNT];
    }
}
