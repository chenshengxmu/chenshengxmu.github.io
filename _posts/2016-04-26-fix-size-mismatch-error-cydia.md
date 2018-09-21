---
layout: post
title: Fixing size mismatch errors in Cydia when trying to install a tweak
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/How-to-fix-Size-Mismatch-Error-in-cydia-on-a-jailbroken-device.png)
* Size mismatch errors are something that seem to plague me every once in a blue moon when I try to install a jailbreak tweak right after an update is released, or after Cydia refreshes its sources.
* The issue can occur when Cydia tries to fully refresh its sources at the time of a repository sync, and I’m sure some of you have probably stumbled upon this same error one time or another.
* If you ever do get a size mismatch error in Cydia, we’ll be explaining in this short tutorial how you can fix the problem and install the jailbreak tweak you want to download once and for all.
* If you’re getting a size mismatch error, it’s because you may have left Cydia running in the background during a refresh, or have refreshed your sources at the same time a repository was being synced. It could be that you refreshed your sources just as the package was being updated on the repository it’s being hosted from, or it could have just been a network fluke.
* Whatever the cause was, your Cydia app now has a corrupted cache and you have to live with it until Cydia is able to refresh the cache (which can take up to 24 hours until the repo refreshes once again).
* You can actually remove and re-add the affected repository to your list of Cydia sources, and this will force Cydia to remove and re-add everything related to that repository, including the cache, immediately. This gives you a refreshed Cydia cache and can fix a size mismatch error.
* If you get a size mismatch error, like I got this morning from the BigBoss repository after trying to install a free tweak that was just updated, you can easily fix the problem by removing the affected repository from your list of Cydia sources and then adding it back to your device so your device can re-load it.
* Because BigBoss is one of the default repositories in Cydia, and not a third-party one that you’ve added by yourself, it cannot be added to Cydia like most other third-party repositories are. Instead, there is another process to re-add it.
* Here are the steps to remove and re-add a default repository like BigBoss in Cydia:
* 1) Launch the Cydia app from your Home screen and open the Sources tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Fixing-Size-Mismatch-Errors-in-Cydia-1.png)
* 2) Tap on the Edit button in the navigation bar to enter source editing mode.
* 3) Tap on the red – button to the left of the repository giving you the issues. In this case, the tweak was from the BigBoss repository.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Fixing-Size-Mismatch-Errors-in-Cydia-2.png)
* 4) Tap on the red Delete button that appears to the right of the repository. Cydia will then say “Reloading Data” and will remove the repository from your list of sources.
* 5) Tap on the Done button in the navigation bar to exit editing mode, and then tap on the Cydia tab to return to the Cydia home page.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Fixing-Size-Mismatch-Errors-in-Cydia-3.png)
* 6) Scroll down slightly and tap on the More Package Sources button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Fixing-Size-Mismatch-Errors-in-Cydia-4.png)
* 7) Tap on the BigBoss repository under the Default Sources section, then tap OK when prompted.
* 8) Cydia will re-add the repository and display a “Reloading Data” alert. Tap on the Return to Cydia button when it appears, and you’ll be able to see that the BigBoss repository is back in your list of sources once more.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Fixing-Size-Mismatch-Errors-in-Cydia-5.png)
* That’s all there is to it! If a tweak in any of the default repositories is giving you a size mismatch error, you can remove the affected repository and re-add it so that the cache for that tweak is refreshed. Sometimes this is a necessary step, as simply refreshing your sources doesn’t seem to solve the size mismatch error once you’ve received it.
* Because most tweaks come from default repositories like BigBoss, ModMyi, and MacCiti, the steps for troubleshooting a size mismatch error will be the same for each, as shown above.
* For third-party repositories that present you with a size mismatch error for a specific jailbreak tweak, you’ll follow these steps to delete and re-add the repository to Cydia to refresh its cache:
* 1) Launch Cydia and head over to the Sources tab.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Removing-and-adding-a-third-party-repository-to-Cydia-1.png)
* 2) Tap on the Edit button in the navigation bar to enter source editing mode.
* 3) Tap on the red – button to the left of the third-party repository you wish to remove. In this example, we’ll pick on Ryan Petrich’s beta repository.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Removing-and-adding-a-third-party-repository-to-Cydia-2.png)
* 4) Tap on the red Delete button that appears to the right of the third-party repository and Cydia will then remove the source and prompt you that it is “Reloading Data.”
* 5) Once it finishes reloading everything, tap on the blue Add button in the navigation bar.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Removing-and-adding-a-third-party-repository-to-Cydia-3.png)
* 6) In the pop-up that appears, type in the URL of the third-party repository you wish to add, and then tap on the blue Add Source button.
* 7) Cydia will now begin adding the source and a “Reloading Data” prompt will reappear. After it’s done, tap on the Return to Cydia button and you’ll be taken back to your sources list.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/04/Removing-and-adding-a-third-party-repository-to-Cydia-4.png)
* That’s all there is to it! Now you know how to delete and re-add a third-party repository to solve size mismatch errors, as well as default Cydia repositories.
* Size mismatch errors can happen at any time. Some people are lucky and never experience them. Others will experience them all the time. This method worked for me and cleared up my size mismatch error, and it should work for you too.
* Did this solve your size mismatch errors on your jailbroken device? Share in the comments below!

