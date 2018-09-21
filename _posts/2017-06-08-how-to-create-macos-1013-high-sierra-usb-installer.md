---
layout: post
title: How to create a macOS High Sierra 10.13 installer on a USB drive
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/macOS-High-Sierra-installer-icon.jpg)
* In this guide, we’ll demonstrate how to create a USB install drive from your downloaded macOS High Sierra software update so that you can install it to multiple machines without redownloading, perform clean install, keep a copy safe for troubleshooting purposes and more.
* All you’ll need for this guide is a copy of macOS High Sierra from Mac App Store and a USB stick or an external drive of at least 12GB capacity.
* NOTE: This article originally provided instructions for creating a USB install drive from a developer-only beta of macOS High Sierra. It has since been updated with appropriate instructions for the public macOS High Sierra release.
* 1) Download the High Sierra installer from Mac App Store.
* When the download completes and your Mac launches it, quit the installer and check that it’s still in your /Applications folder. If it is elsewhere on your computer, move it to the Applications folder. This tutorial will be marginally easier if you leave the file name as the default: Install macOS High Sierra.app.
* 2) Insert your >=8GB USB stick. If the stick is not already formatted as GUID Partition Map and Mac OS Extended (Journaled), launch the Disk Utility application and format it thusly. This will wipe all data from the drive.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/create-disk-partition-map.png)
* 3) Name the USB drive “USB”. This will make the guide marginally easier. Make sure there are no other volumes mounted with the same name.
* 4) Open a Terminal window and paste in the following command to move the installer to the USB drive and make it bootable:
* sudo /Applications/Install\ macOS\ High\ Sierra.app/Contents/Resources/createinstallmedia --volume /Volumes/USB --applicationpath /Applications/Install\ macOS\ High\ Sierra.app --nointeraction
* 5) Press Enter to execute the command and, if asked, type in your administrative password.
* NOTE: If you renamed the “Install macOS High Sierra.app” in your Applications folder (or your freshly formatted USB thumb drive) to something other than what I advised, you must edit the command to reflect your chosen names. If you moved the installer out of the /Applications folder against my advice, you must edit the command to reflect its current location.
* The USB drive will be unmounted throughout the process and will disappear from the desktop. Terminal will provide a readout of the progress; be patient!
* Once the files have been copied and the USB drive has been made bootable, the drive will reappear on the desktop and Terminal will inform you that the process is complete.
* To use the USB installer, simply insert the USB drive and start up or restart your computer whilst holding the Option (⌥) key. This will take you to the Mac’s built-in Startup Manager that lets you pick a startup drive for the computer at boot time.
* It should look like this.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/macOS-High-Sierra-USB-disk-Mac-startup-screen.jpg)
* Select the drive entitled “Install macOS High Sierra” using the arrow keys on the keyboard, then press Enter. The computer will boot from the USB drive and take you to the install screen.
* From there, you can now deploy High Sierra as you see fit. Starting up your Mac directly from the USB installer also lets you reformat or reparation the startup drive or other storage device, or access other built-in tools by choosing them from the menus.
* As mentioned before, having a USB installer for macOS High Sierra allows you to perform clean install or install the operating system to multiple Macs without having to separately download a copy of the installer from Mac App Store for each computer.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/macOS-High-Sierra-installer-Mac-screenshot-002.jpg)
* Don’t forget to store the USB drive in a safe place for troubleshooting purposes. In case your Mac goes south and you cannot start it up in Recover Mode, simply boot it from your USB drive to reinstall the operating system or access tools such as Disk Utility or Terminal.
* Have you tried out installing macOS from a USB thumb drive? If so, I’d love to know your thoughts so far in the comments section below.

