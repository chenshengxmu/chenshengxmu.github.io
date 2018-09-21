---
layout: post
title: GoogolPlex will 'unleash the power of Siri' with Nest, Philips Hue, Spotify commands
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/09/siri-ios-7.jpg)
* Siri within iOS 7 can be limited sometimes, thanks to Apple’s “walled garden”, but a new tool called GoogolPlex wants to change that by opening the voice assistant to new commands.
* Self described as the “App Store for Siri”, GoogolPlex opens Siri to work with Spotify, Philips Hue, the Nest Thermostat and more, just by an iOS user changing a few proxy settings…
* With GoogolPlex you can speak commands like “GoogolPlex, play Demons” for Spotify, “GoogolPlex, turn on my lights” for Philips, or “GoogolPlex, make it warmer” for Nest. It’s worth noting commands are opened routed through a web page first.
* Since Siri’s APIs are closed by Apple, GoogolPlex works in a roundabout way – but it only takes about 30 seconds to set-up, no jailbreak required. To get it working, it’s as simple as following a few directions:
* Past a few features from the GoogolPlex team, third-party developers have also created Siri hacks using GoogolPlex. There’s a command to use Google Maps instead of Apple Maps with Siri to get directions, a Pick a Card command to pick a random playing card from a 52-card deck, and a Flip a Coin command that will flip a coin (heads or tails) randomly when you ask Siri.
* Alex Sands, Ajay Patel, Ben Hsu and Gagan Gupta from the University of Pennsylvania are behind the useful project. Past Siri hacks that worked similarly – namely SiriProxy – were a bit of a hassle to setup, but GoogolPlex simply intercepts Siri’s connection to its servers to launch third-party apps.
* Sands and Gupta tell iDownloadBlog that there have been 2,500 user sign-ups since this morning and that there are now 50 commands available. They don’t expect any issues from Apple. They claim there aren’t any rules being broken.
* “We plan on working on GoogolPlex in the near future to make it open for anyone to build custom commands and actions into the platform,” the team says.
* The team explains how it made GoogolPlex work in a technical sense:
* When a user says “GoogolPlex, turn off the lights,” Siri hears this as “Google ‘Plex turn off the lights,’” interpreting that the user wants to Google something. Siri then searches Google for the words “Plex turn off the lights,” and this is where GoogolPlex comes in. We are able to get the words the user was asking Siri by intercepting the request between Siri and Google with a man-in-the-middle exploit.
* The GoogolPlex team doesn’t expect any issues for its name from Google – pronounced “Google Plex” (the name of Google’s offices in Mountain View) – since it’s just a number and there aren’t any trademarks for their spelling.
* In the grand scheme of things, Sands and Gupta told iDownloadBlog the team is hoping to get a lot users, press, and experience from the project, but doesn’t plan to actually make money.
* “Because we think this could be shut down in the future by Apple, we didn’t see this as a viable business option. In a future iOS update, Apple could easily allow third party commands,” which would make GoogolPlex useless, Sands says. The Four Loop team will continue working together and look for new projects, the team says.
* In terms of security fears:
* In order to reduce load on our remote server and maintain the privacy of users, we only proxy requests from Siri that explicitly begin with “Google Plex.” This is done with a client-side decision making script that reads the request being made and decides whether or not to send the connection through the proxy server. Since the server then only deals with a few requests, and is only proxying a marginal amount of network traffic (kilobytes/a few megabytes) per user, it can easily scale as it is built on EC2 instances. Your network traffic only goes through our proxy server if you explicitly ask Siri for “GoogolPlex.” The final result is privacy for our users and lower server costs for us.​
* You can check out the GoogolPlex website for a look at more commands and sign-up for an account.

