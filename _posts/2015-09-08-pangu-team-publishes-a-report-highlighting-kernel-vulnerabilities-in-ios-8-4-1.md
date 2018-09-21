---
layout: post
title: Pangu team publishes a report highlighting kernel vulnerabilities in iOS 8.4.1
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/Pangu-iOS-8-icon.png)
* Pangu team member, windknown, has posted a report on the official Pangu blog outlining several vulnerabilities in iOS 8.4.1, the latest public iOS firmware for iPhones and iPads.
* The writeup, entitled iOS 8.4.1 Kernel Vulnerabilities in AppleHDQGasGaugeControl, highlights three different bugs found in iOS 8.4.1: a stack overflow bug, an out-of-bound memory access bug, and a heap overflow bug.
* Here is what windknown had to say about the found vulnerabilities:
* When auditing iOS kernel executable, we found that the code quality of com.apple.driver.AppleHDQGasGaugeControl is very bad. In this blog, we will disclose 3 vulnerabilities in this kernel extension on the latest public iOS (version 8.4.1). More importantly, one of these bugs is a perfect heap overflow vulnerability that allows us to defeat all kernel mitigations and gain code execution in the kernel, just by exploiting this single vulnerability.
* Fortunately, it looks as if Apple is already well aware of some of the bugs, as two of them are fixed in the latest iOS 9 beta.
* It’s a enlightening report that’s fairly easy to follow even if you’re not a hacker or programmer. Windknown does a good job of explaining the particulars of each of the three vulnerabilities.
* Although the days of iOS 8 are numbered, this type of research tells me that hackers are still very much engaged in the various security research needed to accomplish a future jailbreak down the line.
* It’ll be interesting to see how things go once iOS 9 is released to the public.
* Source: Pangu blog

