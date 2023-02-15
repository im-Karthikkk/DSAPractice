import java.util.*;
class StringPermut{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.length() != s2.length()){
			System.out.println("false");
			return;
		}
		int[] s1Letters = new int[26];
		int[] s2Letters = new int[26];
		for(int i=0; i<s1.length(); i++){
			s1Letters[s1.charAt(i)-'a']++;
		}
		for(int i=0; i<s2.length(); i++){
			s2Letters[s2.charAt(i)-'a']++;
		}
		boolean flag = true;
		for(int i=0; i<26; i++){
			if(s1Letters[i] != s2Letters[i]){
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}