package circularlist;

import java.util.Scanner;
public class CircularLinkedListMenu {

	public static void main(String[] args) {
		CircularLinkedList obj = new CircularLinkedList();
		Scanner sc = new Scanner(System.in);
		obj.createCircularList();
		
		int ch;
		do
		{
			System.out.println("1.INSERT_LEFT\n2.INSERT_RIGHT\n3.DELETE_LEFT\n4.DELETE_RIGHT\n5.PRINT\n0.EXIT");
             ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Element : ");
				int e=sc.nextInt();
				obj.insertLeft(e);
				break;
			case 2:
				System.out.println("Enter Element : ");
				int e1=sc.nextInt();
				obj.insertRight(e1);
				break;
			case 3:
				obj.deleteLeft();
				break;
			case 4:
				obj.deleteRight();
				break;
			
			case 5:
				obj.printList(); break;
			case 0:
				System.out.println("Exiting ");break;
			default:
				System.out.println("Wrong Choice!!!!!");break;
			
			}
			
		}while(ch!=0);
	sc.close();
	}
}
