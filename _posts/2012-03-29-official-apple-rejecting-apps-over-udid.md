---
layout: post
title: Tweetbot developer confirms Apple is now rejecting apps over use of UDIDs
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/02/app-store-hits-billion-downloads-670x351.jpeg)
* A report on Monday alleged Apple began rejecting third-party iOS apps that make use of Unique Device Identifiers (UDIDs). Today, developer Paul Haddad confirms that a new build of his Tweetbot app failed to pass Apple’s requirements due to its use of UDIDs. Haddad received an email from the company that cites section 17.1 of the App Store Review Guidelines.
* It states “apps cannot transmit data about a user without obtaining the user’s prior permission and providing the user with access to information about how and where the data will be used”.
* With this app rejection, I think we can safely conclude that developers are now wise to drop UDIDs from their apps. Better late than never, if you ask me…
* Haddad advised over in a blog post:
* If you are an app developer and depend on UDID for any functionality it’s time to migrate away from it, sooner or later Apple will catch you.
* But why did he use UDIDs in the first place?
* We used them only for our push notification services in order to be able to match up a given device to its push notification settings. This allowed us to restore push notifications settings after Tweetbot was deleted and re-installed. With this new change in place this is no longer possible, if you delete and re-install Tweetbot you’ll have to setup your push notification settings again.
* That’s a bummer, but not a major inconvenience in my book.
* Apple wrote in the email message that “to collect personal user data with your app, you must make it clear to the user that their personal data will be uploaded to your server and must obtain the user’s consent before the data is uploaded”.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/03/Tapbots-email-from-Apple-on-UDID-rejection.jpg)
* That’s how things should be, anyway. Unfortunately, if there’s one thing we’ve learned from the past it’s that privacy in mobile is really in its infancy.
* I, for one, am inclined to think that we all benefit when things like the Path scare go mainstream. This raises public awareness and helps folks zero in on the fact that all mobile platforms fail to provide a comprehensive set of controls to inform users how their personal data is being handled.
* Call me an old-fashioned privacy advocate, but I’m shocked apps can suck out my photos up in the cloud without me ever knowing it.
* This?
* That’s a positive step in the right direction, but I’m thinking Apple needs to think of a more general solution than react on a case-by-case basis.
* I’m also tired of apps asking for my Facebook credentials whenever I want to share something. It’s not just inconvenient, such an approach increases security-related risks greatly. I want the operating system to handle my social accounts, not apps.
* And Apple, why stop with Twitter? Let me specify all of my social accounts in Settings, stuff like LinkedIn, Flickr, Facebook and Google+, and require all apps to handle social sharing through system APIs.
* And don’t get me started on apps that store passwords as plain text inside their private Documents folder.
* What’s up with that?
* I know, I’m expecting too much.
* Feel free to vent your frustrations down in the comments…

