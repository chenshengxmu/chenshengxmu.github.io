---
layout: post
title: Saurik updates Cydia Impactor, releases Cydia Extender
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/impactor-0.9.39.png)
* Today, Cydia creator Jay Freeman (Saurik) released an update to his tool Cydia Impactor, which allows the signing and installing of .ipa files to iOS devices.
* With it comes a new tool called Cydia Extender, which allows installing and re-signing of .ipa files on-device. However, don’t get too excited by this news; it is not the solution to the 7-day signing problem that many have been waiting for.
* The Cydia Impactor update has the version number 0.9.39 and is available for macOS, Linux, and Windows. The changelog is brief, and consists of a fix for the SSL certificate verification error that Windows users had been reporting when trying to sign .ipa files. Other than that the only difference seems to be the addition of the Cydia Extender tool, which can be found within Impactor itself, ready for install to iOS devices.
* You can download Cydia Impactor from its official website.
* The first thing to say here is Extender is NOT a solution to the 7-day signing problem. This is primarily because it requires a paid developer account to work its magic. Without one, it cannot be installed. If you do have a developer account then you can simply sign Yalu for a year anyway with Impactor, so you don’t need Extender. In either case it does not affect the signing situation.
* Here’s what Saurik had to say to iDB about Extender earlier today:
* “Cydia Extender is an application that runs on iOS and registers to handle “.ipa” files, allowing you to browse in Safari directly to an IPA file and install it using the same mechanisms used by Cydia Impactor. It also can re-sign and reinstall itself.”
* As you can see, if we leave aside its utility as an jailbreak signer, Extender is a pretty interesting tool. As essentially an on-device version of Cydia Impactor, Cydia Extender will be of considerable use to those with a paid developer account, allowing them to browse, install, and re-sign applications indefinitely, without a computer.
* It is unclear whether Saurik intended Cydia Extender to be a solution to Yalu signing or not. Below is his summary of how Extender works (which is interesting), and his opinion on its intended userbase:
* “It (apparently) requires a developer account to install, due to the crazy indirect technique it uses for the install process (a loopback VPN network extension). This limitation seriously was not noticed by me until a user reported it as an issue a few minutes after I had already released it. This makes this new application only valuable to developers.”
* The fact that Saurik was unaware of its need for a developer account may suggest that it was in fact destined to be one mitigation for our signing difficulties. Had it not required a developer account, as he believed upon its release, it would have been a solution to the problem, so it makes sense to think that that is what he considered it. His subsequent wry description of it as a “fail” also supports this interpretation. However, I think that evaluation is a little harsh. Extender is a powerful tool for those who can use it, even if its audience is limited severely by the unforeseen setback.
* Whether the future utility of the tool will increase is unknown, as Saurik told iDB:
* “There may or may not be other ways to make this work without the VPN feature.”
* If a way could be found, Extender could still become a workaround for our signing woes, though Saurik is clearly ambivalent at best on the feasibility of that at present.
* Regardless of whether Cydia Extender was intended to be a solution to signing our jailbreaks, it seems likely that it was never meant to be the solution. Saurik has categorically stated that it is not “what many people are assuming” and this, coupled with his confirmation that he is still working with an unnamed developer on another tool, may imply that Extender was just a temporary measure, or just one of a pair of solutions.
* We’ll have to wait and see whether their collaboration comes to anything, but for now, be patient and don’t get your hopes up too much.

