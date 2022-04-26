package stacklist;
import java.util.Scanner;
public class DynamicStackMenu {

	public static void main(String[] args) {
		DynamicStack obj = new DynamicStack();
		Scanner sc = new Scanner(System.in);
		
		obj.createStack();
		
		int ch;
		do
		{
			System.out.println("1.PUSH"
						+ "\n2.POP"
						+ "\n3.PRINT"
						+ "\n0.EXIT");
             ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Element : ");
				int e=sc.nextInt();
				obj.push(e);
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.printStack();
				break;
			
			case 0:
				System.out.println("Exiting ");
				break;
			default:
				System.out.println("Wrong Choice!!!!!");
				break;
			
			}
			
		}while(ch!=0);
		sc.close();
	}
	
}
