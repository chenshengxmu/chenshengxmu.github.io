---
layout: post
title: Apple's new T1 chip that drives MacBook Pro's Touch Bar runs “eOS”, a variant of watchOS
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/MacBook-Pro-Touch-Bar-emoji-image-001.jpg)
* If early impressions are an indication, the Touch Bar on the new MacBook Pro is definitely not a gimmick. The time-saving feature lets you accomplish common tasks faster without needing to memorize a bunch of app-specific keyboard shortcuts.
* Instead or remembering a shortcut or wasting time finding it in the menus, you just touch one of the system-wide or app-specific icons that are displayed on the Touch Bar.
* For the hardware geeks among us, the more interesting aspect of the Touch Bar is the Apple-designed silicon behind it, dubbed the T1. As developer Steven Troughton-Smith has discovered, the Touch Bar is actually a mini Apple Watch.
* The T1 chip is apparently code-named “Bridge”.
* It seems to run off of a special watchOS disk image, but it’s not the complete watchOS that’s required to run Apple Watch apps and the full user interface. The chip sends pixel buffers over USB for the display on the OLED touch strip.
* The T1 silicon is a standalone ARM device (Apple’s A-series chips incorporate CPU cores that are also based on ARM technology). The T1’s operating system appears to be called eOS, perhaps a shortened version of “embeddedOS”.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/MacBook-Pro-Touch-Bar-Photos-image-001.jpg)
* This embedded operating system could allow Apple to do exciting things in the future. As Troughton-Smith speculated, certain iOS services like iMessage apps and iOS extensions may be able to take advantage of that chip if Apple allows it:
* Today it might be similar to an Apple Watch in capability, but there’s so much potential for this to grow. The Touch Bar theoretically could run while the rest of the machine is turned off, so you get all the low-power and security benefits of an iOS device, without having to switch to ARM completely on the desktop.
* Perhaps someday it could run a higher class processor, like Apple’s A-series chips, and allow macOS to ‘run’ iOS apps and Extensions, like iMessage apps, or manage notifications, system tasks, networking, during sleep, without having to power up the x86 CPU.
* Apple said at yesterday’s event that the T1 also packs in a Secure Enclave and manages the security of input devices like the built-in Touch ID sensor, the Touch Bar itself and even the front-facing camera.
* Troughton-Smith told The Verge:
* From everything I can piece together, the T1 chip in the new MacBook Pro is a variant of the system-on-a-chip used in the Apple Watch. Running watchOS on the T1 lets the Mac benefit from Apple’s deep work on iOS embedded security, as the T1 gates access to the Touch ID sensor and, from the looks of it, the front-facing camera in the new MacBook Pro too.
* He added that the T1 has no fixed storage, which is why it boots from a 25-megabyte watchOS ramdisk. “Granted, the ‘watchOS’ the T1 runs is presumably only ‘watchOS’ by dint of the CPU it’s designed for,” he said.
* The T1 must be “very similar” to the original Apple Watch’s S1 chip, he added.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/Apple-S1-image-002.jpg)
* iOS hacker @iH8sn0w speculates that the T1 and Touch ID are factory-paired so you can’t replace one without the other—similar to how the Touch ID sensor and the A-series processor in the iPhone are paired together in the factory.
* Theoretically, the T1 may even be able to power the Touch Bar while the Mac’s main processor is off similar to how the M-series motion coprocessors track your movement and device sensors when the main processor is idle or asleep.
* I can’t wait for iFixit to tear this new chip apart and peek under its hood.
* Source: Steven Troughton-Smith via The Verge

