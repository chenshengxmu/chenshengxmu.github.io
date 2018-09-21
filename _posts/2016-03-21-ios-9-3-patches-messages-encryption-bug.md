---
layout: post
title: iOS 9.3 patches a bug that would let attackers decrypt photos and videos sent via iMessage
---
![img](http://media.idownloadblog.com/wp-content/uploads/2016/01/Messages-App-Icon.png)
* A group of Johns Hopkins University researchers led by computer science professor Matthew D. Green has discovered a critical bug in Apple’s stock Messages app for the iPhone, iPod touch and iPad.
* The vulnerability would allow nefarious users to decrypt photos and videos sent over iMessage, but there’s nothing to worry about—iOS 9.3, which we expect to release after today’s Apple event wraps up, contains a patch for this oversight on Apple’s part.
* The way researchers exploited this vulnerability involves mimicking an Apple server to intercept a media file as it’s being transmitted from one device to another through iCloud, via the iMessage protocol.
* The encrypted transmission the team targeted contained a link to the photo stored in iCloud server along with a 64-digit key to decrypt the photo.
* “Although the students could not see the key’s digits, they guessed at them by a repetitive process of changing a digit or a letter in the key and sending it back to the target phone,” read the article.
* If a key was correct, the photo would decrypt and show in the Messages app. They kept changing the encryption key thousands of times until the phone accepted one.
* “Even Apple, with all their skills—and they have terrific cryptographers—wasn’t able to quite get this right,” said Green, who did acknowledge that “strong commercial encryption has left no opening for law enforcement and hackers”
* “It scares me that we’re having this conversation about adding back doors to encryption when we can’t even get basic encryption right,” he said.
* And software bugs are a fact of life, I would add.
* Apple praised Green’s team for bringing this particular bug to their attention, saying through the mouth of its spokesperson that it works “hard to make our software more secure with every release.”
* “We appreciate the team of researchers that identified this bug and brought it to our attention so we could patch the vulnerability. Security requires constant dedication and we’re grateful to have a community of developers and researchers who help us stay ahead,” said Apple.
* Green’s team will post details about the vulnerability after Apple releases the iOS 9.3 software update for the iPhone, iPod touch and iPad, which will fully patch the bug.
* For those wondering: no, this bug won’t make it any easier for the FBI to break into Messages database on an iPhone 5c used by one of the San Bernardino shooters.
* Source: The Washington Post

