---
layout: post
title: iOS 10 tidbit- apps now must seek permission before accessing your music library
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Music-library-access-permission-image-001.png)
* Apple has made some changes to how iOS handles apps that wish to access users’ music libraries, with iOS 10 now requiring your explicit permission before any app is allowed to interact with your music.
* This new safeguard increases your privacy while ensuring that no app can silently analyze what’s in your music library without you knowing it. Additionally, it makes it more difficult, if not downright impossible, for apps to potentially upload your music library to the cloud in order build a profile of your musical tastes for advertising purposes.
* According to a radar filed earlier in the year, developers are now required to use a new Cocoa key called NSAppleMusicUsageDescription to access a user’s media library on iOS 10 or later.
* NSAppleMusicUsageDescription is also responsible for prompts that seek explicit permission from a user when an app attempts to use their music library.
* From Apple’s documentation for developers:
* This key lets you describe the reason your app accesses the user’s media library. When the system prompts the user to allow access, the value that you provide for this key is displayed as part of the alert.
* To protect user privacy, an iOS app linked on or after iOS 10.0, and which accesses the media library, must statically declare the intent to do so.
* Include the NSAppleMusicUsageDescription key in your app’s Info.plist file and provide a purpose string for this key. If your app attempts to access the media library without a corresponding purpose string, your app exits.
* Apps that have been granted Music library access are listed in Settings > Privacy > Media Library.
* The new privacy requirement for apps accessing your music library is in addition to the existing privacy safeguards for apps that access your contacts, calendars, reminders, photos, location, microphone, camera, HomeKit, Health and motion and fitness data.
* iOS 10 also asks permission when Siri-enabled apps want to use the underlaying speech recognition engine, which sends recorded voice to Apple to process the request.
* Source: MacRumors

