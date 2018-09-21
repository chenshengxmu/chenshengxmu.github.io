---
layout: post
title: How to Install Hulu on Your Apple TV for Free
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/Hulu-Apple-TV-Free-e1326475187872.jpg)
* Yesterday we showed you how to get Hulu on your Apple TV. It worked well, but the method used had some costs involved.
* Today, we’ll show you how to get Hulu on your Apple TV completely free of charge. That’s right, for zip, nada, zilch.
* Granted, if you want to access all of Hulu’s content, and not just their free offerings it will still require a Hulu+ subscription, but the installation is no longer hindered by costs. Here’s how to do it:
* Step 1: Jailbreak Your Apple TV using our Seas0nPass jailbreak tutorial.
* Step 2: Setup your Apple TV for network access, and document your Apple TV’s IP address. Settings > General > Network.
* Step 3: SSH into your Apple TV using the following command in a terminal window: ssh root@ipaddressofyourappletv
* Remember you must change the ipaddressofyourappletv to the real ip address that you identified in step 2.
* If it asks you about storing RSA keys type yes and press return.
* Enter your password: “alpine” without quotes and lowercase.
* Step 4: Once you have SSH’d into your Apple TV, enter the following commands one by one. See the video for more details:
* apt-get install org.xbmc.xbmc-atv2
* Step 5: Verify that your Apple TV reboots, and that the XBMC option is now available on the menu selection screen.
* Step 6: Download the repository.bluecop.xbmc-plugins.zip file and store it in your Downloads folder. Do not extract the file, keep it zipped.
* Step 7: At a terminal navigate to your downloads folder by typing cd Downloads and type the following: scp repository.bluecop.xbmc-plugins.zip root@ipaddressofyourappletv:/private/var/mobile/repository.bluecop.xbmc-plugins.zip
* Remember you must change the ipaddressofyourappletv to the real ip address that you identified in step 2.
* Step 8: Start XBMC and go to System > Settings > Add-ons > Install from zip file > Home folder > select the repository.bluecop.xbmc-plugins.zip file that we transmited to the Apple TV in step 7. You should see a message in the bottom right-hand corner that says “bluecop Add-on Repository Add-on enabled”. Now, exit XBMC and restart XBMC.
* Step 9: At your XBMC main menu go to Videos > Add-ons > Get More… > Hulu > Install.
* Step 10: Go back to the Add-ons > Get More > Hulu and select Configure. Here you can enter your Hulu+ username and password as well as setup resolution and steaming options.
* Step 11: Go back to Add-ons > Hulu and start watching!
* Note: We highly recommend that you watch the video to get a good idea of what this all involves. The steps may seem like a lot, but you can honestly do this in 10-15 minutes tops. It’s extremely easy, and well worth it. Not only do you get Hulu, but you get Amazon, ESPN, and a boatload of other content.
* Special thanks to BlueCopter for creating this repository plugin for XBMC, and for pointing us in that direction in the comments of our original Hulu tutorial.
* What do you think? Are you going to give it a shot?

