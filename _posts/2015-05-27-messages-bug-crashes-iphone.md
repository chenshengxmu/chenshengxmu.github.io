---
layout: post
title: How to get around strange Messages bug that crashes your iPhone
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/iOS-Messages-Arabic-string-bug-iPhone-screenshot-002.png)
* An odd bug that lets ill-minded folk send you a message which causes your iPhone to respring has been making rounds.
* In case you missed it, a very specific string of symbols and Arabic characters sent through iMessage or SMS sends an iPhone in an immediate respring, causing the device to crash and quickly reboot, as first noticed on Reddit.
* It’s a serious issue which in some instances can break the Messages app on your iPhone so here are a few possible workaround solutions until Apple delivers a proper fix.
* So-called “Unicode of Death,” the actual “bug” stems from the way Unicode decodes characters, causing the above string to decode to an infinitely repeating message.
* What happens next is your iPhone’s memory gets overwhelmed in the process, causing the phone to respring. You don’t even have to open the message or receive a notification, it’s an insta-respring.
* Having tried it out myself, I can safely report that the bug seems to work as described above. Having texted the offending message to myself, I immediately switched to the System Monitor app, a 99 cent download in the App Store, to check system resources.
* Sure enough, I was able to watch RAM on my device go from around 400MB of free memory down to less than a hundred.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/iOS-Messages-Arabic-string-bug-iPhone-screenshot-001.jpg)
* As soon as the amount of free RAM went below 50MB, my iPhone suddenly wigged out. Users who are jailbroken have reported that the code causes their iPhone to go into safe mode, which typically happens when the Springboard crashes.
* Crashing seems to occur in iOS 8.1, iOS 8.2 and iOS 8.3 versions. The reportedly manifests itself in WhatsApp, too, though I couldn’t verify this at post time. According to some reports, the bug doesn’t crash the device if the person sent you the message while you were looking at the conversation with them.
* Some people blame the bug on how banner notifications process the Unicode text. Apparently, the banner notification briefly attempts to present the incoming text and then gives up, crashing the device. Furthermore, the phone will reboot even if the message hits it while you’re on the Lock screen.
* Disable Messages alerts Many affected users have suggested that setting notification previews to None and disabling Show on Lock Screen in Settings > Notifications > Messages prevents this behavior, which would explain why WhatsApp also crashes the device after receiving the Unicode string of Death.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/iOS-Messages-Arabic-string-bug-iPhone-screenshot-003.jpg)
* You may also want to set Show in Notification Center to None as some users claim the issue immediately restarts their device after they try to pull up the text from the Notification Center.
* I wouldn’t recommend sending the offending message without the “effective” and “Power” because Messages will break and you will no longer be able to access it. As MacRumors explained, if Messages was opened at a list view, the app crashes automatically when you try to open it.
* “If it was opened to the conversation where you received the message, the app will open, but attempting to go to another conversation causes Messages to crash,” explains the publication.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/iOS-Messages-Arabic-string-bug-iPhone-screenshot-004.jpg)
* Use Photos to send a random photo Another Reddit thread offers a workaround solution which involves opening the Photos app to send a random photo to the person who texted you the message, then going into iMessage and deleting the conversation.
* Send a message to yourself If you still can’t access Messages, or find yourself stuck in the conversation, replying to the original message or sending a message to yourself fixes the problem.
* Fortunately, you can ask Siri to send a message to yourself. Another method involves opening the Notes app, creating a new note and sending it via Messages to yourself through the Share sheet.
* This should clear away the malicious message.
* Delete the offending conversation Finally, try tapping and holding on any individual bubble in the conversation until the menu appears. Now choose More and then Delete All at the top of the screen. This should purge all of the offending text and keep the Messages app from crashing.
* Filter unknown senders in Messages And if I might make another recommendation, I’d advise you to go to Settings > Messages and enable Filter Unknown Senders.
* Jailbreak tweak There are a couple jailbreak tweaks available that will help prevent Effective Power from affecting your device to begin with.
* This will enable the Unknown Senders Filter in Messages. You will still receive messages from people not in your address book, they’ll just go to the Unknown Senders section in Messages and you won’t receive alerts for these.
* Apple told TechCrunch it’s aware of the problem and working on a fix.
* “We are aware of an iMessage issue caused by a specific series of Unicode characters and we will make a fix available in a software update,” said an Apple spokesperson.
* Source: Reddit, MacRumors

