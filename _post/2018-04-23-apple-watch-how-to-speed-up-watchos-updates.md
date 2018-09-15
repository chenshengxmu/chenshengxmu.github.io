---
layout: post
title: How to speed up Apple Watch software updates dramatically
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/10/Watch-compation-app-Apple-Watch-up-to-date-teaser-001.jpg)
* Downloading watchOS software to your Apple Watch is a tremendously slow process.
* It can take anywhere between half an hour to an hour or more to send a watchOS software update to your wrist. Because it’s such a sluggish experience, I try to update my watch only when I’m positive I won’t be using it for a few hours, like right before I’m about to hit the bed.
* The exact amount of time needed to send the installer to your wrist depends on the size of the watchOS software update you’re installing, the model of your Apple Watch (newer models utilize better processors that handle common operations faster), network interference and the many factors that influence wireless data transfer.
* TUTORIAL: How to update your Apple Watch software
* Wouldn’t it be great if there were a way to dramatically speed up the utterly slow process of sending the watchOS installer files to your Apple Watch?
* I’ll let you in on a secret: sliding the Bluetooth toggle to the OFF position in Settings → Bluetooth on your iPhone will speed up watchOS software updates dramatically.
* But why does turning Bluetooth off accelerate the update process?
* Because Apple Watch defaults to prioritizing Bluetooth over Wi-Fi whenever possible in order to conserve as much power as possible. While Bluetooth does require less power than Wi-Fi, the protocol is significantly slower in terms of data transfer than most Wi-Fi networking standards.
* Disabling Bluetooth on your paired iPhone at the right time will force your Apple Watch to connect to your iPhone via the faster Wi-Fi protocol.
* Unlike other Apple devices, your Apple Watch does not download watchOS updates itself.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/10/Apple-Watch-updating-teaser-001.jpg)
* Updating your watch happens through the companion Watch app on your paired iPhone.
* Your phone downloads the latest watchOS update and sends the installer wirelessly to your wrist. Sending that much data over Bluetooth is insane—watchOS updates typically weigh in anywhere between a few hundred megabytes to more than a gigabyte.
* Making the weakest link—sending the installer to your watch—faster by temporarily disabling Bluetooth shaves off a significant amount of time from the update process.
* However, you must shut down Bluetooth in a specific moment during the update process.
* As I said, Apple Watch software updates are handled by the Watch app on your paired iPhone. Among other things, it automatically retrieves the latest watchOS software from Apple’s servers as soon as it becomes available to download.
* The Watch app then sends the downloaded installer file to your wrist-worn device over the air. The watch takes it from there, unpacking the installer and applying the update.
* 1) Make sure that your Apple Watch is on its charger, is at least 50% charged and is within a few inches of your paired iPhone. Double check that Wi-Fi and Bluetooth are enabled on both your phone and watch.
* 2) Open the Watch app on your paired iPhone.
* 3) Tap the My Watch tab.
* 4) Tap General.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS_11_WAtch_app_udpate_Apple_Watch_002.jpg)
* 5) Tap Software Update.
* TIP: If your iPhone has already downloaded the latest watchOS update in the background, you’ll see a red badge on the Watch app’s icon on your Home screen and within the app.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS-11-WAtch-app-udpate-Apple-Watch-001.jpg)
* 6) If there’s a new watchOS update available, you’ll see its version number and release notes on the next screen. To continue the update process, tap Download and Install.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS_11_WAtch_app_udpate_Apple_Watch_003.jpg)
* If asked for your iPhone passcode or Apple Watch passcode, enter it.
* 7) As the Watch app prepares to send the downloaded watchOS installer to your watch, you’ll see a message “Estimated time remaining” at the top.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS_11_WAtch_app_udpate_Apple_Watch_004.jpg)
* Seeing a rough estimate of the time remaining (for example, “About 9 minutes remaining”) means the app is sending the installer to the watch over Bluetooth.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS_11_WAtch_app_udpate_Apple_Watch_005.jpg)
* Don’t disable Bluetooth until the time remaining estimate appears
* 8) Now open the Settings app on your iPhone.
* 9) Choose Bluetooth from the list.
* 10) Slide the switch labeled Bluetooth to the OFF position.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/iOS-11-how-to-disable-Bluetooth-completely-iPhone-screenshot-001.png)
* TIP: Avoid disabling Bluetooth through Control Center because that won’t do the trick due to the major changes to how these toggles work in iOS 11.
* 11) Bluetooth is now fully disabled on your iPhone.
* Data transfers and special Continuity features such as AirDrop and Apple Watch connectivity will no longer work. This isn’t a problem: Apple Watch supports certain features over Wi-Fi connections, even when Bluetooth is disabled.
* Switch to the Watch app and navigate to the My Watch → General → Software Update screen.
* 12) A prompt pops up, advising you reconnect to your watch.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS-11-WAtch-app-udpate-Apple-Watch-006.png)
* Tap Cancel to continue.
* 13) Seeing that Bluetooth is unavailable, the Watch app falls back to your home Wi-Fi network as long as both your watch and phone have Wi-Fi enabled in Settings and are connected to the same local network.
* The estimated time remaining should drop significantly as a direct result of using the much faster Wi-Fi protocol than the slow, unreliable Bluetooth networking. Apple enforces Bluetooth on the watch because Wi-Fi radios consume more power.
* When a message saying “Preparing…” appears at the top of the screen, the watchOS installer has been successfully sent to your watch. Apple Watch is now unpacking the installer.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS_11_WAtch_app_udpate_Apple_Watch_008.jpg)
* You may also see a message saying ”Verifying…”
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS_11_WAtch_app_udpate_Apple_Watch_009.jpg)
* This is to indicate that the Watch app is verifying the cryptographic signature of the downloaded software in order to ensure that the watchOS update is a legitimate piece of software that has not been tampered with.
* With the watchOS archive unpacked on your watch, relaunch the Settings app and re-enable Bluetooth, then return to watchOS installer screen in the Watch app.
* 14) Tap Install in the Watch app.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/iOS_11_WAtch_app_udpate_Apple_Watch_007.jpg)
* If asked for your iPhone passcode or Apple Watch passcode, enter it.
* 15) Wait for the progress wheel to appear on your watch. Your iPhone is no longer needed for the rest of the watchOS update process so it’s now safe to quit the Watch app.
* Keep in mind that it could take from several minutes to an hour for the update to install onto the watch, depending on your exact Apple Watch model, the update size and more.
* Check out our hands-on video walkthrough of the whole process.
* Subscribe to iDownloadBlog on YouTube
* I know shutting down Bluetooth feels like a cheap trick.
* In fact, many folks know about the correlation between Bluetooth throughput and the watchOS update speed. But, trust me: once you try this simple trick you’ll never install Apple Watch software updates over Bluetooth again—and you can quote me on that.
* If you like this how-to, pass it along to your support folks and leave a comment below.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know via help@iDownloadBlog.com and a future tutorial might provide a solution.
* Submit your how-to suggestions via tips@iDownloadBlog.com.

