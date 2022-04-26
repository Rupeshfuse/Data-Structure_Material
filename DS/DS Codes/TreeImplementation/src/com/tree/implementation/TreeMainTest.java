package com.tree.implementation;

import java.util.Scanner;

public class TreeMainTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        TreeImplementation tree = new TreeImplementation(); 
        System.out.println("Linked List Tree Test\n");          
        char ch;
        do    
        {
            System.out.println("Enter integer element to insert");
            tree.insert( scan.nextInt() );                     
            System.out.print("\nPost order : ");
            tree.postorder();
            System.out.print("\nPre order : "); 
            tree.preorder();
            System.out.print("\nIn order : ");
            tree.inorder();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');                    
    }

}
