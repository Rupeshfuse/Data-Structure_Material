package com.graph.implemetation;
import java.util.Scanner;

public class GraphImplementation {
	int adjMat[][],Vnodes,Vlist[];
	Scanner in = new Scanner(System.in);
		public GraphImplementation(int size)
		{
			Vnodes = size;
			Vlist = new int[Vnodes];
			adjMat = new int[Vnodes][Vnodes];
			
			for(int src = 0 ; src < Vnodes ; src++)
			{
				for(int dest = 0; dest<Vnodes; dest++)
				{
					System.out.println(" Edge cost from"+ src + "to"+ dest+":");
					adjMat[src][dest]= in.nextInt();
					
				}
			}	
		}
		
		
		void resetVisit()
		{
			for(int i = 0;i<Vnodes; i++)
				Vlist[i]=0;
		}
		
		void DFS(int Source)
		{
			Vlist[Source]=1;
			System.out.println(Source);
			for(int i = 0; i< Vnodes ; i++)
			{
				if(adjMat[Source][i]==1 && Vlist[i] != 1)
					
					 DFS(i);
			}
		}
		
		void BFS(int Source)
		{
			int Q[],front = 0, rear = -1 , e;
			Q = new int [Vnodes];
			Vlist[Source]=1;
			Q[++rear] = Source ;
			
			while(front <= rear){
				e = Q[front++];
				System.out.println(e);
				for(int i=0; i<Vnodes ; i++)
				{
					if(adjMat[e][i]==1 && Vlist[i]!=1)//checking unvisited nodes
					{
						Vlist[i]=1;
						Q[++rear]=i;
					}
					
				}
			}
		}
}