package tester;

import java.sql.Date;
import java.util.Scanner;

import dao.TopicDaoImpl;
import dao.TutorialDaoImpl;
import dao.UserDaoImpl;
import pojos.Tutorial;

public class TestLayeredApp {

	public static void main(String[] args) {

		try(Scanner scan = new Scanner(System.in))
		{
			UserDaoImpl udao = new UserDaoImpl();
			TopicDaoImpl tdao = new TopicDaoImpl();
			TutorialDaoImpl tudao = new TutorialDaoImpl();
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("\n1.User login 2.Change Password 3.Get available topics 4.Get tutorials for specific topic"
						+ "\n5.Get specific tutorial details 6.Add tutorial 0.Exit");
				System.out.println("Enter choice : ");
				
				try
				{
					switch (scan.nextInt()) 
					{
					case 1:
						System.out.println("Enter email and password : ");
						System.out.println(udao.userLogin(scan.next(), scan.next()));
						break;
						
					case 2:
						System.out.println("Enter email, old password, new password : ");
						System.out.println(udao.changePassword(scan.next(), scan.next(), scan.next()));
						break;
						
					case 3:
						System.out.println("Available topics are : ");
						tdao.getTopics().forEach(System.out::println);
						break;
						
					case 4:
						System.out.println("Enter topic : ");
						String s = "Spring Framework";
						tudao.getTutorials(s).forEach(System.out::println);
						break;
						
					case 5:
						System.out.println("Enter tutorial id : ");
						int i = scan.nextInt();
						System.out.println(tudao.getSpecificTutorial(i));
						break;
						
					case 6:
						System.out.println("Enter topic name : ");
						int i6 = tdao.getid(scan.next());
						System.out.println("Enter tutorial details : name, author, publishDate, visit, contents");
						System.out.println(tudao.addTutorial(i6, new Tutorial(scan.next(), scan.next(), Date.valueOf(scan.next()), scan.nextInt(), scan.next())));
						break;

					case 0:
						System.out.println("Exited the program...");
						udao.cleanUp();
						tdao.cleanUp();
						exit = true;
						break;
						
					default:
						System.out.println("Invalid choice !!!");
						break;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				scan.nextLine();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
