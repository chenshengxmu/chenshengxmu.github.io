---
layout: post
title: iOS 10.1.1 bug allows researchers to bypass Activation Lock protection on iPhone and iPad
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Apple-Activation-Lock-teaser-002.png)
* Back in November, India-based security researcher Hemanth Joseph discovered a bug in iOS 10.1 which permitted him to bypass Apple’s anti-theft Activation Lock feature by entering an excessively long string of characters in the Wi-Fi setup text fields.
* Apple has patched the flaw in iOS 10.1.1 but now, as noted by SecurityWeek, researchers at Vulnerability Lab have managed to find another method of bypassing Activation Lock protection on an iPhone, iPad or iPod touch with iOS 10.1.1 and they posted video evidence to prove it.
* Activation Lock prevents reactivation of an iOS device without the legitimate owner’s permission and is automatically turned on when a user enables Find My iPhone in Settings → iCloud.
* With Activation Lock, your Apple ID tied to the device is kept on an offsite activation server and cross-checked with Apple every time you attempt to disable Find My iPhone, erase the device or reactivate it.
* Joseph’s iOS 10.1 workaround involves choosing Other Network at the Wi-Fi prompt on the Activation Lock screen and entering a long string of text in the text fields. This creates an overflow error in Activation Lock because there is no limitation on the number of characters that can be entered into the Wi-Fi name, username and password fields.
* Then, after repeatedly closing and opening an iPad’s Smart Cover, Activation Lock crashes completely and grants unauthorized access to the Home screen.
* Researchers at Vulnerability Labs have now shown another method of unlocking an Activation Lock-protected device running iOS 10.1.1 that requires entering a string of emoji characters and using features like screen rotation and Night Shift.
* In the video above, Vulnerability Labs founder Benjamin Kunz-Mejri says their method only grants access to the Home screen for a second. However, he says the time on the Home screen can be extended by quickly pressing the power button.
* He has confirmed that the method also works on an iPhone.
* Both variations of this vulnerability—Joseph’s iPad Smart Cover method and the Vulnerability Lab one— have been confirmed to work by multiple researchers. The Smart Cover method was addressed in iOS 10.1.1, which Apple released on October 31.
* It’s unclear, however, if Apple is aware of Vulnerability Lab’s bypass using the screen rotation feature and Night Shift mode due to the fact that the company does not comment publicly on iOS exploits until they are patched.
* The Cupertino firm is currently testing iOS 10.2 and we’ll make sure to report if the upcoming software update defeats this latest Activation Lock bypass.
* Source: Vulnerability Lab via SecurityWeek and Hemanth Joseph

