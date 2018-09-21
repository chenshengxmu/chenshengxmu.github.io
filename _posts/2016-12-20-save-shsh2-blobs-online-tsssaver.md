---
layout: post
title: How to save your .shsh2 blobs automatically online with TSSSaver
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/downgrade-iOS-header-1.jpg)
* A couple of days ago, we covered how to save your .shsh2 blobs manually with tsschecker, and many of you have reported back saying you managed to successfully grab them. However, if you haven’t got them yet and don’t feel tech-savvy enough to mess around with the Terminal commands required, you can try this online tool instead which should save them for you.
* The tool’s source code can be consulted online if you want to examine it, and comes courtesy of 1Conan. It is essentially an online wrapper for tihmstar’s TSSChecker but runs from a website instead of from your computer. Our guide will walk you through using it, and may help you out if you already tried TSSChecker and encountered an error, or if you haven’t the time or know-how for the more complex manual guide.
* 1) Plug your device into your computer and open iTunes.
* 2) Navigate to the connected devices page.
* 3) On this page certain information about your device is visible. We need to make a note of our device’s “ECID”. This can be found by clicking repeatedly on the “Serial Number” field of your device until it appears.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Screen-Shot-2016-12-20-at-18.15.20.png)
* 4) Make a note somewhere of this piece of information. An example “ECID” would be “1234A5678B912”.
* 5) Now, open a browser window and go to the following site: https://tsssaver.1conan.com/
* 6) On this page, fill in the “ECID” field that you noted from iTunes. For “ECID”, you should use the option for “Hex” rather than “Dec”. Then select your device type and model.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Screen-Shot-2016-12-20-at-18.18.13.png)
* 7) Submit the page to save your blobs. The next page that appears will give you a link to download the blobs, as you can see in the image below. I would recommend saving them immediately from the link.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Screen-Shot-2016-12-20-at-17.41.57.png)
* 8) Click on the link to go to the blob download page.
* 9) On the page click “Download ZIP” to save your blobs to your ~/Downloads folder:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Screen-Shot-2016-12-20-at-17.42.13.png)
* 10) Check your ~/Downloads folder for the .zip file, and double-click to unzip it. Inside should be sub-folders for each iOS version, with further sub-folders for each of the five nonces and no nonce. Inside each one of these should be an .shsh2 file.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Screen-Shot-2016-12-20-at-18.04.25.png)
* My example shows a folder for iOS 9.3.5 as that is the only signed firmware for iPad 2, but if you have a newer device you should see a folder for iOS 10.2.
* And that’s it! Remember, the signing window for iOS 10.1.1 will probably close today, so your time is nearly up. I cannot guarantee how much longer you can get those blobs for.
* UPDATE: iOS 10.1 and iOS 10.1.1 are no longer signed. Saving those blobs will no longer work, and you should not try to restore to them anymore.
* The process outlined in this guide will still work for future iOS versions however, and you should continue to save blobs for all iOS firmwares to come as Prometheus should work to move between future firmwares, and you never know which iOS version the next jailbreak will be for.
* One more thing to note is that because this is done remotely it offers no readout or feedback, so it will be up to you to verify that the .shsh2 files save correctly. Check they have non-zero file size and seem otherwise correct. I will not be able to troubleshoot this method as I do not control the tool, and it offers no error reporting. If you do encounter problems, try our previous manual guide, or try seeking help on the guide page.
* Let me know how it goes!

