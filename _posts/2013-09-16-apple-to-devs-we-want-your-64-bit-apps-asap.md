---
layout: post
title: Apple to devs- we want your 64-bit apps ASAP
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Apple-September-2013-event-iPhone-5s-64-bit-slide-001.jpg)
* With its new flagship iPhone 5s, Apple is ushering in an era of 64-bit computing on smartphones, an unexpected move which has left rivals such as Samsung scrambling to release mobile devices running 64-bit processors at some point in 2014 – with absolutely no clear idea of how the hardware and software will work together to improve their apps.
* In the meantime, Apple is now asking its registered iOS developers to optimize and submit their warez for the device’s 64-bit A7 chip…
* According to a note Apple posted on its iOS Dev Center today – and subsequently removed for reasons unknown – apps designed to support both iOS 6 and iOS 7 devices will be 32-bit only until the company finishes work next month on a new specification supporting both 32-bit and 64-bit code in a single app binary.
* Here’s what the announcement read before it got pulled:
* You can submit 64-bit apps for iOS 7 today that take advantage of the power of iPhone 5s. Xcode can build your app with both 32-bit and 64-bit binaries included so it works across all devices running iOS 7.
* If you wish to continue to support iOS 6 then you will need to build for 32-bit only. Next month we will be making changes that will allow you create a single app binary that supports 32-bit on iOS 6, as well as 32-bit and 64-bit on iOS 7.
* Building apps in 64-bit is easy, thanks to Xcode which automatically builds apps into binaries that will run on both 32-bit and 64-bit devices. Indeed, developer ChAIR during the September 10 keynote said they converted their Infinity Blade game from 32-bit to 64-bit architecture in just two hours.
* The way I read Apple’s announcement, 64-bit apps optimized for the iPhone 5s’s A7 processor might be provided as separate downloads from those that are 32-bit and iOS 6 compatible until the firm finishes specification of the combined 32/64-bit binaries.
* That move is bound to take cues from Apple’s existing universal apps which pack in code for multiple form-factor devices in a single app binary.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/white-iPhone-5s-front.jpg)
* An unintended consequence of the transition: it’s entirely conceivable that those double binary packages – once they are ready next month – will add up to app sizes because 64-bit code takes more space than 32-bit one.
* Indeed, Apple notes that the transition to 64-bit code brings with it increased memory usage that, unless managed carefully, can result in the increased memory consumption that can be “detrimental” to an app’s performance.
* Another reason for developers to transition to the 64-bit architecture: the overall operating system efficiency.
* Here’s how Apple envisions tackling this issue:
* When iOS is executing on a 64-bit device, iOS includes separate 32-bit and 64-bit versions of the system frameworks. When all apps running on the device are compiled for the 64-bit runtime, iOS never loads the 32-bit versions of those libraries, which means that the system uses less memory and launches apps more quickly.
* Because all of the built-in apps already support the 64-bit runtime, it is to everyone’s benefit that all apps running on 64-bit devices be compiled for the 64-bit runtime, especially apps that support background processing. Even apps that are not performance sensitive gain from this memory efficiency.
* Eventually all iOS devices will have 64-bit processors so at some point support for 32-bit architecture will be dropped altogether – just as Apple stopped supporting legacy PowerPC apps years after it had transitioned Macs to Intel chips.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iPhone-5s-promo-A7-chip-closeup-002.jpg)
* As for the A7 chip which has over a billion transistors, Apple during the keynote touted two times general and floating-point registers over its predecessor, the A6 package.
* Doubling the registers not only gives the chip the ability to address the memory space beyond four gigabytes of RAM, it lets it perform calculations with greater accuracy, carry out operations on larger data sets in a single cycle and move larger chunks of data between the slower RAM and the fast registers more efficiently.
* What you end up with is a two times speed gain in compute and graphics performance – the A7 chip is 40 times faster than the processor of the original iPhone.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Apple-September-2013-event-iPhone-5s-64-bit-slide-002.jpg)
* We also know iOS 7 is optimized for 64-bit computing.
* Specifically, both the operating system kernel/drivers and all of stock apps have been uniquely designed to take advantage of the A7 chip.
* According to Apple’s iPhone 5S web page:
* The Camera app is a great example. It takes advantage of a new image signal processor built into A7 to give you up to 2x faster autofocus, faster photo capture, and higher video frame rates.
* You’d think with all this going on, battery life would suffer. But it doesn’t, because A7 is designed to be incredibly energy efficient.
* And here’s what Apple’s Dev Center says about 64-bit computing in iOS 7:
* iPhone 5s is powered by Apple’s next generation A7 chip, making it the world’s first smartphone with 64-bit desktop-class architecture for blazing fast performance in the palm of your hand. The iOS kernel, libraries, and drivers now take advantage of 64-bit, delivering up to 2x faster CPU and graphics performance for your apps and games.
* And it’s easy to build and run your apps in 64-bit because Xcode automatically builds your apps into binaries that will run on both 32-bit and 64-bit devices.
* Apple’s transition guide details porting apps to the new 64-bit architecture.
* iDB and other publications spotted traces of devices running iOS 7.0.1, iOS 7.0.2 and iOS 7.1, providing basis for speculation that perhaps support for 32- and 64-bit code on iOS 7 with a single binary is in the cards for an upcoming iOS 7 software updates.

