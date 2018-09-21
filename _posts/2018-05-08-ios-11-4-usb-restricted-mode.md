---
layout: post
title: iOS 11.4s Restricted Mode may defeat physical data access by hacking tools like GrayKey
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/04/GrayKey.jpg)
* iOS 11.4 packs in a new feature called USB Restricted Mode that was designed to help defeat physical data access by forensic firms like Cellebrite and hacking tools such as GrayKey.
* We previously wrote about Grayshift’s GrayKey, a dedicated hacking device designed for law enforcement officials. It takes advantage of an unknown exploit to bypass Apple’s failsafe mechanism which wipes the device after ten consecutive passcode attempts.
* As such, GrayKey opens door to brute-force attacks on the passcode. With Apple’s protections bypassed, the box is reportedly able to guess a 6-digit passcode in less than a day.
* Guide to iOS estimated passcode cracking times (assumes random decimal passcode + an exploit that breaks SEP throttling):
* 4 digits: ~13min worst (~6.5avg) 6 digits: ~22.2hrs worst (~11.1avg) 8 digits: ~92.5days worst (~46avg) 10 digits: ~9259days worst (~4629avg)
* — Matthew Green (@matthew_d_green) April 16, 2018
* It has two Lightning cables sticking out of the front and works with all recent iPhones.
* To tighten up user security and make it harder for such specialized hardware to break into our iPhones, iOS 11.4’s new USB Restricted Mode imposes a seven-day window during which accessories can use the USB data connection over the Lightning port.
* According to the iOS 11.4 release notes:
* To improve security, for a locked iOS device to communicate with USB accessories you must connect an accessory via Lightning connector to the device while unlocked—or enter your device passcode while connected—at least once a week.
* In other words, iOS 11.4 prevents any accessories from communicating with an iOS device through the Lightning port unless your passcode is entered at least once per week.
* This feature was actually introduced in the iOS 11.3 beta before being removed from the finished code and reintroduced in the current iOS 11.4 beta.
* When the Lightning port has been locked down to charge-only mode, your iPhone or iPad will still charge but it will no longer attempt to establish a data connection with the accessory.
* In Lightning lockdown mode, even the Trust This Computer prompt won’t be displayed once the device is connected to the computer. As an added layer of security, any existing iTunes lockdown records will not be honored until the user unlocks their device with a passcode.
* TUTORIAL: How to set up a stronger iPhone passcode
* iTunes lockdown records, or pairing records, are special files that are stored on the computer to which your iOS device syncs to. A lockdown record is automatically created the first time the user connects their iOS device to a PC that has iTunes installed.
* Russian forensic firm ElcomSoft speculates that a rogue party might attempt to extend the Restricted Mode window by connecting an iOS device to a paired accessory or computer.
* If the phone was seized while it was still powered on, and kept powered on in the meanwhile, than the chance of successfully connecting the phone to a computer for the purpose of making a local backup will depend on whether or not the expert has access to a non-expired lockdown file (the aforesaid iTunes pairing record).
* If, however, the phone is delivered in a powered-off state, and the passcode is not known, the chance of successful extraction is slim at best.
* Elcomsoft notes that it’s currently unclear when the USB data is blocked:
* At this point, it is still unclear whether the USB port is blocked if the device has not been unlocked with a passcode for 7 consecutive days; if the device has not been unlocked at all (password or biometrics); or if the device has not been unlocked or connected to a trusted USB device or computer.
* In our test, we were able to confirm the USB lock after the device has been left idle for 7 days. During this period, we have not tried to unlock the device with Touch ID or connect it to a paired USB device. What we do know, however, is that after the 7 days the Lightning port is only good for charging.
* Apple’s made it a lot harder for forensic firms to bypass the passcode and create a local backup of an iOS device’s data by using iTunes lockdown records from a victim’s computer.
* In iOS 11.3, for instance, iTunes pairing records expire after seven days. iOS 11 also increases pairing security by requiring a passcode for the “Trust This Computer” prompt.
* As Apple itself states, the changes in iOS 11.4 described in this article should make hacking attempts by forensic firms like Cellebrite and hacking tools such as GrayKey harder.
* “If you use iAP USB accessories over the Lightning connector or connect to a Mac or Windows PC, you may therefore need to periodically enter your passcode if you have a passcode set on your iPhone, iPad or iPod touch,” the company notes.
* All you need to know is that the iOS 11.4 update boosts your security by automatically disabling the Lightning port after 7 days since your device has been last unlocked.
* What do you think about this new privacy measure in iOS 11.4?
* Let us know in the comments!

