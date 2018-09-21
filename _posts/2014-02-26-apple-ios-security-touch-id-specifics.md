---
layout: post
title: An in-depth look at how Touch ID, A7, and Secure Enclave boost iOS security
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Touch-ID-Home-button-e1379347504972.png)
* We know quite a lot about the iPhone 5s’s fingerprint scanner, Touch ID. The advanced sensor works seamlessly and learns more about your prints over time so it continues to expand your fingerprint map as additional overlapping nodes are identified with each use.
* It can match prints in any orientation, unless your fingers are greasy or wet, or there’s some dirt or debris on the Home button. There’s a 1 in 50,000 chance of a successful random match with someone else’s print, which is much better than the 1 in 10,000 odds of guessing a typical four-digit passcode.
* The Touch ID sensor doesn’t store actual fingerprint images and instead creates an encrypted profile of your print and stores it on a module on the A7 processor called the Secure Enclave that’s walled off from the rest of the system.
* After five unsuccessful fingerprint match attempts, or after every restart, the system asks for your passcode  so that hackers can’t stall for time. These are pretty much key pieces of information on Touch ID that was made public since its inception.
* Today, Apple updated its iOS Security white paper [PDF download] with a few previously unknown specifics relating to how Touch ID works side by side with the A7 chip and its Secure Enclave portion to detect a fingerprint match in a highly secure manner. The document also details other security safeguards Apple put in place to prevent tampering with fingerprint data…
* Based on information provided on Apple’s website and made public during the September 2013 double-iPhone keynote, we know that all fingerprint profiles get stored locally in a secure location on Apple’s A7 chip.
* Nothing but the Touch ID sensor itself physically communicates with this Secure Enclave portion of the A7 processor. Moreover, no fingerprint data gets stored on Apple’s servers, synced via iCloud or exposed to the system or apps.
* Again, we’ve known about all of the aforementioned rules from before.
* No two Touch IDs are alike
* Then in October 2013, iMore discovered that Apple may have paired every individual Touch ID sensor cable to each individual iPhone 5s, down to the component cable assembly itself being tied to each individual A7 chip.
* As a result of these extraordinary measures, swapping out the Touch ID sensor for a hacked module won’t work. Neither will replacing the dock connector the Touch ID makes contact with. Even replacing the logic board itself renders Touch ID inoperable – again, all in the interest of your own security.
* Apple’s updated white paper corroborates iMore’s findings (emphasis mine):
* Each Secure Enclave is provisioned during fabrication with its own UID (Unique ID) that is not accessible to other parts of the system and is not known to Apple.
* When the device starts up, an ephemeral key is created, tangled with its UID, and used to encrypt the Secure Enclave’s portion of the device’s memory space.
* Additionally, data that is saved to the file system by the Secure Enclave is encrypted with a key tangled with the UID and an anti-replay counter.
* Pictured below: the Secure Enclave module on the A7 chip (the white rectangle).
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Apple-A7-chip-Secure-Enclave-001.jpg)
* How Touch ID, A7 and Secure Enclave detect a fingerprint match
* The Secure Enclave determines if there is a match against registered fingerprints.
* If a match is detected, the Secure Enclave enables access or purchase on behalf of the user. Fingerprint data then gets transferred between the A7 chip and the Touch ID sensor over a serial peripheral interface bus, Apple explains.
* All the A7 can do is forward the data to the Secure Enclave – it can’t read it.
* Communication between the Secure Enclave and the application processor is isolated to an interrupt-driven mailbox and shared memory data buffers.
* On fingerprint encryption
* Fingerprint data is encrypted and authenticated with a session key negotiated using the device’s shared key that is built into the Touch ID sensor and the Secure Enclave.
* The session key exchange uses AES key wrapping with both sides providing a random key that establishes the session key and uses AES-CCM transport encryption.
* Passcodes and Touch ID
* The document also details the following circumstances under which your passcode is required instead of Touch ID:
* The last item – falling back to the passcode after the device has received a remote lock command – was previously unknown.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iOS-7-teaser-iPhone-5s-ad-019.jpg)
* Other tidbits worth mentioning:
* On unlocking grace period
* There’s no unlocking grace period when Touch ID is enabled. Your iPhone 5s immediately locks every time it goes to sleep, no exceptions.
* “With Touch ID, iPhone 5s locks every time it goes to sleep, and requires a fingerprint – or optionally the passcode – at every wake,” as per Apple.
* On authentication tokens
* When Touch ID is configured to approve purchases from the iTunes Store, the App Store and the iBooks Store, authentication tokens get exchanged between the device and store. The token and nonce are held in the Secure Enclave, with the latter signed with a Secure Enclave key shared by all devices and the iTunes Store.
* On fingerprint data availability
* Touch ID authentication and the data associated with the enrolled fingerprints are not available to other apps or third parties.
* On fingerprint data security
* The high-resolution 500ppi scan of your print is only temporarily stored in encrypted memory within the Secure Enclave while being vectorized for analysis. But don’t worry, the scan gets immediately discarded after a vector has been created.
* Also crucial: fingerprint profiles can’t be reverse-engineered.
* That’s because the analysis is based on subdermal ridge flow angle mapping, which Apple explains is a lossy process that “discards minutia data that would be required to reconstruct your actual print”.
* On Apple’s fingerprint data policies
* Your vectorized fingerprint data (the resulting map of nodes) never leaves the device. It’s encrypted and stored without any identity info inside the Secure Enclave. It can only be read by the Secure Enclave and is never sent to Apple or backed up to iCloud or iTunes.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iOS-7-teaser-iPhone-5s-ad-006.jpg)
* How Touch ID unlocks your iPhone
* Here are some of the sophisticated behind-the-scenes procedures taking place when the Touch ID sensor actually unlocks your iPhone 5s or approves purchases.
* On devices with an A7 processor, the Secure Enclave holds the cryptographic class keys for Data Protection. When a device locks, the keys for Data Protection class Complete are discarded, and files and keychain items in that class are inaccessible until the user unlocks the device by entering their passcode.
* On iPhone 5s with Touch ID turned on, the keys are not discarded when the device locks; instead, they’re wrapped with a key that is given to the Touch ID subsystem. When a user attempts to unlock the device, if Touch ID recognizes the user’s finger- print, it provides the key for unwrapping the Data Protection keys and the device is unlocked. This process provides additional protection by requiring the Data Protection and Touch ID subsystems to cooperate in order to unlock the device.
* The decrypted class keys are only held in memory, so they’re lost if the device is rebooted. Additionally,  the Secure Enclave will discard the keys after 48 hours or 5 failed Touch ID recognition attempts.
* The Secure Enclave and code signing
* The Secure Enclave is a system-on-a-chip (SoC) within the A7 chip that uses its own secure boot and personalized software update separate from the main A7 processor.
* Apple writes that “the key operations are performed by the Secure Enclave”.
* And what those “key operations” might be?
* According to Apple, the Secure Enclave (among other things) ensures that its separate software is verified and signed by Apple during a secure boot process.
* On a device with an A7 processor, the Secure Enclave coprocessor also utilizes System Software Authorization to ensure the integrity of its software and prevent downgrade installations.
* The Secure Enclave also provides all cryptographic operations to the rest of the system and maintains the integrity of data protection even if the kernel has been compromised.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iPhone-5s-motherboard-A7-chip-iFixIt-001.jpeg)
* For those wondering, each iOS device’s unique ID (UID) and a device group ID (GID) are “fused” into the A7 chip during manufacturing.
* “No software or firmware can read them directly; they can see only the results of encryption or decryption operations performed using them,” reads the doc.
* On verifying software updates and restores with Apple
* While the UID is unique to each device and is “not recorded by Apple or any of its suppliers”, the GID is common to all Apple-designed processors in a class of iOS devices, such as the A7-powered iPad Air.
* The GID is used as an additional level of protection when delivering system software during installation and restore.
* Integrating these keys into the silicon helps prevent them from being tampered with or bypassed, or accessed outside the AES engine.
* It’s cool that the UID allows data to be cryptographically tied to a particular device.
* As a result of this clever approach, should a hacker attempt to move the memory chips physically from one device to another, your files will remain inaccessible.
* The Secure Enclave and passcodes
* The Secure Enclave also handles passcodes in a more secure manner by enforcing a five-second delay between repeated failed unlocking requests.
* “This provides a governor against brute-force attacks in addition to safeguards enforced by iOS,” according to the white paper.
* Before signing off, I’ve also discovered the following factoid concerning long passcodes, one that shines new light on Apple’s attention to detail, all over again:
* If a long password that contains only numbers is entered, a numeric keypad is displayed at the Lock screen instead of the full keyboard. A longer numeric passcode may be easier to enter than a shorter alphanumeric passcode, while providing similar security.
* System administrators can enforce complex passcode requirements and enable/disable Touch ID by creating passcode policies and installing these configuration profiles in batch on business devices.
* And yes – Touch ID is a trademark of Apple Inc.
* The entire document is a fascinating read for everyone who’s eager to really dig deep into the intricacies of Touch ID, the A7 and the Secure Enclave.
* Additional information pertaining to the Touch ID security and inner workings is available in a pair of Apple support documents titled ‘iPhone 5s: Using Touch ID’ and ‘iPhone 5s: About Touch ID security’.
* We’ve also covered Apple’s fingerprint scanner extensively here on iDownloadBlog so feel free to browse our Touch ID archive. And if you’re jailbroken, you definitely don’t want to miss out on a myriad of great Touch ID jailbreak tweaks.

