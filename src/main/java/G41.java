import java.util.Scanner;

public class G41 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        int c;
        int i = 0;

        while(i < a){

            System.out.print("첫 번째 값 입력 : ");
            b = sc.nextInt();

            System.out.print("두 번째 값 입력 : ");
            c = sc.nextInt();

            System.out.println(b + " + " + c + " = " + (b + c));

            i++;

        }

    }

}