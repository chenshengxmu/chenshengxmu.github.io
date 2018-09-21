---
layout: post
title: CoolBooter demo- the dual-boot tool for iOS
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/Screen-Shot-2017-01-11-at-16.19.11.png)
* Developer Jonathan Seals recently released a new piece of work called CoolBooter, an interesting tool which allows some 32-bit devices to dual-boot different iOS firmwares. With a simple reboot it can allow, for example, switching between iOS 6 and iOS 9. Whilst this functionality is commonplace in the desktop computing world, booting multiple operating systems on iOS devices is much rarer.
* Sebastien and I talked briefly about the tool on Let’s Talk Jailbreak 157, and in this article I’ll give some more info, as well as a video demonstration of it in action.
* We are now up to CoolBooter Beta 5, and some additional information is also available. It currently supports the following devices:
* Note that as the techniques used in its working are only available for 32-bit, all of CoolBooter’s supported devices feature this architecture. I would not expect that to change in the near future either. Relevant tools such as Xpwn and kloader, which are probably used by CoolBooter, are likely the reason for this.
* I tried out CoolBooter myself on a test iPhone 5, and it worked like a charm! The device was originally jailbroken on iOS 9.0.2, and can now boot both 9.0.2 and a jailbroken iOS 6.1.4 flawlessly. Seal’s demonstration video shows the basics, but I decided to record the entire process from start to finish during my test.
* The video shows initial installation process, reboot into iOS 6, Cydia installation on secondary OS, demonstration of decreased storage space after installation, and demonstration of secondary OS version in Settings app. I then perform one reboot cycle between the two OSes, to show how the process works after the initial installation.
* You can check out that video below. Please note, the video has been edited to shorten it. The steps take considerably longer in real life:
* A standard warning must apply here, as it does with any tool which makes such low-level changes and is in beta:
* Do not try this on an essential device, or if you are not prepared for things to go wrong. Make a full backup before you begin. The tool is in beta, be prepared for possible bugs.
* I would also recommend you read CoolBooter’s Twitter feed, where relevant information is regularly posted which may affect your use of the tool. There are also some requirements for using the tool, which you can find below:
* As you can see from my video when viewing the “Settings/About” screen, the space on-device has decreased substantially after installation, due to the partitioning of the device into two. Make sure you have enough space for this or the installation may fail. Seals also warns not to enable iCloud backup on the secondary OS.
* The tool should eventually support iOS 7 as the secondary OS as well as iOS 6, however this has been disabled for now. It may return (for iPhone 4 only) in Beta 6, we’ll have to wait and see…
* CoolBooter is a clever tool for legacy devices, and well worth a try if you have a spare device lying around. Whilst I’m not sure what everyday use-cases will necessitate switching between two OSes with reboots, as a technical achievement it is very impressive, and it may give some life to legacy devices which now run too slowly on the latest iOS.
* Have you tried out CoolBooter yet? Which would be your ideal iOS versions to dual-boot, if you could pick any two?

