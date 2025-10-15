import java.util.Scanner;
class Lab3P3{
	public static void main(String...a){
	Scanner s = new Scanner(System.in);
	String b = s.next()
	Lab3P3 l = new Lab3P3();
	Lab3P3 l1 = new Lab3P3(a);
	Lab3P3 l2 = new Lab3P3(b);
	Lab3P3 l3 = new Lab3P3(a,b);
		
	l.display();l.display(10);l.display("String");l.display(10,"String");	
	}
	public void show(){	
		System.out.println("Constructor without params");
	}
	public void show(int x){	
		System.out.println("Constructor with int params:"+ x);
	}
	public void show(String s){	
		System.out.println("Constructor with String params:" +s);
	}
	public void show(int x, String s){	
		System.out.println("Constructor with two params int and String:"+ x +" "+ s);
	}
	}
		
