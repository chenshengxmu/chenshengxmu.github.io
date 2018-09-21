---
layout: post
title: How to downgrade from iOS 10.2 to iOS 10.1.1 to prepare for a possible jailbreak
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/iPhone-Restore-Header-Done.jpg)
* With the news of a possible upcoming jailbreak for iOS 10.1.1, the race is on for those who have already upgraded past it to downgrade before Apple closes the signing window on them and leaves them high and dry. This guide will walk you through how to return to iOS 10.1.1 from iOS 10.2 (or any other version you may be on, like iOS 9.3.3 or iOS 10.1) so that you will be safe and sound when the window closes, and can wait and see if this jailbreak hype comes true.
* As you can see, my iPhone SE begins on pesky, hateful iOS 10.2, and so must be downgraded post-haste.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Downgrade-Before.png)
* First, make sure that iOS 10.1.1 is still being signed. You can check the signing status of specific software versions at ipsw.me. At the time of publishing, we know iOS 10.1.1 is still being signed. It will likely be until December 19.
* If iOS 10.1.1 is not being signed, stop immediately. Do not try to restore the IPSW to your device.
* This is because once the signing window has closed the IPSW will be useless. Trying to restore it to your device will then fail, and may result in accidentally upgrading to iOS 10.2, which if you were coming from iOS 9.3.3 would be a disaster.
* 1) Head to the iDB Downloads section to download your IPSW.
* 2) Locate the IPSW for your device. In this case, it is of course iOS 10.1.1 that we want to download.
* 3) Select it and click “Go”.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/iDB-IPSW-Downloads.png)
* Make sure to do this section right at the beginning, as downloading the IPSW may take a while and time is of the essence. Luca Todesco has confirmed that it does not matter whether you select iteration (14B100) or (14B150), as the exploits used work on both, but I selected (14B150) as it is the newer and may contain other fixes which would be good to have.
* 4) While your IPSW downloads, make a backup of your device in iTunes and copy off any photos, data, and so on that you want, as the next steps will wipe your device entirely.
* 5) Connect your device to your computer and open iTunes.
* 6) Power off your device.
* 7) Hold down your device’s Power and Home buttons at the same time for 10 seconds, and then release the Power button but keep holding down the Home button for 10 more seconds. If on an iPhone 7, do the same but replace “Home Button” with “Volume Down” button.
* 8) iTunes should now report that it has “detected an iPhone in recovery mode. You must restore this iPhone before it can be used with iTunes.”
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Downgrade-Recovery-Mode-iTunes.png)
* Please note that steps 6-8 are the process for entering DFU mode. It may take a few tries to get this right, and proceeding past this point will completely wipe your device. This is advisable for the cleanest start on your new firmware, and especially for those who are coming from a previous jailbreak. You will not be able to restore a backup made from a higher firmware like iOS 10.2 onto your device when it reverts to iOS 10.1.1.
* If you do not wish to DFU restore your device, skip steps 6-8, but I would recommend following this procedure and setting your device up as new.
* 9) Now locate the “Restore” button in iTunes, and ⌥ – click it. (That is, hold down the “alt” key on your keyboard, and then click the “Restore button”. Instead of restoring to iOS 10.2 via a download, it should open a file selector window.
* 10) Browse to the iOS 10.1.1 IPSW you downloaded, and select it.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Downgrade-Select-IPSW.png)
* 11) Confirm that you wish to restore to iOS 10.1.1. Make sure the dialogue box specifies iOS 10.1.1 and not iOS 10.2.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Downgrade-Confirmation.png)
* 12) Wait as your device restores. It will reboot a couple of times throughout the process, and will then re-appear in iTunes at the set-up screen.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Downgrade-After.png)
* 13) If you are coming from a lower firmware, you can now restore your backup to your device, though as I mentioned, I prefer to set up as new. If coming from iOS 10.2, you cannot restore your backup to iOS 10.1.1.
* All that now remains is to wait and see if this jailbreak rumour crystallises into a release, and to avoid accidentally updating again to iOS 10.2 in the meantime. Remember, if you do want to take advantage of this opportunity, do it sooner rather than later, because once Apple stops signing iOS 10.1.1 you will be out of luck.
* Try to make an informed decision as to whether you want to change. People on iOS 10.2 should probably revert in my opinion, but people on 32-bit devices or on lower firmwares with a current jailbreak should think carefully. You don’t want to give up a working jailbreak in the hope of a future one which is not yet definitively released, and which may not support 32-bit devices.
* Was this guide helpful? Will you be sticking on your current iOS version, or will you be twisting back on down to iOS 10.1.1? Do tell.

