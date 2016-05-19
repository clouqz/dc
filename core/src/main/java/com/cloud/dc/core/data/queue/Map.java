package com.cloud.dc.core.data.queue;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Map implements Iterator{

	private static final ConcurrentHashMap current = new ConcurrentHashMap();
	
	private class Queue{
		
		private class Node<V>{
			
			@SuppressWarnings("rawtypes")
			private Node nextNode;
			private V value;
			
			public Node(V value){
				this.value = value;
			}
		}
		
		@SuppressWarnings("rawtypes")
		private Node currentNode;
		private int size = 0; 
		
		public Queue(){
			
		}
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public <V> V pop(){
			if(this.size <= 0 || this.currentNode == null){
				return null;
			}
			Node temp = this.currentNode;
			this.currentNode.nextNode = this.currentNode;
			return (V) temp.value;
		}
		
		public <V> void push(V value){
			Node<V> temp = new Node<V>(value);
			if(this.currentNode == null){
				this.currentNode = temp;
				this.size = 1;
			} else {
				temp.nextNode = this.currentNode;
				this.currentNode = temp;
				size++;
			}
		}
		
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
	
}
