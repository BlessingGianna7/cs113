import java.util.Scanner;

public class Groceries{
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    System.out.println("How many times do you go to the grocery store each week?");
    int times = in.nextInt();
    System.out.println("How much money do you spend on each trip?");
    double money = in.nextDouble();
    double total = times*money;
    System.out.printf("This week you spent $%.2f on groceries.", total);
    System.out.println();
    in.close();
  }
}
