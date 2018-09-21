---
layout: post
title: Apple seeds iOS 6 beta 4 to developers
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/08/ios-6-beta-4.jpg)
* Apple has seeded the fourth beta of its new iOS 6 software to developers this morning. The release comes just three weeks after the previous update.
* As usual, the new beta is currently only available as an over-the-air update, but the full version should come up on the iOS developer center soon.
* Update: iOS 6 beta 4 is now available in the dev center, and we have the full change log after the break…
* Accounts Framework
* When requesting access to Facebook accounts, the only key required in your options dictionary is ACFacebookAppIdKey. ACFacebookPermissionGroupKey andACFacebookAppVersionKey are now obsolete.If you request a write permission under ACFacebookPermissionsKey, such as publish_stream, you must provide a value for ACFacebookAudienceKey, which can be one ofACFacebookAudienceEveryone, ACFacebookAudienceFriends, or ACFacebookAudienceOnlyMe.
* Address Book
* FIXED: When an app is in a fresh privacy state and tries to present a ABNewPersonViewController, the user cannot dismiss that view controller properly, even if the user allows access to contacts. The user must force quit the app and relaunch. Requesting access to contacts: Users are able to grant or deny access to contact data on a per-app basis. To request access to contact data, call the ABAddressBookRequestAccessWithCompletionfunction after calling the ABAddressBookCreateWithOptions function. The ABAddressBookRequestAccessWithCompletion function does not block the app while the user is being asked to grant or deny access. Until access has been granted, the ABAddressBookRef object will not contain any contacts, and any attempt to modify contacts fails with a kABOperationNotPermittedByUserError error. The user is prompted only the first time access is requested; any subsequent calls toABAddressBookCreateWithOptions will use the existing permissions. The completion handler is called on an arbitrary queue. If the ABAddressBookRef object is used throughout the app, then all usage must be dispatched to the same queue to use ABAddressBookRef in a thread-safe manner. Checking access authorization status: An app can use the authorization status API to check if it can access contacts, calendars, reminders, or the photo library. This API is independent from the request access API and will not prompt the user to grant or deny access. With this API an app can adjust the display of its UI elements that would access the data class. For example, if access to contacts is authorized or not determined, then a UI button to pick a contact can be displayed. For Address Book, call the ABAddressBookGetAuthorizationStatus function. For Event Kit, call the authorizationStatusForEntityType: class method ofEKEventStore. For Assets Library, call the authorizationStatus class method of ALAssetsLibrary. The meaning of the status values that are returned is as follows: Authorization Status Not Determined—The user has not yet made a choice regarding whether this app can access the data class. Authorization Status Restricted—This app is not authorized to access the data class. The user cannot change this app’s status, possibly due to active restrictions such as parental controls being in place. Authorization Status Denied—The user explicitly denied access to the data class for this app. Authorization Status Authorized—This app is authorized to access the data class.
* Apple TV
* FIXED: In some cases, the screen may show the wrong resolution. Restart your Apple TV to return it to the correct resolution. FIXED: Apple TV may restart while using the Remote app. FIXED: Apple TV may restart when changing the system language. FIXED: Photo Stream does not load when logging in a second time. Restart Apple TV to resolve. Music does not play during photo slideshows. Screen saver may revert to using the default images after installing update.
* Bonjour
* The NSNetService class and CFNetService APIs do not include P2P interfaces by default. To browse, register, or resolve services over P2P interfaces, an app needs to use the Bonjour DNSService*() APIs noted below. Setting the interfaceIndex parameter to kDNSServiceInterfaceIndexAny in the following APIs will not include P2P interfaces by default. To include P2P interfaces, you must now set the kDNSServiceFlagsIncludeP2P flag when using kDNSServiceInterfaceIndexAny or set the interfaceIndex to kDNSServiceInterfaceIndexP2P. The affected APIs are: DNSServiceBrowse DNSServiceRegister DNSServiceResolve DNSServiceRegisterRecord DNSServiceQueryRecord
* Dictionary
* FIXED: There is a known issue with dictionaries when attempting to define a word in any language other than English or Japanese. When the reference library is presented, the user is given the option to download a dictionary—that download may not begin. The user can tap outside the popover on an iPad or tap the Done button on the iPhone or iPod touch to dismiss the download request.
* Event Kit
* Requesting access to calendars or reminders: Users are able to grant or deny access to event and reminder data on a per-app basis. To request access to event and/or reminder data, call therequestAccessToEntityType:completion:: method of EKEventStore. This will not block the app while the user is being asked to grant or deny access. Until access has been granted for an entity type, the event store will not contain any calendars for that entity type and any attempt to save data will fail. The user will be prompted only the first time access is requested; any subsequent instantiations of EKEventStore will use the existing permissions. The completion handler is called on an arbitrary queue.
* Game Center
* FIXED: When creating a new Game Center account in-app on the iPad, the popover for selecting the month of your date of birth shows up with no content to select. The authenticate method of GKLocalPlayer has been removed. Authentication will commence automatically when the completion handler is set. As of iOS 6 beta 4, GKGameCenterViewController singleton is no longer supported. As of iOS 6 beta 4, GKScore+Sharing.h file and associate category are removed.
* iCloud
* When creating an iCloud account, you can use any email-based Apple ID or your existing iCloud account. If you had a MobileMe account that you did not move to iCloud, you can use that Apple ID to sign up for a new iCloud account (none of your previous MobileMe data will be present). icloud.com email addresses are now available for iCloud mail users. Users signing up for new Apple IDs, or enabling Mail on their iCloud account for the first time, will automatically receive an @icloud.com email address instead of a me.com email address. iCloud users with @me.com addresses that have been used with iOS 6 beta 3 or later will receive an @icloud.com email address that matches their @me.com address. icloud.com email cannot be sent from www.icloud.com. Users should use http://beta.icloud.com at this time if they wish to use a web browser to send email from theiricloud.com address. @icloud.com addresses will be added within two weeks of first using iOS 6. Provisioning profiles must be enabled for iCloud in the iOS Provisioning Portal. To enable a provisioning profile for iCloud, navigate to the App ID section of the iOS Provisioning Portal and configure your App ID for iCloud. After enabling the App ID for iCloud, regenerate your provisioning profiles to enable them for iCloud. The setSortDescriptors: method of NSMetadataQuery is not supported. In iOS 6, files that are protected via Data Protection cannot be used with iCloud Storage APIs. Filenames are case-insensitive in OS X but case-sensitive in iOS. This can lead to problems when using iCloud to share files between the two platforms. On iOS, you should take steps to avoid creating files with names that differ only by case. The behavior of coordinated read operations on iCloud Documents has changed:On previous iOS releases, when your app performed a coordinated read operation on a file or package and the iCloud daemon noticed that there was a newer version of the item available, the coordinated read operation blocked until the newer version of the item was downloaded and written to the disk.As of iOS 6 beta 3, when you start a coordinated read operation on a file or package for which you already have a local version, the coordinated read will be granted as soon as possible, and the new version, if any, will download in the background. This call will block for downloading reasons only if you do not have any version of the file available locally. Additionally, when the file is conflicted, the iCloud daemon will not wait until it has all the conflict losers of the file available to make the file available to your app. It will make the different versions of the conflicted file available as soon as it can. Your app can use the existing file coordination and the UIDocument callbacks to be notified when the conflict losers have been downloaded and are available.
* iTunes
* iTunes 10.6.3 is required for iOS SDK 6.0. Previous public betas of iOS can no longer download iTunes Match songs. Location In iOS 6 beta 4, modifications were introduced to the new enum CLActivityType in Core Location: Replace CLActivityTypeVehicularNavigation with CLActivityTypeAutomotiveNavigation. Add CLActivityTypeOtherNavigation for other vehicular navigation—e.g., boats, trains, or planes.
* Maps
* In iOS 6 and later, Map Kit is built on a new infrastructure hosted by Apple. Earlier iOS releases will continue to use Google’s service. API compatibility will be maintained (see known issues below). Maps are now supported in Simulator. Map data will continue to evolve—only a limited amount of high-resolution satellite imagery is currently available. Routing apps that do not specify a coverage file during development will always be displayed in the Maps routing search results. Testing and debugging of coverage files for routing apps is only supported during development through the Xcode Run workflow. (You can specify the coverage file for a given Run scheme using the Options pane of the Run section of the scheme editor.) Apps that are archived and distributed (outside of the App Store) onto devices will not have access to the app’s coverage files. FIXED: Maps does not zoom into the current location when launched from a third-party app.
* Newsstand
* FIXED: Only simple HTTP downloads will work with Newsstand.
* Passbook
* The Description field is now a required field for a Pass. All passes created without it will fail to validate and will not ingest. Passbook in Simulator no longer requires https/ssl when using a webServiceURL when ingesting a pass. FIXED: Unable to show boarding passes on lock screen. Passes will no longer fall back to background.png if strip.png is not included in your pass bundle. The contents of the userInfo dictionary for PKPassLibraryDidChangeNotification have changed in the case of removed passes. Please consult the latest documentation for the new userInfo dictionary.
* Security
* In iOS 5, signing a certificate with an MD5 signature is not supported. Please ensure that certificates use signature algorithms based on SHA1 or SHA2. In iOS 6, there are improved privacy controls for Calendar, Reminders, Contacts, and Photos. Users will see access dialogs when an app tries to access any of those data types. The user can switch access on and off in Settings > Privacy. Developers can set a “purpose” string for each class of isolated data. iOS displays this string to users to help them understand why their data is being requested. These strings can be added using Xcode’s Project editor, which is in the Info tab. The relevant key names begin with the string “Privacy -”. There are changes to the Event Kit and Address Book frameworks to help developers with this feature.
* Simulator
* FIXED: The app delete confirmation alert panel takes a while to show up in iOS Simulator. No privacy alerts are displayed in iOS Simulator for apps that access Photos, Contacts, Calendar, and
* Reminders
* Downloading In-App Purchase hosted content in iOS Simulator is not supported. When attempting to play an MP3 sound in Simulator, you will hear a popping sound instead.
* Shared Photo Stream
* Users must go to Settings > iCloud to ensure that they receive Shared Photo Stream Notifications. In order to share a Photo Stream with iOS 6 beta, you must invite someone using his iCloud email address; otherwise, he will not receive the invitation. Upgrading from iOS 6 beta 1 to beta 2 will cause your device to redownload all of your Shared Photo Streams. The Shared Photo Stream feature is set to OFF when updating from iOS 6 beta 1 to a later release. The default setting should be ON. FIXED: Turning off Shared Photo Streams may leave Camera in an unresponsive state; force quitting the Camera app will resolve this issue.
* Social
* Weibo shows up in the Settings app only if a Chinese keyboard is enabled. The requestAccessToAccountsWithType:withCompletionHandler: method of ACAccountStore is now deprecated. To access user accounts, please use therequestAccessToAccountsWithType:options:completion: method.In the options parameter of this new method, pass nil to access Twitter and Weibo accounts. To access Facebook accounts, pass a dictionary with the following keys (which are documented in ACAccountStore.h): ACFacebookAppIdKey ACFacebookPermissionsKey You should no longer add this dictionary to your app’s Info.plist file, as was required in beta 1. When requesting access to Facebook accounts, the only key required in your options dictionary is ACFacebookAppIdKey. ACFacebookPermissionGroupKey andACFacebookAppVersionKey are now obsolete.If you request a write permission under ACFacebookPermissionsKey—such as publish_stream—you must provide a value for ACFacebookAudienceKey, which can be one ofACFacebookAudienceEveryone, ACFacebookAudienceFriends, or ACFacebookAudienceOnlyMe.
* Status Bar
* It is now possible to set status bar tint parameters in your app’s Info.plist file. You might do this to ensure that the status bar color matches your app’s navigation bar color during startup. To set the status bar tint, add the UIStatusBarTintParameters key to your Info.plist file. The value of this key is a dictionary with the appropriate values describing the navigation bar your app has at startup. Inside the dictionary should be the UINavigationBar key, which has a value that is also a dictionary. That dictionary contains the initial navigation bar’s style (with the Style key) and whether it is translucent (with the Translucent key). If your navigation bar uses them, you can also specify its tint color (with the TintColor key) or the name of its custom background image (with the BackgroundImage key).
* UIKit
* In iOS 5.1, the UISplitViewController class adopts the sliding presentation style when presenting the left view (previously seen only in Mail). This style is used when presentation is initiated either by the existing bar button item provided by the delegate methods or by a swipe gesture within the right view. No additional API adoption is required to obtain this behavior, and all existing APIs—including that of the UIPopoverController instance provided by the delegate—will continue to work as before. If the gesture would be insupportable in your app, setting the presentsWithGesture property of your split view controller to NO disables the gesture. However, disabling the gesture is discouraged because its use preserves a consistent user experience across all apps. FIXED: In iOS 6, changes have been introduced so that you no longer need to set a delegate and implement a method for Single-Finger and Single-Tap gesture recognizers. This makes them work well with the UIControl objects. In iOS 6 and later, the UIWebView class paints its contents asynchronously. Autorotation is changing in iOS 6. In iOS 6, the shouldAutorotateToInterfaceOrientation: method of UIViewController is deprecated. In its place, you should use thesupportedInterfaceOrientationsForWindow: and shouldAutorotate methods. More responsibility is moving to the app and the app delegate. Now, iOS containers (such as UINavigationController) do not consult their children to determine whether they should autorotate. By default, an app and a view controller’s supported interface orientations are set to UIInterfaceOrientationMaskAll for the iPad idiom andUIInterfaceOrientationMaskAllButUpsideDown for the iPhone idiom. A view controller’s supported interface orientations can change over time—even an app’s supported interface orientations can change over time. The system asks the top-most full-screen view controller (typically the root view controller) for its supported interface orientations whenever the device rotates or whenever a view controller is presented with the full-screen modal presentation style. Moreover, the supported orientations are retrieved only if this view controller returns YES from its shouldAutorotate method. The system intersects the view controller’s supported orientations with the app’s supported orientations (as determined by the Info.plist file or the app delegate’sapplication:supportedInterfaceOrientationsForWindow: method) to determine whether to rotate. The system determines whether an orientation is supported by intersecting the value returned by the app’s supportedInterfaceOrientationsForWindow: method with the value returned by the supportedInterfaceOrientations method of the top-most full-screen controller. The setStatusBarOrientation:animated: method is not deprecated outright. However, it now works only if the supportedInterfaceOrientations method of the top-most full-screen view controller returns 0. This puts the responsibility of ensuring that the status bar orientation is consistent into the hands of the caller. For compatibility, view controllers that still implement the shouldAutorotateToInterfaceOrientation: method do not get the new autorotation behaviors. (In other words, they do not fall back to using the app, app delegate, or Info.plist file to determine the supported orientations.) Instead, theshouldAutorotateToInterfaceOrientation: method is used to synthesize the information that would be returned by the supportedInterfaceOrientations method. The willRotateToInterfaceOrientation:duration:, willAnimateRotationToInterfaceOrientation:duration:, and didRotateFromInterfaceOrientation: methods are no longer called on any view controller that makes a full-screen presentation over itself—for example, by calling presentViewController:animated:completion:. You should make sure that your apps are not using these methods to manage the layout of any subviews. Instead, they should use the view controller’sviewWillLayoutSubviews method and adjust the layout using the view’s bounds rectangle. In iOS 6, the viewWillUnload and viewDidUnload methods of UIViewController are now deprecated. If you were using these methods to release data, use thedidReceiveMemoryWarning method instead. You can also use this method to release references to the view controller’s view if it is not being used. You would need to test that the view is not in a window before doing this. It is unsupported to set values for the shadowOffset or shadowColor properties of a UILabel object if its attributedText property contains a valid attributed string. Instead, use the NSShadowAttributeName attribute of the attributed string to set the shadow. Due to compatibility concerns, the NSBaselineOffsetAttributeName attribute is no longer supported in iOS 6. The NSTextAlignmentNatural value is unsupported and will throw an exception when used with the textAlignment property of UILabel or supplied as the alignment parameter to the drawInRect:withFont:lineBreakMode:alignment: method of NSString. The setContentStretch: method of UIView has been deprecated in this beta release. To achieve the same effect, use the resizableImageWithCapInsets: method of UIImageand display the image with a UIImageView. The resizableImageWithCapInsets: method of UIImage effectively resizes images by tiling. As a performance optimization, it uses stretching rather than tiling when the user would not be able to tell the difference, such as when a single column or row is being stretched. But in certain circumstances, the user might want to actually stretch some region of an image. In iOS 6, the resizableImageWithCapInsets:resizingMode: method allows the caller to specify a tiling or stretching resizing mode. The UICollectionViewLayout class has changed: The class now supports the customization of the animations created during rotation. The names of methods for customizing insert and delete animations have also changed, so the same hooks can be used for rotations as well as for insertions and deletions. The class has changed some method names. Specifically, decoration views are no longer referred to by “reuse identifier” but rather by “element kind.” Apps that are using decoration views will need to modify their code and rebuild to accommodate this. The bottom edge of a UILabel view is now different from its baseline.Previously, auto layout was interpreting the bottom of a UILabel to be the same as its baseline. While convenient in many cases, it caused problems if you wanted to place the top edge of one label against the bottom edge of another. In such a scenario, the bottom label would overlap the top one, and descenders from the top label could crash into ascenders from the bottom label. Now, auto layout interprets UILayoutAttributeBottom as the bottom of the text box (presuming the label is not bigger than its intrinsic content size) andUILayoutAttributeBaseline as the baseline of the text. If you have already created code for laying out labels according to the bottom or center point, your text will move around a little and you will need to adjust your constraints. Apps with table views in their nib or storyboard files, and that were built using previous versions of iOS 6 beta, will require a clean build with beta 3 and newer. Here are some notes regarding auto layout support for UIScrollView: In general, auto layout considers the top, left, bottom, and right edges of a view to be the visible edges. That is, if you pin a view to the left edge of its superview, you’re really pinning it to the minimum x-value of the superview’s bounds. Changing the bounds origin of the superview does not change the position of the view. The UIScrollView class scrolls its content by changing the origin of its bounds. To make this work with auto layout, the meaning of the top, left, bottom, and right edgeswithin a scroll view now mean the edges of its content view. The constraints on the subviews of the scroll view must result in a size to fill, which is then interpreted as the content size of the scroll view. (This should not be confused with the intrinsicContentSize method used for auto layout.) To size the scroll view’s frame with auto layout, constraints must either be explicit regarding the width and height of the scroll view, or the edges of the scroll view must be tied to views outside of its subtree. Note that you can make a subview of the scroll view appear to float (not scroll) over the other scrolling content by creating constraints between the view and a view outside the scroll view’s subtree, such as the scroll view’s superview. Here are some examples of how to configure the scroll view: Mixed approach: Position and size your scroll view with constraints external to the scroll view—that is, the translatesAutoresizingMaskIntoConstraints property is set to NO. Create a plain UIView content view for your scroll view that will be the size that you want your content to have. Make it a subview of the scroll view but let it continue to translate the autoresizing mask into constraints: UIView *contentView = [[UIView alloc] initWithFrame:CGRectMake(0,0,contentWidth,contentHeight)]; [scrollView addSubview:contentView]; // DON’T change contentView’s translatesAutoresizingMaskIntoConstraints, // which defaults to YES; Set the content size of the scroll view to match the size of the content view: [scrollView setContentSize:CGMakeSize(contentWidth,contentHeight)]; Create the views you want to put inside the content view and configure their constraints so as to position them within the content view.Alternatively, you can create a view subtree to go in the scroll view, set up your constraints, and call the systemLayoutSizeFittingSize: method (with theUILayoutFittingCompressedSize option) to find the size you want to use for your content view and the contentSize property of the scroll view. Pure auto layout approach: In this case, translatesAutoresizingMaskIntoConstraints must be set to NO on all views involved. Position and size your scroll view with constraints external to the scroll view. Use constraints to lay out the subviews within the scroll view, being sure that the constraints tie to all four edges of the scroll view and do not rely on the scroll view to get their size.A simple example would be a large image view, which has an intrinsic content size derived from the size of the image. In the viewDidLoad method of your view controller, you would include code like the following: UIScrollView *scrollView = [[UIScrollView alloc] init]; UIImageView *imageView = [[UIImageView alloc] init]; [imageView setImage:[UIImage imageNamed:”MyReallyBigImage”]]; [self.view addSubview:scrollView]; [scrollView addSubview:imageView]; scrollView.translatesAutoresizingMaskIntoConstraints = NO; imageView.translatesAutoresizingMaskIntoConstraints = NO; NSDictionary *viewsDictionary = NSDictionaryOfVariableBindings(scrollView,imageView); [self.view addConstraints:[NSLayoutConstraint constraintsWithVisualFormat:@”H:|[scrollView]|” options:0 metrics: 0 viewsDictionary:viewsDictionary]]; [self.view addConstraints:[NSLayoutConstraint constraintsWithVisualFormat:@”V:|[scrollView]|” options:0 metrics: 0 viewsDictionary:viewsDictionary]]; [scrollView addConstraints:[NSLayoutConstraint constraintsWithVisualFormat:@”H:|[imageView]|” options:0 metrics: 0 viewsDictionary:viewsDictionary]]; [scrollView addConstraints:[NSLayoutConstraint constraintsWithVisualFormat:@”V:|[imageView]|” options:0 metrics: 0 viewsDictionary:viewsDictionary]]; This would give you a scroll view that resized as the view controller’s view resized (such as on device rotation), and the image view would be a scrolling subview. You don’t have to set the content size of the scroll view. Given this view hierarchy: ContainerView | OddHeightView | | EvenHeightView | OtherFixedHeightView and these constraints: EvenHeightView.centerY == OddHeightView.centerY EvenHeightView.bottom (or baseline) == OtherFixedHeightView.bottom (or baseline) OtherFixedHeightView.top == ContainerView.top + <space> in iOS 6 beta 4, on non-Retina display devices, the bottoms (or baselines) of the EvenHeightView and the OtherFixedHeightView were off by one pixel and the developer could do nothing about it. This issue is now fixed. Before the changes, the layout engine did not integralize the position variables for the views, and these constraints were always satisfiable: ContainerView | OddWidthView | EvenWidthView OddWidthView.centerX == ContainerView.centerX EvenWidthView.centerX == ContainerView.centerX EvenWidthView.centerX == OddWidthView.centerX Now, the layout engine is integralizing the position variables (x and y) as well as dimension variables (width and height). This means that it will try to satisfy the three constraints with an integer solution, which might not be possible, and thus will log that these constraints are unsatisfiable. In this case, and in all analogous cases, developers just need to remove the redundant constraint (or constraints). In the example above, removing any one of the three constraints will resolve the issue. In iOS 6 beta 4, there is a known bug that when you have a constraint with one item that is a scroll view, the other item is a descendant of that scroll view, and you add the constraint to an ancestor of that scroll view, then the constraint might stop working properly. The workaround is to add such constraints only to the scroll view itself, not to any old ancestor.
* Safari and WebKit
* WebKit on iOS now supports the requestAnimationFrame and cancelAnimationFrame methods in JavaScript, as described here: http://www.w3.org/TR/animation-timing/. Note that because the specification is still at the Working Draft state, these methods have the webkit prefix, so they are window.webkitRequestAnimationFrame andwindow.webkitCancelAnimationFrame. The default app cache quota has increased from 5 MB to 25 MB. The JPEG subsampling threshold has increased from 2 MP (megapixels) to 5 MP on all supported hardware except iPhone 3GS and iPod touch (4th generation). Support has been added for <input type=”file”> tags in web forms. Users can upload existing photos and videos from their photo library or take a picture or video using the camera. Previously, this form control was always disabled. With Safari 6.0 on OS X, developers can now use the Web Inspector (web development tool) with attached iOS devices and iOS Simulator. Developers can use the Web Inspector to debug Safari and the UIWebView class in their own apps built and run from Xcode. This replaces the Debug Console banner in Safari. In iOS 6 and later, web data (SQL Web Storage and LocalStorage) from a UIWebView object can be stored in a directory that will be backed up. To enable backing up this data, set theWebKitStoreWebDataForBackup key to YES in your app’s user defaults. This should be done only if your app relies on web content data that cannot be reloaded. If yourUIWebView object opens links to arbitrary web content, this key should be set to NO. Toggling the value of this key will not preserve existing web view data. In iOS 6 and later, Safari no longer registers for the common feed: RSS/ATOM scheme. Apps that can view those types of feeds are encouraged to register for that URL scheme. WebKit no longer always creates hardware-accelerated layers for elements with the -webkit-transform: preserve-3d option. Authors should stop using this option as a way to get hardware acceleration. Experimental CSS3 Flexbox support will be disabled. Please switch from using -webkit-flexbox and -webkit-inline-flexbox to -webkit-box and -webkit-inline-box. As of iOS 6, embedded YouTube URLs in the form of http://www.youtube.com/watch?v=oHg5SJYRHA0 will no longer work. These URLs are for viewing the video on the YouTube site, not for embedding in web pages. Instead, the format that should be used is described here: https://developers.google.com/youtube/player_parameters. In iOS 6, the keyboardDisplayRequiresUserAction property was added to the UIWebView class. The property defaults to YES, which means that calling focus() on a form element will not bring up the keyboard. By changing the property to NO, a JavaScript call to focus() on a form element will focus the element and bring up the keyboard automatically. As of iOS 6, calling focus() on a form element in a web app will focus the element.
* Did you get all of that? We’ll be keeping our eyes peeled for any significant new features or changes in iOS 6 beta 4, and we’ll let you know as soon as we find something.
* Until then, be sure to let us know if you find anything in the update down the comments section.
