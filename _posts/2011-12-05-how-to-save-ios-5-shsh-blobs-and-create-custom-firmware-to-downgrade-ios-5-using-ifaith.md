---
layout: post
title: How to Save iOS 5 SHSH Blobs and Create Custom Firmware to Downgrade iOS 5.x Using iFaith
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/12/iFaith.jpg)
* As we told you yesterday, iFaith — the Windows based tool that allows you to manage SHSH blobs on all devices sans the iPhone 4S — has been updated with the ability to save iOS 5.x blobs, and create custom firmware that you can use to downgrade your iOS 5 device.
* It works very similar to RedSn0w’s stitching feature, except the big difference here is that it encompasses Apple’s APTicket and features iOS 5 compatibility.
* Up until now it was impossible to downgrade an iOS 5.x device to a previous version of iOS 5. That’s no longer the case, as our video tutorial shows you inside…
* As noted, iFaith is a Windows only tool, so until RedSn0w or some other Mac based software is updated, you will need a Windows box to successfully back up your SHSH blobs for iOS 5 and create a signed IPSW that you can use regardless of whether or not Apple is still signing that particular firmware.
* TinyUmbrella has been updated to allow you to save your SHSH blobs, but there’s still the question of APTicket, and there’s still no “stitching” or signing solution for Mac users just yet. We’ll go out on the limb and say there will certainly be a full Mac solution soon.
* Notes: You must be on a Windows box. You must have an iDevice (not compatible iPhone 4S yet) that has iOS 5+ installed. Run iFaith as administrator for best results. You will need your current Firmware available to create the custom IPSW.
* Step 1: Download and run iFaith.
* Step 2: Put Your device into DFU Mode.
* Step 3: Select “Dump SHSH Blobs” click Proceed, Let’s Go!, select No on the Apple TV 2 prompt, and click Start.
* Step 4: iFaith will dump your SHSH Blobs and ask you to save them. Save them on your desktop.
* Step 1: Run iFaith.
* Step 2: Put Your device into DFU Mode.
* Step 3: Select “Build *signed* IPSW w/ Blobs”.
* Step 4: Browse for your device’s current firmware. You can also download directly from iFaith, but I recommend using the browse feature.
* Step 5: Click Build IPSW.
* Step 6: It will Extract the IPSW and place it on your desktop.
* Step 7: Click Proceed and Click Start (Your device should already be in DFU mode, this will place it into PwnedDFU mode for custom restore using iTunes).
* Step 8: Close iFaith, open iTunes and it should find your device in recovery mode. Hold Shift and click Restore and find your custom firmware. The firmware should be named something like: 0000000000_iFaith_iPhone_4-5.0.1 (9A405)_signed.ipsw.
* In this example I created a custom 5.0.1 IPSW file. Since Apple is still signing this firmware, I won’t be able to verify my downgrade until iOS 5.1 is released, and Apple stops signing 5.0.1. Until then, I recommend keeping your custom firmware in a safe place for future pain-proof restores.
* If you’re on iOS 5.0, you can test out your downgrade capabilities now since iOS 5.0 is no longer being signed. Just make sure that you select the custom firmware when you do your restore.
* Again, this will NOT work on an iPhone 4S since, like the iPad 2, the 4S isn’t limera1n susceptible.
* Have you tried saving your iOS 5 blobs, creating custom firmware, upgrading, and downgrading? If so, let us know how it worked for you in the comments below!

