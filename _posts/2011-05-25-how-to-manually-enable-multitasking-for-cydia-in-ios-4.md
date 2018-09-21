---
layout: post
title: How To- Manually Enable Multitasking for Cydia in iOS 4
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/05/cydia-multitask-header.png)
* Cydia’s recent update made the jailbroken app store faster and brought about some other nice improvements. One of those new features was the ability to resume your place in Cydia after exiting the app, so you weren’t forced to start over each time you closed it.
* Though it was a major step up from the previous version, it’s not real multitasking. Downloading something in Cydia typically renders the rest of your iPhone helpless, but what if I told you there was an easy way to enable true multitasking?
* FSM has just posted a simple little hack to enable true multitasking for Cydia. While the idea is very enticing, the posting does warn that this solution can cause conflicts. You could even end up having to restore your device if something goes wrong.
* That being said, who wouldn’t want to be able to bounce in and out of Cydia without having to worry about the app reloading data every time? If you’re up for it, make sure you have iFile and the ability to follow simple directions. Here we go!
* Step 1. Load iFile and navigate to /Applications and look for the folder that’s labeled Cydia.app.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/05/cydia-multtask.png)
* Step 2. Tap on it and locate the file Info.plist
* Step 3. Choose to open the file with the Text Viewer option, and scroll all the way down to the bottom.
* Step 4. Find where the text says “<key> UIApplicationExistsOnSuspend </key> <true/>, and change <true/> to <false/> using the edit function.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/05/cydia-multitask-body.png)
* That’s all there is to it. You’re now just a save and a restart away from enjoying full multitasking in Cydia.
* I must say fast-switching in and out of Cydia is awesome, but I doubt I’ll keep it. I’ve noticed some screen flickers and other unstable characteristics. I’m also sure Saurik made the command <true/> for a reason, and I’d rather not bet against that guy.
* What do you think? Have you tried this hack out yet?

