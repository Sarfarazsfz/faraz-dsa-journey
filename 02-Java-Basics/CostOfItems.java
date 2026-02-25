import java.util.*;

public class CostOfItems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the cost of pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();

        float TotalCost = (pencil + pen + eraser);
        float WithGST = 0.18f * (pencil + pen + eraser) + TotalCost;

        System.out.println("The total cost is: " + TotalCost);
        System.out.println("The total cost including GST: " + WithGST);

    }
}
