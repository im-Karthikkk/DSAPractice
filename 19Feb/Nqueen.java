import java.util.*;
class Nqueen{
	// static List<List<String>> ans;
	static int count;
	
	static boolean isValid(char[][] arr, int i, int j){
		for(int k=0; k<i; k++){
			if(arr[k][j]=='Q')return false;
		}
		int ni = i, nj = j;
		while(ni>=0 && nj>=0){
			if(arr[ni--][nj--]=='Q')return false;
		}
		ni = i;nj = j;
		while(ni>=0 && nj<arr.length){
			if(arr[ni--][nj++]=='Q')return false;
		}
		return true;
	}
	static void placeQueens(char[][] arr, int i){
		if(i==arr.length){
			count++;
			for(int j=0; j<arr.length; j++){
				for(int k=0; k<arr.length; k++)
					System.out.print(arr[j][k]+" ");
				System.out.println();
			}
			System.out.println();
			return;
		}
		for(int j=0; j<arr.length; j++){
			// if(arr[i][j]=='Q')continue;
			if(isValid(arr, i, j)){
				arr[i][j] = 'Q';
				placeQueens(arr, i+1);
				arr[i][j] = '.';
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char[][] arr = new char[n][n];
		for(int i=0; i<n; i++)
			Arrays.fill(arr[i], '.');
		count = 0;
		long st = System.currentTimeMillis();
		placeQueens(arr, 0);
		long end = System.currentTimeMillis();
		System.out.println("No of solutions: "+count+"\tTime: "+(end-st+1)+"ms");
	}
}