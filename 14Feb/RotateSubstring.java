import java.util.*;
class RotateSubstring{
	static boolean isSubstring(String s1, String s2, int index){
		if(s1.length()!=s2.length())return false;
		if(index>=s1.length())return false;
		int ind  = -1;
		char c = s1.charAt(0);
		for(int i=index; i<s1.length(); i++){
			if(c == s2.charAt(i)){
				ind  = i;
				break;
			}
		}
		if(ind == -1)return false;
		int temp = 0;
		boolean flag = true;
		for(int i=0; i<s2.length(); i++){
			if(ind>=s2.length())ind = ind%s2.length();
			if(s1.charAt(temp++)!=s2.charAt(ind++))
				flag = false;
		}
		if(flag)return true;
		else return isSubstring(s1, s2, index+1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(isSubstring(s1, s2, 0));	
	}
}