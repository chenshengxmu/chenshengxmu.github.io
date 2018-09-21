---
layout: post
title: Previous app versions coming to Mac App Store, too
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/06/OS-X-Mavericks-hero.png)
* A little over a month ago, Apple started letting customers download older versions of App Store apps. This handy new capability was designed to allow folks on legacy hardware to download the last compatible app version for their outdated iOS build. Up until then, the most recent app version available had used to render all of the previously submitted app builds inaccessible in the Mac App Store.
* The same ‘Previous Versions’ feature is now coming to the Mac App Store, writes Apple in its memo to the registered Mac developer community, adding devs can now “let users download an older version” of their apps. I’ve got more information right below…
* MacRumors editor Eric Slivka has Apple’s email to developers announcing the new feature:
* Users who have already purchased your Mac app are now able to download previous versions, allowing them to use your app with Macs that may no longer be supported by OS X Mavericks.
* If you do not want previous versions of your app to be available for download as a previous purchase, for example due to a usability or legal issue, you can manage their availability in the Rights and Pricing section of the Manage Your Apps module on iTunes Connect.
* To exclude a specific version, click “Manage iCloud download settings for this app.” For more information on managing previous versions, see the iTunes Connect Developer Guide or contact us.
* Developer Matt Gemmell noted as much on Twitter.
* Apple also makes it possible for developers to manage availability of the previous version of their iPhone, iPod touch and iPad apps.
* On the surface, it’s a great feature that adds up to user satisfaction. Say Pixelmator – my favorite Mac image editor – gets a major new update requiring at least OS X Mavericks.
* If one of my Macs still ran, say, OS X Lion, visiting the Mac App Store on that machine and searching for Pixelmator would produce the last app build for Lion – that is, unless its developer has opted not to make available previous versions.
* But things are more complex than that.
* Many apps talk to some kind of a backend and most rely on APIs to communicate with the server. Should a developer retire some of those APIs and introduce new ones, older versions would continue to tap phased-out APIs which the server no longer understands.
* As a result, functionality of connected apps such as Twitter, Flickr and various other social software would be severely crippled.
* This problem is way more pronounced on the iOS platform (see the screenshot below), where the vast majority of apps are heavily dependent on the cloud and network connectivity.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/SIGHyKE.png)
* That’s not saying this is a trivial or non-existent issue for Mac developers, but that’s why Apple gives developers the freedom to mark such app versions unavailable, thereby helping avoid user confusion.
* By the way, your free OS X Mavericks update awaits you in the Mac App Store.
* Speaking of upgrades, can we now get paid upgrade pricing for App Store/Mac App Store apps?

