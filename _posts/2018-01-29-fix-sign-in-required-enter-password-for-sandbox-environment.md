---
layout: post
title: Fix- Sign-in required. Enter password for Sandbox Environment
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/Sign-in-required-Enter-password-for-Sandbox-Environment.jpg)
* This post will have limited appeal to the vast majority of iDB readers because it addresses a very specific issue, but I figured I had to put it out there to help those who encounter it.
* This issue, illustrated in the screenshots above, has to do with in-app subscription testings of apps in beta in TestFlight. If you ever make the mistake of testing the in-app subscription mechanism of an app using your personal Apple ID, you may be plagued for months with a popup saying Sign-in required. Enter the password for xxxxx.com. [Environment: Sandbox].
* It seems that no matter how many times you enter your password, the popup eventually comes back to haunt you times and times again.
* There’s actually hundreds of online threads relating this exact issue. Apple itself is well aware of it, but it’s probably not high enough on their priority list to get it fixed at this time. That’s a shame.
* During the development of the iDB app, it seems that we were finally able to find one way to put an end to it. It’s inconvenient for sure, but ever since doing this, I haven’t had the popup show on my device again.
* At this point, you can install TestFlight and beta apps again. However, if you have to keep testing that specific app with in-app subscriptions, it is highly recommended that you do that on a test device using a test Apple ID. Make sure not to use your personal Apple ID again!

