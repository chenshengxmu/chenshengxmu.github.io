package design;

public class AddSearchWord
{
    TrieNode root = new TrieNode();

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word)
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
        cur.isEnd = true;

    }

    public boolean search2(String word)
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
        return cur.isEnd;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word)
    {
        return searchWord(word, root, 0);
    }

    private boolean searchWord(String word, TrieNode node, int index)
    {
        if (index == word.length())
        {
            return node.isEnd;
        }
        if (word.charAt(index) == '.')
        {
            for (TrieNode child : node.children)
            {
                if ((child != null) && searchWord(word, child, index + 1))
                {
                    return true;
                }
            }
            return false;
        }
        else
        {
            int i = word.charAt(index) - 'a';
            return (node.children[i] != null) && searchWord(word, node.children[i], index + 1);
        }
    }

    private class TrieNode
    {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    public static void main(String[] args)
    {
        AddSearchWord word = new AddSearchWord();
        word.addWord("bad");
        word.addWord("dad");
        word.addWord("mad");

//        System.out.println(word.search2("pad"));
//        System.out.println(word.search("pad"));
//        System.out.println(word.search2("bad"));
        System.out.println(word.search("bad"));
    }
}
