---
layout: post
title: How to use a passcode with the iOS 8.x jailbreak
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/10/iOS-8-Jailbreak-passcode-fix-cydia-substrate.jpg)
* At this point in time, running Cydia on a jailbroken iPhone can still be a bit confusing for users who aren’t always knee-deep in this stuff. One of the biggest issues encountered when running Cydia on a jailbroken iOS 8 device at the moment involves using the passcode and Touch ID.
* After installing Cydia on a jailbroken iOS 8 device, many are reporting that establishing a passcode sends them into a bootloop. I verified that I encountered the same issue.
* Let me just preface this by saying that the problems encountered here are no fault of the Pangu team or of Saurik. This jailbreak is a work in progress, and we’ve been advised that the jailbreak is only for developers at the moment. That said, many of you are adventurous and want to take the plunge as soon as possible; as do I.
* In this video, I share an unsanctioned workaround to the boot loop issue. I show you how to establish a passcode on a device with Cydia and Cydia Substrate installed. I’ve tested this out, and have recorded the entire Cydia installation process for your convenience. Have a look inside for the full tutorial.
* Disclaimer: Although I can verify that this tutorial has worked okay for me, you are doing this at your own risk. This isn’t sanctioned or recommended by Saurik. You are on your own if you do this. I personally recommend waiting for Saurik to release an updated Cydia build, but it’s up to you whether or not you wish to do this.
* Step 1: Jailbreak a clean install of iOS 8.x with Pangu. Avoid enabling any passcode or Touch ID
* Step 2: Open the Pangu app and install OpenSSH
* Step 3: Download iDownloadBlog.zip, which contains the files needed to install Cydia and a patch for the passcode bootloop issue
* Step 4: Connect to your iPhone via CyberDuck (Windows users can use WinSCP)
* Step 5: Drag the two Cydia files to your iPhone’s /private/var/root/ directory
* Step 6: Execute the following command by going to Go → Send Command:
* dpkg --install cydia-lproj_1.1.12_iphoneos-arm.deb cydia_1.1.13_iphoneos-arm.deb
* Step 7: Reboot your device
* Step 8: Navigate to /usr/libexec/cydia/ and overwrite the move.sh file with the patched move.sh file included in the iDownloadBlog.zip file that you downloaded in step 3
* Step 9: Reboot your device
* Step 10: Open Cydia and perform any updates that are available (you may be asked to reboot upon installation)
* Step 11: Open Cydia and install Activator (to test). This will install all of the needed Substrate files as well
* Step 12: Add a passcode to your device via Settings → Passcode
* Step 13: Reboot your device
* If you device rebooted without a reboot loop, congratulations! You just installed Cydia and used a passcode.
* Sound off with your thoughts and tips in the comments below. Special thanks to Clayfreeman for the move.sh patch.

