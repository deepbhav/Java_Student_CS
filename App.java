package studentSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import student.AddStudent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "Welcome to Student Enrolment System !" );
        System.out.println("Below are the Fnctionalities providing for you : -  ");
        Integer choice;
        do {
        	
        	System.out.println("1.	Create New Student Data");
        	System.out.println("2.	Create New Course Data");
        	System.out.println("3.	Enroll Student to a Course");
        	System.out.println("4.	Display Fees of a Student");
        	System.out.println("5.	Sort Student Data");
        	System.out.println("6.	Persist Student Data");
        	System.out.println("7.	Show All Students with courses");
        	System.out.println("8.	Search Students");
        	System.out.println("9.	Exit");

        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	
        	System.out.println("Enter you choice :- ");
        	
        	choice=Integer.parseInt(br.readLine());
        	
//        	System.out.println("Choice is " + choice);
        	switch (choice) {
			case 1:
				System.out.println("Choice is  " + choice);

				AddStudent as=new AddStudent();
				as.setFirstName(br.readLine());
				as.setLastName(br.readLine());
				System.out.println(as.toString());
				
				break;

			case 2:
				System.out.println("Choice is  " + choice);
				break;
				
			case 3: 
				System.out.println("Choice is  " + choice);
				break;
			case 4: 
				System.out.println("Choice is  " + choice);
				break;
				
			case 5:
				System.out.println("Choice is  " + choice);
				break;
			
			case 6: 
				System.out.println("Choice is  " + choice);
				break;
			case 7: 
				System.out.println("Choice is  " + choice);
				break;
			case 8: 
				System.out.println("Choice is  " + choice);
				break;
			case 9: 
				System.out.println("Choice is  " + choice);
				System.out.println("Exited Successfully.");

				break;

			default:
				System.out.println("Invalid Choice!");
				break;
			}
        }while(choice != 9);
//       new TestClass();
    }
}
