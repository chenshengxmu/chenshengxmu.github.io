---
layout: post
title: Possible downgrade to iOS 10.2 from iOS 10.2.1 for some users
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/downgrade-iOS-header.jpg)
* Are you are stuck on iOS 10.2.1 or higher, having missed the iOS 10.2 signing window and therefore the Yalu jailbreak? If so, you may be in luck today, provided you have the correct setup. Early reports have come in that some devices are creating nonce collisions on iOS 10.3 b1, providing an indirect route back to iOS 10.2 through Prometheus.
* For this clever workaround to come off, you must have a device which produces collisions, namely the iPhone 5s or (possibly, though not confirmed on iOS 10.3 b1), an iPad Air. If you do, you may be able to downgrade from iOS 10.2.1 to iOS 10.2 and jailbreak, by first downloading and installing iOS 10.3 beta 1, and then downgrading to iOS 10.2 using futurerestore.
* First reported on Reddit, an iPhone 5s user discovered that although nonce collisions disappeared in iOS 10.2.1, they are still present, at least on some devices, in iOS 10.3 beta 1. Whether they are present in all the 10.3 betas is unclear, but the user thought not, with beta 1 being the only option if you hope to use this method.
* Another successful report, again using an iPhone 5s, mentions upgrading first to iOS 10.3 beta 1, and then using futurerestore to downgrade all the way back to iOS 10.2. This has now also been confirmed personally by futurerestore’s creator, tihmstar.
* This stroke of luck only applies to you if you fulfil all of the following requirements:
* If all of that applies to you, you may yet be able to jailbreak! The first thing to do is to move from iOS 10.2.1 up to iOS 10.3 beta 1. After that, you may optionally run noncestatistics to see which nonces are colliding the most for your device on iOS 10.3 beta 1, and look through your saved iOS 10.2 blobs to see if you have blobs saved with those nonces.
* If you do not wish to do that, you can proceed straight to running futurerestore with all of your saved nonces to see if any of them collides and matches your blob, though this is less likely to work.
* From what I’ve seen, the two nonces which appear to be colliding heavily on iOS 10.3 beta 1 are the same ones which collided for the iPhone 5s on iOS 10.2, and were in fact my 5s’ colliding nonces on that firmware:
* 9e4c518009d00df190a450b3b47691768812360c 9f4aeec726e7c682339ddb3c6c2dec52662dc517
* These are the nonces I would try with futurerestore, if you have iOS 10.2 blobs saved for either of them.
* Whilst this is definitely an edge case, and will almost certainly be the last opportunity to make use of the nonce collision method with Prometheus, it will at least permit some users to save their jailbreak. Provided you are fortunate enough to have the requisite blobs and have the technical savvy to use the tool, I’d advise you to give it a go now rather than stay stuck on iOS 10.2.1. If it doesn’t work out after a few hours of running Prometheus to get a collision you can always go back to iOS 10.2.1, whilst it is still signed, and wait it out there.
* Do you have an iPhone 5s that is stuck on iOS 10.2.1 or higher? Are you going to give this the old college try? Let me know in the comments section…

