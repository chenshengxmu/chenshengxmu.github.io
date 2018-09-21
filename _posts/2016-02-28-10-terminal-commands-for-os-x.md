---
layout: post
title: 10 fun and useful Terminal commands for macOS
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/terminal-app-icon-OS-X.png)
* Terminal is a powerful tool that comes with macOS. It allows you to input commands and get output from your operating system.
* Although Terminal, which is a command line interface (CLI), is powerful and often times even more powerful than a graphical user interface (GUI), it’s often under-used because either people don’t take the time to learn commands, or they are too afraid to dabble in commands because one typo and you could mess something in your system up.
* Fortunately, not all commands are scary. In this piece, we’ll show you ten commands you can perform with Terminal that could be of use to you now, or in the future.
* 1. Check server response
* Ping is probably one of the more useful Terminal commands that an everyday Mac user might actually use. This command lets you check the response of a domain or IP address, such as “www.google.com” and see how quickly it takes for the server to respond.
* To perform a Ping command, you’ll enter the following in Terminal:
* Note that you can replace the URL with any website URL you want to, or use an IP address instead.
* 2. Disable screenshot shadows
* You can easily toggle off screenshot shadows when you take a screenshot of a specific window on your Mac by using the following command:
* What this command does is it changes the boolean variable related to disabling drop shadows from the screen capture configuration file on your Mac from false to true so that drop shadows no longer appear.
* After the following command, you’ll use this one to save your changes:
* This will restart critical services on your Mac to save your changes. If you ever want to re-enable drop shadows in your screenshots, you can perform the above commands again, except you’ll replace “TRUE” with “FALSE” instead.
* 3. Show hidden files in Finder
* Terminal also provides you with an easy way to show all hidden files in Finder. It’s done with the following command:
* After making this change, you’ll have to restart finder, which can be done with the following command:
* Now, when using Finder to search for files, even files that were normally hidden to protect you from making unintentional changes that could potentially damage your system, will be displayed.
* You can also easy hide hidden files once again by repeating the above commands, except replacing “TRUE” with “FALSE” instead.
* 4. Make your Mac say anything you want
* You can also use Terminal to have your Mac say anything you want. If you want your Mac to say something out loud, you can use the “say” command, followed by whatever it is you want your Mac to say. Here’s an example:
* In this example, your Mac will say exactly what is in the quotes using the default system voice.
* 5. Keep your Mac from falling asleep
* Terminal comes with a way to keep your Mac from falling asleep, dimming the display, or showing the screensaver. Simply use the following command:
* With this command having been used, your Mac will act like it just drank a venti-sized coffee at Starbucks. You can also set time periods up so the command is only active for a temporary period of time. To do this, add the “-t” flag, followed by a number of seconds you want the feature to be enabled for, like this:
* In this example, our Mac would stay awake for 150,000 seconds, and then after that time period, the command would be auto-disabled. You can also press Control + C to end the command early at any time.
* 6. View and clear your Terminal command history
* If you ever want to see what Terminal commands you’ve entered in the past, fortunately Terminal keeps a history and you can always check back with the following command:
* Once you enter it, you’ll see all of the commands you’ve used, or anyone else using your Mac may have used. It also makes it easy to copy and paste long commands you may have entered previously that you don’t feel like typing out all over again.
* If you ever wanted to delete your command history from Terminal, you could just use the following command instead:
* After entering this command, your history will be deleted and no one will be able to pull up your command line history to see what commands you’ve used.
* 7. Stress test your Mac
* If you suspect your Mac’s fans aren’t working right or that your system can’t keep up with demand like it should, you can stress test your processor using Terminal with the following command:
* If you have a multi-core Mac, you’ll need to type the command several times over to match the amount of cores you have before you press return. For example, if you have four cores, then you’ll type the command 4 times in a row before pressing return, like so:
* You can launch Activity Monitor on your Mac as a bonus to watch your CPU start to crank up. You can end the stress test at any time with the following command:
* If you suspect you have a faulty fan, this is a good time to listen for grinding. Moreover, it can be used to see if your process is choking too early when it should be able to handle more of a load.
* 8. Enable an iOS-like power chime when connected to power
* Although your Mac is usually quiet when you plug a power source into it, your iOS devices all make a chime noise when you plug them in to indicate that they’re charging. With Terminal, it’s possible to enable this feature on your Mac as well with the following command:
* Now after tapping the return key, the chime will be enabled. You can also disable the chirp at any time with the following command:
* It’s a nice little audible sound to hear when you know the power connection is connected, but it really comes down to opinion on whether or not to enable it.
* 9. Check for macOS updates more often
* Your Mac is configured out of the box to check for updates for OS X and your Mac App Store apps on a weekly basis, but you can change that with Terminal. For example, if you want your Mac to check for updates daily instead, enter the following command:
* You can change the integer to any amount you want – the number represents the amount of days your Mac will wait to check for updates, so if you wanted to return back to the default weekly check, you’d use the following command:
* Now, you can notified of your important app updates and macOS updates much more frequently than before.
* 10. Set your Mac’s screensaver as the wallpaper
* If you’re in the mood for some eye candy, you can set your current screensaver as your Mac wallpaper temporarily with Terminal by using the following fun and quirky command:
* This will make your current screensaver the desktop wallpaper for as long as the command is running. If you close the Terminal app or use the Control + C shortcut, then the wallpaper will return to normal.
* Terminal is a very useful tool in macOS that is under-used by Mac users. Sometimes macOS’ System Preferences app just can’t give users all the options they need access to, and Terminal is a great way for a user to really take control of their system and make changes to their own liking. Moreover, it makes a great tool for troubleshooting and performing actions, not just customizing things.
* If you found this tutorial helpful, let us know in the comments below.

