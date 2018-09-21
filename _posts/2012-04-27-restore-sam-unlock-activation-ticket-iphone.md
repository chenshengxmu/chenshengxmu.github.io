---
layout: post
title: How to restore your SAM unlock activation ticket to unlock your iPhone
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/04/iPhone-Unlock-Activation-Ticket-Restore.png)
* Since it appears that Apple has fixed the issue with their activation servers, latecomers to the SAM iPhone unlock party are left in the lurch. Fortunately, not all users have lost the potential to unlock their iPhones.
* Those who were proactive enough to unlock their iPhone using SAM, and backed up their activation tickets can still easily restore those tickets and unlock their iPhones if they have to restore their device for whatever reason.
* If you’re currently unlocked on an unofficial SIM by means of the SAM unlock, backup your activation ticket now before you lose it. We can’t stress this enough.
* Keep in mind that you will still need a jailbroken iPhone to accomplish this, and you will need your backed up Lockdown folder that you saved-off after successfully unlocking your device the first go-round…
* If you meet the criteria, step right inside and take a look at our easy to follow guide for restoring your iPhone unlock…
* Note: This tutorial assumes your have your backed up Lockdown folder available on DropBox. If not, you can do so by other means, but DropBox is one of the easiest methods for accomplishing this.
* Step 1: Insert the unofficial SIM card for which you created a backup activation ticket.
* Step 2: Open iFile and navigate to /var/root/Library. Tap edit in the upper right-hand corner, and select Lockdown, and tap the zip button to create a backup of the current Lockdown folder. Name it something unique and distinguishable. Scroll to the bottom to ensure that a backup zip file was created. Now delete the Lockdown folder using the trash can icon.
* Step 3: Open DropBox, find your backed up Lockdown folder with the valid activation ticket from your unofficial SIM card. Open the zip file with iFile, and select Unarchiver. This will unzip the Lockdown folder to your default landing directory which is usually the Documents folder.
* Step 4: Tap edit in the upper right-hand corner, select LockDown and tap the clipboard icon below to copy the LockDown folder. Tap done.
* Step 5: Navigate to /var/root/Library, and tap edit in the upper right-hand corner, tap the clipboard icon, and select paste. Tap done.
* Step 6: If you still have SAMPrefs installed, Navigate to /User/Library/Preferences and search for SAM. Delete the com.bingner.sam.plist file if it exists. This will ensure that no SAM settings you have enabled will cause any unnecessary conflicts.
* Step 7: Power down your iPhone completely.
* Step 8: Power up the iPhone, and wait for a minute once it arrives at the Home screen. Your carrier should now reflect the carrier of the unofficial SIM card that you have inserted in your iPhone.
* It seems like a lot of steps, but it can be done in less than 5 minutes. You probably won’t need to use this yet, unless you need to restore your device.
* Let me know what you think in the comments below.

