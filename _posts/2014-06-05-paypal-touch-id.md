---
layout: post
title: PayPal integrating Touch ID into its iOS app
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/Touch-ID-API-image-001.jpg)
* A year ago, PayPal CISO Michael Barrett spelled doom for existing verification methods based on passwords and expressed hope that the then unreleased iPhone 5s would kill the password once and for all. As it turned out, Apple limited the handset’s fingerprint scanner to iTunes purchases and user authentication on the Lock screen.
* But with the iOS 8 SDK now official, Apple has opened up Touch ID to developers and PayPal is first out of the gate with the official confirmation that it is working on integrating Touch ID authentication into its mobile apps…
* BusinessInsider has learned that the eBay-owned payment giant is planning to use the new Touch ID APIs in iOS 8 to authenticate users and confirm payments by way of a simple fingerprint scan.
* An unnamed PayPal source told the publication:
* It seems to be a fairly easy API to use, but we’re still kicking the tires.
* Thad Peterson, senior analyst at Aite Group, thinks opening up Touch ID to third-parties is a huge development.
* “If I can use PayPal with the iPhone using my thumbprint, that creates incremental value for consumers.” Plus, Apple will collect valuable information, Peterson adds. “That’s the advantage of throwing it out to developers, it’s a testing ground to see what works.”
* The Touch ID API protects logins and user data by tapping the Secure Enclave on Apple’s A7 processor, which protects data and isolates it from the rest of the system.
* Like with the iPhone 5s’s fingerprint sensing, your prints used in third-party apps never leave your device, are never synchronized with the cloud and – most importantly – developers never get to access your fingerprint data stored inside the Secure Enclave, pictured below.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Apple-A7-chip-Secure-Enclave-001.jpg)
* Apple assures Touch ID APIs don’t expose users’ prints to third-party apps.
* All apps get in return is the confirmation of a successful match. The API then unlocks predefined user passwords and other information previously stored in the system Keychain.
* “Your app can now use Touch ID to authenticate a user before accessing some or all content in your app,” notes the company on its portal for developers. “Fingerprint data is protected and never accessed by iOS or other apps.”
* Apps using the new Local Authentication framework will first display an alert to the user containing an application-specified reason for why the user is authenticating.
* “When your app gets a reply, it can react based on whether the user was able to successfully authenticate,” explains Apple, adding that developers should provide a clear explanation of what action an app will be taking based on Touch ID authentication.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/01/Activator-+-Touch-ID.jpg)
* Much like iTunes purchases and unlocking the device with Touch ID, Touch ID functionality in third-party apps adheres to the same principles Apple outlined last year.
* As a reminder, this means that Apple employs a complex mathematical model to derive a fingerprint profile based on the scans. The actual images of your fingerprints are never stored. Furthermore, the fingerprint profile is encrypted and stored into the Secure Enclave portion of the A7 processor, accessible only by the Touch ID sensor itself.
* And, it’s never transferred to Apple’s servers or synced with the network of any kind.
* The PayPal app is available free in the App Store.

