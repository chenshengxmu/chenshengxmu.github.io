---
layout: post
title: Find winner of an election where votes are represented as candidate names
---
* Given an array of names of candidates in an election. A candidate name in array represents a vote casted to the candidate. Print the name of candidates received Max vote. If there is tie, print lexicographically smaller name.
* Examples:
{% highlight cpp %}
Input :  votes[] = {"john", "johnny", "jackie", 
                    "johnny", "john", "jackie", 
                    "jamie", "jamie", "john",
                    "johnny", "jamie", "johnny", 
                    "john"};
Output : John
We have four Candidates with name as 'John', 
'Johnny', 'jamie', 'jackie'. The candidates
John and Johny get maximum votes. Since John
is alphabetically smaller, we print it.
{% endhighlight %}
* A simple solution is to run two loops and count occurrences of every word. Time complexity of this solution is O(n * n * MAX_WORD_LEN).
* An efficient solution is to use Hashing. We insert all votes in a hash map and keep track of counts of different names. Finally we traverse the map and print the person with maximum votes.
{% highlight java %}
// Java program to find winner in an election.
import java.util.*;

public class ElectoralVotingBallot
{
    /* We have four Candidates with name as 'John',
      'Johnny', 'jamie', 'jackie'.
       The votes in String array are as per the
       votes casted. Print the name of candidates
       received Max vote. */
    public static void findWinner(String votes[])
    {
        // Insert all votes in a hashmap
        Map<String,Integer> map =
                    new HashMap<String, Integer>();
        for (String str : votes)
        {
            if (map.keySet().contains(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }

        // Traverse through map to find the candidate
        // with maximum votes.
        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }

            // If there is a tie, pick lexicographically
            // smaller. 
            else if (val == maxValueInMap &&
                winner.compareTo(key) > 0)
                winner = key;
        }
        System.out.println(winner);
    }

    // Driver code
    public static void main(String[] args)
    {
       String[] votes = { "john", "johnny", "jackie",
                         "johnny", "john", "jackie",
                         "jamie", "jamie", "john",
                         "johnny", "jamie", "johnny",
                         "john" };

       findWinner(votes);
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
John
{% endhighlight %}
* Another efficient solution is to use Trie. Please refer most frequent word in an array of strings.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

