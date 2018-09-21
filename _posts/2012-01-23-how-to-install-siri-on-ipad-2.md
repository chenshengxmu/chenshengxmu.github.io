---
layout: post
title: How to Install Siri on iPad 2
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/How-to-Install-Siri-on-iPad-2-e1327343865339.jpg)
* Siri on the iPad 2 is now a reality, courtesy of the iPad 2 untethered jailbreak. It became a lot more compelling with the release of tweaks like SiriToggles, and updates to Hands-Free Control.
* We’ve already shown you how to install Siri on the iPhone 4, so we’ll use that tutorial along with some additional key information to help you get Siri running on the iPad 2!
* Note: You will need a jailbroken iPad 2 running iOS 5.0.1 to achieve this. You can learn how to jailbreak your iPad 2 here. You will also need SiriProxy, which I show you how to install using Ubuntu. SiriProxy will work with other operating systems, but I’ve found Ubuntu to be incredibly straight forward and dependable, plus it’s free.
* Step 1: Get intimately familiar with our Spire Tutorial, and use it to install Siri Proxy.
* Step 2: Install Spire on the iPad 2.
* Note: Again, do this at your own risk. This could make your iPad kick into “iPhone mode” which makes your screen look funky, as everything is sized for iPhone. A quick respring should fix this, but you’ve been warned. I had no problems with it, but it’s worth noting.
* Step 3: Download an install Dropbox; log in, and download the ca.pem file that was placed there in the initial Siri Proxy Tutorial. (Select it, copy link, paste link in Safari Browser). The Install Profile window should open, select Install, and tap Done.
* Step 4: Open iFile and navigate to /etc/. Tap hosts and choose Text Viewer. Tap Edit in the upper-left hand corner, and add the following line:
* 127.0.0.1 guzzoni.apple.com
* Tap Save then tap Done.
* Step 5: Open the Settings app and go to General > Siri. Enable Siri.
* Step 6: Open the Settings app and under Extensions select Spire. Type the following in the Proxy Host field:
* https://guzzoni.apple.com
* Step 7: Open iFile and navigate to /var/mobile/Library/Preferences/. Once there tap and open com.apple.assistant.plist
* Tap on Accounts > Choose your hex key (this will be a random alphanumeric value) > and add the following three fields utilizing the “+” sign in the bottom right-hand corner, then tap Done:
* Step 8: Open Settings > Wi-Fi > and Select the right blue arrow corresponding to your Wi-Fi connection. Change the DNS field to the IP address of your Siri Proxy Server. Again, if you need help with this, get familiar with our original Siri Proxy Tutorial.
* Step 9: Exit Settings, and test Siri by pressing and holding the Home button. You should also see feedback in the terminal window of your Ubuntu server, just like you did when running Siri Proxy on the iPhone 4S, or iPhone 4.
* Step 10: Install some cool plugins like Hands-Free Control or SiriToggles and really have fun. They both work well on iPad 2.
* And that’s it folks. If you have any issues, be sure to re-read our previous Spire tutorial.
* At first I wasn’t sure how useful Siri would be on the iPad 2, but now that there are jailbreak tweaks that take advantage of Siri, I think it’s awesome! What do you think?

