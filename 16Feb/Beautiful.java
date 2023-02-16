import java.util.*;
class Beautiful{
	static boolean isBeautiful(String s){
		String rev = "";
		for(int i = s.length()-1; i>=0; i--)
			rev += s.charAt(i);
		for(int i=0; i<s.length()-1; i++){
			if(Math.abs(s.charAt(i)-s.charAt(i+1))!=Math.abs(rev.charAt(i)-rev.charAt(i+1)))
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isBeautiful(s)?"YES":"NO");	
	}
}