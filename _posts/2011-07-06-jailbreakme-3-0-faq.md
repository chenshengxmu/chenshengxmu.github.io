---
layout: post
title: JailbreakMe 3.0 FAQ
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/07/JailbreakMe-web-banner-e1309966590660.png)
* JailbreakMe 3.0 recently went live for all iDevices on iOS 4.3.3, and Comex’s PDF exploit is the first to successfully jailbreak the iPad 2.
* Although the process of jailbreaking with JailbreakMe is incredibly easy, many of you probably still have questions concerning the userland jailbreak. The iPhone Dev Team has put together a helpful FAQ outlining the details behind JailbreakMe 3.0…
* Q: Which devices and firmware versions are supported?
* A: In this initial release, the following configurations are supported:
* Q: Do the holes discovered by @comex put my device at risk?
* A: Yes.  We recommend installing “PDF Patcher 2” in Cydia once you’re jailbroken to eliminate this risk (any firmware version).
* Q: How does jbme3.0 differ from the existing jailbreaks?
* A: jbme3.0 is entirely userland-based, from start to finish.  The A5 chip in the iPad2 has no iBoot or bootrom-level exploits yet, so tools like redsn0w, PwnageTool and sn0wbreeze can’t use the limera1n bootrom exploit to inject the jailbreak.  Even for those devices where limera1n works, jbme3.0 injects the jailbreak with a userland exploit.
* Q: If I’m already jailbroken on the latest firmware, is there any advantage to jailbreaking again?
* A: No, but you should consider showing this to your friends!  Spread the jailbreaking fever.
* Q: Are the holes exploited by jbme3.0 closed in iOS5?
* A: The holes still exist in the iOS5 betas, but they’ll almost certainly be fixed by the time iOS5 is public.  However because the iPad2 had no public jailbreak yet, it probably wasn’t worth waiting until the fall to use them.  If history repeats itself though, there will be more holes and exploits.
* Q: Will I permanently lose the jailbreak if I need to restore my device?
* A: For all except the iPad2, saving your SHSH blobs should let you always restore your device to iOS versions where this jailbreak works.  The iPad2 is a little more complicated.  If you have a wifi-only iPad2 and saved SHSH blobs, you’re in good shape.  But if you have the GSM or CDMA iPad2, you won’t be able to restore to 4.3.3 or lower once Apple stops signing its baseband.  There are a few ideas that might work to get around this limitation, but for now it’s best to assume there’s no going back to 4.3.3 once 4.3.4 is out for iPad2 GSM or CDMA owners.
* Q: I heard this new unionfs stuff is dangerous?
* A: Define dangerous 🙂  Seriously though, although unionfs is a huge improvement to the install time of the jailbreak, it is brand new code and there is the possibility something will go wrong.  Just keep regular backups of your media and content and you should be fine.  If there are any problems, they should appear within the first few days, so hold off and let “everyone else” test the waters if you’d like.
* Comex also answered a pressing question about JailbreakMe’s PDF exploit:
* Q: Isn’t there a risk hackers will make the exploit from this site into an iPhone virus?
* A: When I released JailbreakMe 2.0 last year, some media reports focused on the security implications of releasing an exploit for unpatched vulnerabilities. I am not sure myself what to think of this, but here are some facts:
* For an ongoing list of user-submitted questions and concerns you can check out the Jailbreak QA page.
* Any more questions?

