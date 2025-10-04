import java.util.Scanner;

public class Dates{
  public static void main(String[] args){
   Scanner in= new Scanner(System.in);
   System.out.println("What is the day of the week?");
   String day = in.nextLine();
   System.out.println("What is the month? ");
   String month = in.nextLine();
   System.out.println("What is the day of the month?");
   int date= in.nextInt();
   System.out.println("What is the year? ");
   int year = in.nextInt();
   System.out.printf("American format: %s, %s %d, %d", day, month, date, year);
   System.out.printf("European format: %s %d %s %d", day, date, month, year);

  }

}
