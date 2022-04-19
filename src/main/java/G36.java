import java.util.Scanner;

public class G36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i;
        int j;

        for(i = 0; i < a; i++){

            for(j = a; j > i; j--){

                System.out.print("*");

            }

            System.out.println("");

        }

    }

}