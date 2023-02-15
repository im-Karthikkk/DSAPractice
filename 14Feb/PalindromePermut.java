import java.util.*;
class PalindromePermut{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		String[] words = str.split(" ");
		String s = "";
		for(String i: words)s += i;
		if(s.length()==1){
			System.out.println("true");
			return;
		}
		int[] sLetters = new int[26];
		for(int i=0; i<s.length(); i++){
			sLetters[s.charAt(i)-'a']++;
		}
		boolean flag = true;
		if(s.length()%2==0){
			for(int i=0; i<26; i++){
				if(sLetters[i]%2 != 0){
					flag = false;
					break;
				}
			}
		}
		else{
			boolean first = false;
			for(int i=0; i<26; i++){
				if(sLetters[i]%2!= 0){
					if(!first)first = true;
					else{
						flag = false;
						break;
					}
				}
			}
		}
		System.out.println(flag);
	}
}