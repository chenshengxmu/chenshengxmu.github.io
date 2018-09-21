---
layout: post
title: Early MacBook Pro adopters confused by misidentified graphics in System Profiler
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/11/MacBook-Pro-misidentified-GPU-macOS-System-Profiler-screenshot-002.jpeg)
* If you’re a proud owner of a 15-inch MacBook Pro with Touch Bar, you may be wondering why macOS’s System Profiler application identifies the GPU as Intel Iris Pro 580 integrated graphics vs. Intel HD Graphics 530, as advertised on Tech Specs webpage.
* No, Apple did not accidentally put the wrong GPU in the new MacBook Pro—a company source explains that the problem stems from an error in the System Information database causing the app to misidentify the GPU.
* That being said, feel free to file this one under the FirstWorldProblems drawer: although System Profiler misidentifies graphics, macOS still properly utilizes the GPU.
* A source within Apple told AppleInsider:
* The problem is a result of mistaken communication between the System Information developer team and the hardware team. The Intel HD Graphics 530 is reporting to the operating system right, it’s the System Information app database that’s leading users down the primrose path.
* System Profiler is part of the System Information app in the /Applications/Utilities/ folder. You can also access it by selecting About This Mac from the Apple menu.
* The source did not give any timetable for a bug fix to the System Information app.
* It’s understandable that the instances of misidentified GPU had some early adopters of the 15-inch MacBook Pro worried. After all, these machines cost top dollar and have much better graphics than their 13-inch counterparts.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/10/hello-again-event-macbook-pro-graphics.jpg)
* Both 15-inch MacBook Pro models have integrated Intel HD Graphics 530 that’s used whenever possible to conserve power. For graphics-intensive tasks like video and photo editing, playing games and more, the notebook uses its discreet AMD Radeon GPU (that’s a standard macOS feature, called Automatic Graphics Switching).
* The $2,399 15-incher comes with a dedicated Radeon Pro 450 GPU with two gigabytes of fast GDDR5 video memory. It can be configured with even faster Radeon Pro 460 graphics with four gigabytes of GDDR5 video memory for an extra $200.
* The higher-priced $2,799 15-incher includes Radeon Pro 455 graphics with two gigabytes of GDDR5 video memory that can be swapped out for the Radeon Pro 460 GPU with four gigabytes of GDDR5 video memory in exchange for an additional $100.
* Source: MacRumors, AppleInsider

