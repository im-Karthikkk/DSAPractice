// min deletion to make palindrome 
import java.util.*;
class MinAdd{
	static int dp[][];
	static int hari(String s, String t, int i, int j){
		if(i<0 || j<0)return 0; 
		if(dp[i][j]!= -1)return dp[i][j];
		
		if(s.charAt(i)== t.charAt(j))
			return dp[i][j] = 1+hari(s, t, i-1, j-1);
		else
			return dp[i][j] = Math.max(hari(s, t, i, j-1), hari(s, t, i-1, j));
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
		System.out.println(t.length()-hari(s, t, s.length()-1, s.length()-1));
	}
}
qwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BMqwertyuiopasdfghjklzxcvbnm1234567890-=_+}{][|\';":/.,?><!@#$%^&*()~`BM