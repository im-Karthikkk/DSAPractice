import java.util.*;
class LongestWord{
	static String[] wordSpace;
	static int ind;
	static int it = 0;
	static int maxLen;
	
	static boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            a[c - 'a']--;
        }
        for (int n : a) {
            if (n != 0) return false;
        }
        return true;
    }
	static int containsWord(String[] arr, String s){
		int index = -1;
		for(int i=0; i<arr.length; i++){
			if(isAnagram(arr[i], s)){
				index = i;
				break;
			}
		}
		return index;
	}
	static void combinations(String[] arr, int i, String temp){
		if(i>=arr.length && temp.length()<=maxLen){
			it++;
			wordSpace[ind++] = temp;
			return;
		}
		else if(i>=arr.length)return;
		combinations(arr, i+1, temp+arr[i]);
		combinations(arr, i+1, temp);
	} 
	public static void main(String[] args){
		ind = 0;
		maxLen = -1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] words = new String[n];
		int[] count = new int[n];
		for(int i=0; i<n; i++)
			words[i] = sc.next();
		for(int i=0; i<n; i++){
			if(words[i].length()>maxLen)maxLen = words[i].length();
		}
		wordSpace = new String[(int)Math.pow(2, words.length)];
		combinations(words, 0, "");
		for(String s: wordSpace)
			if(s!=null)System.out.println(s);
		String max = "";
		//int maxLen = -1;
		for(int i=0; i<ind; i++){
			int temp = containsWord(words, wordSpace[i]);
			if(temp>=0){
				count[temp]++;
			}
		}
		for(int i: count)
			System.out.print(i+" ");
		System.out.println();
		for(int i=0; i<count.length; i++){
			if(count[i]>=2){
				if(words[i].length()>=max.length()){
					max = words[i];
					//maxLen = max.length();
				}
			}
		}
		//System.out.println(it+" "+ind+" "+wordSpace.length);
		System.out.println("max -> "+max);
	}
}