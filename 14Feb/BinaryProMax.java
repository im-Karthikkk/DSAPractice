import java.util.*;
class BinaryProMax{
	static String printBinary(double num){
        if (num >= 1 || num <= 0)
            return "ERROR";
 
        String binary = "0.";
 
        while (num > 0)
        {
            /* Setting a limit on length: 32 characters,
               If the number cannot be represented
               accurately in binary with at most 32
               character  */
            if (binary.length() >= 54)
                return "ERROR";
 
            // Multiply by 2 in num to check it 1 or 0
            double r = num * 2;
            if (r >= 1)
            {
                binary += "1";
                num = r - 1;
            }
            else
            {
                binary += "0";
                num = r;
            }
        }
        return binary;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();			// (0.625)10 -> (0.101)2
		System.out.println(printBinary(d));
	}
}