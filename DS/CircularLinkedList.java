package circularlist;

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next = null;
	}
}

public class CircularLinkedList {
Node root,last;
	
	void createCircularList()
	{
		root = last = null;
	}
	
	void insertLeft(int e)
	{
		Node n = new Node(e);
		if(root == null)
		{
			root=last=n;
		    last.next=root;
		}
		else
		{
			n.next=root;
			root=n;
			last.next=root;
		}
	}
	
	void deleteLeft()
	{
		if(root==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node t=root;
			root=root.next;
			last.next=root;
			System.out.println("Deleted element : "+t.data);
		}
	}
	
	void insertRight(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=last=n;
			last.next=root;
		}
			
		else
		{
			last.next = n;
			last = n;
			last.next = root;

		}
	}
	
	void deleteRight()
	{
		if(root==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node t=root;
			Node t2=root;
			while(t!=last)
			{
				t2=t;
				t=t.next;
			}
			last=t2;
			last.next=root;
			
			System.out.println("Deleted element : "+t.data);
		}
	}
	
	void printList()
	{
		Node t = root;
		do
		{
			System.out.println(t.data);
			t = t.next;
		}while(t != root );
	}
}
