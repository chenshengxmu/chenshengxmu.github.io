---
layout: post
title: How to unlock the Apple Watch Activity app on iOS 8.2, no jailbreak required
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/03/Activity-App-iOS-8.2.png)
* A few days ago, we showed you a detailed walkthrough video of iOS 8.2’s Activity App. Today, we’ll show you how you can go hands-on with this brand new app.
* In the tutorial that follows, we’ll walk you through each step needed to get the iOS 8.2 Apple Watch Activity app running on your iPhone today, even though the Apple Watch is still weeks from releasing. No jailbreak required.
* In a nutshell, we are taking a backup of the 8.2 firmware, adding a couple of plist files to unlock the Activity app, and then restoring the modified backup. It sounds super-simple, but it took developer Hamza Sood a lot of time and dedication to find the right plist values, so major props to him.
* Notes: While it isn’t required, I recommend doing this on a fresh iOS 8.2 install. This tutorial assumes that your iPhone is connected to your computer. It should work fine on both Windows and Mac, but the tutorial was done on a Mac, so your mileage may vary.
* Step 1: Download and unzip the Fitness.zip file containing the two plist files needed
* Step 2: Download and install iBackupBot [Mac | Windows]
* Step 3: Open iTunes and backup your device locally using the “This computer” option
* Step 4: Launch iBackupBot and load the backup you just created
* Step 5: Navigate to System Files →  HomeDomain →  Library →  Preferences
* Step 6: Click Import and select the com.apple.Fitness.plist from the System Files folder you downloaded in Step 1
* Step 7: Navigate to User App Files →  com.apple.Fitness →  Library →  Preferences
* Step 8: Click Import and select the com.apple.Fitness.plist from the User App Files folder you downloaded in Step 1
* Step 9: Exit iBackupBot
* Step 10: Open iTunes and click Restore Backup and choose the latest backup, which should be the one you just modified
* Step 11: Once the device is finished restoring from backup, check the Home screen and you should see the Apple Watch Activity app. If it didn’t work for you, make sure you watch the above video again for anything you may have omitted.
* Also, be sure to watch our full video walkthrough of the Activity app below:
* Did this tutorial work for you? What do you think about the Activity app? Share your thoughts down below in the comments. Again, special thanks to Hamza Sood for figuring out all of the hard stuff.

