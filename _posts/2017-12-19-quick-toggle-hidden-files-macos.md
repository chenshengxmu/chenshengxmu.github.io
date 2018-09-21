---
layout: post
title: A quicker way to toggle hidden files on macOS, no Terminal required
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/show-hidden-files-with-keyboard-shortcut.jpg)
* Sometimes you need to edit a system file, or look at a file created by one of your programs. Many of these files are hidden by default, so you’ll need to make them visible before you can go about your business. One example I often encounter is hosts files, either for SSH or for your computer’s whitelisted and blacklisted domains, though there are many others.
* One quite well known method to view these hidden files is with the Terminal command:
* defaults write com.apple.finder AppleShowAllFiles TRUE ; killall Finder
* We’ve covered that before and it works well, but it affects the whole file system, and needs the opposite command to undo, which takes time:
* defaults write com.apple.finder AppleShowAllFiles FALSE ; killall Finder
* With that in mind, let’s look at a quicker way that affects only the current in-focus Finder window.
* This is so simple it barely merits steps, but what the heck?
* 1) Select the Finder window showing the contents of the folder you’re interested in.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/toggle-hidden-files-finder-window-2.png)
* 2) Press the following keys together: cmd + shift + full-stop (period). That is: ⌘ + ⇧ + .
* 3) Behold your newly-shown files in all their eminent glory.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/12/toggle-hidden-files-after.png)
* Once you’ve made your changes, simply press the keys again to re-hide the files.
* It quite literally couldn’t be simpler. This is one of those useful tricks that will speed up your workflow once you’ve committed it to memory.
* Got another useful tip like this? Want to see another guide from us? Let me know at: joe@idownloadblog.com

