---
layout: post
title: Security hole in Facebook app could lead to identity theft
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/04/facebook-login.jpg)
* Folks who use Facebook’s iOS app might want to make sure to stay away from using public computers and charging stations for a while. Apparently a serious security glitch has been discovered in the software that could give hackers access to your account.
* Security researcher Gareth Wright published a blog post yesterday that has raised some serious questions about how iOS developers are handling saved values — logins, etc. It seems that some apps are saving this data in plain, unencrypted text files…
* Using the free tool iExplorer (previously iPhone explorer) and a non-jailbroken iPhone, Wright was able to pull all kinds of account information from apps like Facebook and Draw Something, which was stored in unencrypted plist files.
* “Popping into the Facebook application directory I quickly discovered a whole bunch of cached images and the com.Facebook.plist. What was contained within was shocking. Not an access token but full oAuth key and secret in plain text…
* …Quick export and call to my good friend and local blogger Scoopz and I sent over my plist for him to try out. After backing up his own plist and logging out of Facebook he copied mine over to his device and opened the Facebook app.
* My jaw droppped as over the next few minutes I watched posts appear on my wall, private messages sent, webpages liked and applications added.
* Scoopz then opened Draw Something on his iPad which logged him straight into my account where he sent some pictures back to my friends.”
* Before you panic, keep in mind that there is no evidence of anyone using this information maliciously. But the implications are certainly scary. Wright suggests that hackers could exploit this security hole with a hidden computer application that copies the plist files of any device you plug in, or a modified version of a utility like iExplorer with the added code.
* Wright says that Facebook is aware of the vulnerability and working on a fix. But he points out that unless other developers start following suit, it’s only a matter of time before someone starts using this information for ill purpose. Yikes.
* [TheNextWeb]

