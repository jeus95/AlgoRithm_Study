package com.java.study01;

import java.util.Scanner;

public class RobotMove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int N;
	
		for(int t = 0; t<tc ; t++) {
			N = sc.nextInt();
			char [][] move= new char[N][N];
			int map[][] =new int[N][N];
			char robot;
			int cnt = 0;
			for(int i=0;i<N;i++) {
				for(int j=0; j<N; j++) {
					move[i][j] = sc.next().charAt(0);
				}
			}
			
			
			for(int i=0;i<N;i++) {
				for(int j=0; j<N; j++) {
					if(move[i][j]=='A') {
						//System.out.println("A");
						//System.out.println(cnt);
						for(int k=j+1;k<N;k++) {
							if(move[i][k]=='S')
							{
								cnt++;
								//System.out.println("A");
								
							}
							else
								break;
						}
					}
					if(move[i][j]=='B') {
						//System.out.println("B");
						//System.out.println(cnt);
						for(int k=j+1;k<N;k++) {
							if(move[i][k]=='S')
							{
								cnt++;
								//System.out.println("B1");
							}
							else
								break;
						}
						for(int k=j-1;k>=0;k--) {
							if(move[i][k]=='S')
							{
								cnt++;
								//System.out.println("B2");
							}
							else
								break;
						}

					
					
					}
					if(move[i][j]=='C') {
						//System.out.println("C");
						//System.out.println(cnt);
						for(int k=j+1;k<N;k++) {
							if(move[i][k]=='S')
							{
								cnt++;
								//System.out.println("c1");
							}
							else
								break;
						}
						for(int k=j-1;k>=0;k--) {
							if(move[i][k]=='S')
							{
								cnt++;
								//System.out.println("c2");
							}
							else
								break;
						}
						for(int k=i+1;k<N;k++) {
							if(move[k][j]=='S')
							{
								cnt++;
								//System.out.println("c3");
							}
							else
								break;
						}
					
					
					}	
					
					
					
					
					
					
					
					
					
					
				}
			}
		
		System.out.println("#"+(t+1)+" "+ cnt);
		}//테스트 케이스
	}
}
