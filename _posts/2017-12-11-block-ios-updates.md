---
layout: post
title: How to block iOS firmware updates, prompts, and background downloads while you wait for a jailbreak
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/block-ios-updates-header.png)
* A big problem potential jailbreakers face is that of updating too far to be supported by eventual tools. Either through impatience, or by accident, I hear often that a user’s device is now on too high a firmware to enjoy the latest release.
* Fear not however, as there is a simple, stable, and foolproof way of blocking iOS from updating. It not only prevents the update itself, but also the downloading of the update in the background, and the endless pop-ups too.
* Best of all, it works on all jailbroken and non-jailbroken devices on all recent firmwares. I advise anyone who wants to jailbreak in future and who doesn’t want to accidentally update to the latest firmware to use this. I even advise those who are already jailbroken to do this. Remember, recent semi-untethered jailbreaks can only prevent updates when in jailbroken mode; stay in un-jailbroken mode too long and the update will be back again. This method will protect you from that risk.
* 1) Open up Safari on your device and download the tvOS 11 beta configuration profile. Please note, you want the tvOS profile NOT the iOS profile. This is deliberate, and is what blocks the updates.
* If you prefer to download the profile on a computer, or already have it saved there, simply AirDrop it to your device instead.
* 2) Once you have hit download on the webpage, or received the profile via AirDrop, you will be redirected to the iOS Settings app to install it. You will see a screen like the one on the left below. Tap Install in the top-right to begin.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/block-ios-updates-install-profile.png)
* 3) Terms and conditions will appear, as shown in the right-hand picture above. Tap Install in the top-right once again, and then finally Install a third time, on the pop-up at the bottom of the screen.
* 4) The profile will install almost instantaneously, and will prompt you to reboot your phone to apply the changes. Press Restart to continue.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/block-ios-updates-restart-check.png)
* 5) Once you have rebooted, navigate to Settings > General > Software Update. If it reports that your software is up-to-date, as seen in the right-hand picture above, then it worked! Of course, if you’re already on the newest firmware you’ll get this screen anyway, but this guide assumes you’re on an older firmware in anticipation of a jailbreak. If you’re on any iOS version lower than current and this screen appears, despite a newer one being available, you know updates are now blocked on your device.
* If this screen reports anything else, starts downloading an update, or already shows an update downloading, cancel/remove the download and then try the guide again.
* 6) As a final check, navigate to Settings > General, and look for Profiles. Select it and make sure the tvOS 11 Beta Software Profile is listed there. If the profile is not there, or if there is no Profiles section at all in General, repeat the guide as something has gone wrong.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/block-ios-updates-show-configuration.png)
* If you decide you would like to update after all, and you don’t want to give yourself a shot of a jailbreak, it’s simple to undo your changes.
* Navigate to Settings > General > Profiles > tvOS 11 Beta Software Profile, and hit Delete Profile. Confirm your choice by pressing Delete again on the pop-up, and then Restart when prompted.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/block-ios-updates-delete-profile.png)
* This is the most effective way I’ve found to prevent iOS’ aggressive update policy. It works even on devices which have no jailbreak, as well as adding extra protection to jailbroken devices. Given the recent encouraging news we’ve had, downgrading to a lower firmware and blocking updates is looking like a good idea, and this is perfect for that. Check out my Can I Jailbreak? guide to find out if that applies to you. To perform this process on your Apple TV 4, we have a related guide.
* Need more help, or have a suggestion? Let me know in the comments.

