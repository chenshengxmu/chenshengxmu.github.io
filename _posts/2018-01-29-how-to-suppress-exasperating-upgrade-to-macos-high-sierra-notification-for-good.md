---
layout: post
title: How to stop “Upgrade to macOS High Sierra” notifications
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/macOS-High-Sierra-installer-icon.jpg)
* If you don’t plan on installing macOS High Sierra for whatever reason, your Mac will still inform you of the software update every now and then via persisting system notifications.
* You may have already seen this notification popup nudging you to upgrade to High Sierra so that you can “enjoy the latest technologies and refinements.” It appears to be timed to occur weekly, sometimes even daily, which annoys the hell out of folks who don’t plan to jump on the High Sierra bandwagon anytime soon.
* You can ignore the update all you want, but the notification will still bug you to install it.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/macos-upgrade-notification.jpg)
* No, you cannot opt-out of those exasperating alerts via System Preferences → Notifications.
* The alert is only pushed out to Macs running versions of macOS prior to High Sierra. Starting with El Capitan 10.11.5, according to Apple, the High Sierra installer “conveniently downloads in the background, making it even easier to upgrade your Mac.”
* When the download has completed, you start receiving a notification on a regular basis reminding you that High Sierra is ready to be installed on your system. You may be able to get rid of the alert by clicking it to open the installer, then dismiss the installer window.
* Another option: control-click the High Sierra update on App Store and chose Hide Update.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/Hide-high-sierra-installer-mac-app-store.jpg)
* You can also uncheck the option “Download newly available updates in the background” in your App Store preferences, but that may not stop the upgrade notification from appearing.
* Plus, it’ll still link to the High Sierra update on Mac App Store.
* The upgrade alert goes through even if your Mac is in Do Not Disturb mode. You also cannot dismiss this notification permanently like you would any other alert: the popup comes with an Install button, which does what the title says, and a Details button that opens the macOS installer page on Mac App Store.
* You cannot swipe the alert to make it go away nor is there a Never or Ignore option (I wish Apple gave us a Not Now option or some such, especially with all the zero days).
* The implementation of this feature leaves a lot to be desired.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/06/macOS-High-Sierra-installer-Mac-screenshot-001.jpg)
* Firstly, it fools novice Mac users into believing they have no choice but install the update. And secondly, it makes it all too easy to upgrade an older Mac to High Sierra inadvertently.
* Thankfully, there’s a way to stop Apple from pushing High Sierra on an unsuspecting Mac user. As this step-by-step tutorial demonstrates, you can actually completely stop the upgrade notification at any time with a simple Terminal command.
* Here’s how.
* As always, back up your Mac before proceeding.
* 1) Open the Terminal app from the Applications/Utilities folder.
* TIP: You can also use the Spotlight feature to launch the app.
* 2) Paste the following command in the Terminal window and hit Enter on the keyboard:
* sudo mv /Library/Bundles/OSXNotification.bundle ~/Documents/
* The command requires administrative privileges so you may be asked to authenticate by providing your Mac user account’s password.
* 3) Restart the computer to have the change take effect.
* To revert the command and receive upgrade notifications again, execute the following command in Terminal and restart your Mac so that changes take effect:
* sudo mv ~/Documents/OSXNotification.bundle /Library/Bundles/
* The Terminal method temporarily moves “OSXNotification.bundle” from its original location in the /Library/Bundles/ folder to your user account’s default Documents folder.
* “OSXNotification.bundle” is a small Apple-signed bundle that controls macOS upgrade notifications. Reverting the change puts the file back in its original location.
* As noted by OSXDaily, some people may experience an error message with the Terminal method. Again, the Terminal command requires administrative privileges so be sure to log in to your Mac with a user account that has administrative privileges.
* EclecticLight has a nice technical explainer that sheds more light on why the command may fail for you and how Apple is using macOS technologies to push us marketing material.
* Should the Terminal method return an error message on your computer, you can instead move the aforementioned file manually to a folder of your choosing, here’s how.
* 1) Go the the Finder on your Mac.
* 2) Choose the Go To Folder option from the Finder’s Go menu.
* 3) Type in the path “/Library/Bundles/”, then click the Go button.
* 4) Move the file named “OSXNotification.bundle” from its default /Library/Bundles/ folder to a folder of your choosing. Hold down the Command (⌘) key on the keyboard while dragging the file into a new location, like your Documents folder. Don’t simply trash the file because you’re going to need it in case you decide to re-enable upgrade notifications.
* TIP: This is a system resource so you’ll need to authenticate with a user account with administrative privileges in order to move this file out of its default location.
* 5) Now restart your Mac for the changes to take effect.
* As soon as you put the bundle back into its default /Library/Bundles/ folder, and restart your Mac, the notification nudging you to upgrade to High Sierra shall return.
* These popups seem to be reliant on another macOS option which automatically installs system data files and urgent system patches, which should be left turned on in System Preferences → App Store at all times to help protect your system from zero day exploits.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/05/OS-X-El-Capitan-System-Preferences-App-Store-File-Quarantine-updates-Mac-screenshot-002.png)
* Bottom line: you can stop upgrade alerts for good if you’d like, and that’s a good thing.
* Credit goes where credit is due: this tip was found via @viss.
* If you like this how-to, pass it along to your support folks and leave a comment below.
* Got stuck? Not sure how to do certain things on your Apple device? Let us know via help@iDownloadBlog.com and a future tutorial might provide a solution.
* Submit your how-to suggestions via tips@iDownloadBlog.com.

