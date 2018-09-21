---
layout: post
title: A closer look at iOS 7 parallax effect
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/06/iOS-7-parallax-teaser-001.png)
* Apple’s iOS 7 aims to delight through subtle use of lively user interface animations and effects, employing physics, translucency, smoked panels and other visual tricks to achieve its multi-layered appearance. Among them is the so-called parallax effect that creates a sense of dimension by putting your Home screen icons onto a layer separate from your background image.
* It comes to life when moving your device around, which tilts the wallpaper behind the icons slightly. The effect is also observable in a few other places throughout the system and is coming to your favorite apps via new APIs in iOS 7. If you’ve ever wondered about the science behind the magic, here’s your answer…
* A quick visit to Apple’s iOS 7 web page reveals little about the technology:
* iOS 7 takes full advantage of technologies in iPhone, iPad, and iPod touch to push the iOS experience further. Distinct and functional layers help create depth and establish hierarchy and order.
* The use of translucency provides a sense of context and place. And new approaches to animation and motion make even the simplest tasks more engaging.
* Before we dive into the science behind the magic, check out Jeff’s  video showcase of the parallax effect in iOS 7.
* Developer Marco Tabini lays the process out in a post over at MacWorld.
* Long story short, iOS 7 couples input from the iPhone’s gyroscope and accelerometer sensors with some clever coding and a technology that was originally conceived for rocket guidance in order to create perception of perspective.
* When you rotate the device around any of the three angles of motion, a gyroscope sensor inside your iPhone  tends to resist the change in orientation because of Newton’s First Law of Motion.
* This allows the hardware to measure the speed and direction in which the phone or tablet is being rotated.
* Working in concert with a few additional sensors called accelerometers, the gyroscope allows the device to understand the changes in its relative position with a reasonably good level of accuracy.
* “Coupled with an educated guess about where you tend to keep your phone during use,” he explains, “this makes the parallax illusion possible”.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/06/iOS-7-parallax-teaser-002.jpg)
* But it’s not just your Home screen – iOS 7 uses the parallax effect when navigating open tabs in Safari, throughout action sheets such as the Share sheet.
* My favorite implementation is how the wallpaper image zooms in slightly when tapping a folder. It’s another trickery necessary in order not to break the illusion that iOS 7 icons are suspended mid-air.
* Apple also spent some air time promoting the parallax effect in its iOS 7 promo clip.
* http://www.youtube.com/watch?v=F0ErUMeT7uE
* That Apple chose to enable the effect by default – and knowing it will be seen throughout daily use – tells me it’s found a way to make it work without consuming too much battery power (one can disable parallax in Settings > General > Accessibility > Parallax).
* It’s more than a gimmick, Tabini argues:
* The screen goes from being a canvas on which your apps are painted to a window into a physical world, where the faux-realism of today’s mobile apps is replaced by visuals that can feel both more synthetic and more realistic at the same time.
* Indeed, developers can implement the parallax effect in their apps by using new Motion Effects APIs in iOS 7.
* In other words, your favorite apps – once optimized for iOS 7 – will be able to make various user interface objects appear to move in 3D as you move the device around.
* Hardware requirements for the parallax effect also partially explain why devices lacking a built-in gyro, like the iPhone 3GS and first-generation iPad, didn’t make the iOS 7 compatibility list.
* Pro tip: try setting a panoramic image as your wallpaper in iOS 7 and move your device around. It’s got nothing to do with the parallax thing, but the end result is nonetheless stunning.
* Tell us what you think about the parallax effect in iOS 7 down in the comments.

