class Multithreading{
	public static void main(String[] args){
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
class Thread1 extends Thread{
	public void run(){
		for(int i=0; i<50; i+=2)
		System.out.print(i+" ");
	}
}
class Thread2 extends Thread{
	public void run(){
		for(int i=1; i<50; i+=2)
		System.out.print(i+" ");
	}
}