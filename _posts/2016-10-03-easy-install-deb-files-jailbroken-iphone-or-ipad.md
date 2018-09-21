---
layout: post
title: The quick and easy way to install .deb files on your jailbroken iPhone or iPad
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/DEB-File-Icon.png)
* When you jailbreak your device, you don’t always have to rely on Cydia to get all your software.
* Sometimes a developer might send you a Debian (.deb) package to install for beta testing, or if you’re talented in the arts of programming, you can make your own .deb packages to install on your device for yourself.
* Some of you may have been accustomed to using the antiquated SSH method for eons now, and there’s nothing wrong with that, but there’s actually an easier way to install .deb files on your devices.
* Veteran jailbreakers are probably already very aware of how to do this, but to benefit everyone who may be newer to jailbreaking, we’ve thrown together a few steps you can follow to make life easier.
* Without even needing to SSH into your device, you can simply use the popular iFile file system browser app from Cydia to install .deb files. This method only takes a few taps on the device itself and is undoubtedly easier to follow, especially for those newer to jailbreaking.
* To install .deb files with iFile, you’ll only need to follow these steps:
* 1) Download and install iFile from Cydia on your jailbroken iPhone or iPad if you don’t already have it; it’s a free download.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/iFile-Installed-Cydia.jpg)
* 2) From your computer, email the .deb file to one of the email accounts present on your jailbroken device.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Deb-File-In-Email.png)
* 3) Now refresh your email on your jailbroken device from the Mail app, and the .deb file will appear as an attachment with the iFile icon on it. Tap on the attachment.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Deb-File-In-iOS-Email.jpg)
* 4) When the iOS share sheet pops up, tap on the Copy to iFile option.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Installing-Deb-File-Copy-to-iFile.png)
* 5) iFile will now launch and attempt to open the .deb file. In the pop-up menu, tap on the Installer button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/iFile-Installer-DEB-File.png)
* iFile will now go through the process of installing the .deb file. This should only take a couple of seconds, but time varies depending on how old your device is due to speed differences in the CPU.
* You will now get one of two outcomes: 1) the installer will finish with the result code 0, or 2) the installer will finish with a result code besides 0.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/iFile-Install-DEB-File-Result-Codes.jpg)
* If you got the result code of 0, then you’re good to go and you can respring or reboot your device to complete the installation of the .deb file. If you got a result code besides 0, then there was a problem with the installation.
* In the case of result code 256 shown above, this just means the .deb file (tweak) depended on another package to be installed and it wasn’t already on our device. By looking at the white text shown above, iFile tells us that we need to install AppList from Cydia, which was a dependency required to run this tweak.
* If you simply go to Cydia and install whatever dependency was declared by the installer and then respring or reboot your device, you’ll be good to go.
* Related:
* Have you ever installed .deb files with iFile before? If not, how did this method work for you? Share in the comments!

