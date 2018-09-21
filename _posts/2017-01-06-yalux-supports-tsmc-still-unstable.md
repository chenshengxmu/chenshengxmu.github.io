---
layout: post
title: Yalu + mach_portal now supports TSMC models- still unstable
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/yalu-disclaimer-header.png)
* Luca Todesco’s beta jailbreak for iOS 10.1.x, dubbed YaluX or Yalu + mach_portal, slightly broadened its device support list recently by adding the iPhone SE (TSMC chip version) and iPhone 6s(+) (TSMC chip version) to the club. Bear in mind, we do not yet recommend the tool to the average user, and Todesco himself has spoken of the possible difficulties brought about by too many people making use of the tool in its unfinished state.
* The iPhone 6s and the iPhone SE are very similar devices, and both sourced their chips from two different manufacturers in order to meet their quotas, Samsung and TSMC. Differences in the chips must be taken into account in the coding of the jailbreak tool, and this meant that when it was originally released users of these devices were split; Samsung chip users were supported, whereas TSMC chip users were not.
* The original supported device list for YaluX was as follows:
* We can now add the two models mentioned above to the list, to give a more complete roster:
* As you can see, there is still no support for iPhone 6 or iPhone 5s as of now, though that will apparently come later with the gamma release stage, all being well. Support for the TSMC version of the iPhone SE was provided by Todesco himself, in the form of a modification to his original tool, and posted on the /r/jailbreak Telegram group. Support for the TSMC iPhone 6s works on the same principle and was provided by Sticktron.
* Todesco has reiterated that the jailbreak is not intended for general use at the present time, but has confirmed that developers who wish to try it on TSMC models should use only his or Sticktron’s fixes, no-one else’s. Sticktron’s modified versions of the YaluX tool for TSMC devices can be found on his Github.
* A few final points about using YaluX, assuming you are very confident in testing it out and prepared to accept the risks:
* Do not enable Substrate, nor install any of the so-called “Substrate fixes” floating about. These work improperly and may cause serious issues later when moving to newer betas.
* Do not install OpenSSH. YaluX already includes an SSH alternative, and installing OpenSSH will break both of them when updating from the betas.
* Do not install YUCCA utilities or any stashing tweaks; bad things can and probably will happen.
* Do not install unsupported tweaks. In fact, be very careful about which tweaks you install in general. Without Substrate most will not work, and as we have said, enabling Substrate is a bad idea. Some tweaks, in combination with enabling Substrate, will put you in a boot loop and force a restore to iOS 10.2.
* It’s good to see that some progress is being made on the iOS 10.1.x jailbreak tool, and I hope to see a more stable build available in the near future. At that time, we’ll post a tutorial for the readers who want to give it a go. In the meantime I recommend being patient and steering clear of what is still an unstable tool, whose own creator has warned against its use for now.

