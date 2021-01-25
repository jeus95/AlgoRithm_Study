package com.java.study01;

import java.util.Scanner;

public class SaltBug {


		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			
			
			for(int tc = 1; tc <= T; tc++) {
				int N = sc.nextInt(); //배열 크기
				int bNum =sc.nextInt(); //소금쟁이 수
				int cnt=0;
				int curB=0;
			
				int[][]map = new int[N][N];
				
				for(int bN=0;bN<bNum;bN++)
				{	
					
					int row =sc.nextInt();
					int col =sc.nextInt();
					int dir =sc.nextInt();//1,2( 하 ,우) 

					boolean flag = true;
					if(map[row][col]==1) {
						curB=bN+1;
						break;
					}
					//System.out.println(dir);
					
					else if(dir==1) {
						for(int l=3;l>0;l--) {
							if(map[row][col]==1) {
								curB=bN+1;
								break;
							}
							map[row][col]=1;
							row=row+l;
							if(row<0||row>=N) {
								break;
								//System.out.println("2");
							}
						}
						//map[row][col]=1;
					}

					else if(dir==2) {
						for(int l=3;l>0;l--) {
							if(map[row][col]==1) {
								curB=bN+1;
								break;
							}
							map[row][col]=1;
							col=col+l;
							if(col<0||col>=N) {
								break;
								//System.out.println("4");
							}
						}
						//map[row][col]=1;
					}			

				//if(flag==true) {
					//System.out.println("row : " +row);
					//System.out.println("col : " +col);
					//map[row][col]=1;
					//}
				}//소금쟁이 마리 수만큼 반복문
			
			

			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					//System.out.print(map[i][j]+ " ");
				}
				System.out.println();}
			
			System.out.println("#"+tc+" "+curB);
			
				
				
				
				
			}//testcase
		}//main
	}
