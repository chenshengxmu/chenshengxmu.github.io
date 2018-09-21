---
layout: post
title: How to extract icons from Mac apps
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/02/Mission-Control.png)
* Our new contributor Timothy Reavis recently posted a nicely done how-to explaining how one can easily change app icons on the Mac using Finder and a little bit of Terminal trickery.
* I myself often get asked about extracting high-quality Mac icons for use in blog posts, on websites and elsewhere. Granted, it’s easy to navigate to your Applications folder and screenshot a desired icon in the Finder’s CoverFlow or Icon view.
* On the downside, doing so removes icon transparency and fails to produce a pixel-perfect replica of the original icon. This tutorial will teach you how to to extract icons from Mac apps in their original size as transparent PNG files.
* Before we get to it, let me point out quickly that Apple’s Human Interface Guidelines for OS X development clearly mandate that developers include specific icon sizes in their app bundles.
* In addition to the full-size 1,024-by-1,024 icon, developers must provide several smaller sizes that the operating system uses to enlarge and shrink the icon properly in various Finder views, minimizing artifacts.
* Specifically, the required icon sizes are as follows: 16×16, 32×32, 64×64, 128×128, 256×256, 512×512 and 1,024×1,024 pixels. In addition, each may be provided in 72 and 144 pixels-per-inch flavors for use on non-Retina and Retina screens.
* Step 1: Navigate to the Applications folder in Finder, either manually or by hitting the Shift-⌘-A combo on your keyboard. Locate a desired app – in this case Mission Control – and click once to highlight it. Of course, you could just as easily highlight any other app or document icon anywhere on your Mac.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/select-app-icon.jpg)
* Step 2: Press ⌘I on your keyboard to bring up the item information window in Finder. Alternatively, right-click the application and select ‘Get Info.’
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/Mission-control-get-info.jpg)
* Now click once on the app’s icon in the top left corner of the Info panel to highlight it. Next, press ⌘C on the keyboard – this will copy the icon’s graphics to the system clipboard.
* Step 3: Launch the stock Preview app from your Dock. If it’s not in the Dock, use the Spotlight icon in the upper right corner of the Mac’s menubar and type ‘Preview’ to locate the app (tip: it’s inside the Applications folder by default).
* Step 4: With Preview launched and active, press ⌘N to create a new document from clipboard. Alternatively, choose New from Clipboard option from Preview’s File menu.
* Step 5: You’ll see something like this. In the lefthand column, Preview provides your icon’s graphics in multiple sizes. To check the provided resolutions, choose ‘Show Inspector’ from Preview’s Tools menu.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/extract-app-icon-on-mac.jpg)
* Step 6: The first icon at the top is the full-resolution variant you need. Right-click it and choose ‘Export As…’ from the drop-down menu.
* Step 7: The file sheet will appear offering to save the chosen icon size in several graphics formats such as JPEG, JPEG-2000, OpenEXR, PDF, PNG, TIFF and ICNS, the latter being the Mac’s default app icon bundle format.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/select-mac-icon-format-e1454709716706.jpg)
* Choose ‘PNG’.
* Name your file, hit the Save button and that’s it!
* You now have a beautiful pixel-by-pixel version of the original icon, saved in the lossless PNG format and with transparency preserved.
* From there, upload it to your blog and use it in posts, for your video compositions, in document layouts, presentations and what not.
* Check out the System Information app icon below.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/OS-X-Mavericks-System-Information-icon-full-size.png)
* Full-size icon PNGs tend to be fairly large for comfortable use on the web so it may be a good idea to convert them to JPG – assuming you don’t care about transparency and are not concerned about light compression artifacts barely visible to the naked eye.
* This tutorial can be used to export any Mac app/document icon as a transparent PNG. Here’s a pretty icon graphics for Pixelmator, the full-featured popular Photoshop replacement for the Mac.
* Did you find this tutorial useful?
* Have a trick or tip of your own you’d love to share with fellow readers?
* Drop us your suggestions for how-tos on tips@iDownloadBlog.com and we’ll consider including best tips in future articles.

