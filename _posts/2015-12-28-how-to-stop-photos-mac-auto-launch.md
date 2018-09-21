---
layout: post
title: How to stop Photos from launching when connecting a device to your Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/02/Photos-Mac-iPhone-iPad-teaser-001.jpg)
* With Photos for Mac, you can import your photographs from a variety of sources, including digital cameras, iOS devices, storage media, SD memory cards, iCloud Photo Streams and other apps.
* By default, when you connect a camera, iOS device or other mobile device to your Mac, Photos’ hot-plug feature kicks in and automatically launches itself so you can start importing your photos from there.
* Thankfully, there’s a setting to stop Photos from automatically opening when a specific device is connected to your computer. Additionally, other methods exist to stop the program from launching for all devices connected to your Mac.
* In the tutorial, we’ll be explaining both methods so you can choose to selectively prevent specific or all devices from prompting Photos to open.
* Step 1: Open Photos on your Mac.
* Step 2: Click Import in the toolbar at the top of the Photos window.
* Step 3: Connect a camera, your iPad, iPhone or other iOS device to the computer with a USB cable and make sure the device is turned on. If you’re connecting a digital camera, make sure it’s set to the correct mode for importing photos.
* Step 4: Photos shall display the media on the device. To stop the app from auto-opening whenever you connect this device, untick the box next to “Open Photos for this device” at the top (you may need to click the Action button to reveal this option).
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/How-to-Photo-for-OS-X-auto-launch-Mac-screenshot-001.jpg)
* Photos will no longer automatically open after connecting this particular device. This is a per-device specific setting so connecting any other device will still launch Photos. For example, preventing Photos from automatically opening after connecting an iPhone won’t stop it from launching when you connect an iPad to your Mac, and vice versa.
* You can also use the Image Capture app to set Photos to open automatically whenever you connect your camera, an iOS device or any other imaging device to this Mac.
* Step 1: Open Image Capture on your Mac.
* Step 2: Connect a camera, your iPad, iPhone or other iOS device to this Mac with a USB cable and make sure it’s turned on. After a second or two, the imaging device shall appear in the Devices list in Image Capture’s lefthand column.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/How-to-Photo-for-OS-X-auto-launch-Mac-screenshot-002.jpg)
* Step 3: Click the Show Hide button (it looks like a rectangle with an up arrow inside) located in the lower-left corner of the window to show a drop-down menu.
* Step 4: Click the “Connecting this device opens” pop-up menu, and then choose No application. From that point on, connecting this particular device will no longer automatically launch Photos.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/How-to-Photo-for-OS-X-auto-launch-Mac-screenshot-003.jpg)
* Tip: To automatically transfer images from the source device to your Mac upon connect it to the computer, select the AutoImporter option in the “Connecting this device opens” menu instead of No application.
* Just like the previous method outlined above, this is a per-device setting so if you have multiple iOS devices you’ll have to repeat the process for each of them.
* This last method ensures that Photos won’t auto-open for any device, as originally explained Michael Zhang in this Petapixel post.
* Step 1: Open Terminal on your Mac.
* Step 2: Enter the following line and press Enter:
* defaults -currentHost write com.apple.ImageCapture disableHotPlug -bool YES
* To enable Photos to launch automatically for all devices connected to this Mac, launch Terminal again and execute the following command:
* defaults -currentHost write com.apple.ImageCapture disableHotPlug -bool NO
* RELATED: How to stop Photos from automatically launching when plugging your iPhone
* How do you like this tip?
* Submit your feedback and tutorial ideas at tips@iDownloadBlog.com.

