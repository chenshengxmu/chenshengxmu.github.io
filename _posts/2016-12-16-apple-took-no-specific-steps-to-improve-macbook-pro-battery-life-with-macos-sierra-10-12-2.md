---
layout: post
title: Apple took no specific steps to improve MacBook Pro battery life with macOS Sierra 10.12.2
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/13-inch-MacBook-Pro-with-Touch-Bar-iFixit-teardown-004.jpg)
* The macOS Sierra 10.12.2 software update, released three days ago, removes your Mac battery’s time remaining indicator but owners of the new MacBook Pro won’t see any improvements to their notebook’s battery life as a result of the update.
* As ArsTechnica noted, the company “told us repeatedly and emphatically that it had taken no specific steps to improve MacBook Pro battery life” with macOS Sierra 10.12.2.
* Now, some people have reported seeing improved battery performance after installing the update on their MacBook Pro, but there’s a reasonable explanation for that.
* Wait, does that mean that reports of new MacBook Pro owners seeing poor battery life of five hours or less are bogus? In a word, no. In a nutshell, users initially saw decreased battery performance because post-install processes put a major strain on the battery.
* The Loop’s Jim Dalrymple was told the same thing by his own Apple sources.
* According to Apple’s own data, the new MacBook Pro’s batteries are performing as intended (the firm rates the new MacBook Pro’s batteries at ten hours of web browsing and iTunes movie playback).
* Like iOS, macOS typically performs resource-intensive tasks following a major software update. Some of those processes can run for hours, if not days, until they complete.
* The battery is affected by things like initial Spotlight indexing, iCloud sync and the Photos app which performs detailed analysis of the user’s photos and videos to recognize faces, objects and scenes on them and populate the Memories tab with automatically created albums and slideshows.
* Battery may be sapped until facial recognition, Memories, image analysis and other initial first-run tasks in Photos have completed.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/macOS-Sierra-desktop-Photos-Memories-image-001.jpg)
* macOS also needs to sync your iCloud Drive, Photo Streams and iCloud Photo Library.
* Because these and other processes can make for a lot of uploading, downloading and CPU usage, battery life in the first day or two may not necessarily be representative of normal battery life once everything has settled down, as Ars notes.
* “This could also help to explain some of those reports that battery life has improved since the 10.12.2 update landed,” wrote the site. “It could be that the update’s installation coincided with the end of those first-time Spotlight and iCloud operations.”
* That’s not saying that the new MacBook Pro’s battery is stronger than its predecessor. As Ars explains, 13 and 15-inch Pros come with a 34 percent and 24 percent reduction in battery capacity, respectively: the 13-incher went from 74.9 WHr to 49.2 WHr and its 15-inch counterpart fell from 99.5 WHr to 76 WHr.
* As for Intel’s Skylake chips in the new Pros, they’re more power efficient but only when your Mac is idling and not running resource-heavy apps such as video editing, having lots of browser tabs open and so forth.
* Skylake chips in new Pros use around the same amount of power as 2015’s Broadwell in previous-generation 13″ Pro and a little bit less than 2013’s Haswell in 15″ Pro.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Screen-Shot-2016-12-16-at-17.52.51.png)
* Intel says Skylake chips are more power-efficient than their predecessors, but it seems that’s only really true when they’re under extremely light load. “The less idle processor time you have, the less Intel’s recent power optimizations can help you,” noted Ars.
* Another problem lies in the fact that 15-inch Pros have power-hungry discrete GPUs which cannot be disabled to conserve power because the machines must be capable of driving two 5K screens at 60Hz at once. Because there’s no integrated-only GPU option, you’re unable to prioritize battery life over external display output.
* As for Touch Bar’s impact on Pro’s battery, it’s relatively minor versus the rest of the system thanks to Apple’s power-efficient T1 chip. Plus, the Touch Bar screen uses power-saving OLED technology (versus the notebook’s LCD-based screen) and switches off when you’re not actively using the computer.
* Other factors are at play here.
* Some of the apps you use may be real battery hogs, for example, especially if they don’t take full advantage of your computer’s hardware and system APIs like anything Adobe, video players like VLC and media center apps like Plex and Kodi. These and many other third-party media players use the CPU, not the GPU, to render Mac-unfriendly video files like MKV, AVI and DIVX.
* This is why Apple’s ten-hour battery life claim assumes browsing the web in Safari and playing movies in iTunes. Safari is optimized for low energy consumption while movies imported in iTunes are re-encoded in Apple-friendly H.264 or MP4 format which the GPU handles very efficiently via hardware acceleration.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/MacBook-Pro-Touch-Bar-image-008.jpg)
* Ars wraps up the article by providing a few power-saving tips.
* Use Safari over Chrome whenever possible as it takes advantage of macOS’s power-friendly technologies. You should reduce screen brightness and close any unused browser tabs and apps, especially items in the Mac’s menu bar and apps which frequently perform a background sync, like Dropbox, One Drive and Outlook.
* Lastly, launch the Activity Monitor app within the Utilities folder inside your Applications folder to identify apps that may be using too much power.
* Energy tab in Activity Monitor can help identify battery hogs. Pro tip: you can check out your battery’s time remaining estimate in Activity Monitor.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Screen-Shot-2016-12-14-at-2.55.54-PM.png)
* An earlier version of Apple’s support document about Mac batteries stated that the battery’s time remaining indicator would update frequently and change depending on screen brightness and system workload.
* The now-removed passage said that some users might see the time remaining “drop significantly” should macOS update the indicator while the user was opening a very large file or starting up an application.
* “It’s important to remember it’s an estimate based on what your computer is doing at the specific time it updates,” read the now-removed part of Apple’s support document.
* All mentions of the battery’s time remaining got removed from the document yesterday.
* Mac notebooks with macOS Mavericks 10.9 or later now display the low battery warning when the battery has approximately ten minutes of power remaining versus earlier macOS versions, which report it at fifteen percent or less, reads the document.
* Aside from a number of big fixes and performance improvements, macOS Sierra 10.12.2 did address graphical glitches that some customers complained about, as per Apple’s software engineering boss Craig Federighi.
* Source: ArsTechnica

