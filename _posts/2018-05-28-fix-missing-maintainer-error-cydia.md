---
layout: post
title: How to fix the missing maintainer error in Cydia
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/missing-maintainer-thumb.jpg)
* This guide will show you how to remove the following pesky error, which can crop up in your Cydia output from time to time:
* dpkg: warning: parsing file ‘/var/lib/dpkg/status’ … missing maintainer
* This is a fairly common Cydia message, which clutters up the installation and uninstallation screens and can add dozens of redundant lines of output. Not only is this unsightly, it can also make it hard to troubleshoot more serious Cydia errors by swamping the installation readout. We’ll show you how to take care of these harmless and overly verbose messages.
* As intimated by the message itself, these errors are caused by Cydia packages in which no “Maintainer” field has been specified. The maintainer is the person responsible for updates and support for the package, and one should be listed amongst the other package details (such as Version Number, Bundle ID, Name, Dependencies, etc.) in a file bundled with every Cydia package.
* On (un)installation, Cydia parses that file in order to display the package details in its interface, and alert you to any missing dependences. If any field is missing an error is shown, even if the missing field is non-essential, as in this case. By providing a maintainer manually, we can appease Cydia, ridding the output of the errors shown below:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/missing-maintainer-before.jpg)
* 1) If you do not already have it, install Filza File Manager from Cydia.
* 2) Use Filza to navigate to the file specified in the error. This file, called status, saves the details of all our Cydia packages, and is amended whenever new ones are installed, or old ones removed. The path of the file to navigate to is:
* /var/lib/dpkg/status
* 3) Select the file called status and Filza will ask how you wish to view it. Select Text Editor and the file will open.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/IMG_0617_27052018_131503.png)
* 4) Be careful not to make any accidental typos, deletions or additions to this file, or it may not be readable by Cydia.
* Consider making a backup of the file before editing, in case of user error.
* 5) We must now move through the file, adding a Maintainer field to any packages which lack one. Depending on how many packages you have, this can be a laborious process. Consider speeding it up by taking note of the offending packages/repos before beginning, by referring to the Cydia output. If you know which packages/repos lack maintainers, you can use the Search function to jump to them, as shown below:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/IMG_0620_27052018_131615.png)
* In this example, I search for the word Facebook, having noticed previously the Cydia error associated with the FBHideStoriesSwipeLeft package. I jump to the package information, note there is no Maintainer field in the image on the left. I now tap to edit the document and add the following text on the next line:
* Maintainer: CydiaGeek
* See the right-hand image for an example. It doesn’t matter who is listed as maintainer, as long as the field is detected in the document by Cydia; I simply used the name of the package creator. Be sure not to add any extra line breaks with your edit, and to leave an empty line before the next package’s details.
* 6) Continue this process for every package which has no maintainer. When you are finished, tap Save in the top-right of the screen, then tap Done to exit the file.
* 7) Quit Cydia from the App Switcher, re-open it, and hit Refresh. Once it has reloaded, try installing, uninstalling, or re-installing any package. Look out for “missing maintainer” errors, as well as related errors you may have created by incorrect editing. Two common ones are a “multiple maintainers” error, caused by adding a maintainer to a package which already had one listed, and an “end of document line break” error, caused by failing to leave one line break at the end of the status file.
* 8) With a few run-throughs you will be able to edit the file for any packages you missed the first time round, and fix any errors mentioned in Step 7 above. Once you can install a package without seeing any /dpkg/status/ or maintainer errors in the readout, you know you’re done! Remember to quit and refresh Cydia after each edit of the status file.
* 9) When you’re finished, feel free to delete your backup of the status file made in Step 4. If you hopelessly corrupt your status file whilst editing, revert to your backup to start again.
* And that’s that! You should end up with a clean output screen when installing packages, as shown below:
![img](http://media.idownloadblog.com/wp-content/uploads/2018/05/missing-maintainer-after.png)
* This must be done separately on each device you own, as unfortunately it’s a problem with the packages themselves. A permanent fix would involve the author of the package updating the details on the repository.
* However, a good workaround I’ve found is to make all your changes to the status file once only, then use redeb to back up the .deb files of the offending packages. The resulting files will have your changes saved within them. You can then install these saved .debs on your other devices, instead of using the maintainer-less ones from the repositories. This will avoid having to make edits to the status file on every device, every time you reinstall your tweaks.
* Have you run into this barrage of missing maintainer error messages before? Have you encountered other Cydia errors that you need help resolving? Let me know in the comments section, or at joe@idownloadblog.com.

