---
layout: post
title: How to hide mounted volumes from your desktop and the Finder
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/Hide-drives-Finder-Header.png)
* We’ve already covered how to completely prevent partitions from mounting under macOS but, as one iDB reader pointed out, sometimes you want a partition mounted and ready to use but still want the benefit of it not cluttering up your desktop and the Finder sidebar.
* The example our reader enquired about was Time Machine, and that really is a perfect case in point. Many people want their Time Machine partition constantly mounted and backing up throughout the day but don’t need it to be visible at all. Finder’s preferences allow for hiding all volumes from the desktop but offer no control on a volume-by-volume basis, and though drives can be manually removed from the Finder window sidebar, this is an inelegant extra step and the drives still show elsewhere.
* Luckily, there is a way to leave specific volumes mounted whilst hiding them from both the desktop and the entirety of the Finder in one fell swoop.
* Note that while the volume we will use to illustrate this method is a Time Machine drive, the process will work to hide any volume, not just Time Machines.
* 1) Ensure the volume that you want to hide is mounted and visible in the Finder.
* 2) Make a note of the chosen name of your volume, for example “Time Machine”, or “Storage”.
* 3) Launch Terminal from /Applications/Utilities, or via Spotlight.
* 4) Type the following command into Terminal, replacing “Drive Name” with the name of your own volume which you noted earlier (keep the quote marks):
* sudo SetFile -a V /Volumes/"Drive Name"
* 5) Enter your password when prompted.
* 6) In Terminal, type:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/TM-2.png)
* killall Finder
* Your volume should now have disappeared from the desktop. However, it is still mounted. To verify this, open Disk Utility from /Applications/Utilities or via Spotlight and confirm that it is not greyed out in the sidebar. In the case of a Time Machine you can also tell the volume is still mounted by performing a backup with the volume hidden; I use the menu bar icon to check that this is working.
* As you can see from the above screenshot, the Time Machine volume is no longer on the desktop, but is still shown as mounted in Disk Utility. The Time Machine Menu Bar icon is showing a backup in progress, as we would want.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/TM-3.png)
* In the case of accidentally hiding the wrong volume or simply wanting to undo your changes, follow this procedure:
* 1) Ensure the volume that you want to make visible is mounted, using Disk Utility.
* 2) Make a note of its name, for example “Time Machine”, or “Storage”.
* 3) Launch Terminal from /Applications/Utilities, or via Spotlight.
* 4) Type the following command into Terminal, replacing “Drive Name” with the name of your own volume which you noted earlier (keep the quote marks):
* sudo SetFile -a v /Volumes/"Drive Name"
* Note the lower-case “v” in this command as opposed to the upper-case in the hiding command. This is the attribute controlled by “-a”; “V” means “invisible”, and “v” means “visible”.
* 5) Enter your password when prompted.
* 6) In Terminal, type:
* killall Finder
* 7) Ensure that your volume is once again showing on the desktop and in the Finder sidebar.
* Though I personally use this command solely for a Time Machine volume as I tend to access all other mounted volumes frequently, its use seems justified for this case alone, and others will definitely have wider use for it. It certainly makes for a cleaner desktop and Finder for those who like to have finer control over their set-up.
* Was this article helpful? Are there any volumes beside Time Machine that you always want mounted and invisible? Let me know in the comments.

