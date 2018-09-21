---
layout: post
title: How to rename paired Bluetooth devices on jailbroken iOS
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/rename-bluetooth-devices-jailbreak-header.png)
* Got two identical speakers with the same name? Is the Bluetooth in your car named something helpful like 02:08:B6:79:FC? Stock iOS does not permit renaming Bluetooth accessories (with the exception of first-party accessories such as AirPods), but with a jailbreak, the sky’s the limit. We’ll show you how to restore some order to the paired Bluetooth devices on your jailbroken iOS device.
* On jailbroken iOS 9 and earlier, a tweak called Bluetooth Devices Renamer can do this job for you, and I would recommend it as simpler. However, on iOS 10 and later it doesn’t work, so this guide is your only hope. The method detailed here works all the way up to iOS 11.1.2, and will continue to work on the upcoming release of Electra for iOS 11.3.1.
* 1) If you don’t already have it, download Filza File Manager from Cydia.
* 2) In Filza’s settings, select Advanced options, and make sure Show application name is set to Yes.
* 3) Open up Filza, and navigate to the following file path:
* /var/containers/Shared/SystemGroup/
* 4) Inside this folder, locate systemgroup.com.apple.bluetooth, as shown on the left below.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/rename-bluetooth-devices-jailbreak.png)
* 5) Inside there, select Library, then Preferences, and you should find a file called com.apple.MobileBluetooth.devices.plist, as shown on the right above.
* 6) Select that file to open it. Press the arrow next to the word Root to view all the Bluetooth device information saved in the .plist. Press further arrows to expand individual Bluetooth device information. (Hint: you can ignore all entries with Dictionary[0] next to them). Keep going until you find the entry for one of the Bluetooth devices you want to rename. You’ll be able to identify it by the Name field, which will be the name displayed on your iOS device when connecting to it via Bluetooth. An example is shown on the left below.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/rename-bluetooth-devices-jailbreak-2.png)
* 7) Being careful not to edit any of the other fields, which are important, hit the information “i“ symbol to the right of the Name field. A screen will appear, allowing you to edit the string, as shown on the right above.
* 8) Ignoring the NAME and TYPE fields, tap the text under the VALUE field, and rename it to whatever you like. An example is shown on the left, below. I rename the original field from MB Bluetooth to Mercedes-Benz, for easier recognition. When you’re done editing, press the Save button in the top-right of the screen, as shown on the right, below.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/rename-bluetooth-devices-jailbreak-3.png)
* 9) Repeat the process for all the other Bluetooth devices you wish to rename, saving your changes to the Name/VALUE string each time. Once you’re finished, you must reboot your device to view the changes.
* 10) Once your devices is rebooted, re-jailbreak it if you wish (though this isn’t necessary to view your Bluetooth changes), and open up your Bluetooth settings in the Settings app. You should find the display names of your paired Bluetooth devices have updated. Below you can see before and after screenshots of my own paired devices. The two car names I edited have updated. This process should work for any and all paired third-party Bluetooth accessories. Please note, do not follow this process for first-party devices, such as AirPods, which have a built-in mechanism for renaming.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/rename-bluetooth-devices-jailbreak-4.png)
* And there you have it. No longer will your Bluetooth preferences be populated by identical, unmemorable, gobbledegook device names.
* Having trouble with the guide? Let me know in the comments.
* Have a request, suggestion, or tip for a future article? Let me know at: joe@idownloadblog.com

