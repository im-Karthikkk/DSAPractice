/*
given a string s 
convert it into palindrome adding min char to the front;  
*/
import java.util.*;
class Palindrome{
	static boolean isPalindrome(String s){
		int i = 0, j = s.length()-1;
		while(i<j){
			if(s.charAt(i++)!=s.charAt(j--))
				return false;
			
		}
		return true;
	}
	static String minEdit(String s,String org, int i){
		if(isPalindrome(s) || i==2)return s;
		String temp = "";
		for(int j = org.length()-1; j>=org.length()-1-i; j--)
			temp += org.charAt(j);
		s = temp+s;
		return minEdit(s, org, i+1);
	}	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("ans -> "+minEdit(s,s,0));
	}
}