---
layout: post
title: Sauriks latest Reddit comment details Cydia and Mobile Substrate for iOS 11
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/Cydia-iOS-11.jpg)
* Saurik revealed a couple of weeks ago that he was working on iOS 11 support for Cydia and Mobile Substrate, but a new comment posted on Reddit by the father of jailbreaking himself highlights that there’s a lot more going on under the hood than meets the eye.
* One of the major highlights of the comment is how Saurik teamed up with a prominent developer from the jailbreak community to make all this possible. That developer wishes to remain anonymous at this point in time, but we’ll all eventually learn of his or her identity when the time is right.
* As for what’s going on under the hood, Saurik appears to be working on an entirely new implementation for Mobile Substrate. It ditches jailbreakd in place of a dyld-hooking mechanism that makes the entire platform both more stable and efficient.
* The following snippet from Saurik’s comment explains in detail:
* The architecture without the “jailbreakd” is much cleaner: it means that there isn’t some weird coordination boundary halfway between Substrate and the jailbreak; and the runtime stability will be a lot better: what people seem to want “jailbreakd” to do involves walking through data structures in the kernel – without the locks required to do that, and in a “slow” manner from userspace (increasing the likelihood of various race conditions) – every time processes spawn and Subtrate has to manage code injection.
* …
* And it just isn’t necessary.
* In addition to this, Saurik also mentions how limitations built into iOS 11 narrow the Unix-based possibilities on a jailbroken device. That said, changes to Apple’s operating system (both now and going forward) could potentially make pwned devices less capable than they have been over the years.
* Also read: Here’s why I look forward to jailbreaking iOS 11
* The moral of the entire story is that Saurik’s having to work extra hard to make things entirely compatible, and we should be thankful for his efforts. Fortunately, it shouldn’t be long now until both Cydia and Mobile Substrate are iOS 11-ready, which is excellent news for anyone wanting to take full advantage of tools like LiberiOS to jailbreak iOS 11.1.2.

