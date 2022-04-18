import java.util.Scanner;

public class G31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;

        for(i = 9; i > 0; i--){
            System.out.println(a + " * " + i + " = " + (a*i));
        }

    }

}