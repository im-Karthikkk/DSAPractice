/*
A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a
time. Implement a method to count how many possible ways the child can run up the stairs.
*/
import java.util.*;
class Stairs{
	public static void countSteps(int n, int[] steps, String s){
		if(n<=0){
			System.out.println(s+" 0");
			steps[0]++;
			return;
		}
		countSteps(n-1, steps, s+n+"->");
		countSteps(n-2, steps, s+n+"->");
		countSteps(n-3, steps,s+n+"->");
		return;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] steps = {0};
		countSteps(n, steps, "");
		System.out.println(steps[0]);
	}
}