---
layout: post
title: Everything we know about how Face ID works and protects your facial data
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Face-ID-Security-document-MAc-screenshot.jpg)
* Apple has said it will share more information on how the new facial recognition system debuting on iPhone X works, and now they’ve made good on that promise.
* Apple’s new white paper titled “Face ID Security” and a new support document detail how Face ID works, authenticates, protects your data and strengthens user security.
* FaceID isn’t a dumb facial recognition system that checks an RGB image of one’s face against stored images. Instead, it uses Apple’s new TrueDepth camera system based on infrared light and depth sensing technology to accurately map the geometry of your face.
* The probability that a random person in the population could unlock your deice with Face ID is approximately one in a million versus one in 50,000 for Touch ID, says Apple.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-Event-September-2017-TrueDepth-camera-002.jpg)
* The document acknowledges that the probability of a false match is different for twins and siblings that look like you as well as among children under the age of 13, because their “distinct facial features may not have fully developed.”
* Here’s how the TrueDepth camera works:
* Once it confirms the presence of an attentive face, the TrueDepth camera projects and reads over 30,000 infrared dots to form a depth map of the face along with a 2D infrared image. This data is used to create a sequence of 2D images and depth maps, which are digitally signed and sent to the Secure Enclave.
* To counter both digital and physical spoofs, the TrueDepth camera randomizes the sequence of 2D images and depth map captures and projects a device-specific random pattern.
* A portion of the A11 Bionic chip’s neural engine—protected within the Secure Enclave—transforms this data into a mathematical representation and compares that representation to the enrolled facial data. This enrolled facial data is itself a mathematical representation of your face captured across a variety of poses.
* Summing up, the following Face ID data is saved encrypted in the Secure Enclave:
* This data never leaves the device, it’s not sent to Apple nor is it included in device backups. Facial matching is performed within the Secure Enclave using neural networks trained specifically for that purpose.
* These neural networks used for Face ID may be updated over time.
* To avoid a user having to re-enroll to Face ID when these neural network changes are made, iPhone X will be able to automatically run stored enrollment images through the updated neural network.
* In addition to being encrypted and protected by the Secure Enclave, these enrollment images are cropped to your face, minimizing the amount of background information.
* Face images captured during normal unlock operations aren’t saved, but are instead immediately discarded once the mathematical representation is calculated for comparison to the enrolled Face ID data.
* Rather than constantly scan your surroundings, the TrueDepth camera only looks for your face when you:
* By default, the phone unlocks when the TrueDepth camera detects a face and Face ID sees that your eyes are open and directed at the device.
* You can disable attention awareness at any time to unlock the phone without needing to stare at it. Doing so, however, makes Face ID less secure because someone could unlock your phone while you were asleep.
* Face ID overview: Setting up, how it works, security, privacy, spoofing & more
* Attention awareness is always disabled when VoiceOver is activated.
* Face ID can be used indoors, outdoors and in total darkness and works with:
* An additional neural network running on the A11 Bionic chip has been specifically trained to spot and resist spoofing against attempts to unlock the phone with photos or masks.
* To improve unlock performance and keep pace with the natural changes of your face and look, Face ID augments its stored mathematical representation over time. Upon every successful unlock, the system uses the newly calculated mathematical representation of your face (“if its quality is sufficient”) for a finite number of additional unlocks before that data is discarded.
* Check out what happens after Face ID fails to recognize you but the match quality is still higher than a certain threshold and you immediately follow the failure by entering your passcode:
* Face ID takes another capture and augments its enrolled Face ID data with the newly calculated mathematical representation. This new Face ID data is discarded after a finite number of unlocks and if you stop matching against it.
* Apple says that this lets the facial recognition system keep up with “dramatic changes in your facial hair or makeup use” while minimizing false acceptance.
* Like with Touch ID, your passcode is still required under these circumstances:
* Rather than replace your passcode, Face ID provides easy access to iPhone X “within thoughtful boundaries and time constraints,” in Apple’s own words.
* TUTORIAL: How to make your iOS device more secure with a 6-digit passcode
* According to the company, having a passcode is very important “because a strong passcode forms the foundation of your iOS device’s cryptographic protection.”
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/iOS-device-unlocking-Face-ID-Touch-ID-security-document-web-screenshot.png)
* From a security and technology standpoint,  the underlying process of unlocking your device with Face ID vs. the passcode is exactly the same as that for Touch ID (which you can find more about in Apple’s white paper titled “iOS Security Document”).
* If an app supports Touch ID, it automatically works with Face ID without requiring an update.
* Like with Touch ID, apps are simply notified if the authentication was successful. For added security, apps can verify that a passcode has been set by the user before requiring Face ID or a passcode to unlock items—again, just like with Touch ID.
* Apps can also:
* Apps cannot access Face ID or the data associated with the enrolled face.
* Aside from unlocking the device, you can also use Face ID to:
* With iOS 11 and later, Face ID-protected Secure Enclave ECC keys are used to authorize a purchase by signing the store request.
* Authorizing Apple Pay purchases with a look goes as follows:
* “If you’d like to select a different Apple Pay payment method after Face ID authentication, you’ll need to reauthenticate, but you won’t have to double-click the Side button again,” reads the document. If an Apple Pay transaction is not completed within 30 seconds of double-clicking the Side button, you must reconfirm intent to pay by double-clicking again.
* The only case your facial data leaves the phone is when you specifically agree to provide Face ID diagnostic data to AppleCare for support purposes.
* This can only happen at your request.
* Apple states:
* Here’s how setting up Face ID Diagnostics works:
* Your existing Face ID enrollment will be deleted and you’ll be asked to re-enroll in Face ID. Your iPhone X will begin recording Face ID images captured during authentication attempts for the next seven days. iPhone X will automatically stop saving images thereafter.
* Face ID Diagnostics doesn’t automatically send data to Apple. You can review and approve Face ID Diagnostics data—including enrollment and unlock images (both failed and successful) that are gathered while in diagnostics mode— before it’s sent to Apple.
* Only the Face ID Diagnostics images you have approved get uploaded while those you reject are immediately deleted. Diagnostics data is end-to-end encrypted and immediately deleted from the device after the upload completes.
* If you don’t conclude the Face ID Diagnostics session by reviewing images and uploading any approved images, Face ID Diagnostics will automatically end after 90 days and all diagnostic images will be deleted from the phone.
* To be sure, you can disable Face ID Diagnostics at any time which will immediately delete all local images and stop any sharing of Face ID data with Apple.
* And that’s how Face ID works.
* You now hopefully have a much better understanding of Apple’s facial recognition on iPhone X, why it’s more secure than Touch ID, how your data is protected and why banks trust it enough to support authorizing Apple Pay transactions with Face ID.
* If you have any questions, please post them down in the comments.

