---
layout: post
title: Relying on Apple for security could be developers' biggest mistake
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/08/apple-security2.jpg)
* When it comes to security, Apple has gone to great lengths to make its iOS platform much less prone to exploits and has engineered measures such as sandboxed environment, protected app space and even encrypting every single file created on the iPhone with its own encryption key wrapped in the user’s passcode.
* But developers have become increasingly reliant on Apple for app security and as a result security has now become an afterthought for many app developers. That’s why security experts attending the Black Hat cybersecurity conference in Las Vegas think developers should take matters in their own hands and add more security above Apple’s baked-in protections…
* In a post over at HartfordBusiness, CNN writer David Goldman quotes a presentation by senior forensic scientist Jonathan Zdziarski which explains that all a hacker needs to do in order to hack all the apps on your phone is to steal your device and discover and exploit an iOS vulnerability before Apple does.
* Zdziarski then outlines one of the possible scenarios.
* A bug in PayPal’s app, for instance, allows a hacker to place malicious code in a stolen iPhone and get all the log-in information that a user enters. It’s unlikely. The hacker would need about 20 minutes with the iPhone to do it before handing the phone back to the owner. But the point is it’s possible – and it shouldn’t be.
* PayPal is “investigating the issue”.
* This is unsettling. I’m using PayPal’s iPhone app on a daily basis, having been unaware that my login information could be easily compromised.
* He also says Apple should enforce password confirmations every time a user returns to an app they’ve previously logged into.
* This is also a valid point. Some apps provide this as an option, but a system-wide solution would have been much better.
* For example, Dropbox’s official iOS client allows you to set in preferences an app lock code which kicks in each time you switch from Dropbox to another app.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/07/Dropbox-for-iOS-iPhone-screenshot-Security-code.png)
* Now, Apple’s platform security team manager Dallas De Atley gave a presentation at the Black Hat cybersecurity conference (Apple attended for the first time).
* His speech, however, was met with a ‘meh’ as it’s mostly the stuff gleaned from Apple’s previously published white paper on iOS security.
* The New York Times wrote that De Atley “had basically done the equivalent of reading aloud a white paper, timed to a PowerPoint deck, before escaping out a side door without answering any questions”.
* Atley’s presentation re-iterated Apple’s approach to iOS security like this:
* “Our attitude is: security is architecture. It has to be built in from the very beginning,” Mr. De Atley said. In building the iPhone, he said, Apple took a bare-bones approach and sought to use the minimum number of components.
* Apple purposefully decided not to ship the phone with a shell, or support remote log-in access. “There’s an entire set of attack vectors we don’t have to fundamentally worry about on iOS,” he said.
* He also outlined a number of sandboxing technologies Apple had in place, noting that Apple’s goal is “to physically isolate and separate processes from each other so that if one has a flaw, it can’t easily wreak havoc on the rest of the system”.
* Some examples of this sandboxing:
* As examples, he noted that all third-party apps were stored in their own container on users’ devices. User data is kept partitioned from the device’s operating system so that any updates to the system do not affect the user’s personal data.
* He added that every single file created on the iPhone gets its own encryption key and is wrapped in the user’s passcode.
* With conference attendees criticizing Atley’s presentation, Cupertino should probably take a long and hard look at iOS security and impose stricter rules as to how third-party apps handle login credentials.
* I for one would welcome this.
* I just want to be on the safe side knowing that apps won’t expose my private information by storing login credentials in plain text on the device.
* Oh yeah, it’s a real issue.
* Thoughts?

