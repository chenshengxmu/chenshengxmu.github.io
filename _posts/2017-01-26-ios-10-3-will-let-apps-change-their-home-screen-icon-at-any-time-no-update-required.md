---
layout: post
title: iOS 10.3 will let apps change their Home screen icon at any time, no update required
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/App-Store-Feaetured-tab-teaser-001.jpg)
* Tucked away amid a flurry of new reports covering upcoming new features in Apple’s operating system updates, like Theater Mode on Apple Watch and Siri in watch apps, Night Shift on Mac and Find My AirPods on iPhone, Apple yesterday quietly announced that developers will soon be allowed to change their app’s Home screen icon programmatically, whenever they like.
* In other words, an update is no longer required to push out the new icon artwork.
* The seemingly unimportant change opens up a world of new possibilities for interactions with your favorite apps that simply were not possible before.
* Taking advantage of the iOS 10.3 SDK, developers can now use a new Instance method to specify the primary app icon as well as one or more alternate icons.
* iOS developer Steve Stroughton-Smith explained that apps must ask your permission before changing their icon. Granting permission yields an alert like the one you see below, informing you of an icon change.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/iOS-10.3-app-icon-change-alert-iPhone-screenshot-001.jpeg)
* It’s unclear if this dialog only shows on the first icon change an app performs.
* To be fair, I’m not sure consent is required given the fact that this already happens when apps get updated and most users don’t pay attention to their app updates anyway.
* Stroughton-Smith put sample app switching code on Github for everyone to see.
* Interestingly, icon changing is disabled for devices enrolled in educational programs.
* Stroughton-Smith claims that an app cannot change its Home screen icon unless it’s visible on the screen, but that might easily change down the road as Apple updates the SDK.
* By adding multiple app icons to an app, developers are able to change their app’s Home screen icon during promotional periods like holiday sales. Theoretically speaking, games can change their icon based on your progress while weather apps may show a different icon based on the current weather conditions.
* Or, an app for college students could change the icon after you select your school. In another example, a music app may display an alternate icon to indicate it is playing a song in the background and so forth. Lastly, and I’m only speculating, changing app icons could pave the way to the sought-after Dark Mode in iOS.
* Bottom line: when iOS 10.3 releases, some iPhone, iPad and iPod touch apps may include multiple icon artwork and change their Home screen icon programmatically if certain conditions are met.
* Aside from being able to use multiple app icons, developers will soon be able to respond publicly to user reviews on App Store and Mac App Store.
* Going forward, app makers may be required to exclusively implement Apple’s new App Reviews API to standardize in-app prompts asking you to provide feedback.
* No more than three such popups per year per app will be allowed.
* Users will be able to turn off these prompts completely on a system-wide level within the Settings app in iOS 10.3 and in System Preferences in macOS Sierra 10.12.4 when these operating system updates release for public consumption.
* Source: Apple via Steve Stroughton-Smith

