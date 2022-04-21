import java.util.Scanner;

public class G40 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        while(true){

            System.out.print("첫 번째 값 입력 : ");

            a = sc.nextInt();

            System.out.print("두 번째 값 입력 : ");

            b = sc.nextInt();

            System.out.println(a + " + " + b + " = " + (a+b));

        }

    }

}