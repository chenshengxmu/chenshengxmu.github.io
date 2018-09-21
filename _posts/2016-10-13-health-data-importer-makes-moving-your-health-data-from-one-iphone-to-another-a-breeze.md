---
layout: post
title: How to move your Health data from one iPhone to another
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Health-Data-Importer.jpg)
* When developer Dan Loewenherz got his new iPhone 7 last month, he looked for a way to migrate his old iPhone’s Health data into his new one. He eventually stumbled on a post I wrote about how to export and import your Health data last year, but he was surprised the process wasn’t easier. So he decided to develop his own app. Enters Health Data Importer.
* Every year when I get a new iPhone, I set it up as new. I do a lot of tinkering with my iPhones and I like to have the peace of mind of knowing that I’m starting fresh with every new phone I get. Starting from a clean slate means I don’t get to import any data that would be available in iCloud or iTunes from my old iPhone’s backups. That’s never a problem for me because I backup my photos on my Mac, and everything else can easily be downloaded or set up.
* Long story short, every time I get a new iPhone or simply restore, I have to set it up as new, meaning I don’t get to keep my Health data history. The Health app on your iPhone allows you to export your health data in an .XML file, but the problem is the app doesn’t allow you to import that same .XML file.
* In the past, I used hacky workarounds like this one to export/import my Health data, but this is not really straightforward, and to be completely honest, it’s not even that reliable since all data points can’t be imported.
* Health Data Importer makes the process faster and in a much more reliable way by allowing to import the Health data from one iPhone to another in just a few seconds.
* 1) On your old iPhone, go to your profile and tap the Export Health Data button. This may take a few seconds depending on the amount of data you have generated.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Health-Data-Importer-export.png)
* 2) Once the export file is ready, the Share sheet of your iPhone will pop up, allowing you to share the file in various ways. Select Add To iCloud Drive and select where exactly in iCloud Drive you want to save the file.
* 3) On your new iPhone, launch the Health Data Importer app.
* 4) Tap Import in the upper right corner. This will load up your iCloud Drive.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Health-Data-Importer-import.png)
* 5) Locate and select the export.zip file that you previously exported and placed in iCloud Drive. Health Data Importer will then process the data, and extract it.
* 6)  The app will then show you the various data sources available. In my case, the only data sources available are from my old iPhone 6s, my old Apple Watch, and Clock (not sure what this one is). Select all sources that you deem relevant, and then hit Next.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Health-Data-Importer-data-sources.png)
* Note that I initially selected both my iPhone 6s and Apple Watch, but ended up with duplicate info for my historical step count. It appears that Health Data Importer imports step count from both iPhone and Apple Watch without consolidating that data, which means you end up with more steps than you actually walked. I have reached out to the developer about this issue and he says he will be working on a fix. In the meantime, to fix this, I deleted all data imported from Health Data Importer and imported it again, but this time using only data from my Apple Watch.
* 7) Health Data Importer will now need read and write access to your Health data. At this point, you may choose to allow Health Data Importer to access all available categories, or specific ones. I chose Turn All Categories On. When you’re done selecting the categories, tap Allow in the upper right corner.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Health-Data-Importer-categories.png)
* 8) Health Data Importer will now import all data. As you can see on this screenshot, it is importing over 323,000 data points, which took a few seconds to complete (and got my iPhone running hot).
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Health-Data-Importer-importing-data-samples.png)
* 9) Once the import is completed, you may close the app and return to the Health app. You will see all your old data is there.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Health-Data-Importer-import-completed.png)
* The app description claims that all data can be imported, but in my experience, this is not completely accurate since several categories such as Stand Hours, or Exercise Minutes weren’t imported. The developer tells me Apple blocks third-party apps from writing this data back to the Health app. Still, most data that really counts to me, such as my step count, was imported successfully in a matter of seconds.
* I noted above that I encountered an issue that created duplicate step count, and to fix it, I had to delete the data that had been imported with Health Data Importer. Should you encounter similar problems, here is how you can delete all data imported via the app:
* 1) In the Health app, select the Sources tab at the bottom.
* 2) Select Health Import.
* 3) Scroll down, and tap on Data.
* 4) Finally, tap Delete All data from “Health Import”
* 5) Confirm you want to delete than data, and it will be removed from your device.
* Also read: How to only transfer Activity and Health app data to a new iPhone
* I believe Health Data Importer to be the best way to move your Health data between two iPhones. It is simple, quick, and very reliable, despite missing a few Activity categories. This is obviously not the kind of app you’re going to use everyday, but rather once a year or so. For that reason, some might have a hard time justifying the price tag, but if like me you like to keep your Health data history when you restore or get a new iPhone, Health Data Importer will be a godsend. You can download Health Data Importer from the App Store for $2.99.

