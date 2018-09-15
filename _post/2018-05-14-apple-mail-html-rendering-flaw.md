---
layout: post
title: HTML rendering flaw in Apple Mail can reveal encrypted emails in plain text
---
![img](http://media.idownloadblog.com/wp-content/uploads/2018/01/iOS-11-Mail-001.png)
* HTML rendering flaws discovered in Apple Mail for iOS and macOS were detailed this morning, allowing unscrupulous attackers to derive decrypted plain text from your encrypted emails.
* Computer security professor Sebastian Schinzel yesterday published a research paper on this vulnerability dubbed EFAIL.
* In a nutshell, this vulnerability permits an attacker to reveal the plaintext of someone’s encrypted emails without needing the sender’s private encryption keys, including encrypted emails sent in the past. In order for the attack to work, a nefarious party must be in possession of your encrypted S/MIME or PGP emails.
* It involves using a specially crafted image tag along with a string of encrypted text. The combination causes Apple Mail for iOS and macOS to decrypt contents of encrypted messages. Opening an encrypted email prompts the client to load the specified image from a domain controlled by an attacker, which lets them obtain copies of decrypted messages.
* This issue also affects users of Mozilla’s Thunderbird email client.
* Benjamin Mayo discusses potential ramifications of this flaw:
* The attack relies on contacting the same person that sent the encrypted email in the first place. It’s not possible to email someone out of the blue and have a server receive a stream of decrypted content. The potential for compromised communications increases if the email is part of a group conversation as the attacker only needs to target one person in the chain to pull off the decryption.
* In addition to the HTML rendering issue, the researchers also posted a more technical exploit of the S/MIME standard specification itself which affects twenty-something clients in addition to Apple’s. Long term, comprehensively patching this particular vulnerability will require an update to the underlying email encryption standards.
* The Electronic Frontier Foundation weighed in, saying:
* EFF has been in communication with the research team, and can confirm that these vulnerabilities pose an immediate risk to those using these tools for email communication, including the potential exposure of the contents of past messages.
* This bug only affects people who use PGP/GPG and S/MIME email encryption software that makes messages unreadable without an encryption key. Business users often rely on encryption to prevent eavesdropping on their email communications.
* Most email is sent unencrypted, however.
* A temporary fix: remove the GPGTools/GPGMail encryption plugin from Apple’s Mail on macOS (trash the GPGMail.mailbundle from /Library/Mail/Bundles or ~/Library/Mail/Bundles).
* As a more extreme measure, disable  emote content fetching: toggle “Load remote content in messages” in Mail for macOS preferences and Load Remote Images in Mail for iOS.
* Apple is likely to issue an emergency fix for this serious flaw so stay tuned and watch this space as we promise to keep you in the loop.
* In the meantime, let us know what you think about this newly discovered vulnerability in Apple Mail and other email clients by leaving a comment below.

