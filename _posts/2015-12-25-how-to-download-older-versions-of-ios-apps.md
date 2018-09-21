---
layout: post
title: How to download older versions of iOS apps
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/12/Download-Old-Versions-of-iPhone-Apps-2.jpg)
* Charles Proxy is a tool for OS X that can be used to facilitate the download of older versions of iOS apps from iTunes. It’s a bit of a drawn-out exercise, but if you’ve ever been in need of an older version of a particular app, then you know how handy such a technique can be. In this video, which was inspired by this Reddit post, I’ll show you how to download older iOS apps directly from iTunes on Mac.
* Note: Please watch the video in its entirety before trying this. You’ll save yourself a lot of time.
* Step 1: Download, install, and launch Charles. Click Grant Privileges and enter your administrator password.
* Step 2: Download an app that you wish to downgrade from iTunes, and watch the download activity in the Structure section inside Charles. You should see a “buy” server.
* Step 3: Right-click on the “buy” server and click Enable SSL Proxying
* Step 4: Stop the iTunes download.
* Step 5: Search for the app again in iTunes to bring up the details page, and download the app again. Cancel the download again
* Step 6: Click the disclosure triangle by the “buy” server and click buyProduct.
* Step 7: Click the Response tab, right click on buyProduct and click Export. Select the Desktop as the Export location, select XML for format, and click Save.
* Step 8: Open the XML file using a text editor, and scroll down to locate the following line:
* <key>softwareVersionExternalIdentifiers</key>
* Under that line you should see a list of numbers similar to this:
* <integer>1862841</integer> <integer>1998707</integer> <integer>2486624</integer> <integer>2515121</integer> <integer>2549327</integer> <integer>2592648</integer> <integer>2644032</integer> <integer>2767414</integer>
* These are all of the versions of the app, starting from oldest to newest.
* Copy the version number that you wish to download. You’ll have to do some guess and checking if you’re looking for an exact hit on a specific version. In the video tutorial above, I simply select the oldest version. Close the text editor.
* Step 9: Back in Charles, right-click on buyProduct and select Edit.
* Step 10: Click Text and find the following line near the top of the page:
* <key>appExtVrsId<key>
* Underneath that text, you’ll see a numerical value inside <string> tags. Paste the value you copied in step 8 to replace the value that’s displayed. Once you do that, click the Execute button at the bottom of the screen.
* Step 11: Scroll down under the Response tab and you should see the bundleShortVersionString. Underneath that, you’ll see the actual numerical version of the app that you keyed in on. You can repeat this process until you hone in on the specific version that you’re after.
* Step 12: Right-click on the last buyProduct in the list under the “buy” server, and click Breakpoints.
* Step 13: In iTunes, search for your app again to refresh the page, and click the Download button to initiate the download again.
* Step 14: Back in Charles, you may see the Charles splash screen appear briefly. Click Edit Request → XML Text, and paste the version ID that we copied in step 8 under the <key>appExtVrsId<key>. Click Execute again.
* Step 15: You’ll see another breakpoint, just click Execute again.
* Step 16: Check iTunes, and the download should commence and complete.
* Step 17: Click the My Apps tab, and you’ll see your downloaded app. It should be the older version of the app. You can right-click and select Get Info to verify the older version number.
* Step 18: Connect your iPhone to your Mac, and drag the app icon for the older version of the app to your iPhone. You’ll need to make sure that any newer versions are uninstalled from your iPhone before you can install the older version.
* Step 19: Close and uninstall Charles once complete.
* And that’s all there is to it. Please watch our video walkthrough above, because this tutorial isn’t as daunting as it may seem.
* Let me know what you think in the comment section.

