---
layout: post
title: Apple wont release a fix for Secure Enclaves exposed decryption key
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Apple-A7-chip-Secure-Enclave-001.jpg)
* Following the exposure of the decryption key protecting the firmware software running on the iPhone 5s’s Secure Enclave coprocessor that was posted on GitHub yesterday, an Apple source has reportedly said that any customer data securely stored in the cryptography coprocessor remains protected and that the company does not intend to roll out a fix at this time.
* The exposure of the key allows security researchers with the expertise in this field to take a closer look at Apple’s secret software that’s running on the cryptographic coprocessor.
* That software powers the Security Enclave’s functions that include verifying passcodes, handling data from the Touch ID fingerprint sensor, determining if there’s a positive fingerprint match, authorizing Apple Pay payment transactions, generating the device’s Unique ID (UID), encrypting and decrypting data as it’s written to and read from the file system and more.
* TechRepublic interviewed the hacker “xerub” who posted the decryption key.
* He explains that decrypting the Secure Enclave firmware could theoretically make it possible to watch the cryptographic coprocessor do its work and perhaps reverse-engineer its process, but warned that “decrypting the firmware itself does not equate to decrypting user data.”
* That’s why an Apple source who wished to remain unidentified told the publication that the key’s exposure doesn’t directly compromise customer data. “There are a lot of layers of security involved in the Secure Enclave and access to the firmware in no way provides access to data protection class information,” said the Apple source.
* The statement may be viewed as a sign of Apple’s confidence that analysis of the Secure Enclave firmware won’t compromise any encryption keys, payment tokens, fingerprint data and other information kept securely in the coprocessor’s own encrypted memory.
* Had Apple felt that the key’s exposure would’ve made Touch ID hacks, password harvesting scams or other attacks possible, it would have surely released a fix as soon as possible.
* To that effect, the unnamed Apple source has cautioned that it’s “not an easy leap to say that the key’s exposure would make getting at customer data possible.”
* The hacker opined that Apple should not have encrypted the Secure Enclave firmware in the first place, just as the company no longer encrypts the iOS kernel as of iOS 10.
* The fact that the Secure Enclave was hidden behind a key worries me. Is Apple not confident enough to push the Secure Enclave firmware decrypted as they did with kernels past iOS 10?
* The fact that the Secure Enclave is a “black box” adds very little, if anything, to security.
* “Obscurity helps security—I’m not denying that,” said the hacker, but added that relying on it for security isn’t a good idea. He posits that exposing the decryption key will add to the security of the Secure Enclave in the long run, noting that was also his intention with releasing the key.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/iPhone-5s-Touch-ID-closeup-002.jpg)
* “Apple’s job is to make the Secure Enclave as secure as possible,” he said. “It’s a continuous process. There’s no actual point at which you can say ‘right now it’s 100 percent secure.’ ”
* The Secure Enclave is walled off from the main processor and the rest of the system.
* Because it uses its own firmware that updates separately and isolates all communication between it and the main processor to an interrupt-driven mailbox and shared memory data buffers, nothing the Secure Enclave does is known to the rest of the device.
* Top image: Secure Enclave (smaller rectangle) embedded in the iPhone 5s’s A7 processor

