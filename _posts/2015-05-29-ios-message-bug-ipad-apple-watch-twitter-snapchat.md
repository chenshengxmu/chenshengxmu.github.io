---
layout: post
title: Unsurprisingly, iPhone Messages bug crashes iPad, Mac, Apple Watch, WhatsApp, Twitter and Snapchat
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/iOS-Messages-Arabic-string-bug-iPhone-screenshot-002.png)
* An odd software bug which causes the iPhone’s Messages application to crash and sends the handset into a respring after a certain text is received affects the iPad, Mac, and Apple Watch, too. In addition, the text bug apparently affects third-party social and messaging apps that deal with text, including WhatsApp, Twitter and Snapchat, The Guardian newspaper learned today.
* That’s hardly surprising. The issue can be traced back to a specific series of Unicode characters, suggesting a bug in the text engine framework called CoreText that exists in iOS and OS X.
* That would explain why third-party apps that deal with messages, like Twitter and Snapchat, were affected as they tap into Apple’s CoreText engine to manage strings of text and layouts.
* I’m just theorizing here, but if there’s a bug in the CoreText framework causing the above string to decode to an infinitely repeating message, any app which deals with the offending message would eat up all the available RAM, causing your iPhone to respring.
* The Guardian writes that the above string breaks Snapchat text chat. It can also be sent via Twitter direct messages or mentions, in which case your Twitter client will go into memory overflow and crash your device.
* “The bug, which causes Apple’s text handling system to choke on certain characters from Arabic, Marathi and Chinese and crashes the iPhone, iPad, Apple Watch or Mac, also affects apps running on iOS,” reads the article.
* In the case of iOS Messages, the bug causes the app to repeatedly crash, or you may find yourself stuck in the conversation.
* Although it does not cause lasting damage, the annoying issue crashes Snapchat conversations permanently after receiving a text chat with the offending string that the user has attempted to read.
* “The bug means that the user cannot open their chat history with the person who sent the message without crashing their iPhone,” writes The Guardian.
* Yesterday, Apple updated its support document offering a simple workaround to temporarily circumvent the issue.
* A fix will be available via an iOS software update soon, said Apple.
* “Apple is aware of an iMessage issue caused by a specific series of unicode characters and we will make a fix available in a software update,” wrote the firm, without giving a time frame for any such fix.
* You can use these steps to re-open the Messages app after the crash, which involves telling Siri to read your messages and then asking her to send a reply to the malicious message.
* Step 1: Press and hold the Home button to invoke Siri. Once activated, ask Siri to “read unread messages.”
* Step 2: Siri will sort of read the message (it is impossible for it to actually speak it in proper English), and then it will ask if you want to reply to the message. Say yes.
* Step 3: Say anything. The actual content of the reply doesn’t matter. What matters is sending a message.
* Step 4: Once the reply has been sent, you should be able to open the Messages app. From there, swipe to delete the entire conversation containing the string of characters, or tap and hold on the malicious message, tap More, and then delete the message from the conversation.
* We also offered a few workarounds of our own to help mitigate the issue.
* The bug seems to manifest itself when banner notifications are enabled, meaning a wide range of apps could be potentially affected by the malicious text.
* Source: The Guardian

