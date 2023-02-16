/*
You have an array with all the numbers from 1 to N, where N is at most 32,000. The array
may have duplicate entries and you do not know what N is. With only 4 kilobytes of memory
available, how would you print all duplicate elements in the array?
*/
import java.util.*;
class FindDuplicatesProMax{
	static void printDuplicates(int[] arr){
		boolean[] flag = new boolean[arr.length];
		for(int i=0; i<arr.length; i++){
			if(!flag[arr[i]])
				flag[arr[i]] = true;
			else
				System.out.println(arr[i]);
		}
	}
	public static void main(){}
}