package design;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordDictionary
{
    public String longestWord(String[] words)
    {
        String res = "";
        Set<String> set = new HashSet<>();
        set.add("");
        Arrays.sort(words);
        for (String word : words)
        {
            String s = word.substring(0, word.length() - 1);
            if (set.contains(s))
            {
                if (word.length() > res.length())
                {
                    res = word;
                }
                set.add(word);
            }

        }
        return res;

    }
}
