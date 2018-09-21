---
layout: post
title: iOS 6.1 battery problems may be related to Exchange bug
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/10/ios-6-exchange.jpg)
* Yesterday, we reported that Vodafone UK has been sending out text messages to its iPhone 4S subscribers, warning them not to upgrade to iOS 6.1. The update is said to contain a bug that affects the handset’s 3G performance, and subsequently its battery life.
* But the issue appears to be more widespread than that. We’ve received a number of comments from readers, that aren’t in the UK and don’t have a 4S, that are seeing similar battery life problems. And it’s been discovered that Exchange might just be the culprit…
* 9to5Mac reports that AOL Corporate has informed its employees that it has temporarily disabled the ability to manage meetings via mobile devices due to a bug in iOS 6.1. Apparently an Exchange server glitch is causing poor device performance and battery life.
* Here’s an excerpt from an internal email by AOL CIO Michael Freker:
* “We have researched this problem and it appears to be connected to a recently identified issue that seems to cause these iOS devices to continuously loop while synchronizing a recurring calendar meeting invitation. Similar problems have been reported by a number of sources to several media outlets across the Web in the past few days.”
* He’s right, even outside of the aforementioned Vodafone report, a number of users have come forward since the iOS 6.1 update to complain of battery life and performance problems. One thread on Apple’s support forum, ‘iOS 6.1 Battery Life,’ is closing in on 20,000 views.
* Everyone seems to be seeing the same thing: after updating to iOS 6.1 on their iOS device (all iOS 6 devices are mentioned), they’re noticing an enormous drop in battery life. And they all have similar solutions, which involves deleting and re-adding Exchange accounts.
* Here’s one popular answer/solution from the thread:
* “The Official Solution from an unnamed source within that fruit company in Cupertino:
* The bug in iOS 6.1 is a ping-pong infinite loop trying to talk to the Exchange server. Unfortunately, just rebooting doesn’t fix the issue. Deleting the account is necessary to remove the problematic invitation response from the queue.
* The workaround is annoying, but effective:
* – Delete your Exchange account
* – Recreate the Exchange account
* – Do not respond to meeting invitations from the device until 6.1.1 comes out.”
* Thinking about it, this sounds awfully familiar to an Exchange bug we reported on back in October—the one where declining a meeting invitation from an iOS 6 device would send out meeting cancellation notices to a company’s entire Exchange distribution list.
* Anyway, there’s no word yet on a fix, but Apple did seed its first beta of iOS 6.1.1 to developers this week. It just better make sure it does something fast, because for a company that’s quickly becoming the go-to choice for BlackBerry’s fleeing enterprise users, frequent Exchange issues just aren’t going to cut it.
* Have you been experiencing battery problems on iOS 6.1?

