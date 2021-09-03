package kr.or.shi.issue11;

public class MyLinkList<T>{
	MyListNode<T> head = null;
	int count = 0;
	
	public void addElement(T element)
	{
		if(head == null)
		{
			head = new MyListNode<>(element);
		}
		else
		{
			MyListNode<T> node = this.head;
			while(node.next != null)
			{
				node = node.next;
			}
			node.next = new MyListNode<>(element);
		}
	}

	public MyListNode<T> search(T data)
	{
		if(this.head == null)					//	노드있는지 체크
		{
			return null;
		}
		else	
		{
			MyListNode<T> node = this.head;		//	없으면 head부터 시작
			while(node.data != null)
			{
				if(node.data == data)			//	찾는 노드와 일치하면 리턴
				{
					return node;
				}
				else
				{
					node = node.next;			//	다를 경우 다음 노드로 이동
				}
			}
			return null;						//	못 찾을경우 null리턴
		}

	}

	//	중간에 데이터를 추가하는 경우
	public void addNodeInside(T element, int location)
	{
		MyListNode<T> node = head;
		for(int i = 0; i < location; i++)
		{
			node = node.next;
		}
		if(node.data != null)
		{
			while(node.data != null)
			{
				node.data = node.next.data;
				node = node.next;
			}
			
		}
	}
	
	public void printAll()
	{
		if(head.data != null)
		{
			MyListNode<T> node = this.head;
			System.out.println(head.data);
			while(node.next != null)
			{
				node = node.next;
				System.out.println(node.data);
			}		
		}
		else
		{
			System.out.println("출력할 데이터가 없습니다.");
			return;
		}
		
	}
}
