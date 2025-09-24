package Student;
import java.util.Scanner;
import java.io*;
	class StudentMain implements Operations{
	public void register(Student std){
	System.out.println("=============================\n Welcome to SMS\n========================");
	System.out.println(
	
	public void LogIn(String id , String password){
	try{
	BufferedReader reader = new BufferedReader(new FileReader(fname));
	String data;
		while((data = reader.readLine()) ! = null){
			String info[] = data.split(,);
			if(info[0].equals(id) && info[3].equals(password)){
				System.out.println("=====================\n LogIn successfully \n=======================");
				flag = true;
				
