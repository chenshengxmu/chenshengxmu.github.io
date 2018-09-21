---
layout: post
title: A closer look at Differential Privacy in iOS 10 and macOS Sierra
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/WWDC-2016-slide-Differential-Privacy.jpg)
* Making Apple services even smarter and more personalized entails processing troves of information because intelligence is driven by big data. The fact that iOS 9’s proactive features don’t tap into the cloud has served Apple well thus far. But since Google Assistant came to light, people have been wondering if Apple can compete without resorting to raw data collection Google is infamous for.
* iOS 10 and macOS Sierra represent Apple’s refined approach to privacy, which revolves around new techniques collectively known as Differential Privacy. An en vogue statistical method, Differential Privacy helps Apple deliver smarter services without compromising privacy of their users.
* It’s a relatively unproven technique with lots of potential which hasn’t been used to boost Apple’s services before iOS 10 and macOS Sierra. Here’s a closer look at Differential Privacy, how it powers intelligence and proactiveness and why it should serve Apple better than Google’s bulk data collection and analysis.
* Unlike Google, Apple does not build any user profiles when you search for a location in Maps, manage your photos, surface information in Spotlight/Siri, listen to music and so forth. Given the scale, power and intelligence of Assistant, Google’s new conversational AI helper, one cannot help but wonder how Apple might compete with that without resorting to the indiscriminate data collection à la Google.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/WWDC-2016-slide-Differential-Privacy-No-user-profiling.jpg)
* Spotting crucial patterns about how folks are using devices is crucial in helping services evolve over time, becoming smarter and more proactive. Enter Differential Privacy, a fresh new technique used in iOS 10 and macOS Sierra to discover various patterns for a large number of users without compromising any individual’s privacy.
* Rather than anonymize user data before it’s uploaded to the cloud for analysis, like Google does, Apple’s approach takes advantage of the power of the silicon, smart programming and Differential Privacy to determine how you use your device and what you might want to do next.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/WWDC-2016-slide-Differential-Privacy-On-device-intelligence.jpg)
* Apple couples on-device data accrued over time with deep learning, artificial intelligence and other advanced software to improve several aspects of iOS 10 and macOS Sierra in privacy-friendly ways. For example, Differential Privacy in iOS 10 pinpoints trending words to prioritize them when offering up suggestions.
* Most other privacy techniques anonymize data sets before sending them to servers.
* This is achieved by removing any personally identifying information from the data. For example, your first and last name, ZIP code, telephone number and other information is typically removed from data logs captured by servers when you use various online services.
* The method suffers from a major drawback: as proven by security experts, even aggregate statistical information about the data may reveal some personal information about the individuals after linking two or more separately innocuous databases.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/App-Store-Ads-Privacy-WWDC-2016-slide-001.png)
* In one example, Latanya Sweeney from Carnegie Mellon University linked the anonymized database containing the birthdate, sex and ZIP code of each patient with voter registration records, allowing her to successfully identify the medical record of the governor of Massachusetts.
* Or take Netflix as an example. In 2007, the company released a training dataset to help developers refine the recommendation engine. All personally identifiable data on Netflix customers was anonymized and their unique IDs replaced by randomly assigned IDs.
* A privacy “budget” ensures Apple doesn’t recover too much information from any user.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-004-1.png)
* After linking Netflix’s anonymized training database with the publicly available IMDb database using the date of rating by a user, Austin University researchers partially de-anonymized the training database and compromised the identity of some users.
* Differential Privacy protects against these kinds of deanonymization techniques.
* Differential Privacy takes advantage of advanced research work in the areas of statistics and data analytics to realize crowd-sourced learning while keeping the information of each individual user completely private.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-003-1.png)
* Apple actually brought in Professor Aaron Roth of University of Pennsylvania, who co-wrote a book on Differential Privacy, to analyze its privacy-enhancing techniques. He concluded that incorporating Differential Privacy broadly into Apple’s software has reinforced its position as “the clear privacy leader among technology companies today”.
* Differential Privacy in iOS 10 and macOS Sierra is completely optional.
* Customers will be free to opt-out at any time, but services enhanced by Differential Privacy won’t be as smart without the feature active. Differential Privacy in iOS 10 and macOS Sierra is going to be limited to the following use cases at launch:
* Differential Privacy in Sierra helps improve autocorrect suggestions and Lookup Hints in Notes. In iOS 10, the feature makes QuickType and emoji suggestions smarter while improving Spotlight deep link suggestions and Lookup Hints in Notes.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-008.png)
* The company also uses a differentially private way to improve the ranking of third-party apps’ content in search results on the App Store. As people use their apps, iOS 10 submits a subset of differentially private hashes to servers.
* “The differential privacy of the hashes allows Apple to count the frequency with which popular deep links are visited without ever associating a user with a link,” as per the “What’s New in iOS 10” section on its portal for registered developers.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/App-Store-Ads-Privacy-WWDC-2016-slide-002.png)
* Using Differential Privacy, Apple mixes on-device data with noise in order to obscure personal information before analysis. As a result, it’s able to take advantage of the cloud to improve services based on aggregate crowd-sourced data in a manner that protects personally identifying information therein.
* Some rather advanced math and complex statistics are involved in taking advantage of Differential Privacy to mine data for insight without putting your privacy at risk.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-014.png)
* Differential Privacy relies heavily on hashing, subsampling and noise injection.
* Hashing is transforming any data into a shorter value. Because hashes are fixed-length keys that represent the original string, they’re often used in encryption and database search as it’s much faster to find shorter hashed keys than their original values.
* Subsampling assists in big data analysis by clustering large data sets efficiently and reliably. This is accomplished by performing computations using the small subsample as a surrogate for the full sample. Using subsampling, your iPhone which has limited computing resources is able to analyze on-device data with high probabilities, no cloud required whatsoever.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-007.png)
* Noise injection minimizes privacy breaches using generalization and is used in training artificial neural networks. By adding diluted data into the original data set, noise injection introduces randomness. While it’s true that too much noise can mask the original data to the extent that it ceases to be beneficial, this technique is perfect for mining smaller data sets like your chats in Messages.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-009.png)
* Based on crowd-sourced data analysis, iOS 10 spots interesting patterns like trending words in Messages. In addition to powering more accurate QuickType keyboard suggestions, Differential Privacy in iOS 10 also helps determine the frequency with which specific emojis are used in order for the stock QuickType keyboard to suggest relevant emojis as you type.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/iOS-10-Messages-emoji-predictions-teaser-002.png)
* Another great example is iOS 10’s Photos app, which needs both on-device and external data to train its image recognition algorithm. To be sure, Photos runs image analysis locally on the device—that’s why the app must index locally-stored photos separately on each device.
* The approach provides an acceptable trade-off between strong security and privacy on one hand and the ability to recognize seven different facial expressions and 4,432 objects and scenes without needing to scan them in iCloud on the other.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-006.png)
* It would have been much easier for Apple to resort to deep analysis of users’ photos in the cloud, like Google does. Though doing so would’ve yielded a more powerful image recognition, it would’ve been a terrible move given Apple’s firm stance of protecting privacy for all of its customers.
* Hence—Differential Privacy.
* Apple has long insisted that providing great features should not come at the expense of strong security nor should it put privacy of its customers at risk.
* “All of this great work in iOS 10 would be meaningless if it came at the expense of your privacy,” Apple’s software boss Craig Federighi said onstage at WWDC 2016.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-005-1.png)
* Differential Privacy helps make specific iOS 10 and macOS Sierra features smarter that before without using the cloud for insight at scale. That’s because Differential Privacy, along with related techniques like hashing, subsampling and noise injection, lets Apple run big data analysis to spot patterns directly on the device, without using the power of iCloud.
![img](http://media.idownloadblog.com/wp-content/uploads/2016/06/Apple-Differential-Privacy-WWDC-2016-slide-010.jpg)
* In other words, Differential Privacy gives you the best of both worlds—smarter, more proactive features and the strong security and privacy Apple is famous for.
* Hopefully, you now have a better understanding of what Differential Privacy is.
* Apple has only begun deploying the feature gradually across its platforms so we should learn more about Differential Privacy in the coming months. From my vantage point, Differential Privacy is Apple’s ticket to advanced artificial intelligence and deep learning.
* That it’s a viable answer to Google’s raw data collection doesn’t hurt either.
* I’m glad that Apple doesn’t profile me by scanning my emails, calendars and contacts. I sure as hell don’t want them to run image recognition on my iCloud Photo Library. And I’d certainly hate if iOS logged every keystroke and uploaded my chats to iCloud just so Apple’s PR could brag about QuickType suggestions becoming more relevant.
* Differential Privacy ensures that my private data stays private and no personally identifiable information gets sent to iCloud where it’s prone to security breaches, government eavesdropping and law enforcement data requests.
* Now that you know a thing or two about Differential Privacy, are you glad that Apple has started using it? Will you be opting-in to Differential Privacy when iOS 10 and macOS Sierra release this fall, do you think?
* And if so, do you expect Differential Privacy to bring comparable levels of intelligence and proactiveness to Apple’s software compared to Google’s?
* Meet us in comments.

