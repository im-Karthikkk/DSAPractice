import java.util.*;
class Kolam{
	static boolean isEmpty(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i][j]!=0)
					return false;
			}
		}
		return true;
	}
	static boolean solve(int[][] arr, int i){
		if(isEmpty(arr))return true;
		boolean flag = false;
		for(int j=0; j<arr.length; j++){
			if(arr[i][j]!=0){
				arr[i][j]--;
				arr[j][i]--;
				flag = flag || solve(arr, j);
				if(!flag){
					arr[i][j]++;
					arr[j][i]++;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][n+1];
		int q = sc.nextInt();
		for(int i =0; i<q; i++){
			int k = sc.nextInt();
			int j = sc.nextInt();
			int weight = sc.nextInt();
			arr[k][j] = weight;
			arr[j][k] = weight;
		}
		System.out.println(solve(arr, 1)?"YES":"NO");
	}
}