---
layout: post
title: iOS security flaw could lure unsuspecting users into installing dangerous malware
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iOS-8-logo-mockup-001.jpg)
* A new security exploit discovered in Apple’s mobile operating system allows attackers to fool unsuspecting users into installing malicious iPhone and iPad apps disguised as new versions of popular apps and games such as Gmail, Angry Birds and more.
* Instances of malicious apps with such deceiving names as “New Angry Bird”, “New Flappy Bird” and others were mentioned Monday in a report by mobile security research firm FireEye.
* The attack begins with a phishing message in an SMS message that entices a victim to install an attractively titled app or game. The malicious app can then send SMS messages, place phone calls, email your contacts and more because “iOS doesn’t enforce matching certificates for apps with the same bundle identifier.”
* The issue stems from an oversight in the design of iOS that allows an iPhone or iPad application installed using enterprise/ad-hoc provisioning to replace another genuine app installed through the App Store, as long as both apps used the same bundle identifier.
* Fortunately, the flaw does not allow attackers to replace Apple’s stock apps like Mail or Safari. That’s of little consolation because any app on a user’s device installed from the App Store could be used to prompt tech illiterate users into installing malicious software.
* The exploit could have dire consequences.
* For example, Masque Attacks could replace your banking and email apps, using attacker’s malware through the Internet. In turn, the attacker could easily “steal your banking credentials by replacing an authentic banking app with an malware that has identical UI,” claims FireEye.
* Worse, the malware seems capable of access the original app’s local data, which may contain anything from cached emails to login tokens that the malicious app could use to log into your online account directly.
* Seen below: a FireEye-provided example of a genuine Gmail app (Figure A and B) being replaced with a malicious version (Figure D, E and F) because the user chose to install a “New Flappy Bird” update through ad-hoc provisioning (Figure C).
* Upon installing the rogue app, FireEye researchers were able to suck all locally cached emails (stored as clear-text in a SQLite3 database) to a remote server into the cloud.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/Masque-Attack-imasge-001.jpg)
* Surprisingly, the malware can even access the original app’s local data that may remain in the device after the original app was replaced. This may include cached emails and even login-tokens which the malware can use to “log into the user’s account directly.”
* Here are the five security implications FireEye singled out:
* To protect yourself from Masque Attacks, never install or side-load apps from third-party sources other than the App Store and make sure to avoid tapping the “Install” option a malicious webpage may put up, no matter how attractive app titles might be.
* And crucially, if you see an alert warning you of “Untrusted App Developer” when opening an iPhone or iPad app, as shown below, tap on “Don’t Trust” and uninstall the app immediately.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/Masque-Attack-imasge-002.jpg)
* FireEye informed Apple of the vulnerability back in July 2014.
* To check if there are apps on your device already installed through Masque Attacks, check the signing identities of the enterprise provisioning profiles installed on your iOS 7 devices (Settings > General > Profiles) for any signs of foul play.
* Here’s Masqua Attack in action.
* Because iOS 8 devices don’t show provisioning profiles already installed on the devices, the FireEye team suggests “taking extra caution when installing apps.”
* Earlier this month, security researchers at Palo Alto Networks discovered a new malware dubbed WireLurker which has managed to infect more than 400 apps in the Maiyadi App Store, a third-party Mac app store in China, before Apple blocked the identified apps to prevent them from launching.
* Apple generally does not disclose, discuss or confirm security issues until a full investigation is complete, and any necessary patches or releases are available, for the sake of “protection of our customers,” according the Apple Product Security webpage.
* [FireEye]

