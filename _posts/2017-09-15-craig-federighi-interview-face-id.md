---
layout: post
title: Apple dispatches Craig Federighi to dispel Face ID worries
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Events-September-2017-Craig-Federighi-Face-ID-demo-009.jpg)
* Craig Federighi, Apple’s chief of software engineering, discussed Face ID in a telephone interview Friday with TechCrunch’s Matthew Panzarino.
* He assuaged worries that Apple’s facial detection technology won’t work as advertised while addressing some of the lingering questions surrounding the already-controversial feature.
* But first, a note from the author:
* This is a bit of an aside, but I’d also like to point out here that Face ID emits no visible light. I’ve seen some misconceptions on social media that it’s going to be shining a light at your face. Nope. It uses only infrared and existing light, which means it will work in darkness without any more light than is coming off of the phone’s screen.
* …
* Developers do not have access to raw sensor data from the Face ID array. Instead, they’re given a depth map they can use for applications like the Snap face filters shown onstage. This can also be used in ARKit applications.
* …
* One anecdotal thing: If you lift your phone and swipe up immediately, there’s a good chance that the Face ID system will have performed its authentication fast enough to have unlocked your device by the time you finish your swipe. That’s how fast it is.
* Here’s a hands-on video by 9to5Mac showing how fast Face ID is.
* Face ID depends on some key features of your face to work properly.
* Specifically, he said, Face ID needs to see your eyes, nose and mouth to work. While hats, scarves and other accessories that might obscure your face are not enough to throw Face ID off, there are specific cases where the passcode is a better choice than Face ID:
* If you’re a surgeon or someone who wears a garment that covers your face, it’s not going to work. But if you’re wearing a helmet or scarf it works quite well.
* The comment suggests that Face ID may not be the best solution in some Muslim countries where women are not allowed to show their face in public and have to wear a niqab (a separate piece of clothing that just covers their face and head).
* And what about sunglasses?
* According to Federighi, most sunglasses on the market will work just fine with Face ID because they let through infrared light even if they appear to be opaque.
* While polarization generally isn’t much of a problem, some lenses that have a coating which blocks infrared light completely will prevent Face ID from seeing your eyes. In those cases, you’ll need to take your sunglasses off or switch to the passcode.
* You can use Face ID without needing to stare directly at the phone with your eyes open, if you like, by disabling Attention Awareness in Settings. Doing so will decrease your overall security because the system will no longer be able to ensure your eyes are directly focused on the phone.
* You can turn off attention detection as a user. There’s some compromise to detection there—but if you have a condition where you can’t look at it, that’s the choice you have. And if you don’t want to use the Face ID feature at all, you can turn it off.
* And while Face ID works from odd angles and distances, it still need to see your face:
* It’s quite similar to the ranges you’d be at if you put your phone in front facing camera mode to take a picture. Once your space from eyes to mouth come into view that would be the matching range—it can work at fairly extreme angles—if it’s down low because your phone is in your lap it can unlock it as long as it can see those features. Basically, If you’re using your phone across a natural series of angles it can unlock it.
* What about tricky scenarios, like being stopped by the police or if a thief forces you to hand over your device? If that happens, just don’t stare at the display and remember to hold the Side and Volume buttons simultaneously which will temporarily disable Face ID.
* On older phones, the sequence was to click five times on the Power button. On newer phones like iPhone 8 and iPhone X, if you grip either volume button plus the Side button and hold them a little while—we’ll take you to the power down screen.
* But that also has the effect of disabling Face ID.
* So, if you were in a case where the thief was asking to hand over your phone—you can just reach into your pocket, squeeze it and it will disable Face ID. It will do the same thing on iPhone 8 to disable Touch ID.
* Other points in Panzarino’s interview with Federighi reiterate what we’ve known from Apple’s specs and developer documentation. For example, Face ID authentication is automatically disabled after five unsuccessful attempts.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Events-September-2017-Craig-Federighi-Face-ID-demo-003.jpg)
* The user must also enter their passcode to reenable Face ID in any of the following cases:
* When Face ID is enabled, the phone immediately locks when the Side button is pressed and every time the phone goes to sleep. Which is to say, this is just like Touch ID.
* Apple has promised to release a security document that will have “extreme levels of detail” about the security of Face ID closer to the release of iPhone X.
* Some people have expressed doubt that Face ID would work in China as it’d presumably have difficulty detecting the smaller eyes of the Asian population. Some people have even gone so far as to point out the cases where some Galaxy S8 owners have resorted to stretching their eyelids wide open in order to make the phone’s iris scanner work properly.
* With Face ID, you won’t have to worry about that.
* OVERVIEW: Face ID overview: setting up, how it works, security, privacy, spoofing & more
* Although many consumer facial recognition systems are trained on generic faces, Federighi says they’ve trained Face ID using a high-fidelity depth map of facial data. They actually went out and got consent from subjects to obtain “quite exhaustive” scans of their faces taken from many angles that contain a lot of detail that was then used to train Face ID.
* Phil mentioned that we’d gathered a billion images and that we’d done data gathering around the globe to make sure that we had broad geographic and ethnic data sets. Both for testing and validation for great recognition rates.
* That wasn’t just something you could go pull off the Internet.
* We do retain a high-fidelity depth map of that training data that we protect. As we train these models and iterate on these algorithms you want raw sensor data to use and develop and optimize them.
* The statement suggests that racial bias shouldn’t be a problem with Face ID.
* He went on to reiterate that, no, your face won’t leak to the Internet because all Face ID processing is done on-device, facial information is encrypted in the Secure Enclave and the infrared image of your face, along with its 3D mesh, are immediately discarded after each scan.
* Facial recognition doesn’t happen in the cloud, nothing gets sent to Apple’s servers and they collect absolutely no data from the TrueDepth camera in the notch of iPhone X.
* We do not gather customer data when you enroll in Face ID, it stays on your device, we do not send it to the cloud for training data.
* For those wondering, the infrared image and the 3D dot pattern of your face that the TrueDepth camera captures is converted into a mathematical model of your face which Apple says cannot be used to reconstruct your face from.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-009.jpg)
* We will of course need to test-drive Face ID under various circumstances and conditions to test Apple’s claims, but for the time being there’s no reason to doubt advanced technology and strong security that the company has built into the Face ID system.
* Apple also provided the following comment to 9to5Mac regarding Face ID intricacies:
* Our teams have been developing the technologies behind Face ID for several years, and our users’ privacy has been a priority since the very beginning.
* Face ID provides intuitive and secure authentication enabled by the TrueDepth camera system and the A11 Bionic chip, which uses advanced technologies to accurately map and match the geometry of a user’s face. Face ID data never leaves the device, is encrypted and protected by the Secure Enclave.
* We’ve tested Face ID on people from many countries, cultures, races and ethnicities, using over one billion images to train our neural networks and defend against spoofing.
* We’re confident that our customers will love using the feature and find it an easy and natural way to unlock their iPhone X. We will offer more details on Face ID as we near the product’s availability.
* Still not convinced?
* I’m mostly sold on Face ID. That said, we’d like to hear your thoughts and early impressions on Face ID so do leave your comments below.

