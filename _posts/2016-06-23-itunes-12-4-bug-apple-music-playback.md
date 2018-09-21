---
layout: post
title: iTunes 12.4 bug causing Apple Music playback issues with tracks shorter than 60 seconds
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/05/itunes-12.4-header.png)
* There seems to be a bug in iTunes 12.4 which causes playback issues with Apple Music tracks shorter than 60 seconds, MacRumors reported today.
* The problem allegedly stems from a buffering bug that apparently causes iTunes to never begin downloading the next song in the queue if it’s shorter than 60 seconds. Basically, iTunes is left waiting for a download to finish that has in fact never started. The bug has been reported to Apple and we expect it to be fixed in a future iTunes update.
* MacRumors was able to reproduce the issue on Macs running OS X 10.11.5 and iTunes 12.4.1. The bug does not affect locally stored tracks and albums, only streamed songs.
* The publication cites its forum member who, after monitoring iTunes network activity, suspected that the issue might be caused by a bug in how Apple Music handles buffering. When the current song is a minute from the end, iTunes starts downloading the next Apple Music track so that it’s ready to play when the current song is over.
* “However, when the song is less than a minute long the next song’s download is never initiated, apparently because some ‘one minute remaining’ event is never triggered’”, explains the poster.
* This issue is not reproducible in macOS Sierra or iOS 9.3.2.
* Have you been plagued with this bug?
* Source: MacRumors

