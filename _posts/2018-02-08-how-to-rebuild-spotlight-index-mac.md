---
layout: post
title: How to rebuild Spotlight index on your Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/macos-high-sierra-spotlight-search-results-maps.jpg)
* Spotlight, a system-wide macOS feature, allows you to find apps, documents, bookmarks, contacts, emails, items from third-party apps and more, from one central place on your Mac. In order to work properly, Spotlight relies on an indexed database of all the disks and files on your system that you haven’t explicitly excluded from searching.
* When Spotlight is acting up, searching your Mac may not return results you’d expect. If that’s your case, then rebuilding the Spotlight index might help fix your problems.
* Here’s how to spur a reindexation of your Mac’s startup disk.
* 1) Click the System Preferences icon in the Dock.
* 2) Click the Spotlight icon in the System Preferences window.
* 3) Click the Privacy tab in Spotlight preferences.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/macOS_high_sierra_system_preferences_privacy_001.jpg)
* 4) Drag the folder or disk that you want to reindex and drop it on the list of locations that Spotlight is prevented from searching. Since our aim is to initiate the reindexing process on the startup volume, drag the system disk icon from the desktop and drop it on the Privacy tab in the System Preferences window.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/macOS_high_sierra_system_preferences_privacy_002.jpg)
* 5) Click OK to confirm the operation.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/macOS_high_sierra_system_preferences_privacy_003.jpg)
* TIP: You can also click the “+” button near the lower-left corner to select items to add.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/macOS_high_sierra_system_preferences_privacy_004.jpg)
* To add a folder or disk to the Privacy tab, you must have ownership permissions for that item.
* 6) Now remove the disk that you just added by highlighting it in the Privacy tab, then click the “–” button near the lower-left corner to remove the selected item from Spotlight’s exclusion list.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/macOS_high_sierra_system_preferences_privacy_006.jpg)
* 7) Close out the System Preferences window.
* Adding and removing the startup disk from Spotlight’s Privacy tab, then exiting System Preferences, will prompt Spotlight to rescan and reindex the contents of the entire disk. Depending on disk size and the files stored on it, this may take anywhere from a few minutes to several hours. Your Mac may feel a little sluggish during the reindexing process.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/macOS_high_sierra_Spotight_indexing_004.jpg)
* Indexing progress is shown in Spotlight’s overlay
* To see if Spotlight has finished indexing, bring up the Spotlight overlay. If you see a progress bar and a message “Indexing…”,  wait a little more until the indexing process has finished.
* In order to manually cause a reindexation of your drive or folder, open the Terminal app from the Applications/Utilities folder, then paste the following command into the Terminal window:
* sudo mdutil -i on /
* Press Return to execute the command, which will prompt the underlying Spotlight process to begin reindexing the startup volume. Keep in mind that you must provide an administrator password to run this command.
* TIPS: 5 Spotlight tricks for iPhone and iPad
* Apple says that excluding the startup disk from Spotlight will prevent the system from notifying you about pending updates to any Mac App Store apps that are installed on the computer.
* The default Spotlight shortcut is Command (⌘)-Space.
* To set a custom Spotlight shortcut, click Keyboard Shortcuts at the bottom of the Search Results pane or the Privacy pane in Spotlight preferences. As mentioned, you can prevent Spotlight from searching specific locations on your Mac by adding them to the Privacy tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/macOS_high_sierra_system_preferences_privacy_007.jpg)
* Exclude folders you don’t want searched by Spotlight, like your Downloads folder
* For example, I always add my user account’s Downloads folder to Spotlight’s exclusion list. Spotlight always excludes from searches any items you store on your backup disk that are not part of a Time Machine backup.
* TUTORIAL: How to hide the Spotlight icon from your Mac’s menu bar
* Spotlight also makes it easy to get definitions, calculations and unit conversions, find movie showtimes, weather and nearby places, search by file type or location and more.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/OS-X-El-Capitan-System-Preferences-Spotlight-shortcut-Mac-sceenshot-001.jpg)
* Spotlight lets you find files and apps, do quick math, cover currencies and much more
* For those wondering, Spotlight for Mac was announced at the June 2004 Worldwide Developers Conference and released with Mac OS X 10.4 Tiger in April 2005. A similar feature for iOS 3.0 with the same name was announced on March 17, 2009.
* iOS 11 has renamed the Spotlight feature as “Search”.
* If you like this how-to, pass it along to your support folks and leave a comment below.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know via help@iDownloadBlog.com and a future tutorial might provide a solution.
* Submit your how-to suggestions via tips@iDownloadBlog.com.

