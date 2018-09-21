---
layout: post
title: Apple details 4K hardware support in OS X 10.9.3
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/osx_1093_4k_support-800x493.jpg)
* Perhaps the key headline feature of the newly-released OS X Mavericks 10.9.3 is proper support for external 4K monitors. Previously, Mavericks would render text, icons and other user interface elements as-is, so everything appeared tiny due to the densely packed pixels on 4K monitors.
* OS X 10.9.3 uses pixel-doubling to enable a true Retina experience where the size of the user interface does not change, it’s just a lot sharper because OS X has a lot more pixels per square inch to work with.
* Apple has now refreshed its support document with detailed information regarding compatible 4K monitors, display modes, video interfaces and Macs…
* According to Apple, the 15-inch MacBook Pro with Retina display and the new Mac Pro (both late-2013 models) support the following 4K resolutions via HDMI on external displays and Ultra HD TVs: 3,840-by-2,160 at 30Hz refresh rate and 4,096-by-2,160 pixels at 24Hz refresh rate.
* Mirroring is unsupported at the 4,096-by-2,160 resolution via HDMI on either machine.
* On the Retina MacBook Pro, these resolutions and refresh rates are supported through the notebook’s built-in HDMI port. Owners of the new Mac Pro can hook up an external 4K display or Ultra HD TV through either the built-in HDMI port or DisplayPort (Thunderbolt I/O).
* OS X 10.9.3 is now able to render 4K resolution properly at 60Hz refresh rate over DisplayPort on the Sharp PN-K321, Asus PQ321Q, Dell UP2414Q, Dell UP3214Q and Panasonic TC-L65WT600 monitors.
* Mavericks officially supported only the Sharp and Asus displays prior to 10.9.3. Also, only the Mac Pro previously supported 4K displays at 60Hz.
* Pro tip: to see all the available resolutions, hold down the Option key while clicking the Scaled button in System Preferences > Displays.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/OS-X-Mavericks-10.9.3-Display-preferences-4K.png)
* For those wondering, 60Hz refresh rate allows for smoother images because the screen gets refreshed sixty times per second. This is important for fast-paced action games, video editing and general image stability and sharpness.
* Curiously enough, 10.9.3 defaults to the less pleasing 30Hz refresh rate using single-stream transport (SST) instead of 60Hz using multi-stream transport (MST).
* Fortunately, Apple provides instructions for manually configuring your DisplayPort-capable monitor to use MST using its built-in controls:
* • Sharp PN-K321: Choose Menu > Setup > DisplayPort STREAM > MST > SET • ASUS PQ321Q: Choose OSD menu > Setup > DisplayPort Stream • Dell UP2414Q and UP3214Q: Choose Menu > Display Setting > DisplayPort 1.2 > Enable • Panasonic TC-L65WT600: Choose Menu > Display Port Settings > Steam Setting > Auto
* “Your Mac will automatically detect an MST-enabled display,” writes Apple.
* Other DisplayPort-compatible monitors may be supported as well, but you’ll need to confirm compatibility information with a manufacturer. Also, a firmware update may be needed for your 4K monitor to support 60Hz refresh rate.
* Some displays that use BGR supbixel order such as a Seiki may exhibit problems with your Mac because OS X only supports standard RGB order.
* And should you run into unsolvable 4K compatibility issues with your display, you could always install Windows in Boot Camp and use the monitor under Microsoft’s operating system with its native Windows driver.
* Given certain hacks enable 4K at up to 120Hz in 10.9.2, I find it a little disappointing that Apple does not support higher refresh rates.
* Now that Apple officially supports other people’s 4K monitors, it’s fairly safe to assume that a 4K-enabled Thunderbolt Display is in the works. In the meantime, some of the aforementioned 4K screens can be had for less than $1,000 on eBay, Amazon and elsewhere.
* For example, Samsung’s 28-inch Ultra HD LED display is only $689 on Amazon.
* OS X Maveriks 10.9.3 is a free download via the Mac App Store’s Updates tab.

