---
layout: post
title: How to install .deb files
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/06/Untitled-1.png)
* While Cydia is a decent hub for all of the available jailbreak apps and utilities, there’s no arguing that dealing with the clunky package installer can be a bit cumbersome at times.
* For folks that weren’t aware, you can manually install jailbreak apps and tweaks without ever opening Cydia. All you need is the .deb file of the package you want to install, and an FTP client like iPhone Explorer or Cyberduck.
* In this tutorial, we will show you how to manually install a .deb file on your iPhone, iPad, or iPod touch.
* It’s fairly likely that you’ve come across one of our posts in the past that discussed a tweak or app that wasn’t in Cydia for one reason or another. In this case, some developers provide a link to a downloadable .deb file.
* Placing this file into the correct folder on your iDevice will automatically install the package, bypassing Cydia. This allows for much quicker package installations, and enables you to install multiple items (like themes) at a time.
* This guide assumes you know how to SSH into your iDevice. If you need a refresher, check out our easy SSH tutorial.
* Step 1. Launch your SFTP client (I’m using Cyberduck) and login. Navigate to /var/root/Media on your iDevice. If you don’t already have a Cydia folder there, make one.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/06/deb-install-tutorial-e1308210949756.png)
* Step 2. If you already had a Cydia folder, open it and find the AutoInstall folder. If you didn’t, just open your newly made Cydia folder and create another new folder entitled AutoInstall.
* Step 3. Locate the .deb file(s) you’d like to install and place them in the AutoInstall folder. Once copying is complete, restart your iDevice — twice. After the 2nd restart, the new packages should show up on your springboard and in Cydia.
* That’s all there is to it! The cool thing is, with apps like iFile, you can do this all on your phone with no need for a computer. Imagine having a .deb file for every one of your favorite packages, restoring would take a fraction of the time.
* Do you manually install packages, or do you use a package installer like Cydia? Let us know if this tutorial was helpful for you in the comments!

