---
layout: post
title: How to erase and format external disks on your Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/OS-X-El-Capitan-Disk-Utility-icon-full-size.jpg)
* Do you use one or more external disks with your Mac for storing videos, backups, installers, archived projects and other large files, which helps conserve storage space on your startup disk? If so, chances are you’ll need to erase your external disk at some point to wipe it clean, change its format and so forth.
* macOS’s built-in app called Disk Utility lets you erase and reformat internal and externals disks with just a few clicks. You can also adjust the partition format if you intend to share the disk with your Windows-toting friends, access it as an external disk on a Windows computer or use the disk with Windows on your Mac through Boot Camp.
* In this step-by-step tutorial, you’ll learn how to erase and reformat external disks connected to your Mac using macOS’s Disk Utility. We’ll educate you about the partition maps that macOS supports and detail other important options that are at your disposal within Disk Utility.
* 1) Open Disk Utility from the Dock, Launchpad, Spotlight or the Applications/Utilities folder.
* 2) In the sidebar, select the disk or volume you wish to erase.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Disk-Utility-erase-disk-Mac-screenshot-001.jpg)
* Disk Utility lets you erase disks or volumes.
* If you want to erase the entire disk along with any partitions on it, be sure to select your storage device in Disk Utility’s sidebar, not one of its partitions.
* Is there any important difference between erasing a disk and erasing a volume that you should be aware of? Yes, there is. Erasing a disk deletes all its volumes and files. Erasing a volume deletes all the files on that volume, but does not affect other volumes.
* 3) Click the Erase button in the toolbar at the top of the Disk Utility window.
* Keep in mind that you cannot erase the device that contains your startup volume. To do so, start up your Mac from another disk or boot it in Recovery Mode. This special troubleshooting mode not only lets you erase the startup disk, but also access Terminal commands, reinstall macOS and perform other housekeeping tasks.
* 4) Click the Format popup menu, then choose a desired disk format:
* Depending on the type of your disk, some options may not be displayed here.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Disk-Utility-erase-disk-Mac-screenshot-002.jpg)
* If the disk is intended to be used exclusively with macOS, choose either the Extended or Journaled option. Doing so will protect the integrity of the hierarchical file system by leveraging macOS’s Journaled HFS Plus file format.
* Formatting the disk using one of the PC formats is perfect for macOS/Windows compatibility.
* NOTE: For MS-DOS and ExFAT partitions, the disk name must be eleven characters or less due to legacy limitations of Microsoft’s file system.
* Selecting encryption will prompt you to choose a password.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Disk-Utility-erase-disk-Mac-screenshot-009.jpg)
* Be sure to write down the password and keep it safe: the disk’s encryption password must be entered every time you connect it to the computer. Forgetting the password means you won’t be able to decrypt and access data on your disk.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Sierra-Finder-Eject-disk-Mac-screenshot-010.jpg)
* To change the disk’s encryption password, click it in Disk Utility’s sidebar and select Change Password from the File menu. To turn off encryption, Option-click the disk on the desktop and select “Decrypt [disk name]” from the popup menu.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Sierra-Finder-Eject-disk-Mac-screenshot-013.jpg)
* If you’d like to encrypt the disk without erasing it, turn on Apple’s FileVault encryption feature in the Security & Privacy pane of System Preferences or Control-click the disk in the Finder and select “Encrypt [disk name]” from the popup menu.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Sierra-System-Preferences-FileVault-Mac-screenshot-001.jpg)
* 5) You can now type a new name for your disk next to Name.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Disk-Utility-erase-disk-Mac-screenshot-005.jpg)
* 6) If you’re erasing the whole disk rather than one of its partitions, click the Scheme popup menu and choose a desired partition scheme.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Disk-Utility-erase-disk-Mac-screenshot-004.jpg)
* The following partition schemes are at your disposal:
* 7) To prevent the erased files from being recovered, you can optionally click Security Options, then use the slider to select how many times Disk Utility should write over the erased data.
* Secure erase options are unavailable for flash drives because Apple recommends turning on the more secure FileVault disk encryption when you start using an external SSD drive.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Disk-Utility-erase-disk-Mac-screenshot-003.jpg)
* The Fastest option does not securely erase the files on the disk, meaning a disk-recovery app may be able to recover them. The next option writes a pass of random data and then a single pass of zeros over the entire disk while erasing all information used to access your files.
* The last two options write over the data three times, which meets the U.S. Department of Energy standard for securely erasing magnetic media, or as many as seven times to meet the U.S. Department of Defense 5220-22-M standard for securely erasing magnetic media.
* 8) Click the Erase button to have Disk Utility begin formatting your disk.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Disk-Utility-erase-disk-Mac-screenshot-006.jpg)
* You’ll notice that the disk icon disappears from the desktop. Don’t worry, it will re-appear in the Finder and elsewhere in the system as soon as Disk Utility finishes formatting it.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Disk-Utility-erase-disk-Mac-screenshot-008.jpg)
* As mentioned, erasing the disk reformats it completely. You’re wholeheartedly recommended to save any files you need to another disk before erasing or reformatting your current external disk.
* 9) When the disk has been erased or formatted, click Done and quit Disk Utility.
* Congratulations, your disk is now erased, reformatted and ready to be used. Don’t forget to eject your external storage devices when you’re done using them.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/macOS-Sierra-Finder-Eject-disk-Mac-screenshot-001.jpg)
* To do so, right-click or Option-click the icon for your external storage device on the desktop, then choose Eject from the menu. Alternatively drag the device icon to the Trash.
* Failure to unmount an external storage device before unplugging it may lead to data loss.
* If you like this how-to, pass it along to your support folks and leave a comment below.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know at help@iDownloadBlog.com and a future tutorial might provide a solution.
* Submit your how-to suggestions via tips@iDownloadBlog.com.

