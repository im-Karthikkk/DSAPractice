/*
Write a method to return all subsets of a set.
*/
import java.util.*;
class Subsets{
	static int it = 0;
	public static void findSubsets(int[] arr, int i, String s){
		if(i<0){
			System.out.println("subset "+(it++)+": "+s);
			return;
		}
		findSubsets(arr, i-1, s+" "+arr[i]);
		findSubsets(arr, i-1, s);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		it = 1;
		findSubsets(arr, n-1, "");
	}
}