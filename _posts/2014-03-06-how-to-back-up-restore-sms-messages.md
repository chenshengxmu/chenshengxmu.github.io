---
layout: post
title: How to back up and restore Messages on a fresh iOS install
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Backing-up-and-restoring-Messages.png)
* Backing up the iPhone has always been an interesting phenomenon. iTunes makes backing up your iOS device inherently easy, and iCloud, when you have enough space to store all of your files, makes it even simpler. Unfortunately, people still seem to have lots of questions about backing up their devices.
* One of the main issues that makes backing up such a questionable process, is the way that backups are handled in the first place. For starters, backing up your iPhone, iPad, or iPod touch is basically an all or nothing affair. It’s the clothes, the appliances and the kitchen sink, or it’s nothing.
* One of the biggest questions that always seems to come up involves backing up and restoring just the SMS and iMessage messages found in the Messages app. Of course, you can perform a normal iTunes backup, and grab all of your messages and the kitchen sink as well, but that’s not a viable solution for everyone.
* With that in mind, what do you do if you want to backup and restore only your text messages (iMessages and SMS messages) and keep everything else clean and fresh? Unfortunately, Apple doesn’t provide a way to do this with either iCloud backups or iTunes backups, but it can be done.
* There are many reasons as to why you’d want to create a fresh backup and restore and maintain your messages. Perhaps you’d even like to transfer your messages to a separate device? Maybe you’d like to jailbreak a clean device before Apple kills the Evasi0n7 jailbreak, but you’d prefer to keep your messages in the process?
* In this tutorial, we will show you how to backup your SMS messages and iMessages, no jailbreak required. We’ll also show you how to import these messages back to the same iPhone or a different one. Check inside as I walk you through the entire step-by-step process.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Ultimate-Tools.png)
* The main app that we’ll be using in this tutorial, outside of iTunes, is iBackupBot. iBackupBot is a paid utility (with free trial) that allows you to view the contents of iTunes backups, extract data from backups, insert data into backups, and more. There are, of course, other ways to go about doing this, in fact, iBackupBot itself contains a direct restore option for individual assets like Messages, but I’ve found this method to be among the most reliable. Most importantly, this tutorial can also be completed from start to finish using the trial version of iBackupBot.
* iBackupBot comes with a functional free trial. The software is not free, but you can trial it and use it for free to do everything contained in this tutorial. If you wish to pay, you can always register your copy of iBackupBot if you choose to do so.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/SMS-Backup-iBackupBot.jpg)
* It’s not pretty, but iBackupBot is a great tool for managing iTunes backups
* You can download iBackupBot using this link. In this tutorial, I will be focusing solely on the Mac version, but the basic principals of this guide are platform independent.
* As a note of reassurance, I understand that the website for iBackupBot is very low quality and looks like the type of site that would try to scam you. I can tell you that I have personally used iBackupBot, downloaded it from the website linked, and have followed every step of this tutorial with no problems whatsoever from spam or malware.
* You’ll need the latest version of iTunes installed on your device to follow this tutorial. iTunes is what we’ll be using to perform the necessary backups and restores to your iOS device. If you’re not running the latest version of iTunes, it’s possible that you could run into problems.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/SMS-Backup-iTunes-Latest.gif)
* Checking for iTunes updates
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Ultimate-Tutorial.png)
* The first thing you’ll need to do is perform a full backup using iTunes. If you’re currently using iCloud backup, you’ll need to connect your device to your Mac with a USB cable, launch iTunes, and switch to iTunes backups a.k.a This computer. It’s best to connect with a USB cable and not over Wi-Fi, because the full backups can be extremely large.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/SMS-Backup-iTunes-Backup1.jpg)
* Ensure you have backups set to “This computer” and then click Back Up Now
* Depending on the size of the contents on your iPhone, the backup may be fairly quick, or it may be slow. If it’s been a while since your last backup and you’ve acquired a lot of new content since then, the backup could take a significant period of time; just be patient.
* On the Mac, all iTunes backups are stored in the same default location. You can find iTunes backups in the ~/Library/Application Support/MobileSync/Backup folder. If you open the Finder and use the keyboard shortcut command ⇧+⌘+G you can paste the path listed above to quickly access your iTunes backup folder.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/SMS-iTunes-Backup-Folder1.jpg)
* The backup folder for my iPhone 5s
* Inside of the iTunes backup folder, you should see at least one oddly named folder, which corresponds to your device’s backup. The time stamp of the folder should match the time when you last performed a backup for your device. If you’ve backed up multiple iOS devices to the same computer, you’ll see multiple folders here.
* I always like to keep my backup folder clear of clutter, so I will delete any old backup folders that are no longer relevant to me. Obviously, you’ll need to exercise caution when doing this to ensure that you don’t delete a needed backup. You can also view and manage your exiting backups directly via iTunes’ Preferences > Devices tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/SMS-Backup-iTunes-Prferences.jpg)
* Right click on the name of the backup to quickly view its Finder location
* The backup that we just performed wasn’t just done to be safe; it’s necessary so that we can extract the Messages app contents in order to move it to a clean device. To do this, we’ll need to use iBackupBot. We will extract all SMS, text messages, and Messages data.
* iBackupBot is smart enough to know the location of your backups, and it will automatically look for and find your backup folder upon launching the app.
* When you first launch iBackupBot, you’ll see a pop-up window that says Loading backup information… Depending on the size and quantity of your backups, this could take a significant amount of time. Just be patient as iBackupBot does its thing.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Loading-backup-information-iBackupBot.png)
* When you launch iBackupBot, you’ll see it load backup information
* Once iBackupBot is finished loading all of information from your backup folders, you should see its main interface screen. On the left side of the interface, you’ll notice a section for devices and a section for backups. Under the devices section, you should, in theory, see the device for which you just performed a full backup. If you select this device, you’ll see detailed information about it in the main interface window.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iBackupBot-Main-Interface.png)
* iBackupBot’s interface showing my device and backup
* Exporting the SMS database and Drafts folder to computer
* Under the backups section as listed above, find your device and click the disclosure triangle beside System Files. After that, click the disclosure triangle next to HomeDomain, and then next to Library. Scroll down in the Library list until you come upon the SMS folder. Click the SMS folder, and iBackupBot should display its contents —sms.db and Drafts—in the main window interface to the right of your list of folders.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/sms.db-Drafts-iBackupBot.png)
* For emphasis, here is the full directory path: System Files > HomeDomain > Library > SMS
* Select both the sms.db and Drafts folder using ⇧+click and then click Export. Select an export location and click the Open button. I usually recommend selecting the Desktop as an export location for easy retrieval.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Export-SMS-02-Backup.gif)
* Exporting the sms.db and Drafts folder from the full backup
*  
* Exporting Attachments to computer
* Next, you will need to export the SMS attachments folder. The attachments folder contains all of the attachments found within the conversations in the Messages app. Most of the attachments will consist of photos or perhaps video. Due to the nature of the content contained within the attachments folder, you’ll notice that it is significantly larger than your SMS database. Exporting the attachments folder is a repeat of the exercise explained above using a different location.
* To export the attachments folder, click the disclosure triangle next to System Files and then MediaDomain. Once you click MediaDomain, scroll down and click the disclosure triangle next to Library. Finally, click the SMS folder to show its contents—the Attachments folder—in the main window located to the right.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iBackupBot-Attachment-folder.png)
* The Attachments folder can be quite large
* For emphasis, the full path of the Attachments folder is as follows: System Files > MediaDomain > Library > SMS
* Select the Attachments folder and then click Export. Select an export location and click the Open button. Again, as mentioned above, I usually recommend selecting the Desktop as an export location for easy retrieval later.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iBackup-SMS-attachments.gif)
* Exporting the Attachments folder from the full backup
* We have successfully extracted the pertinent SMS data from the iTunes backup. Now, here comes the fun part—massaging that data back into a crispy clean backup file.
* The next step is very straightforward. You’ll need to restore your device to factory firmware. It might be a good idea to save-off the device’s backup folder that we referenced earlier to a secure location. This makes it so that you can always restore using your full data, or access any other data that may have been on the device should the need arise. Basically, you want to make sure that you have other important information backed up like photos if any of that matters to you. If you don’t care, and just want a fresh slate with your SMS messages restored, or you use iCloud to store majority of your device’s pertinent information like I do, then please feel free to continue.
* Beware: Restoring firmware means that you must upgrade to the latest publicly available firmware, and the latest firmware isn’t always jailbreak-able. If your device is currently jailbroken, do not restore until you verify that Apple’s latest public firmware can be jailbroken. As of the time of this writing, iOS 7.0.6 is the latest firmware and it is jailbreak-able. Apple plans on releasing iOS 7.1 in the very near future, and most reports speculate that it is not jailbreak-able. If you’re going to do this, act fast while iOS 7.0.6 is still the latest public firmware.
* Ensure that your device is plugged into your computer, and launch iTunes. Click the device summary tab to show the latest information about your device. Click the Restore button to begin the process.
* Click Restore iPhone to restore your device to factory firmware
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Restore-iPhone-SMS-Backup.png)
* You may be asked if you’d like to backup your device before restoring. That, of course, is up to you, but you should already have a backup from our previous step.
* Once the device is finished restoring, you’ll need to go through the standard iOS setup. Be sure to set your device up as a new device. Do not choose to restore from backup.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iOS-7-Clean-Restore-SMS-Backup.jpg)
* Setup your device as clean as possible and do not choose to restore from backup
* During the setup, I try to keep my configuration as clean as possible, since this will be the “starting point” for my clean-slate backup. For that reason, I make it a goal to perform a backup as soon as my device is fresh at the Home screen.
* Connect your freshly restored iOS device to your computer and launch iTunes. When you see the welcome screen, be sure to set up your device as a new device.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Welcome-iTunes.png)
* Setup your device as new and click Continue after launching iTunes
* After the initial sync, click Get Started, which should take you to your device’s summary page. Under the Backups section, be sure to check iTunes backup (This computer) if it’s not already selected and click Back Up Now.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/ITunes-Backup-SMS-Backup.gif)
* You may need to switch from iCloud to your local computer before proceeding with backup
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Backing-up-iPhone.gif)
* Since the backup is from a fresh install, it should go quickly
* Now it’s time for the fun part—merging the Messages data with the clean backup. As you may have guessed, this portion of the project is handled using iBackupBot.
* Launch iBackupBot and select the clean backup that you just created. You will be able to differentiate this backup from previous backups by means of its time stamp and size. The size should be somewhere around 350MB for a fresh iPhone backup.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iBackupBot-Vanilla-Size.png)
* The clean backup size should be small
* First, let’s insert the sms.db and Drafts folder back into their proper location. Navigate to System Files > HomeDomain > Library > SMS in iBackupBot. You should already see an empty sms.db file there, which is just the stock database file. Use the import button to import the sms.db file that was saved off to desktop earlier. When you get the message saying that there is already a file with the same name in this location, click yes to proceed.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iBackupBot-Import-SMS.db_.gif)
* Importing the sms.db file into the clean backup
* Now it’s time to import the Drafts folder. Since this is a folder and not a single file, click the down arrow directly to the right of the import button. You should see an option to import a file or import a folder. Select import folder and then select the drafts folder.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Import-Drafts-folder-iBackupBot.gif)
* Importing the Drafts folder into the clean backup
* Finally, you’ll need to import the attachments folder. This is done in the very same manner that you imported the drafts folder. First, though, you’ll need to navigate to the appropriate location for import. Go to System Files > MediaDomain > Library > SMS and then click the down arrow next to the import button and select the Attachments folder. Importing the attachments will take a longer time since it’ll probably be filled with photos and other media. Be patient, and wait for the process to complete.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Import-attachments-iBackupBot.gif)
* Importing the Attachments folder into the clean backup
* Once you have finished importing the SMS data, you should notice that the file size of the backup has increased to reflect the size of your imported data. The only thing left to do now is to perform a restore from backup.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iBackupBot-new-file-size.png)
* The new backup file size reflects the addition of imported data
* Connect your iOS device to your computer and open iTunes. On the summary page click the Restore Backup… button. iTunes will then ask you what backup you wish to restore from. Select the most recent clean backup that you just infused with the SMS data. The timestamp shown for the backup in iTunes should match the timestamp shown in iBackupBot.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/iTunes-Restore-from-Backup.png)
* Your most recent backup file should be the clean backup with SMS data
* Click Restore, and wait patiently while your device is restored. When the restore is complete, you should have a brand new clean iOS install with all of your backed up Messages app data.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/Ultimate-Conclusion.png)
* Once the restore is completed, unlock your device and venture into the stock Messages app. There you should see all of your previous messages, with all of their attachments. The wonderful thing about all of this is that you basically have a completely clean and fresh install, yet you didn’t have to give up your message history in the process.
* You can now reinstall any apps that you wish to use. If you use iCloud, be sure to enable it to pull in all of your iCloud data like photos, mail, contacts, bookmarks, etc.
* iBackupBot is a great tool to use, this tutorial isn’t its only use case. The same principals of this tutorial can, in theory, be applied to any part of your iOS file system structure. However, since most data is backed up to the cloud using iCloud–Messages app data being one of the biggest exception—I find that this is one of its primary uses.
* I have personally used this exact method to backup and restore my messages to a clean iOS 7.0.6 install. With iOS 7.1 on the horizon, I think it’s a good idea to start with a fresh install of iOS 7.0.6 for the long haul. By doing this, you can have a fresh install with a fresh jailbreak, and keep it until a new jailbreak is released. Doing this allows you to eliminate any potential problems with your install so as to mitigate the possibility of having to restore later down the line and losing your jailbreak in the process.
* What do you think about the idea of backing up and restoring your messages? Do you think it’s a good idea? Sound off down below in the comments section, and share your thoughts on the matter.

