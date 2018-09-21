---
layout: post
title: iOS 10s Safari improves animated GIF experience, prevents spammy videos from autoplaying
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/01/iOS-7-Safari-app-icon-large-e1442348114864.png)
* Among other enhancements, Safari on iOS 10 boosts the animated GIF experience for iPhone, iPad and iPod touch users while preventing spammy autoplay videos from interrupting your browsing, according to the WebKit blog. On iOS 9, an animated GIF won’t start playing until it’s tapped.
* With the new Safari, silent videos autoplay on webpages when they’re visible because iOS 10 respects their “autoplay” attribute when source video tracks have no audio or have been muted.
* But if a video gains an audio track without user interaction, like those spammy autoplay video ads on websites, playback automatically pauses.
* And to make rendering autoplay videos embedded in webpages as power efficient as possible, iOS 10 only starts playing them when content is visible on screen and pauses them when the video is scrolled out of the viewport.
* iOS 10 also allows web developers to serve up animated GIFs by wrapping them inside HTML’s “video” tag, which helps conserve power, falling back to the actual animated GIF file if its video counterpart cannot be delivered to the user.
* Apple notes that many of the largest GIF providers have been moving away from animated GIFs and toward HTML’s “video” element because the GIF format tends to be “a very expensive way to encode animated images” when compared to a modern video codec like H.264, which on iOS features hardware-accelerated playback support.
* “We’ve found that GIFs can be up to twelve times as expensive in bandwidth and twice as expensive in energy use,” says the firm.
* Support for the “video” tag was first added to Safari on iPhoneOS 3, requiring you to tap a thumbnail to play the clip. iOS 8 relaxed this restriction with the goal of “returning more control over media playback to web developers,” as per Apple.
* Safari on iOS 8 automatically loads just enough media data to be able to determine that media’s size, duration and available tracks, but an action on part of the user is still required to play it.
* These new policies also allow Safari on iOS 10 to support complex webpage layouts, such as painting a playing video to a canvas without automatically taking that video into fullscreen mode, as is the case with current iOS editions.
* Safari on iOS 10 also plays YouTube videos and other clips inline on an iPhone, a much-welcomed change over iOS 9’s default behavior of stopping the playback as soon as the video exits fullscreen mode.
* On the downside, videos that lack a “playsinline” attribute, which has recently been added to the HTML specification, will continue to require fullscreen mode for playback on an iPhone.
* Source: WebKit via 9to5Mac

