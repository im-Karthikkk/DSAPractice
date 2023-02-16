import java.util.*;
class Simplicity{
	static double findSimilarity(int[] arr1, int[] arr2){
		int proxy = 0;
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i]==arr2[j])proxy++;
			}
		}
		double intersection = proxy;
		double union = arr1.length + arr2.length - proxy;
		return intersection/union;
	}
	static void printAns(int[][] arr, String[] names){
		System.out.println("\n"+String.format("%-9s: %-20s", "ID1, ID2", "SIMILARITY"));
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				double temp = findSimilarity(arr[i], arr[j]);
				if(temp>0){
					System.out.println(String.format("%-9s: %-20s", names[i]+", "+names[j], temp+""));
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Doc count: ");
		int n = sc.nextInt();
		String[] names = new String[n];
		int[][] arr = new int[n][];
		for(int i=0; i<n; i++){
			System.out.println("Enter doc "+(i+1)+" name: ");
			names[i] = sc.next();
			System.out.println("Enter doc "+(i+1)+" size: ");
			int col = sc.nextInt();
			arr[i] = new int[col];
			for(int j = 0; j<col; j++)
				arr[i][j] = sc.nextInt();
		}
		printAns(arr, names);
	}
}