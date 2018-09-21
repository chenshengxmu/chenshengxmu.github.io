---
layout: post
title: How to Enable Hidden Multitouch Gestures in iOS 4.3 GM on iPhone 4
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/03/iPhone-4-multitouch-e1299274133319.jpeg)
* Remember when we told you about the new multitouch gestures that Apple hid in earlier developer builds of iOS 4.3? Apple has seeded the final developer GM build of iOS 4.3 before the public launch on March 11th, and the very same gestures are still “hidden” inside 4.3.
* When the story first broke that there were new gestures in 4.3, the gestures were only enabled on a specific build of 4.3 that wasn’t available to the general audience of Apple develepors. In the final GM build of iOS 4.3, these hidden multitouch gestures can be enabled through a jailbreak exploit.
* Let’s take a closer look…
![img](http://media.idownloadblog.com/wp-content/uploads/2011/03/multitouch-example-in-4.3-build-e1299297940422.png)
* When these new gestures were originally found in an early build of 4.3, the automatic assumption was that Apple was working on a significant redesign for the iPhone 5 to use these gestures effectively.
* The iPhone already has multitouch gestures like pinch to zoom, but these unearthed gestures in 4.3 hint at the possibility of an iPhone without a physical home button.
* Instead of simpler gestures for basic operations, these hidden gestures in 4.3 use four and five fingers to operate iOS’s multitasking interface and toggle the home screen.
* Apple was supposedly trying to keep a tight lid on these new gestures by only including them in an internally distributed build of iOS 4.3 (probably for testing with new iPhone hardware). Awhile back, someone unearthed these gestures in the regular developer build of 4.3.
* The iOS 4.3 GM build surprisingly still contains these hidden gestures. You just have to know how to find them.
* If you have the 4.3 GM and you want to see these new gestures yourself, you must first jailbreak your iPhone running the 4.3 GM. (There is a tethered jailbreak option with PwnageTool.)
* Once you’ve jailbroken the 4.3 GM, use your favorite OpenSSH client to navigate to the following directory on your iPhone: System>Library>CoreServices>SpringBoard.app>N90.plist
* Edit the N90.plist file with your plist editor of choice and add the following Boolean statement: “multitasking-gestures.” Make sure to set its value to “True.”
* Save what you’ve edited in the plist and reboot your iPhone.
* That’s it! A new pane should now be revealed in the Settings app. It will look like this:
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/BGR-Exclusive-iOS-4.3-Gestures.jpeg)
* From here, your new gestures can be activated with a simple switch to “on.” Once enabled, you can now use four-five fingers to active the home screen while in an app, swipe up to reveal the multitasking bar, and swipe left or right between open apps.
* Here’s a video of these new gestures in action from when they were first uncovered in the earlier 4.3 build:
* You may still be wondering why these multitouch gestures are apart of iOS 4.3 in the first place. We’re not sure why they are hidden in the GM build, but it will be interesting to see if they can be activated with the same exploit in the public release of 4.3. We’ll have to wait to the 11th to see.
* Apple is obviously working on something involving these new gestures. Our best guess is that these new gestures won’t be unveiled by Apple until the iPhone 5 comes out this summer. And they will most likely accompany a significant hardware redesign to compensate for the new multitouch actions. (It feels kind of cramped to perform a five finger swipe on the current iPhone’s screen.)
* Why do you think Apple hid these multitouch gestures in iOS 4.3? Apple clearly hasn’t meant for them to be used by the public yet, but they’re there nonetheless. We’ll keep you updated as this story develops.
* [via Redmond Pie]

