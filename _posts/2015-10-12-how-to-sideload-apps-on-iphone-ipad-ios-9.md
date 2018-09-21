---
layout: post
title: How to sideload apps on iOS 9
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/02/XCodeIcon.png)
* As you’ve likely heard, iOS 9 allows you to sideload apps on to your iPhone or iPad using Xcode 7. This means that you can find an open source app, load it into Xcode, and deploy it to your device, bypassing the App Store in the process. All of this can be done without a paid developer account.
* This essentially amounts to Apple “opening up” iOS to all apps. All it takes is a little knowledge of Xcode 7, an iPhone or iPad running iOS 9, and a little bit of time. Of course, there are always variations and one-offs that appear from time to time, but for the most part, sideloading apps is easy. In this post, we’ll show you how.
* Note: Before we get started, be sure to only sideload apps that you trust. Since these apps are open source, look through the code if you wish to see what the app is doing. If you’re not comfortable wading through code, be sure that others have vouched for the app before deploying anything your device. Remember, these apps have not been reviewed by Apple.
* This tutorial will serve as sort of a reference guide for all of our posts that involve sideloading an app. In this example I’m going to use GitHub as our source for apps.
* This isn’t a paid developer account, but it’s a developer account nonetheless. If you already have a developer account, you can skip this section, otherwise you want to create one now. Keep in mind that a normal Apple ID can be turned into a developer account.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Create-Developer-Account.png)
* To create a developer account, visit Apple’s developer website at http://developer.apple.com. Once there, click the Member Center option in the upper right-hand corner, and click Create Apple ID. From there, it’s just a matter of filling out the requested information to create your account. Once you have created your account, you can move on to the next step. If you already have an Apple ID, log in with that ID to turn the account into a developer account.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Xcode-7.png)
* You’ll need Xcode 7 to sideload apps to your iPhone. There’s simply no way around this. Xcode 7 is a large download, so you definitely want to initiate the download as soon as possible. You can find Xcode 7 on the Mac App Store. Once you download it, launch the app and complete the setup.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Add-Developer-Account-Xcode-7.png)
* Launch Xcode 7 and go to Xcode →  Preferences → Accounts. Click the + button in the bottom left-hand corner, and select Add Apple ID. Type in your Apple ID and Password and click Add.
* GitHub is a great resource for open source apps. In this example, I’m going to show you how to quickly sideload an app called Gamma Thingy. This is an app that allows for changes to the iPhone’s screen gamma settings for comfortable viewing in low light settings.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/GitHub-sideload-apps.png)
* In the bottom right-hand corner of an app’s GitHub page, you’ll see a text box containing the HTTPS clone URL. Copy the URL listed there, in this case: https://github.com/thomasfinch/GammaThingy.git
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Download-GitHub-Xcode-7.png)
* Open Xcode 7 and click Source Control → Check Out. In the repository location box, paste the URL you copied in the last step and click next. Click the Download button that appears to download the source code to your Mac and import into Xcode 7. Once the code is fully loaded, you will see the name of the project followed by ‘Ready‘.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Connect-iPhone-Xcode-7.png)
* Connect your iPhone running iOS 9 to your Mac via USB. Select your device from the drop down box next to the project name near the upper left-hand corner of the screen. Keep in mind that it may take a while to fully process the symbol files needed for your connected device.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Xcode-7-Build-Succeded.png)
* Once the status says Ready, click the Play icon () to begin the build process. Depending on the app involved, this may take a while. Once the app is built, it should appear on your iPhone’s Home screen. Unlock your device, and launch the app from your iPhone to verify that it works.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Play-Icon-Xcode.png)
* You may need to allow the app on your device before you can begin using it. To do so, go to Settings → General → Profile → Your Apple ID → and tap Trust.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Untrusted-Developer.jpg)
* Of course, there are numerous things that could potentially prevent you from successfully deploying an app to your iPhone. It could be bad code, the wrong version of iOS, the wrong version of Xcode, or any problem in between. Or, if you do get the app deployed, there could be logic errors in the code preventing it from working properly.
* The point is, it may take some time for you to get this right, especially if you’ve never used Xcode before. But don’t give up, it’s very rewarding to be able to take an app that you see online, and deploy it on your own. Just be careful not to install anything that looks shady, or that hasn’t been vouched for via trusted sources or via us here at iDB.
* What do you think? Do you have any additional tips or suggestions that might help our readers? Sound off and let us know.

