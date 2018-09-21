---
layout: post
title: Tapping iOS 8 Extensions to offload Apple Watch app processing to iPhone is a smart move
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/10/Apple-Watch-Messages-Emoji.jpg)
* In conceiving a feasible solution to running third-party apps in the extremely constrained power environment of the Apple Watch, Apple has come up with a rather peculiar yet familiar idea.
* Initially, any third-party app processing will be offloaded to an iPhone in your pocket until the Cupertino firm begins accepting fully native Watch apps late next year.
* Such an approach leaves only the app’s storyboards and user interface resources running directly on the Watch, with everything else happening on an iPhone.
* The only exception that proves the rule are Apple’s stock apps which get executed on the Watch itself. In addition to acting as a viewport for third-party apps running on na iPhone, the Watch also manages Notifications and Glances and performs other lightweight housekeeping operations that don’t tax the battery much.
* To accomplish this feat, Apple is leveraging App Extensions in iOS 8 to run third-party Watch apps in a split mode.
* The Apple Watch is essentially a remote display for an iOS 8 extension running on your iPhone, iOS and Mac developer David Smith explained.
* “This is architected in such a way as to enhance interactivity while still keeping the Watch components very lightweight,” meaning Apple is not using AirPlay technology to send Watch apps to your wrist in the form of a streamed movie.
* Yesterday, Apple made a surprise announcement on immediate availability of WatchKit, software that gives developers a set of tools to easily create Glances, Actionable Notifications and other experiences designed specifically for the wrist-worn device.
* Taking advantage of the new App Extension architecture in iOS 8 and offloading processing to the iPhone will result in extremely battery conscious Watch apps from day one, a crucial requirement for such a tiny form-factor device.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/09/Apple-Watch-digital-crown-use.jpg)
* Apple has kept mum on the Watch battery life, indicating only that users are going to need to recharge the device overnight.
* “I suspect the biggest power draw these apps will have is the networking between the iPhone and Watch,” Smith speculates. “However, optimizing the Watch OS for efficient networking is much easier than building an entire, rich SDK that is similarly respectful”.
* Yesterday, I published plenty of previously unknown tidbits about the Apple Watch gleaned from the WatchKit Software, among them are the following items:
* Again, delegating all the work to the iPhone and limiting the Watch to running a storyboard and managing notifications ensures that third-party apps won’t tax the battery.
* It’s a nice trade off between the need to minimize power consumption and Apple’s presumed desire to brag about how many apps are already available when the Watch lands some time in Spring 2015.
* So, while you are going to need to carry an iPhone with you in order to run third-party Watch apps, it’s only a temporary solution until fully native apps start arriving approximately a year from now, ones that won’t require an iOS device as app code will run directly on the Watch.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/Apple-Watch-Watchkit-Framework-slide-001.jpg)
* And because Watch apps are downloaded using the App Store on an iOS device, users won’t have to worry about updating them on their wrist.
* “Apple is keeping their options open for the future rather than over committing now and then tying their hands later on,” Smith summed up. Indeed, the iPhone didn’t get its full software development kit (SDK) until iPhone OS 2.0 so there’s some symmetry to the Apple Watch here.
* Are you concerned about the Watch needing an iPhone to function? And will you buy the wrist-worn device when it arrives or wait for the second generation?
* [David Smith]

