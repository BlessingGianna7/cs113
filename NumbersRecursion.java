public class NumbersRecursion {

    
    public static void previousEven(int n) {
       // stop when n is 0 or negative
        if (n <= 0) { 
            return;
        }

        if (n % 2 == 0) { 
            // If n is even print it and recurse by subtracting 2
            System.out.print(n + " ");
            previousEven(n - 2);
        } else {
            // If n is odd subtract 1 to make it even, then continue
            previousEven(n - 1);
        }
    }


    public static int productOfPreviousOdd(int n) {
        int product = 1;

        if (n <= 1) {
            return product;
        }

        if (n % 2 != 0) { 
            // if n is odd multiply it into the product
            product *= n;
            return product * productOfPreviousOdd(n - 2);
        } else {
            // if n is even make it odd then multiply
            n = n - 1;
            product *= n;
            return product * productOfPreviousOdd(n - 2);
        }
    }

    
    public static int sumOfPreviousN(int num, int step) {
        if (num - step <= 0) { //stop if subtraction goes <= 0
            return 0;
        }

        int diff = num - step; 

        return diff + sumOfPreviousN(diff, step);
    }

    public static void main(String[] args) {
        previousEven(6);    
        System.out.println();
        previousEven(9);   
        System.out.println();
        previousEven(1);   
        System.out.println();
        System.out.println(productOfPreviousOdd(5));  
        System.out.println(productOfPreviousOdd(10)); 
        System.out.println(sumOfPreviousN(20, 6)); 
        System.out.println(sumOfPreviousN(10, 2)); 
    }
}
