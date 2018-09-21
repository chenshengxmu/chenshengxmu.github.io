---
layout: post
title: iPhone 3GS untethered bootrom exploit released
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Screen-Shot-2017-04-11-at-16.38.05.png)
* Today saw the release of a new bootrom exploit for the iPhone 3GS, an unpatchable vulnerability which gives jailbreakers total control of this device forever.
* Although the iPhone 3GS is now very much a legacy device and few users will be actively using them, the rarity of a bootrom exploit makes it worthy of note. There have been no publicly released exploits of this kind since limera1n, which supported only up to the iPhone 4.
* Released by Twitter user axi0mX, the exploit is called alloc8, and makes use of a vulnerability in the malloc function in the bootrom. The details of the exploit and how it works can be found on axi0mX’s GitHub page, where there is a comprehensive write-up. The majority of the write-up went over my head, but may prove invaluable to those trying to increase their knowledge of iOS exploitation and jailbreaking in general.
* The original iPhone 3GS had a vulnerability in the bootrom which was exploited by 24Kpwn. Because of the low level nature of bootrom exploits, they give total control over upgrading, downgrading, untethered jailbreaking, and installing of custom firmwares, and are therefore considered incredibly serious by Apple, and incredibly valuable by developers. They can only be patched by a hardware update, not by any software measure or firmware update. No recent jailbreak has made use of such a vulnerability, and none have even been made public for any device since the iPhone 4. 24Kpwn was sufficiently worrying to Apple that they actually released a refresh of the iPhone 3GS halfway through its release cycle, with a new bootrom.
* This new exploit works on both the old and new revisions of the iPhone 3GS bootrom, and due to Apple’s inability to patch or release new revisions, means that the device is now permanently pwned. Doubtless this will mean little to the majority of people for whom the 3GS is now a distant memory, but it could allow for more research to be done into the iPhone’s early boot components, and even if not, is a very impressive feat.
* There have already been reports of the exploit in action, with a downgrade without blobs to an arbitrary iOS version one of the outcomes. I’m sure tinkerers everywhere will enjoy trying out this powerful new release if they have a 3GS lying around. Apparently, while alloc8 works on both revisions of the 3GS, the older 24Kpwn exploit is the faster on the older bootrom.
* Congratulations are in order to axi0mX for this rare achievement, even if we can all lament that this exploit was not for a current device family, as a bootrom exploit for new devices would be an event unheard of in the jailbreak community since limera1n. axi0mX is also responsible for the apticket-nonce-checker tool which I mentioned recently, and is useful for checking the validity of your blobs for use with the Re-restore tool. Clearly, he’s been busy of late.
* Do you still have an iPhone 3GS lying around which you could try this exploit out on? Do you think we’ll ever see another publicly-released bootrom exploit for current devices?
