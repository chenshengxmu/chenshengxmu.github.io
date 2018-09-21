---
layout: post
title: New M7 details reveal outstanding power efficiency
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iPhone-5s-keynote-M7-specs-slide.jpg)
* Apple has made quite a noise about its brand new chip, the M7 motion coprocessor designed to offload taking sensor measurements from the iPhone 5s’s main A7 processor. Because the M7 requires at least one-sixth of the power versus the 64-bit A7 chip, it can log data from the accelerometer, gyroscope and compass sensors independently of the A7 package, thus allowing for substantial power savings.
* The details of how this data is captured and what power savings developers can count on were kept to Apple’s chest until the Argus app made headlines as the first fitness software optimized for the M7 silicon. Here are a few previously unknown details about Apple’s motion coprocessor hardware…
* Developer Scott Buscemi who occasionally blogs over at 9to5Mac had a chance to interview Argus product manager Peter Kuhar at Azumio. The company’s fitness app is the first to adopt API-level support for Apple’s motion coprocessor.
* For starters, the M7 is really, really, really power-efficient.
* The Argus app drains about 20-30 percent of battery life per day while running in the background. But after developers optimized the app for the M7 chip, it “no longer takes up any battery power while running in the background and the stated battery life from Apple – 10 hours 3G talk time, 250 hours of standby – will stay exactly the same”.
* This is the direct result of the program no longer straining the power-hungry A7 processor in order to continually check for motion and calculate the distance and number of steps using the accelerometer and GPS.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Argus-Motion-Activity-access.png)
* Apparently, Android manufacturers are considering placing motion coprocessors in their phones. As you know, Google’s Moto X is able to monitor its microphone in low-power mode, allowing users to use Google Now hands-free just by saying ‘OK Google.’ Therefore, it’s fairly safe to assume that soon all higher-end phones will include M7 style capabilities.
* We also know the Internet giant will soon update its native Search iOS app with ‘OK Google’ activation, though it’s unclear whether the M7 can continuously engage the iPhone 5s’s microphone on its own.
* In order to harness the power of the motion coprocessor, developers need to tap new APIs Apple provides with the iOS 7 SDK. In a nutshell, these APIs allow an app to register for motion activity data with the system, without having to run in the background at all.
* Apple says the APIs are capable of distinguishing between different types of motions reflective of travel by walking, running, or automobile.
* “Health and fitness apps can take advantage of that data to give users performance and workout results, and navigation apps can use it to change the type of directions they provide,” writes the firm.
* While we don’t know (yet) how much on-board storage the M7 includes, the Argus developer told Buscemi the chip stores up to seven days worth of step information. An app like Argus can poll the M7 data and retrieve all of the historical information, but not without user consent.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iOS-7-Settings-Motion-Activity-001.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iOS-7-Settings-Motion-Activity-002.png)
* A new section nested inside iOS 7 Settings > Privacy, titled Motion Activity, lists apps that have request access to the user’s motion data. Judging by the Argus developer’s explanation and the information Apple has provided thus far, it would seem the M7 logs motion data regardless of whether or not any app had requested that information.
* According to a recent transistor-level analysis of the iPhone 5s’s innards, the semiconductor analysis firm Chipworks was able to identify the M7 chip as an NXP-made LPC18A1 module, meaning probably Apple re-branded other people’s chip.
* Nike’s upcoming Move app, to be available “later this year on the App Store”, is optimized for the M7 motion coprocessor, says Apple. Because the M7 senses when you’re walking or driving, Apple’s Maps app uses it to automatically switch from driving to walking directions.
* And when iOS 7 determines you’re driving and your handset is locked, it will send the main A7 processor to sleep rather than keep it awake to constantly try to join Wi-Fi networks nearby.

