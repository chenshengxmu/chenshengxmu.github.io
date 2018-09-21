---
layout: post
title: Other storage on your iPhone and iPad explained
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/11/iTunes-Other-iPhone-storage-Mac-screenshot-002.png)
* For most users, the ‘Other’ iOS storage category—reported after connecting an iOS device to desktop iTunes—is something of a mystery. ‘Other’ storage starts at one to five percent of total device capacity but can quickly creep in to a few gigabytes.
* This post will unravel the mysteries behind ‘Other’ iOS storage, explain what it’s used for, how iOS manages it and what you can do to decrease it.
* Yes, you can.
* Connect your iOS device to a Mac or Windows PC using a USB cable and launch iTunes. When the device appears in iTunes, click its name at the top and then click Summary in the lefthand column.
* iTunes will scan what’s on the device and display its storage graphically at the bottom of the window. Mouse over the yellow section of the graph to see how much space is taken up by ‘Other’ storage.
* Sadly, iOS won’t let you see how much space is wasted to ‘Other’ storage.
* ‘Other’ iOS storage includes mostly everything that doesn’t fit into the existing categories, as reported by iTunes: Apps, Audio, Books, Documents & Data, Movies, TV Shows, Photos and Podcasts.
* As per Apple, the ‘Other’ iOS storage includes the following items:
* Things like Safari Offline Reading List, files created within apps and app content such as contacts, calendars, SMS and iMessages, emails and their attachments and other items are not part of ‘Other’ storage. Instead, these items are lumped into the ‘Documents & Data’ storage category in iTunes.
* Here is the full list of iOS storage categories and the data each category encompasses, as reported in iTunes:
* By far, the biggest portion of ‘Other’ storage is occupied by various cached files.
* Apple says that iOS creates cached files when you stream or view content like music, videos and photos. “When you stream music or video, that content is stored as cached files on your iOS device,” says the company.
* On iOS devices, most caches are not visible to users in per-app sections in Settings → General →  Storage & iCloud Usage, though some are. For instance, Safari’s Offline Reading List cache can easily be deleted through the Settings app. On the other hand, caches that iOS manages automatically, like streamed audio and video content, are not exposed to end users and cannot be deleted in Settings.
* A quick experiment can easily prove this. Imagine there’s absolutely nothing stored in the stock Videos app on your iPhone. Say you then launch Videos and stream a five-gigabyte movie that was purchased on the iTunes Store.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/PhoneClean-for-OS-X-Mac-screenshot-002.png)
* The reported storage usage for the Videos app in Settings won’t increase at all.
* But if you glance at the amount of free device storage reported in Settings, you’ll notice it has dropped by five gigabytes due to that streamed video being cached automatically by iOS, thereby taking up five gigabytes of ‘Other’ storage.
* Because the amount of device storage wasted on the ‘Other’ category cannot be directly checked out in iOS, less experienced users may be left scratching their head, puzzled as to why their reported free storage isn’t higher.
* iOS was conceived to manage storage automatically. Cached content may live in ‘Other’ storage for as long as system circumstances allow. iOS does flush the caches intelligently, especially if the system runs low on storage.
* ‘Other’ storage on my iPhone 6s, as reported by PhoneClean. Most of it are caches of previously streamed video content.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/PhoneClean-for-OS-X-Mac-screenshot-001.png)
* The other thing to keep in mind are apps. All apps create a residue of temporary files on your device, so they load faster. For example, the stock Camera app and third-party photo editing apps create their own photo caches.
* These temporary files, along with other app items that are marked for the system as safe to delete, are caches inside ‘Other’ storage, too. Even the most mundane things, like a failed iTunes sync, may add up to Other storage by littering the device with temporary files and media junk.
* Purging caches, manually or with a third-party app, won’t delete apps nor will it remove your documents. These items—app data, settings and your documents—are kept in separate databases which aren’t part of system caches.
* That’s because iTunes categorizes cached music, videos and photos as ‘Other’ iOS storage instead of actual audio, videos or photos—that’s why the reported usage for Music, Videos or Audio sections might differ.
* As an illustrative example of this, iTunes reports that the Audio section is taking up 856 megabytes on my iPhone 6s. On the device itself, however, the actual reported storage amount for the Music app is 565 megabytes.
* NOTE: The screenshot below is meant for illustrative purposes and does not reflect the current amount of storage space taken up by music on my device.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/11/iOS-9-Manage-Storage-iPhone-screenshot-002.png)
* The 291-megabyte difference between the 856MB seen in desktop iTunes and 565MB reported by my iPhone is actually caches for the songs I had streamed via Apple Music. Cached media lets the Music app instantly play any previously streamed song, enhancing the experience at the expense of reported free storage.
* People who use iCloud Photo Library with the ‘Optimize iPhone Storage’ option may observe a similar discrepancy in the ‘Photos’ storage section between iTunes and iOS Settings, due to large caches of photos in device-optimized resolution.
* Your mileage may vary, depending on how you consume media on your devices. To view the storage usage on your iOS device, go to Settings → General → Storage & iCloud Usage → Manage Storage under the Storage heading.
* Yes, but not completely.
* You cannot manually purge cached files from ‘Other’ iOS storage. Even though iOS was designed to clear the caches when it needs more space, it doesn’t do this aggressively enough. And sometimes caches aren’t dumped properly either.
* For instance, Kevin Hamm found out that streaming a four-gigabyte iTunes movie will temporarily take up four gigabytes in iOS caches. Should iOS for any reason fail to delete that cached movie, the four gigabytes will get stuck in ‘Other’ storage.
* Making matter worse, neither iTunes nor the iOS Settings app provide necessary controls for users to manually delete all the cruft that has accumulated on their devices.
* RELATED: How to reclaim ‘Other’ iOS storage
* The good news is, specialized third-party applications can clear the caches which are clogging up ‘Other’ iOS storage. Any of these Mac apps should get the job done:
* Some of the aforesaid programs will identify storage-hogging iOS apps so you can then delete and re-install them, which in most cases will remove 100 percent of app-specific junk from your device.
* If you’re jailbroken, do yourself a favor and manage your ‘Other’ iOS storage using iFile or Ryan Petric’s smartly done cache-cleaning tool.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/PhoneExpander-Clear-Temporary-Files-Mac-screenshot-002.png)
* RELATED: 40+ ways to save storage space on iPhone and iPad
* Restoring your device from an iCloud backup can also drastically decrease the size of ‘Other’ storage because iCloud backups have been found to store fewer temporary files and caches than those created by iTunes.
* In some cases, restoring your device from an iTunes backup might bring over caches and temporary files that haven’t been deleted properly. In iTunes’ defense, iOS crash and log files will be transferred to a computer and deleted from an iOS device during the syncing process so there’s that.
* And lastly, restarting a device may prompt iOS to clear some cached content. To restart your device, hold down the power button until a “Slide to power off” message appears, then slide to restart.
* Force-restarting, however, might force iOS to purge more caches. To force-restart your device, press and hold the Sleep/Wake and Home buttons simultaneously until an Apple logo appears.
* We’re eager to learn about your space-saving strategies when it comes to keeping the size of ‘Other’ iOS storage under control so hit us in comments.

