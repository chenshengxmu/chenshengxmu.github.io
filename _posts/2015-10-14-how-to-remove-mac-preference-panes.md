---
layout: post
title: How to manually remove System Preferences panes from your Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/System-Preferences-for-OS-X-Yosemite-app-icon-full-size.jpg)
* Some third-party apps you install on your Mac might nest custom panes within OS X’s System Preferences, mostly those distributed outside the Mac App Store due to sandboxing requirements. Uninstalling such an app automatically removes the underlying pane from System Preferences but not always, leaving you scratching your head.
* Case in point: Tuxera’s MacFUSE, a dynamically loadable kernel extension.
* I needed to mount files to an NTFS-formatted drive the other day so I installed MacFUSE. After removing the app a few days later using its own uninstaller, I noticed its pane in System Preferences was left intact. Should that happen to you, here’s how you can safely remove stubborn System Preferences panes from your Mac.
* I should point out that the method outlined below is to be used only if uninstalling an app through A) OS X’s Launchpad, B) by trashing its icon in the Applications folder and C) by running its uninstaller (if present) doesn’t yield desired results.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/OS-X-El-Capitan-remove-System-Preferences-pane-Mac-screenshot-002.png)
* As you can see above, System Preferences on my MacBook Air show MAcFUSE’s pane even though the app itself has long been uninstalled from my machine.
* Step 1: Launch System Preferences on your Mac.
* Step 2: Located a pane you want to remove and Control-click it.
* Step 3: A menu should pop-up, offering the option to removal option. You might be asked to type in an administrator password to continue.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/OS-X-El-Capitan-remove-System-Preferences-pane-Mac-screenshot-001.png)
* As the screenshots above and below attest, I was able to successfully remove MacFUSE’s misbehaving pane from System Preferences.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/OS-X-El-Capitan-remove-System-Preferences-pane-Mac-screenshot-003.png)
* You cannot manually remove Apple’s stock panes from System Preferences.
* Not sure how to do certain things on your Mac or iOS device? Let us know at help@iDownloadBlog.com and one of our future tutorials might address your problem.

