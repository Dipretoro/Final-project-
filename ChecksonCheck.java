package andrew;

import java.io.IOException;
import java.util.Scanner;

/* Programmed by Andrew Dipretoro
 	HomeWork  3,4,5,6
 	Computer Science 1 Java

 */

public class ChecksonCheck {

 public static void main ( String[] args  ) {

  int choice = 0;
  Scanner sc = new Scanner(System.in);



  // start screen 

  do {
   System.out.println("1 )Show account Balance ");
   System.out.println("2 )Write or deposit a check ");
   System.out.println("3 )Export and serialize a checkbook");
   System.out.println("4 )Import  checkbook");
   System.out.println("5)Start a new check book ");
   System.out.println("6 )Print whole CheckBook ");
   System.out.println("7 )Print single check ");
   System.out.println("8 )Exit Program");
   System.out.println("Enter Choice ");
   try {
    choice = sc.nextInt();
 } catch (Exception e) {
    System.out.println(" you had and error try again  "); 
     break ;}
    if (choice < 1 || choice > 10) {
     System.out.println("Invaild choice ,Try again ");
}
    

  
  
    else {
    switch (choice) {
     //show account balance 

     case 1:
		try {
			Checkregister.checkadder();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
      break;
      // write or deposit a check 

     case 2:
		try {
			user.chckmaker();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      break;
      // export check
      
     case 3:
      input123.export_checkbook();
      break;
      // import check 
      ///case 4 : 5;
      //input123.importchckbook();
      //break;12
      // print checks 
     case 5:
		try {
			user.newchckbook();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      break;
     case 6:
		try {
			user.chckprinter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      break;
     case 7:
		try {
			user.singleprinter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     case 8:
      System.out.println(" would you like to save first ");
      System.exit(choice);
    }
   }
  } while (choice != 8);

  sc.close();

 }
}