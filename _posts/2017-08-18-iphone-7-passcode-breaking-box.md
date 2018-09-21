---
layout: post
title: New iOS vulnerability enables brute-force passcode attacks on iPhone 7
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/iPhone-7-passcode-hacking-box.jpg)
* We’ve seen devices for brute-forcing phone passcodes before. This $500 box, demonstrated on video by YouTuber “EverythingApplePro”, uses an exploit in iOS 10.3.3 and iOS 11 beta to brute-force hack and bypass the Lock screen passcode of up to three iPhone 7/Plus handsets at a time—but it could take days to work, depending on the complexity of the passcode.
* Normally, attacks like this are impractical due to a user-selectable setting that tells your iPhone or iPad to wipe all your data clean after ten unsuccessful passcode entries.
* Plus, the Secure Enclave cryptographic coprocessor found in the main A-series processor enforces escalating time delays after an invalid passcode is entered at the Lock screen to prevent such boxes from trying out many different passcode combinations per second.
* But due to a previously unknown loophole in iOS 10.3.3 and iOS 11 beta, an attacker can use as many passcode attempts as needed on the white “Press home to recover” screen displayed after a new iOS install. In the video embedded below, “EverythingApplePro” uses a simple passcode of “0016” to allow the hack to work more quickly.
* The hack takes advantage of iOS’s update process.
* “They found a loophole in the data recovery state that allows you to use as many passcode attempts as you want,” the posted explained.
* An attacker would still need to own the $500 device and have your phone in physically possession for days before exposing your passcode. Although older devices/iOS editions are not affected, we fully expect that Apple will soon release a fix to patch the vulnerability.
* This vulnerability is limited to the latest iPhone 7 and iPhone 7 Plus phones and specific to iOS 10.3.3 and the latest iOS 11 beta. The best way to protect yourself from those kinds of brute-force attacks involves setting up a six-digit or alphanumeric passcode, which could take many weeks or even months to try out all the possible passcode combinations.
* TUTORIAL: How to set up a six-digit passcode on your iPhone
* Earlier this week, iOS hacker “xerub” has managed to extract the decryption key protecting the firmware running on Apple’s Secure Enclave cryptographic coprocessor that’s embedded into the iPhone 5s’s A7 chip, and posted it on GitHub.
* The key’s exposure allows security researchers to examine the inner workings of Apple’s secret software powering the functions that the Secure Enclave provides to the system.
* User data, encryption keys and other sensitive information securely stored in the Secure Enclave’s encrypted memory are not at risk of being decrypted, an Apple source said today.
* Also relevant, iOS 11 includes a handy shortcut that lets you quickly disable Touch ID and require a passcode to unlock the device.
* This could be an important feature should you ever find yourself in a dangerous situation or at risk of arrest because it ensures the phone cannot be forcefully unlocked with a fingerprint.
* For those wondering, the police can force you to unlock your phone using your fingerprint, but they legally can’t force you to do that when using a passcode.

