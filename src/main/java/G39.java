import java.util.Scanner;

public class G39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i = 0;
        int sum = 0;

        while(i <= a){

            sum += i;
            i++;

        }

        System.out.println(sum);

    }

}