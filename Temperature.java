import java.util.Scanner;
	class Temperature{
		double Fahrenheit;
		void converter(double Celsius){
			Fahrenheit = (Celsius*9)/5+32;
			}
		void display(){
			System.out.println(Fahrenheit);
			}
	public static void main(String...args){
		
		Temperature c = new Temperature();
		c.converter(20.0);
		c.display();
			
						}
								}	
								
						
