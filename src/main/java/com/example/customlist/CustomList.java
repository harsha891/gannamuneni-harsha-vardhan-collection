package com.example.customlist;

import java.util.Arrays;

public class CustomList<T> {

	public int initial_capacity=10,size=0;
	
	public Object data[];
	
	public CustomList()
	{
		data=new Object[initial_capacity];
	}
	
	public void add(T element)
	{
		if(size==data.length)
			expandCapacity();
		data[size++]=element;
	}
	
	private void expandCapacity() {
		// TODO Auto-generated method stub
		int expandedSize=data.length*2;
		data=Arrays.copyOf(data,expandedSize);
	}

	public T get(int i)
	{
		if(i>=size || i<0)
			throw new IndexOutOfBoundsException("INDEX : "+i);
		return (T)data[i];
	}
	
	public void remove(int i)
	{
		if(i>=size || i<0)
			throw new IndexOutOfBoundsException("INDEX : "+i);
		Object item=data[i];
		System.arraycopy(data, i+1, data, i, data.length-(i+1));
		size--;
		
	}
	
	public int size()
	{
		return size;
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		for(int i=0;i<size;i++)
		{
			sb.append(data[i].toString());
			if(i<size-1)
			{
				sb.append(",");
			}
		}
		sb.append(']');
		return sb.toString();
	}
}