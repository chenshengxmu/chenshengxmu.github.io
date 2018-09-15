---
layout: post
title: This is what the content caching service on your Mac is & how to use it
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS-Mojave-content-caching-001.png)
* macOS’s content caching helps reduce Internet data usage and accelerate downloads on your iPhone, iPad, Apple Watch, Mac and Apple TV dramatically. Here’s how to use this cool and useful feature to avoid repeated downloads and reduce bandwidth usage.
* Previously found in macOS Server, content caching is now available in High Sierra and later.
* It reduces bandwidth usage and speeds up downloads on supported devices by storing software updates, apps and other content on your designated Mac computer. The computer keeps a copy of all content that local networked clients download from the Internet.
* Because many people’s Internet connection is much slower than their local network, for them any subsequent clients download cached content much faster. All cached content is available for client devices to retrieve directly from the cache, without going out over the Internet.
* macOS Sierra 10.12 and iOS 10.3 and later support tethered caching.
* With tethered caching, your Mac can share its Internet connection with iOS devices connected via USB whilst caching specific types of content as they are installed on each connected device. Never operating system versions such as macOS High Sierra 10.13, macOS Mojave 10.14 and iOS 11 and iOS 12 all support tethered and untethered caching.
* Untethered caching in High Sierra comes with more specific control and does not require client devices to connect to the host via USB. Basically, it’s an enhanced version of tethered caching with a prettier interface and rocking more features.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/10/save-battery-iOS-11-software-update.jpg)
* Content cache speeds up downloading of iOS software updates on multiple devices
* With caching enabled, any apps, software updates or media you download from the Internet are copied to your computer and cached there so they can be delivered over Wi-Fi to each of the connected iOS devices for installation and consumption.
* You can take advantage of content caching to speed up things like installing large apps and downloading app updates, OS firmware files or media from iTunes and App Stores. Using content caching will save you both time and bandwidth, especially when updating several devices at once vs. each device updating individually over Wi-Fi.
* Untethered content caching is a new feature in macOS High Sierra 10.13 and later.
* Designed to accelerate software downloads and iCloud performance by caching what client devices have already downloaded, this feature can speed up the following operations:
* macOS includes built-in support for caching these content types and apps:
* iOS and tvOS updates downloaded using iTunes for Mac or Windows are never cached—only the software updates for iPhone, iPad and Apple TV delivered over the air are cached.
* Photos, documents and your other iCloud files are received, stored and transmitted encrypted so someone sniffing around your content cache cannot decrypt it.
* Long story short, the content caching feature simply stores local copies of supported downloads on your computer to speed up downloads for any locally-connected clients.
* When set up on your Mac, content caching automatically works for any iPhone, iPad, Mac or Apple TV client devices without having to configure anything, really.
* When a client device downloads cacheable content from the Internet, like an iOS software update or a book from iBooks Store, a copy of the download is stored in a content cache on your Mac for other devices to retrieve without going to the Internet.
* For instance, an iPhone on your network just downloaded an app from App Store.
* The caching service running on your Mac stores a copy of the app. When the next client on the network, like your trusted iPad Pro, attempts to connect to the store and retrieve the same app, it is copied from the cache rather than from App Store itself.
* Setting up untethered content caching requires:
* Host(s):
* If your Mac is running an older macOS version, be sure to upgrade to macOS High Sierra or later in order to take advantage of the content caching features built into the operating system.
* Client(s):
* The host and the clients must be on the same local Wi-Fi network.
* Setting up content caching on a client device is a zero-configuration effort. You just set it up on your Mac and any Apple devices with iOS 7 or later and OS X Mountain Lion 10.8.2 or later automatically discover and contact a nearby content cache without any configuration.
* “You can use caching on networks consisting of a NAT environment for the content cache and all devices, or on networks consisting of publicly routable IP addresses,” says Apple.
* Content caching is unsupported on wireless networks that use non-RFC 1918 addressing locally, as well as on networks that use different non-RFC 1918 addressing publicly.
* More on that in Apple’s support document.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS-Mojave-content-caching-002.png)
* This illustration shows a local network with two subnets sharing a single content cache
* Some content caching features may require different versions of the operating system and stock apps. For guidance, this is what you’ll need for the following content caching features:
* You should also follow Apple’s recommendations for content caching whenever possible:
* It’s important to note that not all content is cached in all regions.
* Most notably, as of December 2013 any iTunes downloads in Brazil, Mexico, China or Portugal are not cached, while iBooks downloads are not cached in Canada.
* If you’re planning on setting up content caching on your Mac primarily for the purpose of speeding up iTunes downloads, be sure that a client’s IP address is associated with your iTunes Store region to avoid not having those downloads cached.
* While content caching can use your Wi-Fi instead of a wired Ethernet connection, performance will be severely affected by multiple client requests at the same time.
* Content caching is affected by two main factors: connectivity and hardware configurations.
* “You get the best performance from your content cache by connecting it to your network using Gigabit Ethernet,” Apple cautions. “The content cache can serve hundreds of clients concurrently, which can saturate a Gigabit Ethernet port. Therefore, in most small to medium scale deployments, the performance bottleneck is usually the bandwidth of your local network.”
* If your Mac is a notebook, it must be connected to power because the content caching feature prevents your computer from going to sleep.
* TUTORIAL: 2 ways to prevent your Mac from going to sleep
* To prevent your Mac from going to sleep, use the “caffeinate” command line utility in Terminal, download a third-party app like Caffeine or tick the box next to “Prevent computer from sleeping automatically when the display is off” in System Preferences → Energy Saver.
* Content caching must be set up on a Mac.
* Have a Mac mini lying around somewhere? Breathe a new lease of life into the machine by connecting it to your local network via Ethernet and setting up a content cache on it.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Mac-mini-teaser-001.jpg)
* The benefits of caching may not become readily apparent if you only have a single iOS device. But if you’re a happy user who happens to own an iPhone alongside an iPad or an Apple TV, save your network bandwidth by setting up content caching on your Mac.
* Here’s how.
* This is how you turn content caching on and off.
* 1) Open System Preferences on your Mac with macOS High Sierra or later.
* 2) Click the icon labeled Sharing.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS-Mojave-System-Preferences-Sharing-selected.jpg)
* 3) Tick the box next to Content Caching in the service list on the lefthand side, then wait for the indicator to turn green before proceeding to the next step.
* Here’s what the indicator lights mean:
* If you’d like to share your Mac’s connection and cached content with iOS devices that are connected to your computer via a USB cable instead of Wi-Fi, tick the box Internet Connection (the first time you connect your iPhone or cellular iPad to your Mac using USB, tap Trust on the phone/tablet to authorize the connection).
* You can use tethered or untethered content caching, with or without Internet sharing.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS_Mojave_System_PReferences_Sharing_Content_Caching_on.jpg)
* 4) Close out the System Preferences window.
* To turn content caching off, just untick Content Caching in the service list on the left.
* Advanced users may want to explore the additional features letting them do things like set the cache size, choose the items they want cached, set up additional content caching options for their network and fine-tune other settings outlined further below.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS-Mojave-System-PReferences-Sharing-Content-Caching-restart-devices.jpg)
* Apple advises restarting all client devices after turning the content cache on, changing cache size or adjusting other features so the clients are able to take advantage of the changes immediately. If you don’t restart your client devices, it may take a while before they automatically identify a new content cache on the network.
* Use the Sharing preference pane to select the items that get cached:
* 1) Open System Preferences on your Mac with macOS High Sierra or later.
* 2) Click the icon labeled Sharing.
* 3) Select the Content Caching checkbox in the service list on the left.
* 4) Click the pop-up menu labeled Cache on the right then choose the content you want cached:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS-Mojave-System-PReferences-Sharing-Content-Caching-iCloud-only.jpg)
* 5) Close out the System Preferences window.
* If you disable iCloud caching, all cached data from iCloud, like your Pages and Numbers documents, is immediately removed from the content cache on the computer.
* Do the following to set the options for cache size:
* 1) Open System Preferences on your Mac with macOS High Sierra or later.
* 2) Click the icon labeled Sharing.
* 3) Select the Content Caching checkbox in the service list on the left.
* 4) Click Options on the right.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS_Mojave_System_PReferences_Sharing_Content_Caching_options_selected.jpg)
* 5) Drag the slider to set the amount of storage your Mac uses for cached content.
* “If your Mac is in an environment where clients download large amounts of a wide variety of content, be sure to set the cache size limit high enough,” Apple cautions. “This prevents the content cache from deleting cached data frequently, which may necessitate downloading the same content multiple times, thereby using more Internet bandwidth.”
* The amount of storage your Mac’s using for cached content is listed next to Storage Used.
* 6) Click OK to use your new cache size or Cancel to abort the operation.
* 7) Close out the System Preferences window.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS-Mojave-System-PReferences-Sharing-Content-Caching-Advanced-options-cache-size.jpg)
* TIP: Open Activity Monitor from your Applications/Utilities folder to see if you’ve allocated enough storage for the content cache and access other statistics.
* If a large number of clients are accessing the content cache simultaneously, performance will suffer significantly. Should that happen to you, increase your content cache size further.
* Clicking Cache in the Activity Monitor window reveals interesting content caching activity and statistics like the amount of data uploaded to and served from the cache, whether caching is working and helping, check that cache has enough space and more.
* To determine if your Mac is the performance bottleneck when a large number of clients are accessing the content cache simultaneously, check the processor usage for the AssetCache process in Activity Monitor. If the CPU usage is constantly at or near the maximum, Apple advises adding additional content caches to distribute the requests across multiple computers.
* By default, the cached content is stored on the boot volume. Thankfully, users are permitted to move their content cache to a custom folder on their Mac or to an external drive:
* 1) Open System Preferences on your Mac with macOS High Sierra or later.
* 2) Click the icon labeled Sharing.
* 3) Select the Content Caching checkbox in the service list on the left.
* 4) Click Options on the right.
* 5) Click the Edit button next to Cache Location.
* 6) Select a storage volume, then click Move.
* 7) Close out the System Preferences window.
* Content caching stops temporarily while the existing cache is moved to the new location.
* This option is unavailable unless you have multiple volumes on your Mac. This option is not for the faint-hearted because a missing folder or disk can easily stall caching forever.
* Pro users can move their cache from the command line.
* To empty your content cache, do the following:
* 1) Open System Preferences on your Mac with macOS High Sierra or later.
* 2) Click the icon labeled Sharing.
* 3) Select the Content Caching checkbox in the service list on the left.
* 4) Click Options on the right.
* 5) Click Reset then click Reset again to verify the request.
* You won’t see this option if the content cache hasn’t been used yet.
* 6) Close out the System Preferences window.
* According to Apple, when the disk space for the cached content reaches the maximum you specified or the available space on the volume runs low, the cache deletes content that hasn’t been used recently to make space for the next request.
* Content caching for business users includes advanced features outside the scope of this step-by-step tutorial (just one example: you’re able to assign parent and children caches to make tiered configuration possible).
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS-Mojave-System-PReferences-Sharing-Content-Caching-Advanced-options-peers.jpg)
* If you own a small company or run a home business, turn that outdated iMac of yours into a caching machine. Your other office locations could then use this iMac as their parent caching service so that updates flow from the main office to each location.
* To get the most out of content caching, peruse Apple’s support documents:
* To adjust advanced caching features like clients, peers and parents, go to System Preferences → Sharing → Content Caching, then hold the Option (⌥) key and click Advanced Options.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/macOS_Mojave_System_PReferences_Sharing_Content_Caching_Advanced_options_selected.jpg)
* And that’s all you need to know about content caching in macOS!
* If you like this how-to, pass it along to your support folks and leave a comment below.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know via help@iDownloadBlog.com and a future tutorial might provide a solution.
* Submit your how-to suggestions via tips@iDownloadBlog.com.

