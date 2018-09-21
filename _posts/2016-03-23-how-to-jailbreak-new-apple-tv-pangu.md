---
layout: post
title: How to jailbreak the new Apple TV using Pangu
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Jailbreak-Apple-TV.jpg)
* Now that the Pangu Team has released their jailbreak for the new Apple TV, we have had some hands-on time with the tool and were successful in jailbreaking our own test device. In this post, we will share detailed step by step instructions on how to jailbreak the new Apple TV using Pangu. Before we get started, we must share a few words of caution.
* We’ve touched on this on previous posts, but it’s important enough to remind users of the limitations of that jailbreak. Below are a few things you must take into account even before attempting to jailbreak:
* Because this jailbreak is slightly different from what we are used to, there are a few pre-requisites that need to be met.
* Hardware and software:
* As mentioned, this will also only work with tvOS 9.0 or 9.0.1. If you have already updated to 9.1 or 9.2, unfortunately there is no way to downgrade. Luckily, most Apple TVs being sold in Apple Stores are still on one of these two versions. If you check the serial number with this simple tool it will tell you when it was manufactured. As long as it was manufactured before December, you are good to go.
* Now that we have some basic pre-requisites out of the way, let’s move along with instructions.
* 1) Download the latest version of Pangu from our Downloads page. Since this jailbreak uses Xcode, it is Mac only at the moment.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Screen-Shot-2016-03-23-at-10.25.31-AM.png)
* 2) To start, we will need to register our device. Plug in both the power cord, and the USB-C cable. To register, we need the UDID, which can get from launching Xcode, then navigating to Windows > Device and choose the connected Apple TV. It will appear as a long strand of characters. Copy that, or save it somewhere for the next step.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Screen-Shot-2016-03-23-at-10.30.26-AM.png)
* 3) Login to your developer account and visit the devices page. Register the Apple TV you would like to jailbreak by giving it a name, and entering the UDID we retrieved in the last step.
* 4) Once we have registered the device, we have to create an app ID to accompany the jailbreak. Visit the App IDs page and give it a name, and a bundle ID.
* 5) Those two pieces of information allow us to generate a mobile provision file. Visit the provisioning profiles page and choose tvOS development. Click next, choose your developer certificate, select the Apple TV(s) you would like to jailbreak, and download the file.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Screen-Shot-2016-03-23-at-10.35.36-AM.png)
* 6) Once downloaded, rename the file to embedded.mobileprovision and add it to the Apple TV jailbreak folder we downloaded from Pangu in step 1.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Screen-Shot-2016-03-23-at-11.21.00-AM.png)
* 7) To install, we need to get your team ID and common name. This can be found by opening Keychain Access, choosing certificates, and locating your developer certificate. We need the Common Name, and the Organizational Unit. The Organizational Unit will be your team ID.
* 8) Once you have that information we are ready to launch the install script. Swap the perimeters for the ones we located. So the blank version is: Install_atv_jb.sh <udid> <bundleid> <team id> <common name id>
* Then we swap in our information. The UDID of your device, the bundle ID of your app, the team ID and common name from Keychain. It should look similar to this:
* Install_atv_jb.sh e5e2c931d4a94ecf71e12a88b0b4579b com.sample.tvjb 93AA45BBCC “iPhone Developer: test (ALI766JXB5)”
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Screen-Shot-2016-03-23-at-11.20.26-AM.png)
* 9) This will install the Pangu app on your Apple TV, and you can launch that app to install the jailbreak. It will show a screen saying that it is jailbreaking, before restarting.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Screen-Shot-2016-03-23-at-11.44.02-AM.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2016/03/Screen-Shot-2016-03-23-at-11.46.33-AM.png)
* So that’s it. You have successfully jailbroken your 4th generation Apple TV. Obviously this is aimed at developers and security researchers and offers no real GUI interface, it is promising for subsequent iterations. Keep an eye on iDB for more jailbreak news coming in the future.

