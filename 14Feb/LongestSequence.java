import java.util.*;
class LongestSequence{
	static int max;
	static void countLength(char[] arr, int i){
		if(i<0)return;
		int ind = -1;
		//System.out.print(arr);
		//System.out.print(" "+i+"\n");
		
		for(int j = i; j>=0; j--){
			if(arr[j]=='0'){
				arr[j] = '1';
				ind  = j;
				break;
			}
		}
		int maxlen = Integer.MIN_VALUE;
		int count = 0;
		for(int j=0; j<arr.length; j++){
			if(arr[j]=='1'){
				count++;
			}
			else{
				if(count>maxlen)maxlen = count;
				count = 0;
			}
		}
		if(count>maxlen)maxlen = count;
		if(maxlen>max)max = maxlen;
		if(ind != -1)arr[ind] = '0';
		countLength(arr, ind-1);
	}
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
		max = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = toBinary(n);
		countLength(s.toCharArray(), s.length()-1);
		System.out.println(max);
	}

}