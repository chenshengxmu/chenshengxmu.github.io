---
layout: post
title: How to use Extender Installer to automatically re-sign your jailbreak app
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/cydia-extender-installer-beta.png)
* Update: As of the 0.3.2 update, the app is now called Extender: Reloaded, search for that in Cydia instead of Extender Installer.
* Now that Extender: Reloaded has been released for Cydia Extender on jailbroken devices, we’ve had a few requests for a quick guide on how to use it. Look no further! Follow our how-to below to ensure your jailbreak app never needs sideloading from a computer again. At last, your semi-untethered jailbreak is truly semi-untethered.
* 1) Ensure you have sideloaded your jailbreak app from your computer, and that your device is in a jailbroken state.
* If you use an Apple ID with Two-step Authentication turned on, you must log into your Apple ID account and create an application-specific password to use in this step.
* 2) Remove any previous instances of Extender, and any previous instances of modifications of Extender, as they could cause problems. This includes, but is not necessarily limited to, installd OTA Patch, CyExtender Plus, and Ext3nder. Immortal and Karen Tsai’s AppSync are fine to keep, and will cause no issues. I also ran iCleaner afterwards to make sure all leftover files were removed.
* 3) Launch Cydia, and add the following source:
* http://repo.incendo.ws
* Please note, the package will probably be available from a standard repo once it’s out of beta.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/extender-installer-repo-1.png)
* 4) Locate and install the package entitled Extender: Reloaded on the above repo.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/extender-installer-repo-2.png)
* 5) Launch the Cydia Extender application which has been installed to your home screen. Navigate to the More tab, and sign in with your Apple ID.
* Please note, if you are paranoid about entering your Apple ID into non-Apple services, you can set up a throwaway Apple account and use that for this purpose. If you do this, you must also have used that same Apple ID to sideload the jailbreak app from your computer in Step 1.
* If you use an Apple ID with Two-step Authentication turned on, you must use an application-specific password in this step.
* 6) You can leave all the other options as standard in the More tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/extender-installer-configure.png)
* 7) You should get a couple of notifications stating that you are signed in. Relaunch Extender to verify that your Apple ID is showing. Check that your jailbreak app is listed under the Installed tab.
* 8) You can test the re-signing process by going to the Installed tab, and pressing the Re-sign button. It will attempt to re-sign and re-install the app for you, and this will let you see if it works.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/05/extender-installer-resign.png)
* 9) You should get a notification if the re-installation is successful. If you encounter errors, navigate to the More tab, and select Troubleshooting. It offers solutions to common errors, most of which can be solved by using the Revoke Certificates button.
* It took me a few tries to get it going smoothly, revoking certificates and so forth, but it eventually got up and running fine.
* Remember, this tool is in beta, and so may have a few bugs at this point. It will also gain more features and undergo a name change before it’s complete. The tool currently does not run in Low Power mode, so bear that mind if you leave that on at all times on your device.
* Let me know if you have any problems which aren’t covered in the Troubleshooting section of the app, as well as if it works successfully for you!

