---
layout: post
title: Flaw in Mail for iPhone and iPad can be used to hijack your iCloud password
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/06/iOS-8-Mail-iPhone-6-screnshot-001.png)
* A serious bug in Apple’s stock Mail application for iPhone, iPod touch and iPad permits attackers to fool users into providing their iCloud credentials.
* Such phishing attacks can be devastating as iCloud increasingly becomes home for our digital life in the Apple universe, including our photo libraries, notes, contacts and other personal data.
* The scam takes advantage of an exploit in the Mail application that makes it easy to deliver convincing-looking pop-ups resembling iCloud password prompts through a simple email message, The Register reported Wednesday.
* While such emails look like they’re coming from a real company, they’re spoofed and once an unsuspecting user opens them on their iPhone, iPod touch or iPad running iOS 8.3, the operating system will execute malicious HTML content embedded inside.
* The exploit stems from the fact that Apple’s Mail application ignores a key line of code in incoming email which tells your iOS device to execute any embedded HTML code.
* The malicious HTML code imitates an iOS form asking for your iCloud username and password. Naturally, it’s fake and should be dismissed immediately. Here is a short demonstration of a proof-of-concept attack on iOS 8.3’s Mail client.
* Security researcher Jan Souček first discovered the flaw in January of this year.
* “Back in January 2015 I stumbled upon a bug in iOS’s mail client, resulting in HTML tag in e-mail messages not being ignored,” he said.
* “This bug allows remote HTML content to be loaded, replacing the content of the original email message. JavaScript is disabled in this UIWebView, but it is still possible to build a functional password ‘collector’ using simple HTML and CSS.”
* It’s unclear why Apple has left this obvious vulnerability unpatched for nearly six months, but Januček was unimpressed.
* Dissatisfied that the company hasn’t acted swiftly to patch the exploit, Souček decided to publish the code at GitHub in order to shore up social engineering awareness. The problem is, in doing so he’s potentially given power users the means to deliver phishing attacks upon unsuspecting owners of iOS devices.
* People who don’t use the stock Mail app are not at risk of having their iCloud credentials hijacked with this attack method.
* The best piece of advice I could give to anyone is this: you should avoid typing in your iCloud or Apple ID username and password into any app or dialog box at all cost, unless you’re absolutely sure the prompt came from the operating system itself.
* In the case of this particular bug, ignore any such prompt that may surface as you’re using Apple Mail on your iPhone, iPod touch or iPad.
* Source: The Register

