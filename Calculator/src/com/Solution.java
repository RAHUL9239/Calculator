package com;

import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{

		Calculator c = new Calculatorlmpl();
		Scanner scan = new Scanner(System.in);

		while(true)
		{
			System.out.println("1: Addition");
			System.out.println("2: Substraction");
			System.out.println("3: Multiplication");
			System.out.println("4: Divide");

			System.out.println("=================");
			int choice=scan.nextInt();
			if(choice>0 && choice<=4)
			{
				System.out.println("Enter 2 nos");
				int a=scan.nextInt();
				int b=scan.nextInt();

				switch(choice)
				{
				case 1:			   
					c.add(a, b);
					System.out.println("Sum of two numbers are: "+c.add(a, b));
					System.out.println("---------------------------");
					break;

				case 2:
					c.sub(a, b);
					System.out.println("Substraction of two numbers are: "+c.sub(a, b));
					System.out.println("---------------------------");
					break;

				case 3:
					c.mul(a, b);
					System.out.println("Multiplication of two numbers are: "+c.mul(a, b));
					System.out.println("---------------------------");
					break;

				case 4:
					c.dic(a, b);
					System.out.println("Divident of two numbers are: "+c.dic(a, b));
					System.out.println("---------------------------");
					break;

				}
			}
			else
			{
				System.out.println("Invalid Choice");
			}
		}

	}
}


