---
layout: post
title: Dreaded Wi-Fi and networking issues are a thing of the past in iOS 9 and El Capitan
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/AirPort-icon-medium.png)
* It’s no secret Mac users are always more or less complaining about various Wi-Fi problems.
* But if Apple’s support forums and the Interwebs are an indication, the level of annoyance with the networking stack in Apple’s desktop and mobile operating systems has seemingly skyrocketed following the release of iOS 8 and OS X Yosemite in the fall of last year.
* Indeed, my MacBook Air running Yosemite drops Wi-Fi connection several times per day and takes about thirty seconds to re-connect to my home Wi-Fi after waking from sleep. Before Yosemite, I would be online literally as soon as I opened the lid.
* Having installed El Capitan on my MacBook Air yesterday along with iOS 9 on my iPad Air, I’m happy to report that the vast majority of Wi-Fi problems plaguing users have become a thing of the past, here’s why.
* Most, if not all of networking issues plaguing Yosemite and iOS 8 users can be pinpointed to Apple’s irrational decision to replace the trusty old mDNSResponder process that has handled networking on Macs for twelve years with a brand new one called discoveryd, which does the same thing.
* Here’s the dreaded discoveryd process as captured in Activity Monitor on Yosemite.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/OS-X-Yosemite-Activity-Monitor-mDNSResponder-screenshot.png)
* Long story short, the Internet is full of horror stories about bugs in discoveryd.
* These issues are nowhere to be found in the old process so after realizing its stupid mistake, Apple has—thankfully—decided to switch back to mDNSResponder beginning with OS X 10.10 beta 4 a few weeks ago.
* Even better, a big part of what makes iOS 9 and El Capitan great is the fact that both operating systems use the old mDNSResponder process which—even though not perfect—is very reliable and far, far less annoying than half-baked discoveryd.
* If you take a closer look at Activity Monitor on El Capitan Developer Preview, as evidenced on the screenshot below, the old mDNSResponder process, not discoveryd, is now loaded by the operating system.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/OS-X-El-Capitan-Activity-Monitor-mDNSResponder-screenshot.png)
* And if you fire up Xcode developers tools and use the Instruments feature, you’ll notice that that discoveryd has been replaced with mDNSResponder on iOS 9 as well. Good riddance!
* That Apple has decided to switch back to using mDNSResponder just a year following didscoveryd’s introduction is an admission of guilt if I ever saw one.
* It’s still baffling to me discoveryd passed quality control.
* I can only imagine that Apple’s software teams must feel ashamed having shipped such an important system feature that’s riddled with bugs, creating all sorts of issues for its users.
* But I’m glad they did the right thing.
* Networking-wise, as many have noted thus far, Yosemite is a nightmare to use.
* That said, I’m super excited El Capitan shows none of the dreaded Wi-Fi issues I used to experience in Yosemite on a daily basis, such as WiFi disconnecting at random times, a network process using 100 percent of the CPU, non-responsive DNS server or invalid DNS configuration, perpetual renaming of network devices (Apple TV becomes Apple TV (2), Apple TV (3) and so forth), to name but a few.
* I’m sure you’ve experienced some of these issues yourself, no?

