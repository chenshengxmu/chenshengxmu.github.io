---
layout: post
title: How to get system diagnostic files on macOS
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/Screen-Shot-2016-02-28-at-11.48.00-AM.png)
* Sometimes when your Mac is doing things you can’t explain, such as in the presence of a bug in macOS, you have no other choice than to report the bug to Apple.
* Many times, the support staff are going to ask you to provide Apple’s engineers with what’s known as a sysdiagnose, which is a special screenshot of your system information and performance at that very moment in time. This information is very useful for bug reporting and troubleshooting as it allows Apple to try and reproduce issues so they can fix them.
* In this piece, we’ll explain what a sysdiagnose is, what it contains, and how to grab one so you can file a proper bug report to Apple when you have issues with your Mac.
* Apple often requests a sysdiagnose whenever you report a bug via Apple’s bug reporter because they need to know everything that was having an effect on your system at the time of the bug so they can reproduce the issue. Without being able to reproduce the issue, Apple engineers will very seldom know what you’re talking about or have any clue as to what could be causing that specific issue.
* A sysdiagnose is essentially a screenshot of your Mac’s state at a particular period in time. It’s not an image file like a traditional screenshot is though; it’s actually a harvest of information, such as what apps were running at the time of the incident, computer resource usage, and much more. As Apple notes on their developer website, the following information is included in a sysdiagnose:
* What sysdiagnose Collects:
* • A spindump of the system • Several seconds of fs_usage ouput • Several seconds of top output • Data about kernel zones • Status of loaded kernel extensions • Resident memory usage of user processes • All system logs, kernel logs, opendirectory log, windowserver log, and log of power management events • A System Profiler report • All spin and crash reports • Disk usage information • I/O Kit registry information • Network status • If a specific process is supplied as an argument: list of malloc-allocated buffers in the process’s heap is collected • If a specific process is supplied as an argument: data about unreferenced malloc buffers in the process’s memory is collected • If a specific process is supplied as an argument: data about the virtual memory regions allocated in the process
* A sysdiagnose is very simple to grab on any Mac. You’ll want to grab a sysdiagnose either while a problem is occurring or immediately after a problem occurs for the best results. To do so, you’ll follow these steps:
* 1) As the problem is occurring, or after it occurs, press the Shift ⇧ + Control + Option + Command ⌘ + Period . keys all at once.
* 2) Your screen will appear to flash, just as it would if you were taking a screenshot on your iPhone, iPod touch, or iPad. This is your Mac taking a ‘screenshot’ of your system at that point in time.
* 3) Wait patiently as your Mac collects and compiles this information into your sysdiagnose archive file. This can take anywhere from 15 seconds to 2 minutes, depending on the speed of your Mac.
* 4) When complete, a new Finder window should launch with focus on the “tmp” folder. You should see your most recent sysdiagnose selected in the window.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/02/Screen-Shot-2016-02-28-at-11.48.00-AM.png)
* Note: If you ever need to get back to this folder, the directory is /Private/var/tmp. Any previous sysdiagnose files will also be recorded here. You can right click on any of them to “Get Info” on the individual files to see which ones are the most recent.
* 5) You can now drag this sysdiagnose file to your desktop, or anywhere else it can be more easily accessed so you can share it with Apple.
* Typically, you would only have to supply this kind of information to Apple if they ask for it. I wouldn’t recommend sending this kind of information off to any third-party app developer or average Joe that you didn’t know very well because there’s a lot of sensitive information contained in these files that could put your privacy or security at risk.
* What kinds of information, you ask? – Oh, you know, just the general run-of-the-mill serial number information and identifiable personal computer information that could be used maliciously.
* Grabbing a sysdiagnose can be one of the quickest and easiest ways to help Apple in responding to one of your bug reports in a positive way. Without one, they won’t have much of a clue as to how to reproduce your issues, so it’s a really handy tool for this purpose.
* Related: Troubleshooting common software issues in macOS
* If you found this tutorial helpful, drop us a comment below!

