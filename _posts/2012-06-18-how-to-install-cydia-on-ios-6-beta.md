---
layout: post
title: How to install Cydia on iOS 6 beta
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/06/Cydia-iOS-6-Screenshot.jpg)
* Last week a tethered jailbreak was released for iOS 6 running on the iPhone 4, iPhone 3GS, and iPod touch 4th generation. While it was great to have a jailbreak so soon, the jailbreak didn’t include any GUI tools like Cydia, only SSH and afc2 support were added.
* Fortunately, now that we have SSH access, we can transfer and install pretty much anything on our jailbroken iOS 6 devices, including Cydia.
* Check inside for the full video tutorial that shows you how to install Cydia on iOS 6 beta…
* Note: Read this entire tutorial and watch the video in full prior to starting if you are new at this.
* Step 1: Jailbreak, and boot tethered your iOS 6 device. See this iOS 6 jailbreak tutorial for more info.
* Step 2: SSH into your device (you must be on a local WiFi network). I use Coda in my tutorial, but there are tons of other SSH tools available on the Mac. Tools like Putty work well on Windows. SSH username = “root” SSH password = “alpine”.
* Step 3: Execute the following command via SSH (copy and paste): wget -q -O /tmp/cyinstall.sh http://wyndrepo.googlecode.com/files/cyinstall.sh && chmod 755 /tmp/cyinstall.sh && /tmp/cyinstall.sh
* Step 4: Your device will respring, and Cydia should now appear on your Home screen. Open Cydia, and it will begin Preparing Filesystem. It will then respring.
* Step 5: Now you can use Cydia and start installing apps and tweaks via Cydia. Beware that most apps and tweaks have not been updated with iOS 6 in mind, so your mileage may vary as far as compatibility is concerned. Proceed at your own risk.
* Were you able to successfully install Cydia on your iOS 6 device? Tell us your experience in the comment section below.
* Thanks to Andrew Liu for the link to the install script.

