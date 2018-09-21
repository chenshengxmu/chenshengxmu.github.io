---
layout: post
title: Google enables better iOS contact sync via CardDAV protocol
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/06/iOS-6-Facebook-integration-Contacts.jpg)
* If you wanted to sync your iOS Contacts with Google with changes instantly reflected across devices, Microsoft’s Exchange ActiveSync used to be your only option. As of today, Google announced that “we’re adding CardDAV to that list”, allowing for seamless contact syncing between your Google Account and third-party apps, including iOS devices running iOS 5 or later…
* Those living in the Google cloud probably know that both OS X and iOS offer built-in syncing support for Gmail and Notes via IMAP, in addition to Calendar and Reminders via CalDAV and Messages via XMPP (used by Google Talk, Facebook Chat and many other popular chat clients).
* CardDAV is an address book client/server protocol that manages contact data on a server. It’s built around HTTP-based WebDAV protocol and uses vCard format for contact data.
* In fact, Apple embraced CalDAV and CardDAV for Calendar and Contact sharing services with the release of iOS 4 two years ago.
* Announcing the news, Google noted in a blog post that using CardDAV to sync your iOS Contacts means “you’ll be able to edit, add, and remove contacts from your device and keep them in sync everywhere you use them”.
* Google provides the following instructions to set up CardDAV contact sync on your device.
* • Open the Settings application on your device. • Select Mail, Contacts, Calendars. • Select Add Account… • Select Other • Select Add CardDAV Account • Fill out your account information in the following fields:
* – Server: Enter “google.com” – User Name: Enter your full Google Account or Google Apps email address. – Password: Your Google Account or Google Apps password. (If you’ve enabled 2 Step -verification, you’ll need to generate and enter an application specific password.) – Description: Enter a description of the account (e.g. Personal Contacts).
* • Select Next at the top of your screen. • Make sure that the “Contacts” option is turned to ON.
* When you’re done, open the Contacts app and give it a little until the initial sync completes.
* Going forward, any changes made to your Google Contacts on the web will immediately reflect on your iOS device and vice versa. This also includes deleting or adding contacts on your Apple device.
* The same set up procedure can be applied to OS X desktops.
* Should you encounter issues, note that syncing via CardDAV is only available over SSL for Apple devices so you’ll need to enable this option by opening the CardDAV account you established under the Mail, Contacts, Calendars section in Settings.
* From there, make sure that the Account option is turned on, then open Advanced Settings below and make enable Use SSL.
* Finally, if you already sync your contacts (for example, via iCloud, Exchange or from another account), you’ll want to choose a Default Account at the bottom of the Mail, Contacts, Calendars section in Settings.
* Setting a Default Account to your Google, for example, determines that new contacts created directly on your iOS device get added to that default account.
* If you use Google Apps for Business, Google is recommending using Google Sync to sync your iOS contacts.
* Let us know how CardDAV sync worked for you down in the comments.

