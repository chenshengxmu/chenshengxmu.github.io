---
layout: post
title: Prometheus Guide Part 1- How to set a nonce with nonceEnabler
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/prometheus-guide-header.png)
* This is Part 1 of a two-part guide on how to use Prometheus.
* Before attempting this guide, everyone should read the introductory article, Prometheus Guide: Introduction. This will explain whether the guides apply to you, and if they do, which ones you should follow, as well as making sure that you fulfil the requirements for it to work.
* If you currently have a jailbreak and you want to move to a different firmware with Prometheus’ nonceEnabler method, you must follow Parts 1 & 2 of the guide.
* If you currently have no jailbreak, and you want to move to a different firmware with Prometheus’ nonce collision method, skip Part 1 and do only Part 2 of the guide.
* Before you begin following the instructions, read the entire guide (Parts 1 & 2) through once, and watch tihmstar’s two videos which outline the process visually. This will save time and errors in the long run. Make sure you have all the required files ready before you begin. These are listed in the introductory article. Be prepared to continue directly from Part 1 to Part 2 of the guide. Have both open, and leave enough time to follow them one after each other.
* This guide uses an upgrade from iOS 9.3.3 to iOS 10.2 as an example, but it can be used to move between any firmwares in principle, if and only if you meet the requirements. If you are using this guide to move between different firmwares, simply replace any mention of iOS 10.2 with the destination firmware you want, and mentions of iOS 10.2.1 with a currently signed firmware. Some examples of other possible Prometheus restores would be iOS 10.2 > iOS 10.2, iOS 10.3 b1 > iOS 10.2, and iOS 9.1 > iOS 10.2.
* 0) Ensure your device has a jailbreak with tfp0, and that it is active. If on iOS 9.3.3, that means re-jailbreaking with Luca’s JailbreakMe website. Users on older firmwares must check that their jailbreak has tfp0, and possibly install a patch themselves if it does not.
* 1) Create a folder on your Desktop and name it nonceenabler.
* 2) Download the nonceEnabler tool, and place it into the folder on your desktop.
* 3) Copy the .shsh2 blob for the firmware you want to move to, and paste it into the folder on your desktop too.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-desktop.png)
* 4) Note down the generator from your .shsh2 blob.
* a) If your blob was saved without a specific nonce, the generator can be found inside your blob file:
* To get it, rename your blob from .shsh2 to .plist. Then open your .plist file in a text/plist editor of your choice (I use TextEdit or TextWrangler). Scroll to the very bottom of the file and find the generator field. Copy the generator value, and paste it somewhere safe for later. Afterwards, rename your .plist file back to .shsh2.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-rename-shsh2.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-find-generator.png)
* If your blob has no generator field in it, you may have saved it with a specific nonce, so try Step 4) b).
* b) If your blob was saved with one of the five specific nonces which tihmstar provided on his blog:
* In this case, tihmstar has provided the generators in the description section of his video guide, where you can find them.
* 5) Open the Terminal application from /Applications/Utilities, or via Spotlight.
* 6) Connect your device to your computer.
* 7) SSH into your device by typing:
* ssh root@YOUR_DEVICE_IP_ADDRESS_HERE
* Replace YOUR_DEVICE_IP_ADDRESS_HERE with your iOS device’s IP address.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-ssh.png)
* If you do not know how to SSH into your device, or do not know its IP address, follow my full guide on how to connect to your device using SSH.
* 8) Enter your device’s root password if prompted. By default, the password is alpine, but if you followed my SSH guide linked above you should have changed it, and so should enter your new password instead.
* 9) Once your device is connected via SSH, leave the Terminal window with SSH open and running, and minimise it.
* 10) Open a second Terminal window.
* 11) At the Terminal prompt, type cd, then drag the nonceenabler folder from your desktop onto the Terminal window, and hit Enter.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-cd.png)
* 12) Now type:
* scp nonceEnabler root@YOUR_DEVICE_IP_ADDRESS_HERE:
* Replace YOUR_DEVICE_IP_ADDRESS_HERE with the IP address of your device, which you used to connect to it in Step 6. Please remember the colon at the end of your device’s IP address.
* 13) Terminal should show the nonceEnabler file being transferred to the device.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-scp.png)
* 14) Enter your device’s root password if prompted. By default, the password is alpine, but if you followed the guide linked in Step 6 you should have changed it, and so should enter your new password instead.
* 15) Now return to your open SSH Terminal window, which you minimised in Step 8. The command prompt should read root#.
* 16) At the prompt enter the following command, to run nonceEnabler:
* ./nonceEnabler
* 17) You should now see output as nonceEnabler attempts to patch the kernel. If it does not complete quickly, with only one line of “patching bytes at…”, then it likely has not worked. If many lines of patching appear, try rebooting your device and following Steps 4-15 again until it works. (Remember to re-jailbreak after rebooting if you are on a semi-untethered jailbreak, and use a method with tfp0 enabled).
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-patch-kernel.png)
* 18) Once the output of Step 16 reads “done patching” without having printed too many lines of bytes, and without crashing, proceed to Step 19.
* 19) At the prompt, type:
* nvram com.apple.System.boot-nonce=YOUR_GENERATOR
* Replace YOUR_GENERATOR with the generator from your own .shsh2 file, which you noted down in Step 4.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-set-nonce-nvram.png)
* 20) This should set the generator in nvram so that when we reboot, the device should generate the corresponding nonce. We can then use our saved blob, because the nonce saved in it will match the nonce on the device. To check that the generator is saved correctly in nvram, type the following command at the Terminal prompt:
* nvram -p
* Terminal will print out all the boot commands for your device. Make sure that you can see com.apple.System.boot-nonce in the list, and that it has your generator value set.
* 21) Now type the following command in Terminal:
* nvram auto-boot=false
* You can check this value is set correctly the same way we did in the previous step, with nvram -p. Look for the auto-boot flag to be listed, with the value false.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/nonceenabler-set-auto-boot.png)
* Do NOT close the Terminal windows, restart your iOS device, or disconnect your iOS device after Step 21!
* Continue straight on to Part 2 of the guide and use futurerestore!
* If you don’t want to use futurerestore right now, do NOT stop here! Follow the section below to properly cancel the procedure.
* 1) At the Terminal prompt, type:
* nvram auto-boot=true
* 2) Type:
* nvram -p
* Make sure the auto-boot flag is set back to true, otherwise your device will not reboot back to iOS, it will keep booting back to recovery.
* 3) Type:
* reboot
* This will reboot your device back to iOS as normal. You will have to go through this guide again in future if you wish to use futurerestore with nonceEnabler.
* If you’re currently not jailbroken and you want to move to a different firmware with Prometheus’ nonce collision method, skip Part 1 and go directly to Part 2 of the guide.

