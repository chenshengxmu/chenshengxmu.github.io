---
layout: post
title: How to verify your .shsh2 blobs with img4tool
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/12/tsschecker-terminal-output.jpg)
* We recently reported how some of the .shsh2 blobs saved with previous versions of tihmstar’s TSSChecker were faulty. One problem affected all iPhone 7 and iPhone 7 Plus blobs, rendering them useless. This issue has now been fixed going forward, though past blobs are invalid.
* The other problem was more complex and affected only certain models of certain devices. It is also fixed for blobs saved from now on, but given these occurrences, it is important to be able to check whether the blobs you saved in the past are in fact valid and fit for use with Prometheus.
* In this article, we’ll go through how to use another tool from tihmstar’s Prometheus suite, img4tool, to verify that your .shsh2 files are good. This method will clarify whether you are affected by the second problem mentioned above, but will also work in general, when checking the validity of your blobs in future.
* For this, you will need:
* The tutorial will describe the process on a Mac, and uses the Terminal application, but there are Windows and Linux versions available too, for which the process is much the same. I will be verifying iOS 10.1.1 (14B150) and iOS 10.2 blobs for two iPhone 5s.
* Before we begin working with img4tool there is a step we need to perform on our iOS devices, the ones whose blobs we want to verify.
* 1) Open the App Store on your device, and search for “BMSSM”. Install the app which appears: “Battery Memory System Status Monitor”.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/BMSSM.png)
* 2) Open the downloaded app, and navigate to the “System” tab at the top.
* 3) Look for the entry on this page entitled “Device – Model”. It will be something like “N53AP”. Make a note of this value and which device you got it from.
* 4) Repeat this process for all your other devices.
* 1) Download the IPSW for the blobs you want to verify. For example, if you want to check your iOS 10.1.1 (14B150) iPhone 5s (GSM) blobs are good, download the iOS 10.1.1 (14B150) iPhone 5s (GSM) IPSW. Make sure you download the correct IPSW for the blobs, or img4tool will verify incorrectly. Remember there are two versions of iOS 10.1.1, and that some devices (e.g. iPhone 5s) have different models with different IPSWs.
* 2) Copy the blobs you want to verify and paste them into a folder on your Desktop. Call the folder TSS.
* 3) Take the img4tool_macos file from the img4tool folder (downloaded from the YouTube video description in the “Requirements” section), and place that into the TSS folder.
* 4) Place your downloaded IPSWs into the TSS folder too.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/1.png)
* 5) For every IPSW in the folder, click to rename, and change the file extension from .ipsw to .zip. Select “Use .zip” in the dialog box which appears.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/2.png)
* 6) Double click all the renamed .zips to unzip them. They will appear as folders once complete.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/3.png)
* 7) Launch Terminal via Spotlight, or from /Applications/Utilities.
* 8) At the Terminal prompt, type “cd”, followed by a space, and then drag your TSS folder onto the Terminal window.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/4.png)
* 9) Hit the “Enter” key to enter the command. Terminal will now be directed to your TSS folder.
* 10) Enter the following command in Terminal, and press “Enter”:
* sudo chmod +x img4tool_macos
* Enter your administrator password if requested.
* 11) We will now enter the following command into Terminal:
* ./img4tool_macos -v BuildManifest.plist -s YOUR_SAVED_BLOB.shsh2
* However, we need to replace the phrase “BuildManifest.plist” with one from our unzipped IPSW folders, and “YOUR_SAVED_BLOB.shsh2”, with our blob. The easiest way to do this is to drag the files onto the Terminal window at the appropriate part of the command.
* Here is an example for iOS 10.1.1 (14B150) on an iPhone 5s. First, in Terminal, type “./img4tool_macos -v”, followed by a space. Then, navigate to the IPSW folder for iOS 10.1.1 (14B150) iPhone 5s. You must have the correct IPSW folder for this step, do not use one of the other IPSW folders by mistake. Inside the folder is the correct “BuildManifest.plist”. Drag this file into the Terminal window after “./img4tool_macos -v” and it fills in the file path for you.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/5.png)
* Then type “-s” followed by a space, and drag your .shsh2 blob which you want to verify, onto the Terminal window. Terminal will fill in the file path for you. You must have the .shsh2 blob corresponding to the BuildManifest.plist you just selected. Do not use one of the other blobs by mistake.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/7.png)
* 12) Now that the command is complete, hit “Enter” to run it. Terminal will output the result. The interesting part is at the bottom; you can see an example below:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/9.png)
* As you can see from the image, this blob is valid, meaning it has all the correct hashes inside it, and the IPSW version (10.1.1) matches the iOS version that the blob was saved for.
* However, there is one more thing we need to check to make sure the blob is REALLY correct. Remember the Device Model we noted from BMSSM earlier?
* Look in the Terminal output for the line called “DeviceClass” (see the above image for an example). It will be something like “N53AP”. Now check it against the value you got from BMSSM on the corresponding iOS device (Step 3 of the iOS Instructions section). If the values are not the same, the blob is not valid, even if img4tool says “file is valid” at the bottom. This is because the blob is technically valid (has all the necessary components inside), but has the wrong BuildIdentity. Because img4tool doesn’t know what device you really have, it simply checks if the file has all the pieces it needs, and if it does, it says it is valid. It is possible therefore to have a “correct” blob, saved for the “wrong” device, which is therefore useless. So always check that:
* If both are true, then you’re all good.
* 13) Repeat the command for your other devices, with a new matching set of BuildManifest.plist and .shsh2 blob each time. Always make sure you’re checking the right BMSSM “Device Model” each time too.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/10.png)
* In this image, img4tool says that my blob for iOS 10.2, for an iPhone 5s I have, is valid. But it also says that the blob is valid for Model N53AP only. I checked BMSSM on that iPhone 5s, and good news! It says N53AP too, so this particular blob is really valid.
* Now look at this example:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/12_1.png)
* Here, img4tool reports that my blob for iOS 10.1.1 (14B150) for a different iPhone 5s, is also valid. And again it says that it is valid for Model N53AP only. However, when I check BMSSM on this iPhone 5s, I see that it is in fact Model N51AP, not N53AP. In this case, even though img4tool says that the blob is internally fine, I cannot use it as it has been saved with the wrong BuildIdentity, and so is invalid. This is the error which TSSChecker previously had, and the one you must be most careful to check for in your old blobs.
* And finally:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/01/13.png)
* This is what happens when you try to verify an iOS 10.2 blob against the wrong BuildManifest.plist (I accidentally selected one from iOS 10.1.1 instead). Here, img4tool immediately reports that the blob is invalid, as you have asked it if a 10.2 blob is valid for 10.1.1, which it obviously isn’t. Be careful to select identical iOS version pairs of BuildManifest.plist and .shsh2 file to avoid this error.
* As you can see, the process is fairly in-depth, but should be a fool-proof way to check your old blobs without getting any false errors, which might make you think they’re valid when they’re not. Because downloading IPSWs takes time it may only be worth doing this on important blobs such as iOS 10.1.1 and iOS 10.2.
* And remember, newer versions of TSSChecker/TSSSaver do not have this problem anymore, so for iOS 10.2 you may want to simply re-save your blobs, avoiding this verification process. This guide will be most useful for verifying blobs saved on now-unsigned firmwares, which cannot be re-saved.
* As a side note, I spoke to the inestimable 1Conan, the creator of TSSSaver, whilst researching for this article. He confirmed what I suspected, that his Blobs Checker site does not yet check for this issue, and so may report your blobs as valid when they’re not, exactly as img4tool does. Without checking against your Device Model using this guide, you cannot tell for sure. 
* However, he also said he is aware of the issue and is working with his customary speed on updating the Blobs Checker site, so that it can identify this issue in future.
* Look out for that soon!
* Update: 1Conan’s Blobs Checker Site is now updated to check the DeviceClass of the blobs against your selected device. This tool makes it easy to check your blobs, and has the advantage of not requiring you to download IPSWs!
* Are your blobs good auld blobs or rotten to the core? Need any clarifications? Let me know, below.

