// min deletion to make palindrome 
import java.util.*;
class MinAdd{
	static int dp[][];
	static int findLCS(String s, String t, int i, int j){
		if(i<0 || j<0)return 0; 
		if(dp[i][j]!= -1)return dp[i][j];
		
		if(s.charAt(i)== t.charAt(j))
			return dp[i][j] = 1+findLCS(s, t, i-1, j-1);
		else
			return dp[i][j] = Math.max(findLCS(s, t, i, j-1), findLCS(s, t, i-1, j));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = "";
		for(int i=s.length()-1; i>=0; i--)
			t += s.charAt(i);
		dp = new int[s.length()+1][s.length()+1];
		for(int i=0; i<s.length()+1; i++)
			Arrays.fill(dp[i], -1);
		System.out.println(t.length()-findLCS(s, t, s.length()-1, s.length()-1));
	}
}