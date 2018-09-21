---
layout: post
title: Five ways to make the most of a file manager on jailbroken iOS
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/Filza-iFile.png)
* The vast majority of non-developers who jailbreak do it for the tweaks, and use Cydia almost exclusively to find, maintain, and update them.
* However, jailbreaking your device brings much more than the ability to install tweaks; its real power lies in granting unfettered access to the filesystem, which allows you to make almost any change you like.
* In this article, I’ll go through five of the most interesting and ubiquitous uses for file managers on iOS.
* There are two main fully-featured file managers available on Cydia: Filza File Manager, and iFile. Both are excellent, but my preference is for Filza due to its more frequent updates and compatibility with the iOS 9.3.3 jailbreak. Either way, take your pick, and let the minor amendments to system files commence!
* On occasion, you might find that a tweak you want is not available on a Cydia repository. Perhaps a developer has sent you an alpha version directly for testing, or perhaps it’s an older version of a tweak no longer available on a repo. You can use your file manager to install the tweak on your device instead.
* 1) Open your file manager.
* 2) Navigate through the filesystem to where your file is located. If you sent it via Airdrop or downloaded it from the internet and opened it with your file manager, it will be saved in /User/Documents.
* 3) Your tweak should be saved as a .deb file, a Debian package format used by Cydia for installations. Select it and an information screen will appear.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/Install-tweak-with-Filza.png)
* 4) Press the “Install” button in the top-right to install your .deb file. When complete, the output on the screen will show the command prompt again.
* 5) Enjoy your tweak! You may need to respring your device for its effects to become visible. It should now also appear in the Cydia app in your “Installed” tab, with its repo listed as “Unknown / Local” because you did not download it from a Cydia repository. Now that it’s showing in Cydia, it can be managed from there. To remove it, select it in the list, touch “Modify” in the top-right, then select “Remove”. On the uninstallation screen which comes up, select “Confirm”. Done!
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/tweak-installed-with-filza.png)
* Whilst there are Safari Content Blockers for blocking ads in Safari, and efficient ad-blocking packages on Cydia for web and some in-app ads, by far the most elegant way to block ads served by Apple’s own iAd platform is an on-device modification via your trusty file manager.
* 1) Open the file manager and navigate to /Applications.
* 2) Locate the item named AdSheet.app. This controls Apple’s iAds. Select the item (a short-hold on it in Filza), and select the option to “Rename” it.
* 3) Edit the file name by deleting the .app extension and replacing it with .bak, to give the name AdSheet.bak. Then touch “Done” in the top-right to save your changes.
* 4) Next, navigate to /User/Library/Caches, and delete the entire folder named “com.apple.iad”. In Filza, a swipe-left on the item and pressing the “Delete” button should do it.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/hide-iads.png)
* 5) Reboot and enjoy your iAd free device. Now Apple has discontinued the iAd platform it’s unclear if this trick will remain useful for long, as developers may serve their ads in-app using different methods, but for now, it works well.
* Under stock iOS there are many file formats which are unsupported or else have very limited support, able to be opened only within certain programs. A couple of examples that spring to mind are .zip files and .plist files. While some apps can uncompress and create .zips within them (a great app that springs to mind here is Goodreader), they can only unzip a file within the app, and can only create .zips out of files saved in the app, hardly useful if you wish to deal with system files stored elsewhere. Similarly, .plists can be saved and moved between compatible apps, but not edited in place or created.
* Let’s say I want to zip up all the photos in my camera roll on my device, for ease of sending on, or as a backup prior to some tinkering.
* 1) Launch the file manager and navigate to the files you want to zip, in my case, the photos stored at /User/Media/DCIM/100APPLE.
* 2) In Filza, touch “Edit” in the top-right, and select the files you want to compress, then “More” in the bottom-right. You should now see an option to “Create ZIP”, which will make an archive out of the files.
* 3) To unzip any such file in the file manager, simply select it, and it will unpack.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/create-zip-with-filza.png)
* Filza also contains a built-in hex editor, and a .plist editor. For another example of manipulating non-standard formats in this way, see below.
* Many iOS malwares leave behind trace files which are not normally detectable without access to the filesystem. Using a file manager, we can look for these files, determine if we have been infected, and in some cases, remove them with a simple deletion. One example which has been covered on iDB in the past is Unflod.dylib, which was first noted on iOS 7. To determine whether you are infected by this, let’s open our file manager.
* 1) Navigate to /Library/MobileSubstrate/DynamicLibraries/.
* 2) Trawl down the list and look for a file named “Unflod.dylib”.
* 3) If absent, you are safe. If you see it, delete it, and reset your Apple ID password immediately. In the case of Unflod.dylib, it is also recommended to restore your device. Whilst that would be the end of your jailbreak and therefore file manager this time around, it does illustrate the utility of a file manager to identify the presence of these threats.
* Sometimes there just isn’t the exact tweak you want to customise the look and feel of your device. However, the right effect can often be achieved with some editing of system files. These two examples also show the power of file managers to edit .strings files in place.
* To remove the “Enter passcode” text from your Lock screen:
* 1) Using your file manager, navigate to:
* /System/Library/PrivateFrameworks/SpringboardUIServices.framework/
* 2) Select the file corresponding to the language your device is set to; mine was “en_GB.lproj”, but yours may be different and is likely “en.lproj”.
* 3) Inside that file, open up SpringBoardUIServices.strings and expand the list of fields by pressing the arrow symbol next to the word “Root”.
* 4) Search through for the field entitled “PASSCODE_MESA_ENTRY_PROMPT” and touch the information symbol to the right to edit. If you are on a non-Touch ID device, the field may be labelled differently here.
* 5) Edit the “VALUE” field to be empty, or if you prefer, a custom message, then press “Back” in the top-left. Some tweaks have the ability to add a custom string here, but I couldn’t find any which remove it completely so as to have no message at all.
* 6) In the top-right of the screen, press “Save” to make your changes stick. Other fields which may be of interest in this .strings file are “Cancel” and “Delete”, also for the passcode screen.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/IMAGE-11_12.png)
* To remove all text from the “slide to power off” screen:
* 1) Using your file manager, navigate to:
* /System/Library/CoreServices/SpringBoard.app/
* 2) Select the file corresponding to the language your device is set to; mine was “en_GB.lproj”, but yours may be different and is likely “en.lproj”.
* 3) Inside that file, open up SpringBoard.strings and expand the list of fields by pressing the arrow symbol next to the word “Root”.
* 4) Search through for the field entitled “POWER_DOWN_LOCK_LABEL” and touch the information symbol to the right to edit.
* 5) Edit the “VALUE” field to be empty, or if you prefer, a custom message, then press “Back” in the top-left. Some tweaks have the ability to add a custom string here, but I couldn’t find any which remove it completely so as to have no message at all.
* 6) In the top-right of the screen, press “Save” to make your changes stick.
* 7) Repeat steps iv-vi for the field entitled “POWER_DOWN_CANCEL”.
* After a respring or reboot, the changes should be visible. To revert them, return to their locations with Filza and re-enter their original labels.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/remove-slide-to-power-off-text.png)
* As these examples show, the ability to inspect and modify the filesystem on jailbroken iOS with a file manager is both powerful and versatile, and is only really limited by your own needs and the amount of digging you are prepared to do.
* Do you have any novel or indispensable uses for a file manager on iOS? If, so please let me know in the comments, along with any questions you have about the processes detailed above.
*  

