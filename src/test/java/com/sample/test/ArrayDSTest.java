package com.sample.test;

public class ArrayDSTest {
	
	int size;
	int arr[] = null;
	public ArrayDSTest(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		arr = new int[size];
	}
	
	public void isFull() {
		if(arr.length == size) {
			
		}
		
	}
	
	public boolean isEmpty() {
		if(arr.length == -1) 
		return  true;
		return false;
	}
	
	public static void main(String[] args) {
		
	}

}
