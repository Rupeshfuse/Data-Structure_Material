package com.graph.implemetation;

import java.util.Scanner;

public class GraphTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		GraphImplementation p = new GraphImplementation(size);
		System.out.println(" DFS");
		p.DFS(1);
		p.resetVisit();
		
		System.out.println(" BFS");
		p.BFS(1);
	}

}
