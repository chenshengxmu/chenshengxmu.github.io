---
layout: post
title: Compare Version Numbers with large inputs allowed
---
* Compare the two versions, version1, version2. If version1 > version2 return 1 If version1 < version2 return -1 if version1 = version2 return 0
* version strings are non-empty and contain only digits and the '.' character. The '.' character does not represent a decimal point and is used to separate number sequences.
* Example of version ordering. 0.1 < 1.1 < 1.2 < 1.13 < 1.13.4
* Note : Here the numbers present inside the string can be huge so don’t try to convert these numbers to unsigned long long. Eg. version1 = 1.234565434523423423523423423423434432.23.0
* Examples:
{% highlight cpp %}
Input :  version1 : 002.0005.12.3
         version2 : 2.5.12.3
Output : 0

Input : version1 : 451231654684151546847799885544662
        version2 : 1.256.24.5.5
Output : 1

Input : version1 : 1.21.20
        version2 : 1.21.25
Output : -1

Input : version1 : 1.2
        version2 : 1.2.0.0.0
Output : 0

Input : version1 : 1.2
        version2 : 1.0.1
Output : -1
{% endhighlight %}
* We have discussed a solution in below post.
* Compare two Version numbers
* The previous solution discussed above has problems like, it does not handle leading zeros and does not work for large numbers as individual parts of version numbers are stored as int.
* In this solution, above issues are addressed. We traverse the both versions at same time and process them until both of them gets fully traversed. Store the numbers from version1 and version 2 in different strings i.e substr_version1 and substr_version2. Compare these substrings, if length of substr_version1 > substr_version2 the clearly substr_version1 is greater in value so return +1. Similar is case when substr_version2 > substr_version1, we will return -1. But if both substrings are similar in length then we will have to check each character from both substrings and then compare those characters and then return the result appropriately.
{% highlight c %}
/* C program to compare two versions */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// utility function to compare each substring of version1 and
// version2
 int compareSubstr(char *substr_version1, char *substr_version2,
                  int len_substr_version1, int len_substr_version2)
 {
     // if length of substring of version 1 is greater then
     // it means value of substr of version1 is also greater
     if (len_substr_version1 > len_substr_version2) 
        return 1;

     else if (len_substr_version1 < len_substr_version2) 
        return -1;

     // when length of the substrings of both versions is same.
     else
     {
        int i = 0, j = 0;

        // compare each character of both substrings and return
        // accordingly.
        while (i < len_substr_version1)
        {
            if (substr_version1[i] < substr_version2[j]) return -1;
            else if (substr_version1[i] > substr_version2[j]) return 1;
            i++, j++;
        }
        return 0;
     }
 }

// function to compare two versions.
int compareVersion(char* version1, char* version2)
{
    int len_version1 = strlen(version1);
    int len_version2 = strlen(version2);

    char *substr_version1 = (char *) malloc(sizeof(char) * 1000);
    char *substr_version2 = (char *) malloc(sizeof(char) * 1000);    

    // loop until both strings are exhausted.
    // and extract the substrings from version1 and version2
    int i = 0, j = 0;
    while (i < len_version1 || j < len_version2)
    {
        int p = 0, q = 0;

        // skip the leading zeros in version1 string.
        while (version1[i] == '0' || version1[i] == '.') 
           i++;

        // skip the leading zeros in version2 string.
        while (version2[j] == '0' || version2[j] == '.') 
           j++;

        // extract the substring from version1.
        while (version1[i] != '.' && i < len_version1)        
            substr_version1[p++] = version1[i++];
        
        //extract the substring from version2.
        while (version2[j] != '.' && j < len_version2)        
            substr_version2[q++] = version2[j++];    

        int res = compareSubstr(substr_version1, 
                                substr_version2, p, q);

        // if res is either -1 or +1 then simply return.
        if (res)
            return res;
    }

    // here both versions are exhausted it implicitly 
    // means that both strings are equal.
    return 0;
}

// Driver code.
int main()
{
    // Define Two versions.
    char version1[] = "1.2.032.45";
    char version2[] = "1.2.32.4";

    int res = compareVersion(version1, version2);

    printf("%d\n", res);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
1
{% endhighlight %}
* Time Complexity : O(2 * N) –> O(N) Here worst case is when both the versions are equal so after extracting both substrings each of them will again be compared in compareSubstr() function which will take the complexity upto (2 * N).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

