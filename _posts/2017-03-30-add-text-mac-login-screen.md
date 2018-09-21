---
layout: post
title: How to add custom text to a Mac login screen
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/login-screen-info-thumb.jpg)
* Today I’ll show you a simple little modification, one which will allow you to display a custom message on your Mac’s login screen. The text can be any custom string of text of your choosing, and could provide essential information to users on shared machines, or simply greet you when you start up the computer.This method really is as easy as the proverbial pie. I had originally recommended a technique which involved editing a preference file via Terminal, but iDB reader John Q pointed out that there was a user-facing option to control this after all. I retain the details of how to edit the preference file via Terminal at the end of the article, for academic purposes, but advise you to follow the simpler GUI method provided by our eagle-eyed reader.
* 1) Open System Preferences from /Applications, via Spotlight, or via the drop-down menu under the Apple symbol in the top-left of your screen.
* 2) Select the pane entitled Security & Privacy.
* 3) If necessary, click the lock symbol in the bottom-left of the pane and enter your password in order to edit these preferences.
* 4) Under the General tab, tick the option labelled Show a message when the screen is locked.
* 5) Click the Set Lock Message… button.
* 6) Enter a message of your choosing into the resulting text field, and hit OK when done.
* 7) Log out of your account to see it in action!
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/login-screen-info-message-header.jpg)
* If you reject all user-facing toggles in any form, or just want to familiarise yourself with the editing of preference files via the command line, the preference file in question can be located at /Library/Preferences/com.apple.loginwindow. It is of course easier to use the method outlined above, but if you’re interested, the same effect can be achieved with the following steps:
* Add text to the login screen
* 1) Open the Terminal application, located in /Applications/Utilities, or via Spotlight.
* 2) At the prompt, enter the following command:
* sudo defaults write /Library/Preferences/com.apple.loginwindow LoginwindowText "YOUR_MESSAGE_HERE"
* Naturally, you’ll want to replace YOUR_MESSAGE_HERE with the text you want to appear. For example, I wanted my login screen to read, as shown in this article’s header image: “A change is as good as a test”. So for me, the command looked like this:
* sudo defaults write /Library/Preferences/com.apple.loginwindow LoginwindowText "A change is as good as a test"
* Remember to include the quote-marks in the command, Terminal will throw an error without them. They will not appear on the login screen.
* 3) You can check the current message you have set with the following command:
* sudo defaults read /Library/Preferences/com.apple.loginwindow LoginwindowText
* 4) Log out of your user account to view the change.
* Remove the login screen message
* 1) Open the Terminal application, located in /Applications/Utilities, or via Spotlight.
* 2) At the prompt, enter the following:
* sudo defaults delete /Library/Preferences/com.apple.loginwindow LoginwindowText
* 3) You can check it has worked with the following command:
* sudo defaults read /Library/Preferences/com.apple.loginwindow LoginwindowText
* If the edit has been removed successfully, Terminal should report:
* The domain/default pair of (/Library/Preferences/com.apple.loginwindow, LoginwindowText) does not exist
* And that’s the way, the news goes! I see this customisation as useful mainly for administrators of shared computers who need to provide usage rules, information, or login procedures at the login screen. Besides that, it is a nice cosmetic addition for those who love to make their Mac their own, and perhaps want a welcome message or quotation to greet them on each login.
* Did you find this helpful, and do you have any other guides that you’d like to see us cover? Let me know in the comments section.

