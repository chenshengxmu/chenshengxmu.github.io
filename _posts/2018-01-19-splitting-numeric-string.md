---
layout: post
title: Splitting a Numeric String
---
* Given a numeric string (length <= 32), split it into two or more integers( if possible), such that 1) Difference between current and previous number is 1. 2) No number contains leading zeroes If it is possible to separate a given numeric string then print “Possible” followed by the first number of the increasing sequence, else print “Not Possible“. Examples:
{% highlight cpp %}
Input : 1234
Output : Possible 1
Explanation: String can be split as "1", "2", 
"3", "4"

Input : 99100
Output :Possible 99
Explanation: String can be split as "99",
"100"

Input : 101103
Output : Not Possible
Explanation: It is not possible to split this 
string under given constraint.
{% endhighlight %}
* Approach : The idea is to take a substring from index 0 to any index i (i starting from 1) of the numeric string and convert it to long data type. Add 1 to it and convert the increased number back to string. Check if the next occurring substring is equal to the increased one. If yes, then carry on the procedure else increase the value of i and repeat the steps.
{% highlight java %}
// Java program to split a numeric
// string in an Increasing
// sequence if possible
import java.io.*;
import java.util.*;

class GFG {

    // Function accepts a string and
    // checks if string can be split.
    public static void split(String str)
    {
        int len = str.length();

        // if there is only 1 number
        // in the string then
        // it is not possible to split it
        if (len == 1) {
            System.out.println("Not Possible");
            return;
        }

        String s1 = "", s2 = "";
        long num1, num2;

        for (int i = 0; i <= len / 2; i++) {

            int flag = 0;

            // storing the substring from
            // 0 to i+1 to form initial
            // number of the increasing sequence
            s1 = str.substring(0, i + 1);
            num1 = Long.parseLong((s1));
            num2 = num1 + 1;

            // convert string to integer
            // and add 1 and again convert
            // back to string s2
            s2 = Long.toString(num2);
            int k = i + 1;
            while (flag == 0) {
                int l = s2.length();

                // if s2 is not a substring
                // of number than not possile
                if (k + l > len) {
                    flag = 1;
                    break;
                }

                // if s2 is the next substring
                // of the numeric string
                if ((str.substring(k, k + l).equals(s2))) {
                    flag = 0;

                    // Incearse num2 by 1 i.e the
                    // next number to be looked for
                    num2++;
                    k = k + l;

                    // check if string is fully
                    // traversed then break
                    if (k == len)
                        break;
                    s2 = Long.toString(num2);
                    l = s2.length();
                    if (k + 1 > len) {

                        // If next string doesnot occurs
                        // in a given numeric string
                        // then it is not possible
                        flag = 1;
                        break;
                    }
                }

                else
                    flag = 1;
            }

            // if the string was fully traversed
            // and conditions were satisfied
            if (flag == 0) {
                System.out.println("Possible"
                                   + " " + s1);
                break;
            }

            // if conditions failed to hold
            else if (flag == 1 && i > len / 2 - 1) {
                System.out.println("Not Possible");
                break;
            }
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = "99100";

        // Call the split function
        // for splitting the string
        split(str);
    }
}
{% endhighlight %}
{% highlight cpp %}
Possible 99
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

