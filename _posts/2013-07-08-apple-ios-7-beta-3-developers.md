---
layout: post
title: Apple seeds iOS 7 beta 3 to developers- this is what's new
---
![img](http://media.idownloadblog.com/wp-content/uploads/2013/07/beta-3-ios-7.png)
* As predicted by a report late last month, Apple has seeded iOS 7 beta 3 to developers this morning. The update comes two weeks after Apple posted the second beta to its next-generation mobile operating system, and nearly a month after it released the initial version following its WWDC keynote.
* The third beta is available for compatible iPhones, iPads and iPod touch models, and can be downloaded by visiting the Software Update section in the Settings app of devices that currently have iOS 7 installed. It should be available in the dev portal shortly. You’ll find more details after the fold…
* iOS 7 is nearly a complete departure from its predecessor. We’ve spent the last four weeks taking an in-depth look at many of the changes Apple has made, from stock app UI design to new features, in a number of articles which you can see here. And there were several enhancements made in beta 2.
* We’re currently installing today’s update ourselves, and will be reporting back with any new stuff we find. So keep checking this post throughout the day as we add any changes we spot. And as always, we welcome you to let us know if we missed anything by e-mailing us at tips@idownloadblog.com.
* Today’s iOS 7.0 beta 3 (11A4414e) released to developers expires on Thursday, August 29, 2013 @ 12AM (GMT). #TheMoreYouKnow
* — iH8sn0w (@iH8sn0w) July 8, 2013
* As we continue to dig through the new information in iOS 7 beta 3, we’ll be listing any major changes we find below:
* Thanks to everyone who sent us in tips to help us compile this list!
* And here’s the full changelong from Apple.
* The following issues relate to using iOS SDK 7.0 to develop code.
* AVCaptureSession now uses your app’s AVAudioSession by default.
* Support for Car Display will be provided once compatible systems are available.
* Some high-resolution photos will not sync (via iCloud and other services) when set as a Contact’s Caller ID photo.
* Workaround: Use a lower-resolution photo.
* When the UIViewGroupOpacity key is not present, the default value is now YES. The default was previously NO.
* This means that subviews of a transparent view will first be composited onto that transparent view, then the precomposited subtree will be drawn as a whole onto the background. A NO setting results in less expensive, but also less accurate, compositing: each view in the transparent subtree is composited onto what’s underneath it, according to the parent’s opacity, in the normal painter’s algorithm order.
* See OS X v10.9 Release Notes for more details.
* you won’t be asked to enter your iCloud credentials to disable Activation Lock prior to erasing. After the device is erased, your device will be activation locked.
* Workaround: Delete the iCloud account prior to erasing the device. If in this state, enter your iCloud account credentials to unlock the device.
* If the calls to renderInContext on the layer backing an MKMapView are made off the main thread, they should be eliminated or moved to the main thread. Failure to do so can cause an app crash. Instead of usingrenderInContext, use the new MKMapSnapshotter APIs.
* Many updates to the MCSession APIs are included in this seed. The APIs now function as they were presented at WWDC. Major changes and enhancements include:
* See “WWDC Session 701: Multipeer Connectivity” for more information on these APIs.
* MPMediaPickerController has been disabled for this seed. It will immediately return as if the user canceled the selection.
* If an app uses this method and then attempts to connect, thinking it will get a connection over Wi-Fi, the app may inadvertently end up with a connection over the cellular network. The lack of thekSCNetworkReachabilityFlagsIsWWAN is not a guarantee that your connection will not go over cellular. If your code needs to enforce that a connection not go over cellular, it needs to specify that when making a networking request.
* Instead, for CFNetwork code using CFSocketStream, CFHTTPStream, or similar APIs, set the kCFStreamPropertyNoCellular property to true on the CF object before connecting.
* For NSURLRequests, call [request setAllowsCellularAccess: false].
* In addition to making sure your code will never be connected over cellular because of cellular fallback, this call ensures that your code will never be connected over cellular because of the VPN or convoluted routing problems (connecting to IPv6 over cellular because only IPv4 is available over Wi-Fi, etc.).
* To verify that your app is behaving properly, you should test against a broken Wi-Fi network. The easiest way to set up a broken Wi-Fi network is to set up an Apple AirPort Base Station or other Wi-Fi access point to hand out a DHCP address and leave the access point disconnected from the Internet. Another simple way of testing is to unplug the cable or DSL line from your cable or DLS modem.
* Newsstand background downloads that use HTTP basic or digest authentication will prompt the user with authorization alerts (NSURLConnectionDelegate Protocol callbacks forconnectionShouldUseCredentialStorage and willSendRequestForAuthenticationChallenge are not called correctly).
* Due to changes in how the isa field is implemented, *self may change during enumeration (for example, if the container is retained).
* Workaround: When implementing countByEnumeratingWithState, do not set state->mutationsPtr = self.
* In General > Background App Refresh, the per-app settings are not honored.
* After erasing the device from Settings > General > Reset > Erase All Content & Settings, CrashReporter logs will no longer be copied from the device to the computer.
* Workaround: Restore the device from an IPSW instead of using Erase All Content & Settings on the device.
* This seed includes development versions of new male and female Siri voices for U.S. English and French, and a male voice for German.
* Up through iOS 6, when using TWTweetComposeViewController and SLComposeViewController (the latter only for Twitter and Weibo, but not Facebook), if the caller supplies a completionHandler, the suppliedcompletionHandler is responsible for dismissing the view controller. As of iOS 7, if the app links against the iOS 7 SDK, the view controller will dismiss itself even if the caller supplies a completionHandler. To avoid this, the caller’s completionHandler should not dismiss the view controller.
* When using the iOS 6.1 SDK on OS X v10.8 Mountain Lion, if you use the iOS 5.0 or iOS 5.1 Legacy SDK in iOS Simulator, you will not be able to use Twitter features: attempting to sign in to Twitter via the Settings pane will fail, and Twitter.framework will not work correctly. If you need to test Twitter features, you will need to choose either an iOS 6.1 or iOS 6.0 Simulator run destination, or you can test with iOS 5.x on a device.
* +[AVPlayer playerWithPlayerItem:] returns an AVPlayer object, but the current item will return nil if the player was created on another thread.
* The Wi-Fi sync option in iTunes is checked, but Wi-Fi devices do not appear in iTunes.
* Workaround: On OS X, install the iOS 7.0 SDK after installing iTunes. Wi-Fi sync is not supported on Windows.
* Reminders does not work with VoiceOver.
* Weather conditions are not animated on iPhone 4.
* Let us know down in the comments if you spot other tidbits not mentioned here.

