---
layout: post
title: Apple credits Pangu team for discovering vulnerabilities patched in iOS 8.1.1
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/10/Pangu-Yosemite-icon.png)
* Apple has posted a support page on the security content of the just-released iOS 8.1.1, reaffirming previous reports that the firmware breaks the Pangu jailbreak tool. In the page, the company credits the Pangu team for discovering three vulnerabilities patched in 8.1.1.
* Among those vulnerabilities was a state management issue in the dyld directory, which has to do with app launches. There was also a validation issue in the handling of metadata fields with the kernel, and a sandbox profile bug that allowed apps to launch arbitrary binaries.
* Here are the full entries from the support page:
* dyld
* Available for: iPhone 4s and later, iPod touch (5th generation) and later, iPad 2 and later
* Impact: A local user may be able to execute unsigned code
* Description: A state management issue existed in the handling of Mach-O executable files with overlapping segments. This issue was addressed
* through improved validation of segment sizes.
* CVE-ID
* CVE-2014-4455 : @PanguTeam
* Kernel
* Available for: iPhone 4s and later, iPod touch (5th generation) and later, iPad 2 and later
* Impact: A malicious application may be able to execute arbitrary code with system privileges
* Description: A validation issue existed in the handling of certain metadata fields of IOSharedDataQueue objects. This issue was addressed
* through relocation of the metadata.
* CVE-ID
* CVE-2014-4461 : @PanguTeam
* Sandbox Profiles
* Available for: iPhone 4s and later, iPod touch (5th generation) and later, iPad 2 and later
* Impact: A malicious application may be able to launch arbitrary binaries on a trusted device
* Description: A permissions issue existed with the debugging functionality for iOS that allowed the spawning of applications on trusted devices that were not being debugged. This was addressed by changes to debugserver’s sandbox.
* CVE-ID
* CVE-2014-4457 : @PanguTeam
* Apple has in the past credited the evad3rs, and other hackers responsible for jailbreaks, for finding vulnerabilities in its mobile operating system that it patches. It’s essentially the only time the company openly admits it’s aware of the jailbreak, and the people behind it.
* The Pangu jailbreak for iOS 8 debuted on October 22, just a few days after iOS 8.1. The initial release was very rough around the edges, but the tool received several updates during the following weeks. The jailbreak’s reign officially ended on November 17, with iOS 8.1.1.
* [Apple]

