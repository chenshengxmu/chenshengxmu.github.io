---
layout: post
title: Hacker learns how to brute force iPhone passwords [update- false alarm]
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/shhh-privacy-security-dark.jpg)
* A security researcher has found a way to brute force a password on a current iOS device. In doing so, he was able to bypass the security mechanisms for iOS, thereby putting encrypted data at risk, according to ZDNet.
* Update: Apple provided the following statement to Rene Ritchie:
* The recent report about a passcode bypass on iPhone was in error, and a result of incorrect testing.
* Since 2014 and iOS 8, iPhones and iPad have come with device encryption. Protected by a four- or six-digit passcode, the combination of software and hardware has made it nearly impossible to break into an iPhone or iPad. Perhaps more importantly, after someone types in the wrong password 10 times on a device, its data gets wiped.
* Matthew Hickey of Hacker House figured out a way to bypass the 10-time limit and enter as many codes as needed. As he noted: “An attacker just needs a turned on, locked phone and a Lightning cable.”
* As ZDNet explains:
* Normally, iPhones and iPads are limited in how many times a passcode can be entered each minute. Newer Apple devices contain a “secure enclave,” a part of the hardware that can’t be modified, which protects the device from brute-force attacks, like entering as many passcodes as possible. The secure enclave keeps count of how many incorrect passcode attempts have been entered and gets slower at responding with each failed attempt.
* Hickey found a way around that. He explained that when an iPhone or iPad is plugged in and a would-be-hacker sends keyboard inputs, it triggers an interrupt request, which takes priority over anything else on the device.
* Here’s a demo:
* For his part, Hickey has already emailed Apple details of the bug, explaining “I suspect others will find it — or have already found it.”
* When security holes are discovered in iOS, Apple’s been relatively quick at finding a fix. Unfortunately, it doesn’t take long before something else is uncovered. Just this month, for example, it was reported that Apple was closing a loophole that allowed law enforcement and hackers to crack iPhones. No doubt, a new workaround will soon be perfected.

