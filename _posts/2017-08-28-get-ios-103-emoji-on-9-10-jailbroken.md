---
layout: post
title: How to get the iOS 10.3 emoji on your jailbroken device
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Unicode-9-emoji-image-001.jpg)
* If you’ve had trouble enabling the latest emoji using Bytafont, Anemone, or EmojiFontManager in the past, this guide is just what you need! These theming solutions are prone to quirks, and may not work at all (ahem, Bytafont) on higher firmwares.
* The purpose of this guide is twofold:
* 1) To update your emoji from your current firmware’s (iOS 9 or 10.0-10.2) to those included in iOS 10.3+.
* 2) To avoid most of the more common installation problems you might encounter using other methods.
* The changes between iOS 10.2 and iOS 10.3 are incredibly small, as shown in the image below:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/emoji-changes-10.2-10.3.png)
* Consequently, it might not be worth following this guide if you’re jailbroken on iOS 10.2, unless you have to have the absolute most recent revision. Of course, if your current theming solution is giving you bugs or performance issues, you should try this anyway.
* Users on iOS 10.0-10.1.1 or below will gain all 72 new iOS 10.2 emoji by following this guide, plus the small changes above. They have good reason to give this a go, especially if they have emoji bugs with their current setup.
* A final bonus of this method is that it will work with the iOS 11 emoji once they are available. Simply swap in the iOS 11 emoji font file for the iOS 10.3 one once it is released.
* This method will work from iOS 5.1-10.2, but has small differences between firmwares, so in this guide I will concentrate on instructions for iOS 10.0-10.2. To install on iOS 9, carefully follow the differences mentioned in this guide. For even earlier firmwares use this manual page or try Bytafont.
* 1) First, launch Cydia and add the following repo:
* https://poomsmart.github.io/repo/
* Poomsmart’s repo contains the various packages we need to allow our device to handle the layout and attributes of the iOS 10.2+ emoji keyboard.
* 2) If you haven’t already, disable emoji theming in Anemone, Bytafont, and/or EmojiFontManager. Once the emoji are reverted to the stock ones for your firmware, uninstall BytaFont 3 and/or EmojiFontManager from Cydia (you can leave Anemone if you use it to theme other UI elements). If you were using EmojiFontManager, you should also uninstall all of its dependencies with it, such as EmojiLibrary, EmojiAttributes, etc.
* 3) Now uninstall any previously downloaded emoji font files from Cydia, to ensure they do not interfere. This includes fonts made for Bytafont, EFM, and Anemone. This step is optional, but rules out conflicts later on.
* 4) Transfer the iOS 10.3 emoji font file to your device via a method of your choice (AirDrop, email, SSH, etc.) The newest iOS 10.3 emoji file can be found on any Mac running the latest Sierra or High Sierra at /System/Library/Fonts/Apple Color Emoji.ttc, or online.
* If you’re happy with the slightly older (but very similar) iOS 10.2 emoji, they can be downloaded directly from Poomsmart’s GitHub:
*  
* 5) Now launch Cydia and install these packages:
* If you’re on iOS 10.2, you do not technically need to have any of the items above except Filza (and the iOS 10.3 emoji font file itself). However, if you want to use the iOS 11 emoji in future you will need the packages above, so you may as well install them now as they will do no harm. If you’re on iOS 10.0-10.1.1, you need the packages above regardless.
* If you’re on any iOS 9, install EmojiPort (iOS 9.0-9.3) not EmojiPort (iOS 10). If you’re on iOS 9-9.1, you also need EmojiLocalization and EmojiResources. iOS 9.2+ do not need these two extra packages.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/10.3-emoji-poomsmart-cydia-1.png)
* 6) After installing and respringing, launch Filza.
* 7) Move the iOS 10.3 emoji font file from wherever you saved it to the folder on your device called /System/Library/Fonts/Core. You can see the 10.3 .zip I have moved into the folder in the picture below.
* 8) Now select the original font files which are in the folder. There will be either one or two, and they will be called AppleColorEmoji… Select them and compress them into a .zip file.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/10.3-emoji-poomsmart-filza-1.png)
* 9) Call the .zip of the original fonts something like ORIGINAL FONTS DO NOT DELETE.zip and leave it there. This is so we have a backup to put back in future if necessary. You can see the backup .zip in the image below.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/10.3-emoji-poomsmart-filza-2.png)
* 10) Once the backup .zip is made, delete the original emoji font files from the folder, ready to be replaced by the iOS 10.3 one.
* 11) Now make sure the iOS 10.3 emoji font file is in the folder, and is named exactly the same as the files you just deleted. For example, on my device it had to be named AppleColorEmoji@2x.ttc just like the original version was. If your device is not retina, it might not have “@2x” at the end. Check the original file name if you’re not sure. If it’s not identically named, it will not work.
* 12) Once the original font files are safely zipped into a backup, deleted, and the correctly named iOS 10.3 font file is in place, respring your device.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/10.3-emoji-poomsmart-examples.png)
* 13) Open any messaging app and swap to the emoji keyboard. Check that the keyboard is displaying correctly, and you’re finished!
* 1) Delete the iOS 10.3 font file from /System/Library/Fonts/Core.
* 2) Unzip the original font files which you left in the folder as a backup.
* 3) Delete the backup .zip once the font files are unzipped from it.
* 4) Open Cydia and uninstall any of the following packages you may have:
* 5) Respring and check that your emoji are back to normal again.
* And that’s all there is to it. These packages are useful in that they also allow you to view newer emoji in messages received on your device, and third-party apps such as Twitter and Safari. Enjoy expressing such emotions as “Facepalm” and “Rofl”, without giving up your jailbreak to do it!
* When the iOS 11 emoji are released in a firmware, it will be possible to update to them by simply swapping the iOS 10.3 emoji file for the new one, provided you have followed this guide and installed Poomsmart’s packages.
* Need any further help? Do you need a guide for emoji on another version of iOS? Speak up.

