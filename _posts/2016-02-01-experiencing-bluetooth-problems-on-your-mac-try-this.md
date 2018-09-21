---
layout: post
title: Experiencing Bluetooth problems on your Mac? Try this
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/02.gif)
* Bluetooth is just one of the wireless technologies that comes packed into your iOS devices and Macs. It’s used for short-distance data transmission and it’s super low on battery usage, making it a great option for third-party accessories like speakers, mice, headsets, and even the Apple Watch.
* Unfortunately, Bluetooth on the Mac can sometimes be relatively flaky, and when problems occur, there are some troubleshooting steps you can take, which we will talk about in this tutorial.
* Most of the time, the problems you’re going to have with Bluetooth and your Mac are going to involve third-party accessories and apps using Bluetooth to transmit data to and from devices. These problems typically involve connectivity problems, and they’re known even to plague Apple’s own mouse and keyboard accessories.
* I’ve personally heard from app developer after app developer that I’ve worked with about what a nightmare it is to create apps based off of Apple’s Bluetooth system, and after hearing that, it’s not hard to understand why problems might occur.
* Apple’s Bluetooth framework may be due for a much-needed overhaul, but until then, the best we can do is troubleshoot problems as they occur, and try to solve them so we can get back to using our beloved Bluetooth accessories and apps.
* There are various troubleshooting steps you can take to solve connectivity problems between your Mac and your Bluetooth accessories. Below, we’ll outline some of the best ways to tackle Bluetooth issues.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/giphy.gif)
* Indeed this sounds like a broken record, but, have you tried turning it off and on again? You can turn your Bluetooth on and off very easily from the Bluetooth icon in your Mac’s Menu Bar. Simply click on it, and you’ll see an option to “Turn Bluetooth Off” or “Turn Bluetooth On” if it’s already off.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/Screen-Shot-2016-01-30-at-5.25.51-PM.png)
* Once you’ve turned Bluetooth off and on again, see if connecting your Bluetooth accessories works. Sometimes a simple toggle of the Bluetooth radio is all you need.
* If this doesn’t work, take the reboot to an extreme; try rebooting your Mac. Visit the  “Apple” menu in your Menu Bar and select the “Restart…” option to completely restart your computer.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/Screen-Shot-2016-01-30-at-5.29.12-PM.png)
* After booting back up, try to connect your Bluetooth peripherals again and see if that didn’t solve the problem.
* If this didn’t work either, try turning your Bluetooth devices themselves on and off and then try reconnecting them.
* Sometimes Bluetooth issues can arise when files become corrupted due to a system error. It’s not common for files to become corrupted, but sometimes when this happens, the only way to fix it is to delete those files and let macOS create some fresh new ones.
* There are two files that can become corrupted and cause Bluetooth connectivity issues. Getting to them isn’t too difficult; just follow these steps:
* Step 1: Open Finder on your Mac and click on the “Go” menu in Menu Bar, then click on “Go to Folder…”
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/Screen-Shot-2016-01-30-at-5.33.52-PM.png)
* Step 2: In the Go to Folder window that opens up, type in or paste /Library/Preferences and then click on the blue “Go” button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/Screen-Shot-2016-01-30-at-5.34.24-PM.png)
* Step 3: In the new Finder window that opens, locate the com.apple.Bluetooth.plist file, right click on it, and select “Move to Trash.”
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/Screen-Shot-2016-01-30-at-5.34.49-PM.png)
* Step 4: Open the “Go” menu in the Menu Bar once again, and just like before, click on the “Go to Folder” option again.
* Step 5: In the Go to Folder window, delete any text in the text field and type in or paste ~/Library/Preferences/ByHost into the text field and click on the blue “Go” button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/Screen-Shot-2016-01-30-at-5.43.47-PM.png)
* Step 6: When the Finder window opens, locate the com.apple.Bluetooth.xxxxxxxxxxxxxxxxxx file, right click on it, and select “Move to Trash.”
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/Screen-Shot-2016-01-30-at-5.46.16-PM.png)
* Note: This file starts with com.apple.Bluetooth, and the rest of the file will have a random mix of numbers and letters, which is different for everybody. Don’t worry if the seemingly endless list of files looks intimidating – there’s should only be one com.apple.Bluetooth file here, so just find it and delete it.
* Step 7: Now reboot your Mac and your operating system will automatically generate new Bluetooth files when you turn Bluetooth off and on again.
* Apple notes in a support document that Bluetooth devices may become unresponsive on a Mac at times. Sometimes, you can fix this problem by removing all USB devices that may be connected to the Mac, such as USB mice, USB keyboards, USB external hard drives, or USB flash drives, and then reboot the computer.
* Wait two minutes, and then re-attach any of the USB accessories that you may have been using. Doing so may bring responsiveness back to your Bluetooth devices.
* If none of the above have worked, get ready to re-configure all of your Bluetooth accessories, because now you’re going to want to try resetting your Mac’s Bluetooth module.
* To reset your Mac’s Bluetooth module, you’ll need to follow these steps:
* Step 1: Hold down the Shift (⇧) key and the Option key and click on the Bluetooth menu in your Menu Bar on your Mac.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/menu-bar-bluetooth-menu-mac-reset-bluetooth-module-.png)
* Step 2: Go to Debug > Remove all devices and click on it to disconnect from all paired Bluetooth devices.
* Step 3: Now open the same menu once again and click on Debug > Reset the Bluetooth module to reset your Mac’s Bluetooth module.
* Step 4: After resetting your Mac’s Bluetooth module, you can now attempt to re-pair all of your Bluetooth accessories and everything should work as expected.
* After all these steps, your Bluetooth devices should be working again. If they don’t, then it may be time to contact support, whether it’s AppleCare or support for the accessory itself.
* Did these steps help you get your Bluetooth devices back up and running? Let us know in the comments below.
* Top image via Jason Perez (Dribbble)

