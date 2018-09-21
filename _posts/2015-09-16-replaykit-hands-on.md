---
layout: post
title: Hands-on with ReplayKit, a new iOS 9 framework that lets you record and share gameplay
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/ReplayKit-Logo.png)
* If popular services like Twitch and YouTube Gaming have taught us anything, it’s that gamers love recording their games, and people love watching said recordings. Building on that popularity, Apple’s ReplayKit, announced at WWDC 2015, is a new iOS 9 framework that lets developers incorporate the ability to record gaming playback and commentary for saving and sharing online.
* Today, some of the first games with ReplayKit support were made available on the App Store. In fact, Apple has an entire App Store section dedicated to ReplayKit enabled games.
* How does ReplayKit work, and is it any good? Have a look at our synopsis for all of the details.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/From-Skitch.png)
* When you launch a game with ReplayKit built in, you’ll see a record button somewhere within the interface. The record button is a non-standard button in a non-standard location that incorporates in-game textures, so it’s likely that it’ll look different for every game. This can be both a good thing and a not-so-good thing, depending on how well-designed the game’s textures, layout, and other assets are.
* The first time the record button is tapped, you’re met with a pop-up confirmation box asking you to allow screen recording for the game in question. Users have the option of allowing Record Screen & Microphone, Record Screen Only, or disallowing all forms of recording. Choosing the Record Screen & Microphone option lets gamers provide voiceover commentary along with gameplay, much like you see with Twitch.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/ReplayKit-PopUp.jpg)
* Unlike offerings from YouTube Gaming and Twitch, however, gamers aren’t yet allowed to embed a video stream from the camera to enhance commentary, but that could very well become a feature in a future version of iOS.
* I tested out three different titles to see how ReplayKit functionality worked in a real gameplay scenario. The first game was Duet Game, a title that involves navigating a pair of balls throughout a mobile maze (full review). It’s a challenging game that requires much hand eye coordination, but it provides a great sense of satisfaction when you make it through a level unscathed.
* To me, this was the perfect game to test out ReplayKit, because it’s the type of title that can drive you a little crazy and make you start to talk to yourself. Here’s a video of one of my recent conquests, complete with commentary:
* To keep the video recording experience as smooth and as seamless as possible, notifications are put on hold while recordings are in progress. Once a video is completed, you’re given the option of sharing or saving the recording to your Photo library. Users will also be able to trim video to perform basic edits, but I was not successful in getting the trim functionality to work properly.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/ReplayKit-Share-Save.png)
* The implementation of ReplayKit, at least at this early stage in the game, is admittedly still young. Opt in for gameplay recordings appears to be valid until a reboot, but it’s possible that there is a timeout threshold as well. Unlike other privacy related opt-in pop-ups, there is no section for toggling ReplayKit in Settings → Privacy.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/ReplayKit-video-quality-inspector.png)
* One nice thing about ReplayKit is that it records videos at native resolution and at 60fps, which is perfect for fast-moving action games. I recorded the Duet Game gameplay on my iPhone 5s running iOS 9, but it means that an iPhone 6 Plus will feature at least 1080p resolution. Thus, ReplayKit is capturing exactly what’s on screen, and not doing any weird downsampling.
* There are other games available on the App Store featuring ReplayKit. I tried Air Wings and Breakneck to name a few. Breakneck allows users to enable automatic recording, which is a feature available to developers in the ReplayKit framework.
* Breakneck and Air Wing’s implementation weren’t as simple and as clean-looking as Duet Game. Thus, the consistency in experience isn’t exactly what I would like it to be. As stated, though, this is just the beginning. ReplayKit is young, but it’s already a pretty awesome add-on for gamers wishing to show off their feats.
* What do you think about ReplayKit? If you’ve used it, feel free to post a link to some of your videos in the comments below.

