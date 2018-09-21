---
layout: post
title: What Progressive Web Apps are & how to use them
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-001.jpg)
* Thanks to modern web technologies, Progressive Web Apps (PWA) run in a browser, don’t require separate distribution, combine features of native apps with the benefits of a mobile experience and let you keep them on the Home screen without the hassle of an app store. The trick with PWAs is that they are regular webpages or web apps that appear to the user like traditional native apps with app-style interactions and navigation.
* PWA typically offers a website’s lightweight version with some extended functionalities.
* With Safari on iOS 11.3 and macOS 10.13.4 later, you can take advantage of PWAs. PWAs on the iOS platform require HTML5 features like the Web App Manifest specification and Service Workers to let backgrounds scripts power PWAs.
* Mobile web developer Maximiliano Firtman has a detailed overview of PWAs and their support in Safari across Apple’s platforms, if you’re interested.
* You can open a PWA on your iPhone, iPad or iPod touch with iOS 11.3 simply by visiting its URL in Safari. Please keep in mind that mobile Safari won’t launch PWAs properly unless you enable Service Workers under Experimental WebKit Features in Settings → Safari (as a matter of fact, enable all experimental features in Safari).
* To put a PWA shortcut on your Home screen, do the following:
* 1) Tap the Share button in Safari for the PWA you’re using.
* 2) Tap the icon labeled Add to Home Screen.
* 3) Tap Add in the upper-right corner.
* 4) Give the PWA a custom name so that it’s easily distinguishable from its native counterpart on the Home screen and in Search, then tap Add in the upper-right corner.
* You can now launch the PWA from your Home screen by tapping its icon.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-008.jpg)
* Something to be aware of: third-party browsers available on App Store, including Chrome, Firefox, Brave and Edge, won’t be able to “install” a PWA or use Service Workers.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-009.jpg)
* Due to Apple’s limitations, PWAs must be run in Safari. PWAs can be deleted the same way you native apps are removed from the Home screen: tap and hold until the icons start jiggling like they’re doing a dance, then tap the little “x” in the top-left corner of the icon.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-010.jpg)
* Lastly, confirm the operation by tapping Delete.
* PWAs can run in offline mode and look virtually indistinguishable from native apps. The screenshot top of post shows an offline-capable PWA running full screen on an iPad.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-002.jpg)
* Can you tell the difference between the native Twitter app and the PWA version?
* The abilities of PWAs on iOS include the following:
* And because PWAs can be hosted anywhere, their creators can bypass App Store and customers can “install” them without Apple’s approval from within Safari. This can be a double-edged sword as no PWAs have ever passed any App Store quality test.
* The best thing about PWAs is that they resemble native apps and launch in a fullscreen Safari process without any surrounding chrome. PWAs appear in the app switcher and the Dock on iPad as any other native App Store app.
* Pro tip: change the icon’s name before adding the PWA to the Home screen
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-006.jpg)
* Because PWAs are not distributed through Apps Store and don’t require any form of packaging or special distribution, knowing the PWA’s URL is crucial.
* To try out fullscreen PWAs, add these to your Home screen:
* Or, check out other PWAs for your inspiration.
* Be sure to manually tap a link using an iPhone or iPad with iOS 11.3 or later. Visiting, say, Twitter.com in Safari or following a link in Google search results may instead load a website’s mobile version rather than the PWA.
* If you don’t use a PWA for a few weeks or so, iOS will attempt to free up the storage taken up by its files. If that happens, the icon will remain on your Home screen but the PWA will be downloaded again when launched because iOS no longer has it in cache.
* PWAs are still in a very nascent stage and Apple’s implementation isn’t top-notch either. To illustrate my point, here are the issues and obstacles you may run into whilst using PWAs:
* No Siri integration is disappointing, especially in context of the upcoming Shortcuts feature in iOS 12. To illustrate: even if you have a PWA installed with an icon and the name “Tinder”, Siri isn’t aware of it and you cannot ask her to launch Tinder’s PWA on your behalf.
* The biggest issue: PWAs lose state between sessions. Without a properly saved state, a user who gets out of a PWA more likely than not will see it restarted when coming back.
* This cripples PWAs in several respects—things like asking the user to validate an email address or perform a two-factor authentication via an SMS code are currently unsupported on the iOS platform. On top of that, many OAuth-based login redirects open another Safari instance and never come back to the PWA.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-003.jpg)
* Uber’s native iOS app, at left, and the PWA version, at right
* Yet another issue wroth mentioning: PWAs won’t run in the background, which limits many multimedia and streaming PWAs that want to stream and play audio in the background. Depending on your version of iOS, you may notice other strange behaviors and bugs with PWAs, such as reloading when switching apps.
* Some of the aforementioned limitations will likely be sorted out once the Web Platform catches up to pure native features, such as Face ID on iPhone X or ARKit for augmented reality.
* And now, here’s a little bit of PWA history.
* After the original iPhone made its 2007 debut, enthusiasts took to jailbreaking to run cool hacks. As the original App Store with native third-party apps wouldn’t arrive until the following year, Steve Jobs suggested that developers embrace web apps because Safari on iPhone had required support.
* Fast forward to today and we now have Progressive Web Apps (PWA).
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-005.jpg)
* Adding ‘Lite’ to PWA names distinguishes them from native apps on your Home screen…
* Needless to say, Google has fully embraced PWAs and who’s to blame them, really? After all, web-based content is a lot easier to crawl and index than in-app content.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-004.jpg)
* …and in your iOS search results
* There are no two ways about it, PWAs on the iOS platform are simply not ready for prime time yet, even more so given the limitations that don’t exist on Android.
* Because there are no prompts or invitations from Safari, the user must discover a PWA and visit its URL in Safari, then hit the Share icon and choose the Add to Home Screen action.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/Progressive-Web-Apps-007.jpg)
* That’s too much work, especially without an indication that a website you’re visiting is a PWA.
* By comparison, it’s far easier to tap app banners at the top of a website and get its native app from App Store. Until Apple doubles-down on PWA support, which I doubt they’ll do given the App Store money-maker, there will be little engagement from iPhone users.
* Put simply, PWAs on iOS currently offer poor business value compared to native apps.
* The implications of PWA’s for iOS user are not readily apparent because Apple doesn’t exactly makes it obvious how to use them. It doesn’t take a genius to figure out the Apple would rather have you download native apps from App Store. That PWAs on iOS have more limited features due to Apple’s sandboxing environment than on Android isn’t helping either.
* And because of all that, PWAs probably won’t take over native apps anytime soon.
* If you’re dissatisfied with the current state of affairs when it comes to iOS’s support for PWAs, you’re always welcome to file enhancement requests at bugreport.apple.com.
* If you like this how-to, pass it along to your support folks and leave a comment below.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know via help@iDownloadBlog.com and a future tutorial might provide a solution.
* Submit your how-to suggestions via tips@iDownloadBlog.com.

