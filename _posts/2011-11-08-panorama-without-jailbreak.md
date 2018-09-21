---
layout: post
title: How to Enable iOS 5's Hidden Panorama Feature Without Jailbreaking
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/panorama1-e1320798616296.png)
* Yesterday, a hidden feature was revealed in iOS 5. It turns out that the panorama camera mode that Apple was rumored to be working on is actually baked into iOS. Shortly after the feature was exposed, jailbreakers were able to download a tweak to enable it.
* But what if you’re not jailbroken? With no iPhone 4S jailbreak available, and no word on an iOS 5 untether, not everyone’s iPhone is hacked at the moment. Luckily, the folks over at FSM just posted a method to enable the Panorama feature — no jailbreak required…
* All you need to enable the Panaroma feature is a desktop computer (PC or Mac) and file editing software that’s compatible with iDevices. FSM recommends using iBackupBot, but we’re assuming other titles like iExplorer would work just the same.
* For the sake of this tutorial we’ll use iBackupBot, which you can download here for free.
* Step 1. Backup your iPhone using iTunes.
* Step 2. Load up iBackupBot, and open your latest backup.
* Step 3. Locate the Library/Preferences/com.apple.mobileslideshow.plist file and open it.
* Step 4. Add in the following code above the <key>LastSelectTab</key> line: <key>EnableFirebreak</key><string>YES</string>
* Step 5. To save, click the Export icon. Once it’s exported, click the Restore icon and choose the file you just saved.
* That’s all there is to it. FSM claims this trick works on the iPhone 4S, but I couldn’t get iBackupBot to recognize my 4S backups. Regardless, if your handset isn’t jailbroken and your dying to try the Panaroma feature, this is about your only option.
* Any questions?

