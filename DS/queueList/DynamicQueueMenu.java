package queueList;
import java.util.Scanner;
public class DynamicQueueMenu {

	public static void main(String[] args) {
		DynamicQueue obj = new DynamicQueue();
        Scanner sc = new Scanner(System.in);
		
		obj.createQueue();
		
		int ch;
		do
		{
			System.out.println("1.ENQUEUE"
					+ "\n2.DEQUEUE"
					+ "\n3.PRINT"
					+ "\n0.EXIT");
            ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Element : ");
				int e=sc.nextInt();
				obj.enqueue(e);
				break;
			case 2:
				obj.dequeue();
				break;
			case 3:
				obj.printQueue();
				break;
			
			case 0:
				System.out.println("Exiting ");break;
			default:
				System.out.println("Wrong Choice!!!!!");break;
			
			}
			
		}while(ch!=0);
		sc.close();
	}

}
