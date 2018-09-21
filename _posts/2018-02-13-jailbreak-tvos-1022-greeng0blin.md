---
layout: post
title: How to jailbreak tvOS 10.2.2 with greeng0blin
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/greeng0blin-header.png)
* As we reported recently, nitoTV has released his eponymous tool for various tvOS firmwares. It’s a package manager, much like Cydia is for iOS, but it needs a jailbreak to work. For tvOS 10.2.2, that jailbreak is greeng0blin, and in this guide we’ll show you how to use it.
* Interestingly enough, at the time of writing, tvOS 10.2.2 was still being signed for Apple TV 4, so owners of the device can restore to it if they want, in order to jailbreak with greeng0blin. Check out my article on whether or not that’s a good idea before jumping in though. If you’re decided and on tvOS 10.2.2, read on.
* 1) Head over to the official nitoTV website and download greeng0blin. You don’t need to download the nitoTV installer as it’s bundled inside greeng0blin.
* 2) Connect your Apple TV 4 to your computer via the USB-C port on the back. You’ll need a USB-C cable for this.
* 3) Download Cydia Impactor and launch it on your computer. Your Apple TV should appear in the interface.
* 4) Drag the greeng0blin.ipa onto Impactor, and enter an Apple ID and password.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/greeng0blin-impactor.png)
* 5) The app will now be sideloaded to your Apple TV. Wait for Impactor to complete. As long as the app appears on your Home Screen, you can ignore the non-fatal error which Impactor throws.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/greeng0blin-home-screen.png)
* 6) Launch greeng0blin, and you’ll find the jailbreak option front and centre. Hit jailbreak to begin.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/greeng0blin-jailbreak.png)
* 7) The jailbreak will now attempt to run. Be warned: the KPP bypass it uses is inherently probabilistic and so it may fail several times before succeeding. There is nothing you can do about this, just keep trying. In my experience, it works on average after about 4-6 tries, though it has taken 15+ before, as well as succeeding first time.
* 8) Once you have successfully jailbroken, the output will prompt you to respring Pineboard. Respring. SSH will now be active too, and you must change your passwords.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/greeng0blin-jailbreaking.png)
* 9) Optionally, check out the successfully jailbroken screen after changing your SSH passwords. It looks like this:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/02/greeng0blin-jailbroken.png)
* Note the kernel information and confirmation message: jailbroke yo! If you have troubles with your jailbreak, there is also a button to Reinstall Bootstrap when re-jailbreaking, which will hopefully clear up any issues. Don’t use it unless necessary though.
* 10) You can now turn your attention to nitoTV, which will have been installed to your Home Screen as part of the jailbreak. We’ll be doing a hands-on of nitoTV in an upcoming article, so watch out for that!
* To remove greeng0blin, simply delete the app and reboot your Apple TV 4. For the more technically minded or more thorough, SSH in and run the command specified in the Terminal readout.
* Successfully jailbroken with greeng0blin? Let me know your thoughts below.

