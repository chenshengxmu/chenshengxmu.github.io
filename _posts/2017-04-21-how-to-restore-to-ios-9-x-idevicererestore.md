---
layout: post
title: How to restore your device to iOS 9.x with iDeviceReRestore
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/32-bit-downgrade.jpg)
* A while back we broke the story of a bug which was allowing restores to iOS 9 firmwares, without even needing a jailbreak. It was subsequently discovered that the bug was more far-reaching than originally thought, allowing restores to iOS 9.x from any firmware, not just from iOS 9.
* The tool was released a week or so ago, and so we thought the time was right for a tutorial. Follow our instructions here to bring any 32-bit device back to any iOS 9.x firmware you have blobs for, from any starting firmware. No keys, bundles, nonces, or jailbreak required!
* Before we begin, let’s go over the ground rules. As ever, there are some restrictions and requirements which dictate whether or not this will work for you.
* 1) Download the iDeviceReRestore .zip and expand it. Rename the expanded folder to iDeviceReRestore and place it on your Desktop.
* 2) Place your downloaded IPSW loose into the iDeviceReRestore folder.
* 3) Place your iOS 9.x .shsh blob into /iDeviceReRestore/shsh.
* 4) Rename your IPSW to something simple. I renamed my iOS 9.3.4 IPSW to 934.ipsw. This step is optional, but makes things easier.
* 5) Rename your .shsh file to the form ECID-Model-Firmware.shsh. For example, mine was called 2588516246720-iPad2,1-9.3.4.shsh. Make sure the name uses dashes, not underscores, and that you remove the build ID from the filename if it has it.
* 6) The contents of my iDeviceReRestore folder now look as below:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Screen-Shot-2017-04-20-at-02.59.14.png)
* 7) Connect your device to your computer, and put it into DFU mode. If you don’t know how, take a look at this. When it’s in DFU mode iTunes will report it as in Recovery Mode, but the screen will be black rather than showing the “Connect to iTunes” graphic.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/iDeviceReRestore-DFU-mode.png)
* 8) If iTunes launches and reports this, click OK, and then quit iTunes. Do not click Restore, Update, or anything else in iTunes.
* 9) Launch Terminal from /Applications/Utilities, or via Spotlight.
* 10) At the prompt, type cd and then drag your iDeviceReRestore folder onto the Terminal window, as shown below. Hit Enter to set Terminal to our chosen directory.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Screen-Shot-2017-04-20-at-02.59.36.png)
* 11) We’re ready to go! Enter the following command to run iDeviceReRestore:
* ./idevicererestore -r YOUR-IPSW-NAME.ipsw
* Replace YOUR-IPSW-NAME with the name of your IPSW from Step 4. For example, my IPSW was called 934.ipsw, so my entire command looked as in the picture below:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Screen-Shot-2017-04-20-at-03.05.21.png)
* Let the tool do its thing. It will exploit the re-restore bug to push your chosen iOS 9.x firmware to the device. With the help of your .shsh blob, the device will accept it, and a normal restore will begin. The output will look roughly as below. You’ll know when it’s finished, as Terminal will report DONE, and your iOS device will reboot to the setup screens.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Screen-Shot-2017-04-20-at-03.09.25.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Screen-Shot-2017-04-20-at-03.13.19.png)
* Fin. You can now jailbreak with Pangu, or Home Depot, depending on which firmware you’ve restored back to. Enjoy your jailbreak! If you ever get into trouble and need to restore, just use this bug again; you’ll always be able to return to iOS 9 from now on, as long as you keep your iOS 9.x blobs.
* Let me know if you have any difficulties or success stories, and good luck!

