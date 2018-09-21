---
layout: post
title: Beware- malicious packages could potentially brick your iPhone
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/02/KilliOS.jpg)
* Over the weekend, an interesting thread appeared on Reddit involving a new boot color changing mod. That mod, which came from developer @daytonhasty with lots of help from @xerub, wasn’t in itself malicious, but if misapplied could render a perfectly good iOS device permanently useless.
* Sadly, because directions on installing the mod weren’t followed to a tee, some users were greeted with an expensive paperweight. On the heels of such a revelation, another developer has created a proof of concept tweak that shows how someone with malicious intent could fool jailbreakers into installing a package that renders their device useless.
* The problems stems from invalid NVRAM (non-volatile RAM that retains info when a device is powered down) variables that can kill a perfectly good device in a matter of seconds. As a result, developer arcticsn0w has created a package called killios that can permanently brick your device. The purpose of the proof of concept is to show what might be possible if a person downloads a malicious package. These types of malicious packages are largely limited to third-party shady repos that have to be manually added to Cydia, so most jailbreak users should be okay.
* Here is the ReadMe file from killios:
* If you want to look at the source code for arcticsn0w’s killios package, you can find it on his GitHub page. He’s pulled it from his repo due to it being so dangerous, and doesn’t want anyone to install it inadvertently.
* So how can you protect yourself? You can take the following steps:
* 1: Don’t install pirated apps tweaks from shady repos
* 2: Uninstall OpenSSH and/or change your iPhone’s root password from alpine to something else more secure
* As a result of all of the flags being raised by these packages, some users are banding together with the hope of creating an “anti-supid” package that will prevent NVRAM modifications. The question is, will these revelations make you more cautious with regard to what you install, or is it business as usual?

