import java.util.*;
class UniqueChars{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()==1){
			System.out.println("true");
			return;
		}
		boolean flag = true;
		out: for(int i=0; i<s.length(); i++){
			for(int j=i+1; j<s.length(); j++){
				if(s.charAt(i)==s.charAt(j)){
					flag = false;
					break out;
				}
			}
		}
		System.out.println(flag);
	}
}