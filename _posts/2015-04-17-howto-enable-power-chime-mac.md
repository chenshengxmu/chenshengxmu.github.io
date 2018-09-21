---
layout: post
title: How to enable iPhones power-charging chime on your Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/03/Twelve-inch-MacBook-Silver-closeup-001.jpg)
* When you plug in your iPhone, iPod touch or iPad into a power outlet, a brief auditory confirmation is played to indicate that a cable is attached and the device is getting power.
* Wouldn’t it be cool if your Mac notebook could this?
* You’re in the luck: enabling the iOS power chime sound effect on the Mac involves executing a simple Terminal command, which enables the effect on any Mac model, even if it’s sleeping or the screen is locked. Proud owners of Apple’s new twelve-inch MacBook needn’t even finish reading this article because their machine came with the power-charging chime enabled by default.
* Thanks to OS X Daily, our favorite source of useful tips and tricks for the Mac, all you’re required to do is launch Terminal in OS X and execute a single command.
* From that point onward, your MacBook, MacBook Pro or MacBook Air will provide an audio feedback when it’s plugged into power. As mentioned before, this auditory confirmation comes in the form of the same power-charging sound you hear after connecting an iPhone, iPod touch or iPad into a power outlet.
* Step 1: Disconnect your Mac from power.
* Step 2: Launch Terminal using Spotlight, or open the application manually (it’s inside your Mac’s Applications folder).
* Step 3: Paste the following line into Terminal and hit Enter:
* defaults write com.apple.PowerChime ChimeOnAllHardware -bool true; open /System/Library/CoreServices/PowerChime.app &
* Step 4: Re-connect your Mac to the MagSafe power source. If the battery needs charging and there’s power, the familiar chime you’re used to hearing on your iOS devices should trigger.
* Just paste the following line into the Terminal window:
* defaults write com.apple.PowerChime ChimeOnAllHardware -bool false;killall PowerChime
* Hit Enter and you’re good.
* The command kills the running process which takes care of playing the chime while disabling the feature through the defaults command string.
* Paste this into the Terminal window and hit Enter:
* afplay /System/Library/CoreServices/PowerChime.app/Contents/Resources/connect_power.aif
* You should head the chime immediately after hitting Enter.
* For those interested in technicalities, the Terminal command described in this article tells OS X to always play the power chime, regardless of the model of your Mac. It also launches the tiny PowerChime application which must be running in the background in order for the power chime to trigger upon connecting the device to power.
* But even this little feature couldn’t have gone without the attention to detail Apple’s always been associated with.
* As OS X Daily explains, if you keep an eye on the battery icon in your Mac’s menu bar, you’ll realize OS X triggers the power chime at the exact same time as the charging bolt appears on the battery icon.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/04/mac-charging-indicator-menu-bar.jpg)
* “Note the battery charging indicator will only display onscreen if there is less than 100 percent power available with the Mac battery and the Mac is either in sleep mode or the screen is locked,” OS X Daily said.
* Again, the new MacBook ships with the power chime enabled out of the box, providing an auditory confirmation that the charging cable is attached to its USB-C port and the computer is charging.
* And for those wondering, “The sound effect will even trigger if the MacBook is sleeping too, though that aspect appears limited to newer hardware with the ability to use PowerNap,” as stated by OS X Daily.
* Signing off, I’ve been pondering why only the new MacBook enables the power chime by default and came to the conclusion it’s because of the USB-C charging cable, which lacks the MagSafe adapter’s handy LED charging indicator.
* If you’ve found this tip useful, sound off in the comments (pun fully intended).
* Source: OS X Daily

