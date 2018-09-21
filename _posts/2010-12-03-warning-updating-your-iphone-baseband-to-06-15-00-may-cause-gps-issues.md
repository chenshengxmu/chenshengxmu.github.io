---
layout: post
title: Warning- Updating your iPhone Baseband to 06.15.00 May Cause GPS Issues
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/12/GPS-Issue-e1291372773109.png)
* It’s getting increasingly harder and risky to unlock the iPhone. Proof is with the recent release of the UltraSn0w unlock for iOS 4.2.1, 4.1, and 4.0.2, which require you to update your iPhone baseband to 06.15.00 in order to be able to unlock.
* As reported by many unlockers and officially confirmed by the Dev Team, there is an issue with baseband 06.15.00 which might cause your GPS to not function properly, if at all. While some users are able to get their iPhone GPS to work, others are experiencing problems…
* Unlockers have been reporting mixed results about GPS functionality at 06.15.00. Until we can track down what differentiates those who retain GPS vs. those who lose it, be conservative and assume you’ll lose GPS at 06.15.00. As we work on finding the cause (and possibly a fix), please report your personal findings in our comments section. (Update: early indications are that while 06.15.00 is capable of GPS, it will require some further hacks. But please still be conservative and assume you will lose GPS at 06.15, in case the hacks don’t work).
* ﻿﻿﻿Hardware designer ThreeFlight2005 explains in a rather technical document why this problem is happening:
* The iPad uses the same, Infineon X-GOLD 608 PMB8878, baseband chip as the 3G and 3GS. (The iPhone 4 uses the Infineon X-Gold 618 PMB9800 Baseband chip) This is the major reason that substituting the iPad Baseband has allowed an unlock. The iPad Baseband is compatible with the PMB8878 Baseband chip; however, it probably does not contain the corret Memory Map and Read-Write commands to interface with the old PMB2525 GPS Chip.
* So in short, it’s a compatibility issue. The hardware is compatible. Now they just need to make the software compatible.
* The Dev Team and others are currently working on this issue. In the meanwhile, if you don’t want to lose your iPhone GSP capabilities, you may want to stay away from this baseband update to 06.15.00.

