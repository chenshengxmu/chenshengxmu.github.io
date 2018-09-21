---
layout: post
title: iOS 9.x Re-restore bug even more powerful than previously thought
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/03/9.3.5-downgrade-proof.jpg)
* I reported a few weeks back on an interesting new bug for 32-bit devices, which allowed you to restore them to any unsigned iOS 9.x firmware, provided you had blobs for the destination firmware.
* At the time, it was thought that the bug would mainly be of use for people downgrading from iOS 9.3.5 to a lower firmware, to jailbreak with Home Depot or Pangu9. However, it turns out the bug is in fact more powerful and wide-ranging than previously thought, and may have much wider utility.
* At the time when I was given early tester access to the method, it was used for escaping the unjailbroken iOS 9.3.5 firmware. It worked perfectly to move my iPad 2 back to iOS 9.3.4, where it’s now happily jailbroken.
* However, it turns out the bug in fact affects every firmware change in which iOS 9.x is the destination. This means that as long as you are going to iOS 9, you can use it to upgrade from iOS 6-8, or even to downgrade from iOS 10 without a jailbreak.
* This is of course big news, and hopefully our readers have been taking our advice and saving their blobs. As long as you have correct blobs saved for any firmware from iOS 9.0-9.3.4, you should be able to downgrade/upgrade to that firmware, and use Pangu9 or Home Depot to jailbreak. Users stuck on iOS 10 can return to a jailbreak, and users on iOS 6-8 who want to upgrade but missed the window can move to iOS 9. iOS 9 users can move up or down as they please, and even use this as a way to restore to the same firmware for a fresh start.
* After talking to a couple of the developers of the tool, who were really obliging, some further technical information and restrictions have come to light, which I’ll quickly sum up below.
* According to a discussion with Markus L, one of the developers working on the technique, release has been set back by the discovery that the bug works with iOS x -> iOS 9, not just iOS 9 -> iOS 9. More testing will now be required to ensure behaviour with the additional firmware combinations, and to take full advantage of this extra power. It will therefore not be released for at least a few weeks more.
* A group consisting of @ee_csw, @alitek123, @Thmitt, @DjSn0wfall and @JonathanSeals are working on testing the bug more fully, as well as on a custom tool to allow these downgrades/restores to take place. In the interim, another tool may be released which will check your saved blobs for compatibility with the technique, as unfortunately not all blobs will work.
* In summation, it may soon be possible for 32-bit devices owners to move back to the sweet jailbroken pastures of iOS 9 from any firmware on which they currently reside. This tool, in combination with iOS 9 blobs, could mean an indefinite jailbreak for all 32-bit devices, protected from accidental updates and restores.
* Do you have iOS 9.x blobs saved? Do you have 32-bit devices on iOS 9.3.5/10 that you’d like to downgrade? Let me know in the comments section.

