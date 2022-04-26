package list;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	Node root;
	Node t;
	Node t2;
	void createLinkedList() {
		root=null;
	}
	void insertLeft(int e) {
		Node n= new Node(e);
		if(root==null)
			root=n;
		else 
			n.next=root;
		root=n;
	}
	void insertRight(int e) {
		Node n= new Node(e);
		if(root==null)
			root=n;
		else
			t=root;
		 while(t.next !=null) {
			 t=t.next;
		 }
			 t.next=n;
		 }
	
	void deleteLeft() {
		if(root==null)
			System.out.println("empty list");
		else {
			t=root;
			root=root.next;
			System.out.println("deleted "+t.data);
		}
	}
	void deleteRight() {
		if(root==null)
	    System.out.println("empty list");
		else
		{
			t=root;
			Node t2;
			t2=root;
			while(t.next!=null) {
				t2=t;
				t=t.next;
			}
			t2.next=null;
			System.out.println("deleted"+t.data);
		}
	}
	void printList() {
		if(root==null)
			System.out.println("empty root");
		else
		{
			t=root;
			while(t!=null) {
				System.out.println(t.data);
				t=t.next;
			}
		}
	}
	void search(int key) {
		if(root==null)
			System.out.println("empty list");
		else
		{
			t=root;
			while(key!=t.data && t!=null) {
				t=t.next;
				if(t==null)
				System.out.println("Not found ");	
				else if(t.data==key)	
					System.out.println("found");
			}	
		}
	}
	
	void deleteElement(int key) {
	 if(root==null)
			System.out.println("empty list");
		else {
		 t=t2;
		while(key!=t.data && t!=null) {
			t2=t;
			t=t.next;
			if(t!=null) {
				//case1 leftmost
				if(t!=null) {
					root=root.next;
				}
				//case2 rightmost
				else if(t.next==null) {
					t.next=null;
				}
				//case 3
				else
				{
					t2.next=t.next;
					System.out.println("deleted"+t.data);
				}
				
			}
			else
				System.out.println("not found");
		}
		}
	}
}
