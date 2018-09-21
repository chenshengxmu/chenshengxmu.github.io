---
layout: post
title: iOS bug leaves email attachments unencrypted, Apple working on a fix
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/iOS-7-Mail-image-001.png)
* Do you access sensitive document attachments on your iPhone, iPod touch or iPad, stuff like contracts, invoices, bank statements and what not?
* If so, your security and privacy could be compromised because iOS is storing email attachments in the clear – that is, in the unencrypted form – thus making stored attachments easily readable by using a piece of software to browse a person’s on-device email folder for an IMAP account.
* A researcher who claims to have discovered this security flaw has found that iOS 7.0.4 and later – including the latest iOS 7.1.1 – do not encrypt email attachments…
* ZDNet quotes security researcher Andreas Kurtz as claiming that iOS 7, iOS 7.0.4, iOS 7.1 and even the latest iOS 7.1.1 don’t encrypt message attachments, despite this Apple support document stating that iOS provides “an additional layer of protection for your email messages attachments, and third-party applications.”
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/ios-7-security-flaw-email-attachments.png)
* Kurtz was able to confirm the issue by restoring a GSM iPhone 4 to iOS 7.1.1 and testing attachment security for an IMAP email account.
* I shut down the device and accessed the file system using well-known techniques (DFU mode, custom ramdisk, SSH over usbmux). Finally, I mounted the iOS data partition and navigated to the actual email folder. Within this folder, I found all attachments accessible without any encryption/restriction.
* Much to his surprise, he’s found that Apple’s data protection technology in iOS 7 does not extend to email attachments. He’s also verified the existence of the nasty bug on an iPad 2 and and iPhone 5s running iOS 7.0.4.
* Apple is allegedly aware of the issue, according to the researcher, and is working on a fix. The company wouldn’t say when the fix might be ready, but it shouldn’t be long because attachment encryption is crucial for businesses that use iOS devices.
* Are you surprise by this finding?
* And, do you care about message attachment security?

