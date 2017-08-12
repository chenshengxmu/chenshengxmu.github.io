---
layout: post
title: Convert a given Binary Tree to Doubly Linked List 
---
```java
void BinaryTree2DoubleLinkedList(Node root)
{
	if (root == null)
	{
		return;
	}
	Node left = root.left;
	t2l(left);
	Node right = root.right;
	t2l(right);
	if (left != null)
	{
		while (left.right != null)
		{
			left = left.right;
		}
		left.right = root;
		root.left = left;
	}
	if (right != null)
	{
		while (right.left != null)
		{
			right = right.left;
		}
		right.left = root;
		root.right = right;
	}
}
```
