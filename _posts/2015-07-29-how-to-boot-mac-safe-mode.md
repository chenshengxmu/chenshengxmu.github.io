---
layout: post
title: How, why and when to boot your Mac in Safe Mode
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/07/OS-X-Yosemite-safe-boot-Mac-screenshot-001.jpg)
* Most of the time, your Mac “just works.”
* But there will be times when a rogue app, a misbehaving service, outdated caches and other issue will cause your Mac to slow, stop starting up or exhibit other unwanted symptoms. Thankfully, Apple has provided a way to boot OS X in Safe Mode.
* In Safe Mode, your Mac prevents some software, such as startup items, from loading. What does get loaded are the bare minimum level of drivers and essential software. This is by design, to help you troubleshoot your Mac and isolate the cause of a software conflict. As a bonus, booting in Safe Mode also forces a check of your startup disk.
* Here’s what you need to know about Safe Mode on OS X, when you should use it and how to startup up any Mac in Safe Mode and get back to normal.
* Like Safe Mode on Windows, OS X’s Safe booting mode was designed for troubleshooting purposes. Not only does starting up in Safe Mode help isolate software issues from hardware failures, but is a recommended way of diagnosing problems should you encounter problems that cannot be fixed any other way.
* Step 1: If your Mac is awake, shut it down by choosing Shut Down from the Apple menu. Otherwise, just power it on and proceed to step 3.
* Step 2: After your Mac shuts down, power it on again.
* Step 3: Immediately after you hear the startup tone, press and hold the Shift key. Do not press the Shift key before you hear the startup chime. You would ideally hit Shift as soon as possible after you hear the startup tone.
* Tip: If you use OS X’s FileVault feature to encrypt the entire startup disk, release the key when your Mac prompts you to unlock the disk, type in your password and press Enter.
* Step 4: Release the Shift key when the desktop or OS X’s login screen appears.
* To exit Safe Mode, restart your Mac like you normally would (choose Apple menu > Shut Down) but don’t hold down any keys during startup. You should be back to your desktop in normal mode.
* Keep in mind that leaving Safe Mode might take longer than it does to boot in normal mode. Just be patient and by no means don’t interrupt the process or hold down the power button to hard-reset your Mac.
* If you are using FileVault, OS X’s built-in disk encryption feature that protects your data from prying eyes, you can still start up in Safe Mode by holding down the Shift key immediately after powering on your Mac.
* However, you might be prompted to log in twice: first to unlock the encrypted startup disk, and one more time to log into the Finder with your user account. If you’re booting in Safe Mode with FileVault enabled on the startup disk, you can let go of the Shift key after you see the first login screen.
* Don’t worry, this is normal.
* Your Mac performs a directory check of your startup disk as part of Safe Mode so it will take a significantly longer time than usual to reach the login screen or the desktop.
* Starting up a Mac in Safe Mode does the following:
* Booting in Safe Mode starts only essential services so some OS X features and apps might not work correctly. Some of the features that are unavailable to you in Safe Mode include the following items:
* More features not listed above might be unavailable in Safe Mode as well.
* If you’re unsure as to whether or not you’re in Safe Mode, take note of the following signs that give it away.
* 1. Menu bar reads “Safe Boot”
* The first indication that you’re starting up in Safe Mode appears when you land on the login screen. If you’re in Safe Mode, the words “Safe Boot” in red letters will appear in the menu bar in the upper right corner of the screen.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/07/OS-X-Yosemite-safe-boot-Mac-screenshot-002.jpg)
* 2. Slower overall performance Past the login screen, you’ll notice slower overall performance. Graphics will no longer be accelerated as default drivers are loaded. The OS X menus, windows and the Dock appear solid even if Translucent Menu Bar is selected in System Preferences.
* Your screen might blink or tear during the login process. OS X menus, the Dock, your desktop and other aspects of the user interface won’t have as many visual effects and translucency will be disabled.
* And as mentioned further below, several OS X features might be unavailable to you in Safe Mode, like watching movies in the DVD Player app, capturing video, connecting to Wi-Fi networks and more.
* 3. Boot Mode in System Information reads “Safe”
* Another method of determining the status of your boot mode involves using the System Information application.
* Step 1: Open System Information from Applications > Utilities. You can also choose About This Mac from the Apple menu and then click the System Report button in the Overview section.
* Step 2: In the lefthand column, locate and click the Software section. You should see a couple related items listed on the right side of the System Information window.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/07/OS-X-Yosemite-safe-boot-Mac-screenshot-003.jpg)
* If the Boot Mode is listed as “Safe” you’re started in Safe Mode. If it reads “Normal,” you’re in OS X’s normal-boot mode.
* Although booting in Safe Mode on a daily basis—or whenever an insignificant problem arises— isn’t recommended, there are definitely instances when starting up in Safe Mode could be your last resort.
* Here are some of the typical scenarios:
* If your Mac doesn’t finish starting up—Certain issues might keep your Mac from completely starting up and using Safe Mode can help you resolve them.
* If an app is causing issues—An app you recently installed might be the culprit, especially if it came outside the Mac App Store. Starting up in Safe Mode might help isolate the misbehaving app as it prevents certain software from automatically loading or opening.
* If your Mac has slowed—Though not as pronounced as on Windows, your Mac amasses temporary files in various caches over time which might slow down the overall performance of the operating system and apps. You can clean up your Mac thoroughly using specialized software like MacPawn’s CleanMyMac.
* Or, you could see if booting in Safe Mode and then back to normal does the trick. As part of starting up in Safe Mode, OS X deletes font caches, Kernel cache and other system cache files which might speed things up a bit.
* If your Mac has directory issues—Many, but not all issues with your Mac’s startup disk can be resolved using the built-in Disk Utility application. If you’re plagued with an issue that cannot be reproduced in Safe Mode but appears to be resolved when you start up normally, chances are it was caused by a cache or a directory issue with your startup disk that Safe Mode fixed.
* Just don’t panic.
* Sometimes OS X might find an issue that it thinks might be fixed in Safe Mode so it’ll decide to restart your computer in Safe Mode. If it finds an issue, the operating system will then repair the directory structure on your startup disk and restart your Mac.
* Tip: Should your Mac repeatedly restart during Safe Mode it could be suffering from a hardware problem, in which case you should contact Apple Support.
* Safe Mode isn’t magical and won’t fix all the problems you may encounter in daily use. If booting in Safe Mode doesn’t help resolve whatever issue might be plaguing you, try disabling Startup Items.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/07/OS-X-Yosemite-safe-boot-Mac-screenshot-004.png)
* Jeff has the full tutorial on that, but it boils down to this: open System Preferences, choose Users & Groups and select items under the Login Items tab then click on the ” – ” icon to remove them one by one. Restarting upon removing each item is a great way to identify the misbehaving app.
* If you like this tip-to, please pass it along to your friends.
* Have a great tutorial idea?
* Feel free to submit your suggestions to tips@iDownloadBlog.com and we’ll take your best and brightest ideas into account for future articles.

