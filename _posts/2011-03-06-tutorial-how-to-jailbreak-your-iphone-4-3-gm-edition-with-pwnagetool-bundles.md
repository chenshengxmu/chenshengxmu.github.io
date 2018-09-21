---
layout: post
title: Tutorial- How to Jailbreak your iPhone 4.3 GM Edition with PwnageTool Bundles
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/04/pwnage-tool-ipad.png)
* Apple’s new iOS 4.3 software will launch officially March 11th. For App Store developers iOS 4.3 GM edition (final) is available now. This tutorial will show you step by step how to  jailbreak your iPhone 4.3 GM Edition with PwnageTool Bundles. Unlike the plug and play ease of GreenPoison, this method will require a few extra steps, but nothing too difficult.
* These instructions are for mac OS X users only, but a windows jailbreak shouldn’t be too far off. This is also a tethered jailbreak, meaning that every time you restart your iPhone, you will need to be plugged into your computer. It’s also important to note that although this is the final beta release, it is still a beta, so please proceed accordingly.  Now on to the tutorial!
* Please note that you will need iOS 4.3 GM for this tutorial. It is only available to users with active Apple developer accounts, or that can type ‘download 4.3 GM ipsw’ into google. If you have to download it I suggest you download it to your desktop or the folder you create in step 2.
* Step 1: Make sure your iPhone and iTunes software are up to date (4.2.1, iTunes 10.2)
* Step 2: Download PwnageTool 4.2 from our downloads page. For this particular process you are going to also need PwnageTool Bundles, Universal Ramdisk Maker, and the tethered boot utility. Don’t wimp out on me now, I know it seems like a lot, but download it all into the same folder on your desktop, and you’ll do just fine.
* Step 3: That folder you made on your desktop with all of our tools should have the PwnageTool app in it, right click on it and you should see the option to ‘show contents’. Selecting that will open a folder with all the components that make up PwnageTool. You then click contents -> resources -> firmwarebundles. Now take that pwnagetool bundle (unzip it if you haven’t already, should be 8F190.bundle) and drop it in that ‘firmwarebundles’ folder.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/03/pwnage-contents-730x480.jpg)
* Step 4: Next, make sure the Universal Ramdisk Maker you downloaded is installed (just follow the on screen instructions). Launch PwnageTool in expert mode, select your device, and point it to that 4.3 GM firmware. PwnageTool will now create the custom firmware for your iPhone.
* Step 5: After it is done creating the new ipsw, take note of where it is saved and open up your iTunes. With your device plugged in, hold down the ‘option’ key and click restore. locate your custom ipsw and let iTunes load it up!
* Step 6: Take that custom firmware file we just used and change the extension from .ipsw to .zip and then extract it. Your looking for 2 files, firmware -> dfu -> and yep, those 2 files. copy them. Make 1 more folder and call it “tetheredboot” and paste the files inside it. Now remember that tethered boot utility you downloaded earlier? Extract it and move it into your tethered boot folder, and turn off your iPhone.
* Step 7: Start your mac terminal app and type in:
* sudo -s
* enter your admin password and then:
* ../tetheredboot/tetheredboot
* ../tetheredboot/iBSS.n90ap.RELEASE.dfu
* ../tetheredboot/kernelcache.release.n90
* press enter
* Step 8: After some lines of code it will ask you to put your device in DFU mode : hold power button for 10 seconds -> continue holding power button and press home for 10 seconds, and voila! Just wait and your device will boot in tethered jailbreak mode. Once it’s loaded disconnect and enjoy!

