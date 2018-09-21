---
layout: post
title: How to build extra_recipe from source code using Xcode
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/switch-yalu-extra_recipe-jailbreak.png)
* If you’re an iPhone 7 or iPhone 7 Plus user on iOS 10.0.0-10.1.1, the time has come for you to switch from the mach_portal jailbreak to the newer, more stable extra_recipe. If you’re a flagship user on iOS 10.1 or iOS 10.1.1 it’s as easy as downloading the .ipa and sideloading it; you can follow our guide on the subject.
* However, if you’re on iOS 10.0.0-10.0.x, or if you have a device other than the iPhone 7(+), there isn’t currently an .ipa available which supports you. For that reason, we’ll show you how to build your own straight from the source code on GitHub and push it to your device, so you needn’t wait to get the newest features and device support.
* iPhone 7 and iPhone 7 Plus users on iOS 10.0.0, 10.0.1, 10.0.2, and 10.0.3 should follow this guide. So should users of other devices who want to try out extra_recipe instead of Yalu (on iOS 10.2 only for now). This includes iPhone 6, iPhone 6s, and iPad Air 2 users. Remember, if you haven’t had trouble with your Yalu jailbreak, there may be no point in switching to extra_recipe on devices other than the iPhone 7(+). iPhone 7(+) users on iOS 10.1 and iOS 10.1.1 do not need this guide, because they already have an .ipa available. They should follow my simpler guide instead.
* 1) Download the Cydia branch of extra_recipe from the developer’s GitHub page. Double click the downloaded .zip to expand it.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/compile-extra_recipe-download-1.png)
* 2) Open the expanded folder and double click the extra_recipe.xcodeproj file to launch Xcode and load the project.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/compile-extra_recipe-launch-xcode.png)
* 3) Connect your device to your computer. In Xcode, look for the “Play” and”Stop” style buttons in the top menu bar. To the right of them, click the menu which selects the device to build for, and select your connected device from the top of the list.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/compile-extra_recipe-select-build-device.png)
* 4) Next, enter a unique bundle identifier into the relevant field. This cannot be the same as existing apps. They usually follow the format com.nameofdeveloper.nameofapp.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/compile-extra_recipe-bundle-identifier.png)
* 5) In the Signing section below the section we just filled in, click the drop-down menu titled Team: and select a Team ID to sign the app with. This will usually be your Apple ID or developer ID. If none are available, they can be set up in Xcode, Preferences, Accounts.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/compile-extra_recipe-select-team-id-deployment.png)
* Make sure the Signing section accepts the selected Team and that no lingering errors are reported in this section, or it will not work.
* 6) You can also optionally change the Deployment Info below to state a specific Deployment Target and Device, though this may not be strictly necessary.
* 7) Once all the information in Steps 3-6 has been correctly entered, it’s as simple as clicking the Run/Build button in the top menu bar. (This is the button that looks like the “Play” symbol).
* Xcode will now build the extra_recipe app and push it to your device. Once it’s done, Xcode will report Build Succeeded on the screen. If it says Build Failed, check your device anyway to see if it worked, and then double-check the steps above.
* Once the app is on your device, Trust it in Settings, General, Profiles & Device Management. Then simply launch it and hit Go to jailbreak your device with extra_recipe.
* Congratulations! You’re done!
* If you’re having trouble with this guide or want to let me know your experience with extra_recipe, drop me a line in the comments section.

