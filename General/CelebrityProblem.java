package org.practice.general;

public class CelebrityProblem{

	private static int[][] party = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0} };


	private static int knows(int a, int b){
		return party[a][b];
	}
	static int findCelebrity(int n){

		int[] indegree = new int[n];
		int[] outdegree = new int[n];


		for(int i=0; i< n; i++){
			for(int j=0; j<n; j++){
				int x = knows(i,j);
				outdegree[i] +=x;
				indegree[j] +=x;
			}
		}

		for(int i=0; i<n ; i++){
			if(indegree[i] == n-1 && outdegree[i] == 0){
				return i;
			}
			
		}
		return -1;
	}	

	public static void main(String[] args){

		int n =4;

		int id = findCelebrity(n);

		if(id==-1){
			System.out.println("There is no celebrity!....");

		}
		else{
			System.out.println(id);
		}

	}
}