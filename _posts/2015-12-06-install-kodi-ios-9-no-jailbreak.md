---
layout: post
title: How to install Kodi on iOS 9 without jailbreaking
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/kodi-ios-9.png)
* Kodi is one of those apps that I love using on my jailbroken devices, but did you know that it can also be easily installed and used on a non-jailbroken device? I just finished installing Kodi on my iPad Pro in a matter of minutes. Although it’s not as straightforward as installing it from Cydia, it can still easily be done with a bit of patience.
* I use Kodi to stream live local channels to my iOS devices via an HDHomeRun box, but I also use it to stream video from an external drive hooked up to my AirPort extreme. Needless to say, it’s a great app that’s not just limited to jailbroken device thanks to Xcode 7.
* Step 1: Download the Kodi.deb file, the iOS App Signer, (save both to desktop) and make sure you have Xcode 7 installed.
* Step 2: Connect your iOS device to your Mac, launch Xcode, create a new application, and give it a unique name like “Kodi” and an identifier.
* Step 3: Under the Team drop down box, select your current team, or login with your Apple ID. If you see a button that says Fix, click it to resolve any provisioning profile issues.
* Step 4: Minimize Xcode and launch iOS App Signer. Click browse and double click on the Kodi.deb file that you downloaded. Select the Signing Certificate and Provisioning Profile, and click Start. The Kodi.ipa file should be saved to your desktop.
* Step 5: Open Xcode, and click Window in the menu bar and Select Devices.
* Step 6: Select your iOS device from the list of devices, and click the + sign and select the Kodi.ipa file.
* Step 7: The Kodi app should be built and deployed to your device.
* Once Kodi is deployed to your device, you can unplug it from your Mac, and begin using the app. Remember, no jailbreak is required in order to do this. If you have problem, be sure to check out our video embedded above, and check out the original post over at the Kodi forums. Special thanks to DanTheMan827 for posting the original tutorial.

