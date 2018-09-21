---
layout: post
title: Traces of Preview, TextEdit, standalone iTunes Radio and Siri API discovered in iOS 8 code
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iOS-8-screenshot-Healthbook-Preview-TextEdit-icons-tessaer-001.png)
* As a prominent iOS developer noted on Twitter, looks like Apple is actually toying with a standalone iTunes Radio app, as previously suspected.
* In addition, Apple looks to be prepping new stock iOS 8 apps – TextEdit and Preview – as well as potentially enabling third-party Siri access.
* Code hooks and hidden assets discovered in the iOS 8 Beta code seem to support these findings, largely corroborating much of the earlier findings by prominent Apple blogger Mark Gurman.
* Note that this is no guarantee that Apple will roll out these features – that is, it will only introduce them when they’re ready for prime time. For example, The New York Times previously reported that split-screen functionality didn’t make the cut in iOS 8. With that in mind, it’s fairly safe to speculate that Preview, TextEdit, third-party Siri access and a standalone iTunes Radio could be slated for the iOS 8.1 update…
* iOS developer Hamza Sood discovered mentions of the rumored Preview iOS app in the .plist file which defines default app mappings for the Continuity feature.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/Previe-iOS-8-code-hook-Hamza-Sood-001.jpeg)
* The same file makes a passing mention of TextEdit for iOS.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/TextEdit-iOS-8-code-hook-Hamza-Sood-001.jpeg)
* And a standalone iTunes Radio app.
* And also looks like there’s a standalone iTunes Radio app there. @markgurman strikes again
* — Hamza Sood (@hamzasood) June 10, 2014
* For good measure, the .plist file also mentions GarageBand for iOS (available in the App Store) so you’ll be able to seamlessly transition between mobile and desktop GarageBand app, too, using the new Continuity feature.
* As for Siri controlling other apps, Hamza speculated that the new ‘UIApplicationLaunchOptionsSiriTaskKey’ string could quite possibly be part of a Siri API aimed at third-party apps.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/Third-part-Siri-iOS-8-code-hook-Hamza-Sood-001.jpeg)
* He went on to caution that this string may not have do to anything with Siri’s ability to control various home automation features through Apple’s new HomeKit smart home platform.
* To anyone who thinks that’s for HomeKit, the whole point of HK is a common protocol, so Siri can do stuff itself (i.e. not launch an app)
* — Hamza Sood (@hamzasood) June 9, 2014
* What’s particularly interesting is the mention of the Healthbook app Gurman was talking about in the run-up to WWDC 2014.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/Healthbook-iOS-8-code-hook-Hamza-Sood-001.jpeg)
* As you know, Apple revealed a new Health iOS 8 app last week with a different user interface than that mocked up by Gurman and friends over at 9to5Mac.
* The name change put Gurman on the defensive, prompting him to give the following explanation:
* While Apple did, indeed, announce a health tracking application and an API for partners to hook into, the interface did not match up with our screenshots from March.
* The reason, a source confirmed this week, is that Apple revamped the user-interface and dropped the “Healthbook” name late in development due to the leak. While the icon and interface is new, the entirety of the earlier reported functionality and in-app graphics are identical.
* The young blogger went on to suggest that many Apple employees he spoke to agreed that the original (leaked) Healthbook UI is “far superior in usability” versus the current look.
* This prompted prominent Apple pundit John Gruber to opine on his Daring Fireball blog that it doesn’t work that way:
* Let me get this straight.
* Apple completely scrapped a superior interface to Health because Mark Gurman published screenshots back in March.
* That is to say, Apple cared more about the surprise of revealing a never-before-seen Health interface during the keynote than they cared about the actual design quality of an interface that will be used by hundreds of millions of iOS users for years to come.
* Gruber contributed Gurman’s explanation to his youth, which “has led him into the solipsistic trap of thinking that his personal perception of Apple — as a guardian of secrets — accurately reflects Apple’s actual institutional priorities, when in fact nothing, not even secrecy, trumps design in the halls of Cupertino”.
* Back to the aforementioned findings.
* Third-party access to Siri has been years in the making, according to multiple sources, so we do expect that Apple will at some point permit third-party developers to hook into Siri.
* Apple could also release Preview and TextEdit apps as optional downloads in the App Store, but that would fly against the decision to include iBooks, currently an optional download in the App Store, as part of the stock iOS 8 offerings.
* Hamza also found other interesting strings in the iOS 8 SDK hinting at scrollable Control Center toggles and a customizable Lock screen, (possible) support for theming in iOS 8, a car-finding feature in Maps, the useful split-screen view for apps and more.
* Anyway, what do you guys make of this?

