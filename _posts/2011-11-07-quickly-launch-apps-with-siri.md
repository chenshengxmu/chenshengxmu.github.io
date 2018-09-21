---
layout: post
title: How to Quickly Launch Apps With Siri
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/Screen-Shot-2011-11-07-at-1.13.03-AM.jpg)
* One of the glaring features that Apple left out of Siri is the ability to integrate with and launch apps. You can do all sorts of things with your voice and Siri, but you can’t use third-party apps (short of a few exceptions and the services Apple officially partnered with for launch) or open apps with a voice command.
* Thanks to the widely undocumented world of iOS URL schemes, you can actually trigger app shortcuts with Siri on your iPhone 4S. While it’s not the cleanest method, there are tons of possibilities for quickly launching apps with Siri. Let’s take a closer look…
* iOS URL schemes allow apps to be directly launched from Mobile Safari. Instead of tapping the Maps app from the iPhone’s springboard, you can enter maps:// in the address bar of Mobile Safari to directly trigger the app. While some third-party apps sandbox themselves from the ability to interact with URL schemes, most apps have essentially “bound” themselves in the iOS SDK to a list of URL schemes that trigger in-app actions.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/IMG_0163-e1320646603944.png)
* A famous example of taking advantage of URL schemes was when the developers of Camera+ introduced a workaround URL scheme that let users snap a picture with the iPhone’s volume button. Typing camplus://enablevolumesnap into Mobile Safari would enable a hidden hack in Camera+ that enabled the volume button shutter. This was all before iOS 5 and the native ability to take a photo with the volume button, and Camera+ was technically breaking Apple’s developer licensing agreement. There was a huge ordeal made of the hack and Camera+ was temporarily pulled from the App Store.
* The Camera+ situation was an example of an enhanced URL scheme. Developers can attach custom parameters that trigger an app to do something more specific than just launch. For the purpose of conceptualizing, think of URL schemes as the terminal and command line world of iOS.
* For example:
* twitter://post?message
* Typing this into Mobile Safari will launch the official Twitter app and open the compose tweet window. This same system of thought can be used to send text to and from different apps. People with much more developer knowledge than I have created in-depth tutorials on the topic.
* Back to the task at hand: launching apps from Siri.
* As I was thinking about a workaround, a forum thread turned me on to the idea of using URL schemes as contact shortcuts.
* Many, many apps can be triggered with URL schemes, including some apps that I use frequently: fb://, tweetbot://, reeder://, instagram://, yammer://, and imdb://. In most cases, there’s no real point in using a Siri shortcut to simply open an app. For the purpose of this tutorial, we’ll take a closer look at triggering the Facebook app with Siri.
* The iPhone URL Schemes wiki page has some great information for reference. Here are some of the custom URL shortcuts that are built into the Facebook app:
* And there’s plenty more where those came from.
* To create a Facebook shortcut for Siri, make a new contact and call it something like “Facebook Shortcuts.” Then, add a bunch of the URL schemes from above. After you’ve made the contact, tell Siri something along the lines of “show Facebook shortcuts.”
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/IMG_0166-e1320646657720.png)
* Tapping each of the URLs will open the associated action in the Facebook app. Again, it’s not the prettiest trick in the world, but it’s functional.
* There’s really unlimited possibilities when it comes to these URL scheme triggers, so I encourage you to check out the handleOpenURL database for more third-party app schemes. Here are some more examples for stock iOS apps:
* If you have a select number of apps that you’d like to have quick access to with Siri, you could create a “Shortcuts” or “Favorites” contact and add each trigger. Telling Siri to “show shortcuts” would then pull up your list of app shortcuts to open within Siri.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/IMG_0167-e1320646706296.png)
* This is really an open-ended conversation, so please share your ideas for using iOS URL schemes in the comments. How could Siri be used to help open apps via this method?

