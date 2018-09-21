---
layout: post
title: Program to check for a Valid IMEI Number
---
* International Mobile Equipment Identity (IMEI) is a number, usually unique, to identify mobile phones, as well as some satellite phones. It is usually found printed inside the battery compartment of the phone, but can also be displayed on-screen on most phones by entering *#06# on the dialpad, or alongside other system information in the settings menu on smartphone operating systems. The IMEI number is used by a GSM network to identify valid devices and therefore can be used for stopping a stolen phone from accessing that network. Source: Wikipedia
* The IMEI (15 decimal digits: 14 digits plus a check digit) includes information on the origin, model, and serial number of the device. The IMEI is validated in following steps:
* Example:
{% highlight cpp %}
Input IMEI : 490154203237518


Output : Since, 60 is divisible by 10, hence the given IMEI number is Valid.
{% endhighlight %}
{% highlight java %}
// Java program to check whether the
// given EMEI number is valid or not.
import java.io.*;
class IMEI
{
    // Function for finding and returning
    // sum of digits of a number
    static int sumDig(int n)
    {
        int a = 0;
        while (n > 0)
        {
            a = a + n % 10;
            n = n / 10;
        }
        return a;
    }

    static boolean isValidIMEI(long n)
    {
        // Converting the number into String
        // for finding length
        String s = Long.toString(n);
        int len = s.length();

        if (len != 15)
            return false;

        int sum = 0;
        for (int i = len; i >= 1; i--)
        {
            int d = (int)(n % 10);

            // Doubling every alternate digit
            if (i % 2 == 0)
                d = 2 * d;

            // Finding sum of the digits
            sum += sumDig(d);
            n = n / 10;
        }

        return (sum % 10 == 0);
    }

    // Driver code
    public static void main(String args[]) throws IOException
    {
        // 15 digits cannot be stored in 'int' data type
        long n = 490154203237518L;

        if (isValidIMEI(n))
            System.out.println("Valid IMEI Code");
        else
            System.out.println("Invalid IMEI Code");

    }
}
{% endhighlight %}
{% highlight python %}
# Python3 code to check whether the
# given EMEI number is valid or not

# Function for finding and returning
# sum of digits of a number
def sumDig( n ):
    a = 0
    while n > 0:
        a = a + n % 10
        n = int(n / 10)

    return a

# Returns True if n is valid EMEI
def isValidEMEI(n):

    # Converting the number into
    # Sting for finding length
    s = str(n)
    l = len(s)

    # If length is not 15 then IMEI is Invalid
    if l != 15:
        return False

    d = 0
    sum = 0
    for i in range(15, 0, -1):
        d = (int)(n % 10)
        if i % 2 == 0:

            # Doubling every alternate digit
            d = 2 * d

        # Finding sum of the digits
        sum = sum + sumDig(d)
        n = n / 10
    return (sum % 10 == 0)

# Driver code
n = 490154203237518
if isValidEMEI(n):
    print("Valid IMEI Code")
else:
    print("Invalid IMEI Code")

# This code is contributed by "Sharad_Bhardwaj".
{% endhighlight %}
{% highlight cpp %}
Valid IMEI Code
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

