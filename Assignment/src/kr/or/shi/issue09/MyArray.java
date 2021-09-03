package kr.or.shi.issue09;

public class MyArray {
	Integer[] intArr;
	int count = 0;
	
	public int ARRAY_SIZE()
	{
		return intArr.length;
	}
	
	public MyArray()
	{
		intArr = new Integer[10];
	}
	public MyArray(int size)
	{
		intArr = new Integer[size];
	}
	
	public void addElement(int element)
	{
		for(int i = 0; i < intArr.length; i++)
		{
			if(intArr[i] == null)
			{
				intArr[i] = element;
				break;
			}
		}
	}
	
	public int getElement(int location)
	{
		Integer temp = 0;
		if(intArr[location] != null)
		{
			temp = intArr[location];
			return temp;
		}
		return temp;
	}
	
	public int getSize()
	{
		return intArr.length;
	}
	
	public void insertElement(int location, int element)
	{
		if(intArr[location] != null)
		{
			for(int i = intArr.length; i > location; i--)
			{
				if(intArr[i-1] != null)
				{
					intArr[i] = intArr[i-1];
				}
			}
		}
		intArr[location] = element;
	}
	public boolean isEmpty()
	{
		if(intArr == null)
		{
			return true;
		}
		else return false;
	}
	
	public void printAll()
	{
		for(int i = 0; i < intArr.length; i++)
		{
			if(intArr[i] != null)
			System.out.println(intArr[i]);
		}
		
	}
	public void removeAll()
	{
		for(int i = 0; i < intArr.length; i++)
		intArr[i] = null;
	}
	public int removeElement(int location)
	{
		Integer temp = intArr[location];
		intArr[location] = null;
		for(int i = 0; i < intArr.length-1; i++)
		{
			if(intArr[i] == null)
			{
				intArr[i] = intArr[i+1];
				intArr[i+1] = null;
			}
		}
		return temp;
	}
	
	
	
}
