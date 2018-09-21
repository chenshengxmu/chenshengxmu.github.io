---
layout: post
title: How to SSH into your device from a Mac and change your root password
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/ssh-header.png)
* Sometimes it is necessary to connect to your mobile device from a computer, for troubleshooting purposes or to use a tool which runs from the computer. For example, tihmstar’s Prometheus suite downgrades your device by sending commands to it from the computer on which it, and the files it uses, are stored. The connection used to do this is called SSH, and is normally provided by the OpenSSH package (or an equivalent client such as Dropbear).
* In this guide we will show you how to use SSH to connect to your device from your computer. We will also go through how to change the default passwords on your device, because once you have installed OpenSSH, anyone can log in using the default passwords if you do not change them. This is a major security risk, and so everyone who has OpenSSH installed should follow this procedure.
* Please note, this procedure does not apply to the iOS 10 Yalu jailbreaks. They already include a different SSH client, and installing OpenSSH alongside it will cause issues.
* Installing OpenSSH on devices running iOS 9.3.3 or lower is however completely safe.
* 1) If you do not already have it installed, install OpenSSH onto your device from Cydia. It is found on the Cydia/Telesphoreo repository, and the author is Saurik.
* If you are running any Yalu jailbreak for iOS 10, do not install OpenSSH, as it already includes an SSH client called Dropbear and installing both will cause issues.
* 2) Ensure that both your laptop and device are connected to the same Wi-Fi network.
* 3) On your device, open the Settings app, and go to Wi-Fi.
* 4) Select the blue information icon to the right of the Wi-Fi network you are currently connected to.
* 5) On the information page which comes up, look for the field called IP Address, and note down the value.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/ssh-ip-address.png)
* 6) On your Mac, launch the Terminal application from /Applications/Utilities, or via Spotlight.
* 7) At the prompt, enter the command below. Replace the string of Xs with the IP address you noted in Step 5.
* ssh root@xxx.xxx.x.xx
* 8) Terminal may ask you if you want to trust the host. If it does, type yes, and then press the Enter key.
* 9) It will now ask for the device’s password, to connect to it. This is not your computer password or your device’s lock password.
* 10) Type in the password, and hit Enter.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/ssh-password-prompt.png)
* 11) After entering the password, Terminal’s prompt will change from your computer’s name, to root, which means it is now connected to your device. Any commands you issue after this will affect your device rather than your computer.
* If you have already changed your device’s default passwords and just needed to know how to SSH into your device, you are now done! You can now issue whatever commands you need to your device, such as replacing files, or using tools like Prometheus.
* However, if you have not changed your default passwords yet, and you logged in with the password “alpine”, you should change them NOW by following the remainder of this guide.
* You will only have to do this part once; in future, you can SSH to your device by following only the steps above.
* 1) Follow the instructions above to SSH into your iPhone or iPad.
* 2) Once you are connected to your device, and the command prompt says root, change the root password by typing passwd into Terminal.
* 3) It will ask for a new root password. Type it in carefully, hit Enter, and then type it in again when prompted.
* Do not lose, mistype twice, or forget this password, as you will not be able to change it if you do, and you will not be able to connect to your device via SSH without it.
* Once the password has been entered twice, the root prompt will reappear, meaning the root password has been successfully changed. In future, you must enter that new password at step 9 above when connecting via SSH.
* 4) Now type passwd mobile into Terminal, and press Enter. We will now change the password for mobile user as well as root, to keep the device secure.
* 5) Terminal will again ask you to enter a password twice, this time for mobile instead of root. The passwords can be the same if you like.
* Do not lose, mistype twice, or forget this password, as you will not be able to change it if you do.
* Once you have entered the password twice, the prompt will reappear, meaning the mobile password has also been successfully changed. Your device is now secure from unwanted connections logging in with the default password. In future, you need only follow steps 2-9 of this guide to connect via SSH, and must enter your new root password instead of “alpine”.
* Here is a screenshot of the entire Terminal session, so that you can view the commands:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/ssh-change-passwords.png)
* OpenSSH is a powerful tool, and can often save your device from a restore by letting you make changes to it when the device itself cannot be used, for example when frozen or boot looping. For this reason, it is a good idea to have it installed, so you’re prepared for the worst. If you do install it however, be sure to change the passwords as detailed above, or it becomes more of a security risk than a help.
* Let me know if you have any problems following this guide, and if you have any interesting uses for OpenSSH on your Apple devices. This process will come in handy for some of my upcoming guides as well, such as how to use tihmstar’s futurerestore to upgrade your device to an unsigned firmware, so look out for that too!

