---
layout: post
title: How to sideload f.lux on your iPhone or iPad with Xcode 7
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/11/iPhone-flux-sideload-iOS-9.jpg)
* The folks over at f.lux have released a sideloadable version of their popular utility for all iOS devices running iOS 9. The utility, which was once limited to jailbroken iPhones, can now be installed on any iOS 9 device, even the new iPad Pro, without a jailbreak.
* f.lux is a utility that allows your iPhone to automatically adjust the screen temperature according to the time of day. It’s a utility that I use every day on my Mac, and it makes working on my computer in a dark environment much easier on my eyes. The same premise applies to iOS devices as well.
* Would you be interested in using f.lux on your iPhone? Check out the full tutorial inside.
* Step 1: Download the flux for iOS Xcode project
* Step 2: Open the Xcode project, and use our sideloading tutorial for iOS 9 to sideload f.lux on your device
* Note: Under Targets →  iflux →  General →  Identity, add a word to the end of the Bundle Identifier to make it a unique name.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/11/side-load-f.lux-Xcode.png)
* Change the Bundle Identifier to something unique. I just added “jeff” to the end.
* Once you sideload f.lux, you may need to allow the app via Settings → General → Profile → Your Apple ID. You’ll also need to enable Locations and Notifications once you actually launch the f.lux app.
* Be sure to visit the official f.lux website for their own verbose tutorial for more information.

