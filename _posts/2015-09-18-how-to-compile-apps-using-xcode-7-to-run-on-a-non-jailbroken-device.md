---
layout: post
title: How to compile apps using Xcode 7 to run on a non-jailbroken device
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Provenance-iPad-big-GBA.jpg)
* As of iOS 9, you no longer need to rely on a jailbreak if you want to run some of the apps that aren’t available on the App Store. All you need is a Mac, Xcode 7, the code you wish to compile, an iOS device running iOS 9, a free developer account, and some time. If you have all of those things, then you can install apps on your iPhone or iPad without a paid developer account, and without a jailbreak.
* Compiling apps using Xcode 7 is fairly straightforward, but if you’ve never done it before, it can be a bit tricky. In this post, I’ll show you how to compile code using Xcode 7 and run it on your iOS 9 device. I’ll also discuss some of the errors and issues that you might incur along the way.
* Since multi-emulator Provenance just dropped, how about we use that as a basis for this tutorial? Just follow these steps, and you’ll have a multi-console emulator running on your iPhone or iPad in no time.
* Prerequisites: You must be running iOS 9 on your iPhone or iPad and you’ll need a free developer account, which lets you “test on device”.
* Step 1: Download Xcode 7 from the Mac App Store.
* Step 2: Launch Xcode 7, click Agree, and wait for it to finish installing components.
* Step 3: Find the code the you wish to compile (usually on GitHub). In this case, we’re using Provenance.
* Step 5: Copy the HTTPS clone URL. In Provenance’s case, it’s https://github.com/jasarien/Provenance.git
* Step 6: Inside of Xcode 7, click Source Control in the menu bar and click Check Out.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Check-Out-Source-Control-Xcode-7.png)
* Step 7: In the repository location box, paste the HTTPS clone URL from Step 5 and click Next.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Provenance.git_.png)
* Step 8: Select a branch, in this case Master, and click next. Xcode will then download the source code needed to compile. Depending on the code, this may take a while, so be patient. Once the download is finished, Xcode will open a new project with the source code.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Check-out-branch-Xcode-7.png)
* Step 9: Connect your iOS device via USB.
* Step 10: In the drop down device selection menu, select your iPad (not a simulator).
* Step 11: Wait as Xcode 7 indexes and processes symbol files. This may take a while as well, so be patient. Once complete, the status will say Ready.
* Step 12: Click the Play button. You’ll likely get an error that says “failed to code sign”. That’s okay. Click Fix Issue and click Add to log in with your developer account. Remember, you don’t need a paid developer account, but you will need a free developer account (Apple ID). If you don’t have a developer account, create one by clicking Join a Program instead.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Failed-to-Code-Sign-Xcode-7-e1442638279319.png)
*  
* Step 13: Once you log in, click the Play button again to proceed with the compile. You may receive another error that says An App ID with Identifier…is not available. Please enter a different string. To fix this, click the General tab, and give the Bundle Identifier a unique name (delete the name between the two dots and add your own name. Leave the prefix and suffix as is).
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/BundleIdentifier-xcode-7.png)
* Step 14: Click the Play button once more. The compile should complete, and you’ll see the app that you compiled appear on your iOS device’s Home screen.
* Step 15: You’ll need to enable access to the app by trusting the developer on your iOS device. This can be done by going to Settings → General → Profile and tapping on the Developer app and granting access.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Developer-App-Profile-iOS-9.jpg)
* Step 16: Launch the app on your Home screen, and iOS should allow you to use it.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Provenance-app-iPad.jpg)
* This is just a preliminary tutorial, and gives you a basic understanding of what’s required to get apps running on your iPhone or iPad using Xcode 7. We’ll be back with more in-depth tutorials, including video how-tos, on how to get the most out of this most excellent new privilege for iOS users.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Provenance-iPad-big-GBA-2.jpg)
* What do you think?

