---
layout: post
title: iOS 7 Beta 4 offers screenshot detection API
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/06/snapchat.png)
* iOS 7 Beta 2 brought with it an unintended consequence of messing up apps like Snapchat.
* Specifically, as Snapchat requires a finger on the screen to hold the photo open while viewing it, the program would no longer close the photo viewing screen upon taking a screenshot.
* Even worse, Snapchat couldn’t actually detect that the user took a screenshot of a sent photo, possibly creating a huge privacy concern.
* With today’s release of iOS 7 Beta 4, Apple has introduced a brand new API to let third-party apps be notified when the user takes a screenshot, in order to respond accordingly…
* As discovered by Scott Buscemi of 9to5Mac, iOS 7 Beta 4 solves an issue preventing Snapchat from detecting screenshots by introducing a new screenshot detection API.
* “This won’t be included in Snapchat until the developers work in the new API and Beta 4 is released,” the author remarked.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/07/iOS-7-Screenshot-detection-API.png)
* The “glitch” can be put down to how iOS handles the screenshot taking process.
* Currently in iOS 6, one can’t screenshot a pane like Notification Center that’s halfway open because iOS 6 cancels active touches upon detecting the user simultaneously pushing the Power and Home buttons.
* iOS 7 Beta 2 has changed that behavior so the operating system no longer cancels active touches when the user takes a screenshot. As a result, I can screenshot the Lock screen’s Quick camera toggle and Control Center halfway open, as seen below.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/07/iOS-7-Beta-4-screenshot-taking-Quick-camera.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2013/07/iOS-7-Beta-4-screenshot-taking-Control-Center.png)
* The change has introduced a nightmare scenario in apps like Snapchat that have no way of recognizing the screenshot action and notify the user accordingly. This new API has been created specifically to address such concerns.
* Of course, it’s up to developers to implement the feature and determine how their warez will detect screenshot taking events. For apps with increased privacy features, such as Snapchat and Facebook Poke, the API will no doubt be crucial in preventing any unwanted action and optionally notifing a person on the other side.

