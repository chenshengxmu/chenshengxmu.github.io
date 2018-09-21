---
layout: post
title: LS Climacons, a tranquil theme for your Lock screen
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/03/LSClimacons.png)
* Well it’s Monday and most of you are returning to work or school and gearing up for the week ahead. What’s going to help, you ask? Well another theme post from your friends over at iDB of course! In this series we lay out instructions on how to turn that boring stock Lock or Home screen into a beautifully crafted setup. The Lock screen has been neglected by Apple long enough so lets make it feel special for once.
* Let’s get started…
* Step 1: Download Winterboard (free). If you haven’t guessed by now, this Lock screen does require Winterboard so go ahead and download that from Cydia. This theming engine is a powerful yet low memory-consuming app (if you don’t have an excessive amount of themes enabled), from Saurik.
* Step 2: Download Lockscreen Clock Hide (free) from Cydia. This app hides the default Lock screen clock and its background. You configure this tweak in the default settings app in the “tweaks” section.
* Step 3: Download an SSH program for desktop or iFile from Cydia. We will be using one of these to change things like wallpaper and weather locations.
* Step 4: This step is a little different/harder from our previous tutorials. Normally you would go into Cydia and download the theme from there but LS Climacons isn’t in Cydia. In order to get this Lock screen you need to download one or both of these files. The picture above on the left is LS Climacons Light (download link) and the one on the right is LS Climacons Dark (download link).
* Step 5: Once you have the version you want open up your SSH program and navigate to var/stash/Themes.***** and place the Lock screen folder you just downloaded in there.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/03/LS-Climacons-Light.png)
* Step 1: Open the LS Climacons (light or dark) folder you just placed in var/stash/Themes.***** and open LockBackground.html in text form using either the iFile “Text Viewer” option or a text edit program on your desktop.
* You will see var locale = “GMXX3324” and you will need to change GMXX3324 to your zip code.
* Step 2: To change the clock from 24 to 12 hour format simply open the LockBackground.html with a text editor again and find line 421 or search for this line of code- “12-hour format if needed” with the magnifying glass.
* Step 3: replace the “0” shown in the screenshot below in “currentHours = ( currentHours > 12 ) ? currentHours – 0 : currentHours;” with a “12”.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/03/LSClimaconsiFile.png)
* Note for international users: head on over to the developers Deviant Art page for instructions on how to change the weather for those outside of the US as well as how to change the clock to 24 hour format.
* Step 1: In the same theme folder where the LockBackground.html file is, you will see image files. One of these files is named LockBackground.png and this file is what will show up as the wallpaper on the Lock screen. The developer included some extra walls listed as LockBackground2 and LockBackground3 as well.
* Step 2: To change the wallpaper to a picture of your own navigate to the theme folder on your desktop and place your picture with the size 640×1136 in the LS Climacons folder. Move the default LockBackground.png to your desktop (for backup) and then rename your picture to LockBackground.png once in the theme folder.
* Step 1: Now that you have the weather changed to your location and a wallpaper you fancy, head on over to Winterboard. Once there open “Select Themes” and tap LS Climacons (Light or Dark Version), and respring.
* Step 2: Look down on the beautiful setup you’ve just accomplished, go ahead… take a minute, enjoy!
* You made it! Setting up Lock screens and other themes on your iDevice can be a little complicated but hopefully these guides help you through it. The trick when learning to use the filesystem to your advantage is to just take your time and follow these guides step by step. Do that and you’ll be golden.
* Finn Kraft is the developer of LS Climacons and I think we can all agree he did a wonderful job. If you have any issues please post in the comments section and we will try to help.
* Have a Lock screen or Icon/UI theme you think should be featured here? Leave a comment or contact me on Twitter @Max_Kas and be sure to let us know what you think of the this Lock screen in the comments below.

