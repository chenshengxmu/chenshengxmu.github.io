---
layout: post
title: How to pick a startup disk for your Mac at boot time
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/08/Apple-logo-black-background-Mac-screenshot-001.png)
* Most people are content with booting their Mac straight into macOS, but certain multi-boot situations warrant choosing a different startup disk. But why would anyone in their right mind have multiple operating systems on their computer, you ask?
* Well, if you like trying out new things out before they’re available to everyone, chances are you keep the latest beta of macOS installed on a separate partition.
* Besides, some people like yours truly prefer to keep a bootable USB thumb drive in a safe place for times when something terribly wrong goes with their Mac.
* There are two ways to choosing a startup disk.
* One involves choosing a boot disk via a System Preferences pane called Startup Disk, which my colleague Jeff recently covered. This tutorial deals with the other method which involves picking a boot disk as your Mac is starting up.
* This tutorial will educate you on choosing a boot disk during the startup process using a feature of macOS called Startup Manager and explain why and when to use Startup Manager over selecting a startup disk in System Preferences.
* Let’s get started.
* A startup disk is a partition of a drive or a volume that contains a usable operating system. Your startup disk doesn’t have to contain macOS.
* For example, your Mac can boot directly into Windows if you’re using Boot Camp. It can also boot into Ubuntu or any other operating system supported by your Mac’s hardware.
* As mentioned before, you can, one, set your computer to automatically use a startup disk using System Preferences, and two, temporarily override this choice at boot time using Startup Manager.
* Startup Manager is a built-in application that you can invoke during the startup process to pick a volume to boot your Mac from.
* To pick a disk to start your Mac from while it’s booting, follow these simple steps for using macOS’ built-in feature called Startup Manager, which can be invoked via a simple keystroke.
* Step 1: Turn on your Mac by pressing the power button, or restart it if it’s already on by choosing Restart in the Apple menu.
* Step 2: Press and hold the Option (⌥) key immediately upon hearing the startup chime and release the key after Startup Manager appears. Startup Manager will scan connected drives and will present drive icons of any volumes it finds, as shown below.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/08/OS-X-Startup-Manager-Mac-screenshot-001.png)
* Step 3: Highlight the volume you want to use by using your mouse or trackpad, or left and right arrow keys.
* Step 4: Double-click or press the Return key to boot your Mac from the volume you just selected. Keep in mind that your Mac can only start up from a disk containing an operating system.
* Tip: You can also attach external hard drives with an operating system: Startup Manager will automatically add bootable volumes as you connect them.
* To tell your Mac to automatically use a specific startup volume each time your restart or turn it on, open the System Preferences application in the Dock and click the Startup Disk pane. You will be presented with various disk icons, as shown in Jeff’s video walkthrough embedded below.
* Now select the system you would like to use to startup your computer and click the Restart button. From this point on, your Mac will always boot into the selected startup disk until you change your choice in System Preferences or temporarily override it through Startup Manager.
* As explained before, choices you make via the Startup Disk pane will stick until you choose another one in System Preferences or temporarily override these defaults at boot time in Startup Manager.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/08/OS-X-Yosemite-System-Preferences-Startup-Disk-Mac-screenshot-001.png)
* Full tutorial: how to choose a startup disk using System Preferences.
* So when should you use Startup Manager over System Preferences?
* Basically, if you want your Mac to boot automatically into Windows 10 every time it’s restarted or turned on, use System Preferences > Startup Disk. Want to boot into Windows, Ubuntu or whatever but just this one time, without changing your default startup disk?
* Use Startup Manager instead.
* If you cannot choose your startup disk in Startup Manager, make sure that it contains a bootable copy of an operating system such as macOS, Windows or Linux.
* Simply formatting a drive or partitioning a disk won’t cut it because Startup Manager looks for partitions and connected drive that contain a usable operating system.
* If you’re interested in creating a dual-boot environment on your Mac, check out these easy to follow tutorial that cover deploying Yosemite and El Capitan on a separate partition and USB flash drive:
* For additional insights, browse our archive of how-to posts, tips and tutorials.
* There are many situations that warrant using Startup Manager. Here are some of the more obvious scenarios that average users might encounter:
* If you’re old-school and your Mac has an optical drive connected to it, you can insert a disc containing an installer for macOS, Linux, Windows or other supported operating system and boot directly into the installer via Startup Manager. A usable operating system can also reside on a FireWire, Thunderbolt or USB external drive. As long as the disk is bootable, it should show up in Startup Manager.
* As mentioned before, you should use Startup Manager to choose a startup disk for a single session as it won’t permanently change your default startup disk selected in System Preferences. Let’s say Yosemite is your default startup disk and you have El Capitan on another partition. You can use Startup Manager at boot time to temporarily override Yosemite and start up your computer straight into El Capitan.
* Sometimes you may be wondering what’s life like on the “other side.”
* In addition to running another operating system alongside macOS using virtualization software such as Parallels Desktop, it’s also possible to boot your Mac directly into a “foreign” operating system via Startup Manager. Typically, I would boot my Mac into Microsoft’s Windows 7 whenever I feel like playing that first-person Windows shooter that everyone’s talking about.
* People who develop software for a living typically have multiple instances of macOS to test their apps in multiple environments in order to ensure they run without a hiccup. In addition, many bloggers, journalists and power typically keep macOS betas separate from stable macOS releases. Startup Manager makes it ridiculously easy to choose between them at boot time.
* Has your Mac been acting up lately?
* An improper shutdown, forced restart or power interruption can lead to file system errors that may prevent your computer from starting up. Choosing a different boot device is typically the first step in resolving common startup issues. And to be 100 percent on the safe side, I have another copy of macOS installed on a USB drive should something go terribly wrong with my Mac and I’m in the middle of doing my work.
* Your Mac can start up in a number of different ways, including the following methods that our tutorials provide step-by-step instructions for:
* We will be covering more ways to start up your Mac in future tutorials.
* If you like this tutorial, please consider bookmarking and passing it along to your friends and other Mac support folks.
* Have a cool proposal for a great how-to?
* Why don’t you submit your ideas to tips@iDownloadBlog.com? We promise to pick best submissions and take them into account in our future coverage planning

