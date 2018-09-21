---
layout: post
title: How to Enable Native FaceTime Over 3G Feature in iOS 5
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/Photo-Nov-16-2-15-35-AM-e1321438643400.png)
* In the onslaught of rumors that we saw leading up to Apple’s Fall iPhone announcement, there was talk that iOS 5 would finally allow users to make FaceTime calls over 3G. As most of you know, FaceTime has been limited to Wi-Fi since its introduction.
* As it turns out, the option actually exists in iOS 5, it’s just hidden. Apple obviously isn’t ready to release it to the public. But as usual, hackers have figured out how to enable the secret feature…
* Sure, jailbreakers have been using utilities to make FaceTime calls over 3G for quite a while now. But unlike those apps, enabling the native iOS 5 feature won’t cost you anything. And you won’t need to open third party software to make calls.
* But you will, however, still need to be jailbroken, as you will be editing a .plist file inside your device. That means this tip is for iPhone 4 users only at this time.
* Step 1. Using iFile or any other file browser, navigate to /System/Library/CoreServices/SpringBoard.app/
* Step 2. Locate the N90AP.plist and open it.
* Step 3. Below the <dict> line, under <key>capabilities</key>, add in <key>3Gvenice</key><true/>
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/Photo-Nov-16-1-51-09-AM-e1321437905872.png)
* Step 4. Make sure to save your changes, and then exit the file browser.
* That’s all there is to it. Remember to watch your usage if you aren’t on an unlimited data plan. Video calls can really rack up the MBs.
* [FSM]

