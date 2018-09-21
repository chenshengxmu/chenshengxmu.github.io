---
layout: post
title: How to Prepare Your iPhone or iPad for the Spirit Jailbreak
---
* Even though Comex delayed the release of Spirit, we know that we’re just a few days away from the official release date. Spirit will sure be able to jailbreak your iPhone, iPod Touch and iPad, but the exploit used will most likely be patched in a matter of days by Apple.
* To protect yourself in the event of an “accidental upgrade” to a newer firmware which would make you lose your jailbreak, you will have to save your SHSH blobs.
* What is SHSH and why save them?
![img](http://media.idownloadblog.com/wp-content/uploads/2010/03/ECID-SHSH-255x74.jpg)
* Taimur gave us a pretty good description of what SHSH are and why they are important:
* “So first up, what exactly is SHSH blob or ECID SHSH? Well, it is basically is a unique signature which is checked against Apple servers whenever you decide to restore the firmware on any of your iDevice (iPhone, iPad and iPod touch). Once a new firmware is released, Apple stops signing the older firmware, hence making it impossible to restore back to the older firmware from iTunes.
* Now to “why is it important to save SHSH blob”: The creator of Cydia has setup a new server which basically mimics Apple’s verification server and can save your older signature (SHSH blob) so that you can downgrade or restore back to the older firmware. This is important because if you don’t have your SHSH blob saved, and accidentally update to new firmware, you’ll loose your jailbreak and furthermore, you wont be able to downgrade back to older firmware to re-jailbreak your device.”
* The Dev Team warned us yesterday about the consequences and gave us simple directions on how to save our SHSH. There are 3 ways to do that:
* Note that saving or backing up your SHSH blobs is not vital or mandatory. It’s just a safety step that will allow you to restore or downgrade should something go wrong in the future.
* UPDATE: Danny sent me a walkthrough to back up your SHSH for iPad on a Mac with Umbrella.
* Back up your iPad. Nothing SHOULD happen, as this is pretty straightforward, but in the worst case, always have a back-up.
* Download Firmware Umbrella. Open up the DMG inside, open the app, leave it open.
* Now you have to put your iPad in recovery mode (don’t worry you can bring it out without having to restore or lose any data). To do this unplug your iPad, hold down the home button, and while still holding it plug it back in. Keep holding it until the iTunes logo shows up.
* Now open up “System Profiler” and head over to USB (sidebar). Click on where it says “Apple Mobile Device (Recovery Mode)”. At the bottom a lot of numbers will appear, but look towards the right where it says “ECID” followed by 16 numbers. Copy those.
* You can take your iPad out of recovery mode now, just press and hold the power and home buttons for 10 seconds and it’ll boot back up.
* Go back to Umbrella and copy the ECID, choose iPad for the device, and submit to the Apple repository, and then change it over to the “saurik” repo (this might take a few seconds as the server is beingbombed right now).
* And that’s it. You’ve now backed up your SHSH blobs without fuc$@%$ up your iPad. I tried doing localhost on Umbrella and it saved a SHSH file on my desktop (although it said it had failed), so save that just in case.
* P.S: As to the jailbreak, should be coming out in a bit, though comex just said probably not this Friday. 🙁
* P.S.S: I’m new to this ECID thing too (I’ve had no need for it since I use a 2G iPod Touch) but if you need help post in the comments and I’ll do my best to help out.

