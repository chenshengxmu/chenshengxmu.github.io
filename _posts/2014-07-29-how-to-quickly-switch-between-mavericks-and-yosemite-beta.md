---
layout: post
title: How to quickly switch between Mavericks and Yosemite beta
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/how-to-switch-os-header.png)
* Following Apple’s release of a public beta of OS X Yosemite, iDB reader Antony Verros sent us some code he wrote in AppleScript, which allows users to quickly restart a computer and automatically boot up in the installed OS of choice. For anyone who installed the OS X Yosemite beta on a separate partition, this is an easy solution for booting up into Yosemite or Mavericks without having to hold down the Option key on boot to select the desired partition. The script can even be tweaked to work with BootCamp.
* While it’s mostly a matter of time-saving convenience, this method can prove to be quite advantageous over time, particularly for users who find themselves frequently switching between OSs, whether it be a Yosemite beta, Mavericks, or Windows 7. Having an easily accessible application for booting into another OS while making a sandwich or refilling a cup of coffee, versus having to wait around to hold down Option, can be highly useful…
* Step 1: To begin, open Script Editor (Applications > Utilities > Script Editor.app) on your Mac and make a new document.
* Step 2: Paste the following code into a blank AppleScript document. I realize the code is running slightly off the page, but selecting it, copying it, and then pasting it into Script Editor should work regardless.
* In the first line, change “Yosemite” to the name of the partition on which the OS you want to automatically boot into is installed. For example, your main OS is likely installed on “Macintosh HD,” so to boot into Mavericks on Macintosh HD, the first line would read:
* I have OS X Yosemite installed on a SSD drive, aptly named “SSD”, so my application looks like the screenshot below.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/how-to-switch-os-applescript.png)
* Step 3: Save the script as an application with a name of your choice (I named mine “Switch to Yosemite”). You can then store it in a convenient location, such as on your desktop or in a stack on your dock.
* Note 1: Running the app will throw up an administrator password dialog each time, but this can be avoided by adding in the word “password” and your administrative password in the third line of code. The downside to this is that there’s no stopping your computer from rebooting if you accidentally trigger the application. However, if that’s not a concern for you, skipping the password dialog box is certainly convenient.
* Note 2: The code for booting into Windows on BootCamp is slightly different, as it adds ” -legacy” just before ” -setBoot.” Again, be sure to change the directory from “BOOTCAMP” if your partition uses a different name, and refer to Note 1 for instructions on how to remove the administrative password prompt.
* Note 3: If you keep one or more variations of these scripts in a visible place such as your desktop or dock, you may want to consider changing the application’s icon to something more attractive and “glanceable” than the default AppleScript scroll, which you can easily do with this guide.
* I recommend configuring scripts to switch among all the OSs on your computer and placing them appropriately in each system partition to take full advantage of the convenience this method offers. If you’re feeling adventurous, you might try using Automator to set up triggers for running the script to further streamline your workflow.
* What do you think of this technique? Have you written any scripts of your own? Feel free to send them to timothy@idownloadblog.com or share them in the comments below, and we may feature them in future articles on iDB.

