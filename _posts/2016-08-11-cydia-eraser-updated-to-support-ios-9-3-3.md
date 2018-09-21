---
layout: post
title: Cydia Eraser updated to support iOS 9.3.3
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/Cydia-Eraser-Icon.png)
* Saurik has launched an update for the Cydia Eraser tool on Thursday so that it can now be used to un-jailbreak iOS 9.3.3 if you used the Pangu jailbreak tool.
* The timing couldn’t be better, as Apple recently released iOS 9.3.4 and is expected to close the iOS 9.3.3 signing window in the near future.
* With Cydia Eraser now in full support of iOS 9.3.3, those who have jailbroken their iOS 9.3.3 devices with Pangu, whether it was with the Chinese Windows jailbreak tool, over the web in the Safari web browser, or with the English Pangu jailbreak tool that utilizes Cydia Impactor, now have a way to remove the jailbreak and put their device back to a stock non-jailbroken installation of iOS 9.3.3.
* Saurik officially re-branded Cydia Impactor into “Cydia Eraser” last month just before the English Pangu jailbreak tool was released that used an app called “Cydia Impactor” to sign and install an IPA for jailbreaking your device. When the name change occurred, Saurik only noted only partial support for the dated iOS 9.0. So the added support for iOS 9.3.3 this week is very welcoming without a shadow of a doubt.
* Cydia Eraser effectively removes all traces of the jailbreak you currently have and allows you to restore your device to the firmware it’s already on without having to connect to iTunes to “restore and update” your device. The major benefit to using this tool over iTunes is after you use it, your device can be re-jailbroken on the firmware it’s on if you so desire to try again.
* This tool is also useful for anyone who has a jailbroken device they’re trying to sell, because it lets the seller sell the device as a “jailbreakable” device, which may add value to it if it gets sold to the right buyer.
* Cydia Eraser appears to take advantage of the OTA update system. Saurik explains how it works in Cydia, and we’ve included the excerpt below:
* Eraser uses the firmware archives provided by Apple for its “over the air” update feature. These files are ~2GB large, so Eraser goes to extreme lengths to minimize the amount of data it needs to download: most recoveries will require less than 10MB of transfer.
* First, the update’s “bill of materials” is compared against the files on your device, generating a list of changes.
* Then, all files on your device that have been modified or otherwise destroyed are downloaded directly from Apple.
* In a series of carefully calculated file migrations, all new files are moved to the user partition, and all system data is moved back to the system partition.
* Up until this point, the idea is that no changes to your system have been made that are “unsafe”: at any point, if Eraser fails/crashes or your device reboots, you can just run it again later.
* Finally, all of the staged changes to the filesystem are “committed”, all user data is deleted, and iOS is told to run its “reset all content and settings”.
* The idea is that this “critical window” lasts only the final few seconds of a process that lasts for multiple minutes.
* (That said, I still highly recommend not at all “messing with” the app while it is running, and maybe if you have a lot of data this will take longer than I expect.)
* When the device reboots, it will look as it did when you first turned it on; it will also no longer be “jailbroken”: if you want to jailbreak it, you will need to do so using a desktop jailbreaking tool.
* Simple enough? Well, maybe not for everyone, but to summarize, it’s a very clever tool that exploits the OTA system so that your device gets all the resources it needs to replace the modified files on your device with factory-fresh ones from Apple. As a result, you get a factory-fresh installation of your current iOS version when you run the tool.
* Cydia Eraser is to be used as a last resort only if you are having trouble with your jailbroken device, such as when you are having frequent stability issues or when you’re absolutely sure you want to sell or re-jailbreak your device.
* This is because Cydia Eraser effectively erases your files and settings from iOS. When it finishes running, your device will behave just how it did when you pulled it out of the box after buying it. You’ll have to set it up, activate it, and reinstall all your apps and apply all your old settings again manually.
* When you’re done, you can either put it back in the box to sell, or you can attempt to jailbreak the device again and hope for the best the second time around.
* Whatever you’re using it for, it works wonders, so if you need to un-jailbreak your device and you don’t want to update the firmware, Cydia Eraser is the way to go.
* With Cydia Eraser now officially supporting iOS 9.3.3, those who jailbroke with the Pangu jailbreak tool can now un-jailbreak their devices without being prompted to update to iOS 9.3.4 in iTunes. Although iOS 9.3.3 is still being signed as of this writing, Cydia Eraser is the safest way to un-jailbreak your device at this point in time.
* IF you need to use it, you can download it from Cydia right now. You’ll find it in the Cydia/Telesphoreo repository.
* Are you excited to finally see iOS 9.3.3 support in Cydia Eraser? Let us know in the comments!

