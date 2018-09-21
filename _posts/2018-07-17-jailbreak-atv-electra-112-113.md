---
layout: post
title: How to jailbreak your Apple TV with Electra on tvOS 11.2-11.3
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/ElectraTV-Header.png)
* Thanks to nitoTV and the Electra Team, we now have a stable jailbreak for tvOS 11.2-11.3. If you heeded our advice in the run up to this release and stayed on the right firmware, you’re probably itching to try it out. We’ll show you how.
* This process varies depending on whether you are an Apple TV 4 or Apple TV 4K user, and is unfortunately faster on the older device. Follow the section which applies to your device.
* Apple TV 4 users
* All you fine fellows have to do is download the latest version of Electra for tvOS 11.2-11.3 from the official website, connect your laptop to your Apple TV 4 via USB-C, and sideload the app using Cydia Impactor. This will work on Mac, Windows and Linux, and is as easy as pie. For more detailed instructions, follow Steps 1-6 of this similar guide, replacing any references to LiberTV with the ElectraTV app instead.
* Once the app is on your Apple TV 4, click here to skip to the next section.
* Apple TV 4K users
* You enterprising bounders are going to have to get a little more involved due to the Apple TV 4K’s lack of ports, and are unfortunately going to need access to a Mac to proceed. If you don’t have one, I recommend asking a friend, or else installing macOS in a virtual machine on your existing laptop.
* If you’ve signed and sideloaded apps to your Apple TV 4K before and know how to do it successfully, do that now and then click here to skip to the next section.
* If you haven’t, follow our guide on How to sign and sideload apps to the Apple TV 4K first to get the ElectraTV.app onto your Apple TV 4K, then head back here.
* You’ll find instructions on how to use the app below.
* This is the easy bit. With the Electra for tvOS application on your Apple TV or Apple TV 4K, simply:
* 1) Launch the ElectraTV app from the Home Screen.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/electratv-home-screen.png)
* 2) Click the Jailbreak button and let it do its thing. It’s very reliable, but if it fails, simply reboot and try again.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/electratv-jailbreak-screen.png)
* Notice the Set Nonce button? You won’t need it today, but it might allow you to use futurerestore to move to unsigned firmwares, if you’ve saved/start saving your blobs.
* 3) Once the jailbreak has succeeded, you’ll be greeted with the following pop-up:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/electratv-open-ssh.png)
* Your SSH is running!
* This means you MUST change your root passwords NOW.
* 4) Your Apple TV will now respring. Afterwards, you should find the nitoTV app on your Home Screen, which is the Cydia equivalent for tvOS. You’re now free to use SSH, install unsigned apps, and install whatever tweaks there are on nitoTV.
* If you have a free Apple account you will have to sideload the ElectraTV app again every 7 days. If you have a paid account, it will last for a year.
* On Apple TV 4 it’s as simple as using Cydia Impactor again.
* On Apple TV 4K, if you retained your signed app at the end of Step 5) of the section How to sign an app in our linked guide, you only have to use iOS App Signer on it again. This time, select the Re-Sign only option under Provisioning Profile in iOS App Signer. Then use Xcode to push it to the device (as per the section How to sideload an app in our linked guide). You will not have to repeat the other steps.
* Need some help? Have I missed something? Let me know in the comments.

