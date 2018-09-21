---
layout: post
title: How to move Photos library to an external drive
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/Photos-App-Icon.jpg)
* In addition to moving your multi-gigabyte iTunes library to an external drive, a significant amount of Mac storage space can be freed up by moving your photo libraries onto a separate drive.
* If you take a lot of pictures with a DSLR camera or your iOS devices and import them in Photos, you’ll fairly quickly run out of free space on most Macs.
* This tutorial will guide you through the process of moving an entire library of photos to an external drive, preferably to a much larger external hard drive, in a way that won’t disrupt your photography workflow.
* In Photos, you can easily switch between multiple libraries but can only work with one library at a time.
* If your Photos library is managed—that is, “Copy items to the Photos library” is selected in Photos → Preferences → General—every image you import to Photos or drop on its window will get copied to the Photos library.
* By default, the photo library is a bundle named “Photos Library.photoslibrary” found inside your account’s Pictures folder. To see what’s inside, right-click the file and choose the option Show Package Contents in a contextual menu.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/OS-X-El-Capitan-Photos-library-in-Finder-Mac-screenshot-002.png)
* In addition to storing your unmodified original images, the Photos library saves their device-optimized versions, copies of edited images, thumbnails, previews, caches and other related items. Here’s what’s inside my photo library bundle:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/OS-X-El-Capitan-Photos-library-in-Finder-Mac-screenshot-003.png)
* WARNING: To avoid accidentally deleting or corrupting a Photos library, do not alter the contents of a library in the Finder.
* Before moving your photo library to a separate drive, you must first ensure that the image stored outside your library are consolidated. During this process, Photos will add and save a copy of any referenced file to your library.
* 1) Tick the box next to “Copy items to the Photos library” in Photos → Preferences → General. Going forward, every image added to Photos will be copied to your library.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/OS-X-El-Capitan-Photos-Preferences-Managed-library-Mac-screenshot-001.png)
* 2) In Photos, select all photos (Edit → Select All or Command (⌘)-A) and then choose File → Consolidate. Click Copy to continue.
* This will copy referenced files into your photo library so they’re easier to back up and automatically included in your iCloud Photo Library. You may receive a message that some of the selected items are already stored in the library.
* 3) Quit Photos, click the desktop and in the Finder menu click Go → Home.
* 4) A new Finder window opens. Navigate to your user account’s Pictures folder.
* 5) Connect an external hard drive, a USB thumb drive or other storage device to your Mac, wait until its icon appears on the desktop. Now drag the “Photos Library.photoslibrary” file from the Pictures folder on the storage device icon.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/OS-X-El-Capitan-Photos-copy-Library-Mac-screenshot-005.jpg)
* Depending on your Mac, photo library size and other parameters, this process may take anywhere between a few seconds or minutes to half an hour or even more.
* 6) When the copying completes, hold down the Option (⌥) key and click the Photos icon in the Dock. This will prompt Photos to launch to a Choose Library dialog, giving you a chance to switch to another library file.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/OS-X-El-Capitan-Photos-Choose-Library-Mac-screenshot-004.png)
* 7) Click Other Library to continue. Highlight the photo library file you just copied to an external drive and select Open to load it.
* 8) Photos will launch into your new library. One final step: select “Use as System Photo Library” in Preferences → General. After designating a new System Photo Library, turn on iCloud services you normally use under Photos → Preferences → iCloud.
* Photos will now re-sync your new image library to the cloud. The process should complete fairly fast as Photos is smart enough not to upload previously synced images.
* 9) After confirming that you have a good backup of your new photo library in Time Machine, feel free to delete the original library file in your account’s Pictures folder in order to regain storage space on your Mac.
* If you have multiple photo libraries on your Mac, know that only one photo library at a time can be set as your default, or the System Photo Library in Apple talk.
* “If you switch to a library other than the System Photo Library, the changes you make are not reflected in iCloud Photo Library, because iCloud Photo Library only synchronizes changes from your System Photo Library,” writes Apple.
* That’s why you must designate a library you switch to as you new System Photo Library before iCloud services such as iCloud Photo Library can be used with it.
* When you first use Photos, the app will create a new photo library for you and automatically make it your System Photo Library. Again, the System Photo Library is the only library that can access iCloud services, including iCloud Photo Library, iCloud Photo Sharing and My Photo Stream. Moreover, contents of your System Photo Library appears in other apps via macOS’ Media Browser.
* After moving your photo library to another location such as an external storage device, making it your new System Photo Library lets you continue using iCloud Photo Library and other iCloud services with photos in that library.
* Keep in mind that in order to use iCloud Photo Library, iCloud Photo Sharing and My Photo Stream, the external storage device must be formatted using Mac OS Extended (Journaled) format, also known as HFS+.
* Apple on its parts warns that enabling iCloud Photo Library after designating a new System Photo Library will merge the photos stored in iCloud with those in the new System Photo Library.
* “Once the content from the new System Photo Library is uploaded to iCloud, the libraries cannot be unmarked, so it’s a good idea to consider carefully before changing your System Photo Library,” cautions the firm.
* Please consider sharing this tutorial on social media and submit ideas for future how-to coverage at tips@iDownloadBlog.com.

