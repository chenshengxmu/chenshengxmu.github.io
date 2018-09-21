---
layout: post
title: iOS 11 Safari converts Google's AMP garbage back to original URLs when shared
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/iOS_11_Safari_converting_AMP_to_original_URL_iPhone_screenshot_002.jpg)
* MacStories founder and editor-in-chief Federico Viticci has discovered an awesome little new feature in iOS 11’s Safari which automatically converts Google’s cryptic accelerated mobile pages (AMP) links back to the canonical URLs.
* When an AMP version of the webpage is shared to iMessage or Reading List, for example, Safari on iPhone or iPad “automatically removes AMP’s crap from the URL,” he wrote on Twitter.
* Google created the AMP standard in October 2015 with the goal of speeding up loading times and improving the web browsing experience for mobile users. Not unlike Facebook’s Instant Articles, AMPs are hosted on Google servers and load in a fraction of the time it takes a normal webpage to load on mobile.
* Still, people have criticized Google’s implementation of the feature. When you click an AMP link in your search results, the article appears instantly but its original URL in the address bar is replaced with an AMP version pointing to the Google domain.
* For more on AMPs, read Google’s technical explainer.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/iOS_11_Safari_viewing_AMP_pages_iPhone_screenshot_001.jpg)
* Getting to the original page is a multi-tap affair because canonical URLs are obfuscated.
* To load the original non-AMP webpage, you must tap a hyperlink icon in Google’s obtrusive bar at the top, which reveals the canonical URL that you can tap to load the original page.
* A terrible user experience, if you ask me.
* With iOS 11 Safari, sharing a page automatically strips the AMP garbage so that you always get the canonical URL pointing back to the original article. I’ve tested this feature in Safari on my iPhone 6s with iOS 11 and can happily confirm that it works just as Viticci described.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/iOS_11_Safari_converting_AMP_to_original_URL_iPhone_screenshot_001.jpg)
* Thankfully, iOS 11’s Safari takes care of the AMP → original URL conversion when sharing.
* The conversion actually takes place when sharing to almost any app or service.
* For instance, bookmarking a page in Safari saves it along with the canonical URL. I also tried sharing an AMP link to Messages, WhatsApp and Slack (see above) and it worked like a charm—the browser automatically stripped the AMP stuff and shared the canonical URL.
* My only gripe is sharing to Notes, because that wouldn’t automatically convert the URL, leaving me with a note containing an AMP link. I would chalk that up to the iOS 11 beta and fully expect those kinks to be worked out before the software releases for public consumption.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/08/iOS_11_Safari_converting_AMP_to_original_URL_iPhone_screenshot_003.jpg)
* This doesn’t always work when AMPs are shared to services like Apple’s Note.
* According to a Google AMP engineer’s post on Hacker News, the company is actually allowing Apple to do this and is hoping that other browser vendors will do the same.
* “Just wanted to clarify that we specifically requested Apple (and other browser vendors) to do this,” reads the post. “AMP’s policy states that platforms should share the canonical URL of an article whenever technically possible.”
* The post notes that “Safari implemented a special case” in order to make this technically possible. “We’d prefer a more generic solution where browsers would share the canonical link by default, but this works for us,” the post continued.
* How do you like this great little tidbit in Safari?

