---
layout: post
title: What fragmentation? Apparently iOS 6 SDK allows for intelligently-scaling apps
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/06/iOS-6-Scott-Forstall-SDK-slike-Auto-Layout.jpg)
* One of the major staples of Android development’s always been the operating system’s ability to automatically scale apps up and down in order to accommodate whichever form factor they’re being used on.
* Apple’s approach to form factor fragmentation has traditionally been the opposite one. As in, Apple requires app developers to target each screen size with a pixel-perfect user interface. Though iPads can pixel-double tiny iPhone apps, Apple wouldn’t degrade user experience by letting iOS stretch apps’ hard-coded interfaces.
* It would appear that iOS 6 introduces a diametrically opposite approach, one letting developers construct interfaces that can intelligently adapt to different screen resolutions without looking plain fugly.
* This is not just convenience, but a necessity given that rumored taller iPhone and an iPad mini, both allegedly due around September or October of this year…
* As you can see in the above screenshot representing a bunch of new features provided by the iOS 6 software development kit (SDK), there’s something called Auto Layout.
* Now, as other people pointed out before me, this isn’t terribly surprising.
* When OS X Lion came out, Apple introduced a new way to build interfaces by specifying relative positioning of various interface elements.
* This new Interface Builder feature became the default positioning method for new Cocoa projects in Xcode.
* By all accounts, and this is only speculation, Auto Layout is coming to iOS 6 and it’ll make developers’ life a lot easier.
* TechCrunch explains:
* Auto Layout allows developers to create a set of constraints that define how UI elements are displayed on-screen. Instead of using the standard “springs and struts” positioning method, Auto Layout allows those elements to shift and move depending on a prioritized list of rules — think “the left side of one button should always be 30 away from the right side of another button.”
* This approach takes best practices from both Google’s ‘OS-scales-things-up-and-down’ approach and current iOS scheme where universal binaries contain separate assets for different screen resolutions (legacy, Retina, iPhone, iPad), which includes bitmaps, interface elements and their absolute positioning in user interfaces.
* While Google’s approach offloads much of the work on the developers’ side, end results are not aesthetically pleasing. Tim Cook noted as much during March’s iPad 3 introduction.
* Apple’s boss illustrating how Android’s UI scaling produces less than stellar results
![img](http://media.idownloadblog.com/wp-content/uploads/2012/03/Tim-Cook-iPad-3-keynote-Android-apps1.jpg)
* The executive ran a few slides comparing several Android and iOS apps side-to-side, making a point of how the official Twitter for Android client wastes screen real estate, leading to a sub-par experience.
* Google hopes these woes will fix themselves over time as Ice Cream Sandwich-driven smartphones and tablets typically begin at 1280-by-800 pixel resolution, which kinda establishes the minimum requirements interface-wise.
* Back to Apple and iOS 6.
* I am convinced that Auto Layouts will solve the iOS form factor fragmentation in a typical Apple fashion: elegantly and with future compatibility in mind.
* If Apple provides tools to facilitate the creation of layouts that intelligently auto-adapt to different screen sizes, then Cupertino will free programers once and for all of worry over how their apps will look on whatever future Apple hardware is looming on the horizon.
* The benefits, clearly, are plentiful.
* Plus, as additional iOS devices come into full view, the benefits will multiply (think a five-inch iOS gadget and a full-blown television set, to name a few).
* This isn’t even debatable.
* Simply put, it’s a necessity if Apple’s to prevent platform fragmentation on a form factor basis.
* Surprisingly, a survey of a hundred WWDC attendees has revealed that programmers are not too concerned about the introduction of new screen sizes affecting the success or availability of the apps on iOS.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/06/iOS-6-Auto-Layout-iPhone-mockup.jpg)
* So instead of updating existing apps for the extra pixels on that taller iPhone, programmers using the new iOS 6 SDK tools would effectively spend a little bit more time upfront drawing their app’s interfaces via Auto Layout.
* As a result, developers would rest assured knowing their software would look just as perfect on a smallish iPhone screen as it would on a bad ass Apple television set.
* Am I stretching it here (pun intended)?

