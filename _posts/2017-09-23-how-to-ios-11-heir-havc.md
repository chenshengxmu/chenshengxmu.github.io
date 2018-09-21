---
layout: post
title: How and when to choose between HEIF/HEVC & JPEG/H.264 media formats in iOS 11
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/HEIF-poetry-WWDC-2017-slide.jpg)
* iOS 11 introduced support for modern HEIF and HEVC codecs developed by the Moving Picture Experts Group (not Apple’s proprietary formats) that keep high-resolution photos and videos taken with iPhone and iPad from eating up all your available storage.
* Here’s what the acronyms stand for:
* HEIF and HEVC offer better compression than JPEG and H.264 (AVC) so your photos, videos, Live Photos, panoramas, depth of filed images and pretty much anything you can take in the stock Camera app will take up half the space without sacrificing image quality.
* Being able to take more photos and shoot longer 4K videos before your iPhone or iPad fills up is going to make owners of lower-capacity devices very happy.
* And, you don’t have to think about compatibility when you open HEIF/HEVC media in other apps or send these files to non-Apple devices through the Share sheet because in that case, iOS will automatically transcode them into a more compatible JPEG/H.264 format.
* To the user, everything works just like before though, of course, you’ll still need to upgrade to iOS 11 or macOS High Sierra to view, edit or duplicate HEIF/HEVC media captured with an iOS device.
* HEVC, also know as H.265, is a codec for both images and videos. HEIF is a file format for images encoded with HEVC.
* HEVC videos use .MOV files as the container, just like H.264, MP4 and MKV videos.
* Now let’s get to the meat of the matter.
* Support for HEIF/HEVC is built into iOS 11 and macOS High Sierra, letting you work with this media in a variety of apps, like Photos, Preview, QuickLook and QuickTime Player. All iOS 11 and macOS High Sierra devices can display HEIF images without issues.
* Although baseline iOS 11 devices can play back standard 1080p HEVC clips, watching 4K HEVC clips without stuttering and in a battery-friendly manner requires hardware acceleration provided by Apple’s A9 chip or newer (iPhone 6s and up, all iPad Pros and 2017 9.7-inch iPad) or Intel chips in 2017 Macs and up.
* As an example, using Photos on my iPod touch to play a 4K HEVC video led nowhere. All I could do was stare at the spinning wheel as its A8 chip struggled to decode the file.
* On older devices without hardware acceleration, support for HEVC is affected by the resolution and frame rate of the video:
* What if you use iCloud Photo Library, but your iPhone, iPad or Mac can’t fully view, edit or duplicate HEIF/HEVC media because it lacks hardware support?
* In that case, iCloud Photo Library will send your HEIF/HEVC media at a lower resolution to ensure the files can be displayed on those device and you might see a warning message in Photos.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Screen-Shot-2017-09-24-at-15.23.59.jpg)
* iCloud Photo Library, of course, always preserves your HEIF/HEVC files and other media in their original format, resolution and frame rate.
* To take HEIF images and HEVC videos, you’ll need at least Apple’s A10 Fusion chip. When using iOS 11, the following devices can capture media in HEIF or HEVC format:
* On supported hardware, iOS 11’s Camera app defaults to HEIF/HEVC capture.
* You can toggle between HEIF/HEVC and good ol’ JPG/H.264 in Settings → Camera.
* Hit a new Formats subsection, then choose your preferred camera capture format:
* NOTE: If you don’t see this section, your device doesn’t support capturing in HEIF/HEVC.
* If you tap “High Efficiency”, all new photos and videos you take on this device will be encoded in the space-saving HEIF and HEVC media formats.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/iOS-11-Camera-capture-formats-HEIF-HEVC-iPHone-screenshot-001.png)
* Going with “High Efficiency” gets you half smaller videos/photos without losing quality.
* Though capturing in HEIF/HEVC format is recommended, it’s good that iOS gives you the option to capture media using the older JPG/H.264 formats that are more broadly compatible with other operating systems and devices.
* Here’s a little experiment that illustrates the storage savings provided by these codecs.
* Having set the iOS capture format to HEIF/HEVC, I took eight images with my iPhone 7 Plus and a one-minute 4K video at 60FPS. I exported everything to my Mac via a USB cable and macOS’s Image Capture app.
* Then I told iOS to convert the originals into JPG/H.264 files during export. Comparing the “before” and “after” file sizes in Image Capture revealed a startling difference.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/macOS_High_Sierra_Image_Capture_JPG_MOV_Mac_screenshot_002.jpg)
* Photos/videos taken with my iPhone 7 Plus in standard H.264/JPG formats.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/macOS_High_Sierra_Image_Capture_HEIF_HEVC_Mac_screenshot_002.jpg)
* The same captures made using HEVC/HEIF. Note the significant difference in file size!
* If that wasn’t enough to sell you on the storage-saving benefits afforded by these codecs, that’s because you’re probably thinking, “I’d rather turn the whole thing off because what about HEIF/HEVC sharing with Windows and folks with slower hardware?” right?
* Don’t worry—Apple has thought of that, too.
* You can set iOS to always export your HEIF/HEVC media to a computer in the original format or to convert the media, if necessary, to a more compatible JPG/H.264 format.
* Go to Settings → Photos and make that choice below the Transfer to Mac or PC heading:
* If you choose “Automatic”, your HEIF/HEVC media might be converted to JPEG/H.264 when exported via USB from an attached iOS device to a PC and Photos or Image Capture on a Mac.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/iOS-11-how-to-choose-format-trasnfer-photo-videos-Mac-PC-iPHone-screenshot-001.png)
* Because it “just works,” the Automatic setting should be always enabled.
* But if you need to transfer your HEIF/HEVC items to a computer in their original format, select “Keep Originals” to prevent the media from being converted when importing.
* To save you from compatibility conflicts, both iOS 11 and macOS High Sierra automatically transcode HEIF/HEVC items to JPG/H.264 when using the Share sheet or other methods to send them to:
* You don’t have to do anything special, just share your media like before.
* The HEIF/HEVC → JPG/H.264 conversion happens on the fly and without changing the originals in the Photos app. Any transcoded files get discarded upon sharing to save space.
* TUTORIAL: How and where to share faster with AirDrop
* For instance, picking a few HEIF images in Photos and sharing them to Mail will prompt iOS to attach JPGs. Similarly, if you send a 4K HEVC video to a friend’s iPhone 7 using AirDrop or iMessage, he’ll receive it in the widely compatible H.264 file.
* Summing up, Apple went all in with HEIF/HEVC in iOS 11, tvOS 11 and macOS High Sierra. These codecs will be with us for years to come and have a lot going for them, like non-destructive cropping and rotation, support for 4K/8K/3D videos and more.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/HEIF-FEVC-benefits-WWDC-2017-slide-001.png)
* Stay tuned to iDownloadBlog as we’ll be diving deeper into these media formats and discussing what they mean to you and how they help future-proof Apple’s platforms.
* BOTTOM LINE: HEIF and HEVC keep file sizes low without degrading image quality.
* Your HEIF images and HEVC videos sync with iCloud faster, support non-destructive manipulations in Photos and, ultimately, free up storage space so you can shoot even more photos and videos or fill your devices with more apps and content you care about.
* Are you sold now?
* If you like this how-to, pass it along to your support folks and leave a comment below.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know via help@iDownloadBlog.com and a future tutorial might provide a solution.
* Submit your how-to suggestions via tips@iDownloadBlog.com.

