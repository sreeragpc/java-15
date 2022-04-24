package miniccalcultor;
import java.util.Scanner;

public class Choices {
	public static void main(String[] args) {
		Results obj=new Results();
		System.out.println("choose an option"
				+ "\n1:addition"
				+ "\n2:substraction"
				+ "\n3:multiplication"
				+ "\n4:division");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		System.out.println("enter 2 numbers");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		obj.a=number1;
		obj.b=number2;
		switch(option){case 1:
			
			obj.addition();
			obj.display();
			break;
		case 2:
			
			obj.substraction();
			obj.display();
			break;
		case 3:
			
			obj.multiplication();
			obj.display();
			break;
		case 4:
			
			obj.division();
			obj.display();
			break;
		}
		
		
		
		
		
		
		
		}
		
		
		
		
		
	}


