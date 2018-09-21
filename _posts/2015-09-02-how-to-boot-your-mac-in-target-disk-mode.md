---
layout: post
title: How to boot your Mac in Target Disk Mode
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/09/OS-X-Yosemite-design-promo-Finder-icon-001.jpg)
* Our tutorial series dealing with the many ways you can start up your Mac continues with Target Disk Mode, a feature Apple conceived to allow your Mac to act as an external disk for another Mac.
* It’s not surprising that the vast majority of average Mac owners are totally oblivious to the existence of Target Disk Mode, and who could blame them? After all, Target Disk Mode isn’t exactly front and center on OS X.
* In this tutorial, you’re going to be taught how to activate Target Disk Mode through the System Preferences application, or enter it directly at boot time with a simple keystroke. I’m also going to explain in layman’s terms why, when and how Target Disk Mode should be used.
* As mentioned, Target Disk Mode lets your Mac be used as an external hard disk connected to another Mac. Once the computer is in Target Disk Mode and available as an external volume to the host Mac, you can copy files to or from that volume.
* Any Mac with a FireWire or Thunderbolt port can be started up in Target Disk Mode.
* If your Mac is already turned on, you can restart it in Target Disk Mode using the Startup Disk pane in OS X’s System Preferences application.
* Step 1: Open System Preferences by clicking its icon in the Dock, or choose Apple menu > System Preferences. Alternatively, use Spotlight search to locate the app.
* Step 2: Click the icon labeled Startup Disk.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/System-Preferences-Startu-Disk.jpg)
* Step 3: Click on the Lock icon and enter your admin password if necessary, then click on the Target Disk Mode button.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Restart-in-target-disk-mode.jpg)
* A message pops up asking “Are you sure you want to restart your computer in target disk mode?” Confirm and continue by clicking the Restart button.
* If your Mac is turned off, you can bypass booting into the OS X desktop and start the machine up directly into Target Disk Mode.
* Step 1: Turn on your Mac by pressing the power button.
* Step 2: Hold down the “T” key immediately upon hearing the startup chime.
* To exit Target Disk Mode, follow these steps:
* Step 1: First eject the disk of the Mac in Target Disk Mode by dragging its icon to the Trash on your other Mac. The Trash icon will change to an Eject icon when you do this. You can also choose Eject (or Put Away) from the File menu.
* Step 2: Now press and hold the power button located on the Mac in Target Disk Mode until it restarts.
* Step 3: Lastly, disconnect the FireWire or Thunderbolt cable from both Macs.
* Great, tour Mac is now in Target Disk Mode. Now what?
* Easy, connect it to another Mac using a Thunderbolt or FireWire-to-FireWire cable to start using it as an external disk. The other Mac should be booted into OS X normally, not in Target Disk Mode.
* Once a disk icon appears on the desktop of your other Mac, double-click it to start browsing the files on that computer. You can transfer files between the computers as you normally would, by dragging them to or from the disk.
* Are you having issues entering Target Disk Mode? If so, this may help.
* Is your cable working? Make sure your FireWire-to-FireWire or Thunderbolt cable is in good condition. Oh, and double check the connection.
* Peripherals? Are there any other devices connected to the computer via FireWire or Thunderbolt? If so, disconnect them before entering Target Disk Mode.
* Know thy keystroke. Make sure you are starting up the computer while pressing and holding down the T key.
* Check the keyboard. Do you own a desktop Mac? If so, check that its keyboard is connected directly and not through an Apple Thunderbolt Display or a hub. If you use a wireless keyboard, make sure its batteries are charged.
* Have you set up a firmware password on your Mac? Not to be confused with your OS X account password or FileVault disk encryption password, a firmware password prevents the computer from starting up from any device other than your designated startup disk, meaning it won’t be able to enter Target Disk Mode.
* Using Mac OS X 10.3.9 or earlier? Mac OS X 10.3.9 or earlier cannot mount volumes from an Intel-based Mac in Target Disk Mode.
* Is FileVault turned on? If the home directories on your Mac are encrypted using OS X’s File Vault feature, you cannot browse them in Target Disk Mode. In order to make the files visible on another Mac, log in as the FileVault-protected user and temporarily disable disk encryption on by clicking the Turn Off FileVault button in System Preferences > Security & Privacy > FileVault.
* After transferring home directory contents to the target computer, enable FileVault protection again if you like.
* Unresponsiveness? Some Intel-based Macs can become unresponsive while being used in Target Disk Mode for long periods of time. This can be corrected by checking for software updates on the computer that becomes unresponsive while in Target Disk Mode.
* Using a notebook? If you boot a Mac notebook in Target Disk Mode, plug in its AC power adapter.
* You may be wondering why on Earth would anyone in their right mind use their Mac as a disk for another Mac. Here are some of the more obvious scenarios when this might be helpful:
* If you have gigabytes’ worth of files on your Mac, you’ll spend quite some time waiting until they transfer to another Mac via Wi-Fi or USB. Thankfully, Target Disk Mode relies on high-speed Thunderbolt or FireWire which can transfer hundreds of megabytes in just a few seconds. This method is particularly useful if the display on one of your Macs isn’t working and you need to get to its files.
* Should you need to install OS X on a Mac that doesn’t have an optical drive, or haven’t created an OS X install USB drive, or hate re-downloading the installer again from the App Store, Target Disk Mode is your friend. One Mac will be the installer and the recipient machine where OS X is going to be installed on will be in Target Disk Mode.
* Booting a Mac in Target Disk Mode lets you format its volumes, or partition its drive to use as a startup volume. Simply use Disk Utility on the other Mac to erase the disk on the Mac in Target Disk Mode before you repartition the drive.
* Sometimes your Mac might refuse to start up, or you might be unable to get past the login screen. If booting into OS X’s built-in Safe Mode or Verbose Mode won’t resolve startup issues, connect that machine to another Mac via Target Disk Mode and perform a health check of its disk in Disk Utility.
* Say you bought a new Mac and want to move content from your old machine over to a new one the fastest possible way. Start up your old Mac in Target Disk Mode and connect it to the new machine via either a Thunderbolt or FireWire-to-FireWire cable.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Migration-Assistant-select-method-Mac-screenshot-001.png)
* Now open the Migration Assistant application on your new Mac (you can find it by choosing Go > Utilities, or using Spotlight or Launchpad), select “From a Mac, Time Machine backup, or startup disk” and click Continue.
* Did you like this tutorial?
* We’re open to suggestions and smart ideas so do feel free to chime in with your thoughts in the comment section below.
* If you like this tutorial, please consider bookmarking and passing it along to your friends and other Mac support folks.
* Stumbled upon a cool how-to or have come up with a great tutorial idea? Submit your ideas to tips@iDownloadBlog.com and we’ll take your brightest thoughts into account in future coverage planning.

