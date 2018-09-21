---
layout: post
title: Apple's M7 motion coprocessor caught tracking movement after battery dies
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iPhone-5s-keynote-M7-specs-slide.jpg)
* Apple’s M7 motion tracking chip found inside the iPhone 5s, iPad Air and iPad mini with Retina display is apparently able to track a user’s motion activity even after the battery dies. According to a post by Reddit user Glarznak, his iPhone 5s was able to track his every movement even after the battery died on him. He was able to confirm this by using the Argus fitness app which showed a number of steps for the four days that his phone was dead…
* As Glarznak explains (via iPhone in Canada), his iPhone 5s was left without juice while traveling abroad because his Lightning cable broke (sounds familiar?).
* Upon returning home, he noticed the device continued to track his movement even though the battery was long dead.
* While traveling abroad, my iPhone cable stopped working so my 5s died completely.
* I frequently use Argus to track my steps (highly recommended if you have any health bands or accessories) since it takes advantage of the M7 chip built into the phone.
* Once I got back from my vacation and charged the phone, I was surprised to see that Argus displayed a number of steps for the 4 days that my phone was dead.
* I’m both incredibly impressed and slightly terrified.
* Here’s a screenshot of Argus (available free in the App Store).
![img](http://media.idownloadblog.com/wp-content/uploads/2014/03/WIbSZCm.jpg)
* I’m not sure what to make of this, but I do know the following.
* Apple advertises the M7 as a low-power module that runs independently of the main A7 processor.
* Chipworks identified the M7 as a rebranded NXP LPC1800 based microcontroller which runs an ARM-based Cortex-M3 core. It’s very power efficient, being able to run maxed out at about 0.6 watts at 60Mhz and 2.2 watts at 180Mhz.
* We also know from a finding by the Argus app developer that the M7 stores up to seven days worth of step information in its internal memory, providing apps with a user’s historical movement information.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/Argus-Motion-Activity-access.png)
* Although idle for most people most of the time, when the M7 does run it doesn’t need to wake up the main A7 processor at all. And because it collects motion activity data from low-power sensors such as the accelerometer, compass and gyroscope (cellular and wireless communication is handled by a separate power-hungry Qualcomm chip), it’s safe to assume the M7 is capable of running on what little charge is left in the battery after the device auto-shuts down itself.
* As you know, iOS devices power down automatically before the battery is completely drained. This is by design because after all, some power is needed for the shut-down procedure itself and to save the device’s and apps’ state in internal storage.
* How do I know this?
* Because an iOS device still displays the no charge icon if you attempt to turn it on after it powered itself down.
* I’m only speculating here and your guess is as good as mine so join the conversation down in the comments because I want to hear your take on this.
* Note to Glarznak: the next time you travel abroad, bring an off-the-grid charger.

