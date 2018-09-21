---
layout: post
title: How to find your Macs Bluetooth version
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/Bluetooth-logo-large.png)
* With the recent release of Apple’s new “Magic” devices—the Magic Trackpad 2, Magic Mouse 2, and the Magic Keyboard—some of you may be wondering if your Mac can support these new peripherals. Since all of the new Magic devices are wireless and work with the latest Bluetooth versions, it’s important to know if your Mac will support them before making a purchase.
* Apple doesn’t exactly make it easy and straightforward to find what version of Bluetooth your Mac sports, but it can be done. In this post, we’ll show you a simple method for quickly deriving your Mac’s Bluetooth version in just a few steps.
* Step 1: Click the Apple Menu → About This Mac → System Report
* Step 2: Under the Hardware disclosure triangle, select Bluetooth
* Step 3: Under Hardware, Features, and Settings, find LMP Version and denote its value.
* Now that you have the LMP version, which stands for Link Manager Parameter, it’s time to cross reference it with the official Bluetooth spec:
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/LMP-Spec-Bluetooth.png)
* As you can see, Bluetooth 4.0 = 6. So an LMP Version of 0x6 would denote a Bluetooth chip with a Bluetooth 4.0 core specification. In other words, if you see LMP Version 0x6, you have Bluetooth 4.0.
* By the way, here’s mine:
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/System-Report-Bluetooth-Mac.png)
* Bluetooth 4.0, confirmed. Now check yours out, and report back with your version of Bluetooth in the comments.
* As pointed out by Jordi in the comments, you can also find your Bluetooth version via the Terminal:
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/LMP-Version-Terminal-Bluetooth.png)
* Here is the command: system_profiler -detailLevel full SPBluetoothDataType | grep "LMP Version" I added ” Version” so that it wouldn’t pull in the Subversion, which isn’t needed for this exercise.

