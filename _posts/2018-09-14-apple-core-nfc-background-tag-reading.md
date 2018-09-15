---
layout: post
title: New iPhones can read NFC tags in the background, no app needed whatsoever
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/09/Core-NFC-Background-Tag-Reading-slide-001.jpg)
* The new iPhone Xs and Xs Max, as well as a colorful family of the new iPhone Xr handsets, include advancements in near-field communication (NFC) technology that allow the handsets to automatically read nearby NDEF (NFC Data Exchange Format) tags and send any collected assets to appropriate apps without needing to open any specific app beforehand.
* Before this change, users were required start an NFC reader session from an app.
* As highlighted in the “What’s New in Core NFC” video available on Apple’s developer site, the Core NFC framework has introduced a brand-new feature, called Background Tag Reading.
* A developer document explains how the feature works:
* On iPhones that support Background Tag Reading, the system scans for and reads NFC data without requiring users to scan tags using an app. The system displays a pop-up notification each time it reads a new tag. After the user taps the notification, the system delivers the tag data to the appropriate app. If iPhone is locked, the system prompts the user to unlock the phone before providing the tag data to the app.
* Background Tag Reading can read NDEF-formatted tags of type 1 to 5.
* To prevent potential security issues stemming from background tag reading, explicit user action is required before the system passes any collected NFC data to an app. Specifically, the user must tap the NFC notification in order to avoid performing an action accidentally.
* A system like that would allow, say, metro passes to work with a simple tap and go.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/09/Core-NFC-Background-Tag-Reading-slide-003.jpg)
* The document suggests that background NFC tag reading is supported only by the new iPhone Xs, Xs Max and Xr: “iPhone X and earlier devices don’t support background tag reading.”
* According to the iPhone Xs/Xs Max and iPhone Xr tech specs, the handsets support NFC with reader mode and NFC for Apple Pay, like previous models.
* If an NFC tag includes an underlying Apple Universal Link URL, iOS will automatically send data to the right app without any intervention on the user’s part. Otherwise, an NFC link is simply passed to Safari. On new iPhones, these embedded links can automatically trigger actions such as starting a HomeKit setup process, preparing a text or a FaceTime call and more.
* In terms of strengthening your security and bolstering privacy, iOS is smart enough to prevent Background Tab Reading from working in the following situations:
* In other words, Core NFC reads tags in the background only when your iPhone is in use—i.e. the Lock screen is on, the Home screen is displayed or you’re happening to use an app.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/09/Core-NFC-Background-Tag-Reading-slide-005.jpg)
* Because not all Apple devices support background tag reading, developers are recommended to implement the option to read tags directly from their app as a fallback scenario.
* NFC made its iPhone debut during the September 2014 iPhone 6 introduction.
* Dedicated NFC hardware would subsequently get added to all later iPhone and Apple Watch models.  At first, functionality was exclusive to stock apps and features, like Wallet and Apple Pay. On Apple Watch, NFC is also used for pairing with workout equipment via GymKit.
* Last year’s iOS 11 update added support for uses of NFC besides Apple Pay, including new end-user capabilities like easier setup of HomeKit-based smart home appliances with QR Codes and NFC.
* TUTORIAL: How to set up your HomePod
* Users could also bring their iOS device close to another NFC-enabled Apple gadget, like Apple TV or HomePod, in order to securely transfer their Apple ID credentials and other accounts and settings—they’re calling this Automatic Setup.
* The arrival of Core NFC in 2017 finally opened up NFC hardware to app makers.
* It was rather limited in its inaugural version, permitting app developers to tap into the iPhone’s NFC chip for basic stuff like scanning for and reading nearby tags.
* NFC can also be used to unlock hotel doors that support the feature.
* In the opening intro to the iPhone Xs keynote that I embedded right above, Apple Watch chief Kevin Lynch can be seen unlocking the Steve Jobs Theater stage doors with a tap on his wrist. This isn’t just a cinematic depiction: Apple employees are already using their iPhones and Apple Watches to unlock doors securely, all thanks to NFC.
* A May report by The Information said that iOS 12 would open up NFC to third-party developers even further, so they could create NFC apps that would act as a hotel door key or as a virtual transit card for easier transportation.
* As other recent reports have stated, it might not be too long before you can use your iPhone’s NFC to lock, unlock, start the engine, as well share access to your car.
* What are your thoughts on background reading of NFC tags with new iPhones?
* Let us know by leaving a comment below.

