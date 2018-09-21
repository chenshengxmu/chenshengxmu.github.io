---
layout: post
title: How to adjust your iMac Pro's startup security level with Secure Boot features
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/iMAc-Pro-back-connectivity.jpg)
* Apple’s iMac Pro ships with a new feature, called Secure Boot, which takes advantage of the onboard Apple T2 chip, an ARM processor similar to the one in an iPad or iPhone, allowing the computer’s firmware to validate the bootloader prior to loading.
* The T2 chip validates the entire boot process when the power comes on whilst ensuring that the lowest levels of software aren’t tampered with and that only the initial bootloader and operating system software trusted by Apple loads at startup.
* Secure Boot is a new feature exclusive to iMac Pro that helps ensure your computer always starts up from its designated startup disk and always from a trusted operating system.
* Secure Boot settings are available within Startup Security Utility, which is only accessible through macOS’s Recovery Mode.
* Startup Security Utility offers the following toggles to help secure your iMac Pro against unauthorized access (we’ll detail all three settings in this article):
* Keep in mind that iMac Pro currently does not support booting from network volumes although NetBoot is probably coming to Secure Boot in a future software update.
* Secure Boot settings don’t affect Target Disk Mode. This mode, invoked by holding the “T” key when starting up your computer, turns your iMac Pro into an external disk for another Mac.
* In other words, Secure Boot won’t stop a bad actor with physical access to your computer from booting up your computer in Target Disk Mode and mounting it on their Mac with full access to all the attached drives and volumes.
* Turning on FileVault disk encryption, which ties SSD encryption to your password, helps mitigate this issue because it prevents data on your SSD from being decrypted without the proper hardware and your password.
* Secure Boot features are unavailable on non-iMac Pro models.
* TUTORIAL: All the ways you can start up your Mac
* If you don’t own an iMac Pro, creating a strong firmware password will make it impossible for other people to start up your computer from a disk other than your designated startup disk without the password.
* 1) Restart or turn on your iMac Pro, then press and hold Command (⌘)-R immediately after you see the Apple logo. This will boot the machine into macOS’s Recovery Mode.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/OS-X-Recovery-Mode-keystroke-image-001.png)
* 2) Click Utilities in the menu bar in the Utilities window.
* 3) Click Startup Security Utility in the Utilities window.
* TIP: If Startup Security Utility won’t open, you have not created any user accounts on the computer or the Setup Assistant has not yet been run.
* 4) When asked to authenticate, click Enter macOS Password, then select an administrator account and enter its password.
* 5) Startup Security Utility will present three Secure Boot settings:
* If you use Boot Camp, you can boot into Windows 10 while remaining fully secure because the T2 chip and Secure Boot both respect Microsoft’s signing authority for Windows 10 beginning with 2017’s Fall Creators Update.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/macOS-High-Sierra-Startup-Security-Utility.png)
* 6) Close out the Startup Security Utility window.
* 7) Click Restart in the Apple menu to restart the machine with your security settings in place.
* NOTE: If you have selected either Full or Medium security and the operating system on your startup disk has failed to pass verification, this is what happens:
* NOTE: turning off Full security then toggling it back on will prompt you to go online.
* If you’re wondering about the effects of resetting NVRAM on Secure Boot settings, there are none. While reseting NVRAM turns on System Integrity Protection (if it was disabled), your Secure Boot settings remain the same as before the reset.
* Read on for detailed descriptions of Full and Medium security settings.
* A level of security previously only available on iOS devices, this setting ensures that only an up-to-date operating system (macOS) or a cryptographically signed operating system currently trusted by Apple (Microsoft Windows), is able to run on your computer. No other operating systems will be allowed to run on this iMac Pro.
* If Secure Boot finds an unknown operating system on your startup drive or is unable to verify it, the computer will connect to the Internet and download the updated integrity information from Apple it needs to verify the operating system. “This information is unique to your iMac Pro, and it ensures that your iMac Pro starts up from an operating system that is trusted by Apple,” according to the company.
* If you’re offline, you may see an alert saying that an Internet connection is required. Choose an active Wi-Fi network from the menu bar, then click Try Again.
* If your iMac Pro uses FileVault disk encryption, you may be asked to enter a password to unlock the disk before the computer attempts to retrieve updated integrity information from Apple. Enter your administrator password, then click Unlock to complete the download.
* When the Medium setting is toggled on, your iMac Pro is allowed to run any operating system version ever trusted by Apple, not just the current version. Unlike the Full setting, it doesn’t require an Internet connection or updated integrity information from Apple.
* This setting is best used when you need to boot into an earlier macOS version that’s no longer trusted by Apple, not necessarily the current macOS version installed on your iMac Pro.
* You can stop people with physical access to your machine from attempting to boot it up from a disk other than your designated startup disk by creating a firmware password in Startup Security Utility (not to be confused with your macOS user account’s password).
* 1) Restart or turn on your iMac Pro, then press and hold Command (⌘)-R immediately after you see the Apple logo to start up the computer using macOS’s Recovery Mode.
* 2) Click Utilities in the menu bar in the Utilities window.
* 3) Click Startup Security Utility in the Utilities window.
* 4) When you’re asked to authenticate, click Enter macOS Password, then select an administrator account and enter its password.
* 5) Click Turn On Firmware Password in the Startup Security Utility window.
* 6) Enter a desired firmware password in the fields provided, then click Set Password.
* NOTE: Write this password down and store it someplace safe. If you forget the firmware password, you’ll need to schedule a service appointment with Apple or an Authorized Service Provider to unlock the machine.
* 7) Close out the Startup Security Utility window, then choose Restart from the Apple menu to reboot your iMac Pro with your new security settings in place.
* Your Mac should start up normally from its designated startup disk.
* Anyone who knows your firmware password will be able to boot your iMac Pro from a non-startup disk. To select a storage device from which you’d like to boot your iMac Pro, hold down the Option (⌥) key after turning the computer on, then highlight a disk containing a usable operating system and hit Enter.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Mac-firmware-lock-icon-screenshot-001.png)
* The firmware password field pops up: type in the firmware password you created and press Enter to unlock the computer and continue booting it from the designated disk.
* TIP: To kill the firmware password, repeat the steps above, but click Turn Off Firmware Password in step 4.
* Setting up a firmware password gives you another layer of security and a piece of mind knowing that no one will be allowed to start up your iMac Pro from an external hard drive, CD/DVD, USB thumb drive or any other storage device.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/iMAc-Pro-keyboard-mouse-Marques-Brownlee-001.jpg)
* You’ll also need to type in your firmware password before entering macOS’s Recovery Mode. This provides a safeguard against local attacks since anyone with physical access to your computer can boot into macOS’s Recovery mode.
* Even if folks in your household or your co-workers know your firmware password, you can still stop them from booting up your iMac Pro from external media by adjusting the options detailed further below.
* The External Boot settings let you control whether your iMac Pro is allowed to boot up from external media. By default, the computer is set to use the most secure option that disallows booting from any external hard drives, USB thumb drives or other external media.
* To adjust these settings to your liking, follow the step-by-step instructions below:
* 1) Restart or turn on your iMac Pro, then press and hold Command (⌘)-R immediately after you see the Apple logo to start up the computer using macOS’s Recovery Mode.
* 2) Click Utilities in the menu bar in the Utilities window.
* 3) Click Startup Security Utility in the Utilities window.
* 4) When you’re asked to authenticate, click Enter macOS Password, then select an administrator account and enter its password.
* 5) Choose your desired level of startup security right underneath the External Boot heading in the Startup Security Utility window:
* 6) Quit Startup Security Utility, then choose Restart from the Apple menu to restart your iMac Pro with your new security settings in place.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/new_2017_imac_pro_accessories.jpg)
* TIP: If you’ve allowed booting from external media and want to select a startup disk before restarting, quit Startup Security Utility and choose Startup Disk from the Apple menu.
* When the ”Disallow booting from external media” setting is selected, selecting a non-startup disk in System Preferences → Startup Disk will yield a warning message saying your security settings do not allow this to happen.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/macos-high-sierra-imac-pro-startup-disk-preferences-security-warning.png)
* TIP: To choose your startup disk at boot time, invoke Startup Manager by holding down the Option (⌥) immediately after turning on or restarting your computer.
* Doing so when the ”Disallow booting from external media” setting has been enabled shall cause your iMac Pro to restart to a message saying your security settings prevent it from booting from external media. You’ll then be presented with the option to restart from your current startup disk or select another startup disk.
* Signing off, toggling the ”Disallow booting from external media” setting on and setting up a strong firmware password is the best way to prevent nefarious users from starting up your unattended iMac Pro from their USB thumb drive.
* Apple began offloading certain Mac system functions to a dedicated ARM-based coprocessor, called T1, that debuted in the MacBook Pro with Touch Bar.
* Its successor, the Apple T2 chip in your iMac Pro, not only supports the new Secure Boot features to ensure the machine runs a legitimate operating system, but also integrates various controllers and specialized coprocessors onto a single chip:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/iMAc-Pro-motherboard-Apple-T2-chip-iFixit-001.jpeg)
* Apple T2 chip in your iMac Pro. Image courtesy of iFixit.
* Aside from Secure Boot features, the T2 chip handles the following tasks:
* Because the T2 chip incorporates Apple’s in-house designed image signal processor, it makes possible hardware-accelerated imaging features for the FaceTime HD camera not unlike those on iOS devices:
* Lastly, the T2 silicon includes a special protected section like the Secure Enclave cryptographic coprocessor embedded into Apple’s A-series mobile chips powering iPhones and iPads.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/WWDC-2017-imac-pro.jpg)
* T2’s Secure Enclave holds your storage encryption keys and the trusted certificate store in its own protected memory that’s walled off from the rest of the system. It also houses dedicated AES hardware engines that encrypt/decrypt data on the fly with no effect on the SSD’s performance, while keeping the Xeon processor free for your compute tasks.
* Lastly, it provides cryptographic functions to the rest of the system.
* If you like this how-to, pass it along to your support folks and leave a comment below.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know via help@iDownloadBlog.com and a future tutorial might provide a solution.
* Submit your how-to suggestions via tips@iDownloadBlog.com.

