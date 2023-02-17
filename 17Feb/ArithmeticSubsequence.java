import java.util.*;
class ArithmeticSubsequence{
	static int count;
	static void findSubseq(int[] arr, int i, String temp){
		if(i>=arr.length){
			String[] nums = temp.split(" ");
			if(temp.length()==0 ||nums.length<3)return;
			// for(String str: nums)
				// System.out.print(str+" ");
			// System.out.println();
			int[] intArr = new int[nums.length];
			for(int k=0; k<nums.length; k++)
				intArr[k] = Integer.parseInt(nums[k]);
			int diff = intArr[1]-intArr[0];
			for(int j=2;j<intArr.length; j++){
				//System.out.println(diff+" "+(intArr[j]-intArr[j-1]));
				if(intArr[j]-intArr[j-1]!=diff)return;
			}
			// for(int k: intArr)
				// System.out.print(k+" ");
			// System.out.println();
			count++;
			return;
		}
		findSubseq(arr, i+1, temp+arr[i]+" ");
		findSubseq(arr, i+1, temp);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		count = 0;
		findSubseq(arr, 0, "");
		System.out.println(count);
	}
}