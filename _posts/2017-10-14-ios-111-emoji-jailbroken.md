---
layout: post
title: How to get the iOS 11.1 emoji on your jailbroken device
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/10/2017-ios11.1-new-emojis-emoijpedia-apple.jpg)
* It beggars belief the number of times I’ve searched through the iOS keyboard looking for a sandwich emoji to send to my nearest and dearest; it’s a big part of my life. And finally, I am to be catered for, quite literally. iOS 11.1 beta 2 serves up some tasty emoji additions.
* If you’re jailbroken on iOS 9 or 10, you will want to be able to send and view these newbies without losing your jailbreak, and you can. We’ll walk you through the most stable method for bringing iOS 11.1 emoji to lower jailbroken firmwares.
* This technique works on iOS 5.1-10.2, but there are differences between the firmwares. In this guide I focus on iOS 10.0-10.2. For iOS 9 follow the differences mentioned in this guide. Users on earlier firmwares can try a different set of instructions or Bytafont.
* 1) If you don’t already have it, launch Cydia and add this repo:
* https://poomsmart.github.io/repo/
* It belongs to emoji-whizz developer Poomsmart and hosts the packages we need to allow our device to recognise the layout and properties of the newer emoji keyboard.
* 2) Uninstall other emoji theming solutions such as Anemone, Bytafont, and EmojiFontManager. Remember to revert to the stock emoji before doing so!
* 3) Transfer the emoji font file to your device via a method of your choice (AirDrop, email, SSH, etc.) The easiest way to get the iOS 11.1 emoji file is directly from Poomsmart:
* For iOS 10.2+ you want this one.
* For iOS <=9.3.3 you want this one.
* It can also be found at /System/Library/Fonts/Apple Color Emoji.ttc on any Mac running macOS 10.13.1 b2 or later, as well as online, where helpful users have uploaded it.
* 4) Now launch Cydia and install these packages:
* If you’re on iOS 9, install EmojiPort (iOS 9.0-9.3) instead of EmojiPort (iOS 10). If you’re on iOS 9-9.1, add in EmojiLocalization and EmojiResources too.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/10.3-emoji-poomsmart-cydia-1.png)
* 5) Open up Filza and move the iOS 11.1 emoji font file from where you saved it in Step 3 to the folder on your device called /System/Library/Fonts/Core.
* 6) Select the original font files in the folder. There will be one or possibly two, called AppleColorEmoji… Select the Create ZIP option to compress a backup, in case we want to revert later. My iOS 11.1 emoji .zip can be seen below next to the original files.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/10/iOS-11.1-emoji-filza-zip.png)
* 7) Once the backup is made, delete the original emoji font file(s), in preparation to be replaced with our iOS 11.1 version.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/10/iOS-11.1-emoji-filza-delete.png)
* 8) Next, ensure the iOS 11.1 font file is in the folder. If it was zipped up for transfer, unzip it now and move it out of any enclosing folders. Rename the font file to exactly the same as the original file(s) you deleted, whilst keeping its original file extension. This name varies from device to device. For me (iPhone 6 and iPhone 7), it had to be named AppleColorEmoji@2x.ttc, just as the originals were. Your device may not have “@2x” at the end depending on display resolution. If it’s not named identically to the original(s), it won’t work.
* 9) With the original font(s) zipped into a backup and the new, re-named iOS 11.1 file in place, respring the device.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/10/iOS-11.1-emoji-done.png)
* 10) Open a messaging app and change to the emoji keyboard. In some cases, a force restart of the app in question may be needed. Scour the keyboard for the new emoji, and if they’re there, you’re finished!
* 1) Remove the iOS 11.1 font file from /System/Library/Fonts/Core.
* 2) Unzip your original font file(s), which you backed up previously.
* 3) Remove the backup .zip once the original files are unzipped and loose.
* 4) Uninstall any and all of the following packages you have in Cydia:
* 5) Respring and verify your emoji are back to the iteration that shipped with your installed firmware.
* All done! You can now view the new additions in any app, including third-party ones, as well as send them. No need to lose your jailbreak to communicate the concepts of “broccoli” and “lotus pose”.
* Need more help? Don’t be shy.

