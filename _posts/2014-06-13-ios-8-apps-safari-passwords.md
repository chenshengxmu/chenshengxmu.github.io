---
layout: post
title: iOS 8 lets native apps tap into Safari’s AutoFill & Passwords for frictionless login experience
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/iOS-8-Safari-Autofill-Passwords-in-apps.png)
* In addition to using your device’s iSight camera to scan in credit card information, Safari in iOS 8 makes it easy for third-party apps to tap into the browser’s AutoFill & Passwords feature for hassle-free logins.
* Provided a user has previously saved their username and password for a specific website using Safari’s AutoFill & Passwords feature, a native iOS app is now permitted to retrieve this information and re-use it to authorize a user quickly and securely, bypassing the login screen altogether…
* As discovered by 9to5Mac in Apple’s WDC 2014 session video titled ‘Your App, Your Website, and Safari’ [PDF download], this is part of the Continuity philosophy in iOS 8 and Yosemite which promises to make transitioning between mobile/desktop platforms and websites/apps painless and seamless.
* The document explains how to use Safari credentials in native iOS apps and make Safari Autofill work better on websites by associating apps to websites.
* Basically, registered iOS developers need to add a certificate to their website code, create entitlements and use simple APIs in their iOS apps in order to make use of that connection.
* Native apps like Foursquare – or an example app called Shiny, as per Apple’s slides – can then tap new iOS 8 APIs to read from Safari’s AutoFill & Passwords database in order to automatically log you in. This would put up a new iOS 8 prompt asking for permission to use your credentials, pictured top of post.
* “You can view and remove passwords in the Passwords & Autofill section of Safari settings,” reads the prompt.
* And of course, provided a user has enabled iCloud Keychain on their devices, Safari’s AutoFill & Passwords items will be kept in perfect sync across their iPhone, iPod touch, iPad and Mac devices.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/iOS-8-Safari-Autofill-Passwords-in-apps-002.png)
* Even if a user hasn’t previously saved their credentials in Safari or visited a website, apps right on their login screen can offer to save usernames and passwords in Safari’s AutoFill & Passwords database – and even update existing entries, if necessary.
* This is yet another in a string of nice-to-haves in iOS 8 that we’ve been discovering on a daily basis.
* How do you like this feature and will it make your life easier when developers start implementing it in their apps, do you think?

