---
layout: post
title: Apple Watch resolutions and other interesting tidbits disclosed in developer tools
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/Apple-Watch-Watchkit-teaser-001.png)
* Apple has left many questions unanswered regarding its upcoming smartwatch following its September unveiling. Representing a brand new form factor for iOS, the fashionable wrist-worn accessory sports a Retina panel which Apple bills as an “incredibly high pixel density” screen laminated to a machined and polished single crystal of sapphire (strengthened Ion-X glass on the Sport collection).
* With today’s release of the official Apple Watch software development kit (SDK), watchful third-party developers have scanned the files in search of interesting tidbits and discovered references to pixel resolutions for both the 38mm and 42mm high Apple Watches, in addition to other previously unknown details worth mentioning.
* The smaller 38-millimeter high Apple Watch will come outfitted with a 272-by-340 pixel resolution screen. The larger 42-millimeter device rocks a 312-by-390 pixel resolution Retina display.
* I wanted to use the above values to calculate the exact pixel density of Apple Watches using the IsThisRetina web tool, but couldn’t because neither Apple nor the developer tools mention the exact Apple Watch screen sizes.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/Apple-Watch-screen-sizes-image-001.jpg)
* Given Apple labeled the smartwatch’s screen as Retina-class, we can pretty much assume that an average human eye wouldn’t be able to discern the individual pixels when staring at the Apple Watch from normal viewing distances (that’s Apple’s unofficial definition of a Retina display).
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/San-Francisco-font.png)
* Other interesting findings:
![img](http://media.idownloadblog.com/wp-content/uploads/2014/11/Apple-Watch-Watchkit-Framework-slide-001.jpg)
* Just a quick though: because the first wave of Watch apps will do all the heavy lifting on an iPhone and stream results and UI back to the Apple Watch, using it may and will affect your iPhone’s battery life.
* And those apps that use dynamic UI animations that get rendered on an iPhone may stop running if your iPhone isn’t present or the wireless connection has been disrupted. This won’t be much of a problem once Apple starts accepting native Watch apps later next year that run directly on the smartwatch hardware.
* On the flip side, because all the processing happens on your iPhone you may not necessarily need to upgrade Apple Watch every year.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/10/Apple-Watch-Messages-Emoji.jpg)
* In term of the guiding principles behind Apple Watch development, I deem the following excerpt from the official documentation the best summary of Apple’s approach to smartwatch user interfaces:
* “A Watch app complements your iOS app, it does not replace it,” reads the document. “If you measure interactions with your iOS app in minutes, you can expect interactions with your Watch app to be measured in seconds. So interactions need to be brief and interfaces need to be simple.”
* You can download the Apple Watch’s San Francisco font right here.
* The official Apple Watch Human Interface Guidelines document is available through Apple’s website for developer resources here.
* And if you’re really feeling like coding today, feel free to take a look at Apple’s official WatchKit Programming Guide.
* More information is available at developer.apple.com/watchkit.
* [AppleInsider]

