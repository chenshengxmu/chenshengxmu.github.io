---
layout: post
title: How to reliably unlock your iPhone with the updated SAM tool
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/12/Unlock-iPhone.jpg)
* If you haven’t had much success unlocking your iPhone with the SAM tool, then perhaps this will be of interest to you.
* The developer of the SAM tool has updated it to make unlocking much easier than before. In fact, it only takes a few steps in most cases.
* You don’t need iTunes, you don’t need the original SIM that you device is locked to, SIM ID’s, or anything like that.
* Check out our full how to inside…
* The latest update for SAM should fix some issues with the activation if you click in SAM, and give you a pretty indicator while you wait.
* — Sam Bingner (@sbingner) April 25, 2012
* Step 1: Install SAM via Cydia. Repo address: http://repo.bingner.com
* Step 2: Insert your unofficial SIM card.
* Step 3: Open SAMprefs, Go to Utilities and tap Attempt Activation.
* Step 4: Your device will respring, and it should recognize your unofficial SIM card. If this doesn’t work, follow the full tutorial outlined below, and in the video.
* If you receive a message that says: You must select the original carrier SIMID of your iPhone, or any other error message, simply perform the following:
* Step 1: Remove your SIM card
* Step 2: Open iFile and go to /var/root/Library. Tap edit in the upper right-hand corner, and select Lockdown, and tap the zip button to create a backup of Lockdown. Scroll to the bottom to ensure that a backup zip was created. Now delete the Lockdown folder.
* Step 3: Navigate to /User/Library/Preferences and search for SAM. Delete the com.bingner.sam.plist file.
* Step 4: Power down your iPhone completely, and turn it back on.
* Step 5: Insert your unofficial SIM card.
* Step 6: Open SAMprefs go to Utilities and tap Attempt Activation. You will receive a dialogue stating that it may take a while. Your iPhone will respring.
* Step 7: You should now be on your unofficial network. i.e. T-Mobile, etc.
* Be sure to follow these steps exactly in order for it to work. I’ve tried this nearly a dozen times, and it always worked for me. For more info on unlocking, be sure to check out our dedicated unlock page.
* Let me know what you experience in the comments below!

