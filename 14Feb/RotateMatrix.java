import java.util.*;
class RotateMatrix{
	public static void rotate(int[][] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		int start = 0;
		int end = arr.length-1;
		for(int i=0; i<n; i++){
			while(start<=end){
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
			}
			start = 0;
			end = arr.length-1;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++)
				arr[i][j] = sc.nextInt();
		}
		
		rotate(arr);
		System.out.println();
		for(int[] a: arr){
			for(int i: a)
				System.out.print(i+" ");
			System.out.println();
		}
	}

}