---
layout: post
title: How to change the default name of screenshots on Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/02/Mac-Tips-banner.jpg)
* When you take a screenshot on your Mac, macOS will by default name the file “Screen Shot Date Time” where “Date” and “Time” are the actual date and time when the screenshot was taken. This makes for long file names that aren’t necessarily helpful. If like me you want to have more control over that file name, then read on as I show you how to change the default name of screenshots on Mac.
* Step 1: Launch Terminal.
* Step 2: Copy/paste or enter this command line, and replace “iDB” with whatever you see fit. Hit Enter when done.
* defaults write com.apple.screencapture name "iDB"
![img](http://media.idownloadblog.com/wp-content/uploads/2015/04/Change-name-of-screenshot-e1429203361487.jpg)
* Step 3: Copy/paste or enter the following command line, followed by Enter.
* killall SystemUIServer
* Whenever you take a screenshot, the default name of that file will be replaced with whatever you chose.
* Note the date and time will still be appended to the file name, but if you want to get rid of that too, make sure you check out how to remove date and time from screenshots file names.
* Mastering screenshots on Mac:
* Is there something you want to learn how to do on your Mac or iOS device? Email help@iDownloadBlog.com and we’ll do our best!

