---
layout: post
title: How to disable the startup tone on your Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/Disable-OS-X-Start-Up-Tone.png)
* Whenever you turn on your Mac, you typically hear a startup tone just before your computer boots up. The tone is there to let you know your computer has passed a pre-boot test and its hardware is working properly.
* Some people, however, prefer to boot up their computers in silence. If you’re one of those people, we’ll show you in this tutorial how you can disable the start-up tone on your Mac.
* The startup tone can be disabled one of two ways: permanently or temporarily. In most cases, the temporary way is the best way.
* To disable the startup tone temporarily, simply keep your Mac’s sound muted with the mute key above the 0 key on your keyboard. When you do this, your Mac’s volume will be silenced and this means the startup tone will also be silenced (at least until you un-mute your Mac’s volume).
* The permanent way of varies depending on the version of OS X you’re using.
* If you’re on a version of OS X before OS X Yosemite, the trick is to use some good-old-fashioned Terminal wizardry. Here are the steps to make it a permanent change on a version of OS X before Yosemite without having to adjust your volume level:
* 1) Launch the Terminal app on your Mac.
* 2) Type the following command:
* sudo nvram SystemAudioVolume=%80
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/Terminal-Mute-Startup-Tone-Mac.png)
* 3) Press the Return key on your keyboard.
* 4) Enter your admin password and press the Return key on your keyboard.
* Now when you restart your computer, your settings should be observable.
* Note: Depending on your Mac model, the command above may not have worked. If it didn’t, try repeating steps 1-4, except with the command below instead:
* sudo nvram SystemAudioVolume=%01
* Unfortunately on OS X Yosemite and later, Apple has made it a real pain to disable the start-up tone. Using the nvram command in Terminal no longer produces the expected results. You will need third-party software to make this work, and one good option out there is a small application dubbed Auto Mute.
* To use Auto Mute to disable the startup tone on your post-OS X Yosemite Mac, follow these steps:
* 1) Download and install Auto Mute on your Mac.
* 2) Open Auto Mute and then go to the Menu Bar, click on the icon, and open the Preferences… option.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/Auto-Mute-Preferences.png)
* 3) In the window that appears, make sure the first two options are enabled.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/Auto-Mute-Run-in-Background.png)
* And now the app will make sure to automatically mute your Mac right before you log out or shut down, which will keep the startup tone from being heard automatically without having to manually adjust your volume each time.
* Although this doesn’t technically “disable” the startup tone, it does mask it by muting your computer’s volume automatically just before the next time it starts back up, so it works just as well. You can always adjust the volume manually after boot-up if you need your volume for music, videos, or anything else.
* Because the startup tone is an important part of booting up your Mac because it tells you everything is working properly, it’s not really recommended you perform this action unless you don’t have any other choice. Nevertheless, now you know how it can be done.
* Also read:

