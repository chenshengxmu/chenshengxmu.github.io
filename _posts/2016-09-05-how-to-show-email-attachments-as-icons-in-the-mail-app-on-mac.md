---
layout: post
title: How to show email attachments as icons in the Mail app on Mac
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/09/Mail-App-JPG-Icon.png)
* If you send or receive emails on your Mac, then you might run into an attachment on occasion. For some file types, OS X displays the attachment inline with text, but in the case of high-resolution images, this can sometimes impact email readability.
* In this tutorial, we’ll show you how to display attachments in the Mail app on your Mac as icons.
* There are actually two ways to accomplish this: 1) temporarily, on an email-to-email basis so only the email you’re currently viewing displays attachments as icons, or 2) permanently, so every email you get henceforth will display attachments as icons.
* First, we’ll show you how to do this temporarily from the email message itself, so you can see what it’s like. To do that, follow these steps:
* 1) Launch the Mail app on your Mac and open an email with an attachment in it.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/09/Email-with-attachment.png)
* 2) Right-click on the attachment and click on the View as Icon option.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/09/Mail-App-View-Attachment-As-Icon-Mac.png)
* 3) The inline attachment will now be converted into an icon:
![img](http://media.idownloadblog.com/wp-content/uploads/2016/09/Mail-attachment-converted-to-icon-Mac.png)
* And that’s all you’ve got to do to display an attachment as an icon for a particular email.
* You can easily convert it back to an inline attachment again by right-clicking on the icon and choosing the View in Place option from the drop-down list.
* Keep in mind that if you used this method, all future emails with attachments will still continue to display inline and you’ll have to repeat steps 1-3 again and again every time you open a new email. But if you’re looking for a more long-term solution, then keep reading… We’ve got a much more permanent solution coming up.
* So if you’ve decided you like how the icons look more-so than having an inline attachment with your email text, then maybe a more permanent solution is in the cards.
* To make this happen for all emails you’ll send and receive in the future, you’ll use a simple Terminal command. Here are the steps you’ll need to follow:
* 1) Launch the Terminal app on your Mac.
* 2) Type (or copy & paste) the following command into Terminal, and then press the Return key.
* defaults write com.apple.mail DisableInlineAttachmentViewing -bool yes
![img](http://media.idownloadblog.com/wp-content/uploads/2016/09/View-attachments-as-icons-Mac-Terminal-Command.png)
* After the command is put through Terminal, your Mail app should now start showing your email attachments as icons instead of inline attachments.
* If you ever decide you want to undo this command, you will need to enter the exact same command as shown above into Terminal, except you will replace the “yes” at the end of the command with “no” to make the statement false instead of true.
* Now that you know of both a temporary and permanent way to display attachments in your Mail app as icons, you can hopefully improve the readability of your email text when someone sends you a huge image that would normally make you scroll a mile.
* Also read:

