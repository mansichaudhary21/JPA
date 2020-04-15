package com.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.TicketDAO;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		TicketDAO tk;
		int ch;
		char c;
		do {
		
				System.out.println("Select an option:-");
				System.out.println("1.Login");
				System.out.println("2.ShowDetails");
				System.out.println("3.BookTicket");
				System.out.println("Enter the choice:- ");
				Scanner sc = new Scanner(System.in);
				ch = sc.nextInt();
				Scanner sc1 = new Scanner(System.in);
				switch (ch) {
					case 1:
							tk = new TicketDAO();
							String uname,password;
							System.out.println("Enter userName: ");
							
							uname = sc1.next();
							System.out.println("Enter password: ");
							password = sc1.next();
							tk.login(uname, password);
							break;
				
					case 2:
							tk = new TicketDAO();
							tk.showTrains();
							break;
							
					case 3:
							System.out.println("Enter ticket No:");
							int tkNo = sc.nextInt();
							tk = new TicketDAO();
							tk.cancelTicket(tkNo);
							break;

					default:
							System.out.println("Wrong Choice");
							break;
			}
		
				System.out.println("Do you want to perform more action(Y/N):-");
				c=sc1.next().charAt(0);
			
		} while (c=='Y'|| c=='y');
			}
}
