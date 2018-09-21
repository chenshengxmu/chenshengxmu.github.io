---
layout: post
title: HomeKit gains easier setup with NFC/QR Codes, improved latency, support for sprinklers/faucets & more
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-teaser-iPhone-iPad-apple-Watch.jpg)
* Interesting new capabilities for HomeKit, Apple’s home automation framework, were announced at the Worldwide Developers Conference earlier this week. The new features were designed to make the smart home platform more flexible for users and even more accessible to third-party developers and device makers in order to encourage faster adoption.
* For starters, Apple no longer requires vendors to use dedicated encryption chips in their gadgets. But the big news is that hobbyists and enthusiasts (or just about anyone with an Apple developer account) are now permitted to create prototypes of HomeKit devices without being MFi-certified.
* Apple’s “What’s New in HomeKit” developer session provides a wealth of information on the new end-user capabilities for HomeKit, like easier setup with QR Codes and NFC, greatly improved responsiveness, support for new smart home device types, like sprinklers and faucets, and much more.
* HomeKit now implements new triggers and events, making it possible to automatically run scenes based on who is home, only at certain times, and with more types of accessories.
* HomeKit scenes and accessories can be controlled through iOS 11’s Control Center, with Siri, using the Home app on iPhone, iPad, iPod touch or Apple Watch, and via Apple’s new HomePod smart speaker. And with an Apple TV, an iPad or a HomePod actings as a HomeKit hub, you can control your smart home products from just about anywhere in the world.
* With support for two new product categories—sprinklers and faucets—users can now control water in the garden via Siri. Or, you could have Siri turn on the shower in the morning, knowing the water will be the right temperature by the time you finish your morning coffee.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-sprinklers-faucets-slide-007.jpg)
* Many HomeKit accessories use the low-energy Bluetooth standard. In order to reduce the latency which occurs when a Bluetooth accessory communicates with a HomeKit hub, Apple is rolling out a completely new system based on secure broadcast sessions that now send a notification to a HomeKit device.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-reduced-latency-slide-006.jpg)
* This reduces the latency between a new event and the actual accessory state change from a few seconds down to under a second. You won’t have to buy new products: when iOS 11 launches, all your existing accessories will take advantage of improved responsiveness.
* On iOS 10, setting up a home accessory requires launching the Home app, turning on the accessory, tapping the Add option and scanning the special setup code printed on the product’s box to authenticate the device.
* It is currently not possible to pair a turned-off HomeKit device. With iOS 11, you can pair a HomeKit accessory by scanning its code while it’s powered off.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-NFC-tags-QR-codes-slide-007.png)
* Furthermore, Apple  now supports scanning QR Codes for HomeKit authentication. QR Codes can be as small as 10-by-10 millimeters so this seemingly small change will turn authenticating really tiny HomeKit accessories into a frictionless process.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-NFC-tags-QR-codes-slide-006.png)
* And with all-new support for NFC tags (who knew, right?), accessory makers can deliver easier experiences where authenticating a HomeKit device is as easy as tap-and-pair.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-NFC-tags-QR-codes-slide-005.png)
* New events, triggers, recurrences and enhancements for mutable events allow for a significantly elevated flexibility of HomeKit scenes. HomeKit can now run scenes based on who is home, only at certain times, and more. Date-based events let HomeKit triggers to fire off only at certain times (like 5pm every day, for instance).
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-even-triggers-WWDC-slide-001.png)
* Significant time events activate triggers on sunrise or sunset, with positive or negative offsets.
* For example, you could have HomeKit trigger your “I’m at home” scene an hour after sunset or have the lamps in your home turned on right before the sun goes down. A new convenience condition in iOS 11 makes it easy to create a custom condition between two significant events. As an example, you could have a scene running from one hour before sunset to one hour before sunrise.
* Another new iOS 11 condition allows HomeKit to execute a scene when a custom threshold is exceeded. For instance, you could set your air conditioning/heater to kick in when the temperature in your home rises above 76 degrees or when it’s between 50 and 76 degrees.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-even-triggers-WWDC-slide-002.png)
* A new presence event lets HomeKit activate scenes when a user arrives home , or leaves home. And with multi-user support, you now can have triggers activate automatically when the last known user leaves home (to shut down the lights, air conditioning, lock the doors and so forth) or the first user arrives home to an empty house.
* End events support specifying the time interval from the event execution time.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-even-triggers-WWDC-slide-003.png)
* Apple provided the example of opening a door at night, which triggers an event that turns on the outside lights for just a few minutes. Currently, there’s no way to have a HomeKit device enable a certain state for a period of time.
* And with recurrences, it’s possible to execute triggers only on certain days of the week. For instance, if you like to sleep a little longer on Saturdays, you can now restrict the execution of your “Good morning” scene to workdays only.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-even-recurrences-WWDC-slide-004.png)
* Plus, HomeKit now supports creating an event that triggers once, then auto-disables itself.
* Apple also unveiled a new version of AirPlay, called AirPlay 2.
* AirPlay 2 supports multi-room audio and HomeKit, meaning your smart home products can now communicate with your AirPlay 2-enabled speakers or Apple’s own HomePod speaker. You can control multi-room audio playback through HomeKit, as long as your wireless speaker or home audio setup works with AirPlay 2.
* Apple-owned Beats, as well as audio equipment makers like Bose, Bang & Olufsen, Bowers & Wilkins, Marantz and many others have pledged their support for AirPlay 2. With HomeKit and AirPlay 2, “third-party audio apps will be able to get in on the multi-room audio fun,” said Apple’s software engineering chief Craig Federighi said onstage during the WWDC keynote.
* HomeKit has always been, first and foremost, about user security.
* And because Apple does not compromise about requiring HomeKit developers and vendors to use end-to-end encryption, HomeKit user data is far from being insecure as it unfortunately is with most other platforms for the connected home.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-accessory-makers.png)
* For starters, all HomeKit makers must adhere to Apple’s strict “Made for iOS” (MFi) policies and use Apple’s authentication chips to guarantee user privacy and security with strong hardware-based encryption. On the downside, this complicates hardware development and makes HomeKit devices pricier than rival gadgets.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-hardware-authentication-slide-008.jpg)
* The updated HomeKit specification now includes a new option allowing all the HomeKit authorization to go through software. Although software-based encryption is slower versus a dedicated chip, it has the benefit of shortened development times and lower cost.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-software-authentication-slide-009.jpg)
* But more important than that, existing devices that currently lack HomeKit integration will now be able to implement HomeKit support after iOS 11 launches this fall in software, without requiring a hardware change.
* Apple now operates two HomeKit certification labs in the United States and is scheduled to open similar labs in the United Kingdom and China next month, which should help local vendors bring their HomeKit hardware to market faster.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-certification-labs-slide-010.png)
* Apple also wants encourage hobbyists to build their own HomeKit devices. During WWDC 2017, the company announced that developers no longer have to be MFi-certified to build prototypes of smart home accessories. Not only that, but HomeKit developers can now use popular developer boards like Raspberry Pi and Arduino.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/HomeKit-2017-MFi-licensing-slide-001.png)
* Of course, MFi certification is still required before products can be sold to customers.
* That said, the fact that Apple now permits regular people to tinker with HomeKit and even build their own accessories from scratch, for personal use, without an MFi license, should help accelerate the adoption of the platform.
* These new HomeKit features are available across iOS 11, watchOS 4 and tvOS 11. macOS currently does not support HomeKit. HomeKit debuted two years ago at the 2014 Worldwide Developers Conference.

