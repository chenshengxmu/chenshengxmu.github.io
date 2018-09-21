---
layout: post
title: Unencrypted iOS 10 kernel poses no risk to platform security or user data
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Messages-teaser-001.jpg)
* Apple’s unexpected decision to leave certain parts of the iOS 10 kernel unencrypted didn’t sit well with some privacy advocates over fears that the move could aid nefarious users to look for security weaknesses in the iOS software. But as it turns out, we now know that an unencrypted kernel allows iOS 10 to run faster: Ivan Krstić, Apple’s head of Security Engineering and Architecture, explained at the Black Hat security conference that the unencrypted iOS 10 kernel has absolutely no impact on platform security nor does it decrease security of encrypted user data.
* So, what’s a kernel?
* The kernel manages the system’s memory, communicates with peripherals and controls low-level services, hardware and security. It also contains any necessary low-level device drivers and hardware configuration files, but no user data.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/iOS-10-unencrypted-kernel-Ivan-Krstic-slide-002.png)
* In presenting his segment, titled “Behind the Scenes of iOS Security”, Krstić pulled up a slide, which you can see right above, spelling out specific parts of iOS 10’s kernel that Apple’s engineers have left unencrypted.
* The following parts of iOS 10 are unencrypted:
* Krstić went on to say that the above changes are part of a wider set of performance optimizations in iOS 10 because encryption for these objects “was no longer adding a lot of value”. He underscored that iOS 10’s unencrypted kernel poses “no impact to platform security or encryption of user data”.
* iOS utilities so-called secure boot chain to ensure that each step of the startup process contains components that are cryptographically signed by Apple. This establishes the chain of trust by ensuring integrity of the bootloaders, kernel, kernel extensions and baseband firmware.
* “This secure boot chain helps ensure that the lowest levels of software are not tampered with and allows iOS to run only on validated Apple devices,” says Apple.
* Last Thursday, Apple announced an official bug-bounty program that will pay researchers cash for discovering vulnerabilities in its products. The firm is offering anywhere between $25,000 and $200,000 for an exploit, depending on where it is and what it does.
* News that the first beta of iOS 10 leaves parts of its kernel unencrypted left some people scratching their head. After the second beta arrived with even more unencrypted kernel segments, Apple went on the record to say that leaving the iOS 10 kernel unencrypted was a conscious choice.
* “The kernel cache doesn’t contain any user info, and by unencrypting it we’re able to optimize the operating system’s performance without compromising security,” said Apple.
* Prior iOS editions had a fully encrypted kernel.
* Source: Black Hat

