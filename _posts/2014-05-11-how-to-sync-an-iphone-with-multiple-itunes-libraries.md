---
layout: post
title: How to sync an iPhone with multiple iTunes libraries
---
* Apple does not allow an iPhone to be synced with multiple iTunes libraries, presumably because users would simply share songs with each other and lower already declining music sales on the iTunes Store. When you sync an iPhone with another Mac or PC, a warning pops up on iTunes that an iPhone can only be synced with one library at a time.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/iTunes-logo-and-iPhone-5s.png)
* If you proceed to sync your iPhone with the secondary computer, the contents of that iTunes library will automatically replace whatever media you had on your device in the first place. On a side note, that doesn’t include things like contacts, calendars or settings. Those are safe, but any songs or videos are not. Fortunately, there is a solution for how to use an iPhone with more than one iTunes library. The method is explained in detail ahead… 
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/iPhone-library-iTunes-error.png)
* For reference, here is the exact error message that is displayed:
* “The iPhone is synced with another iTunes library. Do you want to erase this iPhone and sync with this iTunes library? An iPhone can be synced with only one iTunes library at a time. Erasing and syncing replaces the contents of this iPhone with the contents of this iTunes library.”
* The way that Apple recognizes which iTunes library is linked to your iPhone, iPad or iPod touch is based on a Library Persistent ID key that is hidden on Mac and PC. By essentially copying and pasting this key between your primary and secondary computers, you can trick your iPhone into thinking it is syncing with the iTunes library it was originally paired with. Simply follow these step-by-step instructions for OS X:
* Step 1 and 2: On the Mac that your iPhone normally syncs with, open a new Finder window and navigate to Go in the top menu bar. From the drop-down menu, click on Go To Folder.
* Step 3: Type in ~/Music/iTunes into the text prompt that opens. Next, click on the Go button or simply press Enter.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/Go-to-folder-Music-iTunes.jpg)
* Step 4: You should now see a list of files. It is highly recommended that you highlight each of these files and create duplicates to serve as backups. You technically only need to backup the .itdb, .itl and .xml files, including the Previous iTunes Libraries folder, but backing up everything is your safest bet. After selecting all of the files, hold down Command + C followed by Command + V to create copies. It is important to have a backup of each file just in case something were to go wrong.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/save-all-files-in-iTunes-folder.jpg)
* Step 5: Open iTunes Music Library.xml with TextEdit and write down or copy and paste the Library Persistent ID. This is a 16-character string. Make sure that you do not modify any other parts of this file.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/library-persistent-string.jpg)
* Step 6: On the secondary Mac, repeat steps 1 to 4. Again, you technically only need to backup the .itdb, .itl and .xml files, including the Previous iTunes Libraries folder, but backing up everything doesn’t hurt.
* Step 7: On the secondary Mac, make sure iTunes is closed. Then, delete all of the .itl files in the Previous iTunes Libraries folder. If this folder does not exist, skip this step.
* Step 8: On the secondary Mac, open iTunes Music Library.xml with TextEdit and replace the Library Persistent ID with the string you obtained from the original computer in step five. Then save the file.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/library-persistent-string.jpg)
* Step 9: On the secondary Mac, open iTunes Library.itl with TextEdit and delete the entire contents of the file. Then save the file.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/delete-itunes-library-itl.jpg)
*  
* Step 10: Open iTunes. You should see the error saying”The files “iTunes Library.itl” does not appear to be a valid iTunes library file. iTunes has attempted to recover your iTunes library and renamed this file to “iTunes Library (Damaged)”.” Click OK and you should be able to sync your iPhone with the iTunes library on this secondary computer.
* You should now be able to sync your iPhone with both iTunes libraries without any errors, and the existing media on your iPhone shouldn’t be erased after doing so. This how to was inspired by a tweet we received from iDownloadBlog reader Bobby Sammarco, and I encourage other readers to connect with us on Twitter if they have questions of their own. We just might write an article to answer your questions too.
* These step-by-step instructions have been tested and verified between two iTunes 11 libraries on separate MacBook Pros running OS X Mavericks. The process should work on older iTunes versions, but the use of HexEdit may be required. Even though the process was successful, your personal mileage may vary depending on various factors. It is important that you backup your files as outlined above to avoid any data loss or other problems.
* iTunes will display an error when you first open it after following these steps: “The file ‘iTunes Library.itl’ does not appear to be a valid iTunes library file. iTunes has attempted to recover your iTunes library an renamed this file to ‘iTunes Library (Damaged)’. Nevertheless, you can persist through this error by simply clicking OK and your iPhone should work with the secondary iTunes library without any problems.
* It is important to keep in mind that this workaround solution probably violates Apple’s End User License Agreement (EULA) or other terms and conditions. We are sharing this tutorial for informational purposes only and recommend that you follow these steps at your own risk. The warranty on your iPhone or Mac could be considered void if you are in violation of the EULA or other terms.

