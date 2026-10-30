
import java.util.Scanner;

public class Multiply_Two_Nums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        float n1 = sc.nextFloat();

        System.out.println("Enter Second Number: ");
        float n2 = sc.nextFloat();

        float result = n1 * n2;

        System.out.println("Multiplication = " + result);

        sc.close();
    }
}
