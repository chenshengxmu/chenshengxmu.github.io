---
layout: post
title: How to fix- This is an application downloaded from the Internet. Are you sure you want to open it?
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/remove-open-program-dialog-before.png)
* One of the security features in macOS is a prompt which appears when opening a program for the first time: This is an application downloaded from the Internet. Are you sure you want to open it?
* Whilst this can be helpful to the average Joe, preventing him from opening programs he may have downloaded accidentally (such as malware), power users may wish to circumnavigate the prompt. If you already practice good housekeeping in what you download and open, this dialog can be a time waster. There are various ways to deal with it, and this guide will talk you through their pros and cons.
* This is by far the easiest and most secure method to deal with Gatekeeper prompts. Although it still takes some time, and doesn’t avoid having to deal with prompts entirely, it allows you to instantly open applications whilst keeping security enabled.
* To open a file blocked by Gatekeeper without referring to System Preferences or disabling it, simply right-click the file in question (or ctrl-click if that’s your thing), and in the menu which appears, select Open. A prompt will now appear asking for confirmation. Hit Open once more and your application will open.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/gatekeeper-open-right-click.png)
* In future, the application will open without confirmation, as it has been approved. You only need to do this on first launch. This method works for both the “x is an application downloaded from the Internet. Are you sure you want to open it?” and “x can’t be opened because it was not downloaded from the App Store” prompts, and leaves Gatekeeper enabled at all times.
* This method is functionally identical to Option 1, and as it takes a little longer, is probably less desirable. Still, it is good to know that it’s there. First, double-click the application. Once the prompt appears saying it cannot be opened, cancel it and launch System Preferences. Navigate to the Security & Privacy section, and under the General tab you’ll see your blocked program. Simply click Open Anyway to launch it. As before, you only need to do this once per program.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Screen-Shot-2017-04-19-at-16.49.16.png)
* This method completely avoids dealing with prompts, but with a painfully obvious downside: the complete loss of Gatekeeper protections. For this reason, I do not recommend this method unless you really know what you’re doing, and know how to personally check the provenance and integrity of your downloaded files through another method.
* If you’re sure you don’t want Gatekeeper to vet your files, follow the instructions below to render it utterly impotent.
* 1) Open Terminal from /Applications/Utilities, or via Spotlight.
* 2) At the prompt, enter the following command:
* sudo spctl --master-disable
* 3) Hit Enter to issue it, and then launch System Preferences.
* 4) Navigate to Security & Privacy, and under General you should now see a third toggle in the Allow apps downloaded from: section, which wasn’t there before.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/Screen-Shot-2017-04-19-at-17.01.56.png)
* As you can see, we can now Allow apps downloaded from: Anywhere, which indicates that Gatekeeper is completely disabled. The OS will never prompt you before opening any program again. This is the most time-efficient, but also least secure method available. Use wisely.
* To re-enable Gatekeeper, simply re-select one of the other two toggles. After closing and opening System Preferences the Anywhere option will have disappeared again, and you will need to re-issue the command in Step 2 to bring it back.
* This method has exactly the same effect as Option 3, but goes about it in a different way. I do not recommend anybody use this method, as it’s fairly undocumented and Option 3 is a sanctioned method with the same result, but I include it here for esoteric purposes.
* This method disables quarantining of files. Files downloaded from internet applications such as browsers, Mail, and even AirDrop, are normally marked with a Quarantine attribute by those programs. This is what makes Gatekeeper check their integrity. Gatekeeper doesn’t check any file without a quarantine flag. In effect, quarantining is the property upon which Gatekeeper is built. Option 3 disables Gatekeeper, which means that it will not check any files, even if they have a quarantine flag. This method (Option 4), disables the assigning of quarantine flags to files, which means that Gatekeeper thinks it does not need to check them, even though Gatekeeper is not technically disabled.
* Although the two methods have the same result, the mechanism used is different. As I mentioned above, this is a slightly odd technique and is probably not ideal to use. To disable the quarantining of files, see below.
* 1) Open Terminal from /Applications/Utilities, or via Spotlight.
* 2) At the prompt, enter the following command:
* defaults write com.apple.LaunchServices LSQuarantine -bool false
* 3) Hit Enter to issue the command.
* 4) To check that the preference has been correctly set, enter this command at the prompt:
* defaults read com.apple.LaunchServices
* If it has been set, the printout should show LSQuarantine = 0.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/remove-open-program-dialog-enable.png)
* 5) Reboot your computer to apply the changes.
* 6) After the reboot, test it out by trying to open a program downloaded from the internet.
* If you decide you want to turn quarantining back on (which you really ought), you can follow these instructions to re-enable it.
* 1) Launch Terminal.
* 2) At the prompt, enter one of the following two commands:
* defaults write com.apple.LaunchServices LSQuarantine -bool true defaults delete com.apple.LaunchServices
* The first command reverses the value you set in the original instructions to true, bringing back the dialog box. The second command completely deletes the parameter which you created in the original instructions, bringing back the dialog box. The end result is the same; you can pick whichever you prefer.
* 3) To check the change has been successful, enter the read command again:
* defaults read com.apple.LaunchServices
* If you entered the -bool true  command in Step 2, the output should be as follows:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/remove-open-program-dialog-disable.png)
* LSQuarantine = 1 means that the dialog box is enabled. If you entered the delete command in Step 2, the output will look like this:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/remove-open-program-dialog-delete.png)
* This means the parameter has been completely deleted, and will revert to the default behaviour, which is displaying the dialog box.
* 4) Reboot.
* For an encore, if you wish to remove the quarantine attribute from a single file, you can use the command below. This can be useful because it leaves quarantining in general on, as well as Gatekeeper, but means that a specific file will no longer bring up the prompt. Perhaps you have an application you know is safe, and need to install on multiple computers. To avoid the prompt from appearing on every computer, remove the quarantining. From Terminal:
* xattr -d com.apple.quarantine /path-to-quarantined-file
* Replace /path-to-quarantined-file with your file’s location, or simply drag the file onto the Terminal window at that part of the command. It will now slip through Gatekeeper’s net as a “known safe file”.
* And that’s the way the cookie crumbles. Another minor inconvenience squashed by the power of the command line.
* How many of these methods were you always aware of? Do you swear by Gatekeeper, or think it’s unnecessary? Did you know the difference between Gatekeeper and quarantining?

