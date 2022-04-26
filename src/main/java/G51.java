import java.util.Scanner;

public class G51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = 1;

        for(j = 1; j < 10; j++){
            System.out.println(i + " * " + j + " = " + (i*j));
        }

    }

}
