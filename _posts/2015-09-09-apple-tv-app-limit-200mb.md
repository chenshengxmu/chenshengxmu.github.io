---
layout: post
title: Maximum size of an Apple TV app limited to 200MB, apps must store all data in iCloud
---
![img](http://media.idownloadblog.com/wp-content/uploads/2015/09/Apple-TV-4-remote-in-hand.jpg)
* It’s interesting that we haven’t seen any major triple-A games shown off as part of today’s on-stage demos of third-party applications for the new Apple TV.
* Now it’s clear why: the existing multi-gigabyte iPhone and iPad games such as the Infinity Blade trilogy, Asphalt 8 and many more must be refactored to fit the inexplicable 200MB limit for an Apple TV app.
* This means that assets like new levels and worlds will be retrieved on demand from the App Store, indicating Apple is positioning its new box as a casual gaming device for your living room rather than a full-on gaming console.
* As per Apple’s newly published document titled “App Programming Guide for tvOS,” the new box lacks local storage for apps and imposes the maximum app size of 200MB.
* It’s an odd decision given the maximum size of an iPhone and iPad app was increased from two to four gigabytes. The 200MB limitation also strikes me as odd because the new Apple TV hardware is offered in two flavors—32GB and 64GB—providing way more storage for caching purposes than the existing 8GB Apple TV.
* “Anything beyond this [200MB] size needs to be packaged and loaded using on-demand resources,” Apple cautions.
* Thankfully, as part of its App Thinning initiative in iOS 9 the company provides developer tools allowing the creation of apps which take advantage of on-demand assets.
* On-demand resources are app contents that are hosted on the App Store and are separate from the related app bundle that you download. With on-demand resources, developers can produce apps with a much smaller initial download.
* A game, for example, can request new assets on a as-needed basis and the operating system will take care of managing downloading and storage.
* As you quit apps that have downloaded additional resources, tvOS may choose to keep them on the device through multiple launch cycles, making access even faster, or delete them altogether should you run low on storage space.
* “There is no persistent local storage for apps on Apple TV,” explains the document.
* “This means that every app developed for the new Apple TV must be able to store data in iCloud and retrieve it in a way that provides a great customer experience.”
* Source: Apple

