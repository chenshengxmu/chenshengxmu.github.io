---
layout: post
title: macOS High Sierra 10.13.2 flaw lets you unlock App Store settings with any password
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/mac-app-store-bug-open-radar.png)
* Anyone with physical access to your Mac with macOS High Sierra 10.13.2 is able to access and change your App Store settings in System Preferences without entering a legitimate password.
* As mentioned in a bug report submitted on Open Radar, a security flaw discovered in the latest commercial release of Apple’s desktop operating system allows the App Store section in System Preferences to be unlocked with any administrator password.
* To reproduce this issue on macOS High Sierra version 10.13.2, log in with an administrator-level account to your Mac and launch System Preferences, then click App Store. Next, hit the padlock icon to lock it, if necessary, then click the padlock icon again. Now enter your Mac account’s user name and any password and click Unlock.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/mac-app-store-preferences.jpg)
* This should be enough to give you full access to App Store settings. Other System Preferences panes can only be unlocked with a correct administrative password. We should also point out that App Store preferences are unlocked by default on administrator accounts.
* As MacRumors explains, the flaw lets anyone with physical access to your computer and administrator-level access to unlock your App Store preferences and change settings like the ability to automatically install macOS updates, app updates, system data files and even security updates that would fix a bug like this one.
* “While the seriousness of unauthorized access to the App Store menu is debatable, the underlying bug allowing a password prompt to be bypassed with any password is obviously unacceptable,” the publication observed.
* The publication couldn’t reproduce the issue on macOS Sierra version 10.12.6, suggesting it only affects public versions of macOS High Sierra. The security flaw also cannot be reproduced on the latest developer beta 4 of macOS High Sierra 10.13.3, suggesting that this upcoming software update already contains a fix for the issue.

