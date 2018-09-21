---
layout: post
title: Warning- Lock Saver Free tweak comes with a trojan
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/07/Lock-Saver-Free-Trojan-ModMyi.png)
* Talk about bad timing. Just after I posted about how jailbreaking was relatively safe, here comes news of a trojan that slipped through ModMyi’s review process.
* The tweak in question, Lock Saver Free, is a tweak that we featured in our new tweaks of the week video last night. Lock Saver Free was published by developer dmarinov, and is unfortunately still available for download on ModMyi as of this post.
* Needless to say, it’s highly recommended that you avoid Lock Saver Free at all costs. I actually had it installed on my test iPhone, and confirmed that it did indeed embed a trojan in my /Library/MobileSubstrate/DynamicLibraries/ directory.
* If you installed Lock Saver Free, you should immediately uninstall the tweak and navigate to /Library/MobileSubstrate/DynamicLibraries/ and delete the two offending files: Service.dylib and Service.plist. Even if you uninstall the tweak, it will still leave those two files behind, so you’ll have to manually delete them.
* As developer Allan Kerr explains, because the tweak downloaded Service.dylib at runtime it made /Library/MobileSubstrate/DynamicLibraries/ writeable to all users. The /Library/MobileSubstrate/DynamicLibraries/ directory should have the permissions 755, but due to this tweak, the permissions are changed to 777, which means writable for all users and groups.
* @JeffBenjam @pr1son3r It also makes /Library/MobileSubstrate/DynamicLibraries recursively writable and sends off UDIDs.
* — Allan Kerr (@Dev_AllanKerr) July 25, 2015
* The permissions for /Library/MobileSubstrate/DynamicLibraries/ should be changed back to 755 to prevent processes from adding files to this directory.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/07/0755-iFile.png)
* Use iFile to ensure your DynamicLibraries directory is set to 755 like above
* I personally confirmed that the trojan looked to try to hijack Google ads, most likely with the aim of padding the offender’s ad revenue. It linked to a site with a TLD assigned to the country of Bulgaria, and contained Bulgarian text.
* It’s very rare for a tweak like this to slip through the cracks like this, and it’s very surprising that ModMyi still has not removed the offending tweak. I’ve only seen this a handful of times in the 5+ years I’ve been jailbreaking. It’s unfortunate, especially given the timing, but it is what it is.
* At any rate, if you happened to download this package, you’ll need to take the steps outlined above to remove the trojan.
* What do you think? We’ll have more information about this issue as it becomes available.

