---
layout: post
title: Ensuring your Mac is receiving updates about new malware and compromised web plug-ins
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/02/Finder-App-Icon-e1424287696699.jpg)
* Among the plethora of built-in OS X features that help keep your Mac secure is something called File Quarantine, a download validation technology that checks any downloads for known malware when you try to open them.
* File Quarantine is also available in compatible applications like Safari, Messages, iChat and Mail that download files from the Internet or receive files from external sources, such as email attachments.
* Additionally, OS X blocks compromised versions of web plug-ins from functioning, including Java web apps and Adobe Flash content, to further limit your Mac’s exposure to potential zero day exploits.
* In this tutorial, we’ll discuss how you can make sure that File Quarantine updates are turned on, which will allow your Mac to receive latest malware definitions and information about compromised web plug-ins from Apple.
* 1) Open the System Preferences app on your Mac, or select System Preferences in your Mac’s Apple menu.
* 2) Click the App Store preference pane.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/05/OS-X-El-Capitan-System-Preferences-App-Store-highlighted-Mac-screenshot-001.png)
* 3) Ensure that the box next to “Install system data files and security updates” is ticked in order to enable File Quarantine updates from Apple.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/05/OS-X-El-Capitan-System-Preferences-App-Store-File-Quarantine-updates-Mac-screenshot-002.png)
* Warning: You are wholeheartedly recommended to leave this option enabled at all times. Turning off File Quarantine updates will prevent your Mac from identifying new malware, making it vulnerable to malicious applications and preventing it from notifying you if the file you’re trying to open has been infected with a new type of malware.
* OS X’s Gatekeeper feature prevents apps by developers who aren’t on Apple’s whitelist from launching out of the box, unless you specifically override this setting in System Preferences → Security & Privacy → General.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/05/OS-X-El-Capitan-System-Preferences-Securtiy-and-Privacy-Allow-apps-downloaded-from-Mac-App-Store-and-identified-developers-promprt-Mac-screenshot-001.png)
* Unless “Anywhere” is set there, OS X will pull up a warning prompt saying that the app in question cannot be opened because it’s from an unidentified developer. To override this prompt on a case-by-case basis without changing your security settings, right click on the file and select Open after getting the error message.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/11/Unidentified-developer-error-OS-X.png)
* Signed applications normally don’t present an alert when you download and open them.
* If the file you’re trying to open was received through a quarantine-aware application, your Mac puts up an alert warning you where the file came from, asking if you’re sure to open it. Quarantine attributes attached to files include date, time and a record of where the file was downloaded from. Internet files downloaded from other applications get file quarantine attributes but without date, time and link of the file downloaded.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/05/OS-X-El-Capitan-File-Quarantine-promprt-Mac-screenshot-001.png)
* Only the Mac user account which downloaded the file is permitted to remove the quarantine attribute on a file. All other Mac user accounts can open a quarantined file, but they’re still presented with an alert asking “Are you sure you want to open it?” every time they attempt to open the file.
* If a malware is detected when opening a quarantined file, a message warns you that the file “will damage your computer,” in which case you should definitely click Move to Trash and tick the box next to “Report malware to Apple to protect other users”.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/05/OS-X-El-Capitan-malware-promprt-Mac-screenshot-001.png)
* You can get more information about the detected malware by clicking the Help icon in the lower left corner of the alert message. File Quarantine also performs a malware check if the file you’re trying to open is a disk image.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/05/OS-X-El-Capitan-malware-promprt-Mac-screenshot-002.png)
* For malware detected inside a disk image, you should click the Eject Disk Image image and then delete the source file. And as mentioned earlier, OS X blocks specific versions of web plug-ins from functioning to help limit exposure to potential zero day exploits.
* RELATED: How to uninstall Adobe Flash Player from your Mac
* If you like this how-to, check out our complete tutorials archive.
* The following how-tos should come in handy, too:
* Feel free to submit your how-to suggestions at tips@iDownloadBlog.com.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know at help@iDownloadBlog.com and a future tutorial might provide a solution.

