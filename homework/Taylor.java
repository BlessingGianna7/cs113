import java.util.Scanner;
 
public class Taylor{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Please input a noun:");
    String n1 = scan.nextLine();

    System.out.println("Please input a drink:");
    String drink = scan.nextLine();

    System.out.println("Please input a verb:");
    String verb = scan.nextLine();

    System.out.println("Please input a noun:");
    String n2 = scan.nextLine();
    
    System.out.println("Please input a noun:");
    String n3 = scan.nextLine();

    System.out.println("Please input an adjective:");
    String adjective = scan.nextLine();

    System.out.println("Please input a gerund:");
    String gerund = scan.nextLine();
    
    System.out.println("It's me, hi, I'm the " + n1 + ", it's me");
    System.out.println("At "+ drink + " time, everybody agrees");
    System.out.println("I'll " + verb + " directly at the " + n2 + " but never in the " + n3);
    System.out.println("It must be " + adjective + " always " + gerund + " for the anti-hero"); 
   
  }
}