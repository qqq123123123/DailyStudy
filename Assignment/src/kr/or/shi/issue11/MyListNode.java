package kr.or.shi.issue11;

public class MyListNode<T> {
	T data;
	MyListNode<T> next = null;
	
	public MyListNode(T data)
	{
		this.data = data;
	}
	
	public T getData()
	{
		return this.data;
	}
}
