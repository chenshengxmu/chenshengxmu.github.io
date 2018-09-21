---
layout: post
title: Minimum Index Sum for Common Elements of Two Lists
---
* Ram and Shyam want to choose a website to learn programming and they both have a list of favorite websites represented by strings. You need to help them find out their common interest with the least index sum. If there is a choice tie between answers, print all of them with no order requirement. Assume there always exists an answer.
* Examples:
{% highlight cpp %}
Input : ["GeeksforGeeks", "Udemy", "Coursera", "edX"]
        ["Codecademy", "Khan Academy", "GeeksforGeeks"]
Output : "GeeksforGeeks"
Explanation : GeeksforGeeks is the only common website 
              in two lists

Input : ["Udemy", "GeeksforGeeks", "Coursera", "edX"]
        ["GeeksforGeeks", "Udemy", "Khan Academy", "Udacity"]
Output : "GeeksforGeeks" "Udemy"
Explanation : There are two common websites and index sum
              of both is same.
{% endhighlight %}
* Naive Method:
* The idea is to try all index sums from 0 to sum of sizes. For every sum, check if there are pairs with given sum. Once we find one or more pairs, we print them and return.
{% highlight cpp %}
#include <bits/stdc++.h>
using namespace std;

// Function to print common strings with minimum index sum
void find(vector<string> list1, vector<string> list2)
{
    vector<string> res; // resultant list
    int max_possible_sum = list1.size() + list2.size() - 2;

    // iterating over sum in ascending order 
    for (int sum = 0; sum <= max_possible_sum ; sum++) 
    {
        // iterating over one list and check index 
        // (Corresponding to given sum) in other list
        for (int i = 0; i <= sum; i++) 
        
            // put common strings in resultant list  
            if (i < list1.size() && 
                (sum - i) < list2.size() && 
                list1[i] == list2[sum - i])
                res.push_back(list1[i]);         

        // if common string found then break as we are
        // considering index sums in increasing order.
        if (res.size() > 0) 
            break;
    }

    // print the resultant list
    for (int i = 0; i < res.size(); i++) 
        cout << res[i] << " ";
}

// Driver code
int main()
{
    // Creating list1
    vector<string> list1;
    list1.push_back("GeeksforGeeks");
    list1.push_back("Udemy");
    list1.push_back("Coursera");
    list1.push_back("edX");

    // Creating list2
    vector<string> list2;
    list2.push_back("Codecademy");
    list2.push_back("Khan Academy");
    list2.push_back("GeeksforGeeks");

    find(list1, list2);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
GeeksforGeeks
{% endhighlight %}
* Time Complexity : O((l1+l2)2 *x), where l1 and l2 are the lengths of list1 and list2 respectively and x refers to string length.
* Auxiliary Space : O(l*x), where x refers to length of resultant list and l is length of maximum size word.
* Using Hash:
{% highlight cpp %}
// Hashing based C++ program to find common elements
// with minimum index sum.
#include <bits/stdc++.h>
using namespace std;

// Function to print common strings with minimum index sum
void find(vector<string> list1, vector<string> list2)
{
    // mapping strings to their indices
    unordered_map<string, int> map; 
    for (int i = 0; i < list1.size(); i++) 
        map[list1[i]] = i;

    vector<string> res; // resultant list

    int minsum = INT_MAX;
    for (int j = 0; j < list2.size(); j++) 
    {
        if (map.count(list2[j])) 
        {
            // If current sum is smaller than minsum
            int sum = j + map[list2[j]];
            if (sum < minsum) 
            {
                minsum = sum;
                res.clear();
                res.push_back(list2[j]);
            } 

            // if index sum is same then put this 
            // string in resultant list as well  
            else if (sum == minsum) 
                res.push_back(list2[j]);
        }
    }

    // Print result
    for (int i = 0; i < res.size(); i++) 
        cout << res[i] << " ";
}

// Driver code
int main()
{
    // Creating list1
    vector<string> list1;
    list1.push_back("GeeksforGeeks");
    list1.push_back("Udemy");
    list1.push_back("Coursera");
    list1.push_back("edX");

    // Creating list2
    vector<string> list2;
    list2.push_back("Codecademy");
    list2.push_back("Khan Academy");
    list2.push_back("GeeksforGeeks");

    find(list1, list2);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
GeeksforGeeks
{% endhighlight %}
* Time Complexity : O(l1+l2), where l1 and l2 are the lengths of list1 and list2 respectively.
* Auxiliary Space : O(l1*x), where x refers to length of resultant list and l is length of maximum size word.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

