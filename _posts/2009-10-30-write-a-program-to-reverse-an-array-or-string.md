---
layout: post
title: Write a program to reverse an array or string
---
* Given an array (or string), the task is to reverse the array/string.
* Examples :
{% highlight cpp %}
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
{% endhighlight %}
* Iterative way :
* 1) Initialize start and end indexes as start = 0, end = n-1 2) In a loop, swap arr[start] with arr[end] and change start and end as follows : start = start +1, end = end – 1
* Another example to reverse a string:
* Below is the implementation of the above approach :
{% highlight cpp %}
// Iterative C++ program to reverse an array
#include <bits/stdc++.h>
using namespace std;

/* Function to reverse arr[] from start to end*/
void rvereseArray(int arr[], int start, int end)
{
    while (start < end)
    {
        int temp = arr[start]; 
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    } 
}     

/* Utility function to print an array */
void printArray(int arr[], int size)
{
   for (int i = 0; i < size; i++)
   cout << arr[i] << " ";

   cout << endl;
} 

/* Driver function to test above functions */
int main() 
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    
    // To print original array
    printArray(arr, 6);
    
    // Function calling
    rvereseArray(arr, 0, 5);
    
    cout << "Reversed array is" << endl;
    
    // To print the Reversed array
    printArray(arr, 6);
    
    return 0;
}
{% endhighlight %}
{% highlight c %}
// Iterative C program to reverse an array
#include<stdio.h>

/* Function to reverse arr[] from start to end*/
void rvereseArray(int arr[], int start, int end)
{
    int temp;
    while (start < end)
    {
        temp = arr[start];   
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }   
}     

/* Utility that prints out an array on a line */
void printArray(int arr[], int size)
{
  int i;
  for (i=0; i < size; i++)
    printf("%d ", arr[i]);

  printf("\n");
} 

/* Driver function to test above functions */
int main() 
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    printArray(arr, 6);
    rvereseArray(arr, 0, 5);
    printf("Reversed array is \n");
    printArray(arr, 6);    
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Iterative java program to reverse an
// array
public class GFG {
    
   /* Function to reverse arr[] from 
    start to end*/
    static void rvereseArray(int arr[],
                    int start, int end)
    {
        int temp;
         
        while (start < end)
        {
            temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }     
     
    /* Utility that prints out an
    array on a line */
    static void printArray(int arr[], 
                            int size)
    {
        for (int i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
         
         System.out.println();
    } 

    // Driver code
    public static void main(String args[]) {
        
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6); 
       
    }
}

// This code is contributed by Sam007
{% endhighlight %}
{% highlight python %}
# Iterative python program to reverse an array

# Function to reverse A[] from start to end
def reverseList(A, start, end):
    while start < end:
        A[start], A[end] = A[end], A[start]
        start += 1
        end -= 1

# Driver function to test above function
A = [1, 2, 3, 4, 5, 6]
print(A)
reverseList(A, 0, 5)
print("Reversed list is")
print(A)
# This program is contributed by Pratik Chhajer
{% endhighlight %}
{% highlight cpp %}
1 2 3 4 5 6 
Reversed array is 
6 5 4 3 2 1
{% endhighlight %}
* Time Complexity : O(n)
* Recursive Way :
* 1) Initialize start and end indexes as start = 0, end = n-1 2) Swap arr[start] with arr[end] 3) Recursively call reverse for rest of the array.
* Below is the implementation of the above approach :
{% highlight cpp %}
// Recursive C++ program to reverse an array
#include <bits/stdc++.h>
using namespace std;

/* Function to reverse arr[] from start to end*/
void rvereseArray(int arr[], int start, int end)
{
    if (start >= end)
    return;
    
    int temp = arr[start]; 
    arr[start] = arr[end];
    arr[end] = temp;
    
    // Recursive Function calling
    rvereseArray(arr, start + 1, end - 1); 
}     


/* Utility function to print an array */
void printArray(int arr[], int size)
{
   for (int i = 0; i < size; i++)
   cout << arr[i] << " ";

   cout << endl;
} 

/* Driver function to test above functions */
int main() 
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    
    // To print original array
    printArray(arr, 6);
    
    // Function calling
    rvereseArray(arr, 0, 5);
    
    cout << "Reversed array is" << endl;
    
    // To print the Reversed array
    printArray(arr, 6);
    
    return 0;
}
{% endhighlight %}
{% highlight c %}
// Recursive C program to reverse an array
#include <stdio.h>

/* Function to reverse arr[] from start to end*/
void rvereseArray(int arr[], int start, int end)
{
   int temp;
   if (start >= end)
     return;
   temp = arr[start];   
   arr[start] = arr[end];
   arr[end] = temp;
   rvereseArray(arr, start+1, end-1);   
}     

/* Utility that prints out an array on a line */
void printArray(int arr[], int size)
{
  int i;
  for (i=0; i < size; i++)
    printf("%d ", arr[i]);

  printf("\n");
} 

/* Driver function to test above functions */
int main() 
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    printArray(arr, 6);
    rvereseArray(arr, 0, 5);
    printf("Reversed array is \n");
    printArray(arr, 6);    
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Recursive Java Program to reverse an array
import java.io.*;

class ReverseArray {

    /* Function to reverse arr[] from start to end*/
    static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
    }

    /* Utility that prints out an array on a line */
    static void printArray(int arr[], int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.println("Reversed array is ");
        printArray(arr, 6);
    }
}
/*This article is contributed by Devesh Agrawal*/
{% endhighlight %}
{% highlight python %}
# Recursive python program to reverse an array

# Function to reverse A[] from start to end
def reverseList(A, start, end):
    if start >= end:
        return
    A[start], A[end] = A[end], A[start]
    reverseList(A, start+1, end-1)

# Driver function to test above function
A = [1, 2, 3, 4, 5, 6]
print(A)
reverseList(A, 0, 5)
print("Reversed list is")
print(A)
# This program is contributed by Pratik Chhajer
{% endhighlight %}
{% highlight cpp %}
1 2 3 4 5 6 
Reversed array is 
6 5 4 3 2 1
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find any bug in the above programs or other ways to solve the same problem.

