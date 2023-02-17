import java.util.*;
class HouseRobber{
	static int robMax(int[] arr, int i, int sum){
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(robMax(arr, 0, 0));
	}
}