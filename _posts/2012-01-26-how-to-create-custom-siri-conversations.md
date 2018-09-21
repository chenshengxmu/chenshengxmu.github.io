---
layout: post
title: How to Create Your Own Custom Siri Conversations
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/01/Custom-Siri-Responses.jpg)
* By now you’ve probably heard of AssistantExtensions — the awesome Siri tweak for jailbroken iPhone 4S’ that allows for a seemingly endless amount of customization to the personal assistant.
* It’s an amazing tweak in itself, and will likely garner numerous extensions and plugins to make it even more awesome than it currently is. But did you know that with the help of this tweak you can start creating your own custom conversations with Siri now?
* Inside, we’ll show you how to do just that; it’s not difficult, just follow a few easy steps.
* Step 1: Install AssistantExtensions on your jailbroken device running Siri.
* Step 2: Copy the following template to a text file. On a Mac you can just use TextEdit, or Notepad on Windows. Save the file with the aiml extension. e.g. idb.aiml.
* Step 3: SSH to your device, and copy your .aiml file to /Library/AssistantExtensions/aiml/ directory.
* Step 4: Invoke Siri and say “Let’s Chat” Siri will then upload the contents of the aiml files contained within that directory into memory. After it finishes loading, you can ask your custom question and get a custom response.
* Obviously this is a very rudimentary example for demonstrative purposes. If you want some more complex examples, head over to your /Library/AssistantExtensions/aiml/ directory on your device, and copy one of the other .aiml files to your desktop. This will allow you to see all of the valid tags, and methods to make your Siri conversations even deeper.
* AIML stands for Artificial Intelligence Markup Language, an XML compliant language used to converse with software agents like Siri and others.
* If you create any cool custom siri conversations, we urge you to upload them to YouTube and share in the comments. This should be interesting, will you give it a shot?

