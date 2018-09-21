---
layout: post
title: iOS 10 tidbit- 'Hey Siri' intelligently responds on one nearby device at a time
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Siri-waveform-image-001.png)
* iOS 10 adjusts how a tetherless Siri feature works in a rather interesting way. Rather than have every single nearby device respond to the ‘Hey Siri’ command, creating a cacophony of multiple sounds, iOS 10 responds to the hotword on only one nearby device at a time.
* As first discovered by 9to5Mac, the Siri waveform animation reveals that even though all nearby devices are listening for voice input all the time, iOS 10 intelligently determines which devices should stop listening and let just one device take the lead.
* Writer Benjamin Mayo suspects that iOS 10 appears to send a message to other nearby devices to cancel out the listening operation. “This all happens very quickly too, the Siri overlay appears on the secondary device for a fraction of second before disappearing,” reads the post.
* It’s unclear how precisely the feature works, but I’d wager that Apple is using Bluetooth to establish presence information for every device within Bluetooth range, and then sends a direct command to select devices to stop listening, either via Bluetooth or Wi-Fi.
* Apple did not mention anything about this feature at WWDC 2016 nor is it mentioned in the official iOS 10 press release and on the iOS 10 Preview webpage.
* macOS Sierra does not support ‘Hey Siri’ functionality so this usability enhancement has no bearing on computers running a developer preview of macOS Sierra.
* What do you think about this particular improvement in iOS 10?
* Source: 9to5Mac

