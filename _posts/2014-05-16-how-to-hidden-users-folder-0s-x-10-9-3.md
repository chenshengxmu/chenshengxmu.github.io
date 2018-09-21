---
layout: post
title: How to fix disappearing /Users folder in OS X 10.9.3
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/06/OS-X-Mavericks-logo-full-size.jpg)
* Apple yesterday released the OS X Mavericks 10.9.3 Software Update and some of the people who have installed it reported that their /Users folder has seemingly disappeared from the Finder.
* The /Users folder is located at the top level of your hard drive and holds sub-folders for specific user accounts so some feared 10.9.3 has messed up their system. Turns out the folder is there, it’s just hidden and here’s how to unhide it…
* Kirk McElhearn points us to a tweet by Twitter user Jan who suggested a simple solution that involves a single command in Terminal.
* 1) On your Mac, launch Terminal directly from the Finder’s /Applications/Utilities folder or by clicking the Spotlight icon in your Mac’s menu bar and typing ‘terminal’ into the search field. A contextual menu will populate with matching entries, so go ahead and click on Terminal at the top of the list.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/Spotlight-Terminal-entry.png)
* 2) Type the following into the Terminal window and hit Enter.
* sudo chflags nohidden /Users
* You will need to provide your administrator password.
* That’s all there is to it, really. The above Terminal command will permanently change the /Users folder’s hidden status.
* If for some reason you want the folder hidden but need to access it from time to time, you can unhide it temporarily using the following trick, via Dave Mark of The Loop.
* 1) Open a Finder window and choose Go To Folder… from the Go menu. Alternatively, hit the Shift-Command-G combo on your keyboard. This will bring up the following window.
![img](http://media.idownloadblog.com/wp-content/uploads/2014/05/Finder-Go-command-Mac-screenshot-001.png)
* 2) Type /Users into the field and hit the Go button. This will open the hidden /Users folder in Finder.
* Note that the above solution is not permanent so you’ll need to repeat the process each time you wish to reopen the folder after closing its window.
* If this is too cumbersome a solution, Mark proposes creating an alias for quick access even when the /Users folder is hidden:
* After manually navigating to the hidden folder, control-click on the /Users folder and select Make Alias from the contextual menu that appears. Though the /Users folder will become hidden again when you close your Finder window, the alias will stick around.
* Chris Breen of MacWorld offers another solution involving creating an AppleScript that runs the aforementioned Terminal command. You must then save the script as an application to run at login.
* I won’t explain the multi-step process in this article. If you’re willing to try out Breen’s trick, head over to MacWorld.
* It’s not entirely clear whether the 10.9.3 update intentionally hides the /Users folder or if it’s a glitch that would get fixed in a future maintenance update. My two cents: it’s a bug because it seems to affect only a subset of customers who have applied yesterday’s 10.9.3 update.
* MacObserver claims the issue stems from the iTunes 11.2 + Find My Mac combo, not 10.9.3.
* Turns out that hidden /Users folder has nothing to do with OS X 10.9.3. Your /Users and /Users/Shared folders will be hidden by OS X upon every reboot of your Mac if you have updated to iTunes 11.2 and have Find My Mac enabled.
* The author goes on to claim that this isn’t unique to 10.9.3 and will still happen in 10.9.2.
* Because 10.9.3 hides the folder at each reboot, the Terminal command alone will only fix things until the next restart. To have the folder stay visible after each reboot, disable the Find My Mac feature under the iCloud pane of System Preferences and run the aforementioned Terminal command.
* For what it’s worth, OS X Lion similarly hid the /Library folder to eschew less experienced users from messing with it and breaking their system unintentionally.
* @davehamilton Called Apple about this, and was told it was intended behavior.
* — mlaundrie (@mlaundrie) May 16, 2014
* If Apple indeed hid the folder on purpose, the move could be interpreted as another step toward the company’s goal of gradually hiding important system files from users.
* And what’s your experience with 10.9.3 so far?
* Is your /Users folder intact or hidden?

