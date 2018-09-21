---
layout: post
title: JailbreakMe for Pangu 9.3.3- details and tutorial
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/JailbreakMe-Examined-Header.png)
* As reported recently on iDB, Luca Todesco has decided to solve the certification problems which have plagued the most recent Pangu release for 9.2-9.3.3, by making public a web-based tool for re-activating the jailbreak.
* After doing some testing and research it seemed appropriate for a more in-depth discussion of the tool, along with a walkthrough, in order to address some of the more technical questions surrounding this latest development in the jailbreaking scene.
* Before we go through how to use the tool, here are a few more events which have occurred since its release.
* Firstly, Todesco updated the website to use https instead of http, as a precaution against man-in-the-middle attacks. He also made small updates to the tool itself, modifying the respring code to use a version of Pangu’s (which he claims is slightly less reliable, but cleaner), and enabling HTML5 web app caching. The upshot of this last development is that if you add the webpage to your homescreen on iOS it will now be cached, meaning you can use it at a later date without any Internet connection. This is a very useful update and it removes the last functional difference between his tool and the original Pangu app.
* The use of Pangu’s respring code suggests some level of co-operation between Todesco and the team, especially as he has mentioned that it uses a new version of the Pangu9.3.3 SDK, which he apparently has access to. Thanks to this SDK, the equivalent of a “tfp0” patch called “host_get_special_port” is enabled, which is required for many advanced tools, such as ones which save on-device blobs and downgrade devices. A nod to Todesco can also be found on Pangu’s official website, where they seem to advocate using his method from now on in place of the previous certification methods.
* In terms of the make-up of the tool, some more information has now been confirmed by Todesco. He has said that the exploit used is indeed an implementation of the WebKit bug which formed part of the three zero-day vulnerabilities dubbed Trident. Most likely CVE-2016-4657, the bug allowed a website to be crafted in such a way as to allow arbitrary code execution upon interaction with it. This was utilised in the wild as part of the Pegasus spyware, and was patched in iOS 9.3.5, meaning Todesco’s web exploit works only up to iOS 9.3.4 (more on this later). For more information on this set of bugs, I recommend the write-up from Lookout, one of its discoverers.
* One last thing about the tool’s construction is revealed by an inspection of the page’s source code. Here we find its licensing terms and some of the Wu-Tang magic that makes it go:
* For those interested in these light-hearted legal stipulations and what exactly the license entails, the full document is available to peruse. As for “Da Mystery of Chessboxin”, your guess is as good as mine.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/JailbreakMe-Page-Source.tiff)
* 1) Ensure your device is in “non-jailbroken mode”, that is, has been rebooted and not re-activated with the Pangu app.
* 2) Open mobile Safari and visit the following URL:
* https://jbme.qwertyoruiop.com
* Please note, this only works in the standalone Safari app, and not in-app browsers. Trying to follow the link via an app (for example Twitter or Reddit) results only in a blank screen.
* 3) Press the “go” button on the page, and wait whilst the page responds with “doing it”.
* 4) When the pop-up appears, follow its instructions to dismiss the pop-up, and then press the screen-off/lock button on your device.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/JailbreakMe-Walkthrough.png)
* 5) The device will now become unresponsive whilst it resprings. Please note that this seems to take longer than with the Pangu app, and no Apple logo or respring animation will show while it progresses, so be patient.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/JailbreakMe-Respring-Alert.png)
* 6) Once the device has resprung it should be jailbroken again. Verify by checking any of your chosen tweaks are functioning.
* 7) Open Safari again and revisit the tool’s page. Once on it, press the “Share” button at the bottom of the screen and select “Add to Home Screen”. Pick a name for it and then press “Add” in the top-right. The page is now added as an icon to your Home screen for easier use in future and, as mentioned above, can be used without internet.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/JailbreakMe-Homescreen-Add.png)
* Todesco is aware that whilst he is not the creator of this exploit, his release of the tool makes knowledge of the vulnerability more widespread. Consequently, people might use the vulnerability on seemingly innocuous websites to attack people’s devices without their knowledge. He has therefore, along with his tool, released a patch which will protect against the very vulnerability his tool exploits. It is advisable that everyone who is jailbroken with the Pangu 9.3.3 jailbreak tool install this patch immediately. It will protect you from similar attacks whilst you are in your jailbroken state, and its source code can be freely examined if you wish.
* 1) Launch Cydia and navigate to the “Sources” tab.
* 2) Hit the “Edit” button in the top-right, and then “Add” in the top-left.
* 3) In the field which comes up, enter the following repo URL (the same as the one for the exploit webpage):
* https://jbme.qwertyoruiop.com/
* 4) Press the “Add Source” button, to add Todesco’s repository.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/JailbreakMe-Cydia-Repo.png)
* 5) Once the source has populated, use Cydia’s search tab to look for “jbmepatch”, and select it.
* 6) On the package page, press “Install” in the top-right, and on the following page touch “Confirm” in the top-right to install.
* 7) When the installation is complete, press “Restart SpringBoard” to respring and activate the patch.
* 8) You can test the patch by attempting to use Todesco’s tool again after your device has resprung. It should no longer have any effect.
* Remember that the patch can only protect your device whilst it is in its jailbroken state. If you reboot your device you will not be protected by the patch until you re-activate your jailbreak with JailbreakMe or the Pangu app, so be careful which URLs you visit whilst in un-jailbroken mode. Just as the JailbreakMe tool does not work on 32-bit devices, neither does the patch; do not attempt to install it on a 32-bit device.
* All that remains to comment on is the future potential of the tool, as many people have been exploring the topic. The web-based exploit that Todesco uses was patched in iOS 9.3.5, so you’re out of luck if you were hoping that this would result in a >9.3.4 jailbreak, including iOS 10. However, it does imply that the exploit works on 9.3.4. Whether this fact means that an extension of the Pangu jailbreak to devices on 9.3.4 is possible is unclear, because whilst the WebKit exploit to deliver the payload works, the actual jailbreak payload itself is not for 9.3.4. It is not as simple, as some have been suggesting, as running Todesco’s tool on 9.3.4 and then side-loading Cydia, as many of the other requirements are still not met. It remains to be seen whether it can now be modified to include that firmware.
* The other two points of interest are an untether, and 32-bit support. These are clearer. Todesco has stated that both of these are possible; Pangu’s jailbreak can be ported to 32-bit devices, and an untether for the payload injected by his tool could be created. However, he has not confirmed that he is working on either of these things, nor that he has any interest in doing so. We will simply have to wait and see if he or Pangu has the time or inclination to provide them, but I wouldn’t get my hopes up. Interest in supporting 32-bit devices is low and waning, and efforts are bound to be focussed on trying to develop an iOS 10 jailbreak over developing an untether for a now unsigned firmware.
* Have you used JailbreakMe 9.3.3? Do you expect to see 32-bit support or an untether? Let me know in the comments.
*  

