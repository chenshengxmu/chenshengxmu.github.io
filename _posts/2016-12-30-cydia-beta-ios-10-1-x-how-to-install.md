---
layout: post
title: Cydia beta for iOS 10.1.x jailbreak released
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Jailbreak-Cydia-Tweak-Icon.jpg)
* Thursday saw the release of a new build of Cydia from its creator Jay Freeman (Saurik). Coming in at version 1.1.28, the build is marked as a beta, designed for use with the fledgling iOS 10.1.x jailbreak from Luca Todesco.
* Although I still do not recommend the average user to jailbreak with Yalu for 10.1.x, those who are confident doing so and have already taken the plunge may find this Cydia release improves their experience running the jailbreak slightly.
* Due to the early stage of development of the 10.1.x jailbreak, it is inherently unstable and one part of this, though by no means the largest, was that Cydia had not received any tailoring to work with it until now. Yalu seems to do some things differently from previous tools, and as a result users had been reporting various bugs with the package installer. These ranged from messages warning that the program was 32-bit and might slow down their device, to the inability to select anything within the Cydia interface.
* The new Cydia build is at Beta 3 at the time of writing, and is now 64-bit. This should go some way to solving the pair of issues mentioned above. It also bumps the version of APT (the package management tool which forms the backend of Cydia) to 1.14 from 0.7.25. Saurik has stated that whilst both of these changes may result in a slight performance decrease, the difference will probably be negligible, and the changes were necessary for improved compatibility with the iOS 10 jailbreak.
* A list of known bugs is available to peruse, and users should be aware that this is not intended for general release. Only users of the iOS 10.1.x jailbreak should install this beta for now, and even then only if they are prepared to troubleshoot. Known bugs at the moment include things as serious as the inability to restart SpringBoard following an installation, and a Cydia crash on the first install following modification of Cydia itself; these will probably require more co-operation between Saurik and Luca in order to fix, which may not be possible for at least a few days. For those who are running the 10.1.x jailbreak at present and wish to try out the beta, please follow the instructions below.
* 1) If reading this article on your iOS 10.1.x jailbroken device, simply follow this link to add the beta source to Cydia, and then skip to Step 3. If you are not following these instructions on the device in question, open up Cydia on your jailbroken device, and navigate to the “Sources” tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/cydia-beta-installation-1.png)
* 2) On the “Sources” tab, add the following source to Cydia:
* http://apt.saurik.com/beta/cydia-arm64/
* 3) Allow Cydia to refresh, and you should see three changes. If not, manually navigate to the added source and find the three packages there. These are: Cydia Installer, Debian Packager, and Tape Archive.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/cydia-beta-installation-2.png)
* 4) Select and install all three packages, and respring your device.
* 5) Reopen Cydia and ensure that the bottom of the homepage lists your Cydia version as 1.1.28.
* I recommend keeping an eye on the known issues page I linked above to stay informed of current bugs and fixes as the betas progress; you can also use that page to report any issues you encounter. With luck, this new build should improve quickly, especially once the jailbreak itself receives a few more compatibility fixes.
* Are you running the 10.1.x jailbreak yet? Does this Cydia beta fix any issues you had been experiencing? Let me know your findings…

