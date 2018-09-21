---
layout: post
title: How to downgrade pre-A5 devices easily with RedSn0w
---
![img](http://media.idownloadblog.com/wp-content/uploads/2008/08/RedSn0w-logo.jpg)
* RedSn0w 0.9.15b1 was a gargantuan update. In fact, we’re still trudging through all of the new features. One new addition that has us really excited is the new direct restore option for pre-A5 devices.
* This new restore option allows you to downgrade your device without having to fool with host files, stitching, Pwned DFU, iTunes, or anything else that made downgrading so incredibly cumbersome in the past.
* We’ve made a step-by-step tutorial that shows you how to use this new restore feature, along with getting by those pesky Mismatched APTicket errors. Check inside for the full tutorial.
* Note: You must have your SHSH blobs saved either locally, or on Cydia for the firmware you wish to downgrade to. If you do not have the blobs saved on Cydia or your local machine, you will not be able to downgrade. This is for pre-A5 devices only, so device like the iPad 2, iPhone 4S, and newer cannot be downgraded using this method.
* Step 1: Download RedSn0w 0.9.15b1 or newer from our downloads page and open it.
* Step 2: Connect your iOS device, and place it into DFU mode.
* Step 3: Ensure that RedSn0w detects your device in DFU mode at the bottom of the main RedSn0w page. Click Extras > Even more > Restore > IPSW, and select the IPSW firmware file that you want to restore to. If you don’t have the right firmware file on your machine, you can download firmware files from our downloads page. RedSn0w should process the IPSW file.
* Step 4: After the IPSW is processed and identified, you will be prompted to preserve your baseband. If you’re on an unlockable baseband, and you rely on UltraSn0w or a SIM interposer for an unlock, you may want to preserve your baseband.
* Step 5: Next, it’s time to select the location of your SHSH blobs. If your SHSH blobs aren’t local, you haven’t fetched your blobs, or performed this restore before, you will most likely need to click the Remote option. This will fetch the necessary blobs from Cydia.
* Step 6: Once your select your blobs, the restore process should begin, and you will be restored to the firmware you selected. If, however, you receive an error saying Couldn’t restore Mismatched APTicket, then your device will be kicked out of DFU mode, and the restore will halt. Don’t worry. Place your device back into DFU mode, and repeat step 3 again, and the restore should take off from there.
* That’s it; that’s all there is to it. This new restore method is leaps and bounds easier than previous downgrade methods. What’s even better is that this downgrade method doesn’t even require you to use iTunes!
* MuscleNerd and the iPhone Dev Team truly did the community a huge favor with RedSn0w 0.9.15b1. Its features are downright amazing, as evidenced by this new downgrade method.
* What do you think? Are you enjoying RedSn0w’s new features? Sound off in the comments below, and be sure to check out our always growing dedicated RedSn0w page for more info.

