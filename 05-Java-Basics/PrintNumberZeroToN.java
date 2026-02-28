import java.util.*;
public class PrintNumberZeroToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n Number to print: ");
        int range = sc.nextInt();
        int count = 1;
        while(count <= range){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }
    
}
