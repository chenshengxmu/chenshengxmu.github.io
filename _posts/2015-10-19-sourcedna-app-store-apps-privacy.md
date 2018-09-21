---
layout: post
title: Some App Store apps found to gather personal information, Apple acts swiftly
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/06/iOS-7-App-Store-teaser-002.jpg)
* As many as 256 iPhone, iPod touch and iPad applications in the App Store, a majority of them from Chinese developers, have been found to violate Apple’s privacy policy by gathering personal information such as email addresses, installed apps and even serial numbers, an analysis by security analytics startup SourceDNA has found out.
* In addition, the offending apps, which obviously went under the radar of Apple’s App Store editorial team, have been found to collect other personally identifying information that can be used to track users.
* “We’ve found hundreds of apps in the App Store that extract personally identifiable user information via private APIs that Apple has forbidden them from calling,” cautions SourceDNA.
* The discovery marks the first time SourceDNA has seen iOS apps successfully bypass Apple’s review process. These apps incorporate the Youmi advertising SDK from China to tap into private APIs.
* The SDK then silently does the following:
* User info is uploaded to Yom’s server, not the app’s.
* Apple has provided the following statement:
* We’ve identified a group of apps that are using a third-party advertising SDK, developed by Youmi, a mobile advertising provider, that uses private APIs to gather private information, such as user email addresses and device identifiers, and route data to its company server. This is a violation of our security and privacy guidelines.
* Again, the majority of offending apps are distributed through the Chinese App Store and one of them includes the official McDonald’s app for Chinese speakers.
* Apple says it’s already removed these apps from sale:
* The apps using Youmi’s SDK have been removed from the App Store and any new apps submitted to the App Store using this SDK will be rejected. We are working closely with developers to help them get updated versions of their apps that are safe for customers and in compliance with our guidelines back in the App Store quickly.
* Apple prohibits developers to access its private APIs in iOS and has been locking them down since iOS 8. However, Yuomi developers two years ago began experimenting with obfuscating a call to get the frontmost app name and were able to get this through Apple’s review process.
* Yummy later used the same trick to hide calls to retrieve the advertising ID that they “may be using it for other purposes since they went to the trouble to obfuscate this.”
* The latest version of the Youmi SDK (v5.3.0), published a month ago, still gathers all the above information. The 256 apps that use one of the versions of Youmi that violates user privacy have been downloaded a combined one million times.
* Most of these apps are found on the Chinese App Store and their developers are likely unaware that their software violates Apple’s privacy policy since the SDK is delivered in binary form and obfuscated.
* Source: SourceDNA via ArsTechnica

