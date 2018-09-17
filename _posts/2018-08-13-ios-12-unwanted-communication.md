---
layout: post
title: iOS 12 lets developers create extensions for reporting unwanted texts and calls as spam
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/06/iOS-12-teaser.jpg)
* iOS 10 included a CallKit framework that brought a system-wide way for customers to use specialized apps on their iPhone, like Hiya and TrueCaller, that automatically identify and block nuisance calls before the phone even rings. With iOS 12, Apple started allowing developers to write new types of call-blocking extensions that gather information from the user before deciding whether to report or block the number.
* NOTE: Apple introduced the Unwanted Communication feature described in this article at WWDC 2018 in June, and we’ve decided to highlight it ahead of iOS 12’s release this Fall.
* When an iPhone with iOS 10 or iOS 11 receives an incoming call, the operating system first consults your Contacts app in an attempt to find a matching phone number. If no match is found, it then compares it to the list of phone numbers in your CallKit apps, like Skype.
* If there’s a match, the iOS software then displays the identifying label chosen by the app, like Spam or Telemarketing. If your CallKit app determines that an incoming phone number is actually spam, iOS may choose to block the call automatically. The system is tailored for VoIP apps and identifying possible spammy calls initiated from such apps.
* With iOS 12, you can also report unsolicited SMS/MMS messages and unwanted phone calls.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/08/WWDC-2016-slides-Phone-spam-call.jpg)
* Call identification via a third-party extension in iOS 10
* Speculation goes that Apple built these enhanced SMS and call spam reporting features into iOS 12 in order to comply with requests from the Telecom Regulatory Authority of India, which has been pressured Apple relentlessly to approve the government’s anti-spam app.
* SMS spam is a major problem in India.
* Apple took the hard stance by rejecting the app as it did not want any government agency to have full access to users’ call and SMS logs. By creating a new SMS and call reporting extension in iOS 12, Apple might comply with the request without putting user privacy at risk.
* iOS 12 introduces a new extension type, dubbed Unwanted Communication.
* According to the official developer documentation detailing iOS 12’s SMS and call spam reporting, the extension provides a consistent way for users to report selected phone calls and incoming texts to third-party spa apps, and for their developers to receive crucial call metrics.
* After downloading a call-blocking app from App Store that ships with an Unwanted Communication extensions, the user has to enable the extension manually through Settings → Phone → SMS/Call Reporting in their Settings app.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/08/iOS-12-Unwanted-Communication-extension-001.png)
* User reports a nuisance phone call or unwanted SMS/MMS message
* This is where you’ll see all SMS and call-reporting extensions that are available to you on this device. You can only turn on one Unwanted Communication extension at a time.
* The user can easily report any unwanted call by swiping left on an unknown or spammy number in the Phone app’s Recents list to pull up a new Report option. For texts, you can press the Report Messages button when it appears in the Messages transcript or simply press the text with 3D Touch to reveal the option in the shortcuts menu.
* For whole conversations, swipe left on the thread in Messages to reveal a Report option or long-press a text to select additional messages, then choose the option Report Messages.
* iOS launches the Unwanted Communication extension you installed, which goes to work gathering additional information before deciding whether to report or block the number.
* Here’s what the Unwanted Communication extensions typically collect:
* After manually reporting a nuisance call or SMS message, iOS 12 calls the Unwanted Communication extension which presents its custom controls to gather data from you.
* You can then decide to enter all of the information that the extension requires and tap a Done button, or hit a Cancel button to abort the operation. To protect user privacy, the system always deletes all collected data after the extension terminates.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/08/iOS-12-Unwanted-Communication-extension-002.png)
* Blocked SMS or call number is added to your Blocked Contact list, managed in:
* It’s important to reiterate that iOS 12’s new Unwanted Communication extension only works with SMS/MMS texts and phone calls. But what about VoIP calls and iMessages, you ask.
* Well, your existing spam apps that are compatible with iOS 10’s CallKit framework already handle VoIP spam, while Apple has its own features for reporting iMessage spam.
* As mentioned earlier, when you set up a third-party provider’s spam filter extension on your device, the filter provider is able to access all of the text and content including any incoming SMS and MMS messages received from senders that are not in Contacts.
* And therein lies the rub because your texts may include verification codes for services like Dropbox, codes from banks and other institutions and other confidential info. You’re only at risk if you mistakenly report a legitimate text as spam and your filter provider is a bad actor.
* Incoming calls are never sent to third-party developers.
* After you have responded to a text three times or have added the sender to your Contacts, messages from that sender will no longer be passed to the filter provider for verification.
* What are your feelings on the new Unwanted Communication extension in iOS 12?
* Have you used iOS’s existing blocking and reporting functions? If so, should Apple do more in terms of helping users report nuisance calls, do you think?
* Don’t be shy, share your thoughts with fellow readers in the comments down below!

