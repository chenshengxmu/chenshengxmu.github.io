---
layout: post
title: How to fix TinyUmbrella v9.3.4 crashing on launch
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/TU-Fix-Header.png)
* Many jailbreakers will be familiar with the program TinyUmbrella, which has traditionally been one of the best ways to save SHSH blobs for their iOS devices onto their Macs for safekeeping. What SHSH blobs are, their function, and how to save them is outside the scope of this article, (I will put something together soon on this), but suffice to say that saving these blobs is of some importance to many jailbreakers and that TinyUmbrella has been the go-to application for doing so for a long while.
* Whilst the application was updated as recently as August by its creator Semaphore, many Mac users (myself included) have noted that the new version, 9.3.4, gives an error on launch and cannot be used at all. This guide will walk you through the fix to get your umbrella back up again on Mac, so you can carry on wishfully saving those blobs. Upon launching v9.3.4 of the application it momentarily begins loading, but then aborts with the following dialogue:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/TU-Fix-Startup-Error.png)
* However, thanks to a fix put together by Twitter user @2Klasic, all is not lost! Some simple file substitutions should be enough to get the program working again and below are the instructions for the fix. I have included steps covering installation of the program for those who do not already have it, or who deleted it after realising it would not launch. If you already have it installed you can skip to step 5 of the process.
* 1) Download TinyUmbrella 9.3.4 from Semaphore’s site. I recommend the version in the sidebar entitled “OSX Installer Bundled JRE” as it simplifies the process for those who may not have the Java Runtime Environment which the program requires.
* 2) Double-click the downloaded .dmg to mount it, and then double-click the installer to run it.
* 3) Go through the installer screens, select an install location, and click “Finish” when it has completed.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/TU-Fix-Installation.png)
* 4) Attempt to launch TinyUmbrella from your Applications folder, and note the crash. This step also creates a folder which we will be replacing later, which is not otherwise there.
* 5) Download and unzip “TU Fix.zip”, which contains the files required for the fix.
* 6) At this point we need to make visible some files which are hidden by default, so launch Terminal from /Applications/Utilities or via Spotlight.
* 7) In Terminal, issue the following command and hit the “Enter” key:
* defaults write com.apple.finder AppleShowAllFiles -boolean true ; killall Finder
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/TU-Fix-Show-Files.png)
* As you can see from the above picture, after issuing the command hidden folders have become visible, including one inside the downloaded folder.
* 8) With the “TU Fix” folder which you unzipped earlier open, open another Finder window showing your home User folder (the one containing your “Movies”, “Pictures”, “Documents”, and so on).
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/TU-Fix-Hidden-Cache.png)
* 9) Locate the greyed-out folder entitled “.tu” in your “User” folder, look inside it for the “.cache” folder, and delete it.
* 10) Copy the “.cache” folder from inside the downloaded “TU Fix” folder, and paste it into the /Users/Username/.tu folder, which you deleted the original “.cache” folder from in step 9.
* 11) Return to Terminal and issue the following command to re-hide your hidden folders:
* defaults write com.apple.finder AppleShowAllFiles -boolean false ; killall Finder
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/TU-Fix-Hide-Files.png)
* Note how the hidden folders which we edited have disappeared again in the above screenshot after issuing the Terminal command.
* 12) Launch TinyUmbrella again and you should be right as rain.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/TU-Fix-Launch.png)
* For those who hope that tools will one day be released for their devices allowing them to downgrade to firmware versions of their choosing, keeping an unbroken chain of blobs for all iOS versions is the name of the game. Because of this, keeping tools like TinyUmbrella in a working condition ready to save blobs within the signing windows is essential.
* Given the relatively minor inconvenience involved in periodically saving your blobs, it seems worth it in exchange for the future possibility of running whichever firmware you please on your device. I’ll be writing another tutorial soon on how to use my favoured tool for saving blobs called (appropriately) “savethemblobs”, but for many TinyUmbrella is just what they need. If you’re one of those people, this guide should help you get back on track.
* Did this method work for you? Do you still bother to save your blobs and what tool do you use? Let me know below.
*  

