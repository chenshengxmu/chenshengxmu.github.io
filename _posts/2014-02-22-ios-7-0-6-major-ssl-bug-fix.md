---
layout: post
title: iOS 7.0.6 update patched a major SSL bug, OS X still vulnerable
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/02/ios-7-0-6.jpg)
* When we told you that Apple had released iOS 7.0.6 to the public yesterday, all we really knew about the update was that it fixed an SSL connection verification issue. We didn’t know it at the time, but it turns out that this was actually a major security flaw in iOS 7.
* In a support document, Apple noted that the patch repaired a specific vulnerability that could allow an attacker with a “privileged network position” to capture or modify data protected by SSL/TLS. In other words, iOS was vulnerable to a ‘man-in-the-middle attack.’
* For those unfamiliar with the term, a man-in-the-middle attack is where a malicious program poses as a trusted website to intercept communications or inject malware. It’s capable of stealing sensitive info like usernames, passwords and even credit card numbers.
* Here’s the text from Apple’s support document:
* Data Security
* Available for: iPhone 4 and later, iPod touch (5th generation), iPad 2 and later
* Impact: An attacker with a privileged network position may capture or modify data in sessions protected by SSL/TLS
* Description: Secure Transport failed to validate the authenticity of the connection. This issue was addressed by restoring missing validation steps.
* CVE-ID
* CVE-2014-1266
* Google software engineer Adam Langley breaks it down:
* “Note the two goto fail lines in a row. The first one is correctly bound to the if statement but the second, despite the indentation, isn’t conditional at all. The code will always jump to the end from that second goto, err will contain a successful value because the SHA1 update operation was successful and so the signature verification will never fail.
* This signature verification is checking the signature in a ServerKeyExchange message. This is used in DHE and ECDHE ciphersuites to communicate the ephemeral key for the connection. The server is saying “here’s the ephemeral key and here’s a signature, from my certificate, so you know that it’s from me”. Now, if the link between the ephemeral key and the certificate chain is broken, then everything falls apart. It’s possible to send a correct certificate chain to the client, but sign the handshake with the wrong private key, or not sign it at all! There’s no proof that the server possesses the private key matching the public key in its certificate.
* Since this is in SecureTransport, it affects iOS from some point prior to 7.0.6 (I confirmed on 7.0.4) and also OS X (confirmed on 10.9.1). 
* So how bad is it? Evad3rs hacker pod2g says everyone should update ASAP:
* Yeah, the security of iOS < 7.0.6 is now so bad that I advice everyone to update quick.
* — pod2g (@pod2g) February 22, 2014
* One of the worst day for Apple. Today we know that HTTPS haven’t protected our credentials and privacy for 1 year, maybe more on OSX and iOS — pod2g (@pod2g) February 22, 2014
* People on public wifi networks (Sochi?), please just don’t use your iOS device if it’s not updated to iOS 7.0.6. Don’t use your Mac Book. — pod2g (@pod2g) February 22, 2014
* Langley and others believe that the issue has been resolved in iOS 7.0.6, so you should update as soon as possible—don’t worry, it’s still jailbreakable. But keep in mind that since Apple just discovered this vulnerability, the flaw is exploitable in all current iOS 7.1 betas.
* Also, the bug has not been patched in OS X yet, but Apple has told Reuters that it’s aware of it and is working on a fix.
* Wow, what a strange, major security breach for Apple’s otherwise-secure operating systems. It’s a good thing there are folks looking out for this kind of stuff.

