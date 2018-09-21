---
layout: post
title: Don't try this at home- iPhones apparently getting bricked after date is set back to a specific time
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/iOS-9-Date-and-Time-iPhone-screenshot-001.jpg)
* According to a post on Reddit and reports out of China, it is possible to brick an iPhone by setting the date back to a specific time.
* I wasn’t brave enough to test it myself, but the post claims the bug only affects 64-bit iOS devices.
* It would seem that changing the device’s Date & Time values to a specific point in time would cause it to fail to boot properly.
* Basically, it gets bricked and stuck at the Apple logo boot image. Neither DFU mode nor restoring from a backup would bring a bricked device back to life as a physical repair is required to put it back into working order.
* You are wholeheartedly discouraged from trying this on your iOS devices. We don’t want our readers to brick their iPhones permanently and iDownloadBlog shall not be held liable should you decide to proceed.
* To reproduce the issue, you would need to go to Settings → General → Date & Time and flip the switch next to the Set Automatically switch to the OFF position.
* You would then need to change the date to January 1, 1970. You should be able to hit this date by scrolling up to get to year 2000, then go back, into Date & Time settings again and repeat the process until you reach 1970.
* As a final step, you would need to reboot your device, which would cause it to get bricked. Neither a DFU restore nor Recovery mode would un-brick it, the poster claims.
* Fun fact: January 1, 1970, is a special date in coding known as Unix epoch.
* Another report claims an Genius Bar employee did not believe the validity of this when a customer sent his iPhone in for repair. “He tried to replicate the issue on his own phone and as a result had to send both his own phone and that customer’s phone into repair.
* “The restore will succeed, but the device will still not boot after restore,” reads the article. This issue affects any iPhone, iPod touch or iPad with a 64-bit chip (A7, A8, A8X, A9 and A9X chips) regardless of the iOS version being used.
* This could be a longstanding bug in iOS. We have reached out to Apple for comment and will report if we hear back from them.
* 32-bit iOS devices reportedly are not affected. Here’s a video proof by a user who tried and tested the bug on their device and it didn’t work as intended, suggesting the issue may not be reproducible on devices with certain configurations.
* As one poster explains, this may be due to time zones.
* “In some time zones, setting the date to 1 Jan 1970 will set the internal clock to a number less than zero, as the time is stored in GMT (as the number of seconds since midnight on that date) and then the offset is applied before display,” reads the comment.
* “In other time zones, setting the clock will result in a positive time value. Best guess is that this is triggered by having the time value less than zero.”
* Be that is it may, I wouldn’t call shenanigans on this whole thing yet.
* Again, I don’t want to try this myself, and neither should you. The growing Reddit thread suggests many people have bricked various devices after adjusting their device’s date and time, ranging from an iPhone 6s to iPad mini 3 to sixth-generation iPod touch.
* If you’re jailbroken, a Cydia tweak called BrickingDate will prevent malicious users from potentially replicating this bug manually on an unattended device.
* The jailbreak tweak only prevents changes to your device’s Date & Time values through the Settings app. The date can still be changed programmatically, meaning a malicious tweak could still change your date back to 1970.
* Source: Reddit

