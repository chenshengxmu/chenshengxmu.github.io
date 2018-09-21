---
layout: post
title: Easy to fix iOS bug bypasses Lock screen on iPhone 6s, giving access to Contacts and Photos
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/iPhone-6s-Siri-image-001.jpg)
* First spotted by Jose Rodriguez, who last September found a similar flaw in iOS, and highlighted by The Daily Dot, Apple’s mobile operating system contains a vulnerability that lets others access your Contacts and Photos using Siri on the Lock screen of your iPhone 6s, bypassing your passcode.
* Fortunately, there’s an easy fix for this which involves revoking Siri access to Twitter and Photos and disabling Lock screen access to the personal digital assistant. Apple has not commented on the bug, which will likely be squashed in an upcoming software update.
* Here’s how you can reproduce the issue.
* It begins with invoking ‘Hey Siri’ on the Lock screen, or waking your device from sleep and holding down the Home button with an unregistered finger to bring up Siri.
* Next, ask her to conduct a Twitter search (say “Search Twitter”). You may be asked to grant Siri permission to access your Twitter account. Siri will now ask you what to search for so say something like “at-sign gmail dot com” and then look for an item containing an email address in search results.
* Tap it and use 3D Touch on an email address. On the preview screen, select the Add to Existing Contact option. Your iPhone will bring up the Contacts list where it really shouldn’t. If you select an existing contact and then choose to add a photo to the contact, your iPhone will at this point also provide full access to the photo library.
* Here’s a video of the vulnerability in action.
* This issue exploits the 3D Touch loophole so it’s isolated to the latest iPhone 6s and iPhone 6s Plus devices running iOS 9.0 or later. Additionally, Rodriguez claims that the trick is also applicable to Siri results for WhatsApp friends list searches.
* Additionally, if you have just restarted your device or a Touch ID grace period has timed out, you will need to enter your passcode before Siri can be used on the Lock screen.
* In order to exploit this vulnerability, Siri on a user’s device must have permission to access Contacts, Photos and Twitter.
* RELATED: Ten ways to increase privacy on iOS
* As a workaround, disabling Siri’s ability to access Twitter and Photos in Settings → Privacy → Twitter and Settings → Privacy → Photos should help protect yourself.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Disable-Siri-Locked-iPhone.png)
* However, this won’t prevent nefarious users from seeing your contacts so in addition to these measures, affected users are advised to disallow Siri on the Lock screen in Settings → Touch ID & Passcode under the Allow Access When Locked heading.
* Were you able to reproduce this issue on your iPhone 6s?
* Source: The Daily Dot

