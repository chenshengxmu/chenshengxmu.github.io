---
layout: post
title: Where are the images and videos from the Photos app saved on my Mac?
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/macOS-Sierra-desktop-Photos-Memories-image-001.jpg)
* Not unlike iTunes, Photos for Mac defaults to copying every single imported photograph or video to its own library. You can change that behavior if you like, but most people prefer to not bother themselves with running managed photo libraries so they’ll keep the setting as is. In this post, we’ll explain where the images and videos from the Photos app are stored on your Mac and more.
* Any images or videos you import into Photos are copied to the app’s own library.
* Suppose you have a bunch of vacation photographs in a folder sitting on the desktop. If you drag and drop them on the Photos window, the app will copy them to the library and you can delete the originals from your desktop to save storage.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/macOS_Sierra_Photos_library_path_screenshot_001.jpg)
* By default, the library is saved inside your account’s Pictures folder in a bundle named Photos Library.photoslibrary. It appears as a single icon in Finder, but is really a bundle of files.
* TUTORIAL: How to move your Photos library to another drive
* To browse the bundle and see its contents, right-click it in Finder and choose Show Package Contents from the popup menu. Your Mac should now display the hidden directories and files within the Photos library bundle until you close the Finder window.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/macOS_Sierra_Photos_library_path_screenshot_002.jpg)
* While you can dive into the Master folder and find your items nested in sub-folders named after the year, month and day they were taken, you can do browse the contents of your library more comfortably within the Photos app itself. Besides, Finder only shows you the non-edit originals—if you’ve cropped a photograph and applied a filter you won’t see your edits in Finder (for more on why, see the following section).
* WARNING: You’re strongly discouraged from manually modifying any files in the bundle or Photos may lose some of your settings/edits and even corrupt/delete your library.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/macOS_Sierra_Photos_library_path_screenshot_003.jpg)
* You can move the library to another folder, disk or external volume on your Mac, back up the bundle using Time Machine, create a copy for safekeeping and more. If you’re going to be moving your library to an external storage device, be sure that its HFS+ formatted or you won’t be able to use iCloud Photo Library.
* iPhoto, Apple’s previous image manager, was notorious for creating a new copy of the image file for every touch-up performed. Crop an image—your edit gets saved as a new image. Add a filter—that’s another copy. Adjust brightness—boom, yet another copy. Such lazy approach to nondestructive editing resulted in huge amounts of wasted storage space.
* TUTORIAL: How to transfer photos and videos from your old to new iPhone
* Thankfully, Photos employs way more advanced space-saving techniques for nondestructive editing. Rather than create a copy for every single edit, the app basically saves a script of all your editing actions (along with Slo-Mo data) in .AAE files that you may encounter when browsing the contents of your iPhone’s Photos library on a computer.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/macOS_Sierra_Photos_library_path_screenshot_004.jpg)
* Because .AAE files contain only editing commands, they’re extremely small in size.
* In other words, Photos is able to keep the originals intact while remembering all your edits as scriptable commands without wasting huge chunks of precious storage space. Your non-edited originals are safely stored in the Masters sub-folder inside the Photos library bundle. Any touch-ups, again, are saved programmatically as editing commands in these .AAE file.
* This design lets Photos keep your original items safe no matter how many times you may have edited them, without creating a new copy for every edit.
* Photos gives you several options regarding managing your library.
* Like the vast majority of users, you can use Photos in its default mode where every photo and video imported into the app gets automatically copied into the library. Or, you can save space on your Mac’s disk by having Photos reference rather than copy them.
* TUTORIAL: How to use Photos for Mac in referenced mode
* iCloud Photo Library is another good way to save storage space on your Mac.
* Just set iCloud Photo Library to store full-size originals in iCloud and Photos will switch to using smaller, device-optimized local images and videos (don’t worry, your originals are always safely stored in iCloud regardless of how many times you edited them).
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/macOS_Sierra_Photos_library_path_screenshot_008.jpg)
* Last but not least, Photos allows you to create additional libraries (i.e. separate libraries for personal photos and work photos), switch between them with ease, share a library among multiple users and more, but these topics will be explored in detail in future tutorials.
* You now hopefully have a better understanding of how Photos manages your imported photos and videos, where they’re stored on your computer and more. If you’d like to know more about the way Photos handles your media, don’t hesitate to hit us in comments and our knowledgable writers will do their best to answer your questions.
* I’d be great if you could share this article on social media (no pressure though).

