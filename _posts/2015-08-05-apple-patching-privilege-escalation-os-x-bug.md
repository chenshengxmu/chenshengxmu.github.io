---
layout: post
title: The next Mac security update will patch a serious privilege-escalation DYLD bug in OS X
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/OS-X-Yosemite-Desktop.jpg)
* A “privilege escalation” bug plaguing Apple’s OS X desktop operating system will be patched in the next security update that the company is working on as we speak, a company spokesperson said today.
* The Guardian newspaper reported that a fix for the dangerous zero-day vulnerability, known as DYLD, will be patched before OS X El Capitan releases for public consumption this fall.
* The DYLD bug vulnerability lets malicious code to execute on a Mac with administrator access, without needing to ask the user to input their password.
* As ArsTechnica explains, the privilege-escalation vulnerability was already exploited by at least one adware installer using it to increase its capabilities.
* According to Malwarebytes, the adware in question was capable of installing malware and adware applications with full root permissions, including VSearch, Genieo adware, MacKeeper junkware, while directing the user to the Download Shuttle app on the Mac App Store.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/08/Download-Shuttle-on-Mac-App-Store-screenshot-001.png)
* The bug, which was disclosed last week by security researcher Stefan Esser, stems from new error-logging features that Apple added to OS X Yosemite.
* Privilege-escalation vulnerabilities are widely exploited to install adware, spyware and other malicious software without user even knowing it. As attackers can inject malicious code with administrator access, users don’t have to enter their administrator password in order for the malicious code to execute.
* As a result, users are typically only one code execution vulnerability away in whatever browser they happen to be using from being compromised. “If an attacker manages to find just one such bug in Safari, Firefox or Chrome you are owned,“ Ars cautions.
* For starters, everyone running the latest release of Mac OS X 10.10.4, which does not patch the DYLD vulnerability. The vulnerability is even effective from the Guest account on OS X. On a brighter note, the bug has been fixed in a later beta version of the upcoming OS X Yosemite 10.10.5 software update.
* Thankfully, Apple has taken proactive measures to protect unsuspecting users against DYLD attacks until a broader patch is released.
* Some of the measures the company’s taken to prevent further exploitation of the vulnerability include revoking the credentials of developers who use it, including any app which does so on Apple’s regularly updated list of malware.
* Keep in mind that Gatekeeper, an OS X feature that verifies if apps you download come from sanctioned sources, cannot offer full protection against the DYLD exploit if a rogue Mac App Store developer chooses to risk having its credentials revoked for the sake of infecting machines in the wild. More importantly, Gatekeeper certainly cannot protect you against attacks from software you have already downloaded and installed outside the Mac App Store.
* As mentioned before, Apple will expedite a patch in the form of a standalone security update to patch the vulnerability before OS X 10.10.5 is officially released.
* In the meantime, be careful what you download!
* Source: The Guardian

