---
layout: post
title: How to install Kodi on the new Apple TV 4
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/Kodi-Apple-TV.jpg)
* It’s been a while in the making, but it is now possible to install Kodi on tvOS. Granted, this is a very early tutorial, and Kodi for Apple TV 4 is still in the pre-pre-alpha stages, but it does work, although not perfectly yet.
* Still, the fact that we can even get Kodi on the Apple TV without jailbreaking is a win in itself. In this video tutorial, I’ll show you how to install Kodi on the new Apple TV running tvOS.
* Note: Please watch the video in its entirety before trying this tutorial. It should help clear up a lot of questions. Also, if you don’t yet have a free Apple developer account, please learn how to get one using this tutorial. It only takes a few minutes. Also, you will need a USB Type-C cable to complete this tutorial. This is a new type of USB cable that can be purchased from Amazon for less than 7 bucks.
* Step 1: Download the latest nightly Kodi.deb file, the iOS App Signer, (save both to desktop and unzip the iOS App Signer) and make sure you have Xcode 7 installed.
* Step 2: Connect your Apple TV to your Mac using a USB Type-C cable.
* Step 3: Launch Xcode → click Create a new Xcode Project → select Application under tvOS → Single View Application, and click Next.
* Step 4: In the Product name field, insert a unique name like KodiAppleTVforYourNameHere and click Next → Create
* Step 5: Under the Team drop down box, select your personal team, and click the Fix Issue button to resolve provisioning issues. You will need to ensure that you are signed into Xcode with a free Apple developer account. You can learn how to do that using this tutorial.
* Step 6: Ensure that your Apple TV is selected in the destination menu at the top of the screen. You can also click Product → Destination, and select Apple TV.
* Step 7: Minimize Xcode and open the iOS App Signer.
* Step 8: Click Browse on the iOS App Signer and select the Kodi.deb nightly file from the desktop.
* Step 9: Select your Apple ID in the iOS App Signer’s Signing Certificate box.
* Step 10: Select the Project name/bundle identifier you just created in Xcode in iOS App Signer’s Provisioning Profile box.
* Step 11: Click Start in the bottom right-hand corner of the iOS App Signer, and the .IPA file for Kodi will be built and saved to the desktop.
* Step 12: Open Xcode → Window → Devices and select the Apple TV
* Step 13: Click the ‘+’ sign and select the .IPA file from the desktop and click Open. Kodi will now be deployed to your Apple TV
* Step 14: Once finished, you should see the Kodi app on your Apple TV’s Home screen.
* That’s all there is to it. You can now enjoy a very early version of Kodi on your new Apple TV. What do you think?

