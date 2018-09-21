---
layout: post
title: iOS 9 introduces predictive touch technology that should be crucial for rumored Apple stylus
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/WWDC-2015-session-videos-iOS-9-predictive-touch-slide-001.jpg)
* Coincidentally or not, iOS 9 has introduced a trio of notable enhancements in the multi-touch department that could be viewed as laying the groundwork for a rumored Apple-branded stylus thought to arrive later this year alongside a larger twelve-something-inch ‘iPad Pro’ model.
* As one of the WWDC 2015 session videos details, the Cocoa Touch framework in iOS 9 has gained brand new predictive touch capabilities. Not only that, but iOS 9 now has a drawing engine and features vastly improved multi-touch performance, a significant boon for apps that let you draw with your finger or a stylus.
* Designed to improve the speed and accuracy of touch-based input, predictive touch in iOS 9 takes into account parameters like the acceleration, velocity and curvature to predict where the touch is headed and where the next touch point is going to be.
* In touch sensing, there’s some inherent lag between the registered touch event and software response to it. For our technically literate readers, it simply takes time for UIKit to scan the hardware and notify the application of touch events in each screen refresh, so that the application can update its state.
* This lag is hardly an issue for tap-based events like selecting an option in a menu or touching a button.
* While most people will never notice it, the touch-to-display latency can raise its ugly head in drawing-based applications, especially if a user draws with their finger (or stylus) fast enough, yielding inaccuracies that have to be compensated for in software.
* iOS 9 dramatically improves this latency using very sophisticated algorithm that lets apps update their state based on where the touch is going to be rather than where the touch is, resulting in much smoother and more accurate curves in drawing-based apps.
* This WWDC session video shows Jason Beaver, Senior Engineering Manager of iOS Platform Technologies, discussing the intricacies of iOS 9’s predictive touch at mark 13:40.
* In addition to all-new predictive touch, Apple has optimized the entire software stack in iOS 9 to actually reduce the touch-to-display latency in iOS 9 from the industry-leading sixty milliseconds to less than thirty milliseconds in iOS 9.
* Both predictive touch and the reduced touch-to-display latency are most likely limited to recent Apple hardware that, in Beaver’s words, “updates touch events more frequently than the display itself.”
* That being said, predictive touch in iOS 9 is probably our best indication yet that Apple is indeed working on a precision stylus accessory for a rumored bigger iPad.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/Notes-Sketch.jpg)
* Another clue is the much improved Notes app in both iOS 9 and OS X El Capitan which has now gained new tools to make drawings and squiggles with your fingers.
* So a drawing engine, predictive touch, two times better latency… you connect the dots.
* Source: Apple

