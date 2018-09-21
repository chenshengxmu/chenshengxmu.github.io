---
layout: post
title: IneffectivePower and Unicode Suppressor will protect jailbroken devices from the effective power Messages bug
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/iOS-Messages-Arabic-string-bug-iPhone-screenshot-002.png)
* There is a new bug in iOS that resprings most peoples phones due to a low memory crash. It is caused by iOS’s inability to render certain strings of Arabic characters which overloads the memory, causing resprings and reboots or safe mode on a jailbroken device. Simply explained, when someone messages you those characters and you get a banner notification, your phone starts kicking the bucket.
* A few developers have stepped in and saved the day for jailbreakers. This isn’t the first or second time the jailbreak community receives a security fix quicker than Apple is able to push one to stock devices. It’s a great example of the argument that jailbroken iOS, in the right hands, can be more secure than stock.
* Read more: What’s that Messages bug that crashes your iPhone and how to get around it
* The first one is UnicodeSuppressor by MohammadAG, which was submitted to BigBoss and should drop today or tomorrow. You can install it with iFile with this link if you don’t want to wait for that. He mentions that it’s not a complete fix and it only works in the Messages app since it checks for three characters within the offending message, and blocks it before the crash happens. For those interested in this sort of thing, here is the source code on GitHub. You may also want to check the reddit thread about it.
* Karen Tsai, who is a well-known programmer and maintainer of essential development tools, wrote a more complete solution called IneffectivePower. It tackles the problem at the source of the crash, which has to do with CoreText, so this should be a system-wide fix.
* If anyone experiences problems with it, she would like to know ASAP so she can fix it. She asks that people send her a symbolicated crash log of the crash to angelXwind@angelxwind.net. IneffectivePower can be found on the BigBoss repo.
* Check out the thread on reddit for some more information and see what the community is saying about it.
* It seems like almost every so often there is a new bug affecting iOS or OS X, so it’s really nice to have fixes for them in such a short time. Hopefully it didn’t cause too many people to lose that many friendships.
* What has been your experience with this bug?

