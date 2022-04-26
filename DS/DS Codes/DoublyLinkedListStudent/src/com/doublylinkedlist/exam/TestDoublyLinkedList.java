package com.doublylinkedlist.exam;

import java.util.Iterator;


public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList<Student> doublyLinkedList=new DoublyLinkedList<>();
		
		Student Student1=new Student(101, "Pradeep Mali", 358);
		Student Student2=new Student(102, "Jaydeep Mali", 755);
		Student Student3=new Student(103, "Vishal Mali", 256);
		Student Student4=new Student(104, "Savta Mali", 588);
		
		doublyLinkedList.add(Student1);
		doublyLinkedList.add(Student2);
		doublyLinkedList.add(Student3);
		doublyLinkedList.add(Student4);
		
		System.out.println("Iterating Student Node is Forward Direction --------------------->");
		Iterator<Student> iterator = doublyLinkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println((Student) iterator.next());
		}
		System.out.println("");
		System.out.println("<--------------------- Iterating Student Node is Forward Direction ");
		ReverseIterator<Student> reverseIterator = doublyLinkedList.reverseIterator();
		while (reverseIterator.hasPreviuos()) {
			System.out.println((Student) reverseIterator.previous());
		}
		System.out.println("");
		System.out.println("Printing Students Using forEach Loop");
		doublyLinkedList.forEach(Student -> {
			System.out.println(Student);
		});
	}
	
}
