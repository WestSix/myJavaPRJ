import java.util.Scanner;

public class G28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i = 0;
        int j = 0;

        for(i = a; i > 0; i--){
            for(j = i; j > 0; j--){
                System.out.printf("*");
            }
            System.out.println("");
        }

    }

}
