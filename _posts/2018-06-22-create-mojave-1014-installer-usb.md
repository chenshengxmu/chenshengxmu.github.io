---
layout: post
title: How to create a macOS Mojave Installer on a USB drive
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/06/macOS-Mojave-Installer.png)
* In this guide we’ll go through how to create an install drive from the macOS Mojave 10.14 Beta application. This will allow you to perform clean installs, install to multiple machines without re-downloading, boot the system externally for troubleshooting, and more. This guide will work with both the Public and Developer Beta seeds.For this guide, you’ll need the Install macOS Mojave Beta application from the Mac App Store, and a USB stick/SD card/external drive partition with capacity >=8GB.
* NB: For now, this article contains only the install command for the Public and Developer Betas. It will be updated with the relevant command for the final release when it becomes available.
* 1) If you don’t already have the Install macOS Mojave Beta application, use either your Apple Developer account to download the Developer Beta Access Utility, or enrol in the Public Beta Software Program to download the Public Beta Access Utility.
* Install whichever flavour of the utility you chose and it will re-direct you to the Mac App Store page for macOS Mojave. Download the full Mojave Beta installer from there.
* 2) When the download completes, your Mac will launch it. Quit the installer, and instead locate it in your /Applications folder. If you’d already placed it somewhere else on your computer, move it back to the Applications folder. It’s also simpler to leave the file name as is: Install macOS Mojave Beta.app.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/06/mojave-install-usb-setup.png)
* 3) Insert your >=8GB drive. If it isn’t formatted to GUID Partition Map and Mac OS Extended (Journaled), you can launch the Disk Utility application and format it from there. This will wipe all data from the drive.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/create-disk-partition-map.png)
* 4) To make this guide a little easier, name the finished USB drive USB.
* 5) Now open up a Terminal session and paste in the following command:
* sudo /Applications/Install\ macOS\ Mojave\ Beta.app/Contents/Resources/createinstallmedia --volume /Volumes/USB --nointeraction --downloadassets
* This will use the Mojave Beta application to create an installer on your chosen drive. The command is the same for both the Public and Developer Betas this year.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/06/mojave-install-usb-terminal-command.png)
* NB: If you renamed the “Install macOS Mojave Beta.app” or your USB drive to something other than what I advised above, you must edit the command to match your chosen names. Similarly, if you moved the installer out of the /Applications folder, you must change the above command to show its new filepath.
* 6) Enter your administrator password when prompted.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/06/mojave-install-usb-done.png)
* When the files are transferred and the drive has been blessed it will be remounted on the desktop, as shown above, and Terminal will read out as complete.
* 1) Shut down your Mac with the USB drive inserted.
* 2) Start up the computer whilst holding the Option (⌥) key.
* 3) Select the drive called “Install macOS Mojave Beta” from the Startup Manager using the keyboard arrow keys. The computer will now boot from the selected drive.
* 4) You can now deploy Mojave as necessary. Using this external USB installer lets you reformat and/or repartition the startup drive and other storage devices. You can also access built-in tools such as Terminal, Startup Disk, and Firmware Password Utility from the menus.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/06/macOS-Mojave-Beta-System-Info.png)
* Have fun testing out the new OS! Although not without bugs, I’ve found it relatively stable for such an early beta, and certainly more attractive than High Sierra was at this point (or perhaps at any point, if we’re being honest).
* If you don’t need it for other purposes, you can store your new USB installer in a safe place. If your Mac gets into trouble and can’t start up to Recovery Mode, boot from the USB drive and troubleshoot the issue, by reinstalling the operating system or leveraging tools like Terminal. You’ll also be able to install Mojave to your other Macs without having to download a new copy of the installer from the Mac App Store every time.
* Need a hand with this, or want to request another guide? Let me know in the comments section!

