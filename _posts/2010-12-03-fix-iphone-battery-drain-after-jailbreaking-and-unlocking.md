---
layout: post
title: Fix- iPhone Battery Drain After Jailbreaking and Unlocking
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/12/iphone-full-battery.jpeg)
* As we reported earlier this week, some of you who have recently updated your baseband to 06.15.00 to jailbreak and unlock have been facing battery drains issues. The problem doesn’t actually come from UltraSn0w or RedSn0w, but from the hacktivation process, for those of you who have hacktivated instead of activating the phone with an official carrier.
* The issue comes from iOS 4.1 and 4.2.1 which constantly look for valid push certificates, either via wifi or your data plan (Edge or 3G). This runs down you battery and may even cause your iPhone to overheat. If you didn’t hacktivate your iPhone but simply activated it with an official carrier (ie AT&T in the US), you shouldn’t have any problem.
* If on the other end you did hacktivate your iPhone, you might be experiencing the battery drain issue. Fortunately, there is now a fix for it…
* Developer @sbingner (author of TetherMe) has made some excellent progress devising a new hactivation method that kills two birds with one stone for all you ultrasn0w unlockers. His tool, “Subscriber Artificial Module (SAM)” tricks your iPhone and iTunes into creating legitimate activation tickets even though you’re unlocked with ultrasn0w. This means you get the full benefit of push applications, and your battery life increases substantially.
* Sbingner explains on his website how to fix this problem by tricking your iPhone and iTunes:
* Step 1: Add the following repo in Cydia: http://repo.bingner.com
* Step 2: Install “SAM” and “SAMPrefs” from this repo.
* Step 3: Now we’re going to revert to a stock lockdownd for SAM to function. To do so, download RedSn0w 0.9.6b6 from our downloads section, launch RedSn0w and select the “Deactivate” option. This will remove the normal patches made to lockdownd and let SAM take over.
* Step 4: Go to Settings > SAM, then click “De-Activate iPhone”.
* Step 5: Make sure iTunes is on, plug your iPhone and let iTunes activate your iPhone. If iTunes says “Invalid SIM”, you will need to manually select a carrier under Seetings > Carrier.
* At this point, you may unlock using UltraSn0w if necessary (see our UltraSn0w tutorial here).
* This fix will allow you to get the full benefit of push applications while increasing your battery life substantially.
* [Sbingner via Dev Team]

