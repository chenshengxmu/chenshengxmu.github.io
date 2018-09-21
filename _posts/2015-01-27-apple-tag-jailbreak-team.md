---
layout: post
title: Apple patches several vulnerabilities used by TaiG jailbreak in iOS 8.1.3
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/12/TaiG-Jailbreak-english.png)
* Apple has posted a support page on the security content of the just-released iOS 8.1.3, confirming fears that the firmware effectively breaks the TaiG jailbreak tool. In the page, the company credits the TaiG Jailbreak Team for discovering four vulnerabilities patched in the update.
* Among those vulnerabilities was a hole in the symbolic linking mechanism of AppleFileConduit, which allowed access to protected parts of the filesystem, and a state management issue, which gave local users the ability to execute unsigned code. Keep reading for a full rundown.
* AppleFileConduit
* Available for: iPhone 4s and later, iPod touch (5th generation) and later, iPad 2 and later
* Impact: A maliciously crafted afc command may allow access to protected parts of the filesystem
* Description: A vulnerability existed in the symbolic linking mechanism of afc. This issue was addressed by adding additional path checks.
* CVE-ID
* CVE-2014-4480 : TaiG Jailbreak Team
* dyld
* Available for: iPhone 4s and later, iPod touch (5th generation) and later, iPad 2 and later
* Impact: A local user may be able to execute unsigned code
* Description: A state management issue existed in the handling of Mach-O executable files with overlapping segments. This issue was addressed through improved validation of segment sizes.
* CVE-ID
* CVE-2014-4455 : TaiG Jailbreak Team
* IOHIDFamily
* Available for: iPhone 4s and later, iPod touch (5th generation) and later, iPad 2 and later
* Impact: A malicious application may be able to execute arbitrary code with system privileges
* Description: A buffer overflow existed in IOHIDFamily. This issue was addressed through improved size validation.
* CVE-ID
* CVE-2014-4487 : TaiG Jailbreak Team
* Kernel
* Available for: iPhone 4s and later, iPod touch (5th generation) and later, iPad 2 and later
* Impact: Maliciously crafted or compromised iOS applications may be able to determine addresses in the kernel
* Description: The mach_port_kobject kernel interface leaked kernel addresses and heap permutation value, which may aid in bypassing address space layout randomization protection. This was addressed by disabling the mach_port_kobject interface in production configurations.
* CVE-ID
* CVE-2014-4496 : TaiG Jailbreak Team
* The TaiG jailbreak for iOS 8.1.1 debuted on November 28 of last year, just a week after iOS 8.1.1 landed. There’s no word yet on when/if it will be updated, but as always, we recommend staying away from iOS 8.1.3 until a working jailbreak for the new firmware is announced.

