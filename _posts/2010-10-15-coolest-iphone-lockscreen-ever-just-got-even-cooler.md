---
layout: post
title: Coolest iPhone Lockscreen Ever Just Got Even Cooler
---
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/typophone-weather-current-conditions.png)
* Back in August, Sebastien posted about Typophone 4, a really awesome iPhone lockscreen for jailbroken iPhones, and I’ve been using it ever since.
* Now there’s a modified version created by a fan that includes weather info at the bottom, complete with hi-res images and forecasts. You can choose what cities you want to be able to select from, and you can toggle to view current conditions, today’s forecast, and tomorrow’s forecast. The data is pulled from Yahoo! weather.
* The app comes with only 3 pre-set cities, and it’s a little tricky to change to your own, as it requires using a SSH client. So here’s a walkthrough:
* For information on setting SSH up, follow the links below. There are different programs and ways to SSH but I’ve found these two methods are the easiest. Remember, you SSH and modify settings at your own risk!
* SSH for Windows SSH for Mac
* Once you’re ready to go with SSH, follow these instructions:
* 1) Download and install “Typophone Weather” from Cydia.
* 2) Open your SSH client and navigate to /private/var/stash/Themes.XXXX/Typophone GMT (or Typophone Weather).
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/typophone-weather-file-location-screenshot.png)
* 3) Edit the zip.txt file. You can replace the current zip codes with ones of your own choosing, and you can also put the city name in quotes instead of zip codes. Example: [75370, “New York”, 90210] International cities are supported now, too.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/zip-txt-file-screenshot.png)
* You can have up to 5 cities, or just have one. If you only have one, commas and brackets are not necessary, otherwise leave them intact.
* 4) Save/upload the edited zip.txt file, then open Winterboard and enable the Typophone Weather theme (and disable Typophone 4 if currently selected).
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/typophone-weather-winterboard.png)
* 5) Respring. If you didn’t already have Typophone 4 installed, you will need to also download Lockscreen Clock Hide in Cydia to get rid of the lockscreen clock.
* Now that Typophone Weather is installed, here’s how to select a city and toggle through conditions/forecasts:
* To select one of your new pre-set cities from the lockscreen: Tap the clock or date and it will slide up to reveal the city list. Tap the arrow to right of the city name to scroll through the list of cities you defined in zip.txt. Tap a city to select that city as default. The city name should go bold. Tap the date to slide down.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/typophone-weather-choose-city.png)
* To toggle through current conditions, today’s forecast, and tomorrow’s forecast: Simply tap the weather info. It will scroll back to current conditions once you tap on tomorrow’s forecast.
![img](http://media.idownloadblog.com/wp-content/uploads/2010/10/typophone-weather-tomorrow-forecast.png)
* Pretty sweet, yeah? If you’re obsessed with the weather like me, this is a great complement to Weathericon app, if not an outright replacement.
* What do you readers think of Typophone Weather? Do you think you will use it?

