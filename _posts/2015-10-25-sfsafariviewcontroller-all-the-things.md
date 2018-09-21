---
layout: post
title: New tweak adds Safari View Controller support to Twitter, Gmail, WhatsApp and Alien Blue
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/10/Safari.jpg)
* Safari View Controller is a new feature in iOS 9 that lets developers enable an in-app browser based on Safari that taps into many of the features that make using standalone Safari so great. Some of the benefits are the ability to use current logins, access the keychain and use autofill.
* Previously, developers had to come up with their own browsers for their apps, which meant that users couldn’t tap into ongoing logins, the keychain, or use autofill when viewing the web through these browsers. That resulted in, as you can probably attest to, a less that ideal and disconnected user experience.
* Apple has fixed this issue by allowing developers to use Safari View Controller in order to bridge the gap between the sites and data that they already use, and the apps that they love.
* Unfortunately, not all apps yet support Safari View Controller. Some popular apps, like Gmail, Twitter, and WhatsApp, to name a few, still use their own built in browsers. SFSafariViewController all the things is a brand new tweak that aims to fix this issue.
* Once you install SFSafariViewController all the things, it just starts working. There are no options or settings that you have to deal with in order to enable the tweak.
* To test it out, I opened a a link in the official Twitter app, and it worked just as expected. Consider the following before and after picture for the proof:
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/SFSafariViewController-all-the-things.png)
* Custom browser (left) vs Safari View Controller
* On the left is the custom browser for Twitter. This browser doesn’t have current login info, keychain access, or autofill access. On the right side is the same link opened with the Safari View Controller. As you can see, it looks similar to Safari, and it’s exactly the same as other apps that support Safari View Controller. The benefits here are multi-faceted, but as I’ve stated, it means access to the keychain, and autofill.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/SFSafariViewController-all-the-things-review.png)
* As a bonus, the tweak also supports SKStoreProductViewController, which means that App Store links can also open in-app. This feature seems to be a bit of a work in progress, though, as alert view pop ups still appear on opening an App Store link in-app, adding unneeded friction.
* I’m happy to see a release from developer MohammedAG, who produced this tweak. His releases always seem to be practical and useful additions, and SFSafariViewController all the things is no exception.
* You can find the tweak available for free on the BigBoss repo. Try it out, and let me know your thoughts on it in the comments below.

