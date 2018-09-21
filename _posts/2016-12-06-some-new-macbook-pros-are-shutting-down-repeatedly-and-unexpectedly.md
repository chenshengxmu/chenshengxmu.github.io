---
layout: post
title: Some new MacBook Pros are shutting down repeatedly and unexpectedly
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/MacBook-Pro-Touch-Bar-Photos-image-001.jpg)
* Some proud owners of the new MacBook Pro with TouchBar are reportedly seeing their notebooks shut down repeatedly and unexpectedly. According to a report from Jeff Porten of TidBits, the problem might be related to external hard drives connected to the notebook through its Thunderbolt 3/USB-C ports.
* Apple declined comment. This is yet another in a series of teething issues that have been plaguing early adopters of the new MacBook Pro. Just a few days ago, for example, some MacBook Pro owners reported an annoying graphics glitching issue.
* After trying a few times, Porten realized he was unable to copy a large number of files from one external USB drive to another without his brand spanking new MacBook Pro shutting down unexpectedly.
* Here’s what he found after analyzing error messages and logs in the Console app:
* In my testing, my system appears to be stable when a single external drive is connected to one Thunderbolt 3 port or when multiple drives are connected to a powered USB hub that plugged into a single port.
* But I eventually get a crash whenever I have multiple drives connected to multiple ports directly on the MacBook Pro. The issue appears to be related to whole drives; most of my drives have multiple partitions, which doesn’t seem to matter.
* A thread of MacRumors’ forums confirms the error messages, with some of the posters claiming that the issue also raises its ugly head when a Time Machine backup kicks in.
* “If your MacBook Pro is experiencing shutdowns when you’re not deliberately copying anything, the culprit might be Time Machine doing background backups to an external USB hard drive,” wrote Porten.
* His Mac did back up to Time Machine without a hiccup in a single-drive setup:
* If you’re using Time Machine, be careful to attach drives only to one port on your MacBook Pro, or turn off Time Machine while you’re using multiple ports. Wireless network copying seems to be unaffected, so Time Machine over a Wi-Fi network should work, but some people reported issues with Ethernet adapters connected to a Thunderbolt 3 port.
* For what it’s worth, other people in the MacRumors’ are having problems with single drives and even individual files. Porten’s had no problems copying from the internal SSD to a single external drive. AppleCare is reportedly unaware of this problem as a general issue.
* In his local Apple store, Porten couldn’t replicate the crashes he saw at home:
* My crashes all came while using backup utilities, which I couldn’t test at the Apple Store. I used the Finder there with my external drives. But even after I managed to get my MacBook Pro replaced by my reseller, the problem persisted on my replacement machine.
* Unless this is a hardware problem that would require a full product replacement, Apple should be able to fix this problem with a future macOS software update. According to the post, the Apple Geniuses speculated that the problem might be related to USB power draw, suggesting that a future firmware update may be needed.
* Are you seeing similar issues on your own MacBook Pro?
* Source: TidBits via The Loop

