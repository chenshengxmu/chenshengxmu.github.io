---
layout: post
title: Partition given string in such manner that i'th substring is sum of (i-1)'th and (i-2)'th substring
---
* Partition given string in such manner that i’th substring is sum of (i-1)’th and (i-2)’nd substring.
* Examples:
{% highlight cpp %}
Input : "11235813"
Output : ["1", "1", "2", "3", "5", "8", "13"]

Input : "1111223"
Output : ["1", "11", "12", "23"]

Input : "1111213"
Output : ["11", "1", "12", "13"]

Input : "11121114"
Output : []
{% endhighlight %}
* 1. Iterate through the given string by picking 3 numbers (first, seconds and third) at a time starting from one digit each. 2. If first + second = third, recursively call check() with second as first and third as second. The third is picked based on next possible number of digits. (The result of addition of two numbers can have a max. of second’s & third’s digits + 1) 3. Else, first increment the third (by adding more digits) till the limit (Here limit is sum of first and second). 4. After incrementing third, following cases arise. a) When doesn’t match, increment the second offset. b) When doesn’t match, increment the first offset. c) Note: Once a call to check() is made after incrementing the third offset, do not alter the second or first, as those are already finalized. 5. When the end of the string is reached and the condition is satisfied, add “second” and “third” to the empty list. While rolling back the recursive stack, prepend the “first” to the list so the order is preserved.
{% highlight java %}
// Java program to check if we can partition a 
// string in a way that value of i-th string is
// sum of (i-1)-th and (i-2)-th substrings.
import java.util.LinkedList;

public class SumArray {

  private static LinkedList<Integer> resultList = 
                                   new LinkedList<>();

  private static boolean check(char[] chars, int offset1, 
       int offset2, int offset3, boolean freezeFirstAndSecond) {

    // Find subarrays according to given offsets
    int first = intOf(subArr(chars, 0, offset1));
    int second = intOf(subArr(chars, offset1, offset2));
    int third = intOf(subArr(chars, offset1 + offset2, offset3));

    // If condition is satisfied for current subarrays
    if (first + second == third) {

      // If whole array is covered.
      if (offset1 + offset2 + offset3 >= chars.length) {
        addIntermediateResults(first, second, third);
        return true;
      }
      
      // Check if remaining array also satisfies the condition
      boolean result = check(subArr(chars, offset1, 
           chars.length - offset1), offset2, offset3,
                  Math.max(offset2, offset3), true);
      if (result) 
        addIntermediateResults(first, second, third);      
      return result;
    }

    // If not satisfied, try incrementing third
    if (isValidOffSet(offset1, offset2, 1 + offset3, chars.length)) {
      if (check(chars, offset1, offset2, 1 + offset3, false)) 
        return true;      
    }

    // If first and second have been finalized, do not 
    // alter already computed results
    if (freezeFirstAndSecond)
      return false;
 
    // If first and second are not finalized
    if (isValidOffSet(offset1, 1 + offset2, Math.max(offset1, 
                           1 + offset2),  chars.length)) {

      // Try incrementing second
      if (check(chars, offset1, 1 + offset2,
           Math.max(offset1, 1 + offset2), false)) 
        return true;      
    }

    // Try incrementing first
    if (isValidOffSet(1 + offset1, offset2, Math.max(1 + offset1,
                                  offset2),  chars.length)) {
     if (check(chars, 1 + offset1, offset2, Math.max(1 + offset1,
                                             offset2), false)) 
        return true;
    }
    return false;
  }

  private static void addIntermediateResults(int first,
                              int second, int third) {
    if (resultList.isEmpty()) {
      resultList.add(second);
      resultList.add(third);
    }
    resultList.addFirst(first);
  }

  // Check if given three offsets are valid (Within array length
  // and third offset can represent sum of first two)
  private static boolean isValidOffSet(int offset1, int offset2, 
                                   int offset3, int length) {
    return (offset1 + offset2 + offset3 <= length &&
            (offset3 == Math.max(offset1, offset2) ||
             offset3 == 1 + Math.max(offset1, offset2)));
  }

  // To get a subarray with starting from given 
  // index and offset
  private static char[] subArr(char[] chars, int index, int offset) {
    int trueOffset = Math.min(chars.length - index, offset);
    char[] destArr = new char[trueOffset];
    System.arraycopy(chars, index, destArr, 0, trueOffset);
    return destArr;
  }

  private static int intOf(char... chars) {
    return Integer.valueOf(new String(chars));
  }

  public static void main(String[] args) {
    String numStr = "11235813";
    char[] chars = numStr.toCharArray();
    System.out.println(check(chars, 1, 1, 1, false));
    System.out.println(resultList);
  }
}
{% endhighlight %}
{% highlight cpp %}
true
[1, 1, 2, 3, 5, 8, 13]
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

