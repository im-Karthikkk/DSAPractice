import java.util.*;
class Exception1 extends Exception{
	Exception1(){
		super("Exception 1 has been called");
	}
	static void throwExcep1() throws Exception{
		throw new Exception1();
	}
	public static void main(String[] args) throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		try{
		System.out.println(num/0);
		}catch(Exception e){e.printStackTrace();}+
		System.out.println();
		try{
			throwExcep1();
		}catch(Exception e){e.printStackTrace();}
		finally{
			System.out.println("All exception keywords used successfully...");
		};
		System.out.println("Press enter to exit...");
		sc.nextLine();
		sc.nextLine();
	}
	
}
