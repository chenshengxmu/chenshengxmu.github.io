---
layout: post
title: How to downgrade iOS 6 to iOS 5.1.1 on A4 devices
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Downgrade-iOS-6.jpg)
* Have an iPhone 4, iPod touch, or below running iOS 6, and would like to downgrade back to iOS 5.1.1? Doing so is easy is you have your SHSH blobs saved for iOS 5.1.1 and can follow the steps inside. Unlike the beta period of iOS 6, you must have your SHSH blobs for iOS 5.1.1 save for you device now, because Apple has stopped signing iOS 5.1.1.
* To downgrade, you will need the latest public version of RedSn0w. We will use the SHSH Stitching feature to combine the appropriate IPSW file for 5.1.1 and your corresponding SHSH blob for the device you wish to downgrade. It may sound a bit confusing, but it’s extremely easy if you follow along carefully.
* Take a look inside for the full walkthrough and video how-to.
* Step 1: Download RedSn0w 0.9.14b2.
* Step 2: Download the 5.1.1 IPSW file for the device you’d like to downgrade.
* Step 3: Locate the SHSH blob you saved earlier. You must have an iOS 5.1.1 SHSH blobs saved for you device, and stored on your local computer, or on Cydia. If you have it on your computer, locate it, and place it in the same folder as the 5.1.1 IPSW file. If it’s stored on Cydia, then continue on.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/iOS-6-Downgrade-SHSH-and-IPSW.jpg)
* Step 4: Place your device running iOS 6 into DFU mode.
* Step 5: Open RedSn0w, and click Extras > SHSH blobs > Stitch.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Downgrade-iOS-6-stitch.jpg)
* Step 6: Click IPSW and select the iOS 5.1.1 IPSW for your device.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Downgrade-iOS-6-Select-IPSW-and-SHSH-Cydia-Local.jpg)
* Step 7: If your SHSH blobs are stored on Cydia, Click Cydia under the blobs section. If you have your SHSH blobs stored locally, click Local, and select the SHSH blob for iOS 5.1.1 for your device.
* Step 8: Once the IPSW and blob are selected, RedSn0w will stitch them together to create an all encompassing firmware file for iOS 5.1.1. You will be able to use this firmware file to downgrade, even though Apple is no longer signing iOS 5.1.1.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/iOS-6-Downgrade-RedSn0w-Stitching-blobs.jpg)
* Step 9: In RedSn0w, go back two pages, and click Pwned DFU. This will place your device into Pwned DFU mode so that iTunes can restore using the stitched firmware. Without doing this, you will get error 1600 in iTunes.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Downgrade-iOS-6-Pwned-DFU-Mode.jpg)
* Step 10: Open iTunes, and it should detect your device in recovery mode. Hold Option and click Restore, then select your newly created stitched firmware file. The filename should be prefixed by a series of 13 numbers, which is the device’s ECID.
* Step 11: Allow iTunes to completely restore your device, and you may be presented with an Error -1 from iTunes. Do not worry.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Downgrade-iOS-6-iTunes-Error-1.jpg)
* Step 12: Open RedSn0w, and click Extras > Recovery fix.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Downgrade-iOS-6-Recovery-Fix.jpg)
* Step 13: Place your device back into DFU mode, and the Recovery fix should run successfully.
* Step 14: Once the Recovery fix is completed, your device will be completely restored back on iOS 5.1.1.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/iOS-6-Downgrade-iOS-5.1.1-Success.jpg)
* If you can remember to follow each step one at a time, then the chances of your success with this downgrade goes up exponentially. Keep in mind, that the downgrade only works if you meet the criteria. Again, you must have an A4 device or below, you must have your SHSH blobs saved locally on your computer, or stored on Cydia, and you need to have RedSn0w and the correct 5.1.1 firmware file for your device.
* If you have questions or concerns, then feel free to comment below. Hopefully everyone can pitch in and help one another.
* Be sure to leave your thoughts regarding downgrading in general, and this specific tutorial, in the comments section below.

