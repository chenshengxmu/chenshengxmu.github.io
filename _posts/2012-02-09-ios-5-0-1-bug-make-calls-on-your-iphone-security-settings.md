---
layout: post
title: iOS 5.0.1 bug lets anyone make FaceTime calls on your iPhone, even with security settings
---
* Canadian tech blogger Ade Barkah has discovered a new security loophole in Apple’s most recent iOS update, iOS 5.0.1. It involves FaceTime, and lets anyone make a call out, even with the highest security settings in place.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/Voice-Control.png)
* The loophole has been confirmed to work on both the iPhone 4 and iPhone 4S, and hopefully is addressed by Apple soon. Barkah details the bug on his blog…
* We’re able to trick Voice Control to enumerate through the private address book and make live FaceTime video calls on a locked iPhone 4, even with Voice Dial specifically disabled in the settings.
* Barkah set his iPhone 4 to the highest security settings with a passcode, and also turned off Voice Control. Even with the security settings in place, he could still make a call through the Emergency Call page, sending in commands through Voice Control, without having to type in his password. Luckily, actual voice calls didn’t go through, but rather he could look through contacts and even see contacts’ pictures. FaceTime calls did go through, however.
* Now Voice Control leaks that I have two numbers for Lisa Klein: her “mobile” and another number at the “love shack“.  Had this been my jealous girlfriend probing my locked phone, I would’ve been totally busted! Remember, we’re getting all this info from a locked phone with Voice Dial explicitly disabled. So far we’ve only enumerated through the Contacts.  Can we actually complete a call from the locked phone?  With FaceTime, the answer is yes! Again starting from the Emergency Call screen, this time I say, “FaceTime <Lisa Klein>”.  
* Obviously for iPhone 4S users, this will only work if Siri is turned off (default setting), because that’s when the iPhone 4S will begin using Voice Control. The iPhone 3GS doesn’t have this problem, because the older device doesn’t feature FaceTime, which was introduced with the iPhone 4. Someone could still sniff through your contacts, though.
* This is a big problem. Anyone could snoop through your contacts, or even worse, call one of them. iOS 5.1, which is rumored to launch March 9th, will hopefully address this bug.
* [Cnet]

