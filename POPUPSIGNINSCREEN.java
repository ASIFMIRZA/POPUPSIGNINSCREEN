import java.util.Scanner;

public class POPUPSIGNINSCREEN {

public static void main(String[] args) {

    String UserID;
    String UserPassword;
    String uEMAIL;

    UserID = "JUGGERNUT";
    UserPassword = "PaCmA/\/";
    uEMAIL = "MIRZABEIG@YAHOO.COM";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter your ID PLEASE: ");
    String userID = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter your Password PLEASE: ");
    String Userpassword = input2.next();
    
    Scanner input3 = new Scanner (System.in);
    System.out.println("Enter your EMAIL PLEASE: ");
    input3.next(uEMAIL);
    
    if (uEMAIL.equals(uEMAIL) && Userpassword.equals(Userpassword)) {
        System.out.println("YOU HAVE GAINED ACCESS");
    }

    if (userID.equals(UserID) && Userpassword.equals(UserPassword)) {

        System.out.println("YOU HAVE GAINED ACCESS!!");
    }

    else if (userID.equals(UserID)) {
        System.out.println("incorrect UserPassword!");
    } else if (Userpassword.equals(UserPassword)) {
        System.out.println("incorrect UserID!");
    } else if (uEMAIL.equals(uEMAIL)){
                System.out.println("incorrect email!!");
                
                }
     else {
        System.out.println("incorrect UserID, EMAIL OR UserPassword you might want to try again!!!");
    }

}

}