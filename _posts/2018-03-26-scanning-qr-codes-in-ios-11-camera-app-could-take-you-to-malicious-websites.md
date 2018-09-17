---
layout: post
title: Scanning QR codes in iOS 11 Camera app could take you to malicious websites
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/03/ios-11-QR-Code-Camera-app.jpg)
* The QR code scanning feature in the stock Camera app suffers from an odd parser bug.
* When scanned, a specially crafted QR code may take the user to a malicious website instead of whatever underlying URL was shown in the notification banner.
* As detailed in a new report by Infosec, there’s a bug in iOS 11’s QR code parser that allows the stock Camera app to automatically scan QR codes and interpret them.
* TUTORIAL: How to quickly join Wi-Fi networks using your iPhone’s Camera
* The problem is, a specially constructed QR code will show an unsuspicious hostname in a notification banner but open another URL in Safari.
* You can try this out yourself by scanning the QR code embedded below with the stock Camera app on iOS 11 (note: Scan QR Codes must be enabled in Settings → Camera).
![img](http://media.idownloadblog.com/wp-content/uploads/2018/03/ios-11-qr-code-parser-bug.png)
* Upon scanning the code, the message “Open ‘facebook.com’ in Safari” appears in the notification banner but tapping it instead opens the website https://infosec.rm-it.de/.
* As it turns out, this can be achieved by embedding the URL in the format https://xxx\@facebook.com:443@infosec.rm-it.de/ where the parser will display the first URL but the notification will actually take you to the other URL.
* Third-party QR code readers are also susceptible to this issue.
* In fact, some of these apps actually put you at greater risk by automatically opening the link immediately upon scanning the code. Other third-party QR code scanners may simply crash.
* This issue has been reported to the Apple security team on December 23, 2017, but has not been fixed as of today. Now that the Apple blogosphere has highlighted this potentially serious vulnerability, Apple should hopefully release a fix soon.
* The Camera app on iOS 11 recognizes varied QR codes, including HomeKit setup codes, contacts, calendars, maps, messages, network settings, websites, callback URLs and so forth.
* Have you tried iOS 11’s QR code scanning yet?
* Let us know in the comments.

