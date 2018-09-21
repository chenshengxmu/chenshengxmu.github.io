---
layout: post
title: Mysterious iOS Location Tracking File Likely Just a Glitch
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/09/Google-Maps-advertising--e1303424653720.png)
* We reported yesterday on the iPhone location tracking bug that has been buzzing around the internet for the last 48 hours. It’s been making headlines from tech sites to blogs of privacy advocate groups, like Epic (Electronic Privacy Information Center).
* For those that haven’t heard: A hidden file in iOS versions 4.0 and above has been found that actually records the user’s location fairly frequently. I’m not talking about Facebook requesting your location, I mean it records your GPS coordinates with a time stamp to a secret file. Was this in the EULA (End-User License Agreement)?
* Actually yes, yes it was. BGR quoted the part of Apple’s iPhone Terms of Service that talks about location-based services in iOS, in an article yesterday. Sure enough, it’s in there:
* “Apple and its partners and licensees may transmit, collect, maintain, process and use your location data, including real-time geographic location of your iPhone, and location search queries…”
* Although many folks are aware of the GPS tracking, they’re still left wondering why the hidden file exists. Why is Apple tracking our locations? Is it for an upcoming feature in iOS 5? Is it for world domination? According to John Gruber, of Daring Fireball, it’s probably just a mistake.
* “The best at least somewhat-informedtheory I’ve heard is that consolidated.db (the secret file everyone is upset about) acts as a cache for location data, and that historical data should be getting culled, but isn’t, either due to a bug or, more likely, an oversight. I.e someone wrote the code to cache location data but never wrote code to cull non-recent entries from the cache, so that a database that’s meant to serve as a cache of your recent location data is instead a persistent log of your location history.”
* Gruber then goes on to say that he suspects this problem will get fixed in the next iOS update. I’m wondering if Apple will make a public statement regarding the file. Surely they’ve got to do something to silence the critics. I’m also not too thrilled about the idea of another firmware update. We haven’t even gotten iOS 4.3.2 completely figured out yet.
* What do you think?

