import java.util.Scanner;

public class G19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i = 1;

        System.out.printf("값 입력 : ");
        int fs = sc.nextInt();

        for (i = 1; i <= fs; i++){
            sum = sum + i;
        }

        System.out.println("");
        System.out.println("1에서 " + fs + "까지의 합 : " + sum);

    }

}
