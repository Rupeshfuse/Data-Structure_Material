package list;
import java.util.Scanner;
public class MainListNode 
{
 	public static void main(String [] args) 
	{
		Scanner in=new Scanner(System.in);
		SinglyLinkedList obj=new SinglyLinkedList();
		obj.createLinkedList();
		int ch;
		do 
		{
			System.out.println("\n1.InsertLeft"
				+ "\n2.InsertRight"
				+ "\n 3.DeleteLeft"
				+ "\n 4.DeleteRight"
				+ "\n 5.DeleteElement"
				+ "\n 6.SearchElement"
				+ "\n 7.Print"
				+ "\n 8.Exit"
				);
		 	ch=in.nextInt();
		 	switch(ch) 
			{
				 case 1:
					System.out.println("Enter Elememt");
			 		int e=in.nextInt();
			 		obj.insertLeft(e);
			 	break;
		 		case 2:
					System.out.println("Enter Elememt");
			 		int s=in.nextInt();
			 		obj.insertRight(s);
			 		System.out.println(s);
				break;
		 		case 3:
					obj.deleteLeft();
				break;
		 		case 4:
					obj.deleteRight();
		 		break;
		 		case 5:
			 		System.out.println("Enter Elememt");
			 		int s =in.nextInt();
			 		obj.deleteElement(s);
		 		break;
		 		case 6:
			 		System.out.println("Enter Elememt");;
			 		int p =in.nextInt();
			 		obj.search(p);
		 		break;
		 		case 7:
			 		obj.printList();
	      			break;
				case 8 :
	       				System.out.println("Exit");
	      				break; 
	      				default:
	    	  			System.out.println("Invalid");
	    			break;
			}					
		}while(ch!=0);
 	}
}
