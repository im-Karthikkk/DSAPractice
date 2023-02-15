/*
Imagine a robot sitting on the upper left corner of grid with r rows and c columns. The robot
can only move in two directions, right and down, but certain cells are "off limits" such that
the robot cannot step on them. Design an algorithm to find a path for the robot from the top
left to the bottom right.
*/
import java.util.*;
class Maze{
	static int r;
	static int c;
	static int restricted;
	
	public static boolean isSafe(int[][] arr, int i, int j){
		return (i>=0 && j>=0 && i<r && j<c && arr[i][j]!=restricted);
	}
	public static void maze(int[][] arr, int i, int j, String path){
		if(i>=r-1 && j>=c-1){
			System.out.println(path);
			return;
		}
		int ni = i+1;
		int nj = j;
		if(isSafe(arr, ni, nj))
			maze(arr, ni, nj, path+"D -> ");
		
		ni = i;
		nj = j+1;
		if(isSafe(arr, ni, nj))
			maze(arr, ni, nj, path+"R -> ");
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Array elements: ");
		for(int i=0; i<r; i++){
			for(int j = 0; j<c; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Restricted value: ");
		restricted = sc.nextInt();
		maze(arr, 0,0, "");
	}
}