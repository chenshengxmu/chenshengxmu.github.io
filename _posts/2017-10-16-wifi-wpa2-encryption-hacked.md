---
layout: post
title: Major flaws in WPA2 encryption put virtually every Wi-Fi device at risk
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/02/TimeCapsule-front-turned-on-Wi-Fi-icon.jpg)
* Several key vulnerabilities that have been discovered recently in the Wi-Fi standard put just about every router, smartphone and computer out there at risk of having users’ personal information intercepted, exposed and stolen.
* That’s because Wi-Fi’s WPA2 encryption has been cracked, as first reported by ArsTechnica. WPA2 is the popular authentication scheme used to protect personal and enterprise Wi-Fi networks. WPA1 is also affected.
* UPDATE: Apple’s latest OS betas include fixes for the new Wi-Fi vulnerabilities. Apple’s AirPort wireless appliances won’t receive a firmware update because they are not susceptible to these attacks.
* Security researchers Mathy Vanhoef and Frank Piessens of KU Leuven University have been credited with finding the crucial flaws in the Wi-Fi standard itself and not specific products.
* Dubbed “Key Reinstallation Attacks” and “Krack Attacks”, they let attackers eavesdrop on all traffic over public and private Wi-Fi networks, even those protected with the WPA2 encryption.
* “If your device supports Wi-Fi, it is most likely affected,” say researchers.
* In response to these obviously dangerous exploits, The United States Computer Emergency Readiness Team issued the following warning:
* US-CERT has become aware of several key management vulnerabilities in the 4-way handshake of the Wi-Fi Protected Access II (WPA2) security protocol. The impact of exploiting these vulnerabilities includes decryption, packet replay, TCP connection hijacking, HTTP content injection and others.
* Note that as protocol-level issues, most or all correct implementations of the standard will be affected. The CERT/CC and the reporting researcher KU Leuven, will be publicly disclosing these vulnerabilities on 16 October 2017.
* It’s unclear if the flaws are currently being exploited in the wild.
* Attacks against Linux and Android 6.0+ may be particularly damaging, with 41 percent of all Android devices vulnerable to an “exceptionally devastating” variant of the Wi-Fi attack.
* Google is aware of the issue and will be patching any affected devices “in the coming weeks.” iPhone, iPad and Mac devices are at risk, too.
* Hackers can perform a man-in-the-middle attack by forcing certain implementations of the WPA2 encryption to reuse the same key combination multiple times.
* An attacker would make a carbon copy of a WPA2-protected Wi-Fi network, impersonate the MAC address and change the Wi-Fi channel. Taking advantage of a flaw in the handshake method, a device can be forced to bypass the original network and connect to the rogue one.
* While Wi-Fi passwords or secret keys cannot be obtained using this method, hackers can still eavesdrop on traffic and, in some cases, force a connection to bypass HTTPS in order to expose usernames, passwords and other critical data.
* A properly configured HTTPS site isn’t prone to these attacks, but researchers say that a “significant fraction” of HTTPS sites are poorly set up. Macs, iPhones and iPads are affected to a lesser extent because it’s harder to decrypt all packets on those platforms.
* Still “a large number of packets can nevertheless be decrypted,” say the researchers.
* Users are advised to update their router firmware and all client devices to the latest security fixes and continue using WPA2. Researchers state that “it might be that your router does not require security updates,” but I’m definitely going to check that with my router vendor.

