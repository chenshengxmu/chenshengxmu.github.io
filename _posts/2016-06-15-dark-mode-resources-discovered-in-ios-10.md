---
layout: post
title: Dark Mode resources discovered in iOS 10
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Dark-Mode-in-Messages.png)
* One of the most circulated rumors for iOS 10 was the inclusion of a dark mode. However, the WWDC 2016 keynote came and went without any mention of the expected feature. After digging through the iOS 10 beta, it appears maybe Apple didn’t neglect dark mode after all.
* Jailbreak developer Andy Wiik has shared a few images on Twitter that appear to show the Messages application sporting a new dark theme. After spending some time in the initial beta, Andy was able to force the unreleased dark mode theme to run inside of the iOS simulator.
* More specifically, while examining the headers in iOS 10, Andy found a reference to CKUIThemeDark inside of ChatKit. He wrote a quick tweak that forced ChatKit to use the dark theme over CKUIThemeLight. Then he loaded it into the simulator, which shows off the new mode.
* Right now, it appears unpolished and is only implemented in the Messages app. This does confirm that Apple in fact was (or is) working on a dark mode, however it is uncertain when or if we will see this included as an actual feature.
* One possibility is that this dark mode will be reserved for an upcoming iPhone sporting an OLED display. If that is in fact the case, we may see more information this fall with the announcement of the iPhone 7.
* Something that Code.Red mentioned in the comments is also a possibility. He theorized it could be for the new full screen animations such as fireworks, lasers, or shooting star. In all of those animations the app looks much darker. As a rebuttal to that, the images do show the dark mode throughout the whole app, not just inside the message thread. It seems they’ve added it to CKUIThemeDark, which is for the entire ChatKit interface and not just the animations or thread.

