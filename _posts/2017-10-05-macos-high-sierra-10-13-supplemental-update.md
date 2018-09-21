---
layout: post
title: macOS High Sierra 10.13 Supplemental Update fixes Keychain & APFS Disk Utility vulnerabilities
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/10/macOS-High-Sierra-10.13-Supplemental-Update.png)
* Apple on Thursday released a supplemental update to macOS High Sierra 10.13 which fixes a few bugs, among them a major vulnerability (we told you about it this morning) that could expose the passwords of encrypted Apple File System volumes in plain text in Disk Utility.
* Apple’s release notes state that this supplemental update includes improvements to the stability, reliability and security of your Mac, plus the following fixes:
* While releases notes accompanying the download make absolutely no mention of the APFS encryption password bug in Disk Utility, Apple issued a support document acknowledging a StorageKit vulnerability CVE-2017-7149 (credited to Matheus Mariano of Leet Tech) that may permit a local attacker to gain access to an encrypted APFS volume.
* If a password hint was set in Disk Utility when creating an APFS encrypted volume, the password was stored as the hint. This was addressed by clearing hint storage if the hint was the password and by improving the logic for storing hints.
* Another support document details the steps for protecting your data if High Sierra’s Disk Utility is showing passwords in plain text instead of password hints on encrypted APFS volumes.
* 1) Install the macOS High Sierra 10.13 Supplemental Update from the App Store updates page.
* 2) Create an encrypted backup of the data in your affected encrypted APFS volume.
* 3) Open Disk Utility and select the affected encrypted APFS volume in the sidebar.
* 4) Click Unmount to unmount the volume.
* 5) Click Erase.
* 6) When asked, type a name for the volume in the Name field.
* 7) Change Format to APFS.
* 8) Then change Format again to APFS (Encrypted).
* 9) Enter a new password in the dialog. Enter it again to verify the password, and if you’d like to, provide a hint for the encrypted APFS volume. Click Choose.
* 10) Click Erase. You can see the progress of the Erase process.
* 11) Click Done when the process is complete.
* 12) Restore the data that you backed up in Step 1 to the new encrypted APFS volume that you just created.
* The steps detailed above are required only if you used the Add APFS Volume command in Disk Utility to create an encrypted APFS volume, and you supplied a password hint. Encrypted APFS volumes created using any other method, plus non-SSD volumes, are not affected.
* “If your disk password for any affected encrypted APFS volume is the same as the password that you use for a macOS user account or an Internet service, you should change the password of the user account or Internet service,” the company advises.
* Today’s update also fixes another vulnerability (CVE-2017-7150, discovered by Patrick Wardle of Synack) which could allow a malicious app to extract keychain passwords.
* A method existed for applications to bypass the keychain access prompt with a synthetic click. This was addressed by requiring the user password when prompting for keychain access.
* Lastly, Apple has integrated the security content of this supplemental update into regular macOS High Sierra downloads. “New downloads of macOS High Sierra 10.13 include the security content of the macOS High Sierra 10.13 Supplemental Update,” the company states.
* That has got to be the fastest fix from Apple if I ever saw one.

