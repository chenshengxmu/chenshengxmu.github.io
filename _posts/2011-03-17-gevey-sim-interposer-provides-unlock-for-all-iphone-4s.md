---
layout: post
title: Gevey SIM Interposer Provides Unlock For All iPhone 4s
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/03/GEVEY-SIM-UNLOCK.png)
* Remember the days of the TurboSIM, and how that was a popular method for unlocking the iPhone 2G in 2008?
* Gevey, one of the companies that was a leading provider of those TurboSIMs has released a SIM Interposer which can unlock the iPhone 4 up to iOS 4.3 by force activating the baseband using the emergency dialer.
* The way Gevey’s SIM Interposer works is by adding a EEPROM chip to your SIM card similar to a TurboSIM. You then call 112 (free of charge) from the Emergency Dialer screen. Once the call connects you hang up then toggle Airport mode on and off. When the network connection resumes you will be unlocked.
* iPhone Dev Team member @MuscleNerd hasn’t stated whether it’s legit or not, but states that the method is interesting. There is also some concern as to whether this is legal or not.
* Laforet of Singularity Blog has posted a complete run down of the SIM interposer with all the nity grity details:
* How did It Work?
* SIM card holds many different types of information, but the part most involved with carrier lock is the IMSI number, which is a unique code that corresponds to your account in the mobile carrier’s database.
* A sample IMSI might look like this
* 310 150 987654321
* The first two segments are known as Mobile Country Code (MCC) and Mobile Network Code (MNC) respectively, and in the example above the IMSI indicate the SIM is from USA (310) AT&T (150).
* When the iPhone baseband is loaded into memory, it checks the MCC and MNC against its own network lock state stored in the seczone. If the combination is allowed, the cell radio is activated and vice versa.
* The earliest iPhone baseband revisions only check IMSI twice following a restart, therefore it is very easy to send spoof information in order to bypass the check. Nevertheless, the baseband was soon updated to validate SIM more aggressively and the method soon became obsolete.
* What does it mean to Unlockers?
* It works if A.your network handles 112 calls properly according to the GSM standard; B.they are tolerant to TSMI spoofing and does not actively validate your SIM again for incoming calls.
* Unlike its ancestors, the i4 SIM interposer is not a drop-in-and-forget device. The exact precedure must be performed should the device restart, lose reception for an extended period of time or move to another PLMN. In all these situations the TMSI expires and has to be obtained again. Theoretically it is possible for a daemon to automate the process similar to ZeroG, but that only makes thing more convoluted.
* It is, without question, unethical or downright illegal to use the technique anywhere 112 is a legitmate emergency number. Not a huge issue in China where the number is only used for informative purposes and the networks cannot be bothered to fix the issue.
* All firmware/baseband combinations for the i4 up to iOS4.3 are vulnerable, however the exploit may be patched in any future software updates or via the carrier. If apple can influence providers to block Cydia it is not impossible for them to press them to fix the exploit. The only way to permanently unlock your baseband is NCK.
* SIM interposer should not harm your phone hardware, however your network could request IMEI and identify your device during the emergency call. Your identity cannot be faked and it is possible that they will ban your account. There is a reason why SIM cards remain legally the property of the service provider: you are not supposed to tamper with them without breaching contract.
* Notwithstanding all the problems, SIM interposer does not cause any battery drain since it is only active transiently, nor would it cause signal loss because it does not change cellular transmission other than the initial validation step.
* For those tired of waiting for an iPhone 4 unlock this may be a possible solution, although since it is questionable whether it’s legal or not we would not recommend it. We would recommend you wait for details on the upcoming possible permanent unlock solution from the Dev Team.
* Check out the a demonstration of Gevey’s SIM Interposer below:
* Let us know your thoughts in the comments!
* [Singularity]

