---
layout: post
title: RIP the rest of the industry- iPhone Xs A11 chip has 6 independently addressable CPU cores
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/09/iPhone-X-wallpaper-teaser-001.jpeg)
* The next iPhone is going to pack in unprecedented compute power thanks to an Apple-designed A11 chip that has six independently addressable CPU cores that can all run at once, according to code strings in a leaked iOS 11 Gold Master build.
* That’s according to developer Steven Troughton-Smith, following his deep dive into the secrets hidden in code strings of the iOS 11 GM code. First, on Saturday, he dug up the official name for the A11’s high-performance CPU cores—“Mistral.”
* In a tweet the following day, he revealed that the A11 is actually a six-core chip comprised of the two aforementioned high-performance “Mistral” CPU cores and four low-power cores, called “Monsoon” (for context, Apple CPU code-names are based on wind types: A7—“Cyclone”; A8—“Typhoon”; A9—“Twister”; A10—“Hurricane” and “Zephyr”).
* By comparison, the A10 Fusion processor found in the iPhone 7 and iPhone 7 Plus devices has two low-performance cores and two-high performance cores. In other words, iPhone X will provide increased CPU performance by having more CPU cores that can all run at once, and that’s assuming clock frequency stays unchanged from the A10 Fusion.
* If Apple also happens to boosts the CPU clock frequency, you’re immediately looking at a game-changing jump in compute power. Late Sunday evening, Steven tweeted that the two high-power “Monsoon” cores and the four low-power “Mistral” cores are actually all independently addressable.
* Yes, no Fusion.
* …this sounds like it's going to be a Geekbench monster. RIP the rest of the industry
* — Steve T-S (@stroughtonsmith) September 10, 2017
* Let me explain.
* The current A10 Fusion silicon inside your iPhone 7 can only have one core type active at a time. Either the two power-hungry high-performance cores are crunching numbers at any given time or a pair of relatively battery-saving low-power ones are active.
* That’s why the A10 Fusion appears to software and benchmarks as a dual-core chip.
* For those wondering, by the way, the A10X Fusion in the new iPad Pros uses three high-performance “Hurricane” cores and three high-efficiency “Zephyr” cores.
* By contrast, all six cores in the iPhone X’s A11 chip will be visible to apps at any given time and independently addressable, a significant performance boost. This heterogeneous multi-processing is the most powerful use model of ARM’s so-called big.LITTLE architecture.
* Since all physical cores are running at the same time and have access to the same memory regions, workloads can run in parallel. Threads with high priority or computational intensity, such as running games or powering new augmented reality and 3D scanning features of iPhone X, can be assigned to the A11’s two high-performance cores.
* Threads with less priority or less computational intensity, such as checking email, playing music or running background activities, can be performed by one of the A11’s four low-power cores, as determined by Apple’s Grand Central Dispatch system, to preserve battery life.
* I’m just guessing here, but Apple could even task two of the four low-power cores in iPhone X with handling always-on features such as Hey Siri and Face ID.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/02/iPhone-7-A10-Fusion-web-screenshot-001.png)
* In a few hours, this will no longer be true.
* Again, the iPhone 7’s A10 Fusion uses the simplest big.LITTLE implementation where the CPU is arranged into identically-sized clusters of cores (two “Big” and two ”Little”) and the iOS task scheduler can only see and use one CPU cluster at any given time.
* When CPU load changes between low and high, the hone simply transitions to the other CPU cluster.
* It is now becoming clear that iPhone X will be the most powerful iOS device Apple’s ever made by wide margin. Competition is going to have a really hard time catching up. Granted, iPhone X is going to need all the oomph it can get for its computationally intensive features like depth-sensing augmented reality, 3D facial recognition, increased resolution and so forth.
* …I might take back the 'Fusion' part. While this is 4 Mistral and 2 Monsoon cores, they all show up as distinct cores. Hexacore iPhone?
* — Steve T-S (@stroughtonsmith) September 10, 2017
* Best of all, the new A11 chip is expected to be built not only into the flagship iPhone X model, but also in the “iterative” iPhone 8 and iPhone 8 Plus devices.
* Apple is truly going all out this year. Perhaps even more surprisingly, it appears that iPhone X won’t be the only forthcoming hardware upgrade sporting some beastly specs.
* As we said, the next Apple TV uses a six-core A10X Fusion chip like the new iPad Pros (when was the last time Apple gave its set-top box a current chip?), with three high-performance cores accessible to apps and games and three low-power cores for background tasks.
* Apple will reveal its cards tomorrow and we’ll be providing continual coverage throughout the day so stay tuned to iDownloadBlog and be sure you have the necessary software to watch the live-streamed keynote on your devices uninterrupted.
* Any thoughts on the non-Fusion A11 chip?
* Do leave your comments below.

