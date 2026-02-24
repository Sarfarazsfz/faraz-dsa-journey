import java.util.*;
class SumOfTwoNumbers{
    public static void main(String[] args){
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}