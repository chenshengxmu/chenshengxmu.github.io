---
layout: post
title: How to remove date and time from screenshot file names on Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/04/Remove-date-time-screenshot.jpg)
* By default, every time you take a screenshot on macOS, the file generated will be named “Screen Shot date time” where “date” and “time” are replaced with the actual date and time the screenshot was taken. For most people, this is a useful feature as it allows to quickly sort screenshots depending on when they were taken. But for other people, it might be an annoyance.
* In this post, we will show you how to remove the date and time from screenshots that were taken on Mac.
* Step 1: Launch Terminal.
* Step 2: Type in or copy/paste the following command then hit Enter:
* defaults write com.apple.screencapture "include-date" 0
![img](http://media.idownloadblog.com/wp-content/uploads/2015/04/Terminal-remove-date-time-screenshot.jpg)
* Step 3: Type in the following command and press Enter when done:
* killall SystemUIServer
* Done! Now the date and time will not show on the screenshot name every time you take a screenshot.
* Should you want to reverse this, follow the same instructions, except that you replace “0” with “1” in the first command line.
* Note that if you take a succession of screenshots, the files will be numbered accordingly, so you’d get something like Screen Shot, Screen Shot 1, Screen Shot 2, etc as file names.
* More screenshot tips:

