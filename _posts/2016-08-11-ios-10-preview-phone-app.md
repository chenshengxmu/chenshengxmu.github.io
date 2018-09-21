---
layout: post
title: iOS 10 Preview- Phone gains spam alerts, VoIP integration, transcribed voicemails & more
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iOS-10-Preview-Phone-teaser-001.png)
* iOS 10 turns the iPhone’s boring Phone app into a software platform in its own right. Developers are now permitted to add previously unheard-of capabilities to Phone using Apple’s new application programming interface (API), called CallKit, allowing Voice over IP (VoIP) calls from apps like Skype and WhatsApp to behave like cellular calls.
* CallKit-enabled apps put contact images on the Lock screen for incoming VoIP calls and are deeply integrated with Contacts and Phone’s Recents and Favorites.
* Phone on iOS 10 packs in other exciting improvements that we honestly started to believe would never get implemented on the iOS platform, like voicemail transcription à la Google Voice and third-party extensions for detecting spammy calls automatically.
* So let’s get to it…
* In addition to much tighter VoIP integration than before, iOS 10’s Phone can ask a third-party app to verify if an incoming call is possibly spam. People cards in Contacts have been revamped with blue buttons for calling people via VoIP apps of your choice and your voicemails are now available as speech-to-text transcriptions.
* After testing some of the above enhancements, our video editor Andrew O’Hara has put together a quick video walkthrough for those of you who may not have enough time to read through the whole article.
* The video runs two minutes and 21 seconds long.
* If you don’t see the embedded clip, watch it on YouTube.
* Don’t forget to subscribe to iDownloadBlog on YouTube on your way out to ensure you remain in the loop with the latest in Apple news, jailbreaking, reviews and how-tos.
* Without further ado, here’s everything Apple has in store for the Phone app on iOS 10.
* In the early days of the iPhone, the stock Phone app offered a good enough experience when it came to ordinary cellular calls and their FaceTime counterparts. But as VoIP apps began to take hold, the user experience gradually suffered with each passing day because the Phone app wasn’t extensible at all.
* For instance, apps like WhatsApp couldn’t access your Favorites or the list of recent calls. Calls made in VoIP apps didn’t register in Phone’s Favorites and Recents. You couldn’t call a person via Skype by tapping their screen name in the Contacts app. And worse of all, incoming VoIP calls would show as notifications on the Lock screen.
* This is what folks on pre-iOS 10 releases see when a Skype call comes in.
* VoIP experience on prior iOS editions left a lot to be desired.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/09/Skype-5.5-for-iOS-Lock-screen-Interactive-Notifications-iPhone-screenshot-002.jpg)
* VoIP apps were even not permitted to display a fullscreen photo of the person calling on the Lock screen, let alone offer up iOS’s standard Remind Me and Message buttons. And, worst of all, answering a VoIP call from an app like Facebook Messenger from its Lock screen notification simply took you straight to the app.
* CallKit-enhanced VoIP apps provide the same experience as cellular calls.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-006.jpg)
* With CallKit, Apple aims to solve these pain points in one fells swoop. One of the few new frameworks in iOS 10, CallKit was designed to help developers integrate their VoIP apps tightly with the Phone app and the Lock screen.
* CallKit lets VoIP apps integrate with Phone’s interface, allowing the user to easily access any VoIP-enabled calls in Recents and contacts in Favorites. You can view and answer incoming VoIP calls like you would cellular calls. VoIP calls can be muted, put on hold, switched from audio to video and more—right in the Phone app, using its interface and controls you’re already familiar with.
* VoIP apps integrate with Phone without disrupting its familiar interface.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-002.png)
* VoIP calls are now allowed to associate a phone number with a name in your contacts and Phone is permitted to tap third-party intelligence to warn you that the incoming call from an unknown number is a possible spam.
* Here’s a quick overview of some of the most important features that CallKit enables:
* Just to mention briefly, Apple’s partnership with network giant Cisco will let you receive calls made to your work number right on your iPhone. This integration between the iPhone and the Cisco Spark app will be available when iOS 10 launches next month.
* As mentioned, you can now add your VoIP-enabled contacts to your phone’s Favorites to call them like you normally would. And because VoIP calls now appear in Phone’s Recents, returning a missed VoIP call is as easy as tapping its entry in Recents.
* VoIP calls/contacts integrate with Phone’s Recents/Favorites.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-003.png)
* In addition to placing VoIP calls without leaving the Phone app, iOS 10 provides this elevated experience elsewhere in the system. For instance, VoIP apps which also happen to integrate with Siri will make it easy to call friends and family using your voice (i.e. “Hey Siri, call my Mom on WhatsApp”).
* Flow chart shows interactions between CallKit, the system and a VoIP app.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-007.jpg)
* The ability for Siri to call people on your behalf using a specific VoIP app will prove indispensable for times when you’re using your iPhone hands-free with a Bluetooth headset. CallKit even extends to Apple’s in-car infotainment platform, called CarPlay. With CarPlay, for example, you would tap the Skype icon, or use Siri Eyes Free, to call a desired contact through Skype.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-005.jpg)
* As briefly mentioned, iOS 10 lets you place VoIP calls to people from their contact cards.
* That’s because iOS 10 lets VoIP apps nest their own buttons in contact cards.
* Although the Contacts app has for years supported adding screen names for chat services like Skype, Facebook Messenger, Yahoo Messenger and so forth, you just couldn’t tap someone’s Skype user name to call them on Skype.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-Phone-Contacts-002.jpg)
* iOS 10 lets you do that because interactive buttons for VoIP apps like Skype and WhatsApp now appear on contact cards. Let me state for the record that some of these new CallKit-driven features cannot be tested until first iOS 10-enabled VoIP app updates arrive in the App Store.
* It’s important to note that Apple won’t force you to let any VoIP app integrate with Phone without your permission. Just like you must authorize third-party apps to access your camera or microphone, CallKit-enabled apps will put up a new type of iOS prompt at first run asking for permission to use CallKit.
* Tap OK and the app integrates with Phone.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-VoIP-app-permission-002.png)
* Or, select Don’t Allow to continue using the VoIP app like before.
* I’m not sure who’d want to disallow CallKit access for VoIP apps and live without Phone/Lock screen integration, VoIP entries in Recents/Favorites, spam alerts and other perks.
* Any VoIP apps that you’ve permitted to use CallKit will honor your current Do Not Disturb setting and a list of blocked contacts. Lastly, you can revoke these permissions for VoIP apps by flipping switches in Settings → Phone → Service Providers.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-VoIP-app-permission-001.png)
* Phone spam is a major problem, especially in China where it’s spreading like wildfire. iOS 10’s Phone provides an extension point for specialized third-party apps which can provide information automatically if the incoming call is a possible spam.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-Phone-spam-call.jpg)
* If you missed a call from someone important and they left a message in your voicemail, you can see its transcription in Phone → Voicemail. That’s is cool if you want to see what the call was about without listening to voicemail which, by the way, requires cellular connection to download the audio files.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-Phone-voicemail-transcription-004.jpg)
* Using Siri’s underlying speech-to-text engine, this Google Voice-like feature should do a decent job of transcribing recorded voicemails into text. Just don’t expect the transcriptions to be 100 percent reliable as their accuracy depends on a variety of factors, like pronunciation, call quality, network conditions and so forth.
* At any rate, it’s good to know that your iPhone transcribes voicemail in case you ever need this feature. Apple has said that voicemail transcription will launch in beta.
* Apple’s given the somewhat outdated Phone app a much-needed boost with iOS 10.
* The operating system integrates VoIP apps into all the right places, from your Lock screen to Phone’s Recents and Favorites to people cards in Contacts. And this shall have, methinks, some profound effects on the user experience. No longer will non-techies be wondering why calls from VoIP apps appear as unfriendly Lock screen alerts while FaceTime and cellular calls behave as expected.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-001.png)
* From a usability standpoint, there should absolutely be no difference between cellular phone calls and those made via third-party VoIP apps. Put simply, iOS 10 ticks all the right boxes when it comes to making and receiving calls and it does so without relegating VoIP apps to second-class citizens, like before.
* We’ve explored other aspects of iOS 10 in rich detail:
* For other hands-ons, see our previews of macOS Sierra, watchOS 3 and tvOS 10.
* iOS 10 Developer Preview is available to members of the Apple Developer Program.
* iOS 10 Public Beta is available to non-developers who are signed on the Apple Beta Software Program. The operating system will release as a free update for the iPhone, iPad and iPod touch this fall.
* System requirements for iOS 10 are same as those for iOS 9, with the exception of iPhone 4s, original iPad mini and iPad 2 which are are no longer supported.
* Are you excited about the upcoming changes for iOS 10’s Phone app?
* I must admit I rarely use voicemail so I’m not very excited about voicemail transcriptions. On the other hand, as a heavy user of apps like WhatsApp, Viber and Facebook Messenger I’m very much looking forward to the tight integration between Phone and third-party VoIP apps.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-008.jpg)
* As a cherry on top of the already delicious cake, third-party Caller ID will definitely save me from the frustration of answering a spam call—that’s one less problem to worry about in dealing with persistent spammers.
* What’s your favorite iOS 10 Phone feature so far, and why?
* Chime in and share your thoughts with fellow readers in comments below.

