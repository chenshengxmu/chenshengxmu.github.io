---
layout: post
title: New in iOS 10.3- name and shame list for outdated 32-bit apps
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/iOS-10.3-Settings-App-Compatibility-section-iPhone-screenshot-001.jpg)
* Apple today seeded a third beta of iOS 10.3 to members of the Apple Developer Program. It’s nothing to write home about in terms of new stuff, with the notable exception of a curious new section suggesting that iOS 11 is likely going to be 64-bit only. The first beta of iOS 10.3 introduced a reworded prompt when launching 32-bit apps.
* In iOS 10.3 beta 3, there’s now a dedicated section within the Settings app where any outdated apps installed on the user’s device are named and shamed.
* If you venture to Settings → General → About → Applications, you’ll notice the newly added section, aptly titled App Compatibility.
* It’s a shame list of sorts designed to give the user a clear overview of all the legacy apps installed on their device. Hopefully, it will give developers a pause and remind them that leaving apps languishing without compatibility updates isn’t very user-friendly.
* “These apps may slow down your iPhone and will not work with future versions of iOS if they are not updated. If no update is available, contact the app developer for more information,” reads the feature’s description.
* Tapping one of the listed apps brings up its App Store page where you can see information like version number, when it was last updated and so forth.
* Subscribe to iDownloadBlog on YouTube for more videos like this.
* iOS includes separate 32-bit and 64-bit versions of the system frameworks. Legacy 32-bit apps affect the performance of 64-bit iOS devices (like iPhone 5s and iPad Air onward) because they cause iOS to load 32-bit versions of the kernel, libraries and drivers on top of their 64-bit counterparts which are loaded by defauly.
* When all apps running on a device are compiled for the 64-bit runtime, iOS never loads 32-bit versions of the kernel, libraries and drivers. In other words, the system uses less memory and launches apps more quickly.
* Because Apple’s stock apps already support the 64-bit runtime, it is to everyone’s benefit that all apps running on 64-bit devices be compiled for the 64-bit runtime, especially apps that process data in the background.
* As of June 1, 2015, Apple requires that app updates be submitted with full 64-bit support. Apple’s transition guide details porting apps to 64-bit architecture.
* Are you excited for the new App Compatibility name and shame section in iOS 10.3?

