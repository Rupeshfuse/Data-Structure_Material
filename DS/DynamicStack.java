package stacklist;

class Node
{
	int data;
	Node next;
	Node(int e)
	{
		data = e;
		next = null;
	}
}

public class DynamicStack
{
	Node tos;
	
	void createStack()
	{
		tos = null;
	}
	
	void push(int e)
	{
		Node n = new Node(e);
		if ( tos == null )
		{
			tos = n;
		}
		else 
		{
			n.next = tos;
			tos = n;
		}
	}

	void pop()
	{
		if ( tos == null)
			System.out.println("Stack is Empty");
		else
		{
			Node t = tos;
			tos = tos.next;
			System.out.println("Popped" + t.data);
		}	
	}
	
	void printStack()
	{
		if ( tos == null)
			System.out.println("Stack is Empty");
		else
		{
			Node t = tos;
			while ( t != null )
			{
				System.out.println(t.data);
				t = t.next;
			}
		}
	}	
}