---
layout: post
title: New Google app turns Live Photos into animated GIFs and movies with cinematic backgrounds
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Google-Motion-Stills-1.0-for-iOS-teaser-001.png)
* Google today announced it’s launching a brand new iPhone application aimed at those who wish to turn their Live Photos into animated GIFs. Aptly named Motion Stills, the app turns Live Photos into Motion Stills with Google’s stabilization technology and cinematic backgrounds.
* These Motion Stills can then be shared as looping GIFs on social media. Motion Stills is available free in the App Store.
* A Google Research project, the new Motion Stills app acts as a virtual cameraman for your Live Photos. You can browse through your Live Photos stream, flip through one-by-one, watch them auto-play or, as mentioned, turn them into movies or even combine multiple Motion Stills together with a swipe.
* “We use our video stabilization technology to freeze the background into a still photo or create sweeping cinematic pans,” Google explains.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Google-Motion-Stills-1.0-for-iOS-example-001.gif)
* This advanced stabilization and rendering technology reminds me a lot about the Google Photos app, which has a similar feature that automatically picks best shots in your library and turns them into compelling movies.
* Google says that all of this works right on your iPhone, no Internet connection needed.
* Based on linear programming, Google’s algorithm computes a virtual camera path so that Live Photos and bursts look as if filmed using stabilization equipment.
* According to Google:
* Our challenge was to take technology designed to run distributed in a data center and shrink it down to run even faster on your mobile phone.
* We achieved a 40x speedup by using techniques such as temporal subsampling, decoupling of motion parameters, and using Google Research’s custom linear solver, GLOP.
* We obtain further speedup and conserve storage by computing low-resolution warp textures to perform real-time GPU rendering, just like in a video game.
* The app uses loop optimization to figure out optimal start and end points and discard blurry frames in order to fix the problem when taking Live Photos when you forget to hold your iPhone still for 1.5 seconds after pressing the shutter button.
* A Live Photo before and after stabilization with Motion Stills
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Google-Motion-Stills-1.0-for-iOS-example-003.gif)
* But how do they separate the background from the rest of the scene?
* Basically, Google classifies motion vectors into foreground and background in a temporally consistent manner. “We use a cascade of motion models, moving our motion estimation from simple to more complex models and biasing our results along the way,” the post reads.
* Left: Original with virtual camera path (red rectangle) and motion classification; foreground(red) vs. background(green) Right: Motion Stills results
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Google-Motion-Stills-1.0-for-iOS-example-002.gif)
* All that technical jargon shouldn’t concern non-techies who only need to know they have yet another free option when it comes to converting Live Photos into GIFs.
* And if enough people like Google’s new technology for short video creation, they will consider integrating it into other products like Google Photos.
* Motion Stills requires an iPhone, iPod touch or iPad with iOS 9.0 or later.
* The app is localized in English, Catalan, Chinese (Hong Kong), Croatian, Czech, Danish, Dutch, Finnish, French, German, Greek, Hindi, Hungarian, Indonesian, Italian, Japanese, Korean, Malay, Norwegian Bokmål, Polish, Portuguese, Romanian, Russian, Slovak, Spanish, Swedish, Thai, Traditional Chinese, Turkish, Ukrainian and Vietnamese.
* Grab Motion Stills for free from the App Store.
* Source: Google

