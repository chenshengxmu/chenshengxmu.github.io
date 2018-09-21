---
layout: post
title: Tutorial- How to Install the New Cydia for iOS 4.2
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/12/cydiatransparent.png)
* Cydia was recently updated to support Apple’s updated API’s in iOS 4.2. This particular Cydia update was quite the major overhaul, and there is no option available (yet) within Cydia to update to the newest version automatically.
* Besides iOS 4.2 support, there are several long-awaited improvements in this version of Cydia.
* The most noticeable improvement in this update is a huge performance boost throughout the whole application. Everything is faster. Once Cydia does the initial restructuring and downloading after you first install the update, you should notice an immediate boost in speed as you navigate the app. That means less of the dreaded loading wheel and more of actually accomplishing what you want to do…
* Owners of 3GS and below iPhone models should notice an even more drastic increase in performance and speed. The older your device is, the more painfully slow Cydia can be. This update should be a nice breath of fresh air.
* Besides overall speed, there have been a couple slight interface changes as well in this update. An improvement has been made to the way the app handles queuing files. There is a “Continue Queuing” option now available below the list of changes to be made to a file. Previously, users would have had to select the “Cancel/Queue” button then select the “Continue Queuing” option. While not that big of a deal, it stills helps speed up what was the commonly slow performance of Cydia.
* The “Changes’ section of the app has also received some attention. Prior to this update, a package would only surface in the Changes section when there was an update available. Now all packages remain in the Changes list, so you can see all of the updates that you’ve installed along the last time you updated a package. The red and green badges actually work again, too. (Since iOS 4, badges in the Changes section had not been working.)
* The new Cydia is version 1.0.3366-1. (The last version was 1.0.3222-73.)
* There are several options for manually installing this Cydia update. I will walk you through two of them so that you have options.
* Again, I can not stress enough the fact that you need to make sure you are backed up before you try something like a manual install. You just never know what could happen.
* What you’ll need: Safari Download Manager and iFile from Cydia
* Step 1: Download the new Cydia package from here on your iPhone using Safari Download Manager
* Step 2: Once the file has downloaded, navigate to var/mobile/Media/Downloads in iFile
* Step 3: Tap cydia_1.0.3366-…phoneos-arm.deb, then “Installer” (The .deb should install rather quickly.)
* Step 4: When the install is done, close iFile and do a full reboot of your iPhone.
* That’s it! Enjoy the new Cydia.
* What you’ll need: Some type of way to FTP into you iPhone (I recommend iPhone Explorer) and the updated Cydia .deb file
* Step 1: Open up your iPhone’s filesystem on your desktop
* Step 2: Navigate to the folder /private/var/root/Media/Cydia/AutoInstall (If you don’t have the Cydia or AutoInstall folders, you just need to create them. They are case sensitive.)
* Step 3: Drag and drop the cydia_1.0.3366-1_iphoneos-arm.deb file that you downloaded into the AutoInstall folder
* Step 4: Do a full reboot of your iPhone
* That’s all there is to it. You should now have the updated Cydia.
* There you have it, two easy ways to manually update to the newest version of Cydia.
* You can double check to see if you are running the newer version of Cydia by scrolling to the bottom of the app’s home page and looking at the Cydia version number right above your iPhone’s UDID. If it still shows the old version number, you didn’t install the update right.
* There have been reports that this newer version isn’t working on 3.x firmware. It appears that saurik hasn’t ported the new Cydia to work with 3.x FW yet. However, some people have said that it works just fine, so perhaps people haven’t been installing it correctly.
* If you tried installing the update on 3.x FW and it didn’t work, or if something went wrong for a different reason, download the old Cydia .deb file. (1.0.3222-73) Simply read the instructions above to put this file back in the AutoInstall folder to install. Make sure to delete the new .deb file if you need to reverse back.
* Thanks go to saurik and chpwn, as well countless other contributors, for this Cydia update. Hopefully you were able to install it easily enough.
* If you’ve had any problems either installing or using the new Cydia, let us know in the comments. What do you think about the changes made? Have you noticed a performance boost?

