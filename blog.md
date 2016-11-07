---
layout: blog_page
title: Blog
permalink: /blog/
---

<ul>
  {% for post in paginator.posts %}
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

<div class="pagination">
  {% if paginator.previous_page %}
    <a href="/page{{ paginator.previous_page }}" class="previous">Previous</a>
  {% else %}
    <span class="previous">Previous</span>
  {% endif %}
  <span class="page_number ">Page: {{ paginator.page }} of {{ paginator.total_pages }}</span>
  {% if paginator.next_page %}
    <a href="/page{{ paginator.next_page }}" class="next">Next</a>
  {% else %}
    <span class="next ">Next</span>
  {% endif %}
</div>
