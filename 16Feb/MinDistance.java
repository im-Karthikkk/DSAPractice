/*

*/
import java.util.*;
class MinDistance{	
	static int findMinDistance(int[] arr){
		int min = Integer.MAX_VALUE;
		int n = arr.length;
		for(int i=0; i<n; i++){
			for(int j= i+1; j<n; j++){
				if(arr[i] == arr[j]){
					//System.out.println(i+" "+j);
					if(j-i<min)min = j-i;
				}
			}
		}
		if(min == Integer.MAX_VALUE)min = -1;
		return min;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(findMinDistance(arr));
	}
}