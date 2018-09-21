---
layout: post
title: How to install a web browser on Apple TV
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/11/tvOS-Web-Browser-Apple-TV.png)
* Sideloading the tvOSBrowser that we reported on earlier is easy, it just takes a bit of massaging to make it all work. You’ll need to be familiar with our standard sideloading tutorial for sideloading apps, but there’s one additional step that you’ll have to take before it all comes together. In this tutorial, we’ll show you all that’s involved in a hands-on step-by-step video.
* Step 1: Use our sideloading tutorial to sideload the tvOSBrowser on your Apple TV
* The build will fail, and you will encounter an error that states: ‘UIWebView’ is unavailable: not available on tvOS
* Step 2: Open the Applications folder
* Step 3: Right click on Xcode.app and select Show Package Contents
* Step 4: Open Developer →  Platforms → AppleTVOS.platform → Developer → SDKs → AppleTVOS.sdk → usr → include
* Step 5: Double click Availability.h to open in Xcode
* Step 6: Find the following lines: #define __TVOS_UNAVAILABLE __OS_AVAILABILITY(tvos,unavailable) #define __TVOS_PROHIBITED __OS_AVAILABILITY(tvos,unavailable)
* Replace those lines with:
* #define __TVOS_UNAVAILABLE_NOTQUITE __OS_AVAILABILITY(tvos,unavailable) #define __TVOS_PROHIBITED_NOTQUITE __OS_AVAILABILITY(tvos,unavailable)
* Step 7: Save your changes to Availability.h
* Step 8: Try to rebuild the tvOSBrowser using the Play button in Xcode, and it should build successfully
* Step 9: Find the tvOSBrowser app icon on your Apple TV and start browsing the web on your TV
* It’s really a simple thing to do, and takes about 5 minutes, if that, from beginning to end. If you want a browser on your Apple TV, this is one way to do so.
* Would be cool if somebody ran with my project and made something usable with it – was just a quick hack on my part
* — Steve T-S (@stroughtonsmith) November 6, 2015
* This browser is very basic, but the original developer, Steve Troughton-Smith, is hoping that others take the foundation that he has laid and build on it.
* As of now, here’s what you can do with the browser:
* Have you tried the tvOSBrowser on your Apple TV? If so, what did you think about it?

