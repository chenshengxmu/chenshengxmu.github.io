---
layout: post
title: Use CydiaUpdates to manually install .deb packages when Cydia is unreliable
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/cydia-crash.png)
* Remember when Jay Freeman said that Cydia wouldn’t get bogged down by the massive demand for users of the evasion jailbreak, thanks to measures like including the package catalog in Cydia? The lesson here is to never underestimate the demand for jailbreaking. At its peak, Freeman’s servers were hit with over 4 million HTTP hits per five minutes. There aren’t many independent websites that can survive that kind of spike in traffic overnight, so it shouldn’t be a surprise that downloading tweaks through the Cydia app remains an unreliable process…
* iTools.hk automatically sets up the Cydia AutoInstall folder.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/iTools-Autoinstall.jpg)
* If you are still getting errors in Cydia, you can try installing .deb packages manually through Cydia’s AutoInstall folder. We already have an excellent guide for manually installing these packages.
* One point I should add is that as long as your device is jailbroken, you can access Cydia’s AutoInstall folder through iTools.hk (see our downloads section) without having to fuss around with SSH. This is a huge benefit if you’ve just jailbroken your device and are having problems installing OpenSSH in the first place.
* CydiaUpdates isn’t a mirror, the site just indexes repositories.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/cydiaupdates.jpg)
* The problem is finding the tweaks and packages when the repos can’t be reliably accessed through the Cydia app. One workaround I’ve found effective is to search for the direct links for packages through an indexing site, like CydiaUpdates.net. Although Cydia returned errors from several repositories, I was able to download and successfully install several .deb packages directly from the repos in question.
* That said, this approach takes some planning. Most repositories automate processes like checking for package dependencies and compatibility. You can take advantage of this by making a note of all the dependencies on the Confirm screen before attempting to install a package through Cydia.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/cydia-dependencies.jpg)
* There are also a couple limitations to keep in mind: you won’t be able to install your paid apps without using the Cydia app itself, and this workaround won’t help if the repository hosting servers are offline completely. However, I was able to use this method to install SBSettings last night, just hours after the largest spike in traffic, while Cydia was still giving me errors.
* We’ve heard the following suggestion before, so please note that jailbreak developers generally frown on unauthorized hosting of free tweaks through mirror repositories. Among other issues, mirror repos may not preserve dependencies or fail to push critical updates in time. This tends to cause headaches for developers.
* If you’ve had difficulty installing tweaks through Cydia, let us know in the comments section if our workaround helps.

