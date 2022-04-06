import java.util.Scanner;

public class G18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long sum = 1;

        for (int a = sc.nextInt(); a > 0; a--){
            sum *= a;
            if(a > 1){
                System.out.printf("%d * ", a);
            }else{
                System.out.printf("%d = ", a);
            }
        }

        System.out.println(sum);

    }

}