import java.util.*;
class CountA{
	static int countAs(String s, int n){
		int count = 0;
		for(int i=0; i<n; i++){
			if(s.charAt(i)-'a'==0)
				count++;
		}
		return count;
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		System.out.println(countAs(s, n));
	}
}