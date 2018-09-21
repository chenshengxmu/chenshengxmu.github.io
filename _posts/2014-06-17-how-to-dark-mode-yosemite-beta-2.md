---
layout: post
title: How to enable Yosemite's somewhat functional dark mode
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/WWDC-2014-keynote-Yosemite-light-mode-001.jpg)
* There were lots of oohs and aahs in response to Apple’s software engineering chief Craig Federighi showing off a new dark UI mode in OS X Yosemite at WWDC two weeks ago. It basically alters the appearance of the menus, sliders, buttons, windows and other UI elements.
* The gorgeously subdued look is inspired by the dark appearance of Apple’s pro software such as Aperture and Final Cut Pro. In fact, I like it so much that I enthusiastically tweeted right after the keynote that I was very much looking forward to using it on a permanent basis come this Fall.
* However, dark mode was notably absent from the first beta of OS X 10.10 and is nowhere to be found in the just-released Beta 2. For a good reason, too, as it’s unfinished and very much work in progress so not really ready for prime time yet.
* If you’re a type of person who can’t wait to see it in action, you can enable Yosemite’s dark UI using just a simple Terminal command…
* Finder’s regular light UI mode can be seen top of post.
* Below is what the new dark mode looks like.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/WWDC-2014-keynote-Yosemite-dark-mode-001.jpg)
* Though officially unavailable in Beta 2, you can unofficially turn it on via a simple Terminal command discovered by iOS developer Hamza Sood.
* Here’s how to turn dark mode on and off in the second Yosemite beta.
* Launch Terminal using Spotlight or by firing it up from the Applications folder and paste the following line:
* sudo defaults write /Library/Preferences/.GlobalPreferences AppleInterfaceTheme Dark
* Type in your administrator password to execute the command. Quit Terminal, restart your Mac and voilà – you should launch straight into Yosemite’s dark mode.
* As I told you, the somewhat functional feature is rough around the edges and not really ready for prime time yet. Luckily, you can just as easily revert back to light mode by pasting the following line into Terminal:
* sudo defaults write /Library/Preferences/.GlobalPreferences AppleInterfaceTheme Light
* Again, upon providing your administrator password and restarting the machine, light mode will be re-enabled.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/06/OS-X-Yosemite-dark-mode-Hamza-Sood-001.jpeg)
* It’s awfully nice that the Dock participates in dark mode as well.
* My guess is Apple will eventually add a light/dark mode switch to the General pane of System Preferences. Yosemite’s smoky eye look should come in handy for getting some work done or whenever you need to fully concentrate on the task at hand.
* It’s really indispensable when you must focus on the centre of the screen without being distracted by bright menus, dock and other UI elements. I don’t know about you, but as far as I’m concerned that gorgeously done dark appearance is a reason alone to upgrade to Yosemite.
* Will you be using dark mode in Yosemite?
* More of a bright UI type of a person, aren’t we?

