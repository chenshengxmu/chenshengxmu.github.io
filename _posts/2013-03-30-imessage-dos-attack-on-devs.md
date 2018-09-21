---
layout: post
title: Chpwn and other developers hit with iMessage DoS attack
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/03/imessage-spam.jpg)
* Over the past few days, several well-known iOS and jailbreak developers have reported that they’ve been hit with an iMessage DoS, or denial of service, attack. The attacks feature a series of spam messages that end up crashing the iMessage app.
* The list of affected developers include Sn0wBreeze creator iH8sn0w, Zephyr creator Chpwn, and others. And the perpetrator has been tracked to a Twitter account involved in selling things like provisioned UDIDs and Siri proxy servers…
* The Next Web‘s Matthew Panzarino explains:
* “The messages, likely transmitted via the OS X Messages app using a simple AppleScript, rapidly fill up the Messages app on iOS or the Mac with text, forcing a user to constantly clear both notifications and messages.
* In some instances, the messages can be so large that they completely lock up the Messages app on iOS, constituting a ‘denial of service’ (DoS) attack of sorts, even though in this case they appear to be a prank. Obviously, if the messages are repeated an annoyingly large volume but don’t actually crash the app, they’re still limiting the use you’ll get out of the service. But if a string that’s complex enough to crash the app is sent through, that’s a more serious issue.”
* Apparently, the prankster has created an AppleScript that can quickly send hundreds of iMessages to a single user filled with Unicode and other hard-to-render characters, crashing the app—in some cases for good, as iMessage struggles to load the text.
* iH8sn0w says that the attacker, which started messaging him Wednesday night, claimed to be a part of the hacker group anonymous, but some quick recon debunked that facade. Jailbreak dev Ryan Petrich did some digging of his own, and found this:
* @panzer @chpwn original spam came in from support@is1ri.com before he switched to an anonymous email service
* — Ryan Petrich (@rpetrich) March 30, 2013
* The bigger problem here is that Apple obviously isn’t monitoring its iMessage service for things like spamming, leaving the door open for future attacks. And right now, the only remedy for the issue is to disable the iMessage account that’s affected.
* Panzarino says that he’s contacted Apple with the problem, but has yet to hear back from them. At the very least, he’s hoping that it will add the ability to block a users, or some kind of white list feature, to prevent this from becoming a bigger problem.
* Apple launched iMessages in 2011, alongside iOS 5, for the iPhone, iPad and iPod touch. And in 2012, it rolled it out to Mac OSX. Tim Cook told investors earlier this year that it’s now facilitating the sending and receiving of over 2 billion message per day.
* Image credit: Adam Bell

