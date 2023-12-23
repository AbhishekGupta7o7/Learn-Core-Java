package JavaExercies;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		
		double piValue = Math.PI;
		double Radius = 7.5;
		System.out.println("Area of circle is: - "+ (Math.PI * Math.pow(Radius, 2)));
		System.out.println("Perimeter of circle is: - "+ (Math.pow(Radius, 2)));
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number to add");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number to add");
		int secondNumber=sc.nextInt();
		
		System.out.println("Enter Third number to add");
		int thirdNumber=sc.nextInt();
		
		System.out.println("Average of 3 numbers is: - " +(firstNumber+secondNumber+thirdNumber)/3);
		
		int sum= firstNumber+secondNumber;
		System.out.println("Sum of two numbers is: - "+ firstNumber+ secondNumber);
		System.out.println("Sum of two numbers is: - "+sum);
		System.out.println(firstNumber+ secondNumber);
		System.out.println(firstNumber- secondNumber);
		System.out.println(firstNumber* secondNumber);
		System.out.println(firstNumber/ secondNumber);
		System.out.println(firstNumber% secondNumber);
		System.out.println(50/3);
		
		float f= 50/3;
		System.out.println(f);
		
		double d= 50/3;
		System.out.println(f);
		System.out.printf("Printed with up to 5 decimals: %.5f\n", f);
		
		System.out.println(d);
		System.out.printf("Printed with up to 5 decimals: %.5f\n", d);
		
		double d1= 50.0/3.0;
		System.out.println(d1);
		System.out.printf("Printed with up to 5 decimals: %.5f\n", d1);
		
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(secondNumber + " x "+ (i)+ " = "   + (secondNumber*i));
		}
		
		

	}

}
