import java.util.Scanner;

public class G5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 2;
        int b = 1;

        while(a <= 9){
            while(b <= 9){
                System.out.println(a*b);
                b++;
            }a++;
        }

    }

}
