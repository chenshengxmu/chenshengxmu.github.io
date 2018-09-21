---
layout: post
title: Decryption key for iPhone 5s's Touch ID Secure Enclave coprocessor has been exposed
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/iPhone-5s-Touch-ID-closeup-002.jpg)
* Ahead of this year’s Hack in the Box (HITB) conference in Singapore, security researcher who goes by the Twitter handle “xerub” has managed to expose the fully grown decryption key for the iPhone 5s’s cryptographic coprocessor that handles Touch ID, called Secure Enclave.
* He also posted the decryption key online.
* The release of this key doesn’t mean the phone is no longer secure: sensitive data stored in the Secure Enclave is secured with other keys that haven’t been compromised, and likely won’t. All security experts can do is use the “img4lib” library to decrypt and take a closer look at Apple’s secret software running on the cryptographic coprocessor, not read any data stored in it.
* For those wondering, the Secure Enclave is fabricated in the S2 chip powering Apple Watch Series 1 and Series 2 and Apple’s A-series chips from the A7 chip in iPhone 5s onward.
* I’m only speculating here, but examining the Secure Enclave firmware could provide valuable insights into its inner workings, which, in turn, could make discovering exploits used for jailbreaking easier. However, any exploits specifically targeting the Secure Enclave would be specific to iPhone 5s and require physical access to the phone to load custom firmware.
* The Secure Enclave has its own secure boot process to ensure its separate firmware is verified and signed by Apple. Not to be confused with the iOS code running on the main processor, the Secure Enclave firmware can only be changed via a personalized software update process that is created just for it, separately from the main A-series processor.
* key is fully grown https://t.co/MwN4kb9SQI use https://t.co/I9fLo5Iglh to decrypt and https://t.co/og6tiJHbCu to process
* — ~ (@xerub) August 16, 2017
* iOS hacker Will Strafach aka Chronic was quick to point out that this is not a huge deal for end users because the Secure Enclave has not actually been hacked. “Decryption key in this case is for the firmware, allowing more researchers to look at it,” he said on Twitter.
* When iPhone 5s released in 2013, it debuted the Touch ID fingerprint sensor. To securely store and protect the sensitive data from the fingerprint sensor, Apple has created a Secure Enclave chip-within-a-chip embedded into the phone’s main A7 processor.
* Think of it as a separate entity with its own encrypted memory and a hardware random number generator. All communication between the Secure Enclave and the main A7 processor is isolated to an interrupt-driven mailbox and shared memory data buffers.
* The processor only forwards the data to the Secure Enclave, but can’t read it. In other words, the main processor cannot directly obtain device keys or read encrypted data stored in the Secure Enclave, nor can it alter its functions—that would require deploying a new signed firmware created specifically for the Secure Enclave.
* Basically an ARMv7a coprocessor, the Secure Enclave runs an Apple-customized version of the L4 microkernel family. It’s been speculated that the data securely stored in the Secure Enclave’s encrypted memory is enforced by ARM’s TrustZone and SecurCore technology.
* Unlike the Secure Enclave’s memory in the A8 and newer processors, the one in the A7’s Secure Enclave is not authenticated with the ephemeral key (created when the phone starts up).
* The Secure Enclave (smaller rectangle) is embedded into the main A-series chip.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Apple-A7-chip-Secure-Enclave-001.jpg)
* As mentioned above, the Secure Enclave has its own firmware, kernel, drivers and services that power Touch ID and provide all cryptographic functions to the system.
* Aside from regulating all communication between the Touch ID sensor and the Secure Enclave via a secure path, the cryptographic coprocessor provides other features and services:
* According to Apple’s iOS Security Guide document and related patent filing, the Secure Enclave uses System Software Authorization to ensure the integrity of data protection and its own firmware, even if the kernel has been compromised, to prevent downgrade installations.
* On A9 or later A-series processors, the Secure Enclave is also responsible for securely generating the unique ID (UID), which is a 256-bit AES key unique to each device.
* This UID is securely stored in the Secure Enclave’s own encrypted memory and as such is unknown to Apple and other parts of the system.
* All iOS can see are the results of encryption or decryption operations performed by dedicated AES engines implemented in silicon using the UID as a key (or GID, which is a device group ID compiled into the chip and common to all processors in a class of devices; for instance, all iOS devices using the A9 processor).
* According to Apple’s bug bounty program, any successful extraction of confidential material protected by the Secure Enclave shall be awarded with a cool $100,000.

