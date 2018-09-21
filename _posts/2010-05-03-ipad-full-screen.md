---
layout: post
title: How to Make Your iPhone Apps Run in Full Screen Mode On Your iPad
---
* iPhone applications that have not been optimized for iPad yet don’t look so good on the iPad. Sure you have the option to blow up the iPhone apps by hitting the “2x” button, but the pexilization is so bad that it makes this feature almost useless.
* For those of you who jailbroke your iPad with the newly released Spirit (see Spirit jailbreak tutorial), there is a solution that will allow you to blow up your apps to fit the full screen, without having the dirty pixelization.
* I initially saw this on Remond Pie but the instructions didn’t work at all for me. So I dug a bit more and I found something on ModMyI that perfectly worked for me.
* Step 1: Download iPhoneBrowser and launch it. In Cydia, download Afc2Add and reboot your iPhone.
* Step 2: Plug your iPad in and navigate to /var/mobile/Applications.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/05/iphonebrowser-edit.png)
* Step 3: Find the application you want to hack and search for the info.plist file in the app’s main folder.
* Step 4: Copy the info.plist file to your desktop.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/05/plist-edit.png)
* Step 5: With a text editor such as TextWrangular (for Mac) or Plist Editor (for Windows), edit the info.plist file to add the following:
* <key>UIDeviceFamily</key> <array> <integer>1</integer> <integer>2</integer> </array>
* Step 6: Save the file and drop it back in its location in the app’s main folder.
* Step 7: Reboot your iPad.
* I tried the following hack on several apps. I didn’t work for many of them but it did work for a few like Tweetie, and I know it works for Facebook as well. I think it completely depends on how the app is designed. Graphic heavy apps don’t seem to do well, whereas text oriented apps such as Tweetie do well.
![img](http://www.idownloadblog.com/wp-content/uploads/2010/05/ipad-small-screen.PNG)
![img](http://www.idownloadblog.com/wp-content/uploads/2010/05/ipad-full-screen.PNG)

