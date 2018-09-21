---
layout: post
title: Has Apple gone mad? More iOS 10 parts left unencrypted in beta 2
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/iOS-10-beta-2-new-wallpaper-silver-iPhone-screenshot-001.jpg)
* As you know, security experts were baffled realizing that the iOS 10 kernel in beta 1 was not encrypted. Apple argued it was no big deal because the kernel contained no user data so the company had left it unencrypted intentionally in order to increase general system performance, in their own words.
* But Apple didn’t stop there.
* As first discovered by prominent jailbreak developer and iPhone hacker, MuscleNerd, iOS 10 beta 2 actually leaves more parts of the operating system unencrypted.
* What’s going on here?
* “It was no accident. Apple left even more images unencrypted in iOS 10 beta 2,” he tweeted.
* As an example, 32-bit boot loaders (tiny programs designed to load a more complex kernel at boot time) and all RAM disks (virtual disks stored in the RAM) are left unencrypted in iOS 10 beta 2. In addition to the 64-bit portion of the iOS 10 kernel that was left unencrypted in beta 1, beta 2 actually leaves the whole kernel unencrypted, both the 32-bit and 64-bit version.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/iOS-10-beta-2-unencrypted-musclenerd.png)
* The image attached to MuscleNerd’s tweet indicates that iOS 10 beta 2 even does not encrypt the main file system (minus user data, of course). Again, Apple did come out and say the iOS 10 kernel was purposefully unencrypted so that security researchers would do their job for them so iOS 10 beta 2 is even more puzzling in that regard.
* BTW, “SEP” on the image above stands for Secure Enclave (see further below) and ATV stands for the Apple TV. Keep in mind that Apple may still decide to fully encrypt all parts of iOS 10 in the final release.
* Encryption costs a lot in terms of speed. Just ask Google: although the Internet giant mandated that all flagship Android devices enable full disk encryption by default, it soon backtracked as users started complaining about abysmally slow performance with encryption turned on.
* That’s because Android realizes encryption in software while Apple uses the power of its custom-designed silicon to provide robust encryption that doesn’t cause the system to become notably slower.
* On iOS devices from the iPhone 5s onward, the Secure Enclave, a tiny chip within the main Apple-designed application processor, is responsible for encrypting data as it’s written into flash storage and also processes Touch ID input, authenticates Apple Pay transactions.
* Although the Secure Enclave is embedded into the main processor (the A9 chip in the case of the iPhone 6s), no software, service or hardware can read what’s inside. The Secure Enclave has its own firmware, boot loader and code, uses its own encrypted memory and only communicates with the A9 using an interrupt-driven model where the A9 puts some data on a shared memory buffer and then reads back the results.
* “The kernel cache doesn’t contain any user info, and by unencrypting it we’re able to optimize the operating system’s performance without compromising security,” was Apple’s explanation after reports that the first beta of iOS 10 came with an unencrypted kernel.
* Conventional wisdom has it that leaving certain parts of iOS 10 unencrypted could help weaken the market for zero-day exploits. Apple does not have a bounty program for iOS bugs and the company actually likes the fact that the prices of premium iPhone hacks are so high.
* FBI director James Comey said the agency paid at least $1.3 million for the hack which allowed them to gain access to San Bernardino shooter’s iPhone 5c beyond the Lock screen.
* In fact, the black market prices for iPhone zero-day exploits is one of the “indirect metrics” Apple’s security teams take into account when evaluating how well they’re doing.
* What’s your take on this finding?
* Why did Apple leave additional parts of iOS unencrypted in iOS 10 beta 2? Is there a hidden agenda behind this or should we trust Apple when they say they’re optimizing iOS 10’s performance without compromising security?
* Source: MuscleNerd via iGen.fr (Google Translate)

