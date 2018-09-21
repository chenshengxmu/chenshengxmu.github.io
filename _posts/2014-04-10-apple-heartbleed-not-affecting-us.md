---
layout: post
title: iOS, OS X and key iCloud services not affected by Heartbleed, Apple confirms
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/04/Heartbleed-logo.png)
* If you’ve as much as glanced at what’s your inbox lately, chances are you’ve encountered messages in which your favorite apps and services announce emergency password resets in the wake of Heartbleed, a nasty bug that’s attacking millions of websites. And unless you’ve been sleeping under a rock for the past week, you must be aware by now that a shockingly high number of websites are at risk.
* The latest security scare stems from a devastating flaw in the OpenSSL software many websites use to authorize login sessions and encrypt and transmit user data. Long story short, the exploit allows attackers to easily scoop up the website’s encryption keys, passwords and user content, prompting tons of emergency password resets by some of the Internet’s most popular services.
* But what about your Apple ID? Have the keys to your account in the Apple cloud been compromised? How about iCloud or the App Store? According to an Apple spokesperson, its iOS and OS X platforms are protected against Heartbleed. Do I hear a collective sigh of relief?
* An Apple spokesperson told Re/code:
* Apple takes security very seriously. iOS and OS X never incorporated the vulnerable software and key web-based services were not affected.
* This is great news, even more so realizing Google, Yahoo and Facebook’s admission that their own services could have been susceptible to the Heartbleed flaw. To reiterate, your Apple ID, iCloud email, data synced between devices through iCloud, App Store credentials and other Apple services you use are not at risk.
* This is because Apple deprecated OpenSSL on OS X in December 2012.
* According to this AskDifferent thread, Apple provides several alternate APIs that provide SSL to Mac developers and has this to say about OpenSSL:
* OpenSSL does not provide a stable API from version to version. For this reason, although OS X provides OpenSSL libraries, the OpenSSL libraries in OS X are deprecated, and OpenSSL has never been provided as part of iOS. Use of the OS X OpenSSL libraries by apps is strongly discouraged.
* The extent of the repercussions stemming from Heartbleed is potentially mind-blowing. Case in point: Mint just confirmed it’s been exposed to Heartbleed and warned that the exploit may have potentially exposed user bank passwords.
* According to security expert Bruce Schneier, the Heartbleed vulnerability indeed is “catastrophic.”
* “On the scale of 1 to 10, this is an 11,” he wrote in a blog post this week.
* Joy of Tech‘s take on Heartbleed.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/04/1986.gif)
* How can you ensure that Heartbleed hasn’t compromised your numerous credentials used across a bunch of websites and online services? For starters, use strong passwords and avoid at all cost using the same password across different websites.
* I keep all my passwords in 1Password, an excellent password-management software for iOS and OS X. In addition to keeping all my passwords, accounts, notes and other private data safe inside its encrypted vault, there’s an in-app browser I use whenever I need to log in to sites like eBay, PayPal, Google and so forth.
* Apple’s own Safari password generator is helpful, too, especially used in conjunction with the iCloud Keychain feature that securely syncs your web passwords across Mac and iOS devices without storing them in iCloud.
* Note that changing passwords won’t do much unless the companies have updated their compromised OpenSSL security software. Because of this, you’re better off changing passwords only for the service that have confirmed updating their security software and encouraged users to change their passwords.
* For an overview of how Heartbleed works, check out an information article on Yahoo Tech. I also suggest a detailed look into Heartbleed and how it was the biggest secret in the world for about a week over at The Verge.
* You may also want to check out Business Insider’s interview with one of the engineers who uncovered Heartbleed. While you’re at it, don’t forget to consult Mashable’s list of the Heartbleed-vulnerable passwords you need to change right now.
* And lastly, use this Heartbleed web tool to test if your favorite website or online services has been compromised by the vulnerability.

