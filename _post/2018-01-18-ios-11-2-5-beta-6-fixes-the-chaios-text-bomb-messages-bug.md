---
layout: post
title: iOS 11.2.5 beta 6 fixes the ChaiOS “text bomb” Messages bug
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/ChaiOS-text-messages-bug.jpg)
* Earlier this week, an iOS developer discovered that a malicious link texted to iPhones, iPads and Macs can cause freezes and restarts by overloading Mac and iOS’s text rendering engine with several megabytes of text, consisting mostly of Unicode cascading accent marks.
* This causes many apps which are capable of displaying Unicode content, such as Messages and Safari, to hang or slow down to a crawl. However, Apple has fixed this exploit in iOS 11.2.5 beta 6, which was released for developer testing yesterday. I installed the new beta on my iPhone yesterday and can confirm that the bug has been squashed.
* A future macOS High Sierra 10.12.3 beta should also address this annoyance.
* If you’re not on the latest iOS 11.2.5 beta, you’re advised to avoid opening messages containing this malicious attachment or accessing the link through Safari (even getting a notification on the Lock screen can cause a freeze for a bit).
* As we reported, developer Abraham Masri‏ earlier this week tweeted out the offending attachment, linked to a GitHub page, that causes Messages, Safari and in-app Safari browsers to freeze. The good news is, Github has removed the offending webpage.
* The malicious attachment may be hosted elsewhere, however.
* To protect yourself, go to Settings → General → Restrictions, then tap Websites underneath the Allowed Content heading. From there, tap Limit Adult Content and add “GitHub.io” along with any other domains hosting the malicious link to your Never Allow list.

