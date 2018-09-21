---
layout: post
title: How to hide the Spotlight Search icon from the menu bar
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/remove-spotlight-icon-after.png)
* If you never use the Spotlight feature on your Mac, or if you only use it from the Finder rather than from the menu bar, you may have wondered how to get rid of its icon. Whilst most of the menu bar icons can be hidden with user-accessible toggles from System Preferences, Spotlight’s little magnifying glass is not so easily removed from the top right-hand corner of your screen.
* After a lot of investigation I had only found methods which either disabled Spotlight entirely, removing your ability to search the file system, or else hid Spotlight temporarily, with it returning every time a change was made to the file system. However, I was eventually able to find a solution which has neither of these downsides.
* In this guide, we’ll show you how to get rid of the Spotlight icon, and regain an iron-fisted control over the content of your menu bar.
* Please bear in mind that modifications to system files can cause problems if carried out incorrectly. Enter the following commands carefully, and proceed at your own risk.
* 1) Before you begin, you must disable System Integrity Protection (SIP) on your Mac. The file we are dealing with is not modifiable without this step. To disable SIP, follow our guide on the subject. If you are on Mac OS X El Capitan or earlier this step is not required, as you have no SIP.
* 2) Once SIP is disabled, launch the Terminal application from /Applications/Utilities, or via Spotlight in the top-right of your screen (as a way of saying goodbye).
* 3) At the Terminal command prompt, type the following and hit Enter:
* cd /System/Library/CoreServices/Spotlight.app/Contents/MacOS
* This moves us into the directory we want to edit.
* 4) Then enter the following:
* sudo cp Spotlight Spotlight.bak
* This makes a backup of the file we are going to edit so that if something goes wrong, we can revert.
* 5) Enter your password when prompted.
* 6) Now type ls into Terminal and press Enter. It should print a list of two files.
* Spotlight.bak is the backup you created in Step 4. Spotlight is the file we are about to edit.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/remove-spotlight-backup.png)
* Do not proceed if you cannot see both files, as it means you do not have the backup file Spotlight.bak to revert to. You must have this file in case you wish to revert your changes later.
* If you can see both files, proceed to Step 7.
* 7)a) If you are on OS X 10.11, or macOS 10.12-10.14 (El Capitan through to Mojave), enter the following command in Terminal:
* sudo perl -pi -e 's|(\x00\x00\x00\x00\x00\x00\x47\x40\x00\x00\x00\x00\x00\x00)\x42\x40(\x00\x00\x80\x3f\x00\x00\x70\x42)|$1\x00\x00$2|sg' Spotlight
* 7)b) If you are on OS X 10.10 (Yosemite), enter the following command in Terminal (all on one line):
* sudo perl -pi -e 's|(\x48\xb8\x00\x00\x00\x00\x00\x00)\x42\x40(\x48\x89\x47\x10\x48\xB8\x00\x00\x00\x00\x00\x00\x36\x40)|$1\x00\x00$2|sg' Spotlight
* This command patches Spotlight to make the icon width zero. This effectively makes the item invisible on your menu bar, without disabling Spotlight itself.
* 8) Enter the following command into Terminal, and press Enter:
* cmp -l Spotlight Spotlight.bak
* You should see Terminal print out something similar to this:
* 248855 0 102 248856 0 100
* We are comparing the two files here. If the command does not print out anything at all, then the process has not worked and you should follow our process below for reverting the changes we have made.
* 9) Now enter this into Terminal:
* sudo codesign -f -s - Spotlight
* This signs our new Spotlight ready for use. If you receive an error here related to missing Command Line Tools and xcrun, install Xcode or run “xcode-select –install” in Terminal, both of which will provide the missing tools for the job.
* 10) And finally, this:
* sudo killall Spotlight
* This restarts the Spotlight daemon to make our changes effective.
* Your entire Terminal session should look something like mine below:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/remove-spotlight-terminal.png)
* Spotlight might ask for access to your keychain again, select Always Allow. It may also ask for some other privileges such as Calendars and Contacts access. Grant or deny those as you see fit. Check the top-right corner of your screen to confirm that the icon is gone. If it’s not, try a reboot.
* 11) Once you’ve confirmed that it works, re-enable SIP.
* That should do it. Spotlight search will still function from the Finder and when summoned with a keyboard shortcut, but will no longer trespass upon your menu bar.
* If you’re already missing the convenience and charm of Spotlight in your menu bar, we can easily reverse our changes to resuscitate the little fellow.
* 1) Disable SIP again.
* 2) Open the Terminal application.
* 3) At the prompt, enter the following, and press Enter:
* cd /System/Library/CoreServices/Spotlight.app/Contents/MacOS
* 4) Next enter this:
* sudo mv Spotlight.bak Spotlight 5) Enter your password when prompted.
* 6) Now enter this command:
* sudo killall Spotlight
* 6) Check that the Spotlight icon has returned to the menu bar. If it hasn’t, reboot your machine.
* 7) Re-enable SIP.
* Let me know if you have any problems, or if you want any other how-to guides putting together for your Mac.

