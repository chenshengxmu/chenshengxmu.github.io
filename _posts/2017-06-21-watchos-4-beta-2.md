---
layout: post
title: Apple seeds watchOS 4 beta 2 to developers
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/watchos4.jpg)
* In addition to macOS High Sierra and iOS 11, Apple on Wednesday seeded the second beta of watchOS 4 to developers. Developers running the watchOS 4 beta can upgrade to beta 2 via the Watch app on iPhone.
* Introduced earlier this month, watchOS 4 includes several new features and improvements such as new watch faces, a new list-style Home screen, an all-new Music app, new gestures and quick compose in Mail, and more.
* Subscribe to iDB on YouTube
* Here are the release notes for beta 2:
* General
* Resolved Issues
* • The Toy Story watch faces are now available. Toy Story is copyright © Disney/Pixar.
* Apple Pay
* Known Issues • When attempting to add multiple cards during the pairing process, only the last added card will be properly provisioned. (32624044)
* Workaround: Once pairing is complete, go to the Watch app on iPhone and remove previously added cards. Once removed, re-add additional cards as desired.
* Breathe
* Resolved Issues
* • Breathe notification preferences are now respected. (32298347)
* CloudKit
* Known Issues
* • Haptics now play for frontmost apps. (32139107)
* Dictation
* Known Issues
* • Some languages are not available for Dictation on watchOS, including the newly released Shanghainese dictation. (32235495)
* Foundation
* New Features
* • Added support for HTTP brotli content encoding to URLSession. By defaueslt, HTTP requests contain a br value (in addition to gzip and deflate) for the Accept-Encoding HTTP header, informing the web server that the user agent supports brotli encoding. The web server can send an HTTP body with Content-Encoding: br in the HTTP header to indicate that the content is brotli-encoded. URLSession automatically decompresses the HTTP body data and pass the decoded data back to the client in the same way it does for Content-Encoding: gzip. For binary compatibility reasons, URLSession brotli support is enabled only for apps built using the watchOS 4 SDK. (27724985)
* HealthKit
* Resolved Issues
* HomeKit
* Resolved Issues
* • Location-based automation triggers now work if triggered from the alert on Apple Watch. (32288709)
* Messages
* Known Issues
* • Messages may fail to send when responding to Activity notifications. (32294875)
* Music
* Resolved Issues
* • Music tracks now play from and sync to Apple Watch. (32314271)
* Known Issues
* Phone
* New Issues
* • Phone calls using Apple Watch that exceed 30 seconds may fail. (32659453)
* Pairing
* Known Issues
* • Siri requests may fail in the iOS and watchOS simulators. (31971229)
* • Siri may not play music that has been synced to Apple Watch. (31964674)
* SiriKit
* Resolved Issues
* • SiriKit requests no longer fail with a “Sorry I can’t do that” error. (32305639) • watchOS apps from TestFlight or the App Store now work with SiriKit. (32387616) • SiriKit requests on watchOS no longer fail with a Continue in App error. (32355820)
* WatchKit
* Resolved Issues
* • Automatic display of attachments in default WatchKit Notification interfaces do not work. (31589086)
* Workout
* Known Issues
* Resolved Issues
* • Building and running a Watch app from Xcode your app now installs, launches, and attaches. (32180669)
* Known Issues
* • Crashlogs may take a few minutes to sync and be visible in Xcode. (31156191)

