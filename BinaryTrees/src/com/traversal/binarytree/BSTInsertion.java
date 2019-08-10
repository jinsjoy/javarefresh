package com.traversal.binarytree;

public class BSTInsertion {

	
	public class Node {		
		int key;
		Node left;
		Node right;
		
		public Node(int data) {
			key = data;
			left = right = null;
		}
	}
	
	Node root;
	
	BSTInsertion(){
		root = null;
	}
	
	public Node insertRec(Node node, int data) {
		if(node == null) {
			node = new Node(data);
			return node;
		}
		if(data < node.key) {
		   node.left = insertRec(node.left, data);
		}
		else {
		   node.right = insertRec(node.right, data);
		} 
		
		return node;
	}
	
	public void inorder() {
		inorderTraversal(root);	
	}
	
	public void inorderTraversal(Node node) {
		if(node == null) {
			return;
		}
		
		inorderTraversal(node.left);
		System.out.println(node.key);
		inorderTraversal(node.right);
	}
	
	public int size(Node node) {
		if(node == null)
			return 0;
		int lsize = size(node.left);
		int rsize = size(node.right);
		return lsize+rsize+1;
		}
	
	public int sizePrint() {
		return size(root);
	}
	
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	public static void main(String args[]) {
		BSTInsertion tree = new BSTInsertion();
		tree.insert(50);
		tree.insert(14);
		tree.insert(4);
		tree.insert(56);
		tree.insert(12);
		tree.insert(90);
		tree.insert(26);
		
	    tree.inorder();
	    System.out.println(tree.sizePrint());
	}
}
