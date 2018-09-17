---
layout: post
title: How Siri recognizes obscurely named points of interest like local restaurants & businesses
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/07/Apple-Siri-ad-the-rock-teaser-001.jpg)
* Apple Thursday published a new entry on its Machine Learning Journal blog which goes highly technical on Siri’s ability to recognize obscurely-named points of interest on a map, like your local restaurants, businesses and other places.
* “The accuracy of automatic speech recognition systems has improved phenomenally over recent years due to the widespread adoption of deep learning techniques,” notes the post.
* “Performance improvements have, however, mainly been made in the recognition of general speech; whereas accurately recognizing named entities, like small local businesses, has remained a performance bottleneck.”
* Apple has met that challenge by incorporating knowledge of the user’s location into its speech recognition system and so-called geolocation-based language models (Geo-LMs).
* As a result of the combo, Siri is able to better estimate the user’s intended sequence of words.
![img](http://media.idownloadblog.com/wp-content/uploads/2018/08/Siri-geographic-language-models-e1533827566122.png)
* This has reduced Siri’s error rate by between 41.9-48.4% in Boston, Chicago, Los Angeles, Minneapolis, New York, Philadelphia, Seattle and San Francisco, excluding mega-chains.
* In the United States, Apple has one Geo-LM for each of the 169 Combined Statistical Areas that cover about 80 percent of population. There’s also a global Geo-LM that covers all areas which are not defined by the Combined Statistical Areas around the world.
* The combination of location and Geo-LMs lets the system provide customized results in terms of the names of points of interest, or fall back to the global Geo-LM if location is unavailable.
* All you need to know: Siri’s regionally-specific language models for speech recognition make finding local destinations a breeze. The method is language-independent, meaning the expansion of Geo-LM support for other locales besides US English is pretty straightforward.
* Visit Apple’s Machine Learning Journal for more details.

