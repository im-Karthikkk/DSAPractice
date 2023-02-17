class Sudoku{
	static boolean solved;
	static int count;
	
	static boolean isValid(char[][] arr, int i, int j, char num){
		for(int k=0; k<9; k++){//col
			if(arr[i][k]==num)return false;
		}
		for(int k=0; k<9; k++){//row
			if(arr[k][j]==num)return false;
		}
		int ni = (i/3)*3;
		int nj = (j/3)*3;
		int it = 0;
		while(it<9){ //block
			//System.out.println(ni+" "+nj+" "+it);
			if(arr[ni][nj++]==num)return false;
			if((it+1)%3==0){
				nj -= 3;
				ni++;
			}
			it++;
		}
		return true;
	}
	static void solve(char[][] arr, int i, int j){
		count++;
		if(i==8 && j==9){
			solved = true;
			return;
		}
		if(j==9){
			solve(arr, i+1, 0);
			return;
		}
		if(arr[i][j]!='.'){
			solve(arr, i, j+1);
			return;
		}
		for(int k=1; k<10; k++){
			if(isValid(arr, i, j, (char)(k + '0'))){
				arr[i][j] = (char)(k + '0');
				solve(arr, i, j+1);
				if(!solved)
					arr[i][j] = '.';
			}
		}
	}
	public static void main(String[] args){
		count = 0;
		char[][] board = {
		{'.','.','5','3','.','.','.','.','.'},
		{'8','.','.','.','.','.','.','2','.'},
		{'.','7','.','.','1','.','5','.','.'},
		{'4','.','.','.','.','5','3','.','.'},
		{'.','1','.','.','7','.','.','.','6'},
		{'.','.','3','2','.','.','.','8','.'},
		{'.','6','.','5','.','.','.','.','9'},
		{'.','.','4','.','.','.','.','3','.'},
		{'.','.','.','.','.','9','7','.','.'}};
		solve(board, 0, 0);
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Recurse calls -> "+count);
	}

}