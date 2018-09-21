---
layout: post
title: How to boot your Mac in Verbose Mode
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/08/OS-X-Verbose-mode.jpg)
* We previously discussed how booting your Mac into macOS’ Safe Mode can help troubleshoot various issues with your computer. In more obscure situations and borderline cases, however, Safe Mode may not be enough to understand why your Mac freezes or crashes during the system boot process.
* Enter macOS Verbose Mode.
* Not only does Verbose Mode makes it easy to access detailed status messages as your Mac is starting up, but also lets you see what’s really going on behind the scenes and watch as macOS loads kernel extensions and other startup items.
* In this tutorial, we’re going to cover booting your Mac in macOS’ Verbose Mode, explain in which situations it might come in handy and give you some handy tips related to using Verbose Mode.
* Verbose Mode is like normal booting mode, with one exception: instead of watching the progress bar filling or the spinning indicator spinning, it gives you peek under the hood and see the output of what’s happening every time the system starts up.
* As such, Verbose Mode is useful for troubleshooting software issues you may be experiencing with macOS or third-party apps. It’s also indispensable for software development.
* To startup your Mac in Verbose Mode, follow these simple steps:
* Step 1: If your Mac is on, turn it off by choosing Shut Down in the Apple menu.
* Step 1: Now press the power button to start your Mac.
* Step 1: Right upon hearing the startup chime, press and hold the Command (⌘) – V key combination for Verbose Mode.
* You’ll know that you have successfully entered Verbose Mode when you see white text appear on the screen as if you were in the MS-DOS text mode from the 1980’s, as depicted on the screenshot at the top of the post.
* You will automatically exit Verbose Mode when the Mac’s startup process progresses sufficiently and the macOS login screen or desktop appears.
* Tip: If your Mac does not progress beyond Verbose Mode, just press the power button until it shuts down. If your Mac is connected to a faulty external keyboard causing it to detect a wrong key press during boot, unplug the keyboard when booting, use your Mac notebook’s built-in keyboard, or hook up another wired or wireless keyboard.
* Normally, hitting Command (⌘) – V starts up your Mac in Verbose Mode until next restart.
* Making macOS always boot into Verbose Mode involves a little bit of Terminal trickery to adjust your Mac’s firmware with the ‘nvram’ command.
* Step 1: Navigate to your Mac’s Applications > Utilities folder and open the Terminal application. Alternatively, click the Spotlight icon in the menu bar and search for ‘terminal’.
* Step 1: Type the following command into the Terminal window and hit Return. You might need to provide your Mac’s administrator password.
* sudo nvram boot-args="-v"
* Executing this command will ensure that every system boot from now on is in Verbose Mode, whether you invoke it manually upon hearing the startup chime or not.
* Step 3: To disable automatic booting in Verbose Mode, execute the following command in Terminal:
* sudo nvram boot-args=""
* Now macOS will start up normally at each booth unless of course you hit the modifier keys immediately upon hearing the system’s boot chimes.
* Tip: Using Terminal can be a nice shortcut for starting up a remote Mac in Verbose Mode, especially if it doesn’t have a keyboard attached to it. Just log into a remote Mac using SSH and execute the aforementioned Terminal command.
* Verbose Mode is no different than macOS’ normal booting mode.
* In a nutshell, Verbose Mode replaces the startup graphics with a text-only mode to show you everything the computer is doing during the boot process. All Startup Items and Login Items are loaded normally in Verbose Mode, as are required kernel extensions, user-installed fonts, drivers and so forth.
* Some of the situations that warrant booting into Verbose Mode include:
* Again, as no feature is disabled or crippled in Verbose Mode, feel free to use it without fearing that booting in this mode will limit what you can do on your Mac.
* If you’re having issues entering Verbose Mode, or it’s not helping fix issues your Mac may be exhibiting, try the following:
* Because Startup Items and Login Items are disabled in Safe Mode and certain features are turned off, such as native display drivers, advanced Wi-Fi and file sharing, some apps might not work correctly in Safe Mode.
* If you like this tip-to, please pass it along to your friends.
* Have a great tutorial idea?
* Feel free to submit your suggestions to tips@iDownloadBlog.com and we’ll take your best submissions into account for future articles.

