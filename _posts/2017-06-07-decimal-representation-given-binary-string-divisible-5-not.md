---
layout: post
title: Decimal representation of given binary string is divisible by 5 or not
---
* The problem is to check whether the decimal representation of the given binary number is divisible by 5 or not. Take care, the number could be very large and may not fit even in long long int. The approach should be such that there are zero or minimum number of multiplication and division operations. No leading 0’s are there in the input.
* Examples:
{% highlight cpp %}
Input : 1010
Output : YES
(1010)2 = (10)10,
and 10 is divisible by 5.

Input : 10000101001
Output : YES
{% endhighlight %}
* Approach: The following steps are:
* How to covert binary number to base 4 representation?
{% highlight cpp %}
// C++ implementation to check whether decimal representation 
// of given binary number is divisible by 5 or not
#include <bits/stdc++.h>

using namespace std;

// function to return equivalent base 4 number 
// of the given binary number
int equivalentBase4(string bin)
{
	if (bin.compare("00") == 0) 
		return 0;
	if (bin.compare("01") == 0) 
		return 1;
	if (bin.compare("10") == 0) 
		return 2;
	return 3; 
}

// function to check whether the given binary
// number is divisible by 5 or not
string isDivisibleBy5(string bin)
{
	int l = bin.size();
	
	if (l % 2 != 0)
	// add '0' in the beginning to make 
	// length an even number
		bin = '0' + bin;
	
	// to store sum of digits at odd and 
	// even places respectively 
	int odd_sum, even_sum = 0;
	
	// variable check for odd place and
	// even place digit
	int isOddDigit = 1;
	for (int i = 0; i<bin.size(); i+= 2)
	{
		// if digit of base 4 is at odd place, then
		// add it to odd_sum
		if (isOddDigit)
			odd_sum += equivalentBase4(bin.substr(i, 2));
		// else digit of base 4 is at even place,
		// add it to even_sum 
		else
			even_sum += equivalentBase4(bin.substr(i, 2));
		
		isOddDigit ^= 1; 
	}
	
	// if this diff is divisible by 11(which is 5 in decimal)
	// then, the binary number is divisible by 5
	if (abs(odd_sum - even_sum) % 5 == 0)
		return "Yes";
	
	// else not divisible by 5
	return "No";
			
}

// Driver program to test above
int main()
{
	string bin = "10000101001";
	cout << isDivisibleBy5(bin);
	return 0;
}
{% endhighlight %}
{% highlight java %}
//Java implementation to check whether decimal representation 
//of given binary number is divisible by 5 or not

class GFG 
{
	// Method to return equivalent base 4 number 
	// of the given binary number
	static int equivalentBase4(String bin)
	{
		if (bin.compareTo("00") == 0) 
			return 0;
		if (bin.compareTo("01") == 0) 
			return 1;
		if (bin.compareTo("10") == 0) 
			return 2;
		return 3; 
	}
	
	// Method to check whether the given binary
	// number is divisible by 5 or not
	static String isDivisibleBy5(String bin)
	{
		int l = bin.length();
		
		if (l % 2 != 0)
		// add '0' in the beginning to make 
		// length an even number
			bin = '0' + bin;
		
		// to store sum of digits at odd and 
		// even places respectively 
		int odd_sum=0, even_sum = 0;
		
		// variable check for odd place and
		// even place digit
		int isOddDigit = 1;
		for (int i = 0; i<bin.length(); i+= 2)
		{
			// if digit of base 4 is at odd place, then
			// add it to odd_sum
			if (isOddDigit != 0)
				odd_sum += equivalentBase4(bin.substring(i, i+2));
			// else digit of base 4 is at even place,
			// add it to even_sum 
			else
				even_sum += equivalentBase4(bin.substring(i, i+2));
			
			isOddDigit ^= 1; 
		}
		
		// if this diff is divisible by 11(which is 5 in decimal)
		// then, the binary number is divisible by 5
		if (Math.abs(odd_sum - even_sum) % 5 == 0)
			return "Yes";
		
		// else not divisible by 5
		return "No";
				
	}
	
	public static void main (String[] args)
	{
		String bin = "10000101001";
	    System.out.println(isDivisibleBy5(bin));
	}
}
{% endhighlight %}
{% highlight cpp %}
YES
{% endhighlight %}
* Time Complexity: O(n), where n is the number of digits in the binary number.
* References: https://stackoverflow.com/questions/18473730/algorithm-in-hardware-to-find-out-if-number-is-divisible-by-five
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

