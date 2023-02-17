import java.util.*;
class SameString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("First Array: ");
		String s1 = sc.nextLine();
		System.out.println("Second Array: ");
		String s2 = sc.nextLine();
		String[] words1 = s1.split(" ");
		String[] words2 = s2.split(" ");
		String temp1 = "";
		for(String s : words1)temp1 += s;
		String temp2 = "";
		for(String s : words2)temp2 += s;
		System.out.println(temp1.equals(temp2));
	}
}