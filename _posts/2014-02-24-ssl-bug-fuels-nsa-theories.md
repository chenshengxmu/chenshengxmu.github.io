---
layout: post
title: Timing of SSL bug fuels conspiracy theories about Apple and the NSA
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/02/ios-7-0-6.jpg)
* By now you’ve probably already heard about the SSL bug that was discovered in iOS and OS X. Apple pushed an iOS update out on Friday to fix it, and it didn’t sound like a big deal at the time, but we have since learned that it is an extremely serious security flaw.
* The flaw leaves Apple devices open to what’s called a man-in-the-middle attack, in where a malicious program poses as a trusted website to intercept communications or inject malware. And its existence has fueled conspiracy theories about Apple and the NSA…
![img](http://media.idownloadblog.com/wp-content/uploads/2013/06/prism-slide-5.jpg)
* John Gruber of Daring Fireball pointed to some interesting tweets and posts this weekend, and started connecting the dots between the recently-discovered SSL bug and Apple’s rumored involvement with the NSA. It’s way out there, so please grab your tinfoil hats.
* I have confirmed that the SSL vulnerability was introduced in iOS 6.0. It is not present in 5.1.1 and is in 6.0 /cc @markgurman
* — Jeffrey Grossman (@Jeffrey903) February 22, 2014
* As John points out, iOS 6 was released in late September 2012. Interestingly enough, a slide leaked by Edward Snowden last summer said Apple joined the NSA’s PRISM program right around that time. Coincidence? Maybe. But he goes on to postulate the implications:
* “Sure would be interesting to know who added that spurious line of code to the file. Conspiratorially, one could suppose the NSA planted the bug, through an employee mole, perhaps. Innocuously, the Occam’s Razor explanation would be that this was an inadvertent error on the part of an Apple engineer. […]
* Once the bug was in place, the NSA wouldn’t even have needed to find the bug by manually reading the source code. All they would need are automated tests using spoofed certificates that they run against each new release of every OS. Apple releases iOS, the NSA’s automated spoofed certificate testing finds the vulnerability, and boom, Apple gets “added” to PRISM.”
* Again, all of this is circumstantial and speculative, and Apple has come out numerous times vehemently denying its involvement in any NSA program. But the timing is rather odd, and it makes you wonder how such a serious bug went undiscovered for over a year.
* The Apple SSL bug really is a double facepalm. One might think this was done on purpose 🙂 pic.twitter.com/f9Fy3iD7cy
* — Nikias Bassen (@pimskeks) February 22, 2014
* @DarkMalloc only those who does nothing never do mistakes. This disaster seems like bad luck or sabotage, but not intentional of Apple.
* — pod2g (@pod2g) February 23, 2014
* In the end, the important thing is that the vulnerability has been discovered and patched. If you’re on iOS, you can grab the fix in iOS 7.0.6 here, or download this manual fix if you don’t want to update, and Apple says that it’s currently working on a fix for OS X users.
* So, do you think there’s any truth to this Apple-NSA stuff? Or is it all an empty conspiracy theory?

