package hash;

import java.util.HashMap;
import java.util.Map;

public class WordPattern
{
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null)
        {
            return false;
        }

        String[] words = str.split("\\s+");
        if (pattern.length() != words.length)
        {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++)
        {
            char c = pattern.charAt(i);

            if (map.containsKey(c))
            {
                if (!map.get(c).equals(words[i]))
                {
                    return false;
                }
            }
            else
            {
                if (map.containsValue(words[i]))
                {
                    return false;
                }
                map.put(c, words[i]);
            }
        }
        return true;
    }
}
