import java.util.*;
class ConvertBits{
	static String toBinary(int n){
		String ans = "";
		while(n>0){
			
			ans = n%2+ ans;
			n /= 2;
		}
		//System.out.println(n+" "+ans);
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String aa = toBinary(a);
		String bb = toBinary(b);
		while(bb.length()<aa.length()){
			bb = "0" + bb;
		}
		while(aa.length()<bb.length())
			aa = "0" + aa;
		int count  = 0;
		for(int i=0; i<bb.length(); i++){
			if(aa.charAt(i)!=bb.charAt(i))
				count++;
		}
		System.out.println(count);
	}
}