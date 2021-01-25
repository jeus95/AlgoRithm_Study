package com.java.study01;

import java.util.Scanner;

public class Maze01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int N;
	
		for(int t = 1; t<=tc ; t++) {
			N = sc.nextInt();
			int[] dx = {-1,0,1,0};
			int[] dy = {0,1,0,-1};
			
			int[][] map = new int [N+1][N+1];
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int jumper = sc.nextInt();
			
			for(int i = 0; i<jumper; i++) {
				int jx =sc.nextInt();
				int jy =sc.nextInt();
				map[jx][jy] = 1;
			}
			boolean flag =true;
			int moveC =sc.nextInt();
			for(int i=0; i<moveC; i++ ) {
				int dir=sc.nextInt();
				int cnt =sc.nextInt();

				 x=x+dx[dir-1]*cnt;
				 y=y+dy[dir-1]*cnt;

				if (x < 0 || y < 0 || x >= N || y >= N || map[x][y]==1) {//범위 안이라면
					
						flag =false;
						x=0;
						y=0;
						break;
					}
				
				
			}
			
			System.out.println("#"+t + " "+x +" "+y);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

 }
}
