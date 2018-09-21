---
layout: post
title: Cydia introduces new TSS Center, Saurik explains what happened to iOS 6 TSS data
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/04/TSS-Center.png)
* Recently, Saurik, the creator of Cydia, posted a new blog entry explaining the history of Cydia’s TSS caching capabilities. As you know, Cydia has been able to automatically save off SHSH blobs for potential downgrade ability with jailbroken devices.
* Things have changed rapidly over the years as iOS’ security evolved. The earlier versions of iOS included absolutely no downgrade protection. Eventually, with the adaption of TSS, basic verification to make sure that you were installing newer firmware, instead of older firmware arrived. This security was enhanced further with the adoption of a new verification scheme — APTicket — which has proved to be a pain in the rear for would be downgraders. Yes, there have been, and will always be a few exceptions to that rule, but for the most part, Apple has done a good job of cutting off the ability to downgrade firmware.
* What does all of this have to do with Cydia’s new TSS Center? Well as it turns out, the APTickets saved for iOS 6.0-6.1.2 are all “useless”, as they’re incomplete tickets unsuitable for booting a device.
* In a post on his blog named Where did my iOS 6 TSS data go? Saurik explains in verbose detail the issue at hand…
* Sadly, that is not why I have been working on this article: instead, I am here to be the bearer of bad news that will likely cause me to get a ton of hatemail. 🙁 Specifically, I am writing this to tell everyone that the TSS data Cydia saved for iOS 6.0-6.1.2 is unusable. I’m also going to attempt to explain some background on the process, what the mistake was, and what users can now do instead.
* Saurik further explains:
* Instead, the requests being made via Cydia to collect SHSH information for iOS 6 did not result in useful tickets. This is because, in order to better emulate the requests Apple had been making when I first started the service, I filter the manifests I send to Apple to only include information about files that had the partial digests I discussed earlier, as only files that have partial digests are relevant for SHSH.
* The good news in all of this is that few people are actually impacted by this issue. Recent devices, such as the iPhone 5, iPod touch 5th gen, and iPad mini — devices that came with iOS 6 preinstalled, cannot be downgraded to begin with.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/04/TSS-Center-02.png)
* For those users running older devices that are still capable of running iOS 6 — the iPhone 4, iPod touch 4G, and iPhone 3GS — you can still use the limera1n exploit used by tools like RedSn0w to upgrade/downgrade for the life of the device. True, this could, in some cases, result in only a tethered jailbreak (i.e. iOS 6.1.3), but it’s a jailbreak nonetheless.
* Fortunately, there is a solution for those of you who fall into this demographic, and who wish to recover lost TSS data. Saurik explains:
* Thankfully, this situation is actually fairly easily solved: redsn0w has the ability to dump the full TSS information from a device (also using that same limera1n exploit). I thereby encourage users of devices capable of being exploited by limera1n (the iPhone 3G[S], iPhone 4, or 4th generation iPod touch) to download this tool right now and use it to upload complete TSS information.
* I never imagined this scenario coming into play, but this is a prime example as to why it’s always a good reason to save a local copy of your blobs using a tool like Redsn0w, or iFaith.
* This new TSS Center page located on Cydia is the new way to go about verifying SHSH blobs and APTickets on Cydia. I highly encourage you to head over to Saurik’s blog and read the post for yourself. You may have to read it once, twice, maybe three times before it all finally clicks. It’s very lengthy and quite detailed, but it’s worth the read if you’re into this sort of thing.
