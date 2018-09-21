---
layout: post
title: How to wirelessly connect devices to Xcode and Quicktime
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/03/xcode.png)
* Developers are always connecting their devices to their machines. It has been a necessary evil to install apps, perform diagnostics, screen recordings, and more. In Apple’s purge of wires, Xcode 9 has unlocked the ability to connect tvOS, or iOS devices to your Mac wirelessly.
* When everyone discovered the new Apple TV ditched the USB-C port that was previously used for this, it raised a lot of eyebrows. Luckily, the fourth and fifth generation Apple TV can connect wirelessly, alongside iPhones and iPads.
* This is extremely useful for developers because they are no longer required to carry a cord around with them to install new builds of their apps.
* Let’s look at how you can connect an iOS or tvOS device to Xcode 9, what you can do, and what the requirements are.
* To start, you will need compatible devices running compatible software. That includes:
* To start, go ahead and launch Xcode. Go to the menu bar, click on Window > Devices and Simulators. Or you can press the shortcut Cmd+Shift+2 instead.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Screen-Shot-2017-09-14-at-4.00.35-PM.png)
* This window has two tabs along the top. One for Devices, the other for Simulators. Be sure the Devices option is selected. Now, there are slightly different routes to take, based on whether you are connecting and iOS device, or a tvOS device.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Screen-Shot-2017-09-16-at-12.49.09-AM.png)
* Before you can connect to your iOS device wirelessly, you must first pair it with your Mac by plugging it in with a Lightning cable. Once you do, check the box that reads Connect via network. Now you can disconnect your phone, and it will show up inside of the devices window, and as an option insider of Xcode as a destination to build your apps.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Screen-Shot-2017-09-14-at-3.53.39-PM.jpg)
* For Apple TV, you can’t plug it in via Lightning. For one, the Apple TV doesn’t have a Lightning port. The fourth generation does have a USB-C port, but the fifth generation doesn’t have that either. Luckily, it’s even easier, and absolutely no cords are necessary. Make sure that the organizer window is open, then on your Apple TV, go to Settings > Remotes and Devices > Remote App and Devices.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-TV-Xcode-Pairing-Code.jpg)
* Your Apple TV will automatically display a pairing code that you can enter on your Mac. Once Xcode detects your Apple TV, the organizer window will present you a field to enter those 6 digits. Make sure that Connect via network is selected, now anytime you open Xcode, you will see your Apple TV available for development.
* One nice thing is that there is no configuration required on most networks. They just automatically connect.  In some business environments, where things are more locked down, you can manually go in and connect by IP address. Basically, if you are able to ping the Apple TV on the network, Xcode can connect to it.
* Aside from the usual development work, this is also a great way to take screenshots. On iOS devices, this can be annoying because you have to time it up and hit multiple buttons at once to make it happen. On your Apple TV, there is no command, so this is one of the only ways to do it, but now you no longer have to plug it in.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/Apple-TV-Screen-Recording-in-Quicktime.jpg)
* If you ever wanted to do a screen recording of your Apple TV, QuickTime can also now help with that wirelessly. Once you have your Apple TV paired, open QuickTime. Head to the menu bar and click File. Then choose New Movie Recording. When it loads, clicking the down arrow next to the record button allows you to choose the camera input, and you should see the name of your paired Apple TV listed.
* Unfortunately, screen recording for iOS devices through QuickTime still only works when it is plugged in. This would be a great addition in the future, especially for someone like me who created screen recordings through QuickTime frequently.
* I think the ability to develop wirelessly is a great new addition to Xcode, and there are even additional benefits for non-devs as well. It feels like Apple is not only making things easier, but giving more options as well. Aside from wirelessly connecting, and connecting over USB, Ethernet is also now an option. The new Apple TV 4K would be able to connect this way in any situation where you don’t have the ability to join a shared network.
* What do you guys think of these new additions to Xcode? Do you like that Apple has worked hard to make even more aspects of the Apple ecosystem wireless? Are there any Xcode features you are still waiting on? Let us know down below.

