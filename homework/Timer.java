
import java.util.Scanner;

public class Timer{
  public static void main(String[] args){
    Scanner scanner  = new Scanner(System.in);
    System.out.println("Enter the current hour:");
    int hour = scanner.nextInt();
    System.out.println("Enter the number of tasks:");
    int tasks = scanner.nextInt();
    System.out.println("Enter the number of hours a task takes:");
    int time = scanner.nextInt();
    time *= tasks;
    time += hour; 
    int final_time = time % 24;
    
    System.out.println("You will finish at "+ final_time + ":00 o'clock.");
  }
}


 
