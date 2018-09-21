---
layout: post
title: Developer ports iOS core to Nokia N900
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/11/xnu-n900.png)
* Winocm, the developer leading the work on the iOS 6.1.3/4 jailbreak, has managed to port iOS to a non-Apple device. The photo you see above is the iOS core, known as the “XNU Kernel,” running on a Nokia N900 smartphone.
* The port is extremely primitive, as it doesn’t include any of iOS’s or OS X’s user-interface elements and cannot be run as a useable operating system. But it does signal a major development for the ongoing open source project…
* From Winocm’s blog post on the port (via 9to5Mac):
* “Reecently, I achieved one of the core milestones of my personal project, porting the Darwin kernel to the ARM architecture. This specified milestone was booting to a multiuser system.
* Darwin is the core operating system that lies under both Mac OS X and iPhone OS. It is the true core foundation that bridges the kernel to the actual UI above. (SpringBoard/loginwindow/etc).”
* And some of the other hardware the kernel runs on:
* The developer adds that the system root filesystem in his port is based on iPhone OS 4.3.5. And for the most part, everything runs flawlessly. But he does say that there are a ton of kernel bugs to fix, including power management.
* It’s worth noting again that this is all very early-stage stuff, and shouldn’t be mistaken for anything beyond that. Winocm made sure to mention that he does not plan to add any graphical UI support right now—only the Core OS.
* For those interested in the project, and looking to help out, Winocm has made the source code available on his GitHub. Also, there’s an IRC channel devoted to the initiative called ##darwin-on-arm, located on Freenode.

