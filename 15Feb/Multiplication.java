/*
Write a recursive function to multiply two positive integers without using the *operator.You
can use addition, subtraction, and bit shifting, but you should minimize the number of those
operations
*/import java.util.*;
class Multiplication{
	static int multiply(int a, int ans, int b){
		if(b==0)return ans;
		else return multiply(a, ans+a, b-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(multiply(a, 0, b));
	}
}