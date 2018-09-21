---
layout: post
title: How to check to see if your iPhone is infected by the KeyRaider malware
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/DylibSearch-ok.png)
* DylibSearch is a new jailbreak app that helps you quickly check to see if you have any known malicious tweaks, like KeyRaider, installed on your device. It does so by scanning the contents of the .dylib files contained in the filesystem’s MobileSubstrate directory.
* By checking for known strings contained in malicious files, DylibSearch can quickly tell you if your iPhone is infected, or if it has a clean bill of health. This open source tweak is available by means of a special third-party repo, which you’ll find inside of this post.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/DylibSearch.jpg)
* To install DylibSearch, add the following repo to your Cydia sources:
* http://wolfposd.github.io/
* After adding the repo, perform a search for DylibSearch, or simply open the repo folder to locate the package directly. After installing DylibSearch, you’ll find a new app icon on your Home screen.
* Launch the DylibSearch app, and you’ll see a screen that lists all of the .dylib files found in /Library/MobileSubstrate/DynamicLibraries. Files that have a clean bill of health will have a green check mark next to the name, while infected files will stick out like a sore thumb with a red ‘x’ icon.
* DylibSearch will help you identify bad files, but it won’t actually remove them. To do so, you’ll need to use an app like iFile to navigate to the DynamicLibraries folder, and purge the files manually.
* The recent KeyRaider attack is one of those that DylibSearch can identify. As you can see from the open source project on GitHub, DylibSearch looks for the following strings in your DynamicLibraries directory:
* These are strings that are known to be contained in the malicious Cydia Substrate tweaks. Obviously, there are other ways of being able to identify bad jailbreak tweaks, such as using a recursive grep search at the command line, but it really doesn’t get any easier than this tweak.
* Although the chance that you’ve been infected is slim none if you live outside of China and you’ve never download shady jailbreak tweaks, this is a good tool for quickly identifying a potential infection, and it’ll probably grow as it’s fleshed out with additional search strings.
* Be sure to share your thoughts on the DylibSearch in the comments below.

