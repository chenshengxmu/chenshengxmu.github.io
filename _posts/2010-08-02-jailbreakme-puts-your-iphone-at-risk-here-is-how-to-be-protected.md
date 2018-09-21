---
layout: post
title: JailbreakMe Puts Your iPhone At Risk. Here is How to Be Protected
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/08/PDF-Fix-For-JailbreakMe.jpg)
* JailbreakMe was released yesterday and as we said, it is one of the easiest and quickest jailbreaks. However, it is also one of those jailbreaks that really puts your iPhone at risk.
* The way JailbreakMe works is that it takes advantage of a vulnerability in iOS, and more specifically the fact that iOS downloads PDF documents automatically. Comex managed to inject the jailbreak code in a PDF document that is downloaded and executed once you “slide to jailbreak” on JailbreakMe.com.
* Now that this very simple exploit has been revealed, there are chances some bad guys out there might want to take advantage of it and potentially steal data from your iPhone. Before you start panicking and running around the house screaming, let’s be clear that the chances of this happening are actually very thin, but you never know…
* MacStories published a fix for that earlier today:
* Tweeted by @cdevwill earlier today, all you have to do is download this .deb file and open it on your device using either Terminal from your Mac, or iFile on the iPhone. Just download it and place it in /var/mobile.
* – Using Terminal:
* ssh root@your IP address
* alpine
* dpkg -i file.deb
* Where “alpine” is the default password you’ll get after installing Open SSH from Cydia and “your IP address” is located under Settings – > Wifi – > active wifi connection.
* – Using iFile:
* Navigate to /var/mobile and double tap on the .deb file to install it.
* This won’t actually patch the exploit but it will now ask you for permission every time a PDF document wants to be downloaded to your iPhone. If you know what you’re downloading then fine. However if a site tries to use Comex’s exploit and downloads some malicious software onto your iPhone, you will be able to deny it access.
* I believe this fix will be available in Cydia soon but if you can’t wait, and know your way around Terminal, then give this a shot. Apple will also issue a patch for this, most likely in the net iOS update.
* If you use this method to secure your iPhone, please don’t forget to share your thoughts in the comments.

