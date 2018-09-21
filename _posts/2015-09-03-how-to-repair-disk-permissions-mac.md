---
layout: post
title: How to repair disk permissions on Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/Disk-Utility.jpg)
* Some Mac hiccups and startup issues can be resolved by repairing disk permissions in OS X. Disk permissions allow your Mac to control what users have access to files and folders on your Mac.
* Unfortunately, it’s quite easy to unintentionally mess up disk permissions. In fact, the very act of installing and uninstalling apps on your Mac can over time result in broken permissions.
* And when file permissions break, your apps might be allowed to alter each other’s files or even modify read-only system files, which in turn can lead to various permission errors and erroneous behavior in OS X. It is therefore essential that disk permission in OS X are as they are supposed to be.
* In this tutorial, I’m going to show you how to verify and fix disk permissions in OS X, which is typically a basic troubleshooting step to fix any software issues your Mac might be plagued with.
* Every file and folder on your Mac’s disk has an associated set of permissions that determines who can read, write to or execute it. OS X keeps a master list of what the permissions for each file should be.
* This allows the operating system to run through the files on your disk and compare their permissions with its original master list of permissions. In turn, any inadvertently altered permissions can be reverted back to their default state in case of failure.
* Step 1: Open Disk Utility on your Mac. You can find it in your Applications/Utilities folder. Alternatively, choose Go > Utilities or use Spotlight by hitting Command (⌘) – Spacebar to locate it.
* Step 2: Select the disk you wish to verify permissions for in the lefthand column which lists all of your detected volumes and disks. If necessary, click the disclosure triangle to the left of the disk icon to display the names of your volumes and partitions.
* Step 3: Click the First Aid tab.
* Step 4: Now hit the Verify Disk Permissions button. Disk Utility should display a “Permissions verification complete” message when the repair process is finished.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/OS-X-Yosemite-Disk-Utility-Verify-Disk-Permissions-001.png)
* Tip: Depending on the size of the chosen disk, the process might take a while so be patient. Should Disk Utility find any incorrect permissions, you’ll see a list of messages about what’s incorrect.
* You can repair broken permissions by following the steps outlined in the next section.
* Step 1: Open Disk Utility on your Mac.
* Step 2: Select your disk in the lefthand column.
* Step 3: Hit the First Aid tab.
* Step 4: Click the Repair Disk Permissions button. Disk Utility should display a “Permissions repair complete” message when the repair process is finished.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/OS-X-Yosemite-Disk-Utility-Verify-Disk-Permissions-002.png)
* Tip: it’s perfectly fine to repair disk permissions without verifying the disk first.
* Step 1: Open Terminal on your Mac. Find it in your Applications/Utilities folder, or choose Go > Utilities or use Spotlight search to locate it.
* Step 2: Type, or paste, the following command into Terminal’s window:
* sudo diskutil repairPermissions /
* The repair process will begin on your default startup volume and you should see a message like this:
* Started verify/repair permissions on disk0s2 Macintosh HD
* Tip: to repair disk permission on a volume other than your startup disk, replace “/” in the above command line string with the other volume name.
* Regardless of using the command line method or Disk Utility, the verification and repair process will yield the same results. Should you find tons of incorrect permissions on your disk, don’t panic as most of them can be safely ignored.
* Apple maintains a list of disk permission errors that can be safely ignored in a support document here. For instance, you can usually ignore any “ACL found but not expected…” types of messages that typically occur if you change permissions yourself on a file or directory.
* “They are accurate, but generally not a cause for concern,” explains Apple.
* Should I boot from OS X install disc to repair permissions?
* It isn’t necessary to start up from an OS X install disc or Recovery partition to fix disk permissions, unless you want to repair permissions on your startup disk.
* Should I repair permissions prior to installing OS X?
* It is unnecessary to repair disk permissions prior to installing OS X over a previously-installed OS because the OS X installer does this automatically.
* Why doesn’t Disk Utility repair my account permissions?
* Oddly enough, Disk Utility won’t actually repair the permission settings on folders and files in your account’s home folder. Should you need to reset disk permissions for a user’s home directory only, start up your Mac from an installation disc in OS X 10.5 and later or boot into Recovery partition or Internet Recovery.
* Now choose Utilities in the menu bar, select Terminal, type “reset password” (without the quotes) in the Terminal window and hit Return. Next, click your Mac’s disk icon at the top, click the menu below it and choose the user account that has issues. Now click the Reset button located at the bottom of the window.
* Running the Reset Password utility also resets your home directory permissions to their default states. This method works in all OS X versions from OS X Lion onward, and has to be done on a per-account basis.
* Is my Mac OK if disk permissions are broken?
* Many Mac users unintentionally modify disk permissions without even knowing it. In the vast majority of cases, erroneous disk permissions won’t do any harm to your Mac aside from occasional software hiccups. Repairing disk permissions is the quickest way of resetting system privileges to their correct default values.
* What if I’m on OS X 10.6 or earlier?
* If you still run OS X 10.6 or earlier on your Mac and don’t start up your Mac from an Install or Restore disc when using Disk Utility, you might see some disk error messages.
* Do I need to fix permissions after a software update?
* No, OS X repairs disk permissions on its own after an OS X software update.
* What if I have multiple drives attached to my Mac?
* It might be a good idea to perform a health check of disk permissions on all your drives and volumes, not just on the startup disc.
* Should I regularly check disk permissions on my Mac?
* That’s a great idea! Because permission issues typically occur as you install and uninstall apps on your Mac, it’s always good practice to make permissions checkups a regular part of your monthly Mac cleanup routine.
* Is this tip useful? If you like tutorials like these, please bookmark the article and pass it along to your Mac friends.
* We’re open to suggestions and smart ideas so do feel free to chime in with your thoughts in the comments or submit your ideas to tips@iDownloadBlog.com.

