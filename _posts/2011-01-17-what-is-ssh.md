---
layout: post
title: What the %#@! is SSH?!
---
* If you are new to jailbreaking, you are likely to hear the term SSH thrown around quite a bit. For troubleshooting it’s essential; for everything else it’s very useful.
* So what is it? Simply put, it’s an advanced way to connect to the iPhone. Also known for it’s uses in SFTP, IMAPS, POP3S, etc., SSH is a protocol short for Secure Shell that gives us an encrypted and secure tunnel between two devices.
* It can be used to remotely send commands as well as transfer files to and from the iPhone and is usually native to all popular desktop operating systems. [Thanks to one of our readers for the refined description]
* By default, the iPhone does not have SSH capabilities, but jailbreakers have the option to install the free OpenSSH package via Cydia. Once you do that, you will be able to login to SSH as either “root” or “mobile” (for a user name) with a default password of “alpine”.
* To connect via SSH, you can use either a command prompt (Terminal.app on the Mac, or Start>Run>”cmd” on Windows; if you’re using Linux then you probably already know). Find out the local network address of your iPhone in Settings>Wi-Fi, touch the blue arrow next to your wi-fi network name, and you’ll see IP address.
* At the prompt on your computer, type “ssh root@192.168.1.5” replacing the numbers with whatever IP address you found. You will be prompted for the default password. Now you’re in.
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/sshmac.png)
* If you intend to actually run commands through the command prompt, you will need to install APT 0.7 Strict via Cydia. For examples of things you can do, check out this site.
* Most times, you’ll never need to do this, but it’s good to know that how. For just getting files to and from the iPhone, you can use a user-friendly FTP app for your desktop such as Cyberduck for Mac or WinSCP for Windows.
* When entering details for the connection, just remember these details:
![img](http://media.idownloadblog.com/wp-content/uploads/2011/01/Screen-shot-2011-01-16-at-1.25.24-PM.png)
* Once you connect, you’ll see all the folders on your iPhone. As a rule of thumb, don’t tinker, change anything, or delete anything unless you’re absolutely sure you know what you’re doing. For more info check out this great article.
* If this helps, let me know. If I left anything out, feel free to tell me in the comments.

