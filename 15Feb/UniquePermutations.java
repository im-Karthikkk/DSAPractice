/*
Write a method to compute all permutations of a string whose characters are not necessarily
unique. The list of permutations should not have duplicates.
*/
import java.util.*;
class UniquePermutations{
	static String[] ans;
	static int ind = 0;
	static boolean containsStr(String[] arr, String s){
		for(int i=0; i<ind; i++){
			if(arr[i].equals(s))return true;
		}
		return false;
	}
	static void swap(char[] arr, int i, int j){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void permut(char[] arr, int i){
		if(i>=arr.length){
			String s1 = new String(arr);
			if(!containsStr(ans, s1))ans[ind++] = s1;
			return;
		}
		for(int j=i; j<arr.length; j++){
			swap(arr, i, j);
			permut(arr, i+1);
			swap(arr, i, j);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int fact = 1;
		for(int i=1; i<=s.length(); i++)
			fact = fact*i;
		//System.out.println(fact);
		ans = new String[fact];
		ind = 0;
		permut(s.toCharArray(), 0);
		for(String str: ans)if(str!=null)System.out.println(str);
	}
}