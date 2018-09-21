---
layout: post
title: Rename the cells in your Settings app with DopeSettings
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/11/iPhone-Settings-Icon-Banner.jpg)
* While perusing the Changes tab in Cydia this week, I happened upon a new free jailbreak tweak called DopeSettings by iOS developer ARX8x. When I installed it, I nearly spit my morning coffee back out on my keyboard because I busted out laughing.
* Right out of the box, DopeSettings renames a handful of your Settings app’s preference pane cells to a plethora of hilarious alternative phrases; like so:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/11/DopeSettings-Prefs.jpg)
* For the most part, the developer’s default naming scheme is funny enough, but if you feel like changing one or more of the names, DopeSettings permits you to do that.
* According to the developer, you can do this by navigating to /private/var/mobile/Library/Preferences/xyz.xninja.dopesettings.plist with a filesystem browser (such as Filza) and opening the .plist file:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/11/DopeSettings-PLIST-1.jpg)
* Once opened, look for the string field of the item you want to change and rename it to what you want to be displayed in the Settings app. Remember to leave the key fields alone, as the tweak uses them to identify the specifier for each section. Modifying the key field against the developer’s recommendation could break the tweak’s normal function.
* This is an example of what a key-value pair looks like from inside the file:
* Change the string field of the object you want to customize to whatever text you want:
* To reset a value back to its default, just make the string field empty, like so:
* Be sure to respring your device after making changes to ensure they take effect. You may even need to force-quit the Settings app from the App Switcher and restart it to see your changes.
* If you like customizing things and want to try DopeSettings out for yourself, then you can get it for free from Cydia’s BigBoss repository. The tweak works on all jailbroken iOS 10 devices.
* What do you think about DopeSettings? Let us know in the comments section below.

