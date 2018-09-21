---
layout: post
title: Sunrise Calendar criticized over request for iCloud credentials
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/10/Sunrise-Calendar.jpeg)
* We’re big fans of the Sunrise Calendar app here at iDB. We named it one of our Apps of the Week in October of last year, and it has a permanent spot on our list of Best iPhone apps. It’s a great-looking, full-featured alternative to Apple’s stock Calendar.
* But Sunrise has been taking a lot of heat lately for one of its newer features: iCloud support. You see, in order for you to add your iCloud account, the app requires you to enter your Apple ID and password. And some people see this as a huge security risk…
* A number of folks have shared thoughts on this, but I think Marco Arment has had the best all-around take:
* “Upon first launch, Sunrise invites you to create an account, then asks you to add a calendar. The first option, “iCloud Calendar”, brings you to a screen where the Sunrise app itself, in its native interface and code, solicits your Apple ID (iCloud) email address and password. […]
* Sunrise claims that they’re not storing the credentials and are instead just getting a login token of some sort from iCloud. (It’s unclear whether they’re transmitting your email and password to their servers and getting the login token from there, or doing the exchange from the device.) But that doesn’t matter at all.”
* Marco goes on to note that while this is very dangerous, it’s apparently not against App Store guidelines. So any app could request your Apple ID info, which is essentially the key to your digital life—iCloud, iTunes, remote wipe—and send it off to its servers.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/01/sunrise.png)
* Sunrise has posted a response to the criticism, explaining why the app requires your iCloud details. It does this because the standard Calendar APIs that Apple provides developers with don’t cover some of the more intricate things they want their app to do.
* The good news is, the company says it only sends your Apple ID info once over SSL, and it doesn’t store the data on its servers. The bad news is that a lot of bad things can happen in that transfer, and Sunrise’s track record doesn’t exactly inspire confidence.
* So what does all of this mean? For many of you, not much. But the incident has raised an interesting debate. Should apps be allowed to collect iCloud info? I can’t imagine what would happen if a security breach compromised millions of iTunes accounts.
* What do you think?

