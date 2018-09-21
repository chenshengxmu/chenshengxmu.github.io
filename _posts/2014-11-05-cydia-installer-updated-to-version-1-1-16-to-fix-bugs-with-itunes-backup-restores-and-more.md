---
layout: post
title: Cydia Installer updated to version 1.1.16 to fix bugs with iTunes backup restores and more
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/IMG_0128-0.jpg)
* Once again, Saurik has pushed an update for Cydia Installer. This update provides several important bug fixes that makes it a must-update for anyone who is currently jailbroken.
* In this update, you’ll find a bug fix for the previous Cydia releases related to iTunes backup restores, iOS 8 multitasking timeouts, App Store redirects, and more. Check out the full change log after the break.
* Full change log:
* iOS 8 “Restore from Backup” Fixed
* This update fixes an important bug in Cydia 1.1.14 and 1.1.15 on iOS 8: if you used “restore from backup” in iTunes after your first use of Cydia, you needed to reinstall this package to make sure your device could safely reboot with a passcode enabled.
* It should now be OK to use the iTunes “restore from backup” feature without needing to then reinstall Cydia Installer afterward to avoid reboot problems.
* Increase iOS 8 Multitask Timeout
* Cydia automatically refreshes the package catalog if it was suspended too long. This timeout is now set to 15 minutes. It had previously been only 15 seconds, because that’s what I was using to test this feature, and I forgot to change it back. (Doh.)
* Improved App Store Redirect Block
* The initial version of this feature turned out to only be partially effective: we have done wider testing and have improved our iTunes URL detection.
* Login Dialog on iPad Works Now
* Apparently, logging in to an account on an iPad would not reload the login dialog, making it seem like you needed to log in again?! This is now fixed.
* As you can see, this is a fairly large update to Cydia. Props to Saurik for putting in so much work in such a short turnaround time.
* While most of the fixes addressed in this update have little bearing on my personal usage of Cydia, I do appreciate the update to the timeout setting for Cydia package refreshes. I find the multitasking to work much better now due to the 15 minute increment adjustment.
* Have you updated to actually 1.1.16 yet? If so, has it fixed any of your issues? Drop us a line down below in the comments with your thoughts and opinions.

