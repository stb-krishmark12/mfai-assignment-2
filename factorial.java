import java.util.Scanner;
class factorial { 
    static int factorial(int n) 
    { 
        if (n == 0) 
            return 1; 
  
        return n * factorial(n - 1); 
    } 
    public static void main(String[] args) 
    {	Scanner obj = new Scanner(System.in); 
	System.out.println("Enter the number");
        int num = obj.nextInt();
        System.out.println("Factorial of " + num 
                           + " is " + factorial(num)); 
    } 
}