---
layout: post
title: Remove characters from the first string which are present in the second string
---
* Write an efficient C function that takes two strings as arguments and removes the characters from first string which are present in second string (mask string).
* Algorithm: Let first input string be”test string” and the string which has characters to be removed from first string be “mask” 1: Initialize: res_ind = 0 /* index to keep track of processing of each character in i/p string */ ip_ind = 0 /* index to keep track of processing of each character in the resultant string */
* 2: Construct count array from mask_str. Count array would be: (We can use Boolean array here instead of int count array because we don’t need count, we need to know only if character is present in mask string) count[‘a’] = 1 count[‘k’] = 1 count[‘m’] = 1 count[‘s’] = 1
* 3: Process each character of the input string and if count of that character is 0 then only add the character to the resultant string. str = “tet tringng” // ’s’ has been removed because ’s’ was present in mask_str but we we have got two extra characters “ng” ip_ind = 11 res_ind = 9
* 4: Put a ‘\0′ at the end of the string?
* Implementations:
{% highlight c %}
#include <stdio.h>
#include <stdlib.h>
#define NO_OF_CHARS 256

/* Returns an array of size 256 containg count
   of characters in the passed char array */
int *getCharCountArray(char *str)
{
   int *count = (int *)calloc(sizeof(int), NO_OF_CHARS);
   int i;
   for (i = 0; *(str+i);  i++)
      count[*(str+i)]++;
   return count;
}

/* removeDirtyChars takes two string as arguments: First
string (str)  is the one from where function removes dirty
characters. Second  string is the string which contain all
dirty characters which need to be removed  from first string */
char *removeDirtyChars(char *str, char *mask_str)
{
  int *count  = getCharCountArray(mask_str);
  int ip_ind  = 0, res_ind = 0;
  while (*(str + ip_ind))
  {
    char temp = *(str + ip_ind);
    if (count[temp] == 0)
    {
        *(str + res_ind) = *(str + ip_ind);
        res_ind++;
    }
    ip_ind++;
  }    

  /* After above step string is ngring. 
    Removing extra "iittg" after string*/
  *(str+res_ind) = '\0';    

  return str;
}

/* Driver program to test getCharCountArray*/
int main()
{
    char str[]         = "geeksforgeeks";
    char mask_str[]  = "mask";
    printf("%s", removeDirtyChars(str, mask_str));
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to remove duplicates, the order of
// characters is not maintained in this program

public class GFG 
{
    static final int NO_OF_CHARS = 256;
    
    /* Returns an array of size 256 containg count
       of characters in the passed char array */
    static int[] getCharCountArray(String str)
    {
       int count[] = new int[NO_OF_CHARS];
       for (int i = 0; i<str.length();  i++)
          count[str.charAt(i)]++;
       
       return count;
    }
    
    /* removeDirtyChars takes two string as arguments: First
    string (str)  is the one from where function removes dirty
    characters. Second  string is the string which contain all
    dirty characters which need to be removed  from first string */
    static String removeDirtyChars(String str, String mask_str)
    {
      int count[]  = getCharCountArray(mask_str);
      int ip_ind  = 0, res_ind = 0;
      
      char arr[] = str.toCharArray();
      
      while (ip_ind != arr.length)
      {
        char temp = arr[ip_ind];
        if(count[temp] == 0)
        {
            arr[res_ind] = arr[ip_ind];
            res_ind ++;
        }
            ip_ind++;
        
      }    

      str = new String(arr);
      
      /* After above step string is ngring. 
      Removing extra "iittg" after string*/
      
      return str.substring(0, res_ind);
      
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        String mask_str = "mask";
        System.out.println(removeDirtyChars(str, mask_str));
    }
}
{% endhighlight %}
{% highlight python %}
# Python program to remove characters from first string which
# are present in the second string
NO_OF_CHARS = 256

# Utility function to convert from string to list
def toList(string):
    temp = []
    for x in string:
        temp.append(x)
    return temp

# Utility function to convert from list to string
def toString(List):
    return ''.join(List)

# Returns an array of size 256 containing count of characters
# in the passed char array
def getCharCountArray(string):
    count = [0] * NO_OF_CHARS
    for i in string:
        count[ord(i)] += 1
    return count

# removeDirtyChars takes two string as arguments: First
# string (str)  is the one from where function removes dirty
# characters. Second  string is the string which contain all
# dirty characters which need to be removed  from first string
def removeDirtyChars(string, mask_string):
    count = getCharCountArray(mask_string)
    ip_ind = 0
    res_ind = 0
    temp = ''
    str_list = toList(string)

    while ip_ind != len(str_list):
        temp = str_list[ip_ind]
        if count[ord(temp)] == 0:
            str_list[res_ind] = str_list[ip_ind]
            res_ind += 1
        ip_ind+=1

    # After above step string is ngring.
     # Removing extra "iittg" after string
    return toString(str_list[0:res_ind])

# Driver function to test the above functions
mask_string = "mask"
string = "geeksforgeeks"
print removeDirtyChars(string, mask_string)

# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
geeforgee
{% endhighlight %}
* Time Complexity: O(m+n) Where m is the length of mask string and n is the length of the input string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

