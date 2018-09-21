---
layout: post
title: How to simulate tetherless Hey Siri functionality on macOS Sierra like a pro
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-Siri-teaser-003-e1468361540976.jpg)
* Apple advertises Siri as one of the headlining new features in the forthcoming macOS Sierra software update. Siri on the Mac performs in much the same way as it always has on an iPhone, iPad and iPod touch, except on the Mac tetherless ‘Hey Siri’ functionality is currently unsupported.
* On iOS, tetherless ‘Hey Siri’ requires Apple’s embedded M9 motion coprocessor to monitor microphone input without taxing the battery. Since the battery isn’t a major concern with Macs, the decision not to implement ‘Hey Siri’ on Sierra is eyebrow-raising. As it turns out, you can easily simulate ‘Hey Siri’ on Sierra without resorting to dark magic, using a simple trickery.
* We’re going to replicate ‘Hey Siri’ with the Mac’s Dictation feature, which uses Siri’s underlying speech-to-text engine. We’ll need to create a custom hot word for Dictation using Accessibility settings so that Dictation always listens for our voice input.
* Firstly, we’ll need to tell Dictation to wake upon hearing the hot word “Hey”. Secondly, we’re going to create a Dictation command that will run your custom Siri shortcut.
* Such a setup will allow you to activate Siri by saying “Hey Siri” at any time. Note that this trick won’t work with the default Siri keyboard shortcuts—that’s why you’ll need to create your own.
* 1) Launch System Preferences → Siri.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Siri-customize-keyboard-shortcut-screenshot-001.jpg)
* Click the Keyboard Shortcut popup menu and select Customize to define your own combination of keystroke for invoking Siri.
* 2) Press a desired combination of keys on the keyboard that you wish to register with Siri. I’m going to go ahead and create Control (⌃)—Command (⌘)—S as my custom Siri keyboard shortcut.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Siri-customize-keyboard-shortcut-screenshot-002.jpg)
* We’re going to wire this shortcut to Dictation, but don’t you worry—Siri’s existing shortcuts (press Function—Space or hold Command (⌘)—Space) will continue to function like before.
* 3) Now open System Preferences → Accessibility.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Dictation-set-Hey-Siri-command-screenshot-001.jpg)
* In the lefthand menu, select Dictation under the Interacting heading. In the righthand section, tick the box next to “Enable the dictation keyword phrase” and type the word “Hey” inside the box.
* 4) Click the Dictation Commands button.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Dictation-set-Hey-Siri-command-screenshot-002.jpg)
* A new sheet with various Dictation commands should pull up. You must now tick the box next to “Enable advanced commands” at the bottom of the lefthand section to reveal options for the creation of your own Dictation commands.
* 5) In the righthand section, type the word “Siri” into the field labeled ”When I say”.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Dictation-set-Hey-Siri-command-screenshot-003.jpg)
* 6) Click the Perform popup menu and choose the Press Keyboard Shortcut option.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Dictation-set-Hey-Siri-command-screenshot-004.jpg)
* Now press the same custom keyboard shortcut you just created in steps 1 and 2. In my case, I pressed Control (⌃)—Command (⌘)—S.
* 7) Lastly, click Done and close out System Preferences.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/07/macOS-Sierra-System-Preferences-Dictation-set-Hey-Siri-command-screenshot-005.jpg)
* And just like that, ladies and gentlemen, you’ve created a ‘Hey Siri’ Dictation command. You’ll notice a small microphone icon in your Mac’s menu bar—it signifies that Dictation is in always-listening mode.
* Dictation actually invokes your custom Siri shortcut upon hearing the word ”Siri” after being awoken (the hot word “Hey”), basically mimicking tetherless ‘Hey Siri’ functionality found on the iPhone 6s, iPhone 6s Plus and iPhone SE.
* Much to my surprise, this nifty workaround solution works like a charm. I couldn’t notice any significant delay between asking something along the lines of “Hey Siri, what does my weather look like?” and witnessing her responding to the input.
* In fact, it takes less than a second for Siri to show up after saying “Hey Siri”.
* How do you like this little tip?

