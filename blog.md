---
layout: blog_page
title: Blog
permalink: /blog/
---

<ul>
  {% for post in site.posts %}
    <li>
      <h1><a href="{{ post.url }}">{{ post.title }}</a></h1>
	  <span class="date">
		  {{ post.date | date: '%B %d, %Y' }}
	  </span>
      {{ post.excerpt }}
      <a href="{{ post.url }}" class="read-more">Read More</a>
    </li>
  {% endfor %}
</ul>