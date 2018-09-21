---
layout: post
title: Last chance to restore your device to iOS 11.1.2 with futurerestore!
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/last-chance-blobs-downgrade-header.png)
* Update: iOS 11.2.6 is now unsigned. You can no longer use futurerestore to restore any device to any firmware below iOS 11.3. Do not attempt the restores mentioned in this article.
* With the official release of iOS 11.3, the clock is ticking on iOS 11.2.6 signing. Normally this wouldn’t mean much to jailbreakers, who would be staying on a lower jailbroken firmware. This time however, it’s different. Many users on iOS 9 and 10 jailbreaks are waiting to see how the iOS 11 tools turn out before making the jump. So far, iOS 11.2-11.2.6 have maintained SEP and baseband compatibility with iOS 11.0-11.1.2 (the last jailbreakable firmwares), which allowed users to make the jump at any point, or wait it out a little longer.
* In iOS 11.3, that’s all changed. A compatible, signed SEP is required for futurerestore to work its magic and restore your device to unsigned firmwares (like iOS 11.0-11.1.2). Once iOS 11.3 is the only signed firmware, all futurerestores to firmwares below iOS 11.3 will be off the table permanently. No more restoring iOS 11 devices to iOS 11.1.2 for a fresh start, no more jumping from iOS 9/10 jailbreaks to iOS 11.0-11.1.2 jailbreaks, nothing will work.
* If you have blobs saved for iOS 11.0-11.1.2 and want to have a jailbreak in the near future, use futurerestore immediately to jump to those firmwares, using SEP and baseband from the iOS 11.2.6 IPSW, before it goes unsigned.
* This applies to jailbreakers on iOS 9 and iOS 10 who were waiting it out, as well as users on iOS 11.0-11.1.2 who were considering a fresh restore to clean house before entering survival mode.
* All futurerestores must be completed before iOS 11.2.6 goes unsigned, and must use the BuildManifest.plist, SEP firmware file, and baseband firmware file from the iOS 11.2.6 IPSW.
* Do not use files from the iOS 11.3 IPSW, and do not use the following options in futurerestore anymore:
* --latest-sep --latest-baseband
* They will cause your restore to fail, as they now take files from iOS 11.3.
* Remember to back up your device before restoring. I recommend reading my guide on futurerestore in full before beginning, but bear in mind some of the steps no longer apply. Once you think you understand the general principle, pull up a briefer guide which is specific to your starting firmware and operating system, and refer to that as you complete the process.
* Remember, if you were waiting on a lower jailbreak to decide whether or not the jump was worth it, you are now out of decision-making time. In the next few days, jumping to iOS 11.0-11.1.2 will become permanently impossible. If you have your blobs saved, now is the time to act.
* The iOS 11 jailbreak is now fairly stable, tweaks are being updated by the day, and app and tweak support for lower firmwares will quickly dwindle as time passes. I have updated the majority of my devices from iOS 10 jailbreaks such as extra_recipe and Yalu to iOS 11.1.2 and Electra. In the case of iPhone 7, the iOS 11 jailbreak is far easier to run, in the case of others, my experience has been similar. Even if you don’t want to jailbreak on iOS 11 yet and are waiting for a better tool to come along, you must still decide now whether or not to jump to iOS 11.0-11.1.2 and wait for it.
* Are you making the switch, or are you sitting this one out? Have you already made it? Let me know your thoughts in the comments below!

