import java.util.*;
class PalPartition{
	static boolean isPalindrome(String s, int i, int j){
		while(i<j){
			if(s.charAt(i++)!=s.charAt(j--))return false;
		}
		return true;
	}
	static int findMinPartition(String s, int i, int j){
		if(i>=j)return 0;
		if(isPalindrome(s, i, j))return 0;
		
		int min = Integer.MAX_VALUE;
		for(int k=i; k<j; k++){
			int temp = findMinPartition(s, i, k)+1+findMinPartition(s, k+1, j);
			if(temp<min)min = temp;
		}
		return min;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(findMinPartition(s, 0, s.length()-1));
	}
}