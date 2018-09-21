---
layout: post
title: iOS discovered to be saving deleted iMessage attachments
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/attachments-in-messages.png)
* This is kind of odd. It’s recently been discovered that iOS has been holding on to deleted SMS and iMessage attachments. The software stores all attachments in the Library/SMS/Attachments directory, and when they’re erased from Messages, they’re supposed to be erased there too.
* But as many folks have pointed out, that doesn’t seem to be the case. One user in particular, on a quest to determine what the ‘Other’ category listed in his device storage consisted of, found that the directory contained thousands of sub-folders with images he was sure he had deleted…
* Here’s his post in a Reddit thread from late December:
* “Yet another quest to figure out what the “Other” was on my device (which again had managed to take up more space than anything else on my iPhone), I deleted everything. All apps, music, photos, etc. I cleared Safari’s cache, deleted all text messages, removed all Mail accounts, etc.
* When browsing my device with iExplorer, there was nothing on it. When I browsed my Backup, one location stood out: /Library/SMS/Attachments/. (or maybe /private/var/mobile/Library/SMS/Attachments/ or /var/mobile/Library/SMS/Attachments/)
* It had thousands of sub-folders and contained images that I had both sent and received, going back since my last full wipe/restore. Everything. Stuff I hadn’t seen in months. Stuff I had deleted months ago. I know I deleted the images from chat. Heck, I had long deleted the conversations. Plus, I know I had since deleted all my conversations. So why were these attachments still there?”
* Before you go freaking out, iClarified is reporting that Apple may have quietly fixed the glitch in the recent iOS 6.1 update. But still, for folks with devices on older firmwares, this could be considered a significant security risk. Or at the very least, an annoyance due to the extra space it uses.
* So what can you do about this? Well, jailbroken users can delete all of their attachments in the directory using either SSH or iFile. Simply navigate to /private/var/mobile/Library/SMS/Attachments/ on your device and delete the sub folders. Be careful though, this could cause conflicts with other apps.
* Obviously, your safest bet is just to do a clean restore to iOS 6.1, since it appears to fix the problem. And that’s a good idea anyway, if you’re not already on it, because it looks like Apple is preparing to release iOS 6.1.1, which will more than likely patch the exploits used in the new evasi0n jailbreak.
* Update: for those having trouble testing this out, here is a quick How-To. First, identify a folder with a recent iMessage attachment using a tool like iFunBox, and write down its path. Then go into your Messages app and delete the conversation where the attachment was. And finally, go back into iFunBox and navigate to the path you wrote down. If you’re in iOS 6.1, the folder should be gone.

