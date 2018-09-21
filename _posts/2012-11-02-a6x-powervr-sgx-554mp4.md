---
layout: post
title: 4th gen iPads A6X chip runs quad-core PowerVR SGX 554MP4 graphics
---
![img](http://media.idownloadblog.com/wp-content/uploads/2012/10/Apple_A6X_chip.jpeg)
* Apple introduced the new A6X with the fourth-generation iPad on October 23. It’s an improved version of the A6 silicon powering the iPhone 5 by increasing clock frequency for the CPU (1.5GHz) and GPU (500MHz) part in order to achieve Apple’s claim of twice the CPU and GPU performance.
* Though the A6X still runs two ARM Cortex-A15 cores with a heavily customized, Apple’s own ARMv7 based processor design (called Swift), the company has improved graphics performance compared to the A6’s three PowerVR-based GPU cores by moving to a newer GPU core: the PowerVR SGX 554 from UK’s fabless semiconductor maker Imagination Technologies, where Apple has an ownership stake…
* AnandTech analyzed benchamrks performed by Kishonti Informatics and concluded that Imagination Technologies’ quad-core PowerVR SGX 554MP4 graphics powers the A6X package, itself fabbed on Samsung’s 32-nanometer process.
* The A5X package found inside the original and now phased-out iPad 3 model had two ARM Cortex A9 cores running at 1GHz paired with four PowerVR SGX 543 cores running at 250MHz.
* The A6X retains the 128-bit wide memory interface of the A5X (and it keeps the memory controller interface adjacent to the GPU cores and not the CPU cores as is the case in the A5/A6). It also integrates two of Apple’s new Swift cores running at up to 1.4GHz (a slight increase from the 1.3GHz cores in the iPhone 5’s A6). The big news today is what happens on the GPU side.
* Imagination provides little data about the 554 but Chipworks was able to determine that “each GPU core is sub-divided into 9 sub-cores: 2 sets of 4 identical sub-cores plus a central core”.
* Because of this doubling of the per-core count (two sets of four identical sub-cores plus a central core) and the increase in clock frequency, the A6X fares substantially better in GLBenchmark than its A5X counterpart, fulfilling Apple’s “twice as much” performance claim.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/11/A6X-graphics-performance-AnandTech-001.jpg)
* Summing up, AnandTech speculates the A6X packs in enough power to deliver graphics-intensive games in the native iPad Retina resolution, something you don’t see very often today for the reasons I explained back in May. “For less compute bound workloads the new iPad still boasts a 53% performance boost over the previous generation”, the author writes.
* Chipworks noted that the A6 package is a full 30 percent larger (123mm2 versus 94mm2 for the A5X), with much of that extra area used for the GPU cores (four inside the A6X versus three for the A5X).
* More notable is that each of these GPU cores is much larger.On the A6X each GPU core is 8.7mm2 while the A6 GPU cores are only 5.4mm2. The overall area occupied by the A6X GPU cores is more than double that of the A6!
* Here’s the so-called floorplan of the A6X system-on-a-chip.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/11/A6X-floorplan-Chipworks-001.jpg)
* And this is a view of the A5X chip. Notice three GPU cores instead of four.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/03/Chipworks-A5X-floorplan-001.jpg)
* Chipworks also found double the SDRAM interface width, allowing for greater graphics processing power.
* I’m certainly glad that Apple continues to push the envelope in terms of mobile GPU performance. iOS devices are famous for their smooth, hardware-accelerated user interface and gaming performance, which is directly dependent on the underlying GPU technology.
* This especially matters as graphics giant Nvidia is making waves with the Tegra 3 processor that powers many competing smartphones and tablets, like Google’s own Nexus 7, Microsoft’s Surface RT and HTC’s One X and X+. In the long haul, however, I see a performance gap emerging between Apple’s chips and those based on Nvidia technology.
* Unless Apple switches its graphics provider, Nvidia could overtake iOS devices in both graphics performance and quality. Nvidia chips use shader-based graphics, which gives you juicer lightning effects in games and more complex 3D objects compared to tile-based rendering that PowerVR technologies uses.
![img](http://media.idownloadblog.com/wp-content/uploads/2012/11/Nvidia-Tegra-roadmap-2012.jpg)
* Currently, the A6 family dominates the benchmarks, but competition isn’t standing still. Nvidia is out with the Tegra 4/Wayne platform early next year, promising a twofold jump in performance over the current-gen Tegra 3.
* Qualcomm’s S4 and S4 PRO chips are also praised for speed and Samsung’s new Exynos 5250 is able to drive the ten-inch Nexus tablet (first reviews just went live today) with its super high-resolution display.
* While the Tegra 3 provides enough hardware power to drive that massive display, looks like Android is lagging behind. Check out The Verge’s hands-on video (mark 1:15) for a proof.
* As for Apple’s semiconductor strides, CEO Tim Cook indicated that Apple’s newly formed Technologies group under the guidance of long-standing hardware expert Bob Mansfield, has “ambitious plans for the future”.
* Just how ambitious those plans may be is anyone’s guess.
* Apple’s notably been on the hiring spree as it figures how to take the reigns of its chip destiny. For example, just recently the company hired Jim Mergard, one of Samsung’s most noted chip design luminaries.
* @dujkan Funny thing is that Apple still hired Chief Incompetent Officer from Samsung/AMD. Not my quote, comes from one of ex-AMD guys…
* — Theo Valich (@theovalich) October 29, 2012
*  
* Apple has long been rumored to taking its chip biz to Taiwan’s TSMC. Currently, all of Apple’s processors for iOS devices are being manufactured by Samsung in its multi-billion dollar plant in Austin, Texas.
* While I wouldn’t entirely rule out the possibility of Apple manufacturing its own chips some day, that’s a fairly distant possibility for the time being as the road to building a chip plant of its own has too many perils.

