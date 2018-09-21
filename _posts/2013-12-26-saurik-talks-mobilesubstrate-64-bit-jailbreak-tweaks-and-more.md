---
layout: post
title: Saurik talks MobileSubstrate, 64-bit jailbreak tweaks and more
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/12/Cydia-iOS-7-Featured.jpg)
* The unexpected arrival of an iOS 7 jailbreak has been a welcomed touch to the holidays for most iPhone, iPad and iPod touch users, except for those with the latest devices. The all-new iPhone 5s, iPad Air and second-generation iPad mini, each powered by an Apple A7 chip, have faced compatibility issues with most popular jailbreak tweaks. Thankfully, that shouldn’t be the case much longer… 
* Cydia founder Jay Freeman (saurik) is currently working on an update to MobileSubstrate, a framework for code modification that is used by most jailbreak tweaks. That update is required because of the new 64-bit architecture that A7-powered devices use, versus the 32-bit technology that older-generation devices have. When that new version of MobileSubstrate arrives, the next step will be for developers to recompile their iOS tweaks and extensions.
* Freeman spoke to me about the technical details of this change:
* All of Apple’s programs are [now] 64-bit and will require 64-bit extensions. Luckily, an extension can trivially be both 32-bit and 64-bit in the same way apps can, but this will require the developer to recompile them.
* He also elaborated about what role MobileSubstrate plays in this process:
* Substrate is a platform for injecting code into another process, and a library that injected code can use to modify its host program. Any “tweak” that is in fact a “substrate extension” (or anything attempting to be remotely as powerful as a substrate extension) will have to be recompiled.
* It is important to distinguish that a Substrate extension is “code that runs in a process and extends its behavior and modifies its logic,” whereas a jailbreak tweak in general could be as simple as a package that changes an iOS plist file. This is the reason that some Cydia tweaks work with 64-bit devices like the iPhone 5s, yet others don’t.
* Freeman neglected to provide an ETA for the MobileSubstrate update, citing that he wouldn’t give one even if the release was five minutes away. The technology consultant already moved insanely fast to push out a new Cydia version for iOS 7, so the best thing is to give him patience with Substrate. Perhaps take a look at Zeppelin or BiteSMS while you’re waiting.

