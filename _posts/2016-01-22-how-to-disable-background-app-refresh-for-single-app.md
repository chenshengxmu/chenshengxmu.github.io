---
layout: post
title: How to stop Background App Refresh for a single app until it's reopened
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Background-App-Refresh.png)
* Introduced with iOS 7, Background App Refresh lets suspended apps (those that you quit or run in the background) check for new data so that they always present you with up-to-date content.
* As useful as Background App Refresh is, it strains your battery due to periodical data fetching, which sometimes occurs even when your device is locked.
* You can enable or disable this feature on a per-app basis in Settings → General → Background App Refresh. You can also save yourself a few taps by quickly disabling Background App Refresh for a single app without launching Settings, and here’s how.
* According to iOS 9’s description, Background App Refresh lets apps refresh their content when on Wi-Fi or cellular in the background.
* Step 1: Launch an app on your iOS device.
* Step 2: When you’re done with it, press the Home button twice in quick succession to bring up the iOS task switcher.
* Step 3: Now simply swipe up to force-quit the app.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/10/Force-quit-app.jpg)
* Force-quitting an app prevents it from doing background activities, such as tracking location or responding to VoIP calls, until you open it again.
* “If you quit an app from the app switcher, it might not be able to run or check for new content before you open it again,” Apple says.
* I have developed a habit of force-quitting all of my apps once a week. That being said, I’d advise against doing this on a daily basis because force-quitting actually draws more power the next time an app is launched as iOS has to reload it from flash storage into RAM.
* “iOS learns patterns based on how you use your device and tries to predict when an app running in the background should refresh,” explains Apple. “It also learns when the device is typically inactive, like at night, to help keep apps from refreshing when you’re not using your device.”
* The most common trick for awakening a suspended app involves sending a silent push notification that prompts it to fetch new content in the background. Apps can also schedule background fetching based on your location.
* Certain apps take advantage of Push Notifications, Background App Refresh and Location Services to continue updating data in the background even when you’re not on Wi-Fi or your device is not connected to power.
* The most notorious examples are Facebook and Google Maps, which use these features to continuously track your location, which consequentially shortens your battery life.
* Summing up, I prefer to keep Background App Refresh enabled for certain apps in which I absolutely need to stay up-to-date all the time. For other apps, I make sure that Background App Refresh is disabled.
* Moreover, I force-quit notorious battery-hogs such as Facebook, Google Maps and WhatsApp as soon as I’m done using them, which also stops them from using Background App Refresh until they’re re-launched.
* Please keep in mind that enabling Low Power Mode in Settings → Battery disables Background App Refresh for all apps, along with other features.
* Submit your how-to ideas at tips@iDownloadBlog.com.

