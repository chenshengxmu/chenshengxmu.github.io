---
layout: post
title: Apple's devised novel self-driving tech for detecting small obstacles using LiDAR
---
![img](http://media.idownloadblog.com/wp-content/uploads/2017/11/Apple-autonomous-driving-obstacle-detection-research-paper-001.png)
* Apple’s kept its self-driving research secret for years, but now the company has publicized some of its autonomous driving software techniques that improve obstacle detection.
* Published on November 17 on the moderated scientific pre-print repository arXiv by Apple’s artificial intelligence and machine learning experts Yin Zhou and Oncel Tuzel, the paper outlines detecting small obstacles using the Light Detection and Ranging (LiDAR) sensing method.
* Rather than rely on hand-crafted feature representations (for example, a bird’s eye view projection), Apple’s scientists propose a novel end-to-end trainable deep architecture for point cloud based 3D detection. Called VoxelNet, it can operate directly on sparse 3D points and capture 3D shape information effectively.
* Early experimentation with VoxelNet technology has showed that it outperforms state-of-the-art LiDAR-based 3D detection methods by a large margin. On more challenging tasks, such as 3D detection of pedestrians and cyclists, the VoxelNet approach demonstrated encouraging results, showing that it provides a better 3D representation and detection.
![img](http://media.idownloadblog.com/wp-content/uploads/2017/11/Apple-autonomous-driving-obstacle-detection-research-paper-002.jpg)
* Green 3D boxes denote potential obstacles detected using LiDAR
* The ability to accurately detect objects in 3D point clouds is crucial in obstacle avoidance.
* From the paper:
* VoxelNet divides a point cloud into equally spaced 3D voxels and transforms a group of points within each voxel into a unified feature representation through the newly introduced voxel feature encoding (VFE) layer. In this way, the point cloud is encoded as a descriptive volumetric representation, which is then connected to a RPN to generate detections.
* Experiments on the KITTI car detection benchmark show that VoxelNet outperforms the state-of-the-art LiDAR based 3D detection methods by a large margin. Furthermore, our network learns an effective discriminative representation of objects with various geometries, leading to encouraging results in 3D detection of pedestrians and cyclists, based on only LiDAR.
* The VoxelNet architecture, illustrated top of post, features a learning network that takes a raw point cloud as input, then partitions the space into voxels and transforms points within each voxel to a vector representation characterizing the shape information.
* It’s great that Apple is starting to open up when it comes to its autonomous driving research, said to be aimed at the ride hailing market and the company’s in-house campus shuttle service.
* The iPhone maker has apparently made a big investment in autonomous driving and has “a large project going” in that space, according to CEO Tim Cook.

