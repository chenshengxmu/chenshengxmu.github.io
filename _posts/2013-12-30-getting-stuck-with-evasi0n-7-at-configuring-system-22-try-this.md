---
layout: post
title: Getting stuck with Evasi0n 7 at Configuring System 2/2? Try this
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/01/evasi0n-troubleshooting-hero.png)
* I’m a bit embarrassed to admit it, but I never got around to posting a Windows jailbreak video tutorial for Evasi0n 7. Usually, I’m on such a tutorial like white on rice, and I take pride in helping our faithful readers through the entire jailbreak process, regardless of their platform of choice. This time, however, things were a bit different.
* Although we were able to post our Mac video tutorial in a short turnaround time, the Windows video tutorial was nowhere to be found. Why? Well, to be frank, it’s because I couldn’t get it working.
* I could start the jailbreak perfectly fine, and I never ran into any error messages, but I just could not for the life of me get past the Configuring System 2/2 step during Evasi0n’s jailbreak process. It’s like everything would just come to a screeching halt as soon as it got to this step.
* As you’ve probably figured out by now, I was finally able to work past this issue. The headline kind of gives it away, but the solution isn’t something I can take credit for at all. The solution is actually thanks, at least in part, to someone very close to Saurik. Check inside for my explanation and video walkthrough showcasing how to jailbreak iOS 7 on Windows.
* How to jailbreak iOS 7 on Windows with Evasi0n 7
* The solution came from Saurik’s right-hand woman Britta. Britta is well-known in the jailbreak community and she helps out with Cydia, managing the JailbreakQA help site, and the official Reddit page for jailbreaking among other things. She’s a ridiculously nice person, and also very intelligent.
* Anyway, while on IRC, she noted that the fix for the Configuring System 2/2 issue may be due to having a slow machine. Initially, I dismissed this notion, but after thinking about it a bit, I began to understand that the explanation was totally feasible. You see, I run Windows in a virtual environment using Parallels and/or VirtualBox. I actually just started using VirtualBox, because I couldn’t get the jailbreak working with Parallels.
* My problems stemmed from the fact that I wasn’t allocating enough system resources to the virtual instances. For example, my Windows 8 instance had a paltry 512MB of RAM available to it, and only 1 CPU. After bumping that up to 2GB of RAM and 4 CPU’s, Evasi0n ran without a hitch. It immediately blazed through the Configuring System 2/2, with no issues. That was my problem. I wasted numerous hours trying to figure out this issue only to find out that the “error” was simply a lack of resources. The race condition required to jailbreak iOS 7 were beyond the scope of the resources given to it.
* So @brittagus’ suggestion of using a faster machine fixed my getting stuck at Configuring System 2/2 issue. Had to bump up my VM specs.
* — Jeff Benjamin (@JeffBenjam) December 31, 2013
* The fact that the “fix” was so simple is a little humbling, and the fact that I couldn’t figure it out myself is even more humbling.
* The moral to this story is that even though you may think you’re good at something, there’s always another solution or another way to do it. Perhaps I would have eventually figured out the issue, but I doubt I would have. No matter how good we think we may be at something, we’re never too good or to big to listen to suggestions or ask for help.
* @starmega5 as I said few mins ago, the solution is to try on a faster computer. A race condition is used at that step, and it requires speed
* — pod2g (@pod2g) December 31, 2013
* Thanks to the entire jailbreak community for making this such a fun ride. I know there has been a lot of controversy and so-called drama over the last few weeks, but it’s time to move forward and remember the reason we got involved with jailbreaking in the first place. It’s the people and the community; it’s the helping hand that so many are willing to give. Thank you.

