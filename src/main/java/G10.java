import java.util.Scanner;

public class G10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;

        for(b=1; b<=9; b++){
            System.out.println(a + " * " + b + " = " + (a*b));
        }

    }

}
