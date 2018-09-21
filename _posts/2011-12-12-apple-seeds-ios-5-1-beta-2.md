---
layout: post
title: Apple Seeds iOS 5.1 Beta 2 to Developers
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/12/5.1-beta-2-e1323717838941.jpg)
* Apple has released iOS 5.1 beta 2 to developers. The update comes exactly two weeks after the company seeded the original version of the iOS 5.1 beta.
* The new software is expected to feature a number of bug fixes and additions, including a sufficient patch for the long-time running battery bug and a rumored Siri enhancement. We’ve got the full change log…
* Notes and Known Issues The following issues relate to using the 5.1 SDK to develop code.
* Accounts When creating an iCloud account, you can use any Apple ID as long as it is a full email address and not a MobileMe account. If you have a MobileMe account, you can move that account to iCloud. You can find more information at: http://me.com/move
* APIs • The NSNetService class and CFNetService APIs do not include P2P interfaces by default. To browse, register, or resolve services over P2P interfaces, an application needs to use the Bonjour DNSService*() APIs noted below. • Setting the interfaceIndex parameter to kDNSServiceInterfaceIndexAny in the following API’s will not include P2P interfaces by default. To include P2P interfaces, you must now set the kDNSServiceFlagsIncludeP2P flag when usingkDNSServiceInterfaceIndexAny or set the interfaceIndex to kDNSServiceInterfaceIndexP2P. The affected APIs are:
* GameKit FIXED: App icons and profile photos are not loading in apps using Game Center.
* iCloud Photo Stream NEW: Photos taken using iOS 5.1 can be deleted from Photo Stream on your device and will be removed automatically from Photo Stream on your other iOS 5.1 devices. Older photos can be manually deleted from your iOS 5.1 devices.
* iCloud Storage • Provisioning profiles must be enabled for iCloud in the iOS Provisioning Portal. To enable a provisioning profile for iCloud, navigate to the App ID section of the iOS Provisioning Portal and configure your App ID for iCloud. After enabling the App ID for iCloud, regenerate your provisioning profiles to enable them for iCloud. • The setSortDescriptors: method of NSMetadataQuery is not supported. • In iOS 5, files that are protected via Data Protection cannot be used with iCloud Storage APIs. • File names are case-insensitive in Mac OS X but case-sensitive in iOS. This can lead to problems when sharing files between the two using iCloud. You should take steps on iOS to avoid creating files whose names differ only by case.
* Movie Player Starting in iOS 5.0, in order to facilitate finer-grained playback control, a movie player is not automatically prepared to play upon creation. Call the prepareToPlay method to prepare the movie player. For more information, see MPMoviePlayerController Class Reference
* Music Player Using shake-to-shuffle causes Music app to freeze and playback to stop.
* Security In iOS 5, signing certificates with MD5 signatures is not supported. Please ensure that certificates use signature algorithms based on SHA1 or SHA2.
* Setup Assistant NEW: Immediately after completing the Setup Assistant, it may re-appear and show the wifi screen and/or final “Thank You” screen. The workaround when in this loop is to reboot the device.
* SpringBoard Lock Screen NEW: The lock screen can intermittently get in a state where double-clicking the home button will no longer bring up the camera button. To get out of that state, you need to restart the device.
* As you can see, Apple finally added a way to delete Photo Stream photos without having to reset anything. Any photos take with an iOS 5.1 device can be deleted from Photo Stream individually.
* iOS 5.1 beta 2 is available now for the iPhone, iPad, and iPod touch to folks with developer accounts. Be sure to let us know if you notice any other major changes in the update.

