---
layout: post
title: Inaccurate iPhone 5s sensor readings blamed on new accelerometer supplier Bosch
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/10/bad-level.png)
* Cody recently relayed a Gizmodo report describing how an unknown portion of iPhone 5s owners have been experiencing inaccurate compass and inclinometers readings, consistently off by a noticeable margin. A huge thread on Apple’s support forums details the persistent problem.
* One report Wednesday offered the most likely culprit: a change in supplier. It wasn’t immediately clear whether the issue can be fixed by way of firmware update or if some sensors are off by design, in which case Apple might replace faulty iPhone 5s units at no cost…
* My first thought was that this could stem from a change in supplier.
* As I reported a month ago, silicon experts over at Chipworks were able to identify the accelerometer inside the iPhone 5s as a Sensortech BMA220 unit made by Bosch, representing a notable change from the iPhone 5 which uses an accelerometer from Apple’s longtime supplier STMicroelectronics.
* RealityCap agrees (via MacRumors), noting the Bosch device has a larger measurement bias, adding up to a different zero-g offset.
* This is where we find the problem: the typical bias for the ST part is +/- 20mg, while the Bosch part lists +/-95mg. This almost 5x greater offset range is confirmed by our measurements, and is absolutely consistent with the failures being reported by users and the media.
* Specifically, a +/- 20mg offset range would translate to around a +/-1 degree accuracy range in tilt detection, and a +/-95mg offset translates to +/-5 degrees in tilt.
* RealityCap mentions that the zero-g offset can also change over time due to mechanical stress or temperature variation.
* Here’s the Bosch part under Chipworks’s electron microscope.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/bosch.jpg)
* According to Chipworks, the three-axis gyro inside the iPhone 5s is the STMicroelectronics B329 unit, as expected. As for the compass, it’s AKM’s AK8963 3-axis electronic compass IC:
* The AK8963 combines a magnetic sensors to detect X, Y, and Z axis, a sensor driving circuit, arithmetic circuit and signal amplifier chain.
* Here’s another shot depicting the sensor circuitry.
![img](http://media.idownloadblog.com/wp-content/uploads/2013/10/iPhone-5s-MEMS-Chipworks-001.jpg)
* Bosch is a large German industrial company producing, among many other things, household appliances, automotive parts and technology. The Sensortech BMA220 is the first Bosch MEMS device to make its way inside any iPhone.
* Further confirming RealityCap’s speculation, I’ve heard no reports about inaccurate compass and level readings plaguing iPhone 5 owners.
* If these inaccuracies can be easily compensated for in software, the upcoming iOS 7.1 – perhaps due at Apple’s October 22 media event – should be able to fix the glitch.
* Are your iPhone 5s readings off?
* I checked mine and it seems to work as advertised.

