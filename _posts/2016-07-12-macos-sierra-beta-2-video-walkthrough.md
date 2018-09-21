---
layout: post
title: Video walkthrough- everything new in macOS Sierra beta 2
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-Auto-Unlock-teaser-002.jpg)
* A second beta of macOS Sierra was released to Apple’s registered developers and public beta testers last week. In addition to turning on an anticipated new feature called Auto Unlock, the second beta of Sierra (build number “16A239j”) packs in iTunes 12.5, Dark Mode assets for some stock apps, a change of the Siri keyboard shortcut—which was clunky to begin with—and more.
* Here’s our video overview of everything that has changed in macOS Sierra beta 2 since its inaugural developer-only release at WWDC 2106.
* Unlike the initial macOS Sierra release, beta 2 is light on new features.
* My colleague Andrew took the new release for a quick spin to present you with a nicely done video walkthrough of all the changes, new feature and refinements available in macOS Sierra beta 2.
* The video runs two minutes and eleven seconds long.
* Don’t see the video? Watch in on YouTube!
* Continue reading further below for the full list of all the changes in Sierra’s beta 2.
* A tentpole feature of macOS Sierra, Siri can now be invoked using a different keystroke than the Function—Space combination utilized in beta 1. To activate Siri on macOS Sierra beta 2, you can now press and hold the Command (⌘)-Space keystroke.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-Siri-teaser-003-e1468361540976.jpg)
* This lets you use the same default keystroke to activate either Spotlight Search or Siri, depending on whether you pressed or pressed and held the above shortcut.
* macOS has always allowed you to customize keyboard shortcuts and Siri is no exception: in addition to selecting between holding Command (⌘)—Space or pressing the old Function-Space combination, you can customize the Siri keystroke to your liking by selecting Customize next to the Keyboard Shortcut heading in System Preferences → Siri.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Siri-customize-keyboard-shortcut-Mac-screenshot-001-e1468361504343.jpg)
* With Auto Unlock, you simply wear your Apple Watch to log into your Mac without typing your account’s password. After enabling the feature by ticking the box next to “Allow your Apple Watch to unlock your Mac” in System Preferences → General, simply walk up to your Mac, wake it from sleep and you’ll be logged in after a second or so via Bluetooth, like magic.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Auto-Unlock-MAc-screenshot-001.jpg)
* It’s a more secure way of getting into your Mac, because it won’t unlock the computer unless you’re wearing an authenticated Apple Watch. You also must be a few inches away from your Mac, meaning no one is able to unlock your unattended MacBook when you’re within Bluetooth range of 30 feet (about nine meters) without risking being spotted.
* You cannot use Auto Unlock to log into your Mac after a reboot or when you manually log out. You also cannot use Auto Unlock from your iPhone, even if it has Touch ID, nor can you use third-party smartwatches with this feature.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-Auto-Unlock-teaser-003.jpg)
* Auto Unlock requires a supported 2013 Mac or newer running macOS Sierra beta 2, an iPhone with iOS 10 beta 2 and an Apple Watch running watchOS 3 beta 2. All devices must use a passcode and be authenticated with the same iCloud account.
* Plus, your Apple ID must use Two-Factor Authentication, not the older Two-Step Verification system. For the complete instructions on migrating from Two-Step Verification to Two-Factor Authentication, check out our preview of Auto Unlock.
* Though not officially a feature, a developer has managed to discover and activate Dark Mode assets in two stock applications on Sierra: Safari and System Preferences. Keep in mind that Dark Mode is headed to public release anytime soon.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-Dark-Mode-System-Preferences-Guilherme-Rambo-001.jpg)
* That being said, Apple has almost certainly chosen to implement this subdued dark appearance in Safari and System Preferences for a very good reason. And if the screenshots are an indication, Dark Mode appears to carry macOS’s existing (and optional) dark appearance beyond just the Dock and the menu bar.
* iTunes 12.5.0.58 appears under the Mac App Store’s Updates tab after updating to macOS Sierra beta 2. By comparison, the current version of iTunes on macOS El Capitan at the time of this writing was 12.4.1.6.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-El-Capitan-iTunes-12.5-about-window-screenshot-001.png)
* Release notes for iTunes 12.5 don’t mention any changes aside from the expected bug fixes and performance improvements, but I was able to stop one minor difference: both the layout and the album size in the Recently Added playlist has changed again.
* Here’s what the layout of the Recently Added playlist currently looks like in iTunes 12.4 on macOS El Capitan.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-El-Capitan-iTunes-12.4-Recently-Added-screenshot-001.png)
* And here’s the tweaked layout with slightly bigger album artwork for Recently Added in iTunes 12.5 on macOS Sierra.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-iTunes-12.5-Recently-Added-screenshot-001.png)
* Another new feature in iTunes 12.5: you can now see works, composers and performers while browsing Classical music in Apple Music catalog.
* After updating to macOS Sierra, an update for the Mac’s Recovery OS appears under the Mac App Store’s Updates tab. The 476-megabyte macOS Recovery HD Update 1.0 includes improvements to macOS Recovery and is recommended for all users running Sierra.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-Recovery-HD-Update-prompt-screenshot-001.png)
* Recovery OS is a hidden partition on your Mac’s startup disk that can be booted into to access essential troubleshooting tools such as setting a Firmware Password and checking media for physical and logical errors via Disk Utility.
* It can also be used to reinstall macOS from either the Recovery partition itself or via the Internet, restore from a Time Machine backup and much, much more.
* Enhancements have been made in usability to AirDrop, with faster and more reliable discovery and transmission between peer devices at distances of up to twenty feet.
* To improve security, SMB connections now require signing by default. VPN connections using PPTP are insecure and no longer supported in Sierra. WebGeolocation now requires a secure (https) website to work on both iOS and macOS to prevent malicious use of location data.
* macOS Sierra and Server 5.2 also sport support for the Xsan 5 file system, which is compatible with the Quantum StorNext 5.3 file system, but upgrade and migration to Xsan 5 is not supported in this release.
* Sierra’s command-line tool “diskutil” can now be used to create an Apple File System (APFS) container on an external hard drive, partition or disk image. APFS is a next-generation file system for Apple devices that’s optimized for flash-based storage and engineered to “scale from an Apple Watch to a Mac Pro”.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-file-System-WWDC-2016-teaser-001.png)
* Some limitations (currently) apply.
* For instance, APFS volumes in Sierra are case sensitive, cannot be shared over the network via AFP, do not support Time Machine backups and cannot be used in conjunction with a Fusion Drive or as a startup volume.
* Learn more about APFS in our in-depth article.
* In addition to rebranding OS X as macOS, Apple’s forthcoming software update brings out a bunch new features for your Mac, including even deeper integration with iOS hardware via expanded Continuity features like Universal Clipboard between iOS and macOS, the ability to unlock your Mac simply by wearing your Apple Watch and more.
* With macOS Sierra, Siri is finally coming to the Mac.
* Thanks to expanded iCloud support, users can now synchronize their Mac’s Desktop and Documents folders to make them available on their iOS device via iCloud Drive.
* Sierra also includes Safari 10 with support for Picture-in-Picture, native App Extensions, Apple Pay on websites, an enhanced Photos app with a new Memories feature that takes advantage of Apple’s on-device object recognition and Differential Privacy.
* macOS Sierra was initially made available as a developer-only preview to members of the Apple Developer Program before releasing to public beta testers in July via the Apple Beta Software Program.
* The OS will release for public consumption this fall as a free software update via the Mac App Store. It has been confirmed to support a smaller number of Macs than prior editions.
* Supported computer models for macOS Sierra, according to Apple itself, include late-2009 and later MacBooks and iMacs and 2010-and-later MacBook Airs, MacBook Pros, Mac minis and Mac Pros. Macs manufactured before 2009 won’t be supported.
* Now that you’ve learned about the changes in Sierra’s second beta, how about checking out the nearly 50 new features, enhancements and tidbits in iOS 10 beta 2?
* We dived deep into Apple’s upcoming software updates to help you understand better any major new features and little things that we think you’ll care about.
* Check out our iOS 10, macOS Sierra, tvOS 10 and watchOS 3 previews:
* Additional previews will be added to these lists as they’re published.
* If you’d like future coverage to focus on specific features, email us at tips@idownloadblog.com. We promise to take any reasonable suggestions into consideration.
* If you manage to spot any tweaks, enhancements or improvements in macOS Sierra beta 2 that have gone under our radar, ping us in comments and we’ll update the article with any new information.
* What’s your favorite new feature in Sierra so far?
* Tell us in comments!

