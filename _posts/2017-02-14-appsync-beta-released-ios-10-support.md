---
layout: post
title: AppSync beta released with iOS 10 support
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/appsync-header.png)
* One of the more common questions we’ve been getting here at iDB since the release of the Yalu jailbreak for iOS 10 is when AppSync Unified, from Karen Tsai (angelXwind), would be getting an update to make it compatible with the new jailbreak.
* As you may be aware, many people got themselves into a respring loop of some description by installing AppSync soon after the Yalu jailbreaks came out. That should now have been fixed with this new beta version of AppSync Unified, available on Karen’s Cydia repository.
* AppSync is a powerful tweak which allows the installation of unsigned .ipa files (iOS applications) on your jailbroken device. Whilst it is true that this functionality is often used for nefarious purposes, the central intent of AppSync is valid and useful. It allows on-device installation of legal apps for those without a Mac or Xcode, as well as the distribution of legal but unsigned apps by those who cannot make it onto the App Store, for example, emulator applications.
* However, it can be (and is) unfortunately also used for the installation of paid apps for free. For more information on the real purpose of AppSync and the reasoning behind its legitimate uses, you can read Tsai’s post on the subject.
* I personally use it to install emulators such as GBA4iOS, as well as older versions of applications for legacy devices, which are no longer available from the App Store.
* The new build number is 6.0~b1, and the changelog consists of one major item to prevent crashes on, and bring compatibility to, iOS 10:
* Return the public “Apple iPhone OS Application Signing” intermediate certificate instead of “kSecMagicBytes” on iOS 10 to avoid a Security.framework crash — thanks JulioVerne!
* Tsai goes into more detail as to what caused the problem in her announcement post, but the basic premise is that AppSync gives fake data to the installd process in order to sign your unsigned apps, however, on iOS 10 this causes the Security.framework to crash installd. Then, when Cydia installs a package and runs uicache it calls on installd, which crashes, leaving your SpringBoard in a half-way, broken state: a respring loop.
* In fixing this problem, Tsai was helped out by developer and software-cracker JulioVerne. Much had been wildly speculated about whether the two were in ‘competition’, after Tsai initially advised against installing his fixed-up version. However, this turned out to be incorrect, as explained by Tsai in the announcement post I linked above.
* To summarise: the two have worked together to bring this solution, with JulioVerne providing his source code for the fix. This allowed Tsai to check its legality (it uses an Apple certificate), and restore iOS 5 & 6 support, which the initial fix unwittingly broke. She has now been able to release an official version of the package, which fixes all these issues and can prevent version fragmentation, by being offered on her official repo. She credits JulioVerne with the fix, and thanks him for his help.
* If you want to try out the beta of AppSync Unified, it can be found on Karen Tsai’s Pineapple repo: https://cydia.angelxwind.net/
* Please ensure that the only version you install is the one from this repository. Installing an older version could leave you in the respring loop, and many repositories offer old versions of this package. Install AppSync Unified 6.0~b1 only from Karen’s Pineapple repo.
* Are you excited to have AppSync Unified on iOS 10? Have you tried it out yet?

