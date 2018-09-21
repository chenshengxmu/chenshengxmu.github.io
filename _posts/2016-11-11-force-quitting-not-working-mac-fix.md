---
layout: post
title: Force quit not working on your Mac? Try this
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Mac-Spinning-Wheel.jpg)
* When an app is dragging its feet on your Mac, you can force quit the app and try opening it again and usually this clears the problem. On the other hand, there can sometimes be circumstances where even trying to force quit an app doesn’t seem to work. Bummer, right?
* If you’re having trouble trying to force quit an app on your Mac, we’ve got some ideas you can try to kill that app and re-launch it.
* A lot of the time, this can happen when an app isn’t well built. When this happens, all kinds of havoc can be wreaked on your hardware that makes it tough for your Mac to process the tools necessary to force quit an app. Memory leaks can be a big source of these kinds of issues.
* Such behavior is common in apps that haven’t been properly updated for new operating systems or are incompatible with other apps running on the system.
* In other situations, you can sometimes chalk the problem up to nothing more than a temporary glitch that you’ll never see again.
* Regardless of what’s causing this headache, if you’re unable to force quit an app with the Command + Option + Esc keyboard shortcut or with the Dock app icon shortcut, then you can try one of the following troubleshooting options instead:
* Activity Monitor is a great alternative method for force quitting an app. To do that, follow these steps:
* 1) Launch Activity Monitor and open the CPU tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Activity-Monitor-1.png)
* 2) Find the app in the list of processes that’s frozen and click on it to Select it.
* Pro tip: click on the Process Name tab at the top of the app to sort the processes by alphabetical order.
* 3) Click on the Close button at the top left of the Activity Monitor app.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Activity-Monitor-2.png)
* 4) When asked if you’re sure you want to quit the app, click on the Force Quit option.
* The app should now immediately close on your Mac. If not, try another method below.
* Not everyone is comfortable using a command line interface, but they can be one of the most effective ways of getting things done. To force quit an app with Terminal, follow these steps:
* 1) Launch the Terminal app on your Mac.
* 2) Type in the following command, then strike the Return key on your keyboard:
* ps -ax
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Force-Quit-App-With-Terminal.png)
* 3) Terminal will now show you a list of processes running on your Mac. Find the app that’s frozen, and take note of the PID number shown to the left of the app.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Force-Quit-App-With-Terminal-PID.png)
* 4) Next, type in the following command, then strike the Return key on your keyboard:
* kill <enter PID number here>
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/Kill-PID-number-Mac.png)
* In this case, Skype is running with the PID number 1973, so we would enter “kill 1973” into the command line and hit Return.
* As soon as you strike the Return key, the app should force quit. If not, try the following command instead:
* kill -9 <enter PID number here>
* So once again, in this case Skype has the PID number 1973, so we would enter “kill -9 1973” into Terminal and hit Return.
* The app should now force quit.
* Honestly, I’ve never had an app that made it any further than this, so if you fail to force quit an app with Terminal, I think you have a bigger problem. Nevertheless, if this didn’t work for you, try the next step instead.
* If nothing above worked, then there isn’t much you can do apart from pulling the plug and rebooting. However, you can’t just shut down your Mac like you normally would, because macOS is going to wait for the app to respond before it turns off your computer.
* Instead, you will need to forcefully shut down your Mac. You can do this by pressing and holding the Power button your keyboard surface (if you have a notebook) or by unplugging your Mac from the power adapter (if you have a desktop).
* Your Mac will turn off. Give it about 10 seconds to cool down from the stuck app, as the CPU is undoubtedly on fire right about now.
* After you let it sit for a few seconds, go ahead and power your Mac back on again. While you’re at it, it may not even be a bad idea to reset your NVRAM while it boots back up.
* Hopefully by trying the three alternative troubleshooting steps above, you’ve managed to put an end to the frozen app on your Mac. If it continues to act up, there’s not a whole lot more you can do personally. However, you can:
* I would hope you wouldn’t need to escalate to the solutions above, but software can be a crazy thing to try to understand sometimes, and this makes troubleshooting a pain in the Mac.
* You might also be interested in:
* Were you able to get your frozen apps closed by following these steps? Share in the comments below!

