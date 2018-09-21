---
layout: post
title: How to remove iOS configuration profiles
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/iOS-9-how-to-delete-configuration-profile-iPhone-screenshot-001.jpg)
* Back in March 2013, security firm Skycure found that some configuration profiles on iOS pose a major security vulnerability because they use root certificates that might allow harmful software to bypass Apple’s sandboxing rules and install on your iPhone, iPod touch or iPad.
* Apple has since removed a few apps from the App Store that were found to install root certificates which could allow monitoring of data.
* Still, the fact remains that configuration profiles could be exploited to compromise SSL/TLS security solutions. If you have a configuration profile installed on your device that’s no longer use by apps, you should delete it in order to make sure your data remains protected.
* In this tutorial, we’re going to demonstrate how easy it is to delete iOS configuration profiles that are no longer needed, thereby increasing your security.
* A configuration profile is a tiny file that stores certain settings that override settings on your device. Organizational settings and accounts are typically delivered in iOS configuration profiles.
* For instance, IT administrators in enterprise environments—but not just them—commonly use configuration profiles to sign and deploy custom software and settings on corporate devices.
* Step 1: Open Settings on your iOS device.
* Step 2: Go to the section General → Profiles & Device Management, or Settings → General → Profiles.
* Step 3: Tap on a configuration profile you would like to remove from your iOS device.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/iOS-9-how-to-delete-configuration-profile-iPhone-screenshot-003.png)
* I was a beta tester for an app which came with a Crashlytics configuration profile. Having recently deleted that app, I’m about to remove its configuration profile.
* Step 4: Tap Delete Profile at the bottom of the configuration profile screen.
* Step 5: Enter your passcode, if required.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/iOS-9-how-to-delete-configuration-profile-iPhone-screenshot-004.png)
* Step 6: Confirm that you would like to remove the selected configuration profile from your device by tapping Delete. When you delete a profile, all of the settings and accounts associated with the profile are also removed.
* Step 7: It is always a good idea to restart your iOS device after removing a profile.
* If you first delete an app from your iOS device which came with a configuration profile, take this extra step and delete the app’s profile to improve your security.
* As the saying goes, better safe than sorry.
* You can also delete the app right from its configuration profile screen. For instance, I signed up to beta-test Vine, which requires a configuration profile from Twitter in order to access beta builds.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/iOS-9-how-to-delete-configuration-profile-iPhone-screenshot-002.png)
* If you’re unsure which apps use any given configuration profile installed on your device, just tap on it to get to the details screen.
* RELATED: How to uninstall a VPN from your iOS device
* As the screenshot top of post attests, the Twitter profile is used by the Vine Beta app. I can remove both the profile and the app, without going back to the Home screen, by tapping the Delete App button.
* In addition to custom enterprise software and apps in beta, configuration profiles may also be required by some websites, VPN apps, custom network settings, carriers and more.
* The adventurous types may consider creating a custom configuration profile with all of their custom settings, apps, Home screens, wallpapers and more for over-the-air deployment to any iOS device, including the new Apple TV.
* Just grab the official Apple Configurator utility, a free download in the Mac App Store, to get started.

