/*

*/
import java.util.*;
class MinDelete{
	static int findMinDelete(int[] arr){
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			int count = 0;
			for(int j= 0; j<n; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count>max)max = count;
		}
		return n - max;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(findMinDelete(arr));
	}
}