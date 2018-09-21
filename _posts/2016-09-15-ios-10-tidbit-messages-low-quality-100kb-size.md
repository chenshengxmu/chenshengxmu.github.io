---
layout: post
title: New low quality mode in iOS 10 Messages uses circa 100KB per sent image
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/09/iOS-10-Messages-low-quality-image-mode-teaser-001.png)
* As you know, iMessage overcomes many of the limitations of standard MMS. Every time you attach an image taken on your iPhone and iPad to an iMessage, it’s delivered in its original size and resolution. Some downscaling may occur, but only for very high resolution images: those taken with an iOS device are always delivered in their original form without any resizing taking place.
* And herein lies a problem for those of you who send a lot of images via a cellular data connection.
* Knowing a typical photo taken on an iPhone 6s weighs in at between three to five megabytes (or even more), it does add up pretty quickly. If you’re concerned about cellular data consumption (as you should be), pay attention as Messages on iOS 10 offers a brand new low quality mode.
* We’ve determined it downscales images sent through iMessage to circa 100 kilobytes each. In other words, for the amount of data you’d normally spend to shoot someone a single photo via iMessage you get to send 30 to 50 images in low quality mode.
* You can enable it by sliding the Low Quality Image Mode knob in Settings → Messages to the ON position. The wording of this cool new feature makes it clear it only applies to the images you send to others, not the ones you receive.
* “When this is on, images sent will be lower quality,” states Apple.
* Again, it has no bearing on images other folks send your way via iMessage unless they too have low quality mode set to ON. In testing this mode, Sebastien and I first saved a 17.2-megabyte 8,000-by-8,000 NASA image of the Earth to our photo library.
* Next, we sent the image to one another with low quality mode set to ON, then OFF.
* Our conclusion: Messages low quality mode downscales and recompresses every image you send to circa 100 kilobytes in size. No matter the original resolution, what gets sent is a downscaled image file about 100 kilobytes in size, give or take a few kilobytes.
* Actual image size and compression is determined based on the quality and size of the original photo. Messages does a very nice recompressing job because most people won’t see any discernible difference in quality unless they pinch-zoom on the image.
* To be clear, I would’ve preferred more granular options for adjusting target file size/resolution range for low quality mode, but it’s a solid improvement versus before that should keep us occupied until Messages implements Low, Middle, Full and Original downscaling options like Mail does.
* I know what you’re thinking—this excerpt from the iPhone user manual:
* With iMessage or MMS, you can send messages with photos, videos, and audio. Your carrier determines the size limit of attachments; iPhone may compress photo and video attachments when necessary.
* While your carrier has a say over MMS delivery, it’s got nothing to do with end-to-end encrypted iMessage content. To your carrier, iMessage is just data traffic.
* You might be wondering, why doesn’t Messages new toggle work both ways, even if enabled on just one device? If you set it to ON and I have it OFF on my end, any images you send my way will be circa 100KB in size each, as they should be.
* But if I send you an image, you shall receive its full-resolution version even though you have low quality mode enabled—again, it only affects images you send from your device, not the ones you receive.
* It would be great if it worked for both images you send and receive, but I suspect strong encryption built into iMessage makes that technically infeasible.
* Images would need to be downscaled by the server, not on the sending device. The problem is, Apple cannot see your iMessages. While each iMessage is dispatched to the Apple Push Notification service for delivery, we know for a fact from the iOS Security Guide that Apple does not log any messages or their attachments.
* The contents of each and every iMessage is protected by end-to-end encryption so no one but the sender and receiver can access them. Apple cannot decrypt any iMessage data in transfer (unless we’re talking about Messages history in your iCloud backup, but that’s a topic for another post), so there’s that.
* Taking it all in, Messages new low-quality image mode will be a godsend for those people who obsess over their cellular data usage. And those of you who may need to send a very high resolution photo (12+ megapixels) but are concerned about iMessage downscaling to 4,096-by-4,096 resolution, consider using iOS’s Mail Drop feature in Mail which lets you send emails with encrypted attachments up to 5GB in size.
* Will you be using Messages low quality image mode now that you know all this?

