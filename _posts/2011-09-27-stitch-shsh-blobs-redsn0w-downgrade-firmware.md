---
layout: post
title: How to Stitch Your SHSH Blobs Using RedSn0w to Create Firmware That Can Always Be Downgraded
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/RedSn0w-Stitch.png)
* If you checked out our RedSn0w 0.9.9b1 video walkthrough, you saw for yourself how much of a drastic change the latest version is.
* One of the most compelling features added to the new RedSn0w, is the ability to ‘stitch’ your SHSH blobs to their corresponding firmwares. This makes it so that you have a self contained means of downgrading firmware, well after it stops being signed by Apple.
* Even better, is the fact that it’s completely standalone, meaning you won’t have to do any trickery in order to get iTunes to let you downgrade. By stitching an SHSH blob to a firmware file, iTunes is none the wiser.
* Check out our full tutorial and video walkthrough of this incredibly handy new feature…
* Note: Right off the bat, let me just say that this doesn’t work with the iPhone just yet. On their blog, the iPhone Dev Team states: “Need to work out the baseband part of the restore process…” Since iPhones use basebands, stitching isn’t compatible just yet.
* The good news is, if you’re an iPod touch user, this should work fine for you; I actually created this tutorial using a 4th Generation iPod touch. Theoretically, the iPad Wi-fi should be supported as well, but I wasn’t able to get RedSn0w to recognize my SHSH blobs from my iPad 2.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/01-RedSn0w-Main-Page.png)
* Step 1: Launch RedSn0w 0.9.9b1 and select ‘Extras’
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/02-RedSn0w-Extras.png)
* Step 2: Select ‘SHSH blobs’
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/03-RedSn0w-SHSH-blobs.png)
* Step 3: Select ‘Stitch’
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/04-RedSn0w-Stitch.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/05-RedSn0w-Browse-IPSW.png)
* Step 4: Select ‘IPSW’ and choose your firmware.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/11-RedSn0w-Local.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/07-RedSn0w-Browse-SHSH-blobs.png)
* Step 5: Select ‘Local’ and choose your SHSH blob. Note, you can use a tool like TinyUmbrella to save your SHSH blob(s) to a desktop location.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/08-RedSn0w-Stitching-blobs.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/09-RedSn0w-blob-stiching-done.png)
* Step 6: Wait until RedSn0w finishes stitching the blobs. Upon completion, you will get a message indicating that stitching is complete.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/09/10-Final-Stitched-IPSW.png)
* Step 7: You should now see a newly created IPSW firmware file in the same location as the original IPSW. Save this in a safe location.
* Step 8 (optional): You can now put your device into DFU mode, launch iTunes, and restore to that particular firmware, even though Apple is no longer signing that firmware. You can do this without changing the hosts file, running TinyUmbrella, etc. It’s a totally self-contained firmware file that will allow you to downgrade on a whim.
* As stated, this functionality is not yet available for the iPhone, but feel free to try it out on your iPod touch to see how promising this feature is. You can download RedSn0w 0.9.9b1 from our downloads page.
* What do you think about the new Stitch option? Do you find it as useful as I do?

