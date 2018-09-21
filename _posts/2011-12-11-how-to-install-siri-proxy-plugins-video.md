---
layout: post
title: How to Install Siri Proxy Plugins [Video]
---
![img](http://media.idownloadblog.com/wp-content/uploads/2011/12/How-to-Install-Siri-Proxy-Plugins.jpg)
* A couple of days ago we showed you how to install the much talked about Siri Proxy Server. That’s the first step to being able to really do some marvelous things with Apple’s so-called personal assistant.
* The next step is installing the plugins that take advantage of the Siri Proxy. These plugins range from enabling you to tweet on command, start your car, control your television, or query IMDB’s massive movie database.
* In the following tutorial, we show you how easy it is to install Siri Proxy plugins, and we use the IMDB plugin as an example. If you already have Siri Proxy installed, you don’t want to miss this…
* Step 1: Follow our tutorial to install Siri Proxy.
* Step 2: Visit Plamoni’s Git Hub for list of plugins and select a plugin. In this example we use IMDB. I recommend using the IMDB plugin first to follow the example tutorial.
* Step 3 @1:28 In your Ubuntu installation, open the Home/.siriproxy/ folder and open config.yml. Note that .siriproxy folder is a hidden folder, so if you don’t see it go to View > Show Hidden Files while in the Home folder.
* Step 4: @2:28 Paste in the lines of code for the particular plugin you want to install and save the config.yml file. For this example, I used IMDB, so that code will be as follows: - name: 'SiriIMDB' git: 'git://github.com/parm289/SiriProxy-SiriIMDB.git'
* Step 5: @3:18 Open a terminal and paste the following: bin/siriproxy update This will update the siriproxy server and pull in all of the plugin details.
* Step 6: @3:59 Start the Siri Proxy server by pasting in the following in your terminal: rvmsudo siriproxy server
* Step 7: @4:04 Test out Siri by asking it commands specific to your installed plugin. For example, for the IMDB plugin say: “Should I See Cloverfield?” or “Who is in The Island?” It should respond accordingly.
* It really is easy to install Siri Proxy plugins, and a quick Google search can usually result in a nice array of plugins to choose from. Granted, some may be more difficult to configure than others, especially if they require you to configure something else besides Siri Proxy itself, such as a car alarm, etc., but it’s still entirely feasible.
* We hope this tutorial was able to help you out. Let us know how successful you were in getting these plugins working in the comments below.

