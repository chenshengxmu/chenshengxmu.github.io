---
layout: post
title: How to show hidden files and folders on Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/01/Mac-OS-X-Tips.png)
* Some people like to know everything that is on their computer. Admittedly, I was one of these people many moons ago, when I was a Windows user. I would always make sure that Windows Explorer would show all hidden files and folders. I’m not sure why, but I liked it this way.
* These days, I’m quite the opposite, as I like to see as little files and folders as possible on my Mac. But I understand some people out there have the desire to see all those files and folders, for whatever reason that may be.
* In this post I will show you how to show hidden files and folders in Finder on your Mac…
* If you use any recent version of OS X or macOS, follow these steps to show hidden files in Finder:
* 1) Launch Terminal.
* 2) Copy/paste or type in the following command
* defaults write com.apple.finder AppleShowAllFiles -boolean true ; killall Finder
![img](http://media.idownloadblog.com/wp-content/uploads/2014/08/show-hidden-files-on-mac.jpg)
* 3) You should now see hidden files and folders in Finder.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/08/view-hidden-files-and-folders-on-mac.jpg)
* Follow these steps if you want to hide the files and folders you previously revealed. Note this works with OS X Mavericks and Yosemite.
* 1) Launch Terminal.
* 2) Copy/paste or type in the following command
* defaults write com.apple.finder AppleShowAllFiles -boolean false ; killall Finder
![img](http://media.idownloadblog.com/wp-content/uploads/2014/08/hide-hidden-files-on-mac.jpg)
* 3) All hidden files that you have revealed should now be hidden again.
* If you use OS X 10.8 and prior, use these command line instead:
* 1) Launch Terminal.
* 2) Copy/paste or type in the following command
* defaults write com.apple.finder AppleShowAllFiles TRUE ; killall Finder
* If you want to hide the files and folders again on a machine running OS X 10.8 and prior, follow these steps:
* If you use OS X 10.8 and prior, use these command line instead:
* 1) Launch Terminal.
* 2) Copy/paste or type in the following command
* defaults write com.apple.finder AppleShowAllFiles FALSE ; killall Finder
* As always, feel free to ask any question in the comments section below.

