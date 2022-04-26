package doublylinkedlist;

public class DoublyLinkedList {
	Node root;
	class Node
	{
		int data;
		Node left , right, root;
		Node(int e)
		{
			data = e;
			left = right = root;
		}
	}
	void createDLL()
	{
		root = null;
	}

	void insertLeft(int e)
	{
		Node n = new Node(e);
		if( root == null)
			root = n;
		else
		{
			n.right = root;
			root.left = n;
			root = n;
		}
	}

	void deleteLeft()
	{
		if(root == null)
			System.out.println("List is Empty");
		else
		{
			Node t = root;
			root = root.right;
			root.left = null;
			System.out.println("Deleted" + t.data);
		}
	}

	void insertRight(int e)
	{
		Node n = new Node(e);
		n.right = root;
		n.left = null;
		if( root != null)
		{
			root.left = n;
			root = n;
		}
		else
		{
			Node t = root;
			while(t.right != null)
			{
				t = t.right;
			}
			t.right = n;
			n.left = t;
		}
	}
		
	void deleteRight()
	{
		if(root == null)
			System.out.println("List is Empty");
		else
		{
			Node t, t2;
			t = root;
			t2 = root;
			while(t.right != null)
			{
				t = t.right;
			}
			t2 = t.left;
			t2.right = null;
			System.out.println(t.data);
		}
	}
	
	void printList()
	{
		Node t = root;
		do
		{
			System.out.println(t.data);
			t = t.right;
		}while(t !=null );
	}
}