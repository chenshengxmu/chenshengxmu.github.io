---
layout: post
title: Everything you need to know about tihmstars iOS 9.1-9.3.4 jailbreak untether
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/untether-home-depot-cydia.png)
* First things first: do not rush off and install this untether on your devices. It could easily boot loop them. This isn’t a general warning to be ignored; the tool does not support most devices yet, and I will not be held responsible for any damage done by it.
* Having said that, let’s have a gander at this new release, the first jailbreak untether that we’ve seen in quite some time.
* It’s an untether package, available from tihmstar’s repo on Cydia, which will eventually be able to turn devices jailbroken with the Home Depot jailbreak from semi-untethered to fully untethered.
* Currently it only supports iPhone4,1 (that’s the iPhone 4s) on iOS 9.3.4. The device must be jailbroken already with Home Depot.
* No other devices or firmwares are supported at present.
* In theory, it should eventually support all 32-bit devices all the way from iOS 9.1-9.3.4, provided they are jailbroken with Home Depot.
* For now, do not use it unless you have an iPhone 4s on iOS 9.3.4, or unless you have enough expertise to modify it for your device. If you do, simply add the following repo in Cydia:
* http://repo.tihmstar.net/
* And then install the package entitled UntetherHomeDepot.
* It piggybacks off the semi-untethered Home Depot jailbreak, and adds an untether package to it. The untether itself is based on the Pegasus vulnerabilities. Although the Pegasus bugs are well documented, the details of tihmstar’s use of them in the untether are not currently available as he has not open sourced the untether code yet. It remains to be seen whether he will do so at a later date.
* The tool is currently at version 1.2.0, which fixes an issue on devices with a passcode set. Version 1.1.0 rectified a major stability issue with the initial release in which the device going to sleep would make it inoperable. Although these bugs have been fixed, the tool is still not necessarily stable. Unless you have a supported device and/or technical knowledge, exercise caution. An additional known bug is the OpenSSH daemon failing to start. The release tweet gives you some idea of the reliability of the tool at present:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/untether-home-depot-tweet.png)
* If you have enough knowledge of the topic to find offsets for other devices and firmwares, to write a script to automatically find them, or even to troubleshoot the untether itself, then go for it! Check out tihmstar’s Twitter for information on how to find offsets, as well as what kinds of help are needed. Tihmstar has appealed to the community to come together to finish off the untether, in the interest of creating a sense of camaraderie and lightening his workload. Once all offsets are found he plans to incorporate them into the untether package for a final release.
* You can see a video of the untether in action below:
* Although some of our readers will no doubt say that 32-bit devices are no longer of interest to them, many will be glad to see the string of powerful tools which have recently cropped up for legacy devices. From dual-booting utilities and downgrade tools to an iOS 9.3.5 jailbreak and now this untether, it seems there’s some life in the old girl yet.
* Once stability and device support comes to this package another big hole will have been filled in the iOS untethered jailbreak record, which used to cover every device and firmware, but which has recently become more hit-and-miss. It’s also no bad thing to see a developer releasing tools of this kind, showing their growing understanding of the complex and specific materials necessary to create further jailbreaks in the future.
* Do you have 32-bit devices on iOS 9.1-9.3.4 that you’d like to live out their days on an untethered jailbreak? Are you going offset-hunting as we speak? Let me know in the comments.

