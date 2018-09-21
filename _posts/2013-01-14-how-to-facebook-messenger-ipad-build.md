---
layout: post
title: How to get Facebook Messenger working on a jailbroken iPad
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/01/Facebook-Messenger-howto-iPad-screenshot-001.png)
* Facebook a week ago issued invites for a major news conference due tomorrow to “come and see what we’re building”. One source claims the iPad version of the popular Messenger client will be on tap as the social networking giant’s last-minute “one more thing” surprise.
* What you may not have known is that the current iPhone build of Messenger already has the iPad interface and code in place. And if you happen to have your device jailbroken (as most readers who frequent iDB do), you may want to unlock Messenger for iPad right now. Just follow this simple guide and Jeff’s easy to follow video instructions, embedded right past the break…
* For starters, you’ll need iFile (every jailbreak power user should have it installed) because we’re gonna modify some files to fool the app into thinking it’s running on an iPad.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/01/Facebook-Messenger-howto-iPad-screenshot-002.png)
* iFile lets you transfer and edit files on jailbroken devices, as well as install .deb packages directly from it.
* Here’s Jeff’s quick how-to on getting the Messenger app run on a jailbroken iPad.
* And your step-by-step guide (via BiteYourApple):
* • install the iPhone version of Facebook Messenger on your iPad from the App Store • open iFile and tap Applications in the lefthand menu • from there, open the Messenger folder on your device and navigate to a sub-folder containing the info.plist file for the Messenger.app • tap the info.plist file and find this string:
* <key> UIDeviceFamily </ key> <array> <integer> 1 </ integer>
* • replace a ‘1’ (which corresponds to the iPhone) with a ‘2’ (the iPad version) • save the file • re-spring and you’re good to go
* That’s all there is to it, really.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/01/Facebook-Messenger-iPad-build-hack-iFile-output.png)
* Facebook Messenger will now run in the native iPad mode.
* Since this is a hack, don’t expect everything to work as in the shipping build, expected tomorrow at Facebook’s media event. If sources are right, Messenger for iPad will support all the features we’ve come to love on the iPhone, including emoticons, read receipts, location, group messaging and more.
* The new voice-recorded messaging feature from the recently updated iPhone version should also work on iPad. We’re also keeping our fingers crossed for VoIP and Skype video calling.
* Let us know in the comments whether the above steps did the trick for you and how you liked the iPad build.
* Jeff Benjamin contributed to this report with his video guide.

