---
layout: post
title: How to Backup Your Cydia Apps
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/08/Cydia-Apps.png)
* One of the things I really dislike when updating my iPhone to a newer iOS and jailbreaking it, is reinstalling all my jailbreak apps, one by one. This is a long and tedious job, especially if like me, you have a bunch of tweaks and jailbreak apps.
* There is now an easy solution to backup all your jailbreak apps, tweaks, and themes, so you can update your iPhone, jailbreak, and reinstall those apps in no time. Here is how it works…
* This method will save all your packages in a text file, that we’ll move to your computer. After updating and jailbreaking, we will import this text file into your iPhone.
* Step 1: Launch MobileTerminal on your iPhone.
* Step 2: Type the following command: dpkg –get-selections> installed-apps.txt
* Step 3: The previous command line will save a text file in /var/mobile called “installed-apps.txt”. Save this file on your computer via SSH.
* After updating your iPhone to a newer iOS, you will have to jailbreak again and install MobileTerminal in Cydia. Then follow these instructions.
* Step 1: SSH into your iPhone and copy the “installed-apps.txt” file in /var/mobile.
* Step 2: Type the following commands in MobileTerminal
* If you encounter any issue, type the following command: apt-get dselect-fix-missing-upgrade
* Cydia will automatically reinstall all your packages.
* [Kioskea]

