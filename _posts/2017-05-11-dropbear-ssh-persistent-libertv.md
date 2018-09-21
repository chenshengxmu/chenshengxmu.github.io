---
layout: post
title: How to make SSH persistent on the liberTV jailbreak for Apple TV 4
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/04/libertv-thumb-new.png)
* If you’ve been tinkering around with your Apple TV 4 jailbroken on tvOS 10 with liberTV, you may have noticed that its built-in SSH client, Dropbear, has a tendency to be purged every so often, requiring it be re-spawned and set up again. This is due to the developer’s (admirable) desire to retain all jailbreak-related files in temporary folders on the filesystem, reducing the risk of bricking your device while fiddling with it to near-zero. If you are confident enough to move a few files out of their temporary folder however, you can easily get your SSH client up and running persistently, avoiding those tedious reconfigurations which otherwise occur.
* Before beginning, read through the guide so you understand what we’re doing, including my concluding remarks beneath Step 17. Whilst this process should be very safe, exercise caution and common sense, and do not overwrite any pre-existing files which you obviously did not put there yourself.
* 1) Ensure that your Apple TV 4 is in a jailbroken state via liberTV. My guide will show you how to do this.
* 2) Connect to your Apple TV via SSH, and make sure you have changed your default passwords. My guide will show you how to do this.
* 3) Open up an SSH session to your Apple TV as detailed in the guide linked in Step 2, and issue the following command:
* export PATH=/tmp/bin:/tmp/usr/bin:/tmp/usr/local/bin:/tmp/sbin
* 4) Now type the following commands one at a time (each line is a command to be entered separately):
* cd / ls
* 5) We have moved to the root of the file system and listed the folders there. Check that you have a folder called tmp; this is where our Dropbear files are. Now enter the following:
* cd tmp ls
* 6) Look for a folder entitled etc, and if present, cd into it:
* cd etc ls
* 7) Now look for a folder in etc entitled dropbear. If present, cd into it:
* cd dropbear ls
* We should see the Dropbear files we are interested in listed here. In my case there was only one, dropbear_ecdsa_host_key, though you may have others. Verify that you can see them in this folder, which is /tmp/etc/dropbear/. If you can’t, make sure you are in the correct folder. You can return to the root at any time and start again with cd /, followed by ls, if necessary. If you can’t find them or are in the wrong directory the process won’t work, which is why we need to visually verify them before we continue.
* If they’re there, we can now proceed to make a new home for them on the permanent filesystem, and copy them out of the precarious temporary folder they began in.
* Do this at your own risk! Whilst this should be perfectly safe, I will not be held responsible for human error. If you overwrite any existing system binaries, you will be forced to restore your Apple TV, so copy only the items listed here, and ensure they do not already exist at their destination first.
* 8) Type the following to move away from our verified Dropbear files in tmp, and move to the location we want to copy them to:
* cd /etc ls
* You should now see the contents of the system’s etc folder.
* 9) We want to make a folder here in etc called dropbear, which we do with the following command:
* mkdir ./dropbear
* Type ls again afterwards, and verify that the contents of etc are as before, except for the addition of the new dropbear folder we just created.
* 10) If all the contents are still there, plus our new dropbear folder, issue the following command to copy our Dropbear files from /tmp/etc/dropbear to their new location at /etc/dropbear:
* mv /tmp/etc/dropbear/* ... /etc/dropbear/
* My system reported a “No such file or directory” error here, but worked regardless.
* 11) Check the copy has been successful by typing cd dropbear, followed by ls, and making sure our file(s) (dropbear_ecdsa_host_key and any others you saw in Step 7), are present.
* We have now successfully moved the contents of /tmp/etc/dropbear to /etc/dropbear, where they will not be removed by the system.
* We must now move a second group of files in the same way, from /tmp/usr/local/bin to /usr/local/bin.
* 12) Type the following to move to /tmp/usr/local/bin, and check its contents are there, ready for copying:
* cd /tmp/usr/local/bin ls
* You should see a collection of Dropbear-related files, I had eight in total. If they’re not there, ensure you are in the right directory. If you cannot find them in the correct directory then the process will not work.
* 13) Once you’ve verified the files we want are there, let’s move to where we want to move them to, by typing:
* cd /usr ls
* Check the list of contents and ensure that there isn’t already a folder there called local. If there is, don’t overwrite it. In my case (and yours too), there shouldn’t be a local folder there initially.
* 14) Let’s create a local folder in usr:
* mkdir ./local ls
* Verify that the contents of usr are as before, except for the addition of the new local folder we just created.
* 15) If local has been successfully created, cd into it and create a folder inside it called bin, like so:
* cd local mkdir ./bin ls
* Check that our bin folder is now listed under the ls command we just sent.
* 16) If bin is listed, then we’ve successfully created the folder structure /usr/local/bin, and are ready to copy our files into it from /tmp/usr/local/bin. We can do it with the following command:
* mv /tmp/usr/local/bin/* ... /usr/local/bin/
* As in Step 10, my system reported a “No such file or directory” error here, but worked regardless.
* 17) To check the copy has been successful, type cd bin, followed by ls, and make sure our files (dropbearconvert, dropbearkey, and all the others you saw in Step 12, of which I had eight), are present.
* If they are, then we’re all done! We’ve moved all the Dropbear-related files from /tmp, where they are periodically wiped, onto the filesystem, where they’ll be persistent. Specifically, we moved the contents of /tmp/etc/dropbear to /etc/dropbear, and the contents of /tmp/usr/local/bin to /usr/local/bin.
* You can now invoke SSH via Dropbear any time your Apple TV 4 is in a jailbroken state with liberTV, without worrying about SSH having been wiped and requiring another setup. Remember, to use any of the commands you’re used to, such as cd, passwd, or ls, you’ll need to issue the command below once per Terminal SSH session first, or they won’t be available:
* export PATH=/tmp/bin:/tmp/usr/bin:/tmp/usr/local/bin:/tmp/sbin
* Good luck!
* Do not overwrite ANY system binaries. If at any point in this guide you find an already existing version of a file on the Apple TV filesystem, do NOT overwrite it with the version from /tmp. 
* This should not happen, but double-check the contents of directories before copying into them, and always be sure where you currently are in the filesystem before issuing any commands from/to/in it.
* Need any more help with this guide? Pleased to have a persistent SSH setup on your Apple TV 4 at last? Let me know your thoughts in the comments section…

