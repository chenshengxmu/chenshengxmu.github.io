---
layout: post
title: How to Uninstall Unstable Apps When Cydia Won’t Open
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/springboard_crash.jpg)
* Sometimes we install apps out of curiosity only to discover that they are unstable on our device. In some cases, it’s an app developed for a specific iPhone or iPad model. In other cases, the app is only compatible with certain firmware versions. Other times you may have installed conflicting tweaks.
* Whatever the reason may be, here is a fix for a constantly crashing Springboard with no way to open Cydia to uninstall unstable apps. If your iPhone boots to the lock screen, but crashes if you do anything beyond that, this guide will help you to remove problematic packages without Cydia.
* This is a last resort to uninstalling apps when Cydia won’t open. If Cydia loads, try to uninstall there first before resorting to this.
* There are a few things that you need in order to make this happen. First, you need to have OpenSSH installed. Second, you need to remember the last package(s) that you installed before the problem occurred. If you just installed multiple apps, you’ll probably need to go one by one (or all at once) to remove the unstable package.
* Navigate your web browser to http://modmyi.com/cydia/search.php and search for the name of the app.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/Screen-shot-2011-01-23-at-11.15.21-AM.png)
* Click the correct link in the search results, and you’ll find yourself at the modmyi package information page for that app. Look for the Identifier field and copy it down.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/Screen-shot-2011-01-23-at-11.20.01-AM.png)
* Now, go to SSH into your device from a Terminal prompt (ssh root@iphone-network-address) and run the command apt-get update. Once it completes, enter the command apt-get --purge remove identifier (where identifier is the field you copied in the previous step, i.e. net.limneos.sbrotator) and hit enter. Then type respring and hit enter.
* Once you finally get rid of the unstable package, your iPhone will be usable and function as normal.
* Does this help anyone?

