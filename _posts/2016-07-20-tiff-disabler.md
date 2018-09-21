---
layout: post
title: This tweak fixes a big security hole in your jailbroken devices TIFF image handling
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/ComputerSecurity_m_0907.jpg)
* An exploit recently uncovered in iOS versions 9.3.2 and earlier could allow a hacker to compromise the security of a device by having the user open an unsuspecting TIFF image file.
* A new free jailbreak tweak called TIFF Disabler is available in Cydia right now, and in this piece, we’ll discuss why all jailbreakers should install this tweak pronto.
* Not only are you fighting to keep your jailbreak if you’re jailbroken, but you’re simultaneously trying to keep your device’s information safe from being compromised.
* A major security issue was made known to the public by Tyler Bohan of Cisco Talos, and later highlighted in Apple’s security notes for iOS 9.3.3 as CVE-2016-4631, and this isn’t the kind of exploit you want to mess around with or take chances with.
* An exploitable heap based buffer overflow exists in the handling of TIFF images on Apple OS X and iOS operating systems. A crafted TIFF document can lead to a heap based buffer overflow resulting in remote code execution. This vulnerability can be triggered via malicious web page, MMS message, iMessage or a file attachment delivered by other means when opened in applications using the Apple Image I/O API.
* This issue basically highlighted that the handling of TIFF image files in iOS 9.3.2 and earlier, as well as OS X 10.11.4 and earlier, was flawed and could be exploited by a hacker to perform remote code execution. For people who aren’t very fluent in security terms, that’s a very bad thing.
* The developer of the new jailbreak tweak patch had this to say:
* You should update to iOS 9.3.3 or install this tweak as soon as possible. An incoming text can trigger the vulnerability, even with message previews in notifications disabled. Most applications capable of displaying an image on iOS can also likely trigger this. You should also make sure to install the latest OS X security update, as OS X is also vulnerable.
* Fortunately for the people who installed the iOS 9.3.3 update on Monday, you are now safe from this security vulnerability. All that remains are those who are jailbroken on iOS 9.1 or earlier and have no intention of losing their precious jailbreaks to the pressure of remaining secure.
* As it has happened time and time again, the jailbreak community has once again responded to the need for security when a harmful exploit in an earlier version of iOS has been found.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/Tiff-Disabler-1.png)
* Simply installing the new TIFF Disabler tweak on your jailbroken iPhone, iPod touch, or iPad prevents your device from being susceptible to the TIFF image handling security issue.
* The tweak simply disables the TIFF image loader in ImageIO.framework on your iOS device(s), which keeps them from rendering TIFF images in the apps where you’re more vulnerable. These include Messages, Safari, and many others.
* Although it keeps your device from being able to open TIFF images, it does at least keep your device secure from this issue without having to install iOS 9.3.3 and lose your jailbreak. It seems to be a very minor price to pay, especially considering most people don’t really even use the TIFF image format.
* By installing the tweak, you ensure that hackers can’t send you malicious TIFF files that allow them to execute code on your device without your permission, and this ensures that you’re safe from this security hole without having to lose your jailbreak.
* If you’re jailbroken, do yourself a favor and install TIFF Disabler from Cydia’s BigBoss repository right now. The developer has even went ahead and made the project open source on GitHub, and also has an active discussion going on on Reddit so you can stay posted.
* It’ll keep you protected from a major security hole that could put your device and personal information at risk. Not to mention, any issues that might occur from someone running arbitrary code on your device could cost you your valuable jailbreak.
* Anyone who has iOS 9.1.1 or later installed is advised to update to iOS 9.3.3 immediately, since no jailbreak currently exists for your firmware anyways.
* Have you installed the patch on your jailbroken iOS 9.0-9.1 device yet? Share in the comments!

