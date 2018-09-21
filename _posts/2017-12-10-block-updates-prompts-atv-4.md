---
layout: post
title: How to block automatic updates and prompts on non-jailbroken Apple TV 4 and 4K
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Apple-TV-colored-screen.png)
* With the release of Ian Beer’s new exploit, some hope for a future Apple TV 4/4K jailbreak has appeared. The exploit will theoretically work on firmwares up to and including tvOS 11.1, but not 11.2 and higher. For this reason, I advised in my jailbreak guide that Apple TV 4/4K users who want to have a chance of jailbreaking manually restore now to tvOS 11.1, before it goes unsigned. You can use our guide on the topic to do so.
* Once you are on tvOS 11.1 however, you have to contend with Apple’s update policy. The Apple TV is set to automatically update its software in the background. Even if you turn that off, it will still automatically download the update in the background silently, and then routinely prompt you to install it. This cannot be disabled, and it’s only a matter of time until you or someone in your house accidentally agrees. There have even been reports of the device not respecting automatic update settings on occasion.
* With that in mind, here is a nifty way to completely block all Apple TV updates, update prompts, and background firmware downloads. It works on tvOS 9, 10 and 11, and does not require a jailbreak.
* 1) First, let’s do our best with what Apple gives us. On your Apple TV, navigate to the Settings app and then go to System > Software Updates, and make sure that Automatically Update is firmly set to Off.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-settings-software-updates.png)
* 2) Now for the real business. On your Mac, download and open Apple Configurator 2 from the App Store. Connect your Apple TV 4 to your Mac via USB-C. If you have an Apple TV 4K, follow our guide to wirelessly pair it with your computer instead. The device should now appear in the Apple Configurator 2 window.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-configurator-2-mac-app-store.png)
* 3) Download the iOS 11 beta configuration profile. Drag the downloaded profile onto the Apple TV image in Apple Configurator.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-configurator-2-connect-apple-tv.png)
* 4) Accept the terms and conditions which appear in Apple Configurator, and then a new prompt will appear, telling you to continue the process on your Apple TV. Leave Configurator as it is and turn to your Apple TV.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-configurator-2-accept-terms.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-configurator-2-install-profile.png)
* 5) The following screen will appear, simply hit Install.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-install-profile.png)
* 6) On the next page, hit Next to proceed.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-profile-terms.png)
* 7) Finally, press Install once more.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-install-profile-confirm.png)
* 8) Once installed, your Apple TV will prompt you to Restart to apply changes. Do so.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-restart-required.png)
* 9) When it boots up again, navigate to Settings on the Apple TV and go to General. Scroll down and look for Profiles. If it’s not there, it hasn’t worked and you should try adding the profile again. If it is there, select it and make sure it shows the iOS 11 beta profile listed there.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-settings-profiles.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-settings-ios-beta-profile.png)
* 10) We can now test it. Go to Settings > System > Software Updates. Make sure Automatically Update is still Off, and then select Update Software at the top. If our method has worked, the profile we installed should trick the device into thinking there are no available updates, and you should get the following screen:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-up-to-date.png)
* Of course, if you’re already on the newest firmware you’ll get this screen anyway, but this guide assumes you have quickly restored to tvOS 11.1 in hopes of a jailbreak, or are already on an even older firmware. If you’re on tvOS 11.1 or lower and this screen appears, despite tvOS 11.2 being available, you know it worked and updates are now blocked on your Apple TV! If this screen reports anything else, starts downloading an update, or already shows an update downloading, cancel/remove the download and then try the guide again.
* 11) Disconnect your Apple TV 4/4K from your Mac and enjoy all the features of tvOS 11.1, without worrying about a sneaky update ruining your chances of a jailbreak in future.
* If you decide you want to update your Apple TV after all, reverting is simple.
* 1) Navigate to Settings > General > Profiles, and select the iOS 11 beta profile we installed previously.
* 2) On the next screen, select Remove Profile.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-remove-profile.png)
* 3) Confirm by selecting Remove again.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/apple-tv-4-remove-profile-confirm.png)
* 4) Reboot when prompted.
* 5) Head to Settings > System > Software Updates and check for an update. Goodbye!
* This is an easy and elegant way of preventing your Apple TV from seeing updates, and from bothering you about them. It remains to be seen whether Jonathan Levin will update his LiberTV jailbreak to make use of Ian Beer’s new exploit, and offer us a tvOS 11.1 jailbreak. Do not hassle him about it in the meantime!
* The bugs are there to be used however, and by following this simple precaution you’ll be prepared for a new jailbreak, if and when it’s released. And remember, downgrade now to tvOS 11.1 before it goes unsigned.
* Need a hand? Have a question about this guide, or want to request another one? Let me know.

