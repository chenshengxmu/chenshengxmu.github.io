---
layout: post
title: How to change a Mac app icon
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/how-to-change-icons-header.png)
* Sometimes a company or developer will put a lot of effort into making an app function well and forget to take the time to design a nice-looking icon. While a utilitarian app is great, you’re not likely going to want it on your Dock unless it has an attractive icon.
* Customizing an app icon by changing it to an image of your choosing is not only possible in macOS, but relatively simple. Whether you want to change it because the default icon doesn’t blend well with surrounding icons, it has an outdated design, or you simply dislike it, you can exchange it for a better-looking alternative in no time…
* Before you get into the steps of how to change a Mac app icon, you obviously need to have a new icon chosen and ready to use. macOS uses .icns files for application icons, and it’s best to stick with this format if possible, as an .icns file contains multiple sizes of an icon for various uses. If you are using a different file type, such as .png, the image dimensions should be 512×512 pixels to prevent pixelation.
* Pre-requisite: In order for this to work, you will first have to disable System Integrity Protection on your Mac. For security purposes, we can only recommend to re-enable System Integrity Protection when you’re done swapping icons.
* Step 1: Use Finder to navigate to the Applications folder of your Mac and select the application for which you want to change the icon. In this example, I’ll be exchanging the default iTunes icon for the one in the banner at the top of this article.
* Step 2: Right-click the application for which you want to swap the icon, and select ‘Get Info’ (or press ⌘I on your keyboard).
* Step 3: In the top left corner of the Info panel, you’ll see the app’s icon. From here, drag the new icon file over the original. Drop it when you see the green + bubble on your cursor.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/change-mac-app-icon.jpg)
* Alternatively, you can right-click on the new icon file and choose “Copy”, or select the file and press ⌘C. Return to the Info panel, highlight the original icon in the top left corner, and press ⌘V to paste.
* Note: macOS may ask you for your administrative password at this point; enter it to paste the icon.
* Step 4: If the application is already in your Dock, the new icon may not show up until you log out. To fix this, open Terminal (Applications > Utilities > Terminal), type “killall Dock” (without quotes), and press Enter.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/07/change-mac-app-icon-terminal.jpg)
* Note: Terminal may look somewhat different for you, and that’s fine.
* If for whatever reason, you decide to switch back to the app’s original icon, you can easily do so.
* Step 1: Use Finder to navigate to the Applications folder of your Mac and select the app for which you want to revert the icon.
* Step 2: Right-click the application and select ‘Get Info’ (or press ⌘I on your keyboard).
* Step 3: In the top left corner of the Info panel, you’ll see the app’s icon. Click on it to highlight it.
* Step 4: Press Backspace. The app’s icon should be restored to its original state.
* Note: macOS may ask you for your administrative password at this point; enter it to reset the icon.
* The same technique also works with folder icons in macOS, should you want to change them as well. Simply apply the same steps to any folder on your Mac.
* If this article helped you learn a new Mac tip, let us know in the comments. Additionally, feel free to leave any suggestions for tutorials and how-to articles below.

