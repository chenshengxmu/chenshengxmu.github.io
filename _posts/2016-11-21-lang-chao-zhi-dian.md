---
layout: post
title: 《浪潮之巅》
---
{% assign filename = page.url | remove: '/' %}
{% assign posts = site.filename %}

<img src="{{site.baseurl}}/images/{{filename}}.jpg" width="360">

从一百年前算起，AT&T 公司、IBM 公司、苹果公司、英特尔公司、微软公司、思科公司、雅虎公司和Google公司都先后被幸运地推到了浪尖。虽然，它们来自不同的领域，中间有些已经衰落或正在衰落，但是它们都极度辉煌过。本书系统地介绍了这些公司成功的本质原因及科技工业一百多年的发展。

{% for cookie in posts reversed %}
## [{{ cookie.title }}]({{ cookie.url }})
{% endfor %}

