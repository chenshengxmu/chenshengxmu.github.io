---
layout: post
title: Apple releases Safari 8.0.6 with security fixes
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/05/yosemite-safari.png)
* Apple this afternoon released Safari updates for Yosemite (8.0.6), Mavericks (7.1.6), and Mountain Lion (6.2.6). The new versions include fixes for multiple memory corruption issues in WebKit, which Apple says could lead to arbitrary code execution or unexpected application termination when visiting a maliciously-crafted website.
* Here are the release notes from Apple’s support document:
* WebKit
* Available for: OS X Mountain Lion v10.8.5, OS X Mavericks v10.9.5, and OS X Yosemite v10.10.3
* Impact: Visiting a maliciously crafted website may lead to an unexpected application termination or arbitrary code execution
* Description: Multiple memory corruption issues existed in WebKit. These issues were addressed through improved memory handling.
* CVE-ID
* CVE-2015-1152 : Apple
* CVE-2015-1153 : Apple
* CVE-2015-1154 : Apple
* WebKit History
* Available for: OS X Mountain Lion v10.8.5, OS X Mavericks v10.9.5, and OS X Yosemite v10.10.3
* Impact: Visiting a maliciously crafted website may compromise user information on the filesystem
* Description: A state management issue existed in Safari that allowed unprivileged origins to access contents on the filesystem. This issue was addressed through improved state management.
* CVE-ID
* CVE-2015-1155 : Joe Vennix of Rapid7 Inc. working with HP’s Zero Day Initiative
* WebKit Page Loading
* Available for: OS X Mountain Lion v10.8.5, OS X Mavericks v10.9.5, and OS X Yosemite v10.10.3
* Impact: Visiting a malicious website by clicking a link may lead to user interface spoofing
* Description: An issue existed in the handling of the rel attribute in anchor elements. Target objects could get unauthorized access to link objects. This issue was addressed through improved link type adherence.
* CVE-ID
* CVE-2015-1156 : Zachary Durber of Moodle
* You can find the latest version of Safari in the ‘Updates’ tab of the Mac App Store.

