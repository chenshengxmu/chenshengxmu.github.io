---
layout: post
title: How to stop the new MacBook Pro from automatically turning on when the lid is open
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/2016-MacBook-Pro-with-Touch-Bar-13-Inch.png)
* Aside from the marquee Touch Bar feature and other hardware advances, the new MacBook Pro introduces a tweaked boot process where the machine automatically starts up when you open its lid or connect it to power. To avoid forcing users to listen to the startup chime every time they open the lid, Apple’s also decided to disable the boot chime on the new notebook by default (you can easily re-enable it).
* But what about the mentioned auto-boot features? Unfortunately, Apple does not provide user-facing switches in System Preferences to control the new boot on power and boot on lid capability. With a little help from Terminal and smart folks over at Pingie, you can manually stop the late-2016 MacBook Pro from automatically powering on when you lift the lid or connect it to a power adapter or an external display.
* Before we get to it, just a brief note: you can boot the late-2016 MacBook Pro either by lifting its lid as we’ve mentioned or pressing the Power/Touch ID button if you’re old-school.
* 1) Go to /Applications/Utilities/ folder and open the Terminal app.
* 2) To disable boot on power and boot on lid, paste or type the following line in the Terminal window, then press Enter to execute the command:
* sudo nvram AutoBoot=%00
* The change will be permanent until you reset your Mac’s NVRAM.
* To switch back to the default auto-boot behavior when you plug the MacBook Pro in or lift its lid, simply reverse the change with the following Terminal command:
* sudo nvram AutoBoot=%03
* In both instances, you may be asked to enter your administrative password.
* Keep in mind that turning boot on power and boot on lid off shall re-enable the classic Mac startup chime, too. The command won’t enable the new auto-boot feature on the twelve-inch MacBook or other Mac models such as the MacBook Air.
* On the new MacBook Pro, the boot chime is disabled by default to avoid playing the sound each and every time the auto-boot feature kicks in.
* RELATED: brief history of the Mac startup chime
* You can easily re-enable the startup sound with the following Terminal command:
* sudo nvram BootAudio=%01
* To get back to silent boot mode, execute the following command to kill the startup chime:
* sudo nvram BootAudio=%00
* Again, your administrative password is needed to execute any “sudo” command.
* For those wondering, it is not possible to patch in a new boot sound.
* TUTORIAL: how to bring back startup chime on late-2016 MacBook Pro
* To disable the startup chime permanently on older Macs, check out this tutorial from Anthony.
* To disable the startup tone temporarily on your Mac, just mute the sound with the mute key. Once the computer is silenced, the startup tone will no longer play until you un-mute the volume.
* Source: Pingie

