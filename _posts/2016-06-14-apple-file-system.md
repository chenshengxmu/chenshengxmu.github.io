---
layout: post
title: How Apples next-generation file system will make your data more secure across platforms
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-file-System-WWDC-2016-teaser-001.png)
* Apple’s efforts on adding even stronger security to its software platforms is coming to light with news that the company is introducing a brand new file system with “encryption as a primary feature”. Called the Apple File System (APFS), the new feature is optimized for flash-based storage and engineered to “scale from an Apple Watch to a Mac Pro”.
* Here’s how it ensures the integrity and security of your data across devices.
* According to a notice on Apple’s WWDC 2106 schedule webpage:
* Apple File System is a new, modern file system for iOS, OS X, tvOS and watchOS. It is optimized for Flash/SSD storage and features strong encryption, copy-on-write metadata, space sharing, cloning for files and directories, snapshots, fast directory sizing, atomic safe-save primitives and improved file system fundamentals.
* The Apple File System Guide provides more information.
* For starters, even though APFS is optimized for SSD storage, it will work with traditional hard disk drives as well. The document explains that the system is based on “a unique copy-on-write design that uses I/O coalescing to maximize performance while ensuring data reliability.”
* Another feature of APFS includes something called Space Sharing, which basically lets multiple file systems share the same underlying free space on a physical volume rather than use a fixed amount of space for each file system, which is the case in the traditional partitioning schemes.
* This lets APFS grow and shrink without needing to repartition the volume. Furthermore, each volume in an APFS container reports the same available disk space, which is equal to the total available disk space of the container.
* “For example, for an APFS container with a capacity of 100GB that contains volume A, which uses 10GB, and volume B, which uses 20GB, the free space reported for both volumes A and B is 70GB (100GB – 10GB – 20GB),” explains Apple.
* APFS also supports sparse files, extended file attributes and TRIM operations, as well as using a copy-on-write metadata scheme to ensure that updates to the file system are crash-safe.
* Last but not least, APFS supports 1 nanosecond timestamp granularity, which improves upon the 1 second timestamp granularity of HFS+.
* When it comes to security and encryption, Apple File System supports encryption natively. Full disk encryption has been available for years on both OS X and iOS and APFS now combines them into a unified model that encrypts file system metadata.
* The following encryption models are available:
* Multi-key encryption is especially interesting.
* Based on per-file keys for file data and a separate key for sensitive metadata, this encryption model ensures the integrity of user data even when its physical security is compromised—for instance, if someone made a copy of your device’s whole flash storage and run it as a disk image on NSA supercomputers in an attempt to brute-force its way into the encrypted file system.
* APFS volumes currently don’t support Fusion Drive and FileVault, cannot be used as a startup disk or for Time Machine backups and filenames are currently case-sensitive only. APFS formatted volumes are not recognized on OS X 10.11 Yosemite and earlier and existing third party utilities will need to be updated to support the new file system.
* We fully expect the aforementioned limitations to be addressed as APFS gets closer to its launch some time next year. Apple engineers will share more details about the new file system in a session this morning and we’ll make sure to keep you in the loop.
* APFS is released as a Developer Preview in macOS Sierra, and will ship in 2017.

