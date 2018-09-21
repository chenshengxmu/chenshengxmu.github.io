---
layout: post
title: 3 ways to prevent iTunes from automatically backing up your iOS device
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/08/iTunes-12.2-for-OS-X-icon-full-size.png)
* Whenever you make important changes to your iPhone, iPod touch, or iPad, and then plug it into your Mac or PC with iTunes installed, iTunes may launch and attempt to automatically sync and back up your device.
* If you don’t want your device to back up on your computer automatically because it takes too long due to how much stuff you have, then be sure follow the steps we’re about to show you in this tutorial.
* Although it’s generally a good idea to back up your devices frequently in case of failure, some people would rather do it manually because they have a lot of data on their devices and iTunes will go on for ages before it actually completes the backup process and can move on to syncing.
* Another thing is, backing up will hold everything up. If you’re in a hurry to go somewhere, and iTunes is holding you up and backing your device up, it’s going to frustrate you.
* The last major thing I can think of is if your computer is running out of space and you know you have a lot of photos or videos on your device and you just don’t have the room to store such a backup. Disabling this automatic backup will prevent that precious storage on your Mac from disappearing when it doesn’t have to.
* Since some people like to manually control some things for their own good, this tutorial is going to show you three ways to keep iTunes from automatically syncing your iOS device when you plug it into your Mac or PC and launch iTunes.
* One way to keep iTunes from automatically backing up your device when you launch iTunes with a device connected is to set iTunes so that your device backs up via iCloud instead.
* Although this feature still technically backs up your device, it will not hold up your iTunes experience and will keep your device from automatically backing up on your computer.
* To do this, follow these steps:
* 1) Connect your iOS device to your Mac or PC.
* 2) Launch iTunes on your computer (for some, it may launch automatically after step 1).
* 3) Click on the Device button on the top left of the app.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/iTunes-Device-Top-Left.png)
* 4) From the device information screen in iTunes, select iCloud from the backup options and then click on the blue Done button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/iPhone-backup-to-iCloud-instead.png)
* 5) When prompted about applying the changes, click on the blue Apply button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/Apply-Changes-in-iTunes.png)
* Now when you plug your iPhone in to your computer to sync it with iTunes or to charge it while iTunes is open, your device won’t sync with iTunes anymore. Instead, it will back up to iCloud, which won’t get in the way of transferring information back and forth with your device.
* Another thing to note is that backing up only occurs in iTunes when you sync your iOS device with it. So you can actually prevent iTunes from automatically backing up your device by preventing your device from being automatically synced when it’s plugged in and iTunes is launched.
* To do this, follow these steps:
* 1) Plug your iOS device into your Mac or PC.
* 2) Launch iTunes, and then open the iTunes preferences. On a Mac, go to iTunes > Preferences in the Menu Bar.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/iTunes-Preferences.png)
* 3) In the preference window, click on the Devices tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/iTunes-Devices-Tab-Settings.png)
* 4) Put a check mark in the box entitled “Prevent iPods, iPhones, and iPads from syncing automatically” and then click on the blue OK button.
* Now your device won’t automatically sync when you plug it in an launch iTunes, which means it shouldn’t automatically back up with iTunes either. It’s like magic!
* If you don’t really want to use either to back up your device, you can also use Terminal to handle the situation.
* Ah… good ol’ Terminal! I know lots of advanced Mac users are going to love this approach even more.
* To turn off automatic iTunes backups with Terminal on your Mac, follow these steps:
* 1) Close and Quit iTunes on your Mac.
* 2) Launch Terminal and enter the following command:
* defaults write com.apple.iTunes DeviceBackupsDisabled -bool true
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/Disable-Device-Backup-With-Terminal-Mac.png)
* 3) Press the return key on your keyboard to execute the command.
* 4) Restart your Mac. It’s good practice to do this after a command like this, but you can also probably get away with the killall Dock command.
* Note: You can re-enable automatic backups in iTunes by using the same command above and replacing -bool true with -bool false.
* For some people, automatic backups via iTunes are just not the best thing in the world to have enabled. There are certainly different ways to disable automatic backup via iTunes when connecting your iOS devices to your Mac or PC, as we’ve outlined in this tutorial.
* Also read:
* Do you like having automatic device backups in iTunes? Share in the comments!

