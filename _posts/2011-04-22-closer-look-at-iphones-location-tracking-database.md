---
layout: post
title: Closer Look at iPhone's Location-Tracking Database
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/04/Location-Services-e1303395466168.jpeg)
* A couple days ago, we told you about a discovery made by two researchers concerning location data collection on the iPhone. Apparently, the iPhone logs your GPS coordinates for an unspecified amount of time and saves that data to a system-level consolidated.db file that is then synced over to iTunes upon backup.
* This finding was demonstrated at the Where 2.0 conference by British programmers Pete Warden and Alasdair Allen. They claimed the discovery as their own, when in fact it has actually been a known issue in the security community since last year.
* Alex Levinson works at Rochester Institute of Technology in New York and studies forensic computing. He is also the Lead Engineer for Katana Forensics. Levinson wrote about the very file showcased this week at Where 2.0 months ago in a book titled “iOS Forensic Analysis.”
* (For a more detailed read, check out Mr. Levinson’s article on his personal blog.)
* In his writing, Levinson was very clear that the GPS coordinates stored by the iPhone are not used by Apple for data harvesting purposes,
* “Apple is not harvesting this data from your device. This is data on the device that you as the customer purchased and unless they can show concrete evidence supporting this claim – network traffic analysis of connections to Apple servers — I rebut this claim in full. Through my research in this field and all traffic analysis I have performed, not once have I seen this data traverse a network.”
* Levinson says that this location database has been present since GPS was introduced on the iPhone. It just now got press coverage,
* “This hidden file is nether new nor secret. It’s just moved. Location services have been available to the Apple device for some time. Understand what this file is — log generated by the various radios and sensors located within the device. This file is utilized by several operations on the device that actually is what makes this device pretty “smart.”
* It’s obviously a big deal that the iPhone is discretely storing GPS data without the owner’s knowledge, and the media strongly reacted to the demo shown by Warden and Allen at the Where 2.0 conference.
* The jailbreak community responded almost instantly with a free utility that removes the stored coordinates from the iPhone’s consolidated.db file.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/04/Senator-Al-Franken.jpeg)
* There’s been such an outrage that U.S. senator Al Franken has sent a two page letter to Steve Jobs demanding answers from Apple about how the iPhone handles this location database. In his letter to Mr. Jobs, he says,
* “Anyone who gains access to this single file could likely determine the location of the user’s home, the businesses he frequents, the doctors he visits, the schools his children attend, and the trips he has taken over the past months or even a year.”
* Can anyone see exactly where you’ve been because of this database file? If given physical access to your computer, the answer is sorta.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/04/iPhone-Tracker-Cape-Cod.jpeg)
* You can download a free, lightweight app for the Mac called iPhone Tracker. This app will examine the data from your iPhone’s iTunes backup and show you a rough (and I do mean rough) estimate of where you’ve been with your iPhone.
* iPhone Tracker is meant to be an illustration of this location exploit, so it intentionally skews the data to give a very general GPS estimate.
* Here’s a demo of iPhone Tracker showing a trip from Washington D.C. to New York:
* This location database isn’t necessarily storing GPS data, it’s making a rough estimate based on cell tower triangulation. The coordinates are not exact, and sometimes they can be way off.
* Two questions still remain:
* The first answer is rather simple. The iPhone needs this location database for its Location Services. Apps that tie into location (which is now just about all of them) require this database file. The issue is that this database doesn’t delete location activity that’s no longer needed.
* iDB reader Otto shares some helpful insight,
* “The location database is basically just storing your cell-tower location every few minutes. The Location API then is able to use that data to provide ongoing location information to background applications that request it.
* The problem is really just that the location database doesn’t get cleaned out very often.”
* John Gruber explains his take on the issue,
* “I don’t have a definitive answer, but the best at least somewhat-informed theory I’ve heard is that consolidated.db acts as a cache for location data, and that historical data should be getting culled but isn’t, either due to a bug or, more likely, an oversight. I.e. someone wrote the code to cache location data but never wrote code to cull non-recent entries from the cache, so that a database that’s meant to serve as a cache of your recent location data is instead a persistent log of your location history. I’d wager this gets fixed in the next iOS update.”
![img](http://media.idownloadblog.com/wp-content/uploads/2011/04/iPhone-tracking.jpeg)
* The fact that the database saves older information is most likely the byproduct of a coding mistake on Apple’s part. Location Services need this database’s coordinates to provide effective GPS information, but it doesn’t need to store the info from that trip you took 6 months ago.
* As to whether this whole thing is legal or not, the answer is yes. According to Apple’s privacy policy,
* “Apple and its partners and licensees may transmit, collect, maintain, process and use your location data, including real-time geographic location of your iPhone and location search queries…”
* Sounds pretty clear cut. Apple probably won’t be paying out in court for this database issue, but it’s still something they need to address. They should at least tighten up the database to only store the current, needed information for the iPhone’s Location Services to function properly.
* Apple just released iOS 4.3.2, so they might not push another update out for awhile. It would be a big shocker to not see this location issue addressed in Apple’s next iOS update.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/04/Encrypt-Backup-e1303434080480.png)
* If you’re still wary, there are three ways to ensure that your iPhone does not store this location data.
* In the end, you know it’s an issue when CNN feels the need to post a sensationalist piece about this issue. The fact is that Big Brother is not watching you, and this whole fiasco is most likely just a mistake that can be easily fixed in an iOS update.
* @falseSteveJobs makes a great point,
* “There’s an easy way to disable your iPhone from secretly tracking you. Just keep a firm grip on it at all times.”
* Couldn’t have said it any better myself.
* What do you think about this location database issue? Does it even bother you? Is Apple to blame?
* [Information gathered from CWOB, The Loop, GigaOM, 9to5Mac, MacStories]
