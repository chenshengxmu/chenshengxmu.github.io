---
layout: post
title: iOS 10 preview- Siri comes to (some) apps & powers smarter QuickType keyboard suggestions
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Preview-Siri-apps-QuickType-keyboard-teaser-001.jpg)
* Siri has gained new features in iOS 10. Not only does she power smarter QuickType keyboard suggestions and lets you control HomeKit-compatible accessories using your voice, but Apple now officially supports third-party integration with SiriKit for developers.
* In opening up Siri to apps, Apple’s taken the same controlled approach like with iOS multitasking by only permitting certain app types.
* In this iOS 10 preview, we’re going to take a closer look at an improved QuickType keyboard with added Siri intelligence, explain specific app types that can take advantage of Siri and look into the technologies that make all of this possible. 
* In addition to providing intelligence in Photos and Maps, Siri on iOS 10 is tasked with delivering smarter, contextually-aware suggestions as you type on the QuickType keyboard. She also lets you control HomeKit-compatible accessories using your voice, even remotely through the Apple TV.
* Most importantly, Siri now works in certain types of third-party apps that provide ride hailing services, workout features, messaging, VoIP calling and photo searching.
* As is his wont, my colleague Andrew has created a quick video hands-on covering Siri-powered QuickType enhancements and integration with your favorite apps.
* If you don’t see the video, watch it on YouTube.
* The video runs three minutes and fifty seconds long. A more detailed overview of new Siri features in iOS 10 follows further below.
* Siri intelligence meets Apple’s predictive QuickType keyboard in iOS 10.
* For starters, the proactive Siri assistant makes Apple’s QuickType smarter and enables new features like contextual predictions to surface relevant information based on location, calendar availability or contacts.
* As a bonus, Siri delivers an all-new multilingual typing feature to QuickType, which lets you type in two languages at the same time without switching between keyboards.
* For those interested in technicalities, Siri-driven QuickType enhancements tap into deep learning techniques and Long Short Term Memory (LSTM) networks to provide more relevant suggestions in a longer context without disrupting your privacy.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-QuickType-keyboard-Siri-suggestions-teaser-001.jpg)
* Let me give you an example.
* Let’s pretend a co-worker has asked for someones’s email address. Instead of launching Contacts to tediously copying relevant information and paste it into the chat, Siri comes to the rescue: based on the conversation context, she proactively puts relevant contact information right above the QuickType keyboard.
* Without typing, contact info can then be sent with a single tap.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Siri-QuickType-contact-suggestions-silver-iPhone-screenshot-001.png)
* Another example: you want to meet your girlfriend at a local record store.
* The problem is, she doesn’t know where the store’s located and asks you to send over a Maps location. Rather than switch to Maps to find the place and paste its location into the chat, Siri proactively puts a Current Location button above the keyboard.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Siri-QuickType-location-suggestions-silver-iPhone-screenshot-001.png)
* With a tap, your current location can be sent to your girlfriend.
* In addition to smarter typing suggestions and the ability to send your current location and contact information on your behalf, Siri’s contextual QuickType predictions in iOS 10 extend to intelligent scheduling with full calendar availability.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/wwdc-2016-ios-10-siri-quicktype-intelligence.jpg)
* For example, when you type something like “I’m available at,” the free time in your calendar pops up as an option. Siri will even surface recent addresses in Maps and provide relevant content suggestions to a new Look Up feature.
* RELATED: iOS 10’s Look Up feature includes Siri-powered suggestions
* And as mentioned before, Siri intelligence powers a new multilingual typing feature of iOS 10 which lets you type in two languages without switching keyboard.
* With support for third-party apps on iOS 10, you’ll be able to ask Siri to do accomplish many tasks she currently has no means of achieving, like booking a ride through Lyft or sending money to someone with Square or accessing other content and services.
* The official SiriKit makes it easy to integrate these features into third-party apps.
* Here’s a flowchart of how a ride request intent is resolved via Siri.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-ride-hailing-intent-chart.png)
* The following six major app categories are supported for Siri integration on iOS 10:
* Although ride booking and restaurant reservations are handled primarily by iOS 10’s Maps app, users are of course free to book their rides from within Siri’s interface as well. As for CarPlay, automotive venders can now use the new SiriKit to allow drivers to control certain vehicle features using voice command.
* For instance, you could order Siri to set the climate controls by saying “Set the heater to 72 degrees” or adjust the radio in your car using voice commands.
* Developers of audio and video calling apps based on the ubiquitous VoIP protocol, such as Skype, now finally are allowed to tap into Siri in order to elevate the experience.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Lock-screen-WhatsApp-Silver-iPhone-screenshot-001.jpg)
* Imagine initiating a VoIP call by asking Siri to “Call Dad on Viber” or “Call my boss through Skype”. And because iOS 10 now allows VoIP apps to take over the Lock screen, an incoming VoIP call from apps like Skype now pulls up the same full-screen contact image and information like standard cellular phone calls.
* Due to limitations in the current edition of iOS, these apps can only put a dull notification on the Lock screen when a VoIP call comes in.
* Siri lets you start, pause and end workouts with your favorite workout app.
* As is the case with other Siri-enabled apps, your workout app must be updated for iOS 10 and Siri integration. A simple “Start my daily run workout from Runtastic” is all it would take to start a workout in Runtastic.
* Other examples might include queries like “Start my yoga workout using Sworkit”, “Start my session in 7 Minute Workout Challenge” and more. For those who don’t own an Apple Watch, this will be a great way to start your workout by issuing spoken commands to Siri using EarPods or a wireless headset connected to your iPhone.
* Siri will make it easier than ever to request a ride through apps like Uber, Lyft, Didi Chuxing in China and many others which provide taxi-like services—right from within the context of Maps interface or anywhere in iOS via standard Siri interface.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Siri-Lyft-Lock-screen-iPhone-screenshot-001.jpg)
* Saying something simple as “Siri, hail me an Uber” will do the trick, though more complex queries with destination names are possible as well, such as “Get me a ride to SFO via Lyft”.
* Siri currently understands things like “Text Mom saying I’m gonna be late.”
* With full-on support for messaging apps, users will be able to message friends and family using an app of their choice and Siri commands like ”Message Mom on WhatsApp saying I’m gonna be late” or “Send a text to Carey using Facebook Messenger”, including right from the Lock screen.
* Given the prevalence of messaging apps like Facebook Messenger, Viber, WeChat and WhatsApp, I’m convinced this is going to be one of the most popular use cases for Siri’s third-party integration in iOS 10.
* With support for media search, Siri can look for photos and videos of particular content type and play slideshows in the app of your choice, provided it’s updated with Siri integration. Some examples include “Look for beach photos taken last summer in Camera+”, “Find mountain photos taken last winter in Google Photos” and so forth.
* Complex queries are supported, too, like finding images in a certain app with trees on them which were taken in San Francisco in June of 2014. There’s absolutely no doubt in my mind that this ability to search for photos from third-party apps anywhere in iOS, using Siri, will be another great time-saver.
* With support for payments apps, Siri can send and request payments to and from other people on your behalf, using any app which support personal payments and integrates with Siri. Queries like “Send $100 to John for dinner last night using Square” are perfectly possible on iOS 10. Although Square is a launch partner for third-party Siri integration, it’s unclear if PayPal will update their app with Siri support.
* When you requests specific types of services through Siri, iOS 10 uses Siri extensions to fulfill your request and present you with results within the context of her UI.
* Like with normal Siri queries, asking the voice assistant to provide a service through a third-party app invokes a chain of events. First, iOS 10 needs to upload your voice sample to a voice recognition backend.
* After turning text to speech and adding intent and context information, the server then beams data back to your device. After receiving results from the server, iOS 10 calls an appropriate Siri extension to handle these actionable intents and fulfill your request.
* All apps must request permission to use Siri.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Settings-Privacy-Speech-Recognition-iPhone-screenshot-001.png)
* Apps that have permission to access speech recognition can be managed through a new section in Settings → Privacy → Speech Recognition.
* “Services like Siri, Maps and News send data to Apple’s servers, but this data is not used to build user profiles,“ notes the company.
* Apps can also provide a custom interface for Siri results.
* For instance, a ride-booking app might use a custom interface with additional ride details and branding. Or, a messaging app could display message content using custom styles with its own branding and colors.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Siri-Support-for-Third-Party-Apps.png)
* A fitness app might implement a custom Siri interface to display custom workout information and branding, and so forth. A custom interface is presented with the rest of the Siri or Maps content and can display animations and update itself using timers and other programmatic means.
* Custom Siri interfaces are not permitted to receive touch events.
* It is possible for app developers to introduce custom vocabulary containing any terms that Siri might not understand naturally. In one example, a ride booking app that refers to a specific vehicle type as a “Vroom” could define that term for Siri and provide examples of how users might use it.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/wwdc-2016-siri-wechat.jpg)
* Another example would be an imaginary messaging app that might add the screen names from the user’s favorites list to the Siri vocabulary. Apple cautions that these specific terms must belong to one of the following categories:
* While there are no guarantees that any custom vocabulary will be recognized by Siri later, she will treat any custom terms as hints and use them whenever she can.
* We’ve made it a mission to dive deep into Apple’s upcoming software updates to inform you of both major new features you’ll care about and the little things that’ll delight you.
* Here are our iOS 10, macOS Sierra, tvOS 10 and watchOS 3 previews:
* More previews will be added to the list as they become available.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Siri-waveform-image-002.png)
* If you’d like us to focus on specific new features, please do feel free to shoot us a quick email message at tips@idownloadblog.com.
* iOS 10 is available to members of the Apple Developer Program and will launch to public beta testers signed on the Apple Beta Software Program in July ahead of general availability in the fall.
* System requirements for iOS 10 are the same as those for its predecessor, but the iPhone 4s, original iPad and iPad 2 are no longer supported.
* How do you like new Siri features on iOS 10 and are you as excited for her newly gained ability to do more by working with third-party apps as we are?
* Chime in with your thoughts and observations down in the comments.

