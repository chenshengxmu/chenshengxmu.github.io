---
layout: post
title: How to bring back the classic boot chime on the new MacBook Pro
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/01/Terminal-icon-Yosemite-e1477934082607.png)
* The new MacBook Pro has ditched the iconic boot chime that’s been a signature part of the Mac startup process over the last 17 years. Pingie discovered that the sound is not gone entirely. Apple’s just disabled it and it’s possible to bring it back should you want. In this quick tutorial, we’ll show you how to re-enable the boot chime on your late-2016 MacBook Pro with a simple Terminal command.
* As noted by Pingie, owners of the new MacBook Pro can bring back the Mac startup chime with a simple Terminal command. To re-enable the boot tone, open Terminal from your /Applications/Utilities folder and execute the following command in macOS by pasting the line below into the Terminal window, then press Enter:
* sudo nvram BootAudio=%01
* You may be asked to enter your administrative password.
* If you prefer silent boot mode, execute the following command to kill the startup chime:
* sudo nvram BootAudio=%00
* The Mac startup chime as we know it made its debut on the 1993 iMac G3, but different versions of it have been present on Macs since the Macintosh II. If you want to disable the startup chime permanently on older Macs, check out this tutorial from Anthony.
* RELATED: brief history of the Mac startup chime
* To disable the startup tone temporarily, just mute the sound on your Mac with the mute key on the keyboard. When you do this, its volume will be silenced and this means the startup tone will also be silenced until you un-mute your Mac’s volume.
* Source: Pingie

