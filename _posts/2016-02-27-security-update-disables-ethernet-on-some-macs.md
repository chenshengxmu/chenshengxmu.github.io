---
layout: post
title: Recent OS X security update has disabled Ethernet port on some iMacs and MacBook Pros
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/iMac-late-2015-family-001.jpg)
* In squashing software bugs, you inevitably introduce new ones—that’s a fact of life. According to a thread on Reddit, Apple’s recent OS X security update has inadvertently disabled the Ethernet port for some owners of Apple’s all-in-one desktop and the MacBook Pro notebook.
* Making matter worse is the fact that Apple pushed this security update via the silent updating mechanism, according to a poster on Reddit who probably enabled the option in System Preferences → App Store that prompts OS X to automatically install system data files and security updates.
* The security update in question is labeled “031-51913 Incompatible Kernel Extension Configuration Data 3.28.1” and it apparently blacklists the Broadcom BCM5701 driver.
* Apple has since pulled the update from its servers.
* People who have already installed the update and cannot use their Mac’s Ethernet port as a result, forcing them to use Wi-Fi to get online, should boot into OS X Recovery Mode and restore the following folder from a Time Machine backup or another Mac running the same OS X version:
* /System/Library/Extensions/AppleKextExcludeList.kext
* RELATED: How to start up your Mac in Recovery Mode
* “If this stays broken until Monday there are going to be a lot of pissed off Mac users come next week,” wrote the poster.
* If your Mac is affected, the Ethernet Cards sub-section under the Hardware heading in the System Information window (Apple menu → About This Mac → System Report will read “This computer does not appear to have any PCI Ethernet cards installed.”
* RELATED: How to reinstall OS X in Recovery Mode
* Until Apple provides a fix, affected users can do a basic reinstallation of OS X using the El Capitan installer on a USB thumb drive or reinstall OS X in Recovery Mode.
* RELATED: How to create USB install disk for OS X El Capitan
* Reinstalling OS X won’t delete your personal files or settings.
* “Generally you don’t need to erase your startup disk to reinstall OS X,” explains Apple. “The OS X Installer is designed to allow you to perform an install in place over the same version or earlier versions of OS X.”
* We have reached out to Apple for commentary on the situation and will update this article if we receive their official response.
* Source: Reddit

