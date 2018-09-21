---
layout: post
title: Apple now rejecting apps that use ad tracking but dont show any ads
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/iOS-7-teaser-iPhone-5s-ad-003.jpg)
* An interesting finding by TechCrunch this morning that Apple has now started to reject apps which retrieve users’ Identifier for Advertisers (IDFA), but don’t show any ads. IDFA was introduced alongside iOS 6 two years ago to replace the universal device identifier (UDID) from prior iOS versions amid privacy concerns and new regulatory requirements. The company last March stopped accepting apps into the App Store that use the now defunct UDID…
* TechCrunch on Monday mentioned about developer Tapstream’s app rejection over IDFA.
* A full rejection letter from Apple states that “we found your app uses the iOS Advertising Identifier but does not include ad functionality”.
* “This does not comply with the terms of the iOS Developer Program License Agreement, as required by the App Store Review Guidelines,” Apple warns. The company wants these IDFAs to be used only for advertising, but many apps use to track users, retarget campaigns, buildin user profiles and more.
* “These broad tracking and targeting technologies may be seen by Apple as eroding end-user privacy,” notes Tapstream.
* Per Apple’s rules, the publisher is allowed to access the IDFA, but the advertiser isn’t.  The problem is, ad networks rely on IDFA to track ads and charge advertisers.
* The advertiser needs to access the IDFA and pass it to the ad network to track the install. So 99 percent of the advertiser apps today collect the IDFA and will likely run afoul of this rule.
* According to an overlooked clause in Apple’s agreement with registered iOS developers, IDFA can only be used to personalize ads:
* You and Your Applications (and any third party with whom you have contracted to serve advertising) may use the Advertising Identifier, and any information obtained through the use of the Advertising Identifier, only for the purpose of serving advertising.
* If a user resets the Advertising Identifier, then You agree not to combine, correlate, link or otherwise associate, either directly or indirectly, the prior Advertising Identifier and any derived information with the reset Advertising Identifier.
* And because analytics and optimization services also rely on the IDFA, apps that use such services as Mixpanel have also been rejected for collecting the IDFA, even though Mixpanel’s default integration relies on this identifier.
* Apple for months has been rejecting apps that use cookie-tracking methods, MAC address tracking and UDID.
* Surely the company can find an amicable solution here, one that should take into account the needs of end app makers, advertisers, publishers and ad networks, while preserving users’ privacy.

