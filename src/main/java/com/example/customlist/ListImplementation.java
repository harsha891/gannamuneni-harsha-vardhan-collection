package com.example.customlist;

public class ListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("CustomList:"
				+ "\n\t1.add()"
				+ "\n\t2.remove()"
				+ "\n\t3.get()"
				+ "\n\t4.size()\n");
		
		CustomList<Integer> list = new CustomList<Integer>();
		
		
		System.out.println("Size : "+list.size());
		System.out.println("Elements : "+list);
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println("Size : "+list.size());
		System.out.println("Elements : "+list);
		
		list.remove(4);
		System.out.println("Size : "+list.size());
		System.out.println("Elements : "+list);
		
		System.out.println("Element at index 0 : "+list.get(0));
		System.out.println("Element at index 1 : "+list.get(1));
		System.out.println("Element at index 5 : "+list.get(5));
		System.out.println("Element at index 6 : "+list.get(6));
	}

}