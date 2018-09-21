---
layout: post
title: How to save jailbreak tweaks on your device with redeb
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/redeb-header.png)
* Sometimes a developer’s repo goes down, they withdraw a tweak, or they update the tweak on their repo and don’t leave your favoured previous version up. In these cases, you may want to save the tweak to your device so as to have it for later use.
* The trouble is that Cydia removes the install files, saved in .deb format, after it has finished installing the tweak to your device. So unless you save the .deb file after you download it from Cydia, but before it installs (which is unlikely as it’s cumbersome and easy to forget to do), you would seem to be out of luck. But are you? In this guide, we’ll show you how to repackage already installed tweaks into .deb files for safekeeping, using redeb.
* 1) Open up Cydia on your device, and navigate to the Sources tab.
* 2) Hit the Edit button in the top-right of the screen, and then Add in the top-left, to add a new source.
* 3) Enter the following source, and then press Add Source to add it:
* https://wiety.github.io/cydia/
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/1-2.png)
* 4) Now navigate into the added source or use the Search tab in Cydia to search for the tool we want to use: redeb.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/2-2.png)
* 5) Install the tweak by navigating to its Cydia page and pressing Install in the top-right, followed by Confirm in the top-right of the installation screen.
* 6) Now search Cydia again for MTerminal, and install that in the same way we installed redeb. (If you have another preferred Terminal app for iOS, feel free to use that instead).
* 7) Now that we have our Terminal app and redeb installed, we can begin saving tweaks. Open your Terminal app (MTerminal &c.) to begin.
* 8) At the Terminal prompt, type the word redeb to invoke redeb, and press the Enter key.
* 9) It will inform you that you didn’t specify a package ID (a specific tweak) that you wanted to save, and offer to list them all for you. Hit the Y key to agree, and then the Enter key to see a list of all your installed tweaks.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/3-2.png)
* 10) Locate the package that you want to save in the list which redeb outputs. Most are named after the tweak name, but sometimes you may need to know the developer name or repo to identify the tweak you want.
* The exact bundle ID for the package that you need can be found on the tweak’s Cydia page, at the very bottom, next to the repo it is from.
* 11) Make a note of the line number next to the tweak you want to save, and then type it into Terminal, followed by the Enter key. This will prompt redeb to begin re-packaging and saving your tweak in .deb format.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/4-2.png)
* Note that some tweaks are composed of more than one package, and may have two or more entries on your list. Always check for extra lines in the list, with a similar name. These may also be required for the package you are saving to work when re-installed. If you find extra entries, simply repeat the saving process for those lines too, and keep them all together once saved for future use. The same applies to packages with dependencies (other packages they require to function). You will need to save all of a tweak’s dependencies too to be sure of the tweak working correctly when installed on a blank device.
* 12) Terminal will now show redeb saving your tweak file to:
* /private/var/mobile/Documents/Redeb/debs/YOUR_TWEAK_NAME
* This is where you will have to go to find your saved file. This folder can be navigated to with any iOS file manager. You may leave the .debs there for later use, or move/save them from there to another location for safekeeping.
* 13) And that’s it! You may now close your Terminal app and go about your business with a glint in your eye and a spring in your step, if necessary. To install tweaks you have saved previously with redeb, simply select them in a file manager, and hit “Install”. A full explanation of how to do this can be found in my iOS File Manager guide.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/6-1.png)
* Was this guide useful? Which tweaks do you have which are no longer available, and need to be saved for posterity? Let me know your use-cases below…

