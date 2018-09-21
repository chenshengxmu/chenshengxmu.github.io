---
layout: post
title: Walkthrough and thoughts on nitoTV package manager for Apple TV
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/Screen-Shot-2018-02-10-at-09.00.55.png)
* A few days ago we wrote about the release of nitoTV, Kevin Bradley’s package manager for jailbroken Apple TVs. Today, we’ll give you an in-depth look at the interface and functionality, as well as our comments on where it could go in the future.
* nitoTV allows users to install tweaks and unsigned apps to their Apple TVs, much like Cydia does on iOS. It requires a jailbreak to work, and currently supports the Apple TV 4 on tvOS 9 (through Pangu), tvOS 10 (through LiberTV10), and tvOS 10.2.2 (through greeng0blin). Support for the Apple TV 4K on tvOS 11.0-11.1 is due to arrive in a future update to nitoTV. To find out if you can jailbreak your device, check our advice on the subject.
* To jailbreak tvOS 10.2.2 with greeng0blin, follow our guide. To jailbreak any other supported firmwares, use the Mac installer from the nitoTV website.
* Upon launching nitoTV on your Apple TV you’ll be greeted by the Featured Packages page, a curated selection of apps. Favourites such as Kodi can be found here, as well as various games and media solutions which Apple would not accept on the App Store.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-home-page.jpg)
* The layout is much the same as the App Store itself, featuring Top Shelf images for each app and individual information pages which can be viewed when selecting an app. With luck, this page will become increasingly populated as developers start to build for the platform.
* By scrolling across the tabs at the top of the view you can reach other sections of the app. Below is the About page which displays developer credits, current installed version, and a useful change-log:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-about-page.jpg)
* The adjacent tab is Settings, housing several useful options. Here you can update nitoTV itself, prevent your Apple TV from updating (a very handy feature given the device’s propensity for unwanted updates), respring and reboot your device, and more. In my testing, all of these options worked flawlessly, not bad for an initial release.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-settings-block-updates.jpg)
* Next up is a Search tab, and then a page which will be familiar to all Cydia users: Sources. This is where third-party repositories will be added, in order to download packages from other developers. This is one of the few parts of nitoTV which did not seem fully functional yet, but there is a good reason for that: there aren’t yet any other developers, packages, or repositories made for the Apple TV/nitoTV, so we’ll have to give it some time.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-sources.jpg)
* The final tab is Installed, which lists all the current packages on your device. The same as Cydia’s Installed (Expert) listing, it shows required system packages too. Many of the packages, such as Cydia Substrate and dpkg, will be familiar to iOS jailbreakers, as they are essential to both platforms’ infrastructure.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-installed-packages.jpg)
* By selecting a package from either the Installed list, the Search results, or the Featured Packages homepage, users can view its description and information, as well as Install, Uninstall, or Update it. Below you can see the package page for another widely-used package, RocketBootstrap:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-package-view-rocketbootstrap.jpg)
* Selecting Install, Uninstall or Update takes you to a loading screen as in Cydia where the progress of the installation is shown, as well as a helpful summation of the number of packages added, altered, and removed.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-package-installation.jpg)
* I didn’t have any trouble in my testing with any of these features. All of my installations and uninstallations completed smoothly with helpful readout.
* This is very self-explanatory, but for illustrative purposes I’ll show the app installation process for a much-loved app, Kodi. Simply select it on the Featured Packages page and you’ll be taken to a well-tooled product page, from which you can install it. Hit install to begin:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-package-install-kodi.jpg)
* You’ll be told how much storage the installation will require. Barring any problems (of which I had none), after installation the app will be waiting for you on your Home Screen:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/nitoTV-home-screen-kodi.png)
* All apps installed by nitoTV are not subject to Apple’s signing restrictions, which means they do NOT need re-installing every seven days. This is a massive upside to having an Apple TV jailbreak, though please note that the apps will only launch when in jailbroken mode.
* My initial impressions of nitoTV have been very favourable. It’s clear that the long delays to its release were not in vain, and that stability has been a key priority for the developer throughout. The range of firmwares supported for an initial release is also broad and helps the userbase by excluding almost nobody.
* There have been some reports of the Mac installer failing to work for users on tvOS 10.1, though I do not have a matching device to test this. It’s been added to the developer’s to-do list.
* Although stability is very good, it will take a while to populate the platform more heavily with tweaks and apps. The current offerings include several classics (such as Provenance, tvOS Browser, Flappy Bird, and Kodi), but lack the range of system tweaks which Cydia users are accustomed to. Only time will tell if they will spring up.
* The future functionality of nitoTV is interesting, as unlike Cydia it is in its infancy and could be shaped by anyone with an inclination. Possible future features which have occurred to me during my short usage of it include:
* There are doubtless many more possibilities that I haven’t touched on here; let me know in the comments if you have more suggestions. With the features above, a few more key apps, and the upcoming support for tvOS 11.0-11.1, nitoTV looks capable of turning into a powerful and useful addition to the tvOS, and jailbreaking, experience.

