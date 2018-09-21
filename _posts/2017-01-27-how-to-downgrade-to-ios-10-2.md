---
layout: post
title: How to downgrade (or update) to iOS 10.2
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/downgrade-iOS-header.jpg)
* We recently covered the release of Luca Todesco’s first build of yalu102. This tool will eventually allow all 64-bit devices to jailbreak iOS 10. iPhone 7 and iPhone 7 Plus will be able to use it on iOS 10.0-10.1.1, all other 64-bit devices will be able to use it on iOS 10.0-10.2.
* As the signing window for iOS 10.2 could close at any time, the pressure is on to downgrade to iOS 10.2 if you are currently on a higher firmware. Some people on a lower firmware should also upgrade to iOS 10.2, but not everyone. In this guide, we’ll talk you through how to upgrade/downgrade to iOS 10.2 from a lower/higher firmware, if you are one of the people who should be there.
* Everyone on iOS 10.2.1 or iOS 10.3 beta who wants to jailbreak, now or in the future.
* Everyone who is already on iOS 10.2.
* Some people on a firmware lower than iOS 10.2. This is more complicated.
* If you have an iPhone 7 or iPhone 7 Plus and are on lower than iOS 10.2, do not update to iOS 10.2, stay on a lower firmware!
* Everyone else should check out my advice for all devices on all firmwares to find out if you need to stay where you are, or move to iOS 10.2.
* 1) Ensure you have backed up your device to iTunes and/or iCloud before beginning. I backup to iTunes with ‘Encrypt Backup’ selected, to make sure I have a hard copy on my computer which also contains all my app passwords and email account details. Manually save any other data off your phone that you may want, such as your Camera Roll. If moving from iOS 10.2.1 to iOS 10.2, you will not be able to restore a 10.2.1 backup to your device on 10.2, so make sure you save anything you want now.
* 2) Ensure you have downloaded the correct IPSW file for your device. Some devices have multiple models with different IPSWs. For example, iPhone 5s has Global and GSM variants, and their IPSWs are not interchangeable. The IPSW must be for your exact device model, and must be for iOS 10.2 only. As you can see in the image below, my IPSW clearly states it is for iPhone SE (there is only one model of SE), and for iOS 10.2.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/10.2.1-downgrade-check-ipsw.png)
* 3) Go to this site, select your exact device model, and make sure iOS 10.2 is still being signed for it. If the page reports it is no longer signed, stop immediately. This procedure will fail if iOS 10.2 is not signed, and may force you to move to iOS 10.2.1 or higher. If iOS 10.2 is still signed, move to step 4). As you can see in the image below, at the time I downgraded to iOS 10.2, the firmware was still being signed for my device.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/10.2.1-downgrade-check-signing.png)
* 4) Connect your device to your computer and launch iTunes. If it prompts you to upgrade or download a newer firmware for your iOS device, tick Do not ask me again and then click Cancel.
* 5) On the connected devices page, look for the two buttons labelled Restore and Update.
* 6) Select which option you want to do. Restore is recommended because it completely wipes all files from your device. This gives you a clean start and avoids stability issues later on. Update keeps all your data as it is, but can occasionally cause problems.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/10.2.1-downgrade-restore-button.png)
* 7a) If you are restoring, hold down the Option key (Mac) or shift key (Windows), and click Restore.
* 7b) If you are updating, hold down the Option key (Mac) or shift key (Windows), and click Update.
* Do not just click Update or Restore. You must hold down the relevant keyboard key whilst you click Update or Restore. If you do not, iTunes will automatically install iOS 10.2.1 instead of iOS 10.2, without asking you.
* 8) After Option-clicking the Update or Restore button, a file browser should appear. Navigate to the location where you saved the iOS 10.2 IPSW file which you downloaded earlier, and select it.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/10.2.1-downgrade-select-ipsw.png)
* 9) iTunes will ask you whether you want to use this IPSW to restore your device. Make sure it says it will restore to iOS 10.2, and not another firmware. If it all looks good, confirm the decision.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/10.2.1-downgrade-confirmation.png)
* 10) The restore process will now begin. Do not disconnect your device from the computer until it has finished restoring and booted back up to the lock screen.
* 11) Optional: only for people coming from lower than iOS 10.2, not for people coming from iOS 10.2.1 or higher. If you restored instead of updating, you can now decide if you want to restore a backup onto the device. Again, I recommend setting your phone up as new, but a backup can be applied here if necessary. If you already selected Update in step 6), this is not necessary because all your data is still on your device.
* You are now safe and sound on iOS 10.2, ready for yalu102 to reach primetime. Once again, if you are trying to decide if you need to follow this guide, here is the general rule: If you’re on iOS 10.2.1 or higher, follow it. If you’re on iOS 10.2 already, don’t. If you’re on lower than iOS 10.2 already, read my advice for your specific device and version.

