
import java.util.Scanner;

public class Cube_Of_A_Num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int cube = n * n * n;

        System.out.println("Cube = " + cube);

        sc.close();
    }
}
