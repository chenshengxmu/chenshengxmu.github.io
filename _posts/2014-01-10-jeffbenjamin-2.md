---
layout: post
title: 1Pal- a new jailbreak tweak for saving 1Password’s master password to the Keychain [updated]
---
![img](http://media.idownloadblog.com/wp-content/uploads/2014/01/1Pal.png)
* I know, I know. It’s very stupid to use any tweaks with something as crucial as 1Password. I know, I know, it’s identity theft waiting to happen.
* Not exactly. 1Pal is a new jailbreak tweak that works in tandem with existing Touch ID tweaks like BioLockdown. It allows you to save the Master Password to iOS’ keychain for quick logins. Since the 1Password app itself is protected with Touch ID, the process is innately secure. The only real way this poses a security issue is if someone gains access to your fingerprint. Not impossible, but not exactly likely either.
* At the end of the day, 1Pal is an awesome tweak for 1Password users. If you’re like me and you use 1Password each and every day, you’ll find 1Pal to be a real time saver.
* Remember, you must have a Touch ID enabled device for this to work. Right now, only the iPhone 5s features Touch ID. Have a look at our video walkthrough inside as I showcase how it works.
* Before you even think about installing 1Pal on your device, you need to have some sort of Touch ID protection tweak installed to protect individual applications. I highly recommend Ryan Petrich’s BioLockdown tweak. It allows you to protect specific apps using the Touch ID fingerprints already established on your iPhone 5s. There are other Touch ID protection tweaks available, but this one is by far the best in my opinion.
* The next thing you need to do is to secure the BioLockdown Settings pane and the 1Password app using BioLockdown. You can verify this by trying to launch 1Password. If it forces you to verify with Touch ID before launching, then you’re good to go.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/01/BioLockdown-1Pal.png)
* 1Password should now be ready and waiting to store the password in iOS’ keychain. Once you do this, you’ll get a confirmation dialogue box, and you’ll be logged in.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/01/1Pal-Store-Keychain.png)
* Now all you need to do is close out of 1Password, and reopen it. It should ask you for your Touch ID credentials first, and then log you right in, bypassing the Master Password page. That’s all there is to it; now you can quickly log in to 1Password using nothing more than your Touch ID verified fingerprint. Talk about a real time saver!
* If at any time you’d like to delete your 1Password Master Password from the keychain, simply venture to 1Pal’s preference panel in the stock Settings app, and enable the toggle for Clear Keychain. Kill the 1Password app; reopen it, and then you should be met with a dialogue box stating that the password was deleted from the keychain permanently.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/01/1Pal-Reset.png)
* I know that some will still balk at the idea of saving such an important password in the device’s keychain, but remember, as long as you have your app secured using BioLockdown, your 1Password app and its contents should remain safe.
* We are in no way recommending or condemning this tweak’s usage. It’s going to have to be your own personal choice. I will state that I trust the setup enough to use it and it’s saving me a load of time.
* What do you think?
* Note: in a previous update I noted that the green box surrounding the master password login was indicative of iPal’s presence. This actually isn’t the case. The green rectangle box was the result of the developer’s other Touch ID tweak, iTouchSecure. I’m in the testing stages with iTouchSecure, and will be back with a full review in a day or so. I apologize for any confusion.
* Update: Unfortunately, after doing some more tinkering around to ensure the integrity of this tweak, I’ve stumbled upon a pretty big issue. As it turns out, placing the device in safemode will compromise the BioLockdown security for 1Password. This is an issue in itself, as I believe that BioLockdown (or BioProtect) should prevent access to the app even if safe mode is enabled, but this is not the stage for that discussion.
* The big problem is that 1Pal essentially leaves your 1Password app completely exposed when in safe mode. This is because 1Pal still continues to work even with safe mode enabled. It would be nice if 1Pal refused to log in automatically with safe mode enabled.
* It’s really a two-fold issue. When in safe mode, BioProtect and BioLockdown can’t communicate with SpringBoard and hence can’t provide the protection needed. Couple this with the fact that 1Pal continues to auto submit the master password from the keychain, logging you into 1Password automatically.
* The reason why this is such a huge problem is because safe mode is relatively easy to achieve on a jailbroken device. In fact, sometimes the SpringBoard crashes and you enter safe mode inadvertently. Although the average person probably doesn’t know how to access safe mode, it’s still technically possible.
* Until this issue is resolved in some manner, then I simply can’t recommend using 1Pal. It’s a great tweak, don’t get me wrong, but it’s hard to suggest using it at this point knowing that such a big flaw exists.
* I’ll be sure to follow up once I hear from the developer.

