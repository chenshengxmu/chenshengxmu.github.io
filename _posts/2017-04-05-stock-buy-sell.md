---
layout: post
title: Stock Buy Sell to Maximize Profit
---
```java
void stockBuySell(int[] price, int n)
{
    if (n == 1)
    {
        return;
    }
    int count = 0;
    int i = 0;
    ArrayList<Integer> buy = new ArrayList<>();
    ArrayList<Integer> sell = new ArrayList<>();
    while (i < n-1)
    {
        while (i < n-1 && price[i+1] <= price[i])
        {
            i++;
        }
        if (i == n-1)
        {
            break;
        }
        buy.add(i);
        i++;
        while (i < n && price[i] >= price[i-1])
        {
            i++;
        }
        sell.add(i-1);
    }
    for (int j = 0; j < buy.size(); j++)
    {
        System.out.println("buy@" + buy.get(j));
        System.out.println("sell@" + sell.get(j));
    }
}
```
