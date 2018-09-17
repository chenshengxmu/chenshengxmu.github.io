---
layout: post
title: iOS 12 prevents screenshots and Lock screen camera access upon restart
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/06/ios-12.png)
* In a move that probably has to do with improving user privacy and elevating device security, iOS 12 prevents taking screenshots and accessing the Camera shortcut from the Lock screen when your iPhone, iPad or iPod touch has just been restarted or turned on.
* You can test this yourself: simply shut down your iOS 12 device and turn it back on.
* You will notice that you cannot take screenshots of the Lock screen and realize that the Camera shortcut is temporarily greyed-out until you authenticate.
* As soon as you’ve authenticated with your passcode or Touch ID/Face ID, screenshot-taking will be reinstated and the Camera shortcut on the Lock screen will become active again. The two features remain accessible without limits if you lock the device, as they should. When the device restarts, iOS 12 will automatically render them inoperable until you re-authenticate.
* There’s no toggles in Settings to adjust this behavior.
* The change appears to increase your privacy and security by, say, preventing a thief from screenshotting your Lock screen after restarting your stolen device. It also helps prevent accidental screenshoots of the Lock screen when you pull your iPhone out of your pocket.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/06/iOS-12-trigger-FAce-ID-scan.jpg)
* I think this is primarily a move to make iOS even more secure.
* The iOS software and hardware were designed with security in mind. The mobile operating system uses full, hardware-accelerated disk encryption to protect your data from prying eyes.
* When a new file is created on an iOS device, it’s assigned a class by the app that creates it. Furthermore, each class uses different policies to determine when the data is accessible.
* When your iPhone or iPad restarts, the encryption keys required for Touch ID or Face ID to unlock the device, as well as the encryption keys that protect user data on the disk, are discarded by the Secure Enclave cryptographic coprocessor.
* This renders all user data on the device inaccessible until the user re-authenticates by entering their passcode or unlocks the device using Touch ID or Face ID.
* You can observe the effects of this protection mechanism if you receive a text from someone in your Contacts after the device has just restarted but you haven’t authenticated yet.
* Because you haven’t yet unlocked your iPhone or iPad, user data on the disk is unreadable. As a result, the Phone app cannot access your Contacts data and match the number to the caller.
* I think this is exactly what’s going on here.
* iOS 12 probably tightens up security by making additional items, including the Photos database, completely inaccessible after the device restarts or has been turned on. This is probably why you cannot take screenshots of the Lock screen or use the Camera shortcut before authenticating—with the disk still fully encrypted, screenshots or images taken with the camera simply cannot be saved in the Photos database on the disk.
* Does that make any sense to you?
* Let us know by sharing your thoughts with fellow readers in the comments down below.

