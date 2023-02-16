import java.util.*;
class Masseuse{
	static int findMax(int[] arr, int i, int total){
		if(i<0)return total;
		if(i==0)return total + arr[i];
		return Math.max(findMax(arr, i-1, total), findMax(arr, i-2, total+arr[i]));
	} 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(findMax(arr, arr.length-1, 0));
	}
}