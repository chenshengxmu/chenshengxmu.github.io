---
layout: post
title: How to Fix iBooks on a Jailbroken iOS 5 Device
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/10/ibooks-iOS5-fix.png)
* Yesterday, a book about Steve Jobs was released; perhaps you’ve heard of it?
* Sadly, if you’re an iBooks reader with a jailbroken iOS 5 device, you won’t be doing too much catching up on the late Apple CEO’s affairs, or otherwise.
* That’s because iBooks crashes on iOS 5 devices that are jailbroken, rendering it quite useless. Fortunately, there is a workaround. Check out the video tutorial inside, for an in-depth walkthrough on the fix…
* Granted, this isn’t the end-all solution to the iBooks issue, but it is a nice workaround that’s been tested to work.
* There are a couple issues that I noticed with this fix, but they are easy to overlook and/or workaround if you’ve simply been dying to get iBooks working.
* Tools Needed: iFile (Cydia app)
* Step 1: Uninstall iBooks, and then reinstall iBooks from the App Store. Do not open the app.
* Step 2: Open iFile, and copy iBooks.app from /var/mobile/Applications/(iBook’s folder)/ to /Applications. You can use SBSettings, or just go through each folder to identify the correct iBooks folder. If you don’t have a lot of App Store apps, this should be simple.
* Step 3: Tap on /Applications/iBooks.app/Info.plist and select property list editor. Tap CFBundleIdentifier and change com.apple.iBooks to com.apple.iBooksFix
* Step 4: Exit iFile and Respring.
* Step 5: Delete the original iBooks app (rounded corners) and keep the square iBooks app.
* Step 6: Since you can’t use the iBookstore on device, and you can’t sync with iTunes, upload your .epub files using the methods outlined on the video, dropbox, etc. From there you can open them using iBooks where you will be able to read them.
* There could be other issues, but there are the ones that stand out the most. If you can live with these, then by all means, give it a shot and let us know how you fared in the comments below.
* Special thanks to iDB reader Luke Thompson, for suggesting a fix that works!

