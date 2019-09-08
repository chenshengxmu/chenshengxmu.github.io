package string;

public class BullsCows
{
    public String getHint(String secret, String guess)
    {
        int a = 0;
        int b = 0;
        int[] cache1 = new int[10];
        int[] cache2 = new int[10];
        for (int i = 0; i < secret.length(); i++)
        {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            if (c1 == c2)
            {
                a++;
            }
            else
            {
                cache1[c1 - '0']++;
                cache2[c2 - '0']++;
            }
        }
        for (int i = 0; i < cache1.length; i++)
        {
            b += Math.min(cache1[i], cache2[i]);
        }
        return new StringBuilder().append(a).append("A").append(b).append("B").toString();
    }
}
