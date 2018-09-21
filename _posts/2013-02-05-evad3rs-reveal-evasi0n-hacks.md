---
layout: post
title: Planetbeing reveals some of the complicated hacks used in evasi0n
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/EvasionHeader-copy-RESIZE.jpeg)
* This week’s evasi0n release has garnered a lot of attention over the past two days—and not just from folks who intend on jailbreaking. Sites like CBS and DaringFireball, who don’t normally cover the jailbreak scene, are running multiple stories on the hack.
* The consensus seems to be that folks are just genuinely flat-out impressed with the technical aspects of evasi0n, and the team behind it. And for good reason too. Check out this Forbes interview with planetbeing, where he talks in-depth about the jailbreak…
* In the conversation, David Wang (planetbeing) explains that the evasi0n hack takes advantage of at least five bugs in iOS 6’s code. And he notes, for reference, that that’s one more than Stuxnet, the malware developed by the NSA to attack Nuclear centrifuges.
* And when Forbes’ Andy Greenberg asks Wang to walk him through exactly how evasi0n works, he doesn’t disappoint:
* “Evasi0n begins by running libimobiledevice, a program that substitutes for iTunes to communicate with iOS devices via the same protocol as Apple’s program. Using that tool, Evasi0n exploits a bug in iOS’s mobile backup system to gain access to certain settings that it normally shouldn’t be able to access, namely a file that indicates the device’s time zone.”
* The program then inserts a “symbolic link” in the time zone file, which is essentially a shortcut from one place in an OS to another. In this case, it leads to a restricted communications channel, or “socket,” between different programs that evasi0n alters for its benefit.
* “Evasi0n alters the socket that allows programs to communicate with a program called Launch Daemon, abbreviated launchd, a master process that loads first whenever an iOS device boots up and can launch applications that require “root” privileges, a step beyond the control of the OS than users are granted by default. That means that whenever an iPhone or iPad’s mobile backup runs, it automatically grants all programs access to the time zone file and, thanks to the symbolic link trick, access to launchd.”
* These are just a few of the steps mentioned in Forbes’ interview. To read the full article—and we recommend that you do, just to see how much is actually involved in these hacks—click here. It’s crazy to think that by the time it gets to us, we just click a button.
* If you’re interested in checking out the new jailbreak, and for some reason haven’t already, make sure to visit our dedicated evasi0n section. We have step-by-step tutorials on how to jailbreak your iPhone, iPad and iPod touch for both Windows and Mac platforms.

