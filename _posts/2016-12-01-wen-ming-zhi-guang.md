---
layout: post
title: 《文明之光》
---
<img src="{{site.baseurl}}/images/wen-ming-zhi-guang.jpg" width="360">

吴军博士写作《文明之光》系列，希望能开阔人们的视野，让我们看到各种各样的人类文明。虽然今天不同的地区发达程度不同，文明历史的长短不一，国家亦有大小之分，但是文明之光从世界的每一个角落发出，对人类的进步产生着影响，并且成为了奠定我们今天发达世界的基石。

{% for cookie in site.wen-ming-zhi-guang reversed %}
## [{{ cookie.title }}]({{ cookie.url }})
{% endfor %}

