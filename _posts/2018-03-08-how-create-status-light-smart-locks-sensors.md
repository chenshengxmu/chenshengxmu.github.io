---
layout: post
title: How to create a status light for smart locks & sensors
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/03/August-HomeKit-Door-Lock.jpg)
* In our third entry to our HomeKit automation series, we explore a simple way to create a door lock status light. While the status light could represent many things, I use it as a way to be sure all my doors are closed and locked.
* If you prefer to watch, rather than read, check our tutorial in video form.
* Subscribe to iDownloadBlog on YouTube
* Now let’s go ahead and move on and look at this week’s challenge and tutorial.
* I came up with this after a frequent question from my girlfriend. “Did you lock the door?” is something I would hear on a nightly basis. I would assure her I did, or on other occasions, I would ask Siri to confirm this for me. Both of these are totally adequate solutions, but I was looking for a way to appease her worry without having to be the one to answer.
* I found an elegant solution, that works reliably, and lets me know that all my doors/windows are closed, and that the door is locked.
* So let’s go jump in and take a look how.
* The general solution here is to use a nightlight as the status monitor, with a few well-crafted automation rules.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/03/Smart-HomeKit-Door-Lock-August.jpg)
* To follow along at home, you need the Home app, a HomeKit lock, and (preferably) an iDevices accessory.
* Note: You don’t need an iDevices accessory necessarily, but they all come with a small “nightlight” on their accessories that can be controlled via HomeKit. If you don’t have an iDevices outlet or wall switch, you really could use any HomeKit light in its place.
* Once you’ve got your HomeKit lock and a light to use for the status, we can get to the automation.
* 1) Open the Home app and choose the Automation tab.
* 2) Tap the + button in the top right-hand corner.
* 3) Choose “An Accessory is Controlled” as the type of new automation.
* 4) The first step is to choose the accessory that will trigger the status light. In our situation, that means we want to choose our door lock.
* 5) The second step is to choose what the action is. We will need to set this up twice, once for locking, and once for unlocking. In the first round, we will choose Locks, any Time, with People turned off.
* 6) Now find your light that we will control, in my case my iDevices nightlight.
* 7) The last step before saving the automation is to choose the brightness and color of the light. For me, I want it to turn red and be at 10% whenever the door locks. Then tap Done.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/03/iDevices-Switch-Night-Light-Front.jpg)
* 8) Repeat these steps as above, but instead of Locks choose Unlocks, and instead of red make the color green or whichever color you’d like to use for unlocked.
* You’re now all set up! In my setup, whenever the Dining Room Front Door (which happens to be my front door) locks, the nightlight in my bedroom changes to red at 10 percent brightness. If it unlocks, it goes to green at 10 percent brightness.
* Here is what that automation looks like, but be aware, the summary screen doesn’t show you the color of the nightlight.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/03/HomeKit-Door-Status-Light.jpg)
* This is a fairly basic example of a status light, and if you wanted to get even more complicated, you could use a series of conditional statements to make it immensely more inclusive.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/03/Home-App-HomeKit-Automation.jpg)
* As an example, if you have HomeKit sensors on your windows, you could have them change the status light to green when they are opened, and turn to red, when they close with a conditional based on the door also being locked.
* You would then have to update your door automation to only turn red if the windows are also closed.
* You can see how this can easily become complicated, but still effective.
* Creating a status light is something that was born out of a need in our home. People like feeling secure, and til now, there is not much in the form of HomeKit security systems. You are more or less relegated to setting up your own system yourself.
* Hopefully, in the future, you could take the “security system” further by making a speaker play an audio track to let you know if a door or window is opened after a certain time, assuming that speaker supported AirPlay 2.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/03/iDevices-Switch-Night-Light-Side.jpg)
* Did you give this HomeKit tip a try?
* Let me know how it went, or any modifications you made, down in the comments!

