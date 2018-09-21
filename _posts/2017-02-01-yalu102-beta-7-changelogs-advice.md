---
layout: post
title: Yalu102 beta 7- changelogs and installation advice
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/yalu102-beta-7-header.png)
* In a post from a few days ago, I outlined the changes which had been made to Luca Todesco’s yalu102 tool as it passed through its beta builds, which at that point had reached Beta 3.
* The jailbreak tool is now on its seventh iteration, and in this article I’ll outline the changelog for each beta, as well as my opinion on the tool’s current state.
* Beta 1: Initial release. Updated from the previous tool for iOS 10(.1(.1)), and with the addition of functional Cydia Substrate.
* Beta 2: Support for devices with a 4k memory page size. Initial support was for 16k devices only, which is the iPhone 6s and newer. This beta brought support to the iPhone 5s, iPhone 6, etc.
* Beta 3: Fixes for interfacing with the Apple Watch.
* Beta 4: Do not use this beta as it had issues. It has now been superseded. 
* Patches the vulnerability used by yalu102 in the first place. This means that the tool now fixes the exploit it uses to jailbreak after jailbreaking, protecting you from similar attacks in the future.
* Adds tihmstar’s nonceenabler into the jailbreak. This means that Prometheus users won’t have to manually add nonceenabler as part of the process on devices jailbroken with yalu102.
* Changes the listening port for DropBear. DropBear is an SSH equivalent bundled with the jailbreak and initially could be connected to over wifi, allowing your phone to be compromised if you had not changed your SSH passwords. It now only listens over USB by default, so is safer. However, you should still change the default passwords for SSH, as it is good practice and will prevent someone connecting your phone to a computer from accessing your device.
* Brings tfp0 support allowing for the use of many powerful tools which require it, Prometheus being an obvious example.
* Adds JIT support, for emulator developers.
* Beta 5: Do not use this beta as it had issues. It has now been superseded. 
* Attempted fixes for Beta 4.
* Beta 6: Stability fixes for Betas 4 and 5. The tool has now probably reached final stability.
* Beta 7: Support for the iPad Air 2 and iPad mini 4. It now supports all 64-bit devices except for the iPhone 7 and iPhone 7 Plus.
* That brings us up to date. Todesco has stated that the stability of the tool is unlikely to increase from here on in, so you should be safe to try out the jailbreak now if you like. Follow our how-to guide which will take you through the process.
* In my experience, and from what others have reported, the jailbreak is now stable. I have not had any problems with it so far, and it performs at least as well as my iOS 9.3.3 jailbreak. However, that may be because I do not yet have the same number of tweaks applied, and it has not undergone as much use yet.
* In any case, yalu102 is now far more stable than its predecessor for iOS 10.0-10.1.1 ever was. Remember, do not install incompatible tweaks, or ones which have not yet been updated or tested. A prime example is AppSync, which will currently boot loop your device. As long as you’re careful, you should not get into any difficulty.
* Future betas have little more to add to the tool, except for one important thing: support for the iPhone 7 and iPhone 7 Plus on iOS 10.0-10.1.1, which I’m sure many of our readers are craving. Aside from that, remaining changes will be minor, with the inclusion of a mixtape rumoured, as well as perhaps a feature which prepares a nonce of your choosing on each boot. This could serve as a safeguard, allowing Prometheus to restore boot looped devices using an .shsh2 file which matches the nonce set by the jailbreak. We have yet to see whether this will be added to the jailbreak itself, released as a tweak, or even materialise at all.
* Have you tried out yalu102 yet? Were you waiting for the go-ahead from us here first? Let me know your experiences with the jailbreak below.

