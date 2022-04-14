import java.util.Scanner;

public class G25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i = 0;
        int j = 0;

        for(i = 0; i < a; i++){
            for(j = 0; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }

    }

}
