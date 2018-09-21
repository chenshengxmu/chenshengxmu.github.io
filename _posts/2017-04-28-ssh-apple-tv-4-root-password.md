---
layout: post
title: How to SSH into your jailbroken Apple TV 4 or 4K and change your root password
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/07/electratv-open-ssh.png)
* With several Apple TV jailbreaks in use by our readership, it’s important to remember that with them comes both the power and risk of running SSH connections to your device.
* Once jailbroken, you may want to tinker around with the device, grab your apticket off of it, copy files to and from it, or investigate the filesystem. To do this you’ll need to connect to it from another device via SSH. In this guide we’ll take you through how to do just that, as well as how to protect yourself by changing the default passwords.
* If you aren’t jailbroken yet you can use our guides to get up and running.
* For tvOS 10.0-10.1, use this guide.
* For tvOS 10.2.2-11.1, grab the backr00m.ipa then follow this guide, replacing mentions of ElectraTV with backr00m.
* FOr tvOS 11.2-11.3, use this guide.
* 1) Ensure your Apple TV is in a jailbroken state. This process varies very slightly depending on your jailbreak, but essentially involves launching the jailbreak app from your Apple TV home screen and hitting the Jailbreak button.
* 2) Open up the Settings app on your Apple TV and navigate to the Network section.
* 3) Take note of your IP Address which is displayed on the Network page.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/ssh-libertv-ip-address.png)
* 4) On your computer, launch Terminal from /Applications/Utilities, or via Spotlight. If you have a jailbroken iOS device, you can use a program such as NewTerm 2 (MTerminal on older firmwares).
* 5) At the prompt, type the following command, and hit Enter to connect to your Apple TV via SSH:
* ssh root@YOUR_IP_ADDRESS_HERE
* Replace YOUR_IP_ADDRESS_HERE with the IP address you noted down in Step 3). For example, in my case the command was:
* ssh root@192.168.0.8
* 6) If Terminal asks you to confirm connecting, simply type yes, and hit Enter to continue.
* 7) When prompted for a password, enter the default password which is alpine.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/ssh-libertv.png)
* 8) When the prompt appears reading -bash-3.2#, you are connected via SSH to your Apple TV 4.
* We must now change our default password from alpine to something else! Otherwise, anyone on your network can connect to and control your Apple TV.
* 9) LiberTV 10.0-10.1 users ONLY. Users on other jailbreaks MUST skip this step.
* At the prompt, enter the following command:
* export PATH=/tmp/bin:/tmp/usr/bin:/tmp/usr/local/bin:/tmp/sbin
* To prevent bricking of the device, the liberTV developer has installed all the binaries you may need in a temporary folder rather than in their traditional places on the filesystem. The command above widens our path so that we can invoke them as we normally would. Without it, most commands we try to issue will fail.
* 10) Now that we’re ready, we can change our root and mobile passwords just as we would on a jailbroken iOS device. First, type passwd to change the root password.
* 11) The Terminal prompt will now ask you to enter a new password twice. Pick a strong one and type it in carefully, the letters will not show in Terminal as you type.
* 12) Once you have set a root password, type passwd mobile to change the mobile password too.
* 13) Do the same as before, entering a new mobile password twice to set it.
* Do not lose or forget these passwords!
* That’s all we have to do. When you SSH into your Apple TV in future, follow Steps 1)-6). When it asks for a password, enter the root password which you set in Step 11).
* LiberTV 10.0-10.1 users only should then repeat Step 9) before continuing their SSHing. If you don’t, none of your favourite commands such as ls or scp will be available to you.
* Do not overwrite or delete any of the existing system binaries on the Apple TV whilst tinkering, or you will brick your Apple TV and lose your jailbreak.
* Having having trouble with SSHing into your Apple TV? Do you need any more help with this guide? Let me know in the comments.

