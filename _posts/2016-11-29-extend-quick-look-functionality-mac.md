---
layout: post
title: How to extend Quick Look preview functionality on your Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/Quick-Look-Header.png)
* If you’re not familiar with the Quick Look feature on macOS, try selecting a picture, folder, or text document on your computer and pressing the space bar. The rich preview that pops up is Quick Look working its magic. Apple introduced Quick Look in Mac OS X 10.5 Leopard and it has since gained support for many more file types natively, such as Microsoft Office and Adobe Suite documents.
* I use it daily and it has become an automatic part of my workflow, a natural response to wanting to inspect a file without waiting for a program to launch and without leaving off what I’m doing.
* However, the problem that Quick Look faces is support. It requires a plugin for each file type it can preview, and out-of-the-box only a handful are supplied. More obscure file types are neglected, and display only a blank pane with the file icon, name, size, and date modified. In this guide, I will detail how to add plugins to Quick Look for a richer and more useful preview experience.
* Here I am taking a “quick look” at an .avi file, an incredibly common container format most often used for video:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/IMAGE-1.png)
* And here is a markdown file with the extension .md, very commonly used for readme documents and essentially just a plaintext document:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/IMAGE-2.png)
* As you can see, despite their ubiquity, both have only the most rudimentary information available to preview under macOS; I can see neither the video content of the .avi, nor the textual content of the .md file.
* The two plugins demonstrated here are “Quicklook Video” for .avi, .asf, .flv, .mkv, .rm, .webm, .wmf, and more, and “Markdown” for .md files. Both are available from their respective developers’ websites, though this is a great centralised list where you can download them and many more without having to search around for the one you want.
* Quick Look plugins are generally supplied as either a package installer or as a single file in .qlgenerator format. To install those with a package installer (.pkg or .mpkg), it’s as simple as double-clicking and going through the installer screens. If your download consists of only a .qlgenerator file, you must install it manually, as per the following procedure:
* 1) First, decide whether you want to install it for your user only, or for all users of the computer.
* 2) Copy the .qlgenerator file(s).
* 3) For all users installation, navigate to /Library/QuickLook.
* For single user installation, navigate to ~/Library/QuickLook. If you cannot locate the ~/Library folder, it may be hidden on your Mac. We’ve detailed the process for making it visible in a previous post.
* 4) Paste the file(s) into the relevant folder.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/IMAGE-3.png)
* 5) Next, launch the Terminal app from /Applications/Utilities, or with Spotlight.
* 6) Enter the following command in the terminal, and press “Enter”:
* qlmanage -r The Terminal should respond with “resetting quicklookd”. This command refreshes the Finder’s list of Quick Look plugins, ready to generate new previews with your new functionality.
* 7) Close Terminal and test out the plugins, by selecting a previously unsupported file and pressing the space bar to view it with Quick Look.
* And there you have it! My .avi file and my .md file can now be viewed in all their glory, without the dashed hassle of actually opening the files.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/IMAGE-4.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/IMAGE-5.png)
* To remove third-party Quick Look plugins that you no longer want or need, follow the reverse procedure.
* 1) Navigate to either /Library/QuickLook or ~/Library/QuickLook, depending on where you originally installed your plugins.
* 2) Select all plugins you no longer want and delete them.
* 3) Launch the Terminal app from /Applications/Utilities, or with Spotlight
* 4) Enter the following command in the terminal, and press “Enter”:
* qlmanage -r 5) Close the terminal and it’s all over.
* Whilst this functionality may seem non-critical, it can really increase work speed and is incredibly convenient, especially if you are someone who works with many lesser-known file formats all the time. The number of supported file formats that can be added is large and nearly all are free.
* A handful more of my personal favourites that you may want to try out are below. All of them can be found listed on the website linked earlier in the article.
* Did I miss out any crucial Quick Look plugins that you use daily? Was this guide helpful? Let me know in the comments below, and may you never have to directly open a file ever again.
*  

