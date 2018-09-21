---
layout: post
title: iOS apps running on BlackBerry PlayBook and Windows box
---
* Developer who goes under a code-name “Businesscat2000” posted something really interesting-looking on the CrackBerry forum, an app player of sorts which can run native iOS apps on Research In Motion’s BlackBerry PlayBook tablet.
* The program is demoed runnin a number of popular iOS apps and games, such as Tom Tom, Super Monkey Ball, Tiny Tower, Sushi Cat, iFart and more. It’s also available for various other platforms, including Windows. Two more videos are right after the break…
* CrackBerry editor Kevin Michaluk relays the hacker’s explanation of how it works:
* The CPU isn’t emulated on Playbook (though it is on Windows). It works very similarly to how WINE works to run Windows applications on Linux. The app binary is mapped into memory and imports are resolved to point to my own implementation of the various APIs needed.
* Certain similarities between Apple’s iOS and PlayBook’s operating system have made the hack that much easier:
* iOS actually uses a few open APIs already, which Playbook supports just as well (GL ES, and OpenAL). The bulk of the work has been in implementing all of the objective C classes that are required.
* The ARM code of the applications run as-is – the armv6/v7 support on PB/iDevices are pretty much identical, and the code is designed to run in USR mode. No SWIs, GPIO accesses or any of that kind of shenanigans.
* Of course, a little effort on the developer’s part is needed to make each iOS app run in the emulator, though nothing that couldn’t be solved in a matter of a few hours tops.
* Not all apps are portable. Specifically, those requiring UIWebView and CoreData cannot be implemented currently.
* Here we have the iOS Sketchbook Mobile app running on RIM’s tablet.
* And this is Angry Birds for iOS running in a Windows environment.
* RIM recently introduced BlackBerry 10, the latest and greatest iteration of its mobile operating system. The beleaguered Canada-based company provides a runtime to repackage Android apps for BlackBerry devices via the Eclipse plug-in and framework.
* They also created BlackBerry Mobile Fusion software that lets IT pros manage iOS and Android devices in enterprise environment, in addition to BlackBerrys.
* Something tells me that an official iOS player for BlackBerry devices would be a huge win for RIM’s embattled platform.
* That is, unless Apple’s lawyers have any say over it.
* So, what do you guys think?

