---
layout: post
title: Spark for iPhone is locking some people out of their Apple IDs, Readdle blames server issues
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/Spark-by-Readdle-1.0-for-iOS-teaser-001.png)
* Reports surfaced yesterday on Reddit that some users of Readdle’s excellent free mobile email client, Spark for iPhone, got locked out of their Apple ID account. Some of the affected people were able to re-gain access by performing a password reset on their Apple ID. It would appear that an error on Spark’s servers has caused this behavior though Readdle assured customers that there was no breach or data leak.
* Connecting Spark to a user’s iCloud email account requires them to log into the My Apple ID website to create an app-specific password which is then supplied to Spark. This is Apple’s standard policy designed to protect the security of Apple IDs—no app is allowed to ask users for their Apple ID credentials.
* “The new, faster AWS server logic might have triggered iCloud security algorithms,” wrote Readdle on Twitter.
* I’m just speculating here, but it’s conceivable that switching to faster servers as an unintended consequence has invalidated iCloud tokens. That would almost certainly trigger Apple’s security systems to interpret the app’s repeated attempts to log into iCloud accounts with invalidated tokens as a possible hacking attempt.
* “The good news there’s no breach or data leak,” said Readdle.
* This morning, the company posted a more detailed explained on Reddit:
* Hello guys,
* Thank you for the feedback and comments! Our team has been investigating this for a few hours. What we know so far:
* 1. There’s no breach or data leak according to our investigation.
* 2. The new, faster AWS server logic might have triggered iCloud security algorithms.
* We are already working with Apple to learn more details. We are doing some server side work to make Spark much faster, and to make it ready for the Mac version, which is already in Alpha.
* We will keep you updated once we have more news from Apple side.
* Thank you.
* The issue doesn’t appear to affect all Spark users who have authorized the app to use their iCloud account by creating an app-specific password.
* Spark for iPhone is available free from the App Store.
* Any affected customers are advised to perform a password reset to regain access to their Apple ID. You can also revoke access to Spark through the My Apple ID website if you’re not planning on using the app anymore.
* Another sound advice: enable Apple’s more modern Two-Factor Authentication system, not the old Two-Step Verification, in oder to increase the security of your Apple ID.
* Even if someone gets hold of your Apple ID password, they won’t be able to get into the account without having physical access to one of your trusted devices which are used to generate a one-time security code that must be entered after an Apple ID password to approve access on a new device.
* On the downside, neither Two-Factor Authentication nor Two-Step Verification currently work with Spark, or with any other app for that matter. As mentioned, connecting apps like Spark to iCloud Mail (which has the same password as its underlying Apple ID) requires creating an app-specific password that can be revoked at any time.
* Have you been affected by this issue and if so, were you able to regain access to your Apple ID?
* Source: Reddit

