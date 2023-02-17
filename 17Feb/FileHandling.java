import java.util.*;
import java.io.*;
class FileHandling{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		File f = new File(name);
		try{
		Scanner fis = new Scanner(f);
		String content = "";
		while(fis.hasNextLine()){
			String temp = fis.nextLine();
			temp = temp.toUpperCase();
			content += temp + "\n";
		}
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(content.getBytes());
		}catch(Exception e){e.printStackTrace();}
	}
}