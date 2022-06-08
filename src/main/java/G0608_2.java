import java.util.Scanner;

public class G0608_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int k = sum(num1, num2);

        System.out.println(k);

    }

    public static int sum(int num1, int num2) {

         int sum = num1 + num2;

        return sum;

    }

}
