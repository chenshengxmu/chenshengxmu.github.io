---
layout: post
title: iOS 10 tidbit- warning message when launching apps that arent 64-bit compliant
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/iOS-10-64-bit-warning-space-gray-iPhone-screenshot-001.png)
* In April 2015, Apple reminded developers that as of June 2015 all apps and app updates submitted to the App Store must include 64-bit support. After more than a year, some apps are still stuck on 32 bits and lack support for 64-bit devices. iOS 10 takes a naming and shaming approach by including a brand new warning message that appears when you open a 32-bit app on a 64-bit iPhone, iPad or iPod touch.
* “This app has not been updated to 64-bit,” reads the prompt iOS puts up when launching an app that isn’t 64-bit compliant. ”Using it may affect overall system performance.”
* The user must tap OK to dismiss the dialog and continue using the app. The prompt appears every time the app is launched, not just on first run. For those wondering, all iOS devices with the A7 or newer processor are 64-bit, including every iPhone and iPad from the respective iPhone 5s and iPad Air models onward.
* You may be wondering why 32-bit apps affect iOS performance when launched on a 64-bit iOS device. Well, on a 64-bit iPhone, iPad or iPod touch 64-bit versions of the iOS kernel, libraries and drivers are loaded by default. But when you launch a 32-bit app that lacks 64-bit support, iOS is forced to load 32-bit versions of those libraries into memory, leaving less memory for your apps.
* In Apple’s own words, “when iOS is executing on a 64-bit device, iOS includes separate 32-bit and 64-bit versions of the system frameworks”. When all apps running on the device are compiled for the 64-bit runtime, iOS never loads the 32-bit versions of those libraries, which means that the system uses less memory and launches apps more quickly.
* “Because all of the built-in apps already support the 64-bit runtime, it is to everyone’s benefit that all apps running on 64-bit devices be compiled for the 64-bit runtime, especially apps that support background processing,” Apple told developers.
* Even apps that are not performance sensitive gain from this memory efficiency.
* “As a reminder, beginning June 1, 2015 app updates submitted to the App Store must include 64-bit support and be built with the iOS 8 SDK,” advised the firm in its April 2015 email blast to developers.
* Apple’s transition guide details porting apps to 64-bit architecture, taking advantage of Xcode which is capable of compiling app binaries that run on both 32-bit and 64-bit devices.

