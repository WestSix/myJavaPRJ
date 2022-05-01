import java.util.Scanner;

public class G58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("1부터" + n + " 까지의 합 : " + sum);

    }

}
