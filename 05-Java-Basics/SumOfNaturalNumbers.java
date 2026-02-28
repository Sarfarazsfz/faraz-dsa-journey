import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Natural number: ");
        int n = sc.nextInt();
        int sum = 0;
//         int i = 1;

//         while(i <= n){               // Using while loop for sum of natural numbers.
//             sum += i;
//             i++;
//         }
//         System.out.print("The Sum is for Natural Number: " + sum);
        for(int i=0; i<=n; i++){        // Using for loop for sum of natural numbers.
            sum += i;
        }
        System.out.print(sum);
    }
}
