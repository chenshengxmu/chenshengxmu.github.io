---
layout: post
title: How to manually fix the Weather app issue after jailbreaking with evasi0n
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/weather-icon.jpg)
* As you may be aware, the initial release of the evasi0n untethered jailbreak broke a few minor features in iOS 6, most visibly the native Weather app on the iPhone and iPod touch. Word from the developers is evasi0n’s exploit corrupted an important plist settings file for System apps like Weather, Siri, and the App Store. Lucky for our tech savvy readers, there’s an easy fix that can replace the broken plist file in minutes. The script we are working with come from pod2g himself…
* While pod2g and Planetbeing have submitted an updated package to Cydia which should fix the issues with the corrupted plist file (as well as fixing a deeper issue that may have caused a noticeably long boot up sequence for some uses), you can fix the Weather issue yourself by copying a script into terminal.
* If you have MobileTerminal installed, you can actually run the script straight from your device itself. Otherwise you can tunnel into your device in iFunBox, or log in through SSH.
* Step 1: Copy the following script from your device’s browser:
* #!/bin/bash chmod -x /usr/libexec/mobile_installation_proxy killall -9 mobile_installation_proxy rm /var/mobile/Library/Caches/com.apple.mobile.installation.plist /var/mobile/Library/Caches/com.apple.LaunchServices-045.csstore launchctl stop com.apple.mobile.installd launchctl start com.apple.mobile.installd
* while [ ! -f /var/mobile/Library/Caches/com.apple.mobile.installation.plist ]; do sleep 1 done while [ ! -f /var/mobile/Library/Caches/com.apple.LaunchServices-045.csstore ]; do sleep 1 done
* sleep 10
* chmod +x /usr/libexec/mobile_installation_proxy sync reboot;
* Step 2: You can’t paste directly into MobileTerminal, so we’ll have to work around this first. Open MobileTerminal, press the information button, and enter the shortcut menu. You will be able to paste the script into a new shortcut. Make sure the script is entered correctly, as the iPhone’s copy tool may miss the beginning or the end of the script.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/paste-script-weather.jpg)
* Step 3: Open MobileTerminal and log in as root. The command is ‘login root’ and the default password is ‘alpine’.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/shortcut-menu-weather-fix.jpg)
* Step 4: Open the shortcut menu on the left hand side of the screen and select the new shortcut you created.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/mobileterminal-weather-fix.jpg)
* Step 5: Set the device aside and let the script do its work. Once the command is finished, it should reboot automatically.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/weather-fixed.jpg)
* After your device reboots, you can open the Weather app to make sure everything is working correctly. This may also fix issues associated with Siri and the App Store, though I haven’t noticed any of the issues on either of my devices. While you’re in MobileTerminal, you should take the opportunity to change your terminal login information.
* Let us know if you have any issues in the comments section below.
* [Pod2g]
* Edit: Added a semicolon to the end of the script to ensure the reboot sequence happens.

