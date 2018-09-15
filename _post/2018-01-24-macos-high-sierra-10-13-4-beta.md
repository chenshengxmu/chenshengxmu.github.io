---
layout: post
title: macOS High Sierra 10.13.4 developer beta brings 32-bit app warning & 64-bit testing mode
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/macOS-High-Sierra-desktop-MacBook-Pro.jpg)
* Apple on Wednesday released macOS High Sierra 10.13.4 for developer testing.
* The fourth major software update since High Sierra’s initial release in September 2017 came with a build number of 17E139j and no new outward-facing features or enhancements.
* However, Apple did mention one major addition in release notes accompanying the download: a brand new warning when a 32-bit app is launched, not unlike the similar dialog in iOS 11.
* The Cupertino giant informed customers and developers last summer that High Sierra would be its last release to support 32-bit apps “without compromise.” All Mac app updates and existing apps must support 64-bit starting June 2018, the company clarified.
* Here’s an excerpt from the macOS High Sierra 10.13.4 beta changelog:
* To prepare for a future release of macOS in which 32-bit software will no longer run without compromise, starting in macOS High Sierra 10.13.4 a user is notified on the launch of an app that depends on 32-bit software.
* The alert appears only once per app.
* To make it easier for developers to test their software for 64-bit compatibility, macOS 10.13.4 provides a new 64-bit testing mode enabled through the following Terminal command:
* sudo nvram boot-args="-no32exec"
* After executing the command, you must restart your Mac.
* This new 64-bit test mode prevents any 32-bit processes from launching.
* Opening a 32-bit app or a 64-bit app that depends on 32-bit frameworks produces a notification saying the app cannot be opened. You’re strongly discouraged from enabling this mode unless you’re an experienced software developer or IT administrator.
* Other types of software may fail silently in this mode, such as 32-bit versions of Dashboard and WebKit plugins, preference panes and background processes.
* To disable this mode, execute the following command in Terminal, then restart your Mac:
* sudo nvram boot-args=“”
* “In future beta releases, 64-bit test mode may provide additional information for the developer to help test and qualify software,” notes Apple.
* “If you distribute your apps outside Mac App Store, we highly recommend distributing 64-bit binaries to make sure your users can continue to run your apps on future versions of macOS,” the Cupertino company told developers back in summer 2017.

