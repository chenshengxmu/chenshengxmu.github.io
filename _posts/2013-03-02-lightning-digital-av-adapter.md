---
layout: post
title: Teardown reveals Apple's Lightning Digital AV Adapter contains tiny computer
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/03/digital-av-adapter-1.jpg)
* This is kind of interesting. The folks over at Panic, the Oregon-based software company behind Mac apps like Coda and Transmit, were doing some digging around in Apple’s Lightning Digital AV Adapter, and discovered it contains a tiny computer.
* Now, we know Apple has a penchant for embedding authentication chips and such in its cables, as a way of controlling third party iOS accessories. But this is completely different. The Adapter has a built-in ARM SoC, 256MB of RAM and runs an OS…
* The discovery came about while the Panic team was testing a variety of video out methods for iOS devices, for an upcoming project. When they got to Apple’s Lightning Digital AV Adapter, they noticed that something wasn’t quite right with its output.
* For starters, it wouldn’t broadcast in full 1080p. The old 30-pin adapter did, but for some reason the new Lightning one will only output video at 1600×900. And they also noticed that the outputted video contained MPEG streaming-like display noise.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/03/digital-av-adapter-apart.jpg)
* To solve the mystery, they broke open the adapter, where they found the aforementioned RAM and SoC. And their theory is that it’s being used to make an AirPlay-like connection with devices, meaning video isn’t actually passing through the port.
* “There are a lot of questions. What OS does it boot? @jmreid thinks the adapter copies over a “mini iOS” (!) from the device and boots it in a few seconds every time it’s connected, which would explain the fairly lengthy startup time for video out. Why do this crazy thing at all? All we can figure is that the small number of Lightning pins prevented them from doing raw HDMI period, and the elegance of the adapter trumped the need for traditional video out, so someone had to think seriously out of the box. Or maybe they want get as much functionality out of the iPad as possible to reduce cost and complexity.”
* Exact details of what’s actually going on inside the SoC are still unknown—like what’s being used to encode/decode video. But whatever it is, it seems extremely excessive for video output. I guess at least now we know why these new Digital AV Adapters cost $50.
* What do you make of all of this?
* Top image via iLounge

