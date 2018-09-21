---
layout: post
title: How to show full file path in Finder window titlebars
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/09/OS-X-Yosemite-design-promo-Finder-icon-001.jpg)
* Our recent tutorial explored copying the complete path of files and folders by way of holding down the Option key to reveal the Finder’s hidden “Copy (file/folder name) as Pathname” option in the contextual menu.
* But wouldn’t actually seeing the full path in the Finder window’s titlebar—versus showing just the name of the currently selected folder—be an even greater productivity boost?
* With a little bit of Terminal magic, you can. In this tutorial, we’ll explain using Terminal to show or hide the full file path in the active Finder window’s titlebar on your Mac.
* The following tricks work on any Intel-based Mac running any OS X version from OS X 10.6 and onward. You should also be at least remotely familiar with Terminal, a stock Mac app in your /Applications/Utilities/ folder.
* Step 1: Launch Terminal on your Mac.
* Step 2: Paste the following command into the Terminal window and hit Return:
* defaults write com.apple.finder _FXShowPosixPathInTitle -bool YES;killall Finder
* The part before the semicolon changes OS X defaults pertaining to the Finder windows’ titlebars so that the full path is displayed in them. The part after the semicolon kills and restarts the Finder process, which is necessary for the changes to take effect.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-Yosemite-show-full-path-in-Finder-window-titlebar-Mac-screenshot-003.png)
* Now when you browse files and folders in Finder, you’ll notice the full path is displayed in the window’s titlebar, as depicted on the screenshot above.
* Step 1: Launch Terminal on your Mac.
* Step 2: Paste the following command into the Terminal window and hit Return:
* defaults write com.apple.finder _FXShowPosixPathInTitle -bool NO;killall Finder
* Here, we adjust the defaults command to revert the changes and switch back to displaying just the currently selected folder’s name in the window’s titlebar.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-Yosemite-show-full-path-in-Finder-window-titlebar-Mac-screenshot-002.png)
* This is actually how the Finder handles window titlebars by default. As you can see for yourself, seeing only the name of the currently selected folder in the window titlebar is of little use as the file is already highlighted in the Finder.
* Regardless of your preference of Finder window titlebars, there’s another cool trick to learn today: if you hold the Control (⌃) or Command (⌘) key and left-click the window’s titlebar, a handy menu pops up with your folder hierarchy.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/OS-X-Yosemite-show-full-path-in-Finder-window-titlebar-Mac-screenshot-001.png)
* It’s especially handy when you’re several levels deep into a folder and want to jump to a specific parent folder. Just select a parent folder in the menu and the Finder will take you right there, no need to manually navigate your way back through multiple folders.
* RELATED: How to copy file or folder’s complete path in Finder
* Did you find this particular tip useful? If so, pass along this article to your Mac friends and support folks.
* To send us your own tutorial submissions, use tips@iDownloadBlog.com.

