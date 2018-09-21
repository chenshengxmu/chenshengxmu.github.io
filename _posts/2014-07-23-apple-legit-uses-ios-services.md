---
layout: post
title: Apple outlines diagnostic capabilities in response to iOS 'backdoor' concerns
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iOS-7-teaser-iPhone-5s-ad-009.jpg)
* Forensic expert, and former jailbreak hacker, Jonathan Zdziarski caused quite a stir earlier this week when he published a report accusing Apple of building backdoors into iOS that could be used for government surveillance.
* Apple of course came out and denied the claim, saying that these so-called ‘backdoor services’ are actually used for troubleshooting. But this wasn’t a good enough explanation for a lot of users, so tonight it delved a little deeper…
* Apple has published a new support page this evening entitled “iOS: About diagnostic capabilities.” The document essentially outlines some of the processes Zdziarski pointed to in his report, and what their legitimate purpose are.
* iOS offers the following diagnostic capabilities to help enterprise IT departments, developers, and AppleCare troubleshoot issues.
* Each of these diagnostic capabilities requires the user to have unlocked their device and agreed to trust another computer. Any data transmitted between the iOS device and trusted computer is encrypted with keys not shared with Apple. For users who have enabled iTunes Wi-Fi Sync on a trusted computer, these services may also be accessed wirelessly by that computer.
* 1. com.apple.mobile.pcapd
* pcapd supports diagnostic packet capture from an iOS device to a trusted computer. This is useful for troubleshooting and diagnosing issues with apps on the device as well as enterprise VPN connections. You can find more information at developer.apple.com/library/ios/qa/qa1176.
* 2. com.apple.mobile.file_relay
* file_relay supports limited copying of diagnostic data from a device. This service is separate from user-generated backups, does not have access to all data on the device, and respects iOS Data Protection. Apple engineering uses file_relay on internal devices to qualify customer configurations. AppleCare, with user consent, can also use this tool to gather relevant diagnostic data from users’ devices.
* 3. com.apple.mobile.house_arrest
* house_arrest is used by iTunes to transfer documents to and from an iOS device for apps that support this functionality. This is also used by Xcode to assist in the transfer of test data to a device while an app is in development.
* Users have been questioning Apple’s stance on privacy ever since it was named in Edward Snowden’s PRISM leak last summer. The company continues to deny that is has any involvement in any government surveillance program.
* This support page obviously doesn’t answer all of the questions, but at the very least, it shows a willingness on Apple’s part to discuss user concerns.

