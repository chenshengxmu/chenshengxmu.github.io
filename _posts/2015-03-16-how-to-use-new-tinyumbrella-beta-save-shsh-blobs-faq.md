---
layout: post
title: How to use the new TinyUmbrella beta to save SHSH blobs and prepare for downgrades
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/03/TinyUmbrella-Beta.png)
* In case you missed our post over the weekend, TinyUmbrella, the popular tool associated with downgrading iOS firmware, is back with a brand new beta version. This is a significant new revelation for the jailbreak community that could have some far-reaching consequences when it comes to establishing potential downgrade options and protecting against Apple’s routine of closing firmware signing windows.
* The new TinyUmbrella tool shares a lot in common with its predecessor, but it’s been a long time, and there’s enough differences to warrant a brand new walkthrough and discussion. In this video, I’ll show you how to save your iPhone, iPad, or iPod touch SHSH blobs, I’ll talk about what’s new with TinyUmbrella, and I’ll show you some of the things I’ve learned and encountered thus far.
* Note: You’ll need iTunes installed on your machine to use TinyUmbrella
* Step 1: Go to our downloads page and Download the TinyUmbrella beta for your system. If you’re using a Mac, I recommend using the app only option. Mount the volume, and drag TinyUmbrella.app to your Applications folder.
* Step 2: TinyUmbrella requires Java, so you’ll need to make sure that JRE 8.0 is installed on your machine. You can find the latest Java download here.
* Step 1: Launch TinyUmbrella
* Step 2: Plug your device in and TinyUmbrella should automatically recognize it and begin downloading all of the available SHSH blobs for the firmware currently being signed by Apple.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/03/TinyUmbrella-SHSH-blobs.png)
* You may also force TinyUmbrella to pull in an OTA SHSH blob by clicking the Fetch OTA button.
* Note: TinyUmbrella will try to fetch all signed blobs on each startup, but it will skip blobs that it has already acquired.
* Blobs are saved here: ~/.tu/.shsh
![img](http://media.idownloadblog.com/wp-content/uploads/2015/03/TinyUmbrella-Hidden-Folder.png)
* Unlike previous versions of TinyUmbrella, all SHSH blobs for a single device are stored in one file.
* There are three types of SHSH blobs that you’ll notice in TinyUmbrella beta. They are as follows:
* Each of these blobs are identified by the Type column in the list of blobs. It’s not unusual to see a plethora of OTA blobs.
* If you’re currently on a firmware such as iOS 8.1.2, and you’re wondering why TinyUmbrella isn’t downloading the iOS 8.1.2 blobs, there’s a reason for that. TinyUmbrella can only download blobs for firmware that Apple is currently signing. If you’d like to learn more about Apple’s firmware signing, then I encourage you to learn how to check Apple’s firmware signing window.
* TinyUmbrella keeps a log of all devices that have been connected to your computer while the tool is running. This allows it to ping Apple’s servers and download SHSH blobs without necessitating that a device be connected to your computer. Though this is a handy feature, you may still wish to delete the history for the devices that you’ve connected. To do so, visit the following location:
* ~/.tu/.known_devices
* Not yet. As mentioned in our previous TinyUmbrella post, semaphore seems bullish about the future of iOS downgrading, and it seems that he and perhaps other developers and/or hackers have figured out something that will bring tangible benefits to iOS users. For now, however, just save your SHSH blobs while you can for all of the firmware that you can!
* Admittedly, #tinyumbrella won’t be able to downgrade you yet 🙂 but saving your shshs is relevant again.
* — semaphore (@notcom) March 15, 2015
* If you have any additional questions or comments, please leave us a line down below. What do you think about the new TinyUmbrella?

