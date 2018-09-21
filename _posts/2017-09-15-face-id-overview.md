---
layout: post
title: Face ID overview- setting up, how it works, security, privacy, spoofing & more
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-001.jpg)
* Ten years after kickstarting the mobile revolution with the original iPhone and four years since mainstreaming mobile fingerprint sensors with Touch ID, Apple has now begun to supplant fingerprint biometrics on mobile with facial recognition based on depth perception.
* Debuting on iPhone X, Face ID is an advanced facial recognition system that uses vertical-cavity surface-emitting (VCSEL) laser diodes and machine learning. It can recognize your face out of a million other, letting you unlock your phone with just a look, approve Apple Pay transactions with your face, mimic your facial expressions on 3D emoji in real time and more.
* Face ID will eventually roll out to all future iPhones and iPads while gaining additional features and introducing whole new use cases. Here’s everything you need to know about Face ID.
* To set up Face ID, venture into Settings → Passcode & Face ID. This is where you’ll enroll your face, manage the features Face ID will be used for and more.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/iPhone-8-FAce-ID-and-Passcode-image-002.jpg)
* To get started with Face ID, tap Enroll Face underneath the Face ID heading, then tap Get Started and follow onscreen instructions to complete enrollment. To help Face ID recognize the unique features of your face, position your face within the onscreen frame then gently move your head while looking at the screen to complete the circle.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-006.jpg)
* That’s it, you can now use your face instead of your fingerprint to unlock the phone and more.
* Seriously?
* Just pick up your phone and it unlocks the instant you look at it. The padlock icon on the Lock screen animates to indicate the phone is unlocked, revealing notifications and messages.
* To reach the Home screen, slide up from the bottom of the screen. You don’t need to hold the phone directly in front of your face: Face ID works even if the device is slightly off-axis.
* We should point out that Face ID does not constantly scan its surroundings when the phone is asleep so, no, you cannot launch the Home screen by glance at it from across the room. In other words, you must be in the DepthCamera’s view and the phone must be awake in order for Face ID to kick into action.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Face-ID-tech-2.jpeg)
* Face ID also keeps the screen lit when you’re looking at it, which is useful when reading.
* This is called Attention Awareness and can be disabled at will in the Accessibility section of the Settings app. Face ID will even lower the volume of an alarm or ringer after you wake up and look toward the device with your eyes open.
* By default, Face ID refuses to unlock the phone if it doesn’t see your eyes.
* You can turn this off in Accessibility settings but keep in mind that doing so shall lower your security because Face ID won’t be able to tell that your eyes are directly focused on the phone. For instance, someone could gain access to your device by scanning your face while you’re asleep or simply point the phone at your face to unlock it, even when you’re not paying attention.
* To prevent this from happening, either leave this setting on or remember to do the following before nap time or leaving your phone unattended, even for a few minutes: simultaneously hold either of the volume buttons and the Side button, which will disable Face ID temporarily and require a passcode.
* Touch ID is still a little bit faster than Face ID. Touch ID can be set to launch the Home screen as soon as you rest a finger on the sensor, but that’s about the only thing going for it.
* TIP: don’t turn the Raise to Wake feature off when using Face ID.
* While iPhone X lets you wake the display with a tap (they’re calling it Tap to Wake), you still must slide up to get to the Home screen. With Raise to Wake off, every phone unlock takes two gestures instead of one (tap to wake the display, then swipe up to launch the Home screen).
* At launch, Face ID can be used for:
* Your favorite apps don’t need to be updated in order to take advantage of Face ID. Any app which already works with Touch ID (banking apps included) will automatically continue working with the new Face ID system, and vice versa, no update required.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-013.jpg)
* The best thing about Face ID is that depth perception afforded by the new infrared sensors is not limited to facial scanning. For instance, Apple is already using its new TrueDepth camera system to animate emoji in real-time by mapping more than fifty facial muscle movements.
* One could easily envision a future software update taking the TrueDepth system even further by bringing a range of other exciting user experiences to the mix.
* Glad you asked…
* Like Touch ID, Face ID “just works” but there are some prerequisites. Just like Touch ID doesn’t work reliably with wet, oily or dirty fingers, Face ID needs to see your eyes, nose and mouth to work properly.
* Though scarves and other accessories that might obscure your face won’t throw it off, surgeons and people who wear a garment that covers their face (i.e. women in some Muslim countries are required to wear a niqab in public) will need to use the passcode instead, as per Apple.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-TrueDepth-camera-002.jpg)
* Face ID takes advantage of a brand new TrueDepth camera system hidden in the cutout at the top of the Super Retina display. Every time you pick up your phone, an infrared transmitter illuminates your face using rays of infrared light invisible to the human eye.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-003.jpg)
* Infrared light is commonly used for night vision, which lets Face ID see your face even in complete darkness. At this point, a dedicated infrared camera kick into action to capture a two-dimensional image of your face in the infrared light spectrum.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-004.jpg)
* Another sensor sprays the unique geometry of your face with more than 30,000 invisible infrared dots. This is used for depth perception—the greater the distance, the bigger the dot.
* For instance, a dot that lands on your nose has a smaller diameter than the one hitting your forehead or ear. An infrared camera picks up these microscopic differences in dot size, allowing the system to build a three-dimensional mesh of your face.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-005.jpg)
* Next, the infrared image and the 3D dot pattern get pushed through neural networks powered by a dedicated hardware embedded into the A11 Bionic chip. This neural engine is a dual-core processor optimized for a specific set of machine learning algorithms.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-A11-Bionic-neural-engine-ID-001.jpg)
* Performing an astounding 600 billion calculations per second, it processes facial data in real-time to create a mathematical model of your face and feed it to a dedicated cryptographic coprocessor, called Secure Enclave. It then checks that mathematical model against the one that the system stored when you enrolled your face to see if there’s a match.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-009.jpg)
* If there’s a match, the Secure Enclave unlocks your phone. If that sounds complicated, that’s because it is. There’s some immense technology behind Face ID that works in real-time, yet the user never sees these things going off.
* From a user standpoint, Face ID “just works.”
* Apple approaches faces the same way it treats fingerprints.
* That should assuage concerns whether or not the Face ID technology is secure enough to become a viable replacement for Touch ID. If it’s good enough for the banks, it’s at least as secure as Touch ID.
* Apple pegs the chance of someone unlocking your phone with their face at one in a million.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-010.jpg)
* By contrast, a random fingerprint could dupe Touch ID with a success rate of one in 50,000. In other words, Face ID improves upon Touch ID twenty-fold though the statistics are lowered if a person shares a close genetic relationship with you.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-011.jpg)
* So, how secure facial information on your phone is?
* As mentioned, facial information is hashed before being passing on to the Secure Enclave to confirm a match. At the same time, the infrared image of your face along with the dot pattern are immediately discarded.
* Embedded into the main A11 Bionic chip, the Secure Enclave itself is an extremely secure cryptographic coprocessor that’s resistant to even circuit-level analysis. Even if a hacker managed to break into the Secure Enclave, decrypt its memory and extract data, they would find it impossible to reconstruct your face from its mathematical representation.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-015.jpg)
* The Secure Enclave uses its own encrypted memory and is walled off from the A10 Bionic chip and the rest of the system. As a result, all processing done on the Secure Enclave is safe from the prying eyes.
* All the system received from the Secure Enclave is a confirmation of a match.
* Furthermore, Face ID processing is done on-device and your facial information is safely encrypted in the Secure Enclave. Your face won’t leak to the Internet because the data is never sent to the cloud nor is it exposed to or accessible by apps or to the rest of the system.
* You’re not required to use Face ID if you don’t want to. The good ol’ passcode (make it at least six digits) will protect and lock your sensitive information just as well as Face ID or Touch ID.
* Here’s a quick overview of where Face ID does and doesn’t work:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-Face-ID-012.jpg)
* Like with Touch ID, your passcode is required to reenable Face ID in any of the following cases:
* According to Apple’s developer documentation, the Face ID authentication dialog contains a Cancel button, as well as a passcode fallback button which is initially hidden and shows up after first unsuccessful attempts.
* And that’s it, boys and girls.
* This overview of Face ID will hopefully give you a better idea how Apple’s new biometrics work. In case you have any lingering doubts as to how secure the system is, or other related questions, feel free to share them with fellow readers by leaving your comments below.

