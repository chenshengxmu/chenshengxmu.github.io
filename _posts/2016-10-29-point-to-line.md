---
layout: post
title: Optimum location of point to minimize total distance
---

## Problem
Given a set of points as and a line as ax+by+c = 0. We need to find a point on given line for which sum of distances from given set of points is minimum.

## Solution
{% highlight c %}
double findOptimumCost(point p[], int n, line l)
{
    double low = -1e6;
    double high = 1e6;
 
    // loop untill difference between low and high
    // become less than EPS
    while ((high - low) > EPS)
    {
        // mid1 and mid2 are representative x co-ordiantes
        // of search space
        double mid1 = low + (high - low) / 3;
        double mid2 = high - (high - low) / 3;
 
        //
        double dist1 = compute(p, n, l, mid1);
        double dist2 = compute(p, n, l, mid2);
 
        // if mid2 point gives more total distance,
        // skip third part
        if (dist1 < dist2)
            high = mid2;
 
        // if mid1 point gives more total distance,
        // skip first part
        else
            low = mid1;
    }
 
    // compute optimum distance cost by sending average
    // of low and high as X
    return compute(p, n, l, (low + high) / 2);
}
{% endhighlight %}

## Extension
{% highlight python %}
def ternarySearch(f, left, right, absolutePrecision):
    """
    Find maximum of unimodal function f() within [left, right]
    To find the minimum, revert the if/else statement or revert the comparison.
    """
    while True:
        #left and right are the current bounds; the maximum is between them
        if abs(right - left) < absolutePrecision:
            return (left + right)/2

        leftThird = left + (right - left)/3
        rightThird = right - (right - left)/3

        if f(leftThird) < f(rightThird):
            left = leftThird
        else:
            right = rightThird
{% endhighlight %}
