import java.util.*;
class FitBits{
	static String toBinary(int n){
		String ans = "";
		while(n>0){
			int temp = n%2;
			ans = ""+temp + ans;
			n /= 2;
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		String aa = sc.next();//toBinary(a);
		String bb = sc.next();//toBinary(b);
		int i = sc.nextInt();
		int j = sc.nextInt();
		char[] arr1 = aa.toCharArray();
		char[] arr2 = bb.toCharArray();
		
		i = aa.length()-1-i;
		j = aa.length()-1-j;
		//System.out.println(i+" "+j);
		int ind = 0;
		for(int k = j; k<=i; k++)
			arr1[k] = arr2[ind++];
		System.out.println(arr1);
	}
}