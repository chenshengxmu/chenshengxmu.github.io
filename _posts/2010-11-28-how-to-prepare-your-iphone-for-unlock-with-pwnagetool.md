---
layout: post
title: How to Prepare Your iPhone for Unlock with PwnageTool
---
* The Dev Team just released an update to their UltraSn0w unlock. Unfortunately, this time it’s not as easy as downloading and installing UltraSn0w to unlock the iPhone.
* If your iPhone is on baseband 01.59.00, 04.26.08, 05.11.07, 05.12.01, or 05.13.04, then you can simply go to Cydia and download UltraSn0w. If you are on a different baseband, you will first have to update your baseband to 06.15.00, which is unlockable.
* All this sounds a little confusing? Yes, it’s normal. It’s very confusing, so I highly suggest you read this before going forward with the unlock process. It will tell you what you can and cannot do, depending on your configuration…
* Some more warnings:
* This PwnageTool also contains a 4.2.1 bundle for iPhone3G owners…for all else, it’s still only 4.1.  If you have an iPhone3GS with an old bootrom, the new redsn0w will handle 4.2.1 for you (in fact it covers 4.2.1 for all devices, even though some of them are still tethered at 4.2.1 until @comex can work some untethering magic).  iPhone3GS users with old bootroms who want to go to 4.2.1 should not use this PwnageTool! Update to stock 4.2.1 first, then use the upcoming redsn0w to update your baseband.
* Now that you’ve read the article I just linked to (you read it, right?), we’re going to use PwnageTool to jailbreak while updating the baseband to 06.15.00.
* Step 1: Download PwnageTool 4.1.3 from our iPhone downloads section. You will need a torrent downloader (ie. uTorrent) to download the file. Download iOS 4.1 for your iPhone 3GS or iPhone 4, or download iOS 4.2.1 if you have an iPhone 3G. You will also have to download iOS 3.2.2 for iPad from our download page.
* Step 2: Make sure iTunes is up to date. If not, update iTunes and reboot your computer.
* Step 3: Sync your iPhone in iTunes in order to backup everything, just in case something goes wrong. When the sync is done, close iTunes and leave your iPhone connected to your computer via USB.
* Step 4: Launch PwnageTool. For the purpose of this tutorial, we will choose to use the expert mode. Select Expert Mode, then select your iPhone. Click the blue arrow to continue.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/PwnageTool-Expert-Mode.png)
* Step 5: Select “Browse for IPSW” then click the blue arrow. A window will popup letting you choose the firmware you downloaded in step 1.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/PwnageTool-Browse-for-iPSW.png)
* After selecting your firmware, you will get the following message. Make sure you understand the risks and click Yes to keep going.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/11/iPhone-update-baseband-06.15.00.png)
* You will now have to browse for the IPSW for iPad iOS 3.2.2 you downloaded in step 1.
* Step 6: You will then be presented several options. Select “general” and click the blue arrow to continue.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/PwnageTool-General.png)
* Under General, you can choose if you want to activate your phone. You should only do that if you are using an unofficial carrier and want to unlock your iPhone. If you are using an official carrier (like AT&T in the US), you don’t need to select “activate”. You will notice that “enable baseband update” is selected by default (that’s exactly what we want).
![img](http://media.idownloadblog.com/wp-content/uploads/2010/11/PwnageTool-Baseband-update.png)
* Click the blue arrow to continue.
* Step 7: You will then be taken to the Cydia Settings page. Click the “download packages” tab, and click refresh. This step will allow you to pre-install jailbreak apps on your iPhone. Select the package you want to pre-install and click “add to queue”. Click the blue arrow when you’re done.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/PwnageTool-Cydia-Settings.png)
* Step 8: You will then be taken to the “custom packages settings”. Cydia Installer should be selected by default. If not, make sure to select it, then click the blue arrow to continue.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/PwnageTool-Custom-Packages-Settings.png)
* Step 9: Hit the “build” button and click the blue arrow to continue.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/PwnageTool-Build.png)
* Step 10: PwnageTool will ask you where you want to choose your custom IPSW. I chose to save it to my desktop.
* Step 11: PwnageTool will now start building your custom IPSW. It will probably ask you for your admin password. This step should take a couple minutes.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/PwnageTool-Building-IPSW.png)
* Step 12: PwnageTool will then help you enter DFU mode. It will make a funny sound and will instruct you to get your iPhone in DFU mode. Simply follow the onscreen prompts: hold power and home button together for 10 seconds ; release power button while still holding the home button. When done, PwnageTool will tell you to go and restore in iTunes.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/PwnageTool-DFU-Mode.png)
* Step 13: Once you launch iTunes, it will tell you it has found an iPhone in Recovery Mode. Click OK to continue.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/iTunes-iPhone-in-Recovery-Mode.png)
* Step 14: Now that you have your custom cooked firmware, you need to install this firmware on your iPhone. Hold the “Alt/Option” key and click “Restore” at the same time. DO NOT click “Restore” without holding the “Alt/Option” key! A dialog box will pop up and you’ll be able to choose the custom IPSW file you created.
* Step 15: iTunes will give you a message telling you it’s going to erase and restore. Click ok to proceed.
* Step 16: iTunes will now restore your iPhone using the cooked iOS firmware. This process might take a few minutes so be patient. When done, your iPhone will reboot.
* To unlock, you can now go to Cydia and look for UltraSn0w. Download UltraSn0w and reboot your iPhone. You will now be unlocked.

