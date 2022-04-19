import java.util.Scanner;

public class G34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        for(a = sc.nextInt(); a < 10; a++){

            for(b = 9; b > 0; b--){

                System.out.println(a + " * " + b + " = " + (a*b));

            }

            System.out.println("");

        }

    }

}