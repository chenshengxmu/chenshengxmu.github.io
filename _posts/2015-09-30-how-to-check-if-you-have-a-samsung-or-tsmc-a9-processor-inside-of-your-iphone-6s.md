---
layout: post
title: How to check if you have a Samsung or TSMC A9 processor inside of your iPhone 6s
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/A9-Chip-Source.png)
* You’ve probably heard that Apple is using A9 processors from two different sources for the iPhone 6s and iPhone 6s Plus. One processor is from Samsung, and the other is from TSMC.
* It’s been confirmed via benchmarks that both processors perform similarly with no major differences in performance. With that said, each processor features a different die size, which was first noted by Chipworks. The Samsung processor is the smaller of the two. Physically, it’s 96mm squared, while the TSMC A9 is 104.5 mm squared.
* Chipworks conjectures that two different sources were used due to supply constraints. They also say that they are further researching both processors in an effort to gain better clarity.
* Ultimately, it really doesn’t mean much to the end user, but I know that curiosity gets the best of us at times. If you’d like to check to see who sourced your A9 processor, you can follow these simple steps.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/CHipworks.jpg)
* Note: You will need to register your Apple ID as a developer, but you don’t need a pair developer account. Check here for more details. This code is open source, and thus has been examined and scrutinized, unlike some other shady apps that may claim to do the same thing. Special thanks to David Stockley for building this app.
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/A9-Chip-TSMC-Samsung.png)
* Step 1: Download Xcode 7 from the Mac App Store.
* Step 2: Launch Xcode 7.
* Step 3: Click Source Control in the menu bar and click Check Out.
* Step 4: In the repository location box, paste the following: https://github.com/WDUK/A9ChipSource.git and click Next.
* Step 5: Connect your iPhone 6s to your Mac via USB
* Step 6: In the drop down device selection menu, select your iPhone 6s
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/A9-Source-David-Stockley.png)
* Step 7: Wait as Xcode 7 indexes and processes symbol files. This will take a while. Once complete, the status will say Ready.
* Step 8: Click the Play button, and the code should compile and the A9 Chip Source app will be installed on your iPhone.
* Step 9: Launch the A9 Chip Source app, and you should see the chip source—either TSMC or Samsung.
* Which chip is inside your iPhone? Both my iPhone 6s and 6s Plus feature the larger TSMC chips.
*  
*  

