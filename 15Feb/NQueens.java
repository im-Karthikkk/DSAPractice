/*
Write an algorithm to print all ways of arranging eight queens on an 8x8 chess board so that
none of them share the same row, column, or diagonal. In this case, "diagonal" means all
diagonals, not just the two that bisect the board.
*/
import java.util.*;
class NQueens{
	static List<List<String>> ans;
    boolean isValid(char[][] arr, int i, int j){
        int ni = i;
        int nj = j;
        while(ni >= 0){
            if(arr[ni--][j]=='Q')
                return false;
        }
        ni = i;nj = j;
        while(ni>=0 && nj>=0){
            if(arr[ni--][nj--]=='Q')
                return false;
        }
        ni = i; nj = j;
        while(ni>=0 && nj<arr.length){
            if(arr[ni--][nj++]=='Q')
                return false;
        }
        return true;
    }
    public void solve(char[][] arr, int i){
        if(i==arr.length){
            List<String> temp = new ArrayList<>();
            for(int k=0; k<arr.length; k++){
                temp.add(new String(arr[k]));
            }
            ans.add(temp);
            return;
        }
        for(int j = 0; j<arr.length; j++){
            if(isValid(arr, i, j)){
                arr[i][j] = 'Q';
                solve(arr, i+1);
                arr[i][j] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        char[][] arr = new char[n][n];
        for(int i=0; i<n; i++)
            Arrays.fill(arr[i], '.');
        solve(arr, 0);
        return ans;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NQueens nq = new NQueens();
		List<List<String>> answer = nq.solveNQueens(n);
		for(List<String> l : answer){
			for(String s: l){
				System.out.println(s);
			}
			System.out.println();
		}
	}
}