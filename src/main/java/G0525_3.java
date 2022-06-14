import java.util.Scanner;

public class G0525_3 {

    public static int sum(int i1, int i2){

        int sum = 0;

        for(int i = i1; i <= i2; i++){

            sum += i;

        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int k = sum(i1, i2);

        System.out.println(k);

    }

}
