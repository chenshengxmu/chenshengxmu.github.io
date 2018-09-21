---
layout: post
title: How to stop your iPhone from asking to install iOS updates
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iOS-OTA-Update.png)
* iOS can download and install updates without the need to connect to iTunes; this is known as Over-the-Air (OTA) updating.
* When you have an OTA update waiting for you, your Settings app typically gets a red badge and iOS will constantly nag you about software updates. The thing is, not everyone always wants to install Apple’s updates.
* In this tutorial, we’ll show you how to disable requests for iOS updates on your iPhone or iPad. This trick will also remove the nagging badge on the Settings app.
* For the most part, keeping OTA updates enabled on iOS devices is a great idea for the average. On the other hand, there are a few select reasons for more advanced iOS device users for why you may want to disable it:
* If you fall under any of these categories, then you’ve come to the right tutorial. Below, we talk about the steps to disable OTA updating on your iOS device(s).
* If you’ve gotten this far, you probably have your own reason to disable OTA updates on your device. So let’s get right into it; here are the steps you need to follow:
* 1) Turn off Find my iPhone on your device from Settings > iCloud > Find my iPhone.
* 2) Delete any downloaded OTA update files you already have on your device by following this tutorial.
* 3) On your iOS device, download and install a tvOS configuration profile.
* 4) Your Settings app will launch and prompt you to install it, so tap on the blue Install button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/Install-Configuration-profile-iOS.png)
* 5) If prompted for your passcode, enter it now:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iOS-Configuration-Profile-Passcode.png)
* 6) Next, tap on the blue Install button again, and when prompted, tap on the blue Install button one final time.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iOS-Configuration-Profile-Install-Twice.png)
* 7) After it installs, you will be asked to restart your device; tap on the blue Restart button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iOS-Configuration-Profile-Restart.png)
* 8) Once your device boots back up, you can go to Settings > General > Profile and verify that the configuration profile was installed successfully. If it is, move on to the next step.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iOS-tvOS-Configuration-Profile.png)
* 9) Next, you want to plug your iOS device into your Mac or PC and open iTunes.
* 10) Go to your device’s page in iTunes and back up your iOS device to your computer.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/Backup-iOS-device-in-iTunes.png)
* 11) Once finished, download and install iBackupBot on your computer, then launch it while your iOS device is still connected.
* 12) From the sidebar, go to /System Files/Home Domain/Library/Preferences under the device you have connected.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-System-Files.png)
* 13) Once in the folder you want, open the com.apple.Preferences.plist file by double-clicking on it.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-File-to-Edit.png)
* 14) When the file opens, you will need to make a couple of edits.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-Change-Value-1.png)
* 15) Next, click on the Save button and then click on the Close button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-Save-and-Close.png)
* 16) Now, click on the Restore button in the toolbar.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-Restore-Toolbar.png)
* 17) You will now need to select the device you have connected, and then click on the blue OK button:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-Select-Device-OK.png)
* 18) Next, make sure both of the first options are checked and that the third is un-checked. Then, click OK.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-Check-First-Two-Options.png)
* 19) The process will now begin.
* Note: If you get Error 37 during this process, then you forgot to turn off Find my iPhone, so make sure you do that and try again.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-Restoring-Device.png)
* 20) When it finishes, your iOS device will say “restoring” and may reboot, just give it a moment. When it completes, you should get this message in iBackupBot. Just click on the blue OK button and move on to the next step.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iBackupBot-Completed.png)
* And you’re done!
* Now that you’ve effectively closed off OTA updating on your iOS device AND deleted the OTA firmware that was already downloaded (if it was), you should be in the clear and iOS should say your firmware is update to date even if it’s not:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iOS-933-up-to-date.png)
* Since my iPad now thinks that iOS 9.3.3 is “up to date,” I will no longer get prompts to download and install iOS 9.3.4 or later unless I connect to my computer and open iTunes, which really isn’t very often. So I can live with that.
* Now that you know how to disable OTA updating on your iOS device(s), you can keep your firmware right where you like it without being badgered to update it all the time.
* If you found this tutorial helpful, let us know in the comments below!

