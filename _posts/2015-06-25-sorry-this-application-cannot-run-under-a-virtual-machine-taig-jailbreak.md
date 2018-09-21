---
layout: post
title: How to fix the dreaded virtual machine error when attempting to run the TaiG jailbreak
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/Sorry-this-application-cannot-run-under-a-Virtual-Machine-TaiG-Jailbreak.png)
* In a previous post, I lamented about the fact that I received a dreaded virtual machine error when trying to run the TaiG jailbreak tool on VMware Fusion 7. The error went something like this: Sorry, this application cannot run under a Virtual Machine.
* Not only is that totally ambiguous, but it really didn’t make much sense when you consider that the prior TaiG tool ran with no problems. After trying a few solutions I found via Google, I resigned myself to the fact that I would probably just have to settle and use the old tool instead..
* Fortunately, however, one of our awesome readers has come though with a fix. Mohamed Elkady shared this interesting little trick to help bypass a frustrating error. In this post and video, I’ll walk you through the entire process step-by-step.
* Step 1: Shut down your virtual machine completely
* Step 2: Open the virtual machine folder in ~/Documents/Virtual Machines/
* Step 3: Right-click on your virtual machine and select Show Package Contents
* Step 4: Find the file with the .vmx file extension
* Step 5: Right-click → Open With → TextEdit
* Step 6: Scroll to the bottom of the file and write the following on a new line: monitor_control.restrict_backdoor = "true" Step 7: Save the file
* Step 8: Launch your virtual machine
* Step 9: Run the TaiG tool
* That’s all there is to it. It literally takes no more than 5 minutes to complete this fix.
* What do you think?

