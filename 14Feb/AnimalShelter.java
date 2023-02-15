import java.util.*;
class AnimalShelter{
	Queue<String> q;
	AnimalShelter(){
		q = new LinkedList<>();
	}
	public void enqueue(String s){
		q.add(s);
	}
	public String dequeueAny(){
		return q.poll();
	}
	public String dequeueDog(){
		Queue<String> temp = new LinkedList<>();
		boolean gotDog = false;
		String ans = "";
		while(!gotDog && !q.isEmpty()){
			String str = q.poll();
			
			if(str.charAt(0)=='D'){
				gotDog = true;
				ans += str;
				break;
			}
			temp.add(str);
		}
		while(!q.isEmpty()){
			String str = q.poll();
			temp.add(str);
		}
		while(!temp.isEmpty()){
			String str = temp.poll();
			q.add(str);
		}
		if(ans.equals(""))ans += "No Dogs present";
		return ans;
	}
	public String dequeueCat(){
		Queue<String> temp = new LinkedList<>();
		boolean gotDog = false;
		String ans = "";
		while(!gotDog && !q.isEmpty()){
			String str = q.poll();
			
			if(str.charAt(0)=='C'){
				gotDog = true;
				ans += str;
				break;
			}
			temp.add(str);
		}
		while(!q.isEmpty()){
			String str = q.poll();
			temp.add(str);
		}
		while(!temp.isEmpty()){
			String str = temp.poll();
			q.add(str);
		}
		if(ans.equals(""))ans += "No Dogs present";
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		AnimalShelter as = new AnimalShelter();
		System.out.println("Select one option: "+
		"\n1. Enqueue"+
		"\n2. Dequeue Any"+
		"\n3. Dequeue Dog"+
		"\n4. Dequeue Cat"+
		"\n5. Exit\n");
		int choice = sc.nextInt();
		while(choice != 5){
			switch(choice){
				case 1:
				System.out.println("Enter animal name");
				as.enqueue(sc.next());
				break;
				case 2:
				System.out.println(as.dequeueAny());
				break;
				case 3:
				System.out.println(as.dequeueDog());
				break;
				case 4:
				System.out.println(as.dequeueCat());
				break;
				
				case 69:
				System.out.println(as.q);
				break;
				
			}
			System.out.println("Select one option: "+
		"\n1. Enqueue"+
		"\n2. Dequeue Any"+
		"\n3. Dequeue Dog"+
		"\n4. Dequeue Cat"+
		"\n5. Exit\n");
		choice = sc.nextInt();
		}
	}
}