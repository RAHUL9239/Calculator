package org;

import java.util.Scanner;

class Solution 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		BusBookingPortal b = new BusBookingPortalImpl(50);
		
		while(true)
		{
			System.out.println("WelCome To SRS Travel Company");
			System.out.println("Please Enter a Choice");
			System.out.println("1: Enter Seats");
			System.out.println("2: Cancel Seats");
			System.out.println("3: Check Available Seats");
			int choice=scan.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter book tickets");
				int bookTicket=scan.nextInt();
				b.bookTicket(bookTicket);
				System.out.println("------------------");
				break;

			case 2:
				System.out.println("Enter cancel ticket");
				int cancelTicket=scan.nextInt();
				b.cancelTicket(cancelTicket);
				System.out.println("------------------");
				break;

			case 3:
				b.availableTicket();
				System.out.println("------------------");
				break;

			default : System.out.println("Invalid Input ");
			System.out.println("<<<<<<<<<<<>>>>>>>>");

			}
		}
	}
}
