---
layout: post
title: Tutorial- The Easiest Way to Enable HD Video Recording on the iPhone 3GS
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/11/iPhone-3GS-HD-Video-600x391.png)
* We recently linked to a Cydia app that was rumored to enable HD video recording on the iPhone 3GS. Apparently, that app didn’t work. There is, however, an easy way to enable HD recording through some file modifications on your iPhone 3GS.
* The 3GS has had the ability to shoot in HD since it was released. Apple, for whatever reason, places a software limitation on the 3GS video recording capabilities. The ARM Cortext processor inside the 3GS is more than capable of handling 720p video encoding. I’m going to walk you through the easiest way to enable HD video recording on your 3GS…
* This is a jailbreak tweak. There is a way to perform this exact tweak by installing .deb files via SSH in Terminal, but I found a nifty little application that will make the process a bit easier.
* Before we begin, here are some things you should be made aware of:
* There were originally complaints that this tweak caused the 3GS camera to be sluggish in low-light situations. You were also unable to playback the HD video on the device itself. This issue seemed to be related to the resolution that the tweak was originally set at.
* The original file tweaks sets the Camera.app to record at 1080×800. Since then, updated file tweaks have been released that set the encoding resolution to 960×720, which seems to fix the problem in most cases. Hopefully a new update will be released that allows for a higher resolution without slowing down the 3GS camera.
* Also, there have been rumors of a SBSettings toggle coming out soon for this tweak. We will stay on the look out for that.
* Only iOS firmare 4.1 has been officially tested with this hack.
* The default settings for video encoding on the iPhone 3GS are: 640×480 @ 3Mbps. This bypass allows encoding at 960×720 @ 30fps and at up to 20Mbps.
* What you’ll need for this hack:
* A jailbroken iPhone 3GS. (You have lots of options for jailbreaking: PwnageTool, GreenPoisOn, and LimeRa1n
* A computer running Windows or Mac OS X and a copy of Phone Disk. Phone Disk is a disk mounting tool for iOS devices. The lightweight app is free through December 1st, and offers a 14 day free trial. You plug in your 3GS through a standard USB cable and Phone Disk mounts your device like a drive on your desktop. We will use this to view your iPhone’s file system.
* The afc2add package for enabling USB browsing of your iPhone’s filesystem. You can search for this in Cydia and install it yourself.
* The resolution file tweaks to install through Phone Disk and a backup of the original files (just in case something catastrophic happens). This hack shouldn’t brick your iPhone, but it’s also smart to play it safe and make sure that you are backed up.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/11/phonediskFunctionality-600x112.png)
* Here we go.
* Step 1: Plug your jailbroken, afc2add installed iPhone 3GS into a computer running Phone Disk. Your iPhone should pop up as a mounted drive on your desktop in OS X and as a hardware drive on Windows.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/11/Screen-shot-2010-11-09-at-10.28.54-PM-585x400.png)
* Stept 2: Have the “3GS_HD” folder open and ready in another window.
* Step 3: Navigate in your iPhone’s directory to System/Library/CoreServices/SpringBoard.app and right click the .app file. Then click “Show Package Contents” and drag the “N88AP.plist” file from the “3GS_HD” folder into the Springboard.app directory. You will be asked if you want to overwrite the existing file, click yes. (Remember, you have the backup files in case something goes wrong.)
* Step 4: Navigate back to System/Library in your iPhone’s directory. Scroll down to PrivateFrameworks/Celestial.framework/N88 and in this folder, drag the remaining 3 files from the “3GS_HD” folder (MediaValidator.plist, CameraRollValidator.plist and AVCapture.plist). You will we be asked if you wish to overwrite again, select yes to all.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/11/Screen-shot-2010-11-09-at-10.37.48-PM-585x400.png)
* Step 5: Reboot your iPhone and you’re good to go! Your 3GS should now be shooting video at 960×720.
* If you’re new to navigating file directories like this, or if you’re still having trouble, I put together a little video walkthrough. Hope it helps.
* Remember, you always can replace the files you changed with the backups in the “3GsHDBackup” folder.
* Credit goes to Mike Pan for creating these tweaked files and publishing this process.
* Was this tutorial helpful for you? Is HD video recording on your 3GS even enough of an incentive to perform this hack?

