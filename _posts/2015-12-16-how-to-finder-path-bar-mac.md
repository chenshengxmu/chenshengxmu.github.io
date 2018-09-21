---
layout: post
title: How to use Finders interactive Path Bar on Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/09/OS-X-Yosemite-design-promo-Finder-icon-001.jpg)
* In addition to showing the full path to a file or folder within the Finder windows’ titlebars and copying a file’s path as text via contextual menus in the latest versions of macOS, your Mac has other cool tricks up its sleeve for a more efficient file system browsing.
* Take, for example, the Path Bar, a little-known Finder feature which has been around for ages, since the earliest releases of OS X.
* The Path Bar displays the interactive path to the current working directory at the bottom of all Finder windows. In this tutorial, you are going to learn how to show or hide the Path Bar and use it like a pro to navigate your Mac’s file system more efficiently than before.
* Step 1: Create a new Finder window on your Mac by clicking the hard drive icon or the Finder icon in the Dock. You can also choose New Finder Window in the Finder menu.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-El-Capitan-Finder-Path-Bar-Mac-screenshot-006.jpg)
* Step 2: In the View menu, choose Show Path Bar, or hit the Option (⌥)-Command (⌘)-P keystroke. To hide the Path Bar, choose Hide Path Bar in the View menu.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-El-Capitan-Finder-Path-Bar-Mac-screenshot-007.png)
* As evidenced on the screenshot, the Path Bar should appear at the bottom of all current and new Finder windows by default. Even better, the Path Bar gets shown regardless of your preferred view mode (Icons, List, Columns or Cover Flow).
* Obviously, the Path Bar automatically updates itself with the current path as you navigate your Mac’s file system. The Path Bar isn’t just for showing off: you can interact with file system elements directly from it.
* For instance, drop an item onto a specific item within the Path Bar to move the file to that location. If you want to copy the file instead, simply hold the Option key before releasing the mouse button. As shown below, I dragged the image file from my desktop and dropped it onto the Downloads folder shown within the Path Bar.
* This is extremely handy if you’re several levels deep in the Finder and need to copy or move an item into a folder within your path without opening another window.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-El-Capitan-Finder-Path-Bar-Mac-screenshot-003.jpg)
* But what if you’re so deep in the file system that your current path no longer fits within the Path Bar? Well, the Finder is smart enough to truncate items within the Path Bar while ensuring that both the starting and currently browser folder are always visible.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-El-Capitan-Finder-Path-Bar-Mac-screenshot-004.png)
* If you hover the mouse over a truncated item within the Path Bar, its name gets expanded temporarily to give you a sense of where exactly you are in the file system. As illustrated below, the Application Support folder shown within the Path Bar is instantly expanded upon hovering over it.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-El-Capitan-Finder-Path-Bar-Mac-screenshot-005.png)
* I find these auto-expanding Path Bar items to be very functional.
* For instance, I can move the mouse pointer across the Path Bar while dragging a file and watch the truncated folder names expand before dropping the file into one—without needing to enlarge the Finder window itself.
* Do you find the Path Bar too distracting because it always shows the full path relative to the root disc? No problem, you can set it to be relative to your user account’s Home directory with the following Terminal command:
* defaults write com.apple.finder PathBarRootAtHome -bool TRUE;killall Finder
* So instead of the cluttered Path Bar like this…
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-El-Capitan-Finder-Path-Bar-Mac-screenshot-008.png)
* …you get a more streamline one relative to your home directory, like this.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-El-Capitan-Finder-Path-Bar-Mac-screenshot-009.png)
* To revert to the default Path Bar, execute the following Terminal command:
* defaults delete com.apple.finder PathBarRootAtHome;killall Finder
* If you have found these tricks useful, do share your thoughts and tips of your own in the comment section below. We’d appreciate it if you could pass this article along to your friends and Mac support folks and share it on social media.
* You can send us your tutorial submissions at tips@iDownloadBlog.com.

