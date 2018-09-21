---
layout: post
title: Apple Quietly Removed the Stealthy Jailbreak Detection in iOS 4.2.1
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/12/worried.jpeg)
* According to certain device management vendors, Apple, without an explanation of any kind, has dropped its own jailbreak detection API from iOS no less than six months after releasing it. The reasons behind this decision are a mystery, as Apple has declined to comment on the decision to abandon the API in the release of iOS 4.2.1.
* Apple’s API let MDM (Master Data Management) applications access core information about the version of iOS running on any given device. Basically, the jailbreak detection API allowed certain applications to ask an iOS system if it had been compromised. Surprisingly, in the newly released iOS 4.2.1, that API is nowhere to be seen…
* Network World gave the details on how this OS jailbreak query works,
* “The new API was part of a bundle of mobile device management (MDM) APIs released in June with iOS 4.0. These APIs were available to third-party MDM applications, such as AirWatch or Sybase’s Afaria.
* With the new APIs, these servers could access directly a range of features and information in iOS or on the device. But in the recently-released 4.2 version, the API intended for detecting jailbreaks has been either removed or disabled.”
* When you jailbreak, you change a number of base operating system files. You also exploit a number of hidden, base OS features to bypass the limitations of only installing content from the App Store.
* This specific jailbreak detection API seemed to only be applicable in an enterprise environment. There are concerns that a jailbroken device could spread malware by granting permission to unauthorized apps with access to the system’s file structure.
* The MDM vendors that Apple originally gave this jailbreak detection API function mainly in the workplace for corporate infrastructure. A jailbroken iPhone has been something that the enterprise world has been nervous about from the beginning.
* Network World explains how MDM vendors tried to detect jailbroken devices before and after Apple’s creation of the short-lived API,
* “Previously, some MDM vendors had created their own series of OS checks to detect jailbreaks, analogous to those performed by an anti-virus application on a PC, to discover if a jailbreak had occurred.
* But the new detection API gave these applications direct access to information in the OS. In theory, the iOS device then “confesses” that it has been jailbroken, thereby triggering automatic responses such as alerting the helpdesk or shutting down access to corporate Exchange Server e-mail.”
* Why Apple discontinued this jailbreak query API remains a mystery. Apple is definitely still sticking to the policy that jailbreaking your iPhone voids your warranty.
* Perhaps Apple’s decision to remove their jailbreak detection API coincides with recent triumphs in the jailbreak community; such as, the Dev Team’s iOS 4 unlock. Apple could be admitting defeat to the jailbreak community by no longer supporting a way of detecting if an iOS device is jailbroken or not.
* Either way, the jailbreak developer community didn’t even bother with trying to fool this jailbreak detection API when it was in use. MuscleNerd, from the Dev Team, tweeted that, “Apple removed their “jailbreak detection API” in 4.2…we didn’t even attempt to fool it (honestly!)”
* What do you think? Why would Apple have abandoned their jailbreak detection API?

