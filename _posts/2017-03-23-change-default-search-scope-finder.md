---
layout: post
title: How to change the default search scope in Finder
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/finder-default-search-scope-header.png)
* You may have noticed when opening a Finder window to search for a file that the default setting is to search through the entire Mac. Although this may be precisely what many people want to do, I personally tend to find myself clicking again to refine my search to the current folder.
* This guide will outline the simple process to customise the default scope for Finder window searches, so that you no longer have to trawl through your full hard drive for a file which you know is in the folder you’ve already navigated to.
* The only time I search via the bar in the top right of a Finder window is when I’m already within the necessary folder. I move to that folder, realise it has hundreds of similarly named files in it, and the fastest way to then narrow it down is to click in the top right and search. Therefore, I only ever want Finder’s search bar to look in my current folder. If I’m searching my entire Mac for a file, I don’t bother to open a Finder window to begin with; I use Spotlight.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/finder-search-scope-example.png)
* As you can see from the above image, I’m in my /System/Library folder, and I want to search for the folder Assistant, which can be seen third from bottom in the list. But when I begin searching for it:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/finder-search-scope-fail.png)
* Finder has returned a bunch of random files from my entire hard drive, completely losing the folder which was right in front of it. To get what I want, I can click across to the “Library” button in the top bar. But if we’re in it for the long haul, let’s just change the default behaviour instead.
* 1) Navigate to Finder > Preferences…
* 2) Go to the Advanced tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/Screen-Shot-2017-03-21-at-18.17.24.png)
* 3) Under the drop-down menu entitled When performing a search: select your choice of search scope. There are three options:
* The default is Search This Mac but I selected Search the Current Folder.
* And that’s it! Told you it was simple. You can revert or amend your change at any future point with the same preference window.
* Interestingly, and for those with more of a command-line slant, these preferences can be set with Terminal. I was hoping that this would allow for setting the search scope to any custom folder, but unfortunately that doesn’t seem to be the case. It seems the search scopes are not set as file-paths, but as separate entities, meaning only the built-in options are available. Check out the image below to see what I mean:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/Screen-Shot-2017-03-21-at-18.23.42.png)
* The search scope strings are SCcf, SCev, and SCsp, corresponding to Current Folder, This Mac, and Previous Search respectively. As these are not file-paths, it does not work to set something like ~/Downloads here, hoping to make the search bar always search through your downloads by default.
* Whether or not there are built-in search scopes other than the three above, and whether they can be manually created and added in macOS, I’m not sure. If you know of a way to do this, please let me know!
* And there, as they say, you have it.  A simple way to set your default Finder search scope, and a bit of background into how it works behind the scenes. Let me know if you know how to customise Finder search scope further, or if there are any other guides you’d like to see us write up.

