---
layout: post
title: Apple found to be using Multipath TCP networking in iOS 7
---
* <
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/siri-ios-7.jpg)
* It’s been discovered that Apple is using a new networking protocol called Multipath TCP in iOS 7. The technology allows devices like the iPhone and iPad to switch between both cellular and Wi-Fi for data transfer.
* The find is credited to Olivier Bonaventure, a computer science professor at the IP Networking Lab in Belgium, who says this is the first large-scale commercial deployment of Multipath TCP and it has huge implications…
* Christopher Mims of Quartz has a good explanation of the technology:
* “It’s called multi-path TCP, and here’s why it matters and how it works: At present, if your phone or tablet is connected to Wi-Fi and a cellular network at the same time, it can only use one or the other connection to transmit data. But what if your Wi-Fi connection or your 3G connection drops? Whatever data was being transmitted—data for an app, a webpage, an iMessage—will fail to arrive, and you have to try again, usually after getting a frustrating error message or a blank page.”
* With Multipath, a device like the iPhone would be able to intelligently switch between an active Wi-Fi and cellular connection to avoid disruption of data transfers. This would be based on connection speed, reliability, etc.
* Olivier explains that he made the discovery while using an iPad running iOS 7. He was able to deduce that Multipath TCP was being used to connect to certain compatible Apple servers by actively monitoring its packet traces.
* Screenshot showing the iPad using Multipath TCP
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/siri.png)
* Right now, it appears that Apple is only using this protocol for Siri—which makes sense, given the services complexity. But the implications here are huge. Think iCloud, think iTunes media streaming, think app downloads.

