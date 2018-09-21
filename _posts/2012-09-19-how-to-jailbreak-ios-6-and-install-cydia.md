---
layout: post
title: How to jailbreak iOS 6
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/06/iOS-6-icon-cydia.png)
* iOS 6 was just released a while ago, and now we’re going to show you how to jailbreak it.
* First of all, please note that this is a tethered jailbreak, and it only works with A4 devices like the iPhone 4.
* Secondly, since there currently isn’t any jailbreak tool that will install Cydia just yet, we’re going to have to go about installing Cydia using a manual process.
* Still game after all of those asterisks? Then come inside, as we show you how to jailbreak iOS 6 final…
* Step 1: Install iOS 6 on your device. You’ll also need to know the location of the iOS 6 IPSW firmware file. If you’re on a Mac, you can find that in /Library/iTunes/iPhone Software Updates/ if you didn’t download iOS 6 manually, and updated using iTunes. You can also download iOS 6 from our downloads page. After iOS 6 is installed, hook your device up to your computer, and place it into DFU mode.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/iPhone-Software-Updates-e1348092501139.jpg)
* Step 2: Download RedSn0w 0.9.13dev4 from our downloads page.
* Step 3: Run RedSn0w, and click Extras > Select IPSW, then select your iOS 6 firmware file. It should successfully identify your firmware.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Successfully-identified-e1348092466437.jpg)
* Step 4: Click Back, and then click Jailbreak. You should see a dialogue box saying “preparing jailbreak data” followed by a page with several options. Ensure that Install SSH is selected, and click Next.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Install-SSH.jpg)
* Step 5: Your iPhone will now proceed through the jailbreak process. You will receive a message acknowledging that this is a tethered jailbreak.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Tethered.jpg)
* Step 6: Once the jailbreak is completed, and you are back on your Lock screen, place the device back info DFU mode.
* Step 7: Click Back, and then click Just boot. A pineapple logo should appear on your device, indicating a tethered boot. Once this complete’s and you are back on your Lock screen, you may close RedSn0w.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Tethered-boot.jpg)
* Step 1: On your iOS device, go to Settings > Wi-Fi > and click the arrow next to your connected Wi-Fi router. Find your IP address for your Wi-Fi connection. In my example, my IP is 10.0.1.27.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/WiFi-Address.jpg)
* Step 2: On a computer connected to the same Wi-Fi network, open the Terminal app.
* Step 3: In terminal type: ssh root@10.0.1.27 (be sure to change the IP address to match your iOS device’s IP)
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/SSH-connect.jpg)
* Step 4: After a few seconds, it should connect, and prompt you for your iOS device’s password. The password is alpine
* Step 5: Once connected, paste the following into the terminal:
* wget -q -O /tmp/cyinstall.sh http://downloads.kr1sis.net/cyinstall.sh && chmod 755 /tmp/cyinstall.sh && /tmp/cyinstall.sh
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Scrolling-Prompts.jpg)
* Step 6: After a minute or so of scrolling prompts, your iOS device should reboot, and Cydia will be installed. If you get any permission errors on the terminal, just ignore them.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Cydia.jpg)
* That’s it. You now have a jailbroken iOS 6 device running Cydia. That wasn’t so hard, was it?
![img](http://media.idownloadblog.com/wp-content/uploads/2012/09/Cydia-iOS-6.jpg)
* Thanks to kr1sis.net for the Cydia install script.

