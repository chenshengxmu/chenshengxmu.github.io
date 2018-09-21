---
layout: post
title: How to fix Cydia error wow, you exceeded the number of package names this APT is capable of
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/03/exceeded-number-of-cydia-package-names.jpg)
* Ever since the evasi0n jailbreak came out, we’ve been inundated with the same support request about a Cydia error that displays the following message: wow, you exceeded the number of package names this APT is capable of. The message also shows a couple more lines of errors but the first one really is the source of the problem.
* In this post, we’ll explain what “the number of package names this APT is capable of” means, and most importantly, we’ll provide you with a quick and simple fix for it…
* According to Saurik himself, Cydia “downloads all of the package listings locally, and then APT consolidates them into a single efficient data structure that can be used even on memory-constrained devices to access the massive wad of packages later.” The problem is that this data structure is only capable of hosting a total of 65,535 packages.
* Because the default repositories in Cydia already come with about 40,000 packages, you only have room for an additional 25,000. It means that if you decide to add more sources, especially sources that pirate jailbreak tweaks, you will likely quickly exceed this number and face the mighty error telling you “you exceeded the number of package names this APT is capable of.”
* The fix is pretty simple, and if you’ve actually read the previous paragraph, you’ve probably already figured it out. In order to fix the excess of package name entries, you need to remove some of the extra repo sources you added in Cydia.
* To do so, go to Cydia > Manage > Sources > Edit, then remove a few sources in there. Note that it’s not necessarily a good idea to remove some of the default repositories (BigBoss, Cydia/Telesphoreo, Dev Team, ModMyI, ZodTTD) as they are the ones that actually provide the most bang for your bucks, so to speak.
* Apparently this error has been around for a long time, but to be quite frank, I had never heard of it until evasi0n was released.

