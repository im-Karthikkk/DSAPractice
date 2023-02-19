// hot dot dog lot log cog 
// hit cog
// shortest transformation sequence
import java.util.*;
class Pair{
	String word;
	int lvl;
	Pair(String s, int i){word = s; lvl = i;}
}
class WordLadder{
	
	static int minTransformation(String[] words, String begin, String end){
		Set<String> st = new HashSet<>();
		for(String s: words)st.add(s);
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(begin, 1));
		st.remove(begin);
		while(!q.isEmpty()){
			char[] word = q.peek().word.toCharArray();
			int steps = q.peek().lvl;
			q.remove();
			if(end.equals(new String(word)))return steps;
			for(int i = 0; i<word.length; i++){
				
				char org = word[i];
				for(char c='a'; c<='z'; c++){
					word[i] = c;
					if(st.contains(new String(word))){
						st.remove(new String(word));
						q.add(new Pair(new String(word), steps+1));
					}
				}
				word[i] = org;
			}
		}
		return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Words list: ");
		String wordsList = sc.nextLine();
		String[] words = wordsList.split(" ");
		System.out.println("Starting word: ");
		String begin = sc.next();
		System.out.println("Ending word: ");
		String end = sc.next();
		System.out.println(minTransformation(words, begin, end));
	}
}