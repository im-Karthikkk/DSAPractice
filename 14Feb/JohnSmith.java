import java.util.*;
class JohnSmith{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim();
		String ans = "";
		for(int i=0 ;i<s.length(); i++){
			if(s.charAt(i) == ' ')
				ans += "%20";
			else
				ans += s.charAt(i);
		}
		System.out.println(ans);
	}
}