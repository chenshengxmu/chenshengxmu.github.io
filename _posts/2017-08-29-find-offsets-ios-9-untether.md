---
layout: post
title: How to find offsets for tihmstars iOS 9 untether (and how to untether your Home Depot jailbreak)
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/untether-home-depot-cydia.png)
* Want to turn your semi-tethered Home Depot jailbreak on iOS 9.1-9.3.4 into fully untethered? I’ll show you how to find the offsets to do so, and how to be part of finishing up the jailbreak simultaneously.
* 1) First, check the offsets page to make sure your offsets haven’t already been found. You don’t want to waste your time if someone has already looked them up.
* If they’re already there, you can just use them to untether your device. If they’re not, continue with the guide to find them and provide them to the community yourself.
* 2) Ensure your device is in a jailbroken state. Launch Cydia and add the following repositories:
* http://repo.tihmstar.net http://stek29.rocks/cyrepo
* 3) Install the following Cydia packages:
* Do not reboot your device after installing UntetherHomeDepot until you have added support for your device, or it may boot loop. If you don’t add the offsets successfully, simply uninstall the untether before rebooting your device.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/shoff-untether-home-depot-cydia.png)
* 4) Open MTerminal. At the prompt enter the following commands, one at a time:
* cd /usr/bin su
* You will be prompted for your root password here. By default it is alpine, though it is good practice to change it. If you’ve changed the password, enter your own password here.
* Now run:
* ./shoff
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/shoff-untether-home-depot-terminal.png)
* You will now see the output from SHOFF, which finds your offsets for you. Wait until it completes, and check carefully for errors. If there are none, it should have added your offsets to the untether and you should be ready to reboot your device fully untethered.
* 5) Now open a browser and go to:
* http://wall.supplies/offsets/YourDeviceModel-YouriOSVersion
* Customise the URL with your own firmware and model. For example, if you had an iPhone 5 (Global) on iOS 9.3.1, you would go to:
* http://wall.supplies/offsets/iPhone5,2-9.3.1
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/shoff-untether-home-depot-check-offsets.png)
* You should see a list of offsets for your device. Check them against the ones which SHOFF printed out in MTerminal. If they’re the same, you can be reasonably sure that they are right and the untether will work. The last 5 offsets which SHOFF gives you will not be on the wall.supplies page. These are the ones specific to the untether that you have found, and which the community needs!
* 6) Now we just need to test the untether, and contribute our offsets to the project. Make sure your device has a passcode set, and try rebooting it a couple of times. It should boot up already jailbroken, so that Cydia launches fine without re-running the Home Depot app. Try turning the screen off for 10 minutes or so and then waking and unlocking it again. If all those things work then congratulations! You are jailbroken untethered!
* 7) Open up Filza File Manager and navigate to /untether/offsets.json. This is the file containing our offsets. Select offsets.json, copy it, and email or AirDrop it somewhere safe.
* 8) If the offsets definitely work, and they aren’t already in the gist, you should now email the offsets.json file to:
* offsets[at]stek29[dot]rocks
* (Obviously replace the at and the dot with symbols). Stek29 will add your offsets to the list, and will credit you with finding them, so you will have been directly involved in the making of a jailbreak.
* That’s it! Good luck!
* This guide is an elaboration of stek29’s instructions. Thanks to him for SHOFF and collecting the offsets together, to tihmstar for the untether, and to realkjcmember for the Home Depot jailbreak.

