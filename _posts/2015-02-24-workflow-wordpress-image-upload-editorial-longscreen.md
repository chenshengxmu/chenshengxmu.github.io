---
layout: post
title: Workflow is an amazing app, and this WordPress image uploading workflow shows why
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/02/Workflow-WordPress.png)
* Although I’ve long admired the iPad-centric work ethic of individuals like MacStories’ Federico Viticci, I could never fully commit to working from my iPad due to the perceived amount of steps needed to get things done. Yes, it’s possible, but I’ve always thought it was easier to work from my MacBook Pro.
* With that said, I certainly admire anyone who can successfully pull it off, as Viticci has obviously done. There’s even a slight bit of jealousy there because he’s figured out well in advance how not to be ball-and-chained to a traditional desktop.
* With iOS 8, a lot of that has changed. iOS is now more open than ever and users can do some powerful things with said openness. Case and point: Workflow—the automation app that opens up the door to automation newbs like myself. Yes, much automation could be done prior to Workflow—apps like Pythonista and Editorial proved as much—but Workflow is venturing into brand new territory. Not only is it arguably the most powerful automation tool available for iOS, it makes implementing automation accessible to mere mortals.
* In this post, I’d like to show off one of the workflows that I’m extremely proud of. To be honest, this post is sort of a stealth-brag, but that’s okay. When you see this workflow in action, you’ll understand why.
* My workflow does the following with minimal user interaction:
* Again, all of this is done with basically two points of in-process user interaction: the part where I give the uploaded image a name, and the part where I confirm the deletion of the images needed to create the uploaded image.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/02/Combined-Workflow.png)
* The Combine Upload workflow
* This workflow calls on several apps through its runtime, and these include:
* Long Screen – URL scheme used for combining two screenshots and cleaning the status bar
* Editorial – Featuring a custom python script to upload an image to WordPress
* Safari – Opens the WordPress Media Library post process
* Let me preface this by saying that none of the jailbreak portions are requirements for the workflow. But, since I’m a jailbreaker, I’ve decided to take things a step further with regard to kicking off my workflow. I use three jailbreak tweaks to help streamline the start process of my workflow, and it’s made things even easier.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/02/workflow-jailbreak.png)
* Jailbreak tweaks spice things up
* Here are the tweaks that I use:
* Activator allows me to use gestures to execute specific actions, while Profluence mates those gestures to workflows. Finally, Polus lets me create a custom button in Control Center assigned to execute an Activator gesture.
* Are you seeing where I’m going with this? To run my workflow, all I need to do is take two screenshots, open Control Center, and press the custom upload button. That’s it.
* To use the Editorial workflow, you’ll need to import the python-wordpress-xmlrpc library. To do this you can use Pipista. @jackenhack has a very thorough walkthrough on how to do this, so I’m not going to reinvent the wheel. Read his post, as it’s step-by-step.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/02/workflow-editorial.png)
* The Editorial script
* You’ll need to configure the Editorial workflow with the details from your WordPress blog. If you don’t use WordPress, you’ll need to substitute this portion out for your specific needs.
* This post, although geared towards my personal WordPress workflow, is more of a proof of concept to show off some of the awesome things that Workflow is capable of. For me, this is just the tip of the iceberg, as I plan on continuing to implement Workflow into my day-to-day blogging routine.
* Ultimately, I think that as iOS grows and as the Workflow community evolves and grows, we’ll probably look back on this Workflow and think it was extremely rudimentary. Perhaps someone like Viticci already does. But as of now, I’m pretty stoked to be able to upload images to WordPress so easily.
* What do you think about Workflow?

