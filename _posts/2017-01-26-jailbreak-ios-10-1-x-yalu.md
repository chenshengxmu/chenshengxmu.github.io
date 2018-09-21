---
layout: post
title: How to jailbreak iOS 10.0-10.2 with yalu102
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-10.2-beta-guide-header.png)
* Luca Todesco just announced the first beta build of his Yalu jailbreak for iOS 10.0-10.2. In this guide, I’ll walk you through how to use the tool, should you want to try out the beta.
* Bear in mind, this tool is first release and is not necessarily stable. It also does not support all devices yet. Whilst Todesco has said that it should already be more stable than the betas of Yalu for 10.0-10.1.1, a first build is a first build. Proceed at your own risk.
* I personally gave the tool a quick test and then restored to stock iOS 10.2 to wait for a later build. This is not because the build I tried was unstable for me, but because I didn’t want to install the builds over each other, preferring to wait for a more final release with a clean slate. If you are cautious like me and value the possibility of a stable future jailbreak, consider this option, or not installing at all for now.
* Subscribe to iDB’s YouTube channel
* 1) Download Cydia Impactor to your computer.
* 2) Download yalu102 Beta to your computer.
* 3) Launch Cydia Impactor and connect your device to your computer.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-beta-requirements.png)
* 4) Drag the yalu102.ipa onto Cydia Impactor to load it up, and hit Start.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-beta-impactor-ipa.png)
* 5) Enter your Apple ID when prompted.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-beta-impactor-password.png)
* 6)a) If you don’t have two-step verification turned on for your Apple ID, enter your Apple ID password when prompted.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-beta-impactor-id.png)
* 6)b) If you do have two-step verification turned on for your Apple ID, you must log in to the Apple ID website, and create an app-specific password. Enter that password into Impactor instead of your normal password.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-beta-two-step.png)
* 7) Once Impactor has completed installing the .ipa, look to your device and check that the yalu102 app has appeared on your Home screen.
* 8) Open the Settings app on your device, and navigate to General – Device Management.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-beta-trust-profile.png)
* 9) Select the profile named after the Apple ID you entered into Impactor, and inside you should see the yalu102 app listed. Press the Trust button to trust this app on your device. If you do not do this, it will not run.
* 10) Once you have trusted the app, return to your Home screen and launch the yalu102 app.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-beta-launch-app.png)
* 11) Press the Go button to jailbreak your device, and wait.
* 12) Your device should respring, and then the Cydia app should have appeared on your Home screen.
* If this does not happen, check the profile is still trusted, reboot, and run the yalu102 app again.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/yalu-beta-cydia.png)
* 13) Launch Cydia, and install any recommended upgrades.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/cydia-beta-updates.png)
* 14) Once this is done, add the following repository to Cydia:
* http://apt.saurik.com/beta/cydia-arm64/ This will ensure you receive beta updates for the Cydia app itself. However, you will have to install updates for the yalu102 app manually for now by following the steps of this guide, rather than through Cydia.
* That’s all folks!
* If you have had enough of the beta jailbreak and want to remove it for now to wait for stable, follow the instructions below.
* Simply restore your device to iOS 10.2 in iTunes, by manually downloading the iOS 10.2 IPSW, alt-clicking Restore in iTunes (shift-clicking on Windows), and selecting the IPSW you downloaded.
* Check that iOS 10.2 is still being signed before doing this! If it is not, you will be forced to update to iOS 10.2.1+, and you will be stuck. This is only the best way for at most a few more days. Check signing status before doing this!
* 1) Uninstall all your Cydia tweaks and apps.
* 2) Delete the yalu102 application from your device.
* 3) Ensure the trusted profile has gone from Settings – General – Device Management.
* 4) Reboot your device.
* 5) Put Cydia in a folder and do not launch it.
* 6) That’s the best you can do.
* This will not remove all jailbreak files from your device, but it will disable your jailbreak and will let you install a later build of the jailbreak tool when you decide to try it again. To completely remove all files, you must update to the latest firmware, but then you can not jailbreak again.
* It’s really up to you as to whether you want to try out the Yalu jailbreak at this stage. Luca Todesco has posted the .ipa publicly himself, and requested feedback, which he never wanted or requested on the 10.1.1 version of the tool. This implies that, to some extent, he considers it acceptable for general use. Substrate is enabled for example, and Cydia no longer freezes upon respringing.
* However, the fact remains that as an alpha release, it is only going to get more stable with time, and that if you encounter any problems using this build, you will not get much sympathy from anyone. So for the two weeks you might have to wait for a stable version of the tool, is it really worth the risk of pushing ahead with an early release?
* You decide.

