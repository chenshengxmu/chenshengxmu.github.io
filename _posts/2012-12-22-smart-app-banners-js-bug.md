---
layout: post
title: JavaScript bug found in iOS 6s Smart App Banners
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/12/smart-app-banners-1.png)
* This is kind of weird. A new bug has been discovered in iOS 6 that has to do with the Smart App Banners feature. It seems that the banners, which websites can implement to give users a direct link to apps, will turn on the JavaScript setting in Safari without warning.
* On the surface, this may not seem like a very big deal. After all, most folks don’t mess with the JavaScript settings on their iOS devices because a lot of web sites require it. But the fact that these Smart Banners are turning it on, unbeknownst to users, is a bit troubling…
* The bug was first discovered back in October by hacker Andrew Plotkin, and was recently brought to light again by AppleInsider. The site spoke with Peter Eckersley of the digital rights group EFF, who described the issue as a “serious privacy and security vulnerability.”
* “It is a security issue, it is a privacy issue, and it is a trust issue,” Eckersley said. “Can you trust the UI to do what you told it to do? It’s certainly a bug that needs to be fixed urgently.”
* But Lysa Myers of Intego, a security firm, doesn’t think it’s quite that serious: “while this issue is certainly not an ideal situation, by itself it actually isn’t that large a problem.” She notes, though, that she’ll continue to monitor it to make sure it doesn’t become more exploitable.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/12/safari-javascript-settings.png)
* If you want to see the bug first hand, simply execute the following steps on your iOS device:
* You should notice that the JavaScript feature has been automatically re-enabled. And it’ll actually stay that way until you disable it again. I was able to reproduce the bug on my iPhone 5 running iOS 6, but it’s been said that it’s present in all iOS 6 builds, including the 6.1 betas.
* Again, at the moment, there’s really nothing to worry about — unless of course you keep JavaScript off, then it’s annoying. But the fact that these Smart Banners are overriding user settings without consent is still pretty sketchy. Didn’t Google just get in trouble for something like this?
*  

