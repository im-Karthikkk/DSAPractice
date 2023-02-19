// G R E A T
// R G E A T
// 0 1 2 3 4
import java.util.*;
class Scrambled{
	static String getSubstr(String s, int a, int b){
		String temp = "";
		for(int i=a; i<=b; i++)
			temp += s.charAt(i);
		return temp;
	}
	static String getSubstr(String s, int a){
		String temp = "";
		for(int i=a; i<=s.length()-1; i++)
			temp += s.charAt(i);
		return temp;
	}
	static boolean isScrambled(String a, String b){
		System.out.println(a+" "+b);
		if(a.length()!=b.length())
			return false;
		if(a.equals(b))
			return true;
		if(a.length()<1)
			return false;
		boolean flag = false;
		for(int i=1; i<=a.length()-1; i++){
			boolean swap =   isScrambled(getSubstr(a, 0, i-1), getSubstr(b, a.length()-i)) && 
						     isScrambled(getSubstr(a, i),      getSubstr(b, 0, a.length()-i-1));
			boolean noSwap = isScrambled(getSubstr(a, 0, i-1), getSubstr(b, 0, i-1)) && 
							 isScrambled(getSubstr(a, i), getSubstr(b, i));
			if(swap || noSwap){
				flag = true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.length()!=b.length()){
			System.out.println("false");return;
		}
		if(a.equals(b)){
			System.out.println("true");return;
		}
		if(a.length()<1){
			System.out.println("false");return;
		}
		System.out.println(isScrambled(a,b));
	}
}