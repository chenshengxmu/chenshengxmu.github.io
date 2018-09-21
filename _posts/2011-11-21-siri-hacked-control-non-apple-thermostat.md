---
layout: post
title: Siri Hacked to Control on All Kinds of Non-Apple Devices, Thermostat Included
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/11/Screen-Shot-2011-11-21-at-11.45.18-AM.jpg)
* A hacker that goes by the handle of plamoni has created a Siri proxy server that anyone can use to make the voice-based technology control a range of non-Apple devices. A development firm by the name of Applidium recently hacked the Siri security protocol and detailed the process for anyone to implement.
* Since then, plamoni has taught Siri new commands that allow it to communicate with any standard, Wi-Fi-capable thermostat. With the server’s source code available for free online, anyone with access to an iPhone 4S unique identifier and a good understanding of networking standards can hack Siri in a similar fashion.
* The setup involves a DNS server on a personal network that uses the proxy to forward requests sent to Apple’s Siri servers (guzzoni.apple.com). The man behind the proxy server says that, “The idea is to allow for the creation of custom handlers for different actions.”
* As you can see in the video, Siri is able to control the thermostat by adjusting the temperature. The thermostat’s current temperature can even be relayed.
* The hacker behind the proxy server has detailed whether or not this hack creates a Siri port opportunity for older iDevices.
* Will this let me run Siri on my iPhone 4, iPod Touch, iPhone 3G, Microwave, etc?
* Short answer: No.
* Longer answer: While this doesn’t let you do such a thing, it could HELP with such a thing. For instance, if you get Siri installed on your iPhone 4 (don’t ask me how to do this, I really don’t know), and you get someone to give you a valid iPhone 4S UDID (don’t ask me for mine, I will ignore your request), you could use this proxy in order to substitute the valid UDID for your device’s invalid UDID. It would be pretty trivial. Of course, that would allow anyone with access to the proxy use your UDID, so I’d recommend against that sort of action on anything externally accessible without performing some sort of authentication (might I suggest, checking the phone’s UDID? hehe).
* We’ve seen Siri running on the iPhone 4 and iPod touch 4G, but the hack is not easily replicated and definitely not able to be publicly distributed.
* This Siri proxy server magic is not for the faint of heart, but if you have a thing for network certificates and OpenSSL, you may be able to come up with some really cool Siri implementations. You can find out more about the project on its GitHub page.
* [The Next Web]

