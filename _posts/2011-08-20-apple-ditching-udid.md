---
layout: post
title: Apple Ditching the UDID for iDevices in iOS 5
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/12/UDID-e1292882803383.png)
* A subtle change has been noticed in the iOS 5 beta. Apparently, Apple is changing the way that developers can access an iDevice’s unique identifier number. For those unfamiliar with the concept, a ‘UDID’ allows developers to identify app users on a specific, device by device basis.
* In iOS 5, Apple is no longer allowing developers access to an iDevice’s UDID, but instead allowing developers to create app-specific UDIDs. This basically means that mobile ad and game networks won’t have access to your device’s specific number for tracking and inventory, which is the means that these systems have always worked off of in the past.
* As TechCrunch notes, app developers will now have to start over from scratch to keep track of users in iOS 5.
* Apple describes the change in its developer documentation:
* Deprecated in iOS 5.0
* uniqueIdentifier An alphanumeric string unique to each device based on various hardware details. (read-only) (Deprecated in iOS 5.0. Instead, create a unique identifier specific to your app.)
* The UDID is a huge tool for ad agencies when tracking mobile devices. If an iPhone has a unique identifier, that device’s (and its user’s) usage can be tracked from app to app. This system will no longer be in place for developers to take advantage of when iOS 5 hits the public this Fall. Essentially, ad agencies will only be able to track users through ‘web cookie’ of sorts, instead of the root-level method that’s currently used with a UDID.
* Apple could theoretically prohibit third party developer access to UDIDs, but leave the serials available to Apple’s own networks, like Game Center and iAds. This move would give Apple’s proprietary technology an advantage on the iOS platform.
* AppleInsider notes that this change in iDevice recognition will also heavily integrate with iCloud this Fall:
* “The change will occur alongside the appearance of iCloud, which will allow apps that the user approves to share a unique key across devices using iCloud’s new Documents and Data feature. For example, a developer can use iCloud to customize the appearance or state of their app across the users’ devices by sharing key value data in the cloud.”
* Another issue to wonder about is how this will effect the beta testing of third party apps. Currently, devs can send out UDID-specific copies of their apps to beta testers, but that could all change post-iOS 5.
* Apple looks to be changing this protocol as a security act of good measure, and it will also promote iOS as a privacy conscious platform.
* iOS developers: Why do you think Apple made this move in iOS 5? “Security” consciousness? Something else? We’re curious to hear your thoughts.

