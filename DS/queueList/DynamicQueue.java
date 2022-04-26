package queueList;

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

public class DynamicQueue {
	Node front , rear;
	void createQueue()
	{
		rear = front = null;
	}

	void enqueue(int e)
	{
		Node n = new Node(e);
		if(front == null)
		{
			front = rear = n;
		}
		else
		{
			rear.next = n;
			rear = n;
		}
	}

	void dequeue()
	{
		if(front == null)
			System.out.println("Empty Queue");
		else
		{
			Node t = front;
			front = front.next;
			System.out.println("Dequed"+t.data);
		}
	}
	void printQueue()
	{
		if(front == null)
			System.out.println("Queue is Empty");
		else
		{
			Node t = front;
			while( t != null )
			{
				System.out.println(t.data);
				t = t.next;
			}
		}
	}
}
