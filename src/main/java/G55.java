import java.util.Scanner;

public class G55{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i;
        int n;

        System.out.print("숫자 입력 : ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){

            sum += i;

        }

        System.out.println("1 부터 " + n + " 까지의 합 : " + sum);

    }

}
