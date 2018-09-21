---
layout: post
title: Mailbox app security fail exposes your contacts, attachments and email messages
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/Mailbox-1.0-for-iOS-iPhone-screenshot-005.jpg)
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/Mailbox-1.0-for-iOS-iPhone-screenshot-001.jpg)
* Orchestra’s Mailbox has quickly become my default iPhone email application. As you know, Mailbox offloads backend email management to the cloud so the thin client running on your device can let you zip through your inbox at a rapid pace while rethinking the workflow with abilities such as snoozing individual messages as if they were reminders and more. So is there anything not to like about Mailbox?
* Apparently there is. According to one app developer, a database Mailbox maintains on your device is unsecured, potentially exposing your contacts, attachments and message contents to anyone who has physical access to your device, using just a simple file transfer tool like iExplorer or DiskAid…
* Writing on his blog, developer Subhransu Behera describes Mailbox as a “security fail.”
* Specifically, he was able to use the iExplorer tool to browse the app’s Document and Library folder on an iPhone and extract contacts, email messages and attachments because “there’s no data protection at all.”
* He explains:
* On top level of the Documents directory there’s a folder called ‘Attachments‘. It consists of all the attachments that I received or sent. Be it a source code of some app, my bank statements or some confidential information. All these files are there unencrypted and unprotected, ready to be stolen if you lose your phone for some reason!
* He then used an SQlite manager tool to extract contacts and additional email details from a database.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/04/Mailbox-security-fail.png)
* “Depending on what you do with your emails, this can be pretty scary,” he observed.
* Being an app developer himself, Behera sums it up by advising fellow developers to take advantage of Apple’s iOS software development kit which provides a set of APIs specifically designed for data protection.
* He claims it’s all about “adding few extra lines of codes” to the Mailbox app in order to increase the security level. There’s no word from Dropbox, which now owns Mailbox, whether or not they will fix this glaring omission in the next Mailbox update.
* If potential security implications are concerning you, just delete your accounts from Mailbox, which will wipe out the underlying data on the device.

