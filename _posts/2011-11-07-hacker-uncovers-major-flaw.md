---
layout: post
title: Hacker Uncovers Serious iOS Security Flaw
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/charlie-miller.jpg)
* If there’s one thing about iOS that even the skeptics can agree on, it’s how much more secure it is than Android. Several security firms have found that Apple’s mobile platform has far less malware than its Google-backed competitor.
* The reason behind this is Apple’s “walled garden” approach it takes with app approvals. Applications are thoroughly screened and must meet certain criteria before they are allowed in the App Store. That hasn’t stopped one hacker extraordinaire from finding a really nasty bug…
* Forbes is reporting that infamous hacker Charlie Miller has found a way to hide malicious code inside an application that is undetectable to App Store screeners. You might recognize Miller from his previous iPhone exploits, and he’s also won several Pwn2Own competitions.
* Forbes explains his latest find:
* “At the SysCan conference in Taiwan next week, Miller plans to present a method that exploits a flaw in Apple’s restrictions on code signing on iOS devices, the security measure that allows only Apple-approved commands to run in an iPhone or iPad’s memory. Using this method—and Miller has already planted a sleeper app in Apple’s App Store to demonstrate the trick—an app can phone home to a remote computer that downloads unapproved commands onto the device and executes them at will, including stealing the user’s photos, reading contacts, making the phone vibrate or play sounds, or otherwise repurposing normal iOS app functions for malicious ends.”
* The sleeper app that the article is referring to is called Instastock. It’s described as a simple list of stock tickers, but it does so much more than that. The app communicates with Miller’s home server, pulling down and executing his custom commands at will. Watch:
* Instastock has since been removed from the App Store. In fact, The Next Web is reporting that Apple has removed Miller from the iOS dev program all together. The hacker responded to the move on Twitter, saying that it “feels a bit heavy handed, I miss Steve.”
* Miller isn’t revealing his bug until his SysCan presentation next week. He wants to give Apple more time to patch the exploit before revealing it to the public — noting that the flaw could reduce the security of the iOS platform to that of Android. Ouch.
* Forbes has reached out to Apple for a comment regarding Miller’s find, but has yet to hear back from them. Hopefully we’ll get word of a fix soon, given how dangerous the issue is. We’re just glad Charlie Miller uses his extraordinary talents for good instead of evil.

