---
layout: post
title: Pod2g uncovers major SMS security flaw in iOS
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/08/sms-flaw.jpg)
* Despite the fact that Apple continues to receive praise for the security in iOS, hackers continue to discover vulnerabilities. Just look at all of the exploits that have been used in past jailbreaks.
* Today, Pod2g adds another one to that list with his newly discovered SMS flaw. It has to do with the way the iPhone handles SMS, and could open the doors for text message spoofing…
* From pod2g’s blog post:
* “A SMS text is basically a few bytes of data exchanged between two mobile phones,  with the carrier transporting the information. When the user writes a message, it’s converted to PDU (Protocol Description Unit) by the mobile and passed to the baseband for delivery…
* …In the text payload, a section called UDH (User Data Header) is optional but defines a lot of advanced features not all mobiles are compatible with. One of these options enables the user to change the reply address of the text. If the destination mobile is compatible with it, and if the receiver tries to answer the text, he will not respond to the original number, but to the specified one.”
* He goes on to say that in a safe implementation of this feature, the recipient of a text would see the original phone number and the reply-to one. But on the iPhone, only the reply-to number appears.
* As you can imagine, this could cause all kinds of problems. There are a lot of services that use text messages to verify accounts and account info, and then there’s the whole personal aspect.
* The security expert says that the flaw first appeared in the original iPhone, and still exists in iOS 6 beta 4. He’s pleading with Apple to correct the problem before the final release.
* And they have good reason to. Pod2g also notes in the post that he’s working on a utility that enables you to recreate this problem, without all of the hacking, and plans to release it soon.

