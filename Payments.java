public class Payments {
  public static void pay(double basePay, int hours){
    double payment = 0 ;
      if(basePay < 15){
        System.out.println("Your base payment is low, increase it :)");
         return;
      } else if(hours > 60){
        System.out.println("Hours are exceeding the max :)");
        return;
      }

      if(hours <= 40){
        payment= basePay*hours;
      }else if(hours > 40){
        hours = hours - 40;
        payment= basePay * 1.5 * hours + (basePay * 40);
      }
    System.out.printf("The total pay is: $%.2f", payment);

   }
  public static void main (String[] args){
    pay(22.50,48);
    pay(14.90,38);
    pay(30.92,70);
    pay(16.75,29);

  }
}
