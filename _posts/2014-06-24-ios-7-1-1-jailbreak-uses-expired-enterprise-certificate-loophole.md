---
layout: post
title: iOS 7.1.1 jailbreak uses expired enterprise certificate loophole
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/12/Cydia-icon-iPhone-5s.jpg)
* You may remember MuscleNerd as being the head of the iPhone Dev Team, which has been on the sidelines in recent years in favor of the Chronic Dev Team and, later, the evad3rs. Nevertheless, the well-known iPhone hacker congratulated the Pangu Team for its impromptu iOS 7.1.1 untethered jailbreak release, in addition to providing some interesting commentary on how the exploit works.
* According to his tweets, MuscleNerd says that the most unique part of the Pangu jailbreak is that it uses an expired enterprise certificate as an injection vector. He adds that enterprise certificates are something that have been out of bounds for the iPhone Dev Team, due to legal reasons, but he is glad that this method was used rather than the Pangu team burning through something more native and powerful… 
* The use of the (expired) enterprise certificate is the most unique part of Pangu JB (but it’s something we avoid for legal reasons)
* — Ⓜ MuscleNerd (@MuscleNerd) June 23, 2014
* MuscleNerd also claimed that he was unsettled about the Pangu jailbreak executing any scripts or Mach-Os in /etc/rc.d/ on every boot. He added that this functionality should be patched out of the jailbreak, referring to it as something that so-called “script kiddies” would use. Cydia creator Jay Freeman (saurik) quickly chimed in, though, saying that the evasi0n7 untethered jailbreak also ran /etc/rc.d scripts to replace /etc/launchd.conf, making it no less powerful or dangerous.
* @MuscleNerd The evasi0n7 untether also ran /etc/rc.d scripts; this was to replace /etc/launchd.conf, and is not any more powerful/dangerous.
* — Jay Freeman (saurik) (@saurik) June 24, 2014
* All in all, these technical details surrounding the iOS 7.1.1 jailbreak provide some interesting insight into how a jailbreak is executed. Apple has not patched the enterprise certificate loophole that lets you roll back the system time on a device, and perhaps this will make the prospect of an iOS 8 jailbreak one step easier. It is also interesting that the iPhone Dev Team could have potentially used the certificate loophole for past jailbreaks as well, although that is merely speculation.

