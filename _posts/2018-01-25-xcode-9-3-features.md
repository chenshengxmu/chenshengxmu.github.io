---
layout: post
title: Xcode 9.3 lets developers identify battery-hogging iOS apps, test Mac apps in 64-bit mode
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/Xcode-9.3-Energy-Organizer.jpg)
* Aside from previewing the major new features and enhancements coming to your iPhone and iPad this spring via the forthcoming iOS 11.3 software, and releasing a barrage of new OS betas, Apple yesterday also dropped the Xcode 9.3 beta with some interesting new capabilities.
* Among other features, it provides new tools to help developers identify apps using too much battery and test macOS apps for 64-bit compatibility.
* Although Apple’s promised power management, battery health and CPU throttling features are not live in the first beta of iOS 11.3 (they’re coming soon via an upcoming new beta), developers can now take advantage of Xcode 9.3’s new Energy organizer tool to identify if an app or an app extension is using too much power.
* As seen top of post, a misbehaving app that exceeds a reasonable CPU threshold when running in either the foreground or background is captured in the log, making it easier for app makers to pinpoint what precisely is causing battery drain on a user’s device. This feature even notifies a developer about battery usage issues after their app has gone live on App Store, provided the user has elected to share crash reports with Apple and developers.
* The Energy organizer features include:
* Aside from the new Energy tool, Xcode 9.3 brings 64-bit testing mode for Mac apps.
* Apple says that macOS High Sierra is the last release of the desktop operating system to support 32-bit apps “without compromise.” To prepare for a future release of macOS in which 32-bit apps will no longer run without compromise, macOS High Sierra 10.13.4 notifies you upon opening an app that depends on 32-bit software.
* To make sure future releases of their Mac apps are fully 64-bit compatible, developers should the new diagnostic tools in Xcode 9.3 beta and testing on the new macOS 10.13.4 beta. Developers can also use a new 64-bit testing mode in macOS 10.13.4 to test apps for 64-bit compatibility by executing the Terminal command sudo nvram boot-args="-no32exec".
* This new test mode prevents 32-bit processes from launching.
* Launching an app that depends on 32-bit software results in a notification saying the app cannot be opened. Other types of software may fail silently in this test mode, like 32-bit versions of Dashboard and WebKit plugins, preference panes and background processes.
* From Apple’s advisory to developers:
* Starting January 31, new apps submitted to Mac App Store must support 64-bit, and Mac app updates and existing apps must support 64-bit starting June 2018.
* If you distribute your apps outside Mac App Store, we highly recommend distributing 64-bit binaries to make sure users can continue to run your apps on future macOS versions.
* Xcode 9.3 builds 64-bit apps by default and warns you when building for macOS for the 32-bit architecture. Other changes in Xcode 9.3 include a bunch of fixes for bugs, faster compilation times for Swift projects, enhancements for Swift and Apple LLVM compilers and more.
* Xcode 9.3 requires a Mac running macOS 10.13.2 or later. The app includes SDKs for iOS 11.3, watchOS 4.3, macOS 10.13.4 and tvOS 11.3 software development.
* Xcode 9.3 beta can coexist with previous versions of Xcode. Developers can download Xcode 9.3 beta from the Developer Center. Upon final release, Xcode is installed via Mac App Store.
* Screenshot via French blog MacGeneration

