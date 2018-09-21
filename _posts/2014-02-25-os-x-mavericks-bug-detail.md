---
layout: post
title: OS X Mavericks bug allows security researcher to capture nearly all SSL encrypted traffic
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/10/OS-X-Mavericks-System-Preferences-001.png)
* The nasty SSL bug was found in iOS last week that opens the door to a dangerous man-in-the-middle attack which makes it easy for attackers to intercept communications and steal sensitive info like usernames, passwords and even credit card numbers, by posing as a trusted website.
* Apple quickly squashed the dangerous bug with the release of iOS 7.0.6. If you’re jailbroken, you can patch the SSL exploit without updating to iOS 7.0.6 (here’s how).
* Unfortunately, Apple hasn’t yet issued an urgent OS X fix for the exploit, meaning Mac users are left out in the cold and at risk of having their personal information and passwords hijacked.
* One security researcher from New Zealand has now confirmed that the vulnerability is more dangerous than previously thought: virtually all encrypted traffic to be intercepted, including iCloud data, Keychain enrollment, certificate from apps like Twitter and more…
* Nullcube’s Aldo Cortesi noted in a blog post (via ZDNet) that the exploit allows for full transparent interception of HTTPS traffic on both iOS (prior to 7.0.6) and OS X Mavericks.
* It’s difficult to over-state the seriousness of this issue. With a tool like mitmproxy in the right position, an attacker can intercept, view and modify nearly all sensitive traffic.
* Shockingly enough, “nearly all encrypted traffic can be captured”.
* Not only does this include your usernames and passwords, but also Apple app updates, iCloud data, KeyChain enrollment and updates, data from Calendar application, Find My Mac updates and traffic from apps that use certificate pining, such as Twitter.
* Here’s an example of his capturing of software update traffic.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/02/BhSRBOKCAAAUqWH.png-large.png)
* Apple may choose to deliver a fix as a manual download now that its Software Update mechanism can be transparently subverted.
* And this is intercepting iCloud keychain traffic.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/02/BhSbLXaCUAASqx-.png-large.png)
* Spooky, no?
* He was able to develop a proof-of-concept example in less than 24 hours and will be releasing it to the public, but not before Apple has deployed its patch for OS X.
* “This is a critical issue that could be very valuable in the wrong hands, so I’m sure that others are working on it as we speak,” he said. “It’s also likely that intelligence agencies have been onto this issue for some time,” he added.
* Sure enough, conspiracy theorists have already connected the dots between the SSL bug and Apple’s rumored involvement with the NSA. You can test whether your browser is susceptible to this particular attack by visiting the gofail website, pictured below. Note: the website was down at post time.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/02/7d313279-a138-4f47-8ee2-a27843366b0e-460x276.png)
* The Guardian quotes a former Apple staffer who worked on OS X and explained that it’s “extremely unlikely, at least under normal circumstances” that the flaw was added maliciously, though “someone clever enough” may have been able to subvert normal processes.
* Google’s Chrome security expert Adam Langley wrote:
* This sort of subtle bug deep in the code is a nightmare. I believe that it’s just a mistake and I feel very bad for whomever might have slipped in an editor and created it.
* The exploit stems from a single line of code.
* Apple’s former programmer told the British paper that the company “does not have a strong culture of testing or test-driven development” and opined that “this type of issue should have been found”.
* Again, this is a very serious issue and there’s currently no remedy for it other than disconnecting your machine from the Internet. If that sounds like too much hassle though, the least you can do is to avoid using Safari for the Mac to browse websites that use encrypted SSL traffic, such as PayPal, Gmail, Dropbox and others.
* Better yet, you could temporarily switch to Mozilla’s Firefox, Google’s Chrome or Opera’s excellent browser until a fix has been delivered.
* Folks on older OS versions like OS X 10.8 Mountain Lion or earlier are on the safe side.
* Apple previously said through the mouth of its spokesperson that a fix for the OS X issue will arrive “very soon.” The company is currently putting finishing touches on the upcoming OS X 10.9.2 Mavericks update, but we expect the SSL bug fix to be released as a separate download.
* Are you concerned about this bug?

