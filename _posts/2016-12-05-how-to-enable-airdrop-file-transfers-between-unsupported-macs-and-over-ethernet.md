---
layout: post
title: How to enable AirDrop file transfers between unsupported Macs and over Ethernet
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/Airdrop-Older-Mac-Header.png)
* The AirDrop file transfer protocol, introduced with Mac OS X Lion and iOS 7, is a fast and convenient way to transfer files between Apple devices. The current version of the service is interoperable between iOS and macOS, but requires both Bluetooth and Wi-Fi to be active in order to work. It also requires Mac OS X Yosemite or newer and a hardware model from 2012 or later.
* However, the version of AirDrop that shipped as standard with OS X between 10.7 (Lion) and 10.9 (Mavericks), whilst unable to send files to iOS devices, works without Bluetooth and on Mac models going back as far as 2008. Luckily, alongside the newer version, this legacy mode is still included on all Mac models to date, and as this guide will show, can be modified to have an even broader functionality. If you have a pre-2008 Mac, a Hackintosh, a Mac without Bluetooth functionality, or a Mac of any age connected purely by Ethernet, this guide may be right up your street.
* I find this tip to be very useful and use it on all my machines, but as its usages are fairly specific, it’s worth taking a moment before we proceed to note what this guide can and can’t achieve, so as to avoid confusion:
* 1) Launch Terminal from /Applications/Utilities or via Spotlight.
* 2) Enter the following command, and hit the “Enter” key:
* defaults write com.apple.NetworkBrowser BrowseAllInterfaces 1
* 3) Enter the following command, and hit the “Enter” key:
* killall Finder
* 4) Close the Terminal. If on a completely unsupported Mac, check that the Finder sidebar now shows an AirDrop entry, and open it. If on a supported Mac, simply open an AirDrop window.
* 5) If prompted, click the button to “Turn On Wi-Fi and/or Bluetooth”
* 6) In the AirDrop window, ensure that “Allow me to be discovered by:” is not set to “No One”.
* 7) Click the “Don’t see who you’re looking for?” text in the bottom-right of the window, then click the “Search for an Older Mac” button that appears, to enter legacy mode.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/AirDrop-Older-Mac-4.png)
* 8) Repeat these steps on all other Macs that you want to send files to.
* 9) Ensure that all the Macs appear in each other’s AirDrop windows and that transfers between them work. If testing the Ethernet sending functionality, disable Wi-Fi on one or both of the machines to check that the files are indeed using the wired interface.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/AirDrop-Older-Mac-3.png)
* Success! My desktop machine, connected only by Ethernet, is now visible for AirDrop sharing on my laptop. Using this added functionality doesn’t seem to have any negative effects on AirDrop’s speed or reliability, and doesn’t affect the workings of the newer protocol either, so it seems a win-win. However, if you would like to revert the changes you have made, follow the instructions below.
* 1) Launch Terminal from /Applications/Utilities or via Spotlight.
* 2) Enter the following command, and hit the “Enter” key:
* defaults write com.apple.NetworkBrowser BrowseAllInterfaces 0
* Or, if you prefer to completely remove the setting rather than disabling it, use:
* defaults delete com.apple.NetworkBrowser BrowseAllInterfaces
* 3) Enter the following command, and hit the “Enter” key:
* killall Finder
* 4) Close the Terminal. If on a completely unsupported Mac, check that AirDrop has completely disappeared from the Finder. If on an AirDrop supported Mac, check that the legacy mode no longer shows machines connected via Ethernet.
* If at any point you wish to check the current status of the AirDrop hack, issue this command in Terminal:
* defaults read com.apple.NetworkBrowser
* If the readout states that the variable “BrowseAllInterfaces” does not exist or has a value of “0”, the hack is disabled; a value of “1” indicates that it is enabled. The screenshot below shows the Terminal readout you should expect if you check the status of the hack after enabling it.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/AirDrop-Older-Mac-2.png)
* Do you have any other tutorials you’d like to see us write up for you? Do you have a Hackintosh, an older machine, or an Ethernet-only computer? Let me know in the comments how this method works out for you.
*  

