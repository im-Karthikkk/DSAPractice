import java.util.*;
class StringCompression{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "";
		int count = 1;
		char c = s.charAt(0);
		for(int i=1; i<s.length(); i++){
			if(c == s.charAt(i))count++;
			else{
				ans += (char)c +""+ count;
				count  = 1;
				c = s.charAt(i);
			}
		}
		ans += (char)c +""+ count;
		if(ans.length()>s.length())
			ans = s;
		System.out.println(ans);
	}
}