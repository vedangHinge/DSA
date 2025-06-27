package com.LL;

import java.util.LinkedList;

public class SinglyLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public SinglyLinkedList() {
		this.size=0;
	}
	
	private class Node{
		private int val;
		private Node next;
		
		public Node(int val) {
			this.val=val;
			this.next=null;
		}
		public Node(int val,Node next) {
			this.val=val;
			this.next=next;
		}
	}
	public void insertAtFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size++;
	}
	public void insertAtLast(int val) {
		if(tail==null) {
			insertAtFirst(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}
	
	public void insertAtPos(int val,int pos) {
		if(pos==0) {
			insertAtFirst(val);
			return;
		}
		if(pos==size) {
			insertAtLast(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		
		size++;
		
	}
	public int deleteFirst() {
		int val=head.val;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}
	

	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast=get(size-2);
		int val=tail.val;
		tail=secondLast;
		tail.next=null;
		return val;
	}
	public int deleteAtPos(int index) {
		if(index==0) return deleteFirst();
		if(index==size-1) return deleteLast();
		Node prev=get(index-1);
		int val=prev.next.val;
		prev.next=prev.next.next;
		return val;
	}
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}
}
