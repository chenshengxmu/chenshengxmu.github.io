---
layout: post
title: The Best of AirPlay- Getting the Most From Streaming
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/11/AirPlay1.png)
* It seems that AirPlay, Apple’s revamped AirTunes technology, has been catching on and rapidly expanding in the last few months that iOS 4.2.1 has been around. There are now many ways to stream media to and from devices, with functionality mimicking that of the Apple TV (and beyond).
* With new solutions emerging on both the desktop and the iPhone, modern technology and innovative development have taken the legwork out of streaming and sharing. Here are the best ways to take advantage of this amazing technology and choose where YOU want to see your content…
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/airfoil-main-mac.png)
* My favorite method to do this has always been AirFoil. It’s available for the Mac and the PC and will stream anything that outputs sound, whether that’s a website, an application, or just system audio. There’s a free iOS app in the App Store called AirFoil Speakers, free apps by the same name for Mac and Windows desktop, and a feature-rich paid app that will stream audio from an application of your choosing to anything that can accept AirPlay streams. It comes bundled with a video player that compensates for the audio lag, which makes this solution stand out from the others. The latest version 4.0 sports a handful of awesome features including reverse connection initiation from a desktop speakers app to the serving computer, with such functionality expected to come to iOS soon.
* Use this with the App Store app Reemote for Airfoil and you will get some advanced reverse connection capabilities, such as source application control and individual speaker controls.
* The free way to do this is to just use iTunes, but you will be limited to your iTunes music and video libraries.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/AirView-App-Icon.png)
* To do this, get on your desktop (or open up MobileTerminal on your iPhone) and SSH into your device. Then copy and paste the code below into the terminal and press enter. Once it completes, reboot your device. If you’re running a tethered jailbreak, boot tethered. Your iPhone will now appear on AirPlay speaker menus automatically. Your device screen must be on, for as soon as the device aut0-locks or sleeps the audio quality will get noticeably choppy. You should use this with the AutoLock SBSettings Toggle.
* apt-get update apt-get install wget apt-get install unzip cd /tmp wget http://cl.ly/3Pu1/AirPlay.zip unzip "AirPlay.zip" cp "AirPlay/airtunesd" /usr/libexec cp "AirPlay/com.apple.airtunesd.plist" /System/Library/LaunchDaemons chmod 755 /usr/libexec/airtunesd chmod 755 /System/Library/LaunchDaemons/com.apple.airtunesd.plist rm -r "AirPlay.zip" rm -r "AirPlay" Alternatively, you can do this with an FTP/File Browser client (visually) with this tutorial. Remember, this will not work until you reboot (the respring doesn’t cut it).
* Once you have this working, you can open up Apple’s official iPhone Remote app to control iTunes and select your iPhone as the AirPlay Speakers option. It will be like having your entire media collection (40,000 songs in my case) right on your iPhone!
* Let us know if you try any of these.

