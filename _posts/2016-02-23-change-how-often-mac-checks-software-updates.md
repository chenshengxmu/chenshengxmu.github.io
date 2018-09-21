---
layout: post
title: How to change how frequently your Mac checks for software updates
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/The-Mac-App-Store-Is-a-Free-Download-through-Software-Update-Apple-Confims-2.jpg)
* Apple used to let you configure the frequency at which your Mac would check for updates via the System Preferences app, but recent macOS releases have done away with that. Instead, your Mac automatically looks for software updates, whether they’re for macOS or your Mac App Store apps, on a weekly basis.
* If you’re interested in changing how often your Mac checks for software updates, you’ve come to the right place. In this tutorial, we’ll be showing you how to change the frequency that your Mac looks for software updates and notifies you of them so you can more easily stay up to date with the latest bug fixes, security improvements, and new features among other things.
* Since your Mac is configured to look for updates in the Mac App Store on a weekly basis, that means you could go up to 6 days, 23 hours, 59 minutes, and 59 seconds before you actually get a notification of a software update since the last time your Mac did an update check.
* This can be scary if you’re wary like I am and like keeping your system up to date with the latest security fixes. It’s also a disappointment when you’re not immediately notified of updates when you like to be on top of new features and bug fixes that improve performance in your favorite apps.
* For these reasons, as well as many others, you might want to change the frequency that your Mac checks for software updates. It isn’t difficult, and checking once a day instead of once a week won’t take a major toll on battery life. It especially won’t be a problem if you’re using a desktop that has an unlimited power source.
* In previous versions of OS X, such as Snow Leopard and Lion, Apple had a preferences pane in the System Preferences app that was dedicated to software updates. It allowed users to simply point and click on the update check frequency they wanted to have for their Mac:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/software_update_01-269299.jpg)
* Software Update preference pane as provided on earlier versions of OS X.
* Unfortunately, all OS X versions later than Lion have added a preferences pane to the System Preferences app for the App Store, which is much more oriented around third-party software and offers less user control. As a result, the frequency for update checks for your Mac are no longer optional and your Mac is configured out of the box to check for updates on a weekly basis:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/mac-app-store-settings-OS-X.png)
* OS X Mountain Lion and later now have an App Store preferences pane instead.
* Fortunately, although the point-and-click setting is gone from the System Preferences app, users can still use a powerful tool in macOS to set their Mac’s update check frequency – the Terminal app. With just a quick command, users can configure the update check frequency to anything that is desired.
* As we mentioned before, your Mac is configured out of the box to check for updates on a weekly basis – that’s once every 7 days. Although you’re probably well aware that there are 7 days in a week, I stress this unit of measure because when you use Terminal to change the update check frequency, you will be changing it based on the number of days, not weeks, that lapse between each check.
* To do this, launch the Terminal app and copy and paste the following command into the Terminal interface.
* defaults write com.apple.SoftwareUpdate ScheduleFrequency -int 1
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/terminal-update-check-frequency-os-x.png)
* Now, replace the number “1” with any number of days you want to lapse between update checks, then press Return on your keyboard. In our case, we left it at “1” to ensure our Mac checks for new updates daily. You can choose “2” if you want it to check every 2 days, or “14” if you want it to check every two weeks; the decision is entirely up to you.
* After you press the Return key, your new settings are written to your Mac’s software update file and will take effect immediately. We recommend restarting your computer after making these changes.
* Now that you’ve configured your Mac to search for software updates on your own terms, you can be sure you’re regularly receiving notifications for software updates on your Mac. Please note that this will only check for the updates – not install them. The only way updates will be installed automatically is if you’ve set up your Mac to do so.
* If you found this tutorial helpful, let us know in the comments below.

