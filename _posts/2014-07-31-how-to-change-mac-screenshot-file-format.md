---
layout: post
title: How to change screenshots file format on Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/OS-X-Mavericks-Grab-icon-full-size-e1406151133350.png)
*  
* By default, macOS saves you screenshots on the desktop, as PNG files. PNG is great if you care about image quality: the format uses lossless compression techniques that won’t degrade image quality. On the downside, PNG screenshots tend to be fairly large in size.
* Although you can tap Apple’s stock Preview app, or any third-party image editor, to convert PNGs into JPEGs and other image formats, why take extra steps if macOS can do all the heavy lifting for you?
* In this tutorial, I’ll show you how to change the image format for screenshots taken on your Mac…
* Before we get to it, keep in mind macOS recognizes the following graphics formats out of the box: JPG, GIF, PDF, PNG and TIFF. You can elect to have macOS save your screenshots in any of these formats.
* And if you’re unsure how to take screenshots in macOS, we have an easily digestible how-to, just for you. And even if you know about ⌘-Shift-3 and ⌘-Shift-4, our tutorial will teach you some cool new tricks, so do give it a read.
* With that off my back, using any Terminal command below below will make your screenshots appear in whatever file type you’ve specified.
* The first step is to launch Terminal.
* Open your Applications folder by pressing Shift-⌘-A on the keyboard while the Finder is active. Next, navigate to the Utilities sub-folder and open Terminal.
* Alternatively, use Spotlight to launch Terminal.
* Type or paste the following line into a Terminal window and hit the Return key to execute the command:
* defaults write com.apple.screencapture type jpg;killall SystemUIServer
* Type or paste the following line into a Terminal window and hit the Return key to execute the command:
* defaults write com.apple.screencapture type gif;killall SystemUIServer
* Type or paste the following line into a Terminal window and hit the Return key to execute the command:
* defaults write com.apple.screencapture type PDF;killall SystemUIServer
* Type or paste the following line into a Terminal window and hit the Return key to execute the command:
* defaults write com.apple.screencapture type png;killall SystemUIServer
* Type or paste the following line into a Terminal window and hit the Return key to execute the command:
* defaults write com.apple.screencapture type tiff;killall SystemUIServer
* To be perfectly clear, I’m unaware of any Terminal command that would make it possible to specify compression quality.
* If you want control over that – or need to annotate your screenshots, resize them and perform other touch-ups – consider third-party image editors such as Skitch (free download) or Pixelmator (currently $29.99)
* Each image format has its own drawbacks and advantages so you’ll have to decide for yourself which one to use depending on your specific use cases.
* As a rule of thumb, you’d be typically using TIFF images for print, JPG/PNG for blog posts and web graphics, GIF for lower quality images with less colors and PDF for rich documents with complex layouts such as Pages/Word docs or Keynote presentations.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/How-to-take-Mac-screenshot-image-001.jpg)
* To give you a feel of typical file sizes relative to one another, I screenshoted my 13-inch MacBook Air desktop with the default wallpaper and no icons on the desktop. The resulting 1,440-by-900 pixel screenshot, seen above, yielded the following file sizes for each of the available image formats:
* Again, your mileage may vary as the screenshot file size depends on the screen resolution, Retina or non-Retina, your desktop wallpaper, what’s displayed on the screen and other factors affecting compression.
* As a quick reminder, use the ⌘-Shift-3 combo to screenshot the entire desktop or ⌘-Shift-4 to grab a rectangular portion. If you need to screenshot an app’s window, use ⌘-Shift-4, hover over the app’s window and hit the Space key on the keyboard.
* For more tips, check out our Mac screenshot-taking tutorial.
* Folks who take a lot of screenshots may want to reduce desktop clutter by telling macOS to save their screenshots to a custom location.
* And should you need to extract gorgeous full-resolution 1,204-by-1,024 pixel Mac app/document icons as transparent PNG files (like the Grab app icon top of post), don’t bother with screenshoting – all you need is Preview.
* If you’ve found this article useful, share it with friends and do leave us a comment below. Don’t be shy – iDownloadBlog values your opinion and promotes healthy discussion on the web.
* Before signing off, folks who’ve stumbled upon other tips worth sharing, or have thought up a great tutorial idea, are kindly encouraged to send us their submissions to tips@iDownloadBlog.com.
* We promise to do our best to include your brightest and most useful ideas in upcoming how-tos.

