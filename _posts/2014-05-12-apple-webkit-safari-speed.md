---
layout: post
title: Apple to accelerate Safaris JavaScript engine
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/10/13.10.21-Mavericks_Push.jpg)
* Nitro, WebKit’s JavaScript interpreter used in Apple’s Safari, is about to get a lot speedier as Apple is seemingly looking to close a speed gap between its browser and both Google Chrome’s V8 and Mozilla Firefox’s SpiderMonkey engines.
* The vast majority of today’s web applications use JavaScript for interactivity and other purposes so any improvements in a browser’s JavaScript performance would normally trickle down to the end-user level, resulting in snappier web browsing…
* MacRumors editor Eric Slivka passes along a report by InfoWorld explaining that Apple’s work on boosting JavaScript performance in Safari stems from the inclusion of so-called accelerator upgrades in recent builds of WebKit, a web rendering engine Apple developed and later open-sourced to the public.
* Specifically, Apple is toying with so-called FTLJIT upgrades to WebKit’s Nitro JavaScript interpreter, also known as JavaScriptCore.
* Basically Apple’s own JavaScript interpreter, FTLJIT is based on a common optimization technique known as just-in-time compiling which translates human-readable JavaScript commands to machine code at execution time, thereby making JavaScript run nearly as fast as native code.
* InfoWorld explains:
* FTLJIT is still considered experimental, so although it’s being made available in the OS X port of WebKit by default, it’s not actually turned on yet – it has to be enabled through command-line flags.
* The AreWeFastYet JavaScript benchmarking website has found FTLJIT markedly faster than Chrome on 64-bit OS X, although Firefox running asm.js versions of the same benchmarks “still consistently beat WebKit”.
* One attribute that could make FTLJIT stand out from the pack all the more is how well it runs JavaScript code that is not specifically optimized for [Mozilla’s] asm.js.
* Every JavaScript engine will run asm.js code, but only Mozilla’s SpiderMonkey honors asm.js-specific optimizations, and right now no other browser maker has elected to follow Mozilla’s lead.
* As FTLJIT is currently being prototyped, there was no word on when the technology might ship in the consumer version of Safari.
* A mobile Safari edition used in iOS includes the Nitro Javascript interpreter but, curiously, not the embeddable browser available to developers. That said, we do expect to eventually see the FTLJIT speed boost applied to iPhone, iPod touch and iPad devices, in addition to Macs.
* Perhaps FTLJIT will make its way into OS X 10.10 and iOS 8?
* June 2 can’t come soon enough…

