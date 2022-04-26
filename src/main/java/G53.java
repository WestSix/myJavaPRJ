import java.util.Scanner;

public class G53 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        int j = 1;
        int stop = sc.nextInt();

        for(i = sc.nextInt(); i < 10; i++){
            for(j = 1; j < 10; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            if(i == stop){
                break;
            }
        }

    }

}
