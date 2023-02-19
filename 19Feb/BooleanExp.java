/*
	No of ways to evaluate boolean expression to true 
*/
import java.util.*;
class BooleanExp{
	static int evaluate(String s, int i, int j, boolean isTrue){
		if(i>j)return 0;
		if(i==j){
			if(isTrue && s.charAt(i)=='T')return 1;
			else if(!isTrue && s.charAt(i)=='F')return 1;
			else return 0;
		}
		int ans = 0;
		for(int k=i+1; k<j; k+=2){
			int leftTrue   = evaluate(s, i, k-1, true);
			int rightTrue  = evaluate(s, k+1, j, true);
			int rightFalse = evaluate(s, k+1, j, false);
			int leftFalse  = evaluate(s, i, k-1, false);
			if(s.charAt(k) == '&'){
				if(isTrue)
					ans += leftTrue*rightTrue;
				else
					ans += leftFalse*rightTrue + leftTrue*rightFalse + leftFalse*rightFalse;
			}
			else if(s.charAt(k) == '|'){
				if(isTrue)
					ans += leftFalse*rightTrue + leftTrue*rightFalse + leftTrue*rightTrue;
				else
					ans += leftFalse*rightFalse;
			}
			else{
				if(isTrue)
					ans += leftFalse*rightTrue + leftTrue*rightFalse;
				else
					ans += leftFalse*rightFalse + leftTrue*rightTrue;
			}
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ss = sc.nextInt();
		boolean b = ss==0?false:true;
		System.out.println(evaluate(s, 0, s.length()-1, b));
	}
}