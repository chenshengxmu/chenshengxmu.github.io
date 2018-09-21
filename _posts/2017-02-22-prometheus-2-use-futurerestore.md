---
layout: post
title: Prometheus Guide Part 2- How to use futurerestore to restore to unsigned firmwares
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/prometheus-guide-header.png)
* This is Part 2 of a two-part guide on how to use Prometheus.
* Before attempting this guide, everyone should read the introductory article, Prometheus Guide: Introduction. This will explain whether the guides apply to you, and if they do, which ones you should follow, as well as making sure that you fulfil the requirements for it to work.
* If you currently have a jailbreak and you want to move to a different firmware with Prometheus’ nonceEnabler method, you must follow Part 1 of the guide before following Part 2 here.
* If you currently have no jailbreak, and you want to move to a different firmware with Prometheus’ nonce collision method, do only this part (Part 2) of the guide.
* Before you begin following the instructions, read the entire article through once, and watch tihmstar’s video, which outlines the process visually. This will save time and errors in the long run. Make sure you have all the required files ready. These are listed in the introductory article.
* This guide uses an upgrade from iOS 9.3.3 to iOS 10.2 as an example, but it can be used to move between any firmwares in principle, if and only if you meet the requirements. If you are using this guide to move between different firmwares, simply replace any mention of iOS 10.2 with the destination firmware you want, and mentions of iOS 10.2.1 with a currently signed firmware. Some examples of other possible Prometheus restores would be iOS 10.2 > iOS 10.2, iOS 10.3 b1 > iOS 10.2, and iOS 9.1 > iOS 10.2.
* 1) Download the iOS 10.2 and iOS 10.2.1 IPSW files for your device from our downloads page. Make sure you have the correct ones for your specific device. Remember some devices, like the iPhone 5s, have multiple models (GSM, Global) with different IPSWs. Select the correct ones.
* 2) Download the latest version of tihmstar’s futurerestore from the link provided. Unzip the file.
* 3) Create a folder on your Desktop and call it futurerestore.
* 4) Find the futurerestore_macos executable inside the “futurerestore-latest” folder you downloaded and unzipped. Copy it into the Desktop futurerestore folder. Copy your two IPSW files, and your iOS 10.2 .shsh2 into the Desktop futurerestore folder too.
* 5) Rename your iOS 10.2.1 IPSW file from .ipsw to .zip, then double-click it to unzip it.
* 6) Inside the unzipped iOS 10.2.1 folder there is a file called BuildManifest.plist. Copy it and paste it into your futurerestore folder.
* 7) Look again in the unzipped iOS 10.2.1 folder for another folder called Firmware. Inside it is a baseband file with the file extension .bbfw. Copy it and paste it into your futurerestore folder.
* 8) Return to the Firmware folder from Step 7. Inside it, navigate to /all_flash/all_flash.YOUR_BOARD_ID.production. Inside that, find the file entitled sep-firmware(…).im4p. This is the SEP firmware. Do not copy the file ending .plist by mistake. Copy the .im4p file and paste it into your futurerestore folder.
* 9) The futurerestore folder on your Desktop should now contain these files:
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-setup-1.png)
* 10) Open a new Terminal window. Terminal can be found in /Applications/Utilities, or via Spotlight.
* 11) In Terminal, enter the following command to install the necessary tools for this procedure:
* /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-install-homebrew.png)
* Follow any instructions given by the Terminal output to complete the install process.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-install-homebrew-2.png)
* 12) Once Homebrew is installed and the command prompt has returned, enter the following to install ideviceinstaller, which we will need:
* brew install ideviceinstaller
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-install-ideviceinstaller.png)
* Once this is also successfully installed, we need to move one of the files so that futurerestore can find and use it.
* 13) Navigate to the following folder:
* /usr/local/opt/openssl/lib/
* If you don’t know how to find that folder, an easy way is to paste the file path into the Finder – Go – Go to Folder… window.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-libcrypto-1.png)
* 14) Copy the file called libcrypto.1.0.0.dylib.
* 15) Navigate to the following folder:
* /opt/local/lib/
* You can use the Finder – Go menu again if necessary. If this folder structure does not exist on your computer, you must create it yourself. Make a folder at the root of your drive called opt, make a folder in it called local, etc.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-libcrypto-2.png)
* 16) Paste the file libcrypto.1.0.0.dylib into /opt/local/lib/.
* 17) Return to Terminal. Type cd followed by a space, and drag your futurerestore folder onto the Terminal window. Then press the Enter key.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-setup-2.png)
* 18) Now type in:
* chmod +x futurerestore_macos
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-chmod-command.png)
* 19) We will now prepare the futurerestore command, but do not enter it yet. The easiest way to insert the filenames into the command is to type the first few letters of their name, and then press the Tab key on your keyboard to autocomplete the filename. Make sure the correct file has been filled in before continuing, because some files such as the .shsh2 and IPSW may have similar names, and may be autocompleted incorrectly as each other.
* a) If you are using the nonceenabler method, currently have a jailbreak, and already followed Part 1 of this guide, use the following command:
* ./futurerestore_macos -t YOUR-10.2-SHSH-HERE -b YOUR-BASEBAND-FIRMWARE-BBFW-HERE -p YOUR-BUILDMANIFEST.PLIST-HERE -s YOUR-SEP-FIRMWARE-IM4P-HERE -m YOUR-BUILDMANIFEST.PLIST-AGAIN-HERE YOUR-10.2-IPSW-HERE
* Do not enter it yet.
* b) If you are using the nonce collision method, currently have no jailbreak, and started this guide at Part 2, use the following command:
* ./futurerestore_macos -t YOUR-10.2-SHSH-HERE -b YOUR-BASEBAND-FIRMWARE-BBFW-HERE -p YOUR-BUILDMANIFEST.PLIST-HERE -s YOUR-SEP-FIRMWARE-IM4P-HERE -m YOUR-BUILDMANIFEST.PLIST-AGAIN-HERE -w YOUR-10.2-IPSW-HERE
* Do not enter it yet.
* Replace all sections in caps with the names of your files. For example, I would type ./futurerestore_macos -t, then a space, then type the first letters of my SHSH filename, then Tab to complete it, then a space, then -b, space, then type the first letters of my baseband filename, then Tab to complete it, and so on. Take your time and check it thoroughly.
* Below are examples of the finished command for an iPhone 5s. The first image is the command for the nonce collision method, the second is for the nonceEnabler (jailbreak) method. Note that the nonce collision method has the -w variable, but the nonceEnabler method does not.
* Do not enter the command yet. 
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-command-nonce-collisions.png)
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-command-nonceenabler.png)
* 20) a) If you are using the nonceenabler method, currently have a jailbreak, and already followed Part 1 of this guide, now do the following:
* Warning: After this step, your device will restart in recovery mode with the correct nonce. You now have 15 minutes to complete the final step of the guide. After that, the device will reboot to recovery again but with the wrong nonce, and you will have to start from the beginning, as well as install additional tools to reboot normally. Avoid this! Have the command from Step 19) a) ready to enter before you continue.
* 20) b) If you are using the nonce collision method, currently have no jailbreak, and started this guide at Part 2, simply do this:
* 21) Once your device is ready, that is, connected to the computer (nonce collision method), or connected to the computer and in recovery mode (nonceEnabler method), you should enter the futurerestore command from Step 19. Return to the Terminal window you typed it out into, and hit Enter. This will begin the downgrade process to iOS 10.2.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-start.png)
* If everything has gone correctly, Terminal will now show futurerestore downgrading your device. If you are using the nonce collision method, you will have to wait until the correct nonce comes up for the restore to begin. This can take a varying amount of time, from 30 seconds to never (if you are requesting a nonce which does not collide – do not try this). Terminal will print out a list of nonces which your device generates until the generated nonce matches the nonce in your blob. Patience is key.
* If you are using the nonceEnabler method, your device should already have the correct nonce thanks to Part 1 of the guide, so the restore should initiate immediately.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-middle.png)
* 22) Wait until the restore completes, and your phone returns to the setup screens. You are now on iOS 10.2!
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/futurerestore-end.png)
* This process is complicated, and has several parts which can be followed incorrectly. Take your time and read every step all the way through before following it. After Step 20) a), nonceEnabler users should proceed immediately to Step 21, as their device will reboot after 15 minutes and they will have to start again.
* If you encounter errors with the process, re-read the guide and browse /r/jailbreak for your issue before asking. It has probably been answered before. If you still have no luck, feel free to ask me in the comments section below, but provide information, or I can’t help. iOS device, version, nonce collision or nonceEnabler method, exact Terminal error you are getting, etc.
* Good luck!

