---
layout: post
title: Chrome 56 for Mac released with lower power consumption, performance boost & more
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/10/Google-Chrome-logo-medium.png)
* Google on Friday released Chrome 56 for Mac, Windows and Linux following a period of beta testing which began about a month and a half ago. In addition to various security enhancements, Chrome 56 offers nearly up to one-third faster webpage reloading times with 60 percent less validation requests. Google’s desktop browser will now warn you when a website requests confidential information over an insecure connection. It also blocks Flash content, supports Web Bluetooth API and more. Chrome 56 for iOS should follow soon.
* Chrome is now leaner and faster while consuming less bandwidth and power.
* Google cited Facebook’s own data which showed Chrome was sending validation requests at three times the rate of other browsers. With the new, improved reload behavior now available in Chrome 56, Facebook now reports 28 percent faster webpage reloads and 60 percent less validation requests from the Chrome browser.
* What dark magic is it, you ask.
* Let’s start with the basic. When reloading a webpage, any browser would typically check with the web server if cached resources are still usable, a process which is known as validation. With typically hundreds of network requests per webpage issued to dozens of domains, this results in high latency, especially on mobile devices and slow networks.
* Noting that validation was originally designed in times when broken webpages were quite common, Google says Chrome now reloads a webpage only to validate the main resource before continuing with a regular webpage load.
* “This new behavior maximizes the reuse of cached resources and results in lower latency, power consumption and data usage,” says the search company.
* Google’s video, which you can see embedded right below, shows off the improved performance and efficiency of reloading a webpage on a slow mobile connection.
* In other Chrome 56 improvements, the browser brings full support for the FLAC audio codec which macOS does not support natively. The app has gained support for the Web Bluetooth API, which lets it connect to and interact with Bluetooth Low Energy devices such as printers, LED displays, heart rate monitors and other devices. This feature can be combined with physical Bluetooth beacons to discover and control nearby devices.
* Chrome 56 is now officially the first Chrome release to make HTML5 the default standard for all users as it now blocks all Flash content automatically. And last but not least, a “Not Secure” warning appears in Chrome if a webpage request sensitive information like passwords and credit card numbers over insecure HTTP connections.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/Chrome-56-for-Mac-HTTP-Not-Secure-screenshot-001.png)
* The feature, in Google’s own words, is “part of a long-term plan to mark all HTTP sites as non-secure.” It remains to be seen how nimble web developers will be in securing their website’s traffic with HTTPS to avoid this new warning.
* Chrome 56 has another nice trick up its sleeve.
* The browser will now aggressively throttle background tabs—especially those inundated with heavy JavaScript ads and analytics scripts—using a feature called Browser Timer which prevents background webpages from overusing their allotted runtime allowance.
* This ought to make background tabs drain less CPU and battery power.
* Browser tabs that play audio or video are excluded from the Browser Timer feature.
* Chrome’s silent updating mechanism should update your installed copy of the browser automatically whenever a new stable version is available. You can also update manually by selecting About Google Chrome in the Chrome menu.
* The standalone Chrome installer is available directly from Google.
* Source: Google

