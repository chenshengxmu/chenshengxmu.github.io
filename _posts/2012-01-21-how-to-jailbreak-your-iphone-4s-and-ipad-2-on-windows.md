---
layout: post
title: How to Jailbreak Your iPhone 4S and iPad 2 on Windows
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/Windows-CLI-Tool.jpg)
* Windows users, your time is here! The iPhone Dev Team has released a CLI tool update that adds support for Windows users.
* This tool will allow you to perform an untethered jailbreak on both the iPhone 4S and iPad 2 using the Windows command prompt.
* Check inside to download version 0.4.3 of the CLI tool, and for a step-by-step tutorial that shows you how.
* Notes: Before you start, remove any passcode protection you have on your device. This will save you a lot of headaches. Also, be SURE your have you device plugged in, Windows recognizes it (you should have iTunes installed for the necessary drivers), and you run CMD as an admin. In fact, it may be good to just reboot your computer cleanly just in case. Most importantly, read and watch the tutorial before beginning.
* Step 1: Download and extract version 0.4.3 or later of the RedSn0w CLI tool to the root of your hard drive from the Downloads Page.
* Step 2: Connect your iPhone 4S or iPad 2 to your Windows computer.
* Step 3: Open a command prompt with administrator privileges, and navigate to the download directory of the cinject_0.4.3 folder. (This directory could vary depending on where you extracted the folder. Keep this in mind, and act accordingly.)
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/Run-CMD-as-administrator.jpg)
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/cinject-cli-01.jpg)
* Step 4: Execute the following commands:
* cinject -i payloads/jailbreak.mobileconfig
* After this command, you will see a Install Profile prompt on your iPhone 4S or iPad, be sure to tap Install and then Next on the prompt on your iPhone 4S or iPad 2 to accept the profile.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/Install-Profile.jpg)
* Now continue to type the following in your command prompt:
* cinject -j payloads cinject -w
* Step 5: On your iPhone 4S, go to Settings > Network > VPN, and toggle the VPN setting on. It will load a bit, and then you should get the following: “A configuration error occurred.” That is normal, just proceed with the tutorial.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/A-configuration-error-occurred.jpg)
* Step 6: After a few seconds, your iPhone should reboot, and you’ll notice errors in the command prompt window, this is normal. It should look similar to what’s in the README file that came with the exploit download.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/iPhone-4S-Jailbreak-Reboot.jpg)
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/cinject-cli-02.jpg)
* Step 7: After toggling, eventually you should see something like this:
* Jan 21 08:44:46 iPhone cleanup[208] : Removing WebClip Jan 21 08:44:46 iPhone jb[195] : 2012-01-21 08:44:46.473 cleanup[208:707 ] Removing WebClip Jan 21 08:44:46 iPhone jailbreak[195]: Installing filemover…
* After you see that, unlock your iPhone 4S or iPad 2, and you should see Cydia on the desktop.
* That’s it, that’s how you jailbreak the iPhone 4S or iPad 2 using the CLI from the Dev Team. If you have questions, comments or concerns leave them for us below. We highly recommend watching the video tutorial above, which gives a in-depth overview of the CLI tool for Windows users.
* Are you happy to have the A5 untethered jailbreak on Windows?
* Update: Many users are reporting a “Send1: Response too large” error. If that happens, many report that unplugging the USB cable, and plugging it back in works. Let us know.
* Update 2: If you have a lot of content on your device, it may cause the jailbreak to run slow, or at times even fail with errors. You may be better off backing up your device, restoring to a clean install of iOS 5.0/5.0.1, jailbreaking using this guide, then restoring. It’s worth a shot if you’ve exhausted all other options. For what it’s worth, we personally recommend doing it this way.

