---
layout: post
title: iOS 10 found to store call logs for up to 4 months, Apple explains
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-006.jpg)
* iOS 10’s been found to upload missed call logs from apps like WhatsApp and Skype to servers, as well as near-real time FaceTime call logs—even if iCloud backup has been turned off, according to a Russian company called Elcomsoft which makes iPhone forensic tools aimed at law enforcement agencies.
* Elcomsoft CEO Vladimir Katalov suspects in an interview with Forbes that this is most likely a result of iOS 10’s expanded scope of call logging due to the new CallKit framework which was designed to make VoIP calls from apps like Viber, WhatsApp and Skype behave like cellular calls and integrate with Phone’s Recents and Favorites.
* According to Apple itself, call log syncing through iCloud is a convenient feature that elevates user experience by allowing customers to easily return calls from VoIP apps.
* In addition to FaceTime call logging, iOS 10 now uploads incoming missed calls from apps like WhatsApp and Skype to its servers. Only metadata (data about data) is being stored temporarily on servers, not the actual recordings of your conversations.
* Synced metadata contains full information about call duration and both parties. “We were able to extract information going back more than four months,” said Katalov.
* He further explained:
* Syncing call logs happens almost in real time, though sometimes only in a few hours. But all you need to have is just iCloud Drive enabled, and there is no way to turn that syncing off, apart from just disabling iCloud Drive completely.
* The problem is, many apps on your iPhone won’t work properly if you disable iCloud Drive or will at least lose their iCloud-related features completely.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-CallKit-007.jpg)
* Apple claims in its privacy-related documents that it stores FaceTime call logs on servers for up to 30 days. Katalov points out that the firm doesn’t make it clear that it keeps call logs even when iCloud backups are switched off.
* Apple responded to the Forbes report with the following statement:
* We offer call history syncing as a convenience to our customers so that they can return calls from any of their devices. Apple is deeply committed to safeguarding our customers’ data. That’s why we give our customers the ability to keep their data private.
* Device data is encrypted with a user’s passcode, and access to iCloud data including backups requires the user’s Apple ID and password. Apple recommends all customers select strong passwords and use two-factor authentication.
* It should be noted that Apple holds the encryption keys that protect iOS device backups in iCloud which allows them to read data in backup files to comply with court orders requesting access to these iOS device backups.
* The company currently does not utilize end-to-end encryption for iCloud backups because doing so would render backup files and any iOS device data stored in them inaccessible should a user lose the encryption key.
* iOS security expert Jonathan Zdziarski called iOS 10’s call log syncing via iCloud more of an engineering issue around “making Handoff work” when you are answering calls between your phone and your desktop or if you’re using FaceTime on your desktop.
* “They need to be able to sync a lot of that call data. I suspect whatever software engineer wrote that part of it probably decided to just go and stick that data in your iCloud Drive because that’s kind of what its purpose is. I’m convinced it wasn’t very well thought out if that’s the case,” he explained.
* Apple was also wrongly accused of storing iMessage contact data on its servers for up to 30 days for no apparent reason. In reality, the publication which broke that story didn’t really have a clue as to how iMessage works because entering a phone number or email address when starting a new iMessage conversation prompts Messages to verify contact information against Apple’s directory of iMessage-enabled addresses on iCloud.
* Source: Forbes

