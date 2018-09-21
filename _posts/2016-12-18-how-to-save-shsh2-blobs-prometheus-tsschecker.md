---
layout: post
title: How to save .shsh2 blobs for Prometheus with tsschecker
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/downgrade-iOS-header-1.jpg)
* As reported on iDB earlier, iOS hacker tihmstar has announced a New Year’s Eve release of his new tool Prometheus, which can downgrade/upgrade devices to unsigned firmwares, subject to certain requirements. The main prerequisite for using the tool is having the APTicket/.shsh for the firmware you want to go to, but the process for saving these has changed. You must now use his tool tsschecker to correctly save the files, dubbed .shsh2. This guide will walk you through how to do it.
* First off, please note that saving .shsh with TinyUmbrella or savethemblobs will not work for Prometheus, as it requires more information than the blobs they save provide. Using tsschecker, you can save an .shsh2 blob which contains a specific nonce, allowing a replay attack to downgrade your device.
* Before you begin, go to tihmstar’s GitHub and download tsschecker. I will be outlining the process for Mac, but there are versions for Windows and Linux too.
* 1) Unzip the downloaded tsschecker file by double-clicking it. I used version 1.0.6.1.
* 2) Create a folder on your desktop called “TSS”, and put the unzipped file called “tsschecker_macos” inside it.
* 3) Open the program TextEdit and connect your device to your computer.
* 4) Open iTunes and navigate to the connected devices page.
* 5) On this page certain information about your device is visible. We need to make a note of our device’s “ECID” and “Model”. These can be found by clicking on the “Serial Number” field of your device until they appear.
* 6) Copy these two pieces of information into your TextEdit document. An example “Model” would be “iPhone7,2”, and an example “ECID” would be “1234A5678B912”.
* 7) Now, paste the following lines into your TextEdit document:
* /Users/USERNAME/Desktop/TSS/tsschecker_macos -d MODEL -e ECID -i 10.2 -s
* /Users/USERNAME/Desktop/TSS/tsschecker_macos -d MODEL -e ECID -i 10.1.1 --buildid 14B150 -s
* /Users/USERNAME/Desktop/TSS/tsschecker_macos -d MODEL -e ECID -i 10.1.1 --buildid 14B100 -s
* /Users/USERNAME/Desktop/TSS/tsschecker_macos -d MODEL -e ECID -i 10.1 -s
* 8) We need to replace the words in capital letters in these lines with our own information. Replace “USERNAME” with your computer username, for example “joebloggs”. Replace “MODEL” with the Model we noted earlier, for example “iPhone7,2”. Replace “ECID” with your ECID, for example “1234A5678B912”. Do this for all four commands.
* 9) Once this is done, open Terminal from /Applications/Utilities, or via Spotlight.
* 11) Now copy each line from your TextEdit document one at a time into your Terminal window, and press “Enter” to save the blobs. The output should be similar (though not necessarily identical) to the one below, and should end in success:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/tsschecker-terminal-output.jpg)
* 12) After you have repeated the process for all of the lines, you should have your .shsh2 blobs saved for iOS 10.2, iOS 10.1.1 (both builds), and iOS 10.1. Remember, time is short, so grab them while you can. In future, grab new firmwares by replacing the iOS version number in the commands with new ones, for example iOS 10.2.1.
* 13) If you want to be doubly safe you can issue all the previous commands and add the following nonces to the end, one at a time. This may help to increase your chances of a downgrade in future, and might even facilitate downgrades without a jailbreak on specific iPhone 5s devices:
* --apnonce 603be133ff0bdfa0f83f21e74191cf6770ea43bb
* --apnonce 352dfad1713834f4f94c5ff3c3e5e99477347b95
* --apnonce 42c88f5a7b75bc944c288a7215391dc9c73b6e9f
* --apnonce 0dc448240696866b0cc1b2ac3eca4ce22af11cb3
* --apnonce 9804d99e85bbafd4bb1135a1044773b4df9f1ba3
* An example command using these nonces would be as follows:
* /Users/joebloggs/Desktop/TSS/tsschecker_macos -d iPhone7,2 -e 1234A5678B912 -i 10.1 -s --apnonce 9804d99e85bbafd4bb1135a1044773b4df9f1ba3
* One thing to note is that saving the blobs again with nonces will overwrite the ones you have already saved. To keep all of them, save blobs without nonces first, then move them to a different folder for safekeeping before saving them again with a nonce. Move the blobs saved with the first nonce to another folder, then save with the next nonce, and so on.
* This does increase the number of commands you have to issue. To do all four iOS firmware versions with each nonce would be 20 commands per device, but it may help you out in the future, so weigh it up for yourself. Saving them without the nonces should be sufficient, but better safe than sorry!
* The saved blobs should now be at the root of your home user folder, ~/. Look for them under /Users/USERNAME, next to your “Documents” and “Downloads” folders, and move them wherever you please to keep them safe.
* As stated before, the clock is ticking until iOS 10.1.1 is unsigned, so whilst this method will work in future to save all iOS firmware blobs which are then signed, you only have a little while to use this to save your iOS 10.1.1 .shsh2 files.
* Good luck, and let me know how it goes!
*  

